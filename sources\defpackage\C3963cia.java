package defpackage;

import com.soundcloud.android.main.ActivityEnterScreenDispatcher;
import com.soundcloud.android.main.MainNavigationView;
import com.soundcloud.android.main.Z;

/* renamed from: cia reason: default package and case insensitive filesystem */
/* compiled from: NavigationModule_ProvideNavigationViewFactory */
public final class C3963cia implements C4961HMa<MainNavigationView> {
    private final C7054oVa<ActivityEnterScreenDispatcher> a;
    private final C7054oVa<Z> b;
    private final C7054oVa<Zha> c;

    public static MainNavigationView a(ActivityEnterScreenDispatcher activityEnterScreenDispatcher, Z z, Zha zha) {
        MainNavigationView a2 = C3947aia.a(activityEnterScreenDispatcher, z, zha);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public MainNavigationView get() {
        return a((ActivityEnterScreenDispatcher) this.a.get(), (Z) this.b.get(), (Zha) this.c.get());
    }
}
