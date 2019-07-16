package com.appboy.ui.support;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public class ViewUtils {
    private static int sDisplayHeight;

    public static double convertDpToPixels(Activity activity, double d) {
        return d * ((double) activity.getResources().getDisplayMetrics().density);
    }

    public static int getDisplayHeight(Activity activity) {
        int i = sDisplayHeight;
        if (i > 0) {
            return i;
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        sDisplayHeight = point.y;
        return sDisplayHeight;
    }

    public static int getTopVisibleCoordinate(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public static boolean isRunningOnTablet(Activity activity) {
        return activity.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    @TargetApi(16)
    public static void removeOnGlobalLayoutListenerSafe(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        if (VERSION.SDK_INT < 16) {
            viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
        } else {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void removeViewFromParent(View view) {
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            viewGroup.setFocusableInTouchMode(true);
            viewGroup.requestFocus();
            viewGroup.removeView(view);
        }
    }
}
