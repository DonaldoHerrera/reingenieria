package defpackage;

import com.soundcloud.android.collections.data.L;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.offline.Gd;

/* renamed from: xBa reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistsSyncerFactory */
class C7652xBa {
    private final C7054oVa<C7309sCa> a;
    private final C7054oVa<C7031oBa> b;
    private final C7054oVa<C5421Wpa> c;
    private final C7054oVa<C4981IBa> d;
    private final C7054oVa<C5363Upa> e;
    private final C7054oVa<C5128Msa> f;
    private final C7054oVa<dfa> g;
    private final C7054oVa<Gd> h;
    private final C7054oVa<C5287SBa> i;
    private final C7054oVa<C6332dsa> j;
    private final C7054oVa<C5327TLa> k;
    private final C7054oVa<C3700b> l;
    private final C7054oVa<L> m;

    C7652xBa(C7054oVa<C7309sCa> ova, C7054oVa<C7031oBa> ova2, C7054oVa<C5421Wpa> ova3, C7054oVa<C4981IBa> ova4, C7054oVa<C5363Upa> ova5, C7054oVa<C5128Msa> ova6, C7054oVa<dfa> ova7, C7054oVa<Gd> ova8, C7054oVa<C5287SBa> ova9, C7054oVa<C6332dsa> ova10, C7054oVa<C5327TLa> ova11, C7054oVa<C3700b> ova12, C7054oVa<L> ova13) {
        a(ova, 1);
        this.a = ova;
        a(ova2, 2);
        this.b = ova2;
        a(ova3, 3);
        this.c = ova3;
        a(ova4, 4);
        this.d = ova4;
        a(ova5, 5);
        this.e = ova5;
        a(ova6, 6);
        this.f = ova6;
        a(ova7, 7);
        this.g = ova7;
        a(ova8, 8);
        this.h = ova8;
        a(ova9, 9);
        this.i = ova9;
        a(ova10, 10);
        this.j = ova10;
        a(ova11, 11);
        this.k = ova11;
        a(ova12, 12);
        this.l = ova12;
        a(ova13, 13);
        this.m = ova13;
    }

    /* access modifiers changed from: 0000 */
    public C7583wBa a(boolean z) {
        Object obj = this.a.get();
        a(obj, 1);
        C7309sCa sca = (C7309sCa) obj;
        Object obj2 = this.b.get();
        a(obj2, 2);
        C7031oBa oba = (C7031oBa) obj2;
        Object obj3 = this.c.get();
        a(obj3, 3);
        C5421Wpa wpa = (C5421Wpa) obj3;
        Object obj4 = this.d.get();
        a(obj4, 4);
        C4981IBa iBa = (C4981IBa) obj4;
        Object obj5 = this.e.get();
        a(obj5, 5);
        C5363Upa upa = (C5363Upa) obj5;
        Object obj6 = this.f.get();
        a(obj6, 6);
        C5128Msa msa = (C5128Msa) obj6;
        Object obj7 = this.g.get();
        a(obj7, 7);
        dfa dfa = (dfa) obj7;
        Object obj8 = this.h.get();
        a(obj8, 8);
        Gd gd = (Gd) obj8;
        Object obj9 = this.i.get();
        a(obj9, 9);
        C5287SBa sBa = (C5287SBa) obj9;
        Object obj10 = this.j.get();
        a(obj10, 10);
        C6332dsa dsa = (C6332dsa) obj10;
        Object obj11 = this.k.get();
        a(obj11, 11);
        C5327TLa tLa = (C5327TLa) obj11;
        Object obj12 = this.l.get();
        a(obj12, 12);
        C3700b bVar = (C3700b) obj12;
        Object obj13 = this.m.get();
        a(obj13, 13);
        C7583wBa wba = new C7583wBa(sca, oba, wpa, iBa, upa, msa, dfa, gd, sBa, dsa, tLa, bVar, (L) obj13, z);
        return wba;
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }
}
