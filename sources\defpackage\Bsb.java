package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: Bsb reason: default package */
/* compiled from: DeserializedMemberDescriptor.kt */
public final class Bsb extends Geb implements C7083osb {
    private Collection<? extends C7479ufb> h;
    private Etb i;
    private Etb j;
    private List<? extends C4905Fdb> k;
    private Etb l;
    private a m = a.COMPATIBLE;
    private final Ssb n;
    private final C5727cmb o;
    private final Emb p;
    private final Jmb q;
    private final Mmb r;
    private final C7014nsb s;

    public Bsb(Ssb ssb, C5272Rcb rcb, C6723jeb jeb, C7694xnb xnb, C5583aeb aeb, C5727cmb cmb, Emb emb, Jmb jmb, Mmb mmb, C7014nsb nsb) {
        Ssb ssb2 = ssb;
        C5727cmb cmb2 = cmb;
        Emb emb2 = emb;
        Jmb jmb2 = jmb;
        Mmb mmb2 = mmb;
        C7471uYa.b(ssb, "storageManager");
        C5272Rcb rcb2 = rcb;
        C7471uYa.b(rcb, "containingDeclaration");
        C6723jeb jeb2 = jeb;
        C7471uYa.b(jeb, "annotations");
        C7694xnb xnb2 = xnb;
        C7471uYa.b(xnb2, "name");
        C5583aeb aeb2 = aeb;
        C7471uYa.b(aeb2, "visibility");
        C7471uYa.b(cmb2, "proto");
        C7471uYa.b(emb2, "nameResolver");
        C7471uYa.b(jmb2, "typeTable");
        C7471uYa.b(mmb2, "versionRequirementTable");
        C7822zdb zdb = C7822zdb.a;
        C7471uYa.a((Object) zdb, "SourceElement.NO_SOURCE");
        super(rcb2, jeb2, xnb2, zdb, aeb2);
        this.n = ssb2;
        this.o = cmb2;
        this.p = emb2;
        this.q = jmb2;
        this.r = mmb2;
        this.s = nsb;
    }

    public C5029Jcb A() {
        if (C7844ztb.a(fa())) {
            return null;
        }
        C5122Mcb c = fa().za().c();
        if (!(c instanceof C5029Jcb)) {
            c = null;
        }
        return (C5029Jcb) c;
    }

    public Etb fa() {
        Etb etb = this.j;
        if (etb != null) {
            return etb;
        }
        C7471uYa.b("expandedType");
        throw null;
    }

    public Etb ga() {
        Etb etb = this.i;
        if (etb != null) {
            return etb;
        }
        C7471uYa.b("underlyingType");
        throw null;
    }

    public Jmb ia() {
        return this.q;
    }

    public Mmb ja() {
        return this.r;
    }

    public Emb ka() {
        return this.p;
    }

    public C7014nsb la() {
        return this.s;
    }

    public List<Lmb> na() {
        return b.a(this);
    }

    /* access modifiers changed from: protected */
    public Ssb ua() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public List<C4905Fdb> wa() {
        List<? extends C4905Fdb> list = this.k;
        if (list != null) {
            return list;
        }
        C7471uYa.b("typeConstructorParameters");
        throw null;
    }

    public a xa() {
        return this.m;
    }

    public Etb z() {
        Etb etb = this.l;
        if (etb != null) {
            return etb;
        }
        C7471uYa.b("defaultTypeImpl");
        throw null;
    }

    public final void a(List<? extends C4905Fdb> list, Etb etb, Etb etb2, a aVar) {
        C7471uYa.b(list, "declaredTypeParameters");
        C7471uYa.b(etb, "underlyingType");
        C7471uYa.b(etb2, "expandedType");
        C7471uYa.b(aVar, "isExperimentalCoroutineInReleaseEnvironment");
        a(list);
        this.i = etb;
        this.j = etb2;
        this.k = C4998Idb.a((C5152Ncb) this);
        this.l = ta();
        this.h = va();
        this.m = aVar;
    }

    public C5727cmb ma() {
        return this.o;
    }

    public C4874Edb a(_tb _tb) {
        C7471uYa.b(_tb, "substitutor");
        if (_tb.b()) {
            return this;
        }
        Ssb ua = ua();
        C5272Rcb e = e();
        C7471uYa.a((Object) e, "containingDeclaration");
        C6723jeb annotations = getAnnotations();
        C7471uYa.a((Object) annotations, "annotations");
        C7694xnb name = getName();
        C7471uYa.a((Object) name, "name");
        Bsb bsb = new Bsb(ua, e, annotations, name, d(), ma(), ka(), ia(), ja(), la());
        List B = B();
        C7706xtb a = _tb.a((C7706xtb) ga(), C6473fub.INVARIANT);
        String str = "substitutor.safeSubstitu…Type, Variance.INVARIANT)";
        C7471uYa.a((Object) a, str);
        Etb a2 = Xtb.a(a);
        C7706xtb a3 = _tb.a((C7706xtb) fa(), C6473fub.INVARIANT);
        C7471uYa.a((Object) a3, str);
        bsb.a(B, a2, Xtb.a(a3), xa());
        return bsb;
    }
}
