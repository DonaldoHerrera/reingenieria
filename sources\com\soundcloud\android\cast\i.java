package com.soundcloud.android.cast;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.soundcloud.android.ia.p;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* compiled from: CastIntroductoryOverlayPresenter */
public class i extends DefaultActivityLightCycle<AppCompatActivity> {
    private final Iea a;
    private Toolbar b;

    public i(Iea iea) {
        this.a = iea;
    }

    public /* synthetic */ void a(MenuItem menuItem) {
        this.a.a(Dea.a().a("chromecast").a(menuItem.getActionView()).b(p.cast_introductory_overlay_title).a(p.cast_introductory_overlay_description).a());
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        this.b = (Toolbar) appCompatActivity.findViewById(com.soundcloud.android.ia.i.toolbar_id);
    }

    public void x() {
        a(this.b, com.soundcloud.android.ia.i.media_route_menu_item).a((C7733yKa<? super T>) new C2727a<Object>(this));
    }

    private C4928GKa<MenuItem> a(Toolbar toolbar, int i) {
        if (toolbar == null || toolbar.getMenu() == null) {
            return C4928GKa.a();
        }
        return C4928GKa.b(toolbar.getMenu().findItem(i));
    }
}
