package com.soundcloud.android.main;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.main.I.a;
import com.soundcloud.android.main.I.b;
import com.soundcloud.lightcycle.ActivityLightCycleDispatcher;
import com.soundcloud.lightcycle.LightCycle;

@EVa(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u0004\u001a\u00020\u00058\u0016X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/main/ActivityEnterScreenDispatcher;", "Lcom/soundcloud/android/main/EnterScreenDispatcher;", "Lcom/soundcloud/lightcycle/ActivityLightCycleDispatcher;", "Lcom/soundcloud/android/main/RootActivity;", "stateProvider", "Lcom/soundcloud/android/main/ActivityScreenStateProvider;", "currentDateProvider", "Lcom/soundcloud/android/utilities/android/date/DateProvider;", "(Lcom/soundcloud/android/main/ActivityScreenStateProvider;Lcom/soundcloud/android/utilities/android/date/DateProvider;)V", "activity", "Lcom/soundcloud/java/optional/Optional;", "getActivity", "()Lcom/soundcloud/java/optional/Optional;", "setActivity", "(Lcom/soundcloud/java/optional/Optional;)V", "getCurrentDateProvider", "()Lcom/soundcloud/android/utilities/android/date/DateProvider;", "setCurrentDateProvider", "(Lcom/soundcloud/android/utilities/android/date/DateProvider;)V", "listener", "Lcom/soundcloud/android/main/EnterScreenDispatcher$Listener;", "getListener", "setListener", "screenStateProvider", "Lcom/soundcloud/android/main/ScreenStateProvider;", "getScreenStateProvider", "()Lcom/soundcloud/android/main/ScreenStateProvider;", "onPause", "", "rootActivity", "onResume", "base_release"}, mv = {1, 1, 15})
/* compiled from: ActivityEnterScreenDispatcher.kt */
public class ActivityEnterScreenDispatcher extends ActivityLightCycleDispatcher<RootActivity> implements I {
    private final ia a = this.d;
    private C4928GKa<RootActivity> b;
    private C4928GKa<b> c;
    @LightCycle
    public final F d;
    private C5694cGa e;

    public ActivityEnterScreenDispatcher(F f, C5694cGa cga) {
        C7471uYa.b(f, "stateProvider");
        C7471uYa.b(cga, "currentDateProvider");
        this.d = f;
        this.e = cga;
        C4928GKa<RootActivity> a2 = C4928GKa.a();
        String str = "Optional.absent()";
        C7471uYa.a((Object) a2, str);
        this.b = a2;
        C4928GKa<b> a3 = C4928GKa.a();
        C7471uYa.a((Object) a3, str);
        this.c = a3;
    }

    public void a(b bVar) {
        C7471uYa.b(bVar, CastExtraArgs.LISTENER);
        a.a((I) this, bVar);
    }

    public void b(int i) {
        a.a((I) this, i);
    }

    /* renamed from: c */
    public void onResume(RootActivity rootActivity) {
        C7471uYa.b(rootActivity, "rootActivity");
        super.onResume(rootActivity);
        d(rootActivity);
    }

    public void d(RootActivity rootActivity) {
        C7471uYa.b(rootActivity, "activity");
        a.a((I) this, rootActivity);
    }

    public ia h() {
        return this.a;
    }

    public C4928GKa<b> i() {
        return this.c;
    }

    public void l() {
        a.a(this);
    }

    public C4928GKa<RootActivity> n() {
        return this.b;
    }

    public void a(C4928GKa<b> gKa) {
        C7471uYa.b(gKa, "<set-?>");
        this.c = gKa;
    }

    public void b(C4928GKa<RootActivity> gKa) {
        C7471uYa.b(gKa, "<set-?>");
        this.b = gKa;
    }

    /* renamed from: b */
    public void onPause(RootActivity rootActivity) {
        C7471uYa.b(rootActivity, "rootActivity");
        super.onPause(rootActivity);
        l();
    }
}
