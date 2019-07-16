package defpackage;

/* renamed from: jrb reason: default package and case insensitive filesystem */
/* compiled from: context.kt */
public final class C6739jrb {
    private final C6467frb a = new C6467frb(this);
    private final Ssb b;
    private final C6450fdb c;
    private final C6807krb d;
    private final C6399erb e;
    private final Zqb<C6315deb, Npb<?>> f;
    private final C6858ldb g;
    private final C7564vrb h;
    private final C7357srb i;
    private final Efb j;
    private final C7426trb k;
    private final Iterable<C7547veb> l;
    private final C6586hdb m;
    private final C6671irb n;
    private final C7478ueb o;
    private final C7616web p;
    private final Inb q;

    public C6739jrb(Ssb ssb, C6450fdb fdb, C6807krb krb, C6399erb erb, Zqb<? extends C6315deb, ? extends Npb<?>> zqb, C6858ldb ldb, C7564vrb vrb, C7357srb srb, Efb efb, C7426trb trb, Iterable<? extends C7547veb> iterable, C6586hdb hdb, C6671irb irb, C7478ueb ueb, C7616web web, Inb inb) {
        Ssb ssb2 = ssb;
        C6450fdb fdb2 = fdb;
        C6807krb krb2 = krb;
        C6399erb erb2 = erb;
        Zqb<? extends C6315deb, ? extends Npb<?>> zqb2 = zqb;
        C6858ldb ldb2 = ldb;
        C7564vrb vrb2 = vrb;
        C7357srb srb2 = srb;
        Efb efb2 = efb;
        C7426trb trb2 = trb;
        Iterable<? extends C7547veb> iterable2 = iterable;
        C6586hdb hdb2 = hdb;
        C6671irb irb2 = irb;
        C7478ueb ueb2 = ueb;
        C7616web web2 = web;
        C7471uYa.b(ssb2, "storageManager");
        C7471uYa.b(fdb2, "moduleDescriptor");
        C7471uYa.b(krb2, "configuration");
        C7471uYa.b(erb2, "classDataFinder");
        C7471uYa.b(zqb2, "annotationAndConstantLoader");
        C7471uYa.b(ldb2, "packageFragmentProvider");
        C7471uYa.b(vrb2, "localClassifierTypeSettings");
        C7471uYa.b(srb2, "errorReporter");
        C7471uYa.b(efb2, "lookupTracker");
        C7471uYa.b(trb2, "flexibleTypeDeserializer");
        C7471uYa.b(iterable2, "fictitiousClassDescriptorFactories");
        C7471uYa.b(hdb2, "notFoundClasses");
        C7471uYa.b(irb2, "contractDeserializer");
        C7471uYa.b(ueb2, "additionalClassPartsProvider");
        C7471uYa.b(web2, "platformDependentDeclarationFilter");
        Inb inb2 = inb;
        C7471uYa.b(inb2, "extensionRegistryLite");
        this.b = ssb2;
        this.c = fdb2;
        this.d = krb2;
        this.e = erb2;
        this.f = zqb2;
        this.g = ldb2;
        this.h = vrb2;
        this.i = srb2;
        this.j = efb2;
        this.k = trb2;
        this.l = iterable2;
        this.m = hdb2;
        this.n = irb2;
        this.o = ueb2;
        this.p = web;
        this.q = inb2;
    }

    public final C7478ueb a() {
        return this.o;
    }

    public final Zqb<C6315deb, Npb<?>> b() {
        return this.f;
    }

    public final C6399erb c() {
        return this.e;
    }

    public final C6467frb d() {
        return this.a;
    }

    public final C6807krb e() {
        return this.d;
    }

    public final C6671irb f() {
        return this.n;
    }

    public final C7357srb g() {
        return this.i;
    }

    public final Inb h() {
        return this.q;
    }

    public final Iterable<C7547veb> i() {
        return this.l;
    }

    public final C7426trb j() {
        return this.k;
    }

    public final C7564vrb k() {
        return this.h;
    }

    public final Efb l() {
        return this.j;
    }

    public final C6450fdb m() {
        return this.c;
    }

    public final C6586hdb n() {
        return this.m;
    }

    public final C6858ldb o() {
        return this.g;
    }

    public final C7616web p() {
        return this.p;
    }

    public final Ssb q() {
        return this.b;
    }

    public final C5029Jcb a(C7280rnb rnb) {
        C7471uYa.b(rnb, "classId");
        return C6467frb.a(this.a, rnb, null, 2, null);
    }

    public final C6875lrb a(C6790kdb kdb, Emb emb, Jmb jmb, Mmb mmb, Bmb bmb, C7014nsb nsb) {
        C6790kdb kdb2 = kdb;
        C7471uYa.b(kdb, "descriptor");
        Emb emb2 = emb;
        C7471uYa.b(emb, "nameResolver");
        Jmb jmb2 = jmb;
        C7471uYa.b(jmb, "typeTable");
        Mmb mmb2 = mmb;
        C7471uYa.b(mmb, "versionRequirementTable");
        Bmb bmb2 = bmb;
        C7471uYa.b(bmb2, "metadataVersion");
        C6875lrb lrb = new C6875lrb(this, emb2, kdb2, jmb2, mmb2, bmb2, nsb, null, C6918mWa.a());
        return lrb;
    }
}
