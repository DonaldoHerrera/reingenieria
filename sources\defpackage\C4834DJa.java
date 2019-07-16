package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;

/* renamed from: DJa reason: default package and case insensitive filesystem */
/* compiled from: BaseLayoutHelper */
public class C4834DJa {
    private final C4896FJa a;

    C4834DJa(C4896FJa fJa) {
        this.a = fJa;
    }

    public static void a(AppCompatActivity appCompatActivity) {
        DrawerLayout drawerLayout = (DrawerLayout) appCompatActivity.findViewById(i.drawer_layout);
        View findViewById = appCompatActivity.findViewById(i.dev_drawer);
        if (drawerLayout != null && findViewById == null) {
            View.inflate(appCompatActivity, l.dev_drawer, drawerLayout);
        }
    }

    private View b(AppCompatActivity appCompatActivity, int i) {
        View a2 = this.a.a(appCompatActivity, appCompatActivity.getLayoutInflater().inflate(i, null));
        appCompatActivity.setContentView(a2);
        return a2;
    }

    public View c(AppCompatActivity appCompatActivity) {
        return a(appCompatActivity, l.container_layout);
    }

    public View d(AppCompatActivity appCompatActivity) {
        return a(appCompatActivity, l.container_loading_layout);
    }

    public View e(AppCompatActivity appCompatActivity) {
        return b(appCompatActivity, l.layout_main);
    }

    public void f(AppCompatActivity appCompatActivity) {
        Toolbar toolbar = (Toolbar) appCompatActivity.findViewById(i.toolbar_id);
        if (toolbar != null) {
            appCompatActivity.setSupportActionBar(toolbar);
            ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.d(true);
                supportActionBar.e(true);
            }
        }
    }

    public static void b(AppCompatActivity appCompatActivity) {
        View findViewById = appCompatActivity.findViewById(i.dev_drawer);
        if (findViewById != null) {
            ((ViewGroup) findViewById.getParent()).removeView(findViewById);
        }
    }

    public View a(AppCompatActivity appCompatActivity, int i) {
        View b = b(appCompatActivity, i);
        f(appCompatActivity);
        return b;
    }
}
