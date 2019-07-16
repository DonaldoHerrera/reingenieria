package defpackage;

import com.soundcloud.android.main.ba;

/* renamed from: dia reason: default package and case insensitive filesystem */
/* compiled from: NavigationModule_ProvidePlayerNavigationControllerFactory */
public final class C4540dia implements C4961HMa<ba> {
    private final C7054oVa<C4580iia> a;

    public C4540dia(C7054oVa<C4580iia> ova) {
        this.a = ova;
    }

    public static C4540dia a(C7054oVa<C4580iia> ova) {
        return new C4540dia(ova);
    }

    public static ba a(C4580iia iia) {
        ba a2 = C3947aia.a(iia);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public ba get() {
        return a((C4580iia) this.a.get());
    }
}
