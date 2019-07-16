package defpackage;

/* renamed from: nrb reason: default package and case insensitive filesystem */
/* compiled from: DeserializedPackageFragment.kt */
public abstract class C7012nrb extends C6928mfb {
    private final Ssb f;

    public C7012nrb(C7349snb snb, Ssb ssb, C6450fdb fdb) {
        C7471uYa.b(snb, "fqName");
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(fdb, "module");
        super(fdb, snb);
        this.f = ssb;
    }

    public boolean a(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        Eqb ha = ha();
        return (ha instanceof C7704xsb) && ((C7704xsb) ha).d().contains(xnb);
    }

    public abstract C6399erb ta();
}
