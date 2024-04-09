package sassy.girls.wallpaper.callback;

import sassy.girls.wallpaper.model.AdStatus;
import sassy.girls.wallpaper.model.Ads;
import sassy.girls.wallpaper.model.App;
import sassy.girls.wallpaper.model.Menu;
import sassy.girls.wallpaper.model.Placement;
import sassy.girls.wallpaper.model.Settings;

import java.util.ArrayList;
import java.util.List;

public class CallbackSettings {

    public String status;
    public App app = null;
    public List<Menu> menus = new ArrayList<>();
    public Settings settings = null;
    public Ads ads = null;
    public AdStatus ads_status = null;
    public Placement ads_placement = null;

}
