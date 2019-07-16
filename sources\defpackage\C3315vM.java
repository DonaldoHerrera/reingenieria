package defpackage;

import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.foundation.events.E;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* renamed from: vM reason: default package and case insensitive filesystem */
/* compiled from: ScreenPublisher.kt */
public class C3315vM extends DefaultActivityLightCycle<AppCompatActivity> {
    private final C2332VH<E> a;
    private final C2332VH<Ul<AppCompatActivity>> b;
    private final C2168MN c;
    private final C2350WH<J> d;

    public C3315vM(C2168MN mn, @a C2350WH<J> wh) {
        C7471uYa.b(mn, "eventTracker");
        C7471uYa.b(wh, "legacyTracker");
        this.c = mn;
        this.d = wh;
        C2332VH<E> s = C2332VH.s();
        String str = "PublishRelay.create()";
        C7471uYa.a((Object) s, str);
        this.a = s;
        C2332VH<Ul<AppCompatActivity>> s2 = C2332VH.s();
        C7471uYa.a((Object) s2, str);
        this.b = s2;
        y().f((C6776kQa<? super T>) new C3275tM<Object>(this));
        z().f((C6776kQa<? super T>) this.d);
    }

    private APa<HVa<E, AppCompatActivity>> y() {
        APa a2 = APa.a((EPa<? extends T1>) this.a.d(), (EPa<? extends T2>) this.b, (C6504gQa<? super T1, ? super T2, ? extends R>) C3295uM.a);
        C7471uYa.a((Object) a2, "Observable.combineLatest…e\n            }\n        )");
        return Yl.a(a2);
    }

    private APa<E> z() {
        return this.a.d();
    }

    /* renamed from: a */
    public void onPause(AppCompatActivity appCompatActivity) {
        C7471uYa.b(appCompatActivity, "host");
        this.b.accept(Tl.b);
        super.onPause(appCompatActivity);
    }

    /* renamed from: b */
    public void onResume(AppCompatActivity appCompatActivity) {
        C7471uYa.b(appCompatActivity, "host");
        super.onResume(appCompatActivity);
        this.b.accept(new Wl(appCompatActivity));
    }

    public C2168MN x() {
        return this.c;
    }

    public void a(Zca zca) {
        C7471uYa.b(zca, "screenData");
        a(C3335wM.a(zca));
    }

    private void a(E e) {
        this.a.accept(e);
    }
}
