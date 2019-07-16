package com.soundcloud.android.main;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.main.I.b;
import com.soundcloud.android.view.bottomnav.ScBottomNavigationView;
import com.soundcloud.android.view.bottomnav.ScBottomNavigationView.a;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.ActivityLightCycleDispatcher;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;

public class MainNavigationView extends ActivityLightCycleDispatcher<RootActivity> implements b {
    private final X a;
    private final Z b;
    @LightCycle
    final ActivityEnterScreenDispatcher c;
    private Toolbar d;
    private ScBottomNavigationView e;
    private int f;

    public final class LightCycleBinder {
        public static void bind(MainNavigationView mainNavigationView) {
            mainNavigationView.bind(LightCycles.lift((ActivityLightCycle<Source>) mainNavigationView.c));
        }
    }

    public MainNavigationView(ActivityEnterScreenDispatcher activityEnterScreenDispatcher, Z z, X x) {
        this.a = x;
        this.c = activityEnterScreenDispatcher;
        this.b = z;
        activityEnterScreenDispatcher.a((b) this);
    }

    private void l() {
        a(m());
        a(o());
    }

    private a m() {
        return new C4024c(this);
    }

    private ScBottomNavigationView.b o() {
        return new C4025d(this);
    }

    private Z.a p() {
        return this.b.a(this.e.getSelectedItemId());
    }

    private void q() {
        this.a.c();
    }

    /* renamed from: a */
    public void onNewIntent(RootActivity rootActivity, Intent intent) {
        super.onNewIntent(rootActivity, intent);
        l();
    }

    /* renamed from: b */
    public void onDestroy(RootActivity rootActivity) {
        super.onDestroy(rootActivity);
        a((a) null);
        a((ScBottomNavigationView.b) null);
    }

    /* renamed from: c */
    public void onPause(RootActivity rootActivity) {
        a((a) null);
        a((ScBottomNavigationView.b) null);
        super.onPause(rootActivity);
    }

    /* renamed from: d */
    public void onResume(RootActivity rootActivity) {
        super.onResume(rootActivity);
        l();
    }

    /* access modifiers changed from: 0000 */
    public void e(RootActivity rootActivity) {
        this.d = (Toolbar) rootActivity.findViewById(i.toolbar_id);
        this.e = (ScBottomNavigationView) rootActivity.findViewById(i.bottom_navigation_view);
        Toolbar toolbar = this.d;
        if (toolbar != null) {
            rootActivity.setSupportActionBar(toolbar);
        }
        this.f = this.e.getResources().getDimensionPixelSize(g.bottom_navigation_height);
        l();
        a(this.e);
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        this.e.setTranslationY((float) this.f);
    }

    /* access modifiers changed from: 0000 */
    public void k() {
        this.e.setTranslationY(0.0f);
    }

    public void a(RootActivity rootActivity) {
        Toolbar toolbar = this.d;
        if (toolbar != null) {
            toolbar.setTitle((CharSequence) a(rootActivity, p()));
        }
    }

    public void a(RootActivity rootActivity, int i) {
        Z.a a2 = this.b.a(i);
        Toolbar toolbar = this.d;
        if (toolbar != null) {
            toolbar.setTitle((CharSequence) a(rootActivity, a2));
        }
    }

    public /* synthetic */ boolean b(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        this.c.b(itemId);
        this.a.a(itemId);
        return true;
    }

    /* access modifiers changed from: protected */
    public String a(RootActivity rootActivity, Z.a aVar) {
        return rootActivity.getResources().getString(aVar.getName());
    }

    private void a(ScBottomNavigationView.b bVar) {
        this.e.setOnNavigationItemSelectedListener(bVar);
    }

    public /* synthetic */ void a(MenuItem menuItem) {
        if (this.a.d()) {
            a();
        } else {
            q();
        }
    }

    private void a(a aVar) {
        this.e.setOnNavigationItemReselectedListener(aVar);
    }

    private void a() {
        this.a.a();
    }

    private void a(ScBottomNavigationView scBottomNavigationView) {
        Menu menu = scBottomNavigationView.getMenu();
        menu.clear();
        Context context = scBottomNavigationView.getContext();
        int a2 = this.b.a();
        for (int i = 0; i < a2; i++) {
            Z.a a3 = this.b.a(i);
            menu.add(0, i, i, context.getString(a3.getName())).setIcon(a3.getIcon());
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2) {
        this.e.setTranslationY(((float) this.f) * f2);
    }

    /* access modifiers changed from: 0000 */
    public void a(Yca yca) {
        int a2 = this.b.a(yca);
        if (a2 != -1) {
            this.e.setSelectedItemId(a2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Yca yca, boolean z) {
        a(yca);
        if (z) {
            q();
        }
    }
}
