package org.lineageos.internal.util;

import android.content.Context;
import android.content.res.Configuration;

public class ScreenType {
    public static boolean isTablet(Context context) {
        if (context == null) {
            return false;
        }
        int size = context.getResources().getConfiguration().screenLayout
                & Configuration.SCREENLAYOUT_SIZE_MASK;
        return size >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }
}
