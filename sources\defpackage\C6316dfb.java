package defpackage;

import java.util.List;

/* renamed from: dfb reason: default package and case insensitive filesystem */
/* compiled from: LazyPackageViewDescriptorImpl.kt */
public final class C6316dfb extends Peb implements C7132pdb {
    static final /* synthetic */ DZa[] c = {HYa.a((DYa) new EYa(HYa.a(C6316dfb.class), "fragments", "getFragments()Ljava/util/List;"))};
    private final Psb d;
    private final Eqb e;
    private final C6792kfb f;
    private final C7349snb g;

    public C6316dfb(C6792kfb kfb, C7349snb snb, Ssb ssb) {
        C7471uYa.b(kfb, "module");
        C7471uYa.b(snb, "fqName");
        C7471uYa.b(ssb, "storageManager");
        super(C6723jeb.c.a(), snb.f());
        this.f = kfb;
        this.g = snb;
        this.d = ssb.a((PXa<? extends T>) new C5652bfb<Object>(this));
        this.e = new Cqb(ssb.a((PXa<? extends T>) new C5720cfb<Object>(this)));
    }

    public <R, D> R a(C5332Tcb<R, D> tcb, D d2) {
        C7471uYa.b(tcb, "visitor");
        return tcb.a((C7132pdb) this, d2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7132pdb)) {
            obj = null;
        }
        C7132pdb pdb = (C7132pdb) obj;
        if (pdb == null || !C7471uYa.a((Object) q(), (Object) pdb.q()) || !C7471uYa.a((Object) sa(), (Object) pdb.sa())) {
            return false;
        }
        return true;
    }

    public Eqb ha() {
        return this.e;
    }

    public int hashCode() {
        return (sa().hashCode() * 31) + q().hashCode();
    }

    public boolean isEmpty() {
        return a.a(this);
    }

    public C7349snb q() {
        return this.g;
    }

    public List<C6790kdb> ra() {
        return (List) Rsb.a(this.d, (Object) this, c[0]);
    }

    public C7132pdb e() {
        if (q().b()) {
            return null;
        }
        C6792kfb sa = sa();
        C7349snb c2 = q().c();
        C7471uYa.a((Object) c2, "fqName.parent()");
        return sa.a(c2);
    }

    public C6792kfb sa() {
        return this.f;
    }
}
