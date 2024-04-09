package sassy.girls.wallpaper;

import sassy.girls.wallpaper.util.Constant;

public class Config {

    //server key obtained from the admin panel
    public static final String SERVER_KEY = "WVVoU01HTklUVFpNZVRnd1RrUm5kVnBIYkhka1dFSnVZMjFHYTFwVE5UUmxXRzkyV0RKR2QyTkhlSEJaTWtZd1lWYzVkVk5YVW1aak1rWjZZek5yZFZveWJIbGlTRTExWkRKR2MySklRbWhqUjFaNQ==\n";

    public static final boolean SET_LAUNCHER_IMAGE_AS_HOME_TOP_RIGHT_ICON = true;

    //default theme in first launch
    public static final boolean SET_DARK_MODE_AS_DEFAULT_THEME = false;

    //if true, all ad unit ids are configured from res/values/ads.xml
    public static final boolean ENABLE_OFFLINE_ADS_MODE = false;

    //column count
    public static final int DEFAULT_WALLPAPER_VIEW_TYPE = Constant.WALLPAPER_2_COLUMNS;
    public static final int DEFAULT_CATEGORY_VIEW_TYPE = Constant.CATEGORY_LIST;

    //display grid wallpaper style
    public static final int DISPLAY_WALLPAPER = Constant.DISPLAY_WALLPAPER_RECTANGLE;

    //set category as main screen
    public static final boolean SET_CATEGORY_AS_MAIN_SCREEN = false;

    //UI Config
    public static final boolean ENABLE_CENTER_CROP_IN_DETAIL_WALLPAPER = true;
    public static final boolean SHOW_WALLPAPER_NAME = false;
    public static final boolean SHOW_CATEGORY_NAME = false;
    public static final boolean SHOW_WALLPAPER_COUNT_ON_CATEGORY = false;
    public static final boolean SHOW_FULL_SCREEN_WALLPAPER_DETAILS_VIEW = false;

    //Wallpaper set action visibility
    public static final boolean ENABLE_WALLPAPER_SET_ACTION_INFO = true;
    public static final boolean ENABLE_WALLPAPER_SET_ACTION_SAVE = true;
    public static final boolean ENABLE_WALLPAPER_SET_ACTION_APPLY = true;
    public static final boolean ENABLE_WALLPAPER_SET_ACTION_FAVORITE = true;
    public static final boolean ENABLE_WALLPAPER_SET_ACTION_SHARE = true;

    //RTL Mode
    public static final boolean ENABLE_RTL_MODE = false;

    //Show dialog close app
    public static final boolean ENABLE_EXIT_DIALOG = true;

    //GDPR Consent
    public static final boolean ENABLE_GDPR_EU_CONSENT = true;

    //Set false if you do not want to use dynamic menu management from the admin panel
    //If false, you need to setup your tab menu name in the strings.xml
    public static final boolean ENABLE_ONLINE_TAB_MENU_IN_ADMIN_PANEL = true;

    //Enable it with true value if want to the app will force to display open ads first before start the main menu
    //Longer duration to start the app may occur depending on internet connection or open ad response time itself
    public static final boolean FORCE_TO_SHOW_APP_OPEN_AD_ON_START = false;

    //set false to prevent the app accessed using vpn or packet capture apps for security improvement
    public static final boolean ALLOW_VPN_ACCESS = false;

    //reset watched rewarded ad history when user exit the app
    public static final boolean RESET_REWARDED_AD_HISTORY_ON_EXIT_APP = false;

    //deplay splash screen
    public static final int DELAY_SPLASH = 1500;

}
