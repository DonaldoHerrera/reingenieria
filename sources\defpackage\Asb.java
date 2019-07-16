package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: Asb reason: default package */
/* compiled from: DeserializedMemberDescriptor.kt */
public final class Asb extends C7341sfb implements Yrb {
    private a D;
    private final Blb E;
    private final Emb F;
    private final Jmb G;
    private final Mmb H;
    private final C7014nsb I;

    public /* synthetic */ Asb(C5272Rcb rcb, C7684xdb xdb, C6723jeb jeb, C7694xnb xnb, a aVar, Blb blb, Emb emb, Jmb jmb, Mmb mmb, C7014nsb nsb, C7822zdb zdb, int i, C7264rYa rya) {
        this(rcb, xdb, jeb, xnb, aVar, blb, emb, jmb, mmb, nsb, (i & 1024) != 0 ? null : zdb);
    }

    public final C7341sfb a(C7615wdb wdb, C7615wdb wdb2, List<? extends C4905Fdb> list, List<? extends C5061Kdb> list2, C7706xtb xtb, C6314ddb ddb, C5583aeb aeb, Map<? extends a<?>, ?> map, a aVar) {
        C7471uYa.b(list, "typeParameters");
        C7471uYa.b(list2, "unsubstitutedValueParameters");
        C7471uYa.b(aeb, "visibility");
        C7471uYa.b(map, "userDataMap");
        C7471uYa.b(aVar, "isExperimentalCoroutineInReleaseEnvironment");
        super.a(wdb, wdb2, list, list2, xtb, ddb, aeb, map);
        this.D = aVar;
        C7471uYa.a((Object) this, "super.initialize(\n      …easeEnvironment\n        }");
        return this;
    }

    public Jmb ia() {
        return this.G;
    }

    public Mmb ja() {
        return this.H;
    }

    public Emb ka() {
        return this.F;
    }

    public C7014nsb la() {
        return this.I;
    }

    public List<Lmb> na() {
        return a.a(this);
    }

    public a ta() {
        return this.D;
    }

    public Asb(C5272Rcb rcb, C7684xdb xdb, C6723jeb jeb, C7694xnb xnb, a aVar, Blb blb, Emb emb, Jmb jmb, Mmb mmb, C7014nsb nsb, C7822zdb zdb) {
        Blb blb2 = blb;
        Emb emb2 = emb;
        Jmb jmb2 = jmb;
        Mmb mmb2 = mmb;
        C5272Rcb rcb2 = rcb;
        C7471uYa.b(rcb, "containingDeclaration");
        C6723jeb jeb2 = jeb;
        C7471uYa.b(jeb, "annotations");
        C7471uYa.b(xnb, "name");
        C7471uYa.b(aVar, "kind");
        C7471uYa.b(blb2, "proto");
        C7471uYa.b(emb2, "nameResolver");
        C7471uYa.b(jmb2, "typeTable");
        C7471uYa.b(mmb2, "versionRequirementTable");
        super(rcb, xdb, jeb, xnb, aVar, zdb != null ? zdb : C7822zdb.a);
        this.E = blb2;
        this.F = emb2;
        this.G = jmb2;
        this.H = mmb2;
        this.I = nsb;
        this.D = a.COMPATIBLE;
    }

    public Blb ma() {
        return this.E;
    }

    /* access modifiers changed from: protected */
    public _eb a(C5272Rcb rcb, C5582adb adb, a aVar, C7694xnb xnb, C6723jeb jeb, C7822zdb zdb) {
        C7694xnb xnb2;
        C5272Rcb rcb2 = rcb;
        C7471uYa.b(rcb, "newOwner");
        C7471uYa.b(aVar, "kind");
        C7471uYa.b(jeb, "annotations");
        C7471uYa.b(zdb, "source");
        C7684xdb xdb = (C7684xdb) adb;
        if (xnb != null) {
            xnb2 = xnb;
        } else {
            C7694xnb name = getName();
            C7471uYa.a((Object) name, "name");
            xnb2 = name;
        }
        Asb asb = new Asb(rcb, xdb, jeb, xnb2, aVar, ma(), ka(), ia(), ja(), la(), zdb);
        asb.D = ta();
        return asb;
    }
}
