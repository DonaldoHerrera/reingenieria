package defpackage;

import java.util.Locale;

/* renamed from: WO reason: default package and case insensitive filesystem */
/* compiled from: ApiModule_ProvideDefaultLocaleFactory */
public final class C2357WO implements C4961HMa<Locale> {
    private static final C2357WO a = new C2357WO();

    public static C2357WO a() {
        return a;
    }

    public static Locale b() {
        Locale a2 = C2264RO.a();
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public Locale get() {
        return b();
    }
}
