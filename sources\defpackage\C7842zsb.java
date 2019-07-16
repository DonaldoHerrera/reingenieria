package defpackage;

import java.util.List;

/* renamed from: zsb reason: default package and case insensitive filesystem */
/* compiled from: DeserializedMemberDescriptor.kt */
public final class C7842zsb extends C7065ofb implements Yrb {
    private a A = a.COMPATIBLE;
    private final Olb B;
    private final Emb C;
    private final Jmb D;
    private final Mmb E;
    private final C7014nsb F;

    public C7842zsb(C5272Rcb rcb, C7408tdb tdb, C6723jeb jeb, C6314ddb ddb, C5583aeb aeb, boolean z, C7694xnb xnb, a aVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Olb olb, Emb emb, Jmb jmb, Mmb mmb, C7014nsb nsb) {
        Olb olb2 = olb;
        Emb emb2 = emb;
        Jmb jmb2 = jmb;
        Mmb mmb2 = mmb;
        C5272Rcb rcb2 = rcb;
        C7471uYa.b(rcb2, "containingDeclaration");
        C6723jeb jeb2 = jeb;
        C7471uYa.b(jeb2, "annotations");
        C6314ddb ddb2 = ddb;
        C7471uYa.b(ddb2, "modality");
        C5583aeb aeb2 = aeb;
        C7471uYa.b(aeb2, "visibility");
        C7694xnb xnb2 = xnb;
        C7471uYa.b(xnb2, "name");
        a aVar2 = aVar;
        C7471uYa.b(aVar2, "kind");
        C7471uYa.b(olb2, "proto");
        C7471uYa.b(emb2, "nameResolver");
        C7471uYa.b(jmb2, "typeTable");
        C7471uYa.b(mmb2, "versionRequirementTable");
        super(rcb2, tdb, jeb2, ddb2, aeb2, z, xnb2, aVar2, C7822zdb.a, z2, z3, z6, false, z4, z5);
        this.B = olb;
        this.C = emb;
        this.D = jmb;
        this.E = mmb;
        this.F = nsb;
    }

    public final void a(C7134pfb pfb, C7546vdb vdb, C5448Xcb xcb, C5448Xcb xcb2, a aVar) {
        C7471uYa.b(aVar, "isExperimentalCoroutineInReleaseEnvironment");
        super.a(pfb, vdb, xcb, xcb2);
        RVa rVa = RVa.a;
        this.A = aVar;
    }

    public Jmb ia() {
        return this.D;
    }

    public Mmb ja() {
        return this.E;
    }

    public Emb ka() {
        return this.C;
    }

    public C7014nsb la() {
        return this.F;
    }

    public boolean n() {
        Boolean a = Dmb.z.a(ma().m());
        C7471uYa.a((Object) a, "Flags.IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return a.booleanValue();
    }

    public List<Lmb> na() {
        return a.a(this);
    }

    public Olb ma() {
        return this.B;
    }

    /* access modifiers changed from: protected */
    public C7065ofb a(C5272Rcb rcb, C6314ddb ddb, C5583aeb aeb, C7408tdb tdb, a aVar, C7694xnb xnb) {
        C5272Rcb rcb2 = rcb;
        C6314ddb ddb2 = ddb;
        C5583aeb aeb2 = aeb;
        C7408tdb tdb2 = tdb;
        a aVar2 = aVar;
        C7694xnb xnb2 = xnb;
        C7471uYa.b(rcb, "newOwner");
        C7471uYa.b(ddb, "newModality");
        C7471uYa.b(aeb, "newVisibility");
        C7471uYa.b(aVar, "kind");
        C7471uYa.b(xnb, "newName");
        C7842zsb zsb = new C7842zsb(rcb2, tdb2, getAnnotations(), ddb2, aeb2, V(), xnb2, aVar2, Z(), X(), n(), aa(), p(), ma(), ka(), ia(), ja(), la());
        return zsb;
    }
}
