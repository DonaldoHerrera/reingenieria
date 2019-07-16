package defpackage;

import java.util.List;

/* renamed from: Zrb reason: default package */
/* compiled from: DeserializedMemberDescriptor.kt */
public final class Zrb extends Leb implements Yrb {
    private a F;
    private final C6730jlb G;
    private final Emb H;
    private final Jmb I;
    private final Mmb J;
    private final C7014nsb K;

    public /* synthetic */ Zrb(C5029Jcb jcb, C5242Qcb qcb, C6723jeb jeb, boolean z, a aVar, C6730jlb jlb, Emb emb, Jmb jmb, Mmb mmb, C7014nsb nsb, C7822zdb zdb, int i, C7264rYa rya) {
        this(jcb, qcb, jeb, z, aVar, jlb, emb, jmb, mmb, nsb, (i & 1024) != 0 ? null : zdb);
    }

    public Jmb ia() {
        return this.I;
    }

    public boolean isInline() {
        return false;
    }

    public Mmb ja() {
        return this.J;
    }

    public Emb ka() {
        return this.H;
    }

    public C7014nsb la() {
        return this.K;
    }

    public boolean n() {
        return false;
    }

    public List<Lmb> na() {
        return a.a(this);
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public a ua() {
        return this.F;
    }

    public Zrb(C5029Jcb jcb, C5242Qcb qcb, C6723jeb jeb, boolean z, a aVar, C6730jlb jlb, Emb emb, Jmb jmb, Mmb mmb, C7014nsb nsb, C7822zdb zdb) {
        C6730jlb jlb2 = jlb;
        Emb emb2 = emb;
        Jmb jmb2 = jmb;
        Mmb mmb2 = mmb;
        C5029Jcb jcb2 = jcb;
        C7471uYa.b(jcb, "containingDeclaration");
        C6723jeb jeb2 = jeb;
        C7471uYa.b(jeb, "annotations");
        C7471uYa.b(aVar, "kind");
        C7471uYa.b(jlb2, "proto");
        C7471uYa.b(emb2, "nameResolver");
        C7471uYa.b(jmb2, "typeTable");
        C7471uYa.b(mmb2, "versionRequirementTable");
        super(jcb, qcb, jeb, z, aVar, zdb != null ? zdb : C7822zdb.a);
        this.G = jlb2;
        this.H = emb2;
        this.I = jmb2;
        this.J = mmb2;
        this.K = nsb;
        this.F = a.COMPATIBLE;
    }

    public C6730jlb ma() {
        return this.G;
    }

    public void a(a aVar) {
        C7471uYa.b(aVar, "<set-?>");
        this.F = aVar;
    }

    /* access modifiers changed from: protected */
    public Zrb a(C5272Rcb rcb, C5582adb adb, a aVar, C7694xnb xnb, C6723jeb jeb, C7822zdb zdb) {
        C5272Rcb rcb2 = rcb;
        C7471uYa.b(rcb, "newOwner");
        a aVar2 = aVar;
        C7471uYa.b(aVar2, "kind");
        C6723jeb jeb2 = jeb;
        C7471uYa.b(jeb2, "annotations");
        C7822zdb zdb2 = zdb;
        C7471uYa.b(zdb2, "source");
        Zrb zrb = new Zrb((C5029Jcb) rcb2, (C5242Qcb) adb, jeb2, this.E, aVar2, ma(), ka(), ia(), ja(), la(), zdb2);
        zrb.a(ua());
        return zrb;
    }
}
