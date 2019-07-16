package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

/* renamed from: SJa reason: default package and case insensitive filesystem */
/* compiled from: StatusBarUtils */
public final class C5295SJa {
    static int a(AppCompatActivity appCompatActivity) {
        return appCompatActivity.getWindow().getStatusBarColor();
    }

    static boolean b(View view) {
        if (!a() || (view.getRootView().getSystemUiVisibility() & 8192) == 0) {
            return false;
        }
        return true;
    }

    @TargetApi(23)
    static void c(View view) {
        if (a()) {
            View rootView = view.getRootView();
            rootView.setSystemUiVisibility(rootView.getSystemUiVisibility() | 8192);
        }
    }

    static void a(Activity activity, int i) {
        activity.getWindow().setStatusBarColor(i);
    }

    public static int a(Activity activity) {
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return activity.getResources().getDimensionPixelSize(identifier);
        }
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    private static boolean a() {
        return VERSION.SDK_INT >= 23;
    }

    @TargetApi(23)
    static void a(View view) {
        if (a()) {
            View rootView = view.getRootView();
            rootView.setSystemUiVisibility(rootView.getSystemUiVisibility() & -8193);
        }
    }
}
