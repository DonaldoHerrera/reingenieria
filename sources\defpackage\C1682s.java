package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.ViewConfiguration;

/* renamed from: s reason: default package and case insensitive filesystem */
/* compiled from: ActionBarPolicy */
public class C1682s {
    private Context a;

    private C1682s(Context context) {
        this.a = context;
    }

    public static C1682s a(Context context) {
        return new C1682s(context);
    }

    public int b() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int c() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    public int d() {
        return this.a.getResources().getDimensionPixelSize(C1222d.abc_action_bar_stacked_tab_max_width);
    }

    public int e() {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, C1406j.ActionBar, C0294a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C1406j.ActionBar_height, 0);
        Resources resources = this.a.getResources();
        if (!f()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C1222d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean f() {
        return this.a.getResources().getBoolean(C0480b.abc_action_bar_embed_tabs);
    }

    public boolean g() {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.a).hasPermanentMenuKey();
    }

    public boolean a() {
        return this.a.getApplicationInfo().targetSdkVersion < 14;
    }
}
