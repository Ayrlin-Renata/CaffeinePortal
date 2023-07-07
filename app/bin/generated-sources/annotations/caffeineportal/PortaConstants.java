package caffeineportal;

import java.lang.String;

public class PortaConstants {
  public static final String ID = "caffeineportal.Porta";

  public static final String NAME = "CaffeinePortal";

  public static final long VERSION = 1000;

  public static class Settings {
  }

  public static class BaseCategory {
    public static final String ID = "caffeineportal.Porta.BaseCategory";

    public static final String NAME = "CaffeinePortal Base Category";

    public static final String IMAGE_PATH = "";

    public static class Actions {
    }

    public static class Connectors {
    }

    public static class States {
      public static class NewFollower {
        public static final String ID = "caffeineportal.Porta.BaseCategory.state.newFollower";

        public static final String DESC = "newFollower";

        public static final String DEFAULT_VALUE = "1";

        public static final String[] VALUE_CHOICES = new String[] {""};
      }

      public static class NewSubscriber {
        public static final String ID = "caffeineportal.Porta.BaseCategory.state.newSubscriber";

        public static final String DESC = "newSubscriber";

        public static final String DEFAULT_VALUE = "1";

        public static final String[] VALUE_CHOICES = new String[] {""};
      }

      public static class NewRaid {
        public static final String ID = "caffeineportal.Porta.BaseCategory.state.newRaid";

        public static final String DESC = "newRaid";

        public static final String DEFAULT_VALUE = "1";

        public static final String[] VALUE_CHOICES = new String[] {""};
      }
    }

    public static class Events {
    }
  }
}
