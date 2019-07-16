package defpackage;

import com.soundcloud.android.accounts.C2526g;

/* renamed from: TT reason: default package and case insensitive filesystem */
/* compiled from: ConfigurationManager_Factory */
public final class C2307TT implements C4961HMa<C2288ST> {
    private final C7054oVa<C2325UT> a;
    private final C7054oVa<C2526g> b;
    private final C7054oVa<C2965dU> c;
    private final C7054oVa<C3129mM> d;

    public C2307TT(C7054oVa<C2325UT> ova, C7054oVa<C2526g> ova2, C7054oVa<C2965dU> ova3, C7054oVa<C3129mM> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C2307TT a(C7054oVa<C2325UT> ova, C7054oVa<C2526g> ova2, C7054oVa<C2965dU> ova3, C7054oVa<C3129mM> ova4) {
        return new C2307TT(ova, ova2, ova3, ova4);
    }

    public C2288ST get() {
        return new C2288ST((C2325UT) this.a.get(), (C2526g) this.b.get(), (C2965dU) this.c.get(), (C3129mM) this.d.get());
    }
}
