package defpackage;

/* renamed from: qrb reason: default package and case insensitive filesystem */
/* compiled from: DeserializedPackageFragmentImpl.kt */
public abstract class C7219qrb extends C7012nrb {
    private final Gmb g;
    private final Erb h;
    private Klb i;
    private Eqb j;
    private final Bmb k;
    /* access modifiers changed from: private */
    public final C7014nsb l;

    public C7219qrb(C7349snb snb, Ssb ssb, C6450fdb fdb, Klb klb, Bmb bmb, C7014nsb nsb) {
        C7471uYa.b(snb, "fqName");
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(fdb, "module");
        C7471uYa.b(klb, "proto");
        C7471uYa.b(bmb, "metadataVersion");
        super(snb, ssb, fdb);
        this.k = bmb;
        this.l = nsb;
        Wlb q = klb.q();
        C7471uYa.a((Object) q, "proto.strings");
        Rlb p = klb.p();
        C7471uYa.a((Object) p, "proto.qualifiedNames");
        this.g = new Gmb(q, p);
        this.h = new Erb(klb, this.g, this.k, new C7081orb(this));
        this.i = klb;
    }

    public Eqb ha() {
        Eqb eqb = this.j;
        if (eqb != null) {
            return eqb;
        }
        C7471uYa.b("_memberScope");
        throw null;
    }

    public void a(C6739jrb jrb) {
        C7471uYa.b(jrb, "components");
        Klb klb = this.i;
        if (klb != null) {
            this.i = null;
            Ilb o = klb.o();
            C7471uYa.a((Object) o, "proto.`package`");
            C7773ysb ysb = new C7773ysb(this, o, this.g, this.k, this.l, jrb, new C7150prb(this));
            this.j = ysb;
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
    }

    public Erb ta() {
        return this.h;
    }
}
