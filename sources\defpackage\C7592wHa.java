package defpackage;

import androidx.fragment.app.Fragment;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;

/* renamed from: wHa reason: default package and case insensitive filesystem */
/* compiled from: LightCycleResumeEmitter.kt */
public class C7592wHa extends DefaultSupportFragmentLightCycle<Fragment> {
    private final C6781kVa<RVa> a;

    public C7592wHa() {
        C6781kVa<RVa> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<Unit>()");
        this.a = s;
    }

    /* renamed from: a */
    public void onResume(Fragment fragment) {
        C7471uYa.b(fragment, "fragment");
        g().a(RVa.a);
    }

    public C6781kVa<RVa> g() {
        return this.a;
    }
}
