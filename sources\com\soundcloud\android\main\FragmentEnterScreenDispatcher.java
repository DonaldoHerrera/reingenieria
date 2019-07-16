package com.soundcloud.android.main;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.main.I.a;
import com.soundcloud.android.main.I.b;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher;

@EVa(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/main/FragmentEnterScreenDispatcher;", "Lcom/soundcloud/android/main/EnterScreenDispatcher;", "Lcom/soundcloud/lightcycle/SupportFragmentLightCycleDispatcher;", "Landroidx/fragment/app/Fragment;", "stateProvider", "Lcom/soundcloud/android/main/FragmentScreenStateProvider;", "currentDateProvider", "Lcom/soundcloud/android/utilities/android/date/DateProvider;", "(Lcom/soundcloud/android/main/FragmentScreenStateProvider;Lcom/soundcloud/android/utilities/android/date/DateProvider;)V", "activity", "Lcom/soundcloud/java/optional/Optional;", "Lcom/soundcloud/android/main/RootActivity;", "getActivity", "()Lcom/soundcloud/java/optional/Optional;", "setActivity", "(Lcom/soundcloud/java/optional/Optional;)V", "getCurrentDateProvider", "()Lcom/soundcloud/android/utilities/android/date/DateProvider;", "setCurrentDateProvider", "(Lcom/soundcloud/android/utilities/android/date/DateProvider;)V", "listener", "Lcom/soundcloud/android/main/EnterScreenDispatcher$Listener;", "getListener", "setListener", "screenStateProvider", "getScreenStateProvider", "()Lcom/soundcloud/android/main/FragmentScreenStateProvider;", "onPause", "", "fragment", "onResume", "base_release"}, mv = {1, 1, 15})
/* compiled from: FragmentEnterScreenDispatcher.kt */
public class FragmentEnterScreenDispatcher extends SupportFragmentLightCycleDispatcher<Fragment> implements I {
    private final FragmentScreenStateProvider a = this.d;
    private C4928GKa<RootActivity> b;
    private C4928GKa<b> c;
    @LightCycle
    public final FragmentScreenStateProvider d;
    private C5694cGa e;

    public FragmentEnterScreenDispatcher(FragmentScreenStateProvider fragmentScreenStateProvider, C5694cGa cga) {
        C7471uYa.b(fragmentScreenStateProvider, "stateProvider");
        C7471uYa.b(cga, "currentDateProvider");
        this.d = fragmentScreenStateProvider;
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

    public C4928GKa<b> i() {
        return this.c;
    }

    public C4928GKa<RootActivity> n() {
        return this.b;
    }

    public void v() {
        a.a(this);
    }

    public void a(C4928GKa<b> gKa) {
        C7471uYa.b(gKa, "<set-?>");
        this.c = gKa;
    }

    public void b(RootActivity rootActivity) {
        C7471uYa.b(rootActivity, "activity");
        a.a((I) this, rootActivity);
    }

    public FragmentScreenStateProvider h() {
        return this.a;
    }

    /* renamed from: a */
    public void onPause(Fragment fragment) {
        C7471uYa.b(fragment, "fragment");
        super.onPause(fragment);
        v();
    }

    public void b(C4928GKa<RootActivity> gKa) {
        C7471uYa.b(gKa, "<set-?>");
        this.b = gKa;
    }

    /* renamed from: b */
    public void onResume(Fragment fragment) {
        C7471uYa.b(fragment, "fragment");
        super.onResume(fragment);
        FragmentActivity requireActivity = fragment.requireActivity();
        if (requireActivity != null) {
            b((RootActivity) requireActivity);
            return;
        }
        throw new OVa("null cannot be cast to non-null type com.soundcloud.android.main.RootActivity");
    }
}
