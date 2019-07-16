package defpackage;

import com.soundcloud.android.playback.core.d;

/* renamed from: qS reason: default package and case insensitive filesystem */
/* compiled from: CastJsonHandler_Factory */
public final class C3221qS implements C4961HMa<C3202pS> {
    private final C7054oVa<Nea> a;
    private final C7054oVa<d> b;

    public C3221qS(C7054oVa<Nea> ova, C7054oVa<d> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3221qS a(C7054oVa<Nea> ova, C7054oVa<d> ova2) {
        return new C3221qS(ova, ova2);
    }

    public C3202pS get() {
        return new C3202pS(C4930GMa.a(this.a), (d) this.b.get());
    }
}
