package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: kfb reason: default package and case insensitive filesystem */
/* compiled from: ModuleDescriptorImpl.kt */
public final class C6792kfb extends Peb implements C6450fdb {
    static final /* synthetic */ DZa[] c = {HYa.a((DYa) new EYa(HYa.a(C6792kfb.class), "packageFragmentProviderForWholeModuleWithDependencies", "getPackageFragmentProviderForWholeModuleWithDependencies()Lorg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider;"))};
    private final Map<a<? extends Object>, Object> d;
    /* access modifiers changed from: private */
    public C6520gfb e;
    /* access modifiers changed from: private */
    public C6858ldb f;
    private boolean g;
    private final Msb<C7349snb, C7132pdb> h;
    private final C7744yVa i;
    /* access modifiers changed from: private */
    public final Ssb j;
    private final C5301Sbb k;
    private final C7694xnb l;

    public C6792kfb(C7694xnb xnb, Ssb ssb, C5301Sbb sbb, C6803kpb kpb) {
        this(xnb, ssb, sbb, kpb, null, null, 48, null);
    }

    public /* synthetic */ C6792kfb(C7694xnb xnb, Ssb ssb, C5301Sbb sbb, C6803kpb kpb, Map map, C7694xnb xnb2, int i2, C7264rYa rya) {
        this(xnb, ssb, sbb, (i2 & 8) != 0 ? null : kpb, (i2 & 16) != 0 ? LWa.a() : map, (i2 & 32) != 0 ? null : xnb2);
    }

    /* access modifiers changed from: private */
    public final String xa() {
        String xnb = getName().toString();
        C7471uYa.a((Object) xnb, "name.toString()");
        return xnb;
    }

    private final Oeb ya() {
        C7744yVa yva = this.i;
        DZa dZa = c[0];
        return (Oeb) yva.getValue();
    }

    /* access modifiers changed from: private */
    public final boolean za() {
        return this.f != null;
    }

    public C5301Sbb E() {
        return this.k;
    }

    public <R, D> R a(C5332Tcb<R, D> tcb, D d2) {
        C7471uYa.b(tcb, "visitor");
        return b.a(this, tcb, d2);
    }

    public void ta() {
        if (!wa()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Accessing invalid module descriptor ");
            sb.append(this);
            throw new C5650bdb(sb.toString());
        }
    }

    public List<C6450fdb> ua() {
        C6520gfb gfb = this.e;
        if (gfb != null) {
            return gfb.b();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Dependencies of module ");
        sb.append(xa());
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    public final C6858ldb va() {
        ta();
        return ya();
    }

    public boolean wa() {
        return this.g;
    }

    public C5272Rcb e() {
        return b.a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0035, code lost:
        if (r2 != null) goto L_0x003c;
     */
    public C6792kfb(C7694xnb xnb, Ssb ssb, C5301Sbb sbb, C6803kpb kpb, Map<a<?>, ? extends Object> map, C7694xnb xnb2) {
        Map map2;
        C7471uYa.b(xnb, "moduleName");
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(sbb, "builtIns");
        C7471uYa.b(map, "capabilities");
        super(C6723jeb.c.a(), xnb);
        this.j = ssb;
        this.k = sbb;
        this.l = xnb2;
        if (xnb.c()) {
            if (kpb != null) {
                map2 = KWa.a(NVa.a(C6803kpb.a, kpb));
            }
            map2 = LWa.a();
            this.d = LWa.a(map, map2);
            this.g = true;
            this.h = this.j.b((_Xa<? super K, ? extends V>) new C6724jfb<Object,Object>(this));
            this.i = BVa.a(new C6656ifb(this));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Module name must be special: ");
        sb.append(xnb);
        throw new IllegalArgumentException(sb.toString());
    }

    public C7132pdb a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        ta();
        return (C7132pdb) this.h.invoke(snb);
    }

    public Collection<C7349snb> a(C7349snb snb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(snb, "fqName");
        C7471uYa.b(_xa, "nameFilter");
        ta();
        return va().a(snb, _xa);
    }

    public final void a(C6520gfb gfb) {
        C7471uYa.b(gfb, "dependencies");
        boolean z = this.e == null;
        if (!TVa.a || z) {
            this.e = gfb;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Dependencies of ");
        sb.append(xa());
        sb.append(" were already set");
        throw new AssertionError(sb.toString());
    }

    public final void a(C6792kfb... kfbArr) {
        C7471uYa.b(kfbArr, "descriptors");
        a(C6578hWa.j(kfbArr));
    }

    public final void a(List<C6792kfb> list) {
        C7471uYa.b(list, "descriptors");
        a(list, SWa.a());
    }

    public final void a(List<C6792kfb> list, Set<C6792kfb> set) {
        C7471uYa.b(list, "descriptors");
        C7471uYa.b(set, "friends");
        a((C6520gfb) new C6588hfb(list, set, C6918mWa.a()));
    }

    public boolean a(C6450fdb fdb) {
        C7471uYa.b(fdb, "targetModule");
        if (!C7471uYa.a((Object) this, (Object) fdb)) {
            C6520gfb gfb = this.e;
            if (gfb == null) {
                C7471uYa.a();
                throw null;
            } else if (!C7676xWa.a((Iterable<? extends T>) gfb.c(), fdb) && !ua().contains(fdb)) {
                return false;
            }
        }
        return true;
    }

    public final void a(C6858ldb ldb) {
        C7471uYa.b(ldb, "providerForModuleContent");
        boolean z = !za();
        if (!TVa.a || z) {
            this.f = ldb;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attempt to initialize module ");
        sb.append(xa());
        sb.append(" twice");
        throw new AssertionError(sb.toString());
    }
}
