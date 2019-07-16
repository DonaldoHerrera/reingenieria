package defpackage;

/* renamed from: mfb reason: default package and case insensitive filesystem */
/* compiled from: PackageFragmentDescriptorImpl.kt */
public abstract class C6928mfb extends Qeb implements C6790kdb {
    private final C7349snb e;

    public C6928mfb(C6450fdb fdb, C7349snb snb) {
        C7471uYa.b(fdb, "module");
        C7471uYa.b(snb, "fqName");
        super(fdb, C6723jeb.c.a(), snb.f(), C7822zdb.a);
        this.e = snb;
    }

    public <R, D> R a(C5332Tcb<R, D> tcb, D d) {
        C7471uYa.b(tcb, "visitor");
        return tcb.a((C6790kdb) this, d);
    }

    public C7822zdb getSource() {
        C7822zdb zdb = C7822zdb.a;
        C7471uYa.a((Object) zdb, "SourceElement.NO_SOURCE");
        return zdb;
    }

    public final C7349snb q() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("package ");
        sb.append(this.e);
        return sb.toString();
    }

    public C6450fdb e() {
        C5272Rcb e2 = super.e();
        if (e2 != null) {
            return (C6450fdb) e2;
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
    }
}
