package defpackage;

import com.soundcloud.android.offline.C4197yd;

/* renamed from: JBa reason: default package and case insensitive filesystem */
/* compiled from: ReplacePlaylistPostCommand_Factory */
public final class C5012JBa implements C4961HMa<C4981IBa> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C4197yd> b;
    private final C7054oVa<C3800jea> c;
    private final C7054oVa<C6332dsa> d;
    private final C7054oVa<C4942Gta> e;

    public C5012JBa(C7054oVa<C5500ZKa> ova, C7054oVa<C4197yd> ova2, C7054oVa<C3800jea> ova3, C7054oVa<C6332dsa> ova4, C7054oVa<C4942Gta> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C5012JBa a(C7054oVa<C5500ZKa> ova, C7054oVa<C4197yd> ova2, C7054oVa<C3800jea> ova3, C7054oVa<C6332dsa> ova4, C7054oVa<C4942Gta> ova5) {
        C5012JBa jBa = new C5012JBa(ova, ova2, ova3, ova4, ova5);
        return jBa;
    }

    public C4981IBa get() {
        C4981IBa iBa = new C4981IBa((C5500ZKa) this.a.get(), (C4197yd) this.b.get(), (C3800jea) this.c.get(), (C6332dsa) this.d.get(), (C4942Gta) this.e.get());
        return iBa;
    }
}
