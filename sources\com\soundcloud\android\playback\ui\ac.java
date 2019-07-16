package com.soundcloud.android.playback.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.A;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.playqueue.p;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.main.ea;
import com.soundcloud.android.view.behavior.LockableBottomSheetBehavior;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SlidingPlayerController */
public class ac extends DefaultActivityLightCycle<AppCompatActivity> {
    private final C3814lca a;
    private final C5327TLa b;
    private final C3700b c;
    private final r d;
    private final C5235QJa e;
    private final com.soundcloud.android.view.behavior.LockableBottomSheetBehavior.a f;
    private ea g;
    private final UPa h = new UPa();
    private final List<b> i = new ArrayList();
    private WeakReference<C4451fb> j;
    /* access modifiers changed from: private */
    public LockableBottomSheetBehavior<View> k;
    private boolean l;
    private boolean m;
    private boolean n;
    /* access modifiers changed from: private */
    public boolean o;
    /* access modifiers changed from: private */
    public View p;

    /* compiled from: SlidingPlayerController */
    private class a extends C5037Jua<Haa> {
        private a() {
        }

        /* synthetic */ a(ac acVar, Zb zb) {
            this();
        }

        public void a(Haa haa) {
            if (haa.p()) {
                ac.this.P();
            } else if (haa.k()) {
                ac.this.F();
            } else if (haa.o()) {
                ac.this.E();
            } else if (haa.h()) {
                ac.this.a(K.c(false));
                ac.this.E();
            } else if (haa.n()) {
                ac.this.J();
            } else if (haa.g()) {
                ac.this.D();
            } else if (haa.l()) {
                ac.this.H();
            } else if (haa.q()) {
                ac.this.Q();
            } else if (haa.m()) {
                ac.this.I();
            } else if (haa.r()) {
                ac.this.R();
            }
        }
    }

    /* compiled from: SlidingPlayerController */
    public interface b {
        void a(float f);

        void j();

        void k();
    }

    public ac(C3814lca lca, C5327TLa tLa, r rVar, C5235QJa qJa, com.soundcloud.android.view.behavior.LockableBottomSheetBehavior.a aVar, ea eaVar, C3700b bVar) {
        this.a = lca;
        this.b = tLa;
        this.d = rVar;
        this.e = qJa;
        this.f = aVar;
        this.g = eaVar;
        this.c = bVar;
    }

    private void C() {
        this.k.c(4);
    }

    /* access modifiers changed from: private */
    public void D() {
        if (!G()) {
            a(K.b(false));
            C();
        }
    }

    /* access modifiers changed from: private */
    public void E() {
        this.k.c(3);
    }

    /* access modifiers changed from: private */
    public void F() {
        this.k.b(true);
        this.k.c(5);
    }

    private boolean G() {
        return this.k.c() == 5;
    }

    /* access modifiers changed from: private */
    public void H() {
        this.k.d(true);
        if (!z()) {
            E();
        }
        this.l = true;
    }

    /* access modifiers changed from: private */
    public void I() {
        H();
        this.m = true;
    }

    /* access modifiers changed from: private */
    public void J() {
        C();
    }

    private void K() {
        for (b k2 : this.i) {
            k2.k();
        }
        this.b.c(C3876taa.d, Iaa.a());
    }

    private void L() {
        for (b j2 : this.i) {
            j2.j();
        }
        this.b.c(C3876taa.d, Iaa.b());
    }

    private void M() {
        this.e.x();
        C();
        K();
    }

    private void N() {
        boolean z = this.a.h().k() || this.m;
        if (this.n || z) {
            d(z);
            return;
        }
        UPa uPa = this.h;
        C7531vPa a2 = this.b.a(C3876taa.d).f().b(Iaa.a()).a(RPa.a());
        C5190Oua a3 = C5190Oua.a(new Y(this));
        a2.c(a3);
        uPa.b(a3);
    }

    private void O() {
        this.p.getViewTreeObserver().addOnGlobalLayoutListener(new _b(this));
    }

    /* access modifiers changed from: private */
    public void P() {
        if (G()) {
            C();
        }
    }

    /* access modifiers changed from: private */
    public void Q() {
        if (!this.m) {
            this.k.d(false);
            this.l = false;
        }
    }

    /* access modifiers changed from: private */
    public void R() {
        this.m = false;
        Q();
    }

    /* access modifiers changed from: 0000 */
    public void A() {
        this.k.b(false);
        this.e.x();
        K();
        if (this.o) {
            a(K.l());
        }
    }

    /* access modifiers changed from: 0000 */
    public void B() {
        this.k.b(false);
        this.e.y();
        L();
        if (this.o) {
            a(K.m());
        }
    }

    public View x() {
        C4451fb fbVar = (C4451fb) this.j.get();
        View view = fbVar != null ? fbVar.getView() : null;
        if (view != null) {
            return view.getRootView().findViewById(16908290);
        }
        return null;
    }

    public boolean y() {
        if (this.j.get() != null && ((C4451fb) this.j.get()).Sa()) {
            return true;
        }
        if (!this.l && z()) {
            J();
            return true;
        } else if (!this.l || !this.m) {
            return false;
        } else {
            R();
            return true;
        }
    }

    public boolean z() {
        return this.k.c() == 3;
    }

    private void d(boolean z) {
        this.e.y();
        E();
        L();
        if (z) {
            H();
        }
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        C0370l supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        String str = "player_fragment";
        Fragment a2 = supportFragmentManager.a(str);
        if (a2 == null) {
            a2 = this.g.get();
            A a3 = supportFragmentManager.a();
            a3.a(i.player_root, a2, str);
            a3.a();
        }
        this.j = new WeakReference<>((C4451fb) a2);
        this.p = appCompatActivity.findViewById(i.player_root);
        C1778vc.a(this.p, (float) appCompatActivity.getResources().getDimensionPixelSize(g.player_elevation));
        this.k = this.f.a(this.p);
        this.k.b(appCompatActivity.getResources().getDimensionPixelSize(g.miniplayer_peak_height));
        this.k.a((com.google.android.material.bottomsheet.BottomSheetBehavior.a) new Zb(this));
        O();
        if (bundle != null) {
            this.m = bundle.getBoolean("player_overlay_lock", false);
        }
        this.n = a(a((Activity) appCompatActivity, bundle));
    }

    /* renamed from: c */
    public void onSaveInstanceState(AppCompatActivity appCompatActivity, Bundle bundle) {
        bundle.putBoolean("expand_player", z());
        bundle.putBoolean("player_overlay_lock", this.m);
    }

    /* renamed from: a */
    public void onNewIntent(AppCompatActivity appCompatActivity, Intent intent) {
        this.n = a(intent.getExtras());
    }

    /* renamed from: a */
    public void onPause(AppCompatActivity appCompatActivity) {
        this.h.b();
    }

    public void a(b bVar) {
        this.i.add(bVar);
    }

    private void a(View view) {
        this.h.b((VPa) this.d.b().a((C7256rQa<? super T>) new Z<Object>(this)).c(new Wb(view)));
    }

    public /* synthetic */ boolean a(p pVar) throws Exception {
        return !z() && pVar.d();
    }

    private Bundle a(Activity activity, Bundle bundle) {
        if (bundle != null) {
            return bundle;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            return intent.getExtras();
        }
        return null;
    }

    private boolean a(Bundle bundle) {
        if (bundle != null) {
            return this.m || bundle.getBoolean("expand_player", false);
        }
        return false;
    }

    public /* synthetic */ void a(Iaa iaa) throws Exception {
        if (!this.n || iaa.c() != 0) {
            M();
        } else {
            d(false);
        }
    }

    /* access modifiers changed from: private */
    public void a(K k2) {
        this.o = false;
        this.c.a((J) k2);
    }

    /* renamed from: b */
    public void onResume(AppCompatActivity appCompatActivity) {
        if (this.a.x()) {
            F();
        } else {
            N();
        }
        this.n = false;
        this.h.b(this.b.a(C3876taa.f, (SUa<E>) new a<E>(this, null)));
        a(appCompatActivity.findViewById(i.player_root));
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2) {
        C4451fb fbVar = (C4451fb) this.j.get();
        if (fbVar != null) {
            fbVar.a(f2);
        }
        this.e.a(f2);
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            ((b) this.i.get(i2)).a(f2);
        }
    }

    public void b(b bVar) {
        this.i.remove(bVar);
    }
}
