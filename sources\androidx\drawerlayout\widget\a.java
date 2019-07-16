package androidx.drawerlayout.widget;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

/* compiled from: DrawerLayout */
class a implements OnApplyWindowInsetsListener {
    final /* synthetic */ DrawerLayout a;

    a(DrawerLayout drawerLayout) {
        this.a = drawerLayout;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ((DrawerLayout) view).a((Object) windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
        return windowInsets.consumeSystemWindowInsets();
    }
}
