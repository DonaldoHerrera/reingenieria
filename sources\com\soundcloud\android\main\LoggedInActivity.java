package com.soundcloud.android.main;

import android.app.Fragment;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import com.soundcloud.android.C2929h;
import com.soundcloud.android.accounts.A;
import com.soundcloud.android.accounts.O;
import com.soundcloud.android.ads.C2571fb;
import com.soundcloud.android.cast.C2728b;
import com.soundcloud.android.cast.C2732f;
import com.soundcloud.android.cast.C2732f.a;
import com.soundcloud.android.cast.i;
import com.soundcloud.android.ia;
import com.soundcloud.android.ia.m;
import com.soundcloud.android.receiver.UnauthorisedRequestReceiver;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;

public abstract class LoggedInActivity extends RootActivity implements a {
    C2728b n;
    C2571fb o;
    @LightCycle
    C2732f p;
    @LightCycle
    i q;
    @LightCycle
    O r;
    @LightCycle
    UnauthorisedRequestReceiver.a s;
    @LightCycle
    A t;
    @LightCycle
    C7222qta u;
    @LightCycle
    C3233rK v;
    private C4928GKa<MenuItem> w = C4928GKa.a();

    public final class LightCycleBinder {
        public static void bind(LoggedInActivity loggedInActivity) {
            com.soundcloud.android.main.RootActivity.LightCycleBinder.bind(loggedInActivity);
            loggedInActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) loggedInActivity.p));
            loggedInActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) loggedInActivity.q));
            loggedInActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) loggedInActivity.r));
            loggedInActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) loggedInActivity.s));
            loggedInActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) loggedInActivity.t));
            loggedInActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) loggedInActivity.u));
            loggedInActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) loggedInActivity.v));
        }
    }

    public static int A() {
        return ia.i.container;
    }

    private void B() {
        this.w.a((C7733yKa<? super T>) new C4023b<Object>(this));
    }

    public /* synthetic */ void a(MenuItem menuItem) {
        boolean b = this.p.b();
        menuItem.setVisible(b);
        if (b) {
            this.q.x();
        }
    }

    public void f() {
        B();
    }

    public void g() {
        B();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(m.main_menu, menu);
        this.w = this.n.a(this, menu, ia.i.media_route_menu_item);
        B();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.w = C4928GKa.a();
        this.p.a(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.o.a();
        this.p.b(this);
    }

    public boolean onSearchRequested() {
        startActivity(new Intent(C2929h.g).addFlags(67108864));
        return false;
    }

    public boolean onSupportNavigateUp() {
        if (isTaskRoot()) {
            startActivity(new Intent(this, MainActivity.class));
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
    }

    /* access modifiers changed from: protected */
    public void z() {
        Fragment findFragmentById = getFragmentManager().findFragmentById(A());
        if (findFragmentById != null) {
            getFragmentManager().beginTransaction().remove(findFragmentById).commit();
        }
    }

    /* access modifiers changed from: protected */
    public void a(Fragment fragment) {
        getFragmentManager().beginTransaction().replace(A(), fragment).commit();
    }
}
