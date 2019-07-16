package defpackage;

import java.util.List;

/* renamed from: lrb reason: default package and case insensitive filesystem */
/* compiled from: context.kt */
public final class C6875lrb {
    private final Rrb a;
    private final Crb b;
    private final C6739jrb c;
    private final Emb d;
    private final C5272Rcb e;
    private final Jmb f;
    private final Mmb g;
    private final Bmb h;
    private final C7014nsb i;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0068, code lost:
        if (r0 != null) goto L_0x006d;
     */
    public C6875lrb(C6739jrb jrb, Emb emb, C5272Rcb rcb, Jmb jmb, Mmb mmb, Bmb bmb, C7014nsb nsb, Rrb rrb, List<C6527gmb> list) {
        String str;
        C6739jrb jrb2 = jrb;
        Emb emb2 = emb;
        C5272Rcb rcb2 = rcb;
        Jmb jmb2 = jmb;
        Mmb mmb2 = mmb;
        Bmb bmb2 = bmb;
        C7471uYa.b(jrb, "components");
        C7471uYa.b(emb, "nameResolver");
        C7471uYa.b(rcb, "containingDeclaration");
        C7471uYa.b(jmb2, "typeTable");
        C7471uYa.b(mmb2, "versionRequirementTable");
        C7471uYa.b(bmb2, "metadataVersion");
        C7471uYa.b(list, "typeParameters");
        this.c = jrb2;
        this.d = emb2;
        this.e = rcb2;
        this.f = jmb2;
        this.g = mmb2;
        this.h = bmb2;
        this.i = nsb;
        StringBuilder sb = new StringBuilder();
        sb.append("Deserializer for \"");
        sb.append(this.e.getName());
        sb.append('\"');
        String sb2 = sb.toString();
        C7014nsb nsb2 = this.i;
        if (nsb2 != null) {
            str = nsb2.b();
        }
        str = "[container not found]";
        Rrb rrb2 = new Rrb(this, rrb, list, sb2, str, false, 32, null);
        this.a = rrb2;
        this.b = new Crb(this);
    }

    public final C6739jrb a() {
        return this.c;
    }

    public final C7014nsb b() {
        return this.i;
    }

    public final C5272Rcb c() {
        return this.e;
    }

    public final Crb d() {
        return this.b;
    }

    public final Emb e() {
        return this.d;
    }

    public final Ssb f() {
        return this.c.q();
    }

    public final Rrb g() {
        return this.a;
    }

    public final Jmb h() {
        return this.f;
    }

    public final Mmb i() {
        return this.g;
    }

    public static /* synthetic */ C6875lrb a(C6875lrb lrb, C5272Rcb rcb, List list, Emb emb, Jmb jmb, Mmb mmb, Bmb bmb, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            emb = lrb.d;
        }
        Emb emb2 = emb;
        if ((i2 & 8) != 0) {
            jmb = lrb.f;
        }
        Jmb jmb2 = jmb;
        if ((i2 & 16) != 0) {
            mmb = lrb.g;
        }
        Mmb mmb2 = mmb;
        if ((i2 & 32) != 0) {
            bmb = lrb.h;
        }
        return lrb.a(rcb, list, emb2, jmb2, mmb2, bmb);
    }

    public final C6875lrb a(C5272Rcb rcb, List<C6527gmb> list, Emb emb, Jmb jmb, Mmb mmb, Bmb bmb) {
        C5272Rcb rcb2 = rcb;
        C7471uYa.b(rcb, "descriptor");
        List<C6527gmb> list2 = list;
        C7471uYa.b(list, "typeParameterProtos");
        Emb emb2 = emb;
        C7471uYa.b(emb, "nameResolver");
        C7471uYa.b(jmb, "typeTable");
        Mmb mmb2 = mmb;
        C7471uYa.b(mmb2, "versionRequirementTable");
        C7471uYa.b(bmb, "metadataVersion");
        C6739jrb jrb = this.c;
        if (!Nmb.b(bmb)) {
            mmb2 = this.g;
        }
        C6875lrb lrb = new C6875lrb(jrb, emb, rcb, jmb, mmb2, bmb, this.i, this.a, list);
        return lrb;
    }
}
