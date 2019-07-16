package defpackage;

import com.soundcloud.android.main.Z;

/* renamed from: bia reason: default package and case insensitive filesystem */
/* compiled from: NavigationModule_NavigationModelFactory */
public final class C3955bia implements C4961HMa<Z> {
    private final C7054oVa<C2040FU> a;

    public C3955bia(C7054oVa<C2040FU> ova) {
        this.a = ova;
    }

    public static C3955bia a(C7054oVa<C2040FU> ova) {
        return new C3955bia(ova);
    }

    public static Z a(C2040FU fu) {
        Z a2 = C3947aia.a(fu);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public Z get() {
        return a((C2040FU) this.a.get());
    }
}
