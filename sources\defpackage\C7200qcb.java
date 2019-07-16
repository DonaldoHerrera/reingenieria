package defpackage;

import java.util.List;

/* renamed from: qcb reason: default package and case insensitive filesystem */
/* compiled from: JvmBuiltIns.kt */
public final class C7200qcb extends C5301Sbb {
    static final /* synthetic */ DZa[] o = {HYa.a((DYa) new EYa(HYa.a(C7200qcb.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSettings;"))};
    /* access modifiers changed from: private */
    public C6450fdb p;
    /* access modifiers changed from: private */
    public boolean q;
    private final Psb r;

    public /* synthetic */ C7200qcb(Ssb ssb, boolean z, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            z = true;
        }
        this(ssb, z);
    }

    public final C7269rcb F() {
        return (C7269rcb) Rsb.a(this.r, (Object) this, o[0]);
    }

    /* access modifiers changed from: protected */
    public C7478ueb c() {
        return F();
    }

    /* access modifiers changed from: protected */
    public C7616web y() {
        return F();
    }

    public C7200qcb(Ssb ssb, boolean z) {
        C7471uYa.b(ssb, "storageManager");
        super(ssb);
        this.q = true;
        this.r = ssb.a((PXa<? extends T>) new C7131pcb<Object>(this, ssb));
        if (z) {
            b();
        }
    }

    public final void a(C6450fdb fdb, boolean z) {
        C7471uYa.b(fdb, "moduleDescriptor");
        boolean z2 = this.p == null;
        if (!TVa.a || z2) {
            this.p = fdb;
            this.q = z;
            return;
        }
        throw new AssertionError("JvmBuiltins repeated initialization");
    }

    /* access modifiers changed from: protected */
    public List<C7547veb> l() {
        Iterable l = super.l();
        C7471uYa.a((Object) l, "super.getClassDescriptorFactories()");
        Ssb A = A();
        C7471uYa.a((Object) A, "storageManager");
        C6792kfb h = h();
        C7471uYa.a((Object) h, "builtInsModule");
        C6857lcb lcb = new C6857lcb(A, h, null, 4, null);
        return C7676xWa.d(l, lcb);
    }
}
