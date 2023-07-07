// gradle 7.5.1
import org.gradle.api.tasks.Copy

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application

    //TOUCHPORTAL
    id("com.christophecvb.touchportal.plugin-packager") version "9.0.0+"
    id("java")
    id("com.github.gmazzo.buildconfig") version "3.1.0"
}

val versionMajor = 1
val versionMinor = 0
val versionPatch = 0
val mainClassPackage = "caffeineportal"

group = mainClassPackage
tpPlugin.mainClassSimpleName.set("App")

//TOUCHPORTAL
buildConfig {
    packageName("caffeineportal")

    useJavaOutput()

    buildConfigField("String", "NAME", "\"${project.name}\"")
    buildConfigField("String", "VERSION_NAME", "\"${versionMajor * 1000 + versionMinor * 100 + versionPatch}\"")
    buildConfigField("long", "VERSION_CODE", "${versionMajor * 1000 + versionMinor * 100 + versionPatch}")
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()

    //CASTERLABS-CAFFEINATED
    maven(url = "https://jitpack.io")

    //TOUCHPORTAL
    //TP snapshot for 9.0.0
    maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    implementation("com.google.guava:guava:31.1-jre")

    //CASTERLABS-CAFFEINATED
    compileOnly("co.casterlabs.Casterlabs:PluginSDK:8383849")

    //TOUCHPORTAL
    implementation("com.christophecvb.touchportal:plugin-sdk:9.0.0+") {
        //exclude(group = "org.jetbrains", module = "annotations")
        exclude(group = "com.squareup.okhttp3", module = "okhttp")
    }
    annotationProcessor("com.christophecvb.touchportal:plugin-sdk-annotations-processor:9.0.0+")
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnit("4.13.2")
        }
    }
}


//couldnt disable multi-release jar building, no idea what or where is doing it.. 
//so im removing it after the fact
val beforeJar = file("${project.buildDir}/libs/app.jar")
val tmpDirStr = "${project.buildDir}/tmp/expandedArchives/jarpocalypse"
val tmpDir = file(tmpDirStr)
val afterDirStr = "${project.buildDir}/libs/"
val afterDir = file(afterDirStr)
val afterName = "caffineportal.jar"

tasks.register<Copy>("unJar") {
    group = "custom"
    description = "moves build jar"

    from(zipTree(beforeJar)) 
    into(tmpDir)

    doLast {
        println("UNJAR")
    }
}

tasks.register<Delete>("jarpocalypse") {
    group = "custom"
    description = "Deletes a folder from an existing JAR file."
    dependsOn("unJar")
    mustRunAfter("unJar")

    doLast {
        println("JARPOCALYPSE")
        val folderPath = "META-INF/versions/**/*.*"
        val folderFiles = files(fileTree(tmpDir).matching { 
            include(folderPath)
        })

        println("FILE PATHS:")
        folderFiles.forEach { file ->
            println(file.path)
        }
        project.delete(folderFiles)
    }
}

tasks.register<Zip>("reJar") {
    dependsOn("jarpocalypse")
    mustRunAfter("jarpocalypse")

    from(layout.buildDirectory.dir("tmp/expandedArchives/jarpocalypse"))
    archiveFileName.set(afterName)
    destinationDirectory.set(layout.buildDirectory.dir("libs"))
    
    doLast {
        println("reJAR")
    }
}

tasks.register("postBuild") {
    dependsOn("unJar")
    dependsOn("jarpocalypse")
    dependsOn("reJar")
    mustRunAfter("reJar")

    println("POSTBUILD")
}

tasks.named("build") {
    finalizedBy("postBuild")
}

// Java 11 Adopt...io... or something
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

application {
    // Define the main class for the application.
    mainClass.set("caffeineportal.App")
}