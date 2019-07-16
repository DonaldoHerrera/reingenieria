package defpackage;

import com.soundcloud.android.playback.core.d;

/* renamed from: uS reason: default package and case insensitive filesystem */
/* compiled from: CastProtocol_Factory */
public final class C3301uS implements C4961HMa<C3281tS> {
    private final C7054oVa<C3202pS> a;
    private final C7054oVa<C3183oS> b;
    private final C7054oVa<C5606ava> c;
    private final C7054oVa<d> d;

    public C3301uS(C7054oVa<C3202pS> ova, C7054oVa<C3183oS> ova2, C7054oVa<C5606ava> ova3, C7054oVa<d> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C3301uS a(C7054oVa<C3202pS> ova, C7054oVa<C3183oS> ova2, C7054oVa<C5606ava> ova3, C7054oVa<d> ova4) {
        return new C3301uS(ova, ova2, ova3, ova4);
    }

    public C3281tS get() {
        return new C3281tS((C3202pS) this.a.get(), this.b, (C5606ava) this.c.get(), (d) this.d.get());
    }
}
