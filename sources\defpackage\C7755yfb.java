package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: yfb reason: default package and case insensitive filesystem */
/* compiled from: ValueParameterDescriptorImpl.kt */
public class C7755yfb extends C7824zfb implements C5061Kdb {
    public static final a f = new a(null);
    private final C5061Kdb g;
    private final int h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final C7706xtb l;

    /* renamed from: yfb$a */
    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [Kdb] */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    public C7755yfb(C4904Fcb fcb, C5061Kdb kdb, int i2, C6723jeb jeb, C7694xnb xnb, C7706xtb xtb, boolean z, boolean z2, boolean z3, C7706xtb xtb2, C7822zdb zdb) {
        C4904Fcb fcb2 = fcb;
        C7471uYa.b(fcb, "containingDeclaration");
        C6723jeb jeb2 = jeb;
        C7471uYa.b(jeb, "annotations");
        C7694xnb xnb2 = xnb;
        C7471uYa.b(xnb, "name");
        C7706xtb xtb3 = xtb;
        C7471uYa.b(xtb, "outType");
        C7822zdb zdb2 = zdb;
        C7471uYa.b(zdb2, "source");
        super(fcb2, jeb2, xnb2, xtb3, zdb2);
        this.h = i2;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = xtb2;
        this.g = kdb != 0 ? kdb : this;
    }

    public boolean V() {
        return false;
    }

    public Void Y() {
        return null;
    }

    public boolean ba() {
        return this.k;
    }

    public boolean ca() {
        return this.j;
    }

    public C5583aeb d() {
        C5583aeb aeb = _db.f;
        C7471uYa.a((Object) aeb, "Visibilities.LOCAL");
        return aeb;
    }

    public C7706xtb da() {
        return this.l;
    }

    public boolean ea() {
        if (this.i) {
            C4904Fcb e = e();
            if (e != null) {
                defpackage.C4935Gcb.a g2 = ((C4935Gcb) e).g();
                C7471uYa.a((Object) g2, "(containingDeclaration a…bleMemberDescriptor).kind");
                if (g2.a()) {
                    return true;
                }
            } else {
                throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            }
        }
        return false;
    }

    public int getIndex() {
        return this.h;
    }

    public Collection<C5061Kdb> j() {
        Collection<C4904Fcb> j2 = e().j();
        C7471uYa.a((Object) j2, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) j2, 10));
        for (C4904Fcb fcb : j2) {
            C7471uYa.a((Object) fcb, "it");
            arrayList.add((C5061Kdb) fcb.f().get(getIndex()));
        }
        return arrayList;
    }

    public C5061Kdb a(_tb _tb) {
        C7471uYa.b(_tb, "substitutor");
        if (_tb.b()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    public C4904Fcb e() {
        C5272Rcb e = super.e();
        if (e != null) {
            return (C4904Fcb) e;
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
    }

    public <R, D> R a(C5332Tcb<R, D> tcb, D d) {
        C7471uYa.b(tcb, "visitor");
        return tcb.a((C5061Kdb) this, d);
    }

    public C5061Kdb getOriginal() {
        C5061Kdb kdb = this.g;
        return kdb == this ? this : kdb.getOriginal();
    }

    public C5061Kdb a(C4904Fcb fcb, C7694xnb xnb, int i2) {
        C4904Fcb fcb2 = fcb;
        C7471uYa.b(fcb, "newOwner");
        C7694xnb xnb2 = xnb;
        C7471uYa.b(xnb, "newName");
        C6723jeb annotations = getAnnotations();
        C7471uYa.a((Object) annotations, "annotations");
        C7706xtb type = getType();
        C7471uYa.a((Object) type, C1325gg.TYPE);
        boolean ea = ea();
        boolean ca = ca();
        boolean ba = ba();
        C7706xtb da = da();
        C7822zdb zdb = C7822zdb.a;
        C7471uYa.a((Object) zdb, "SourceElement.NO_SOURCE");
        C7755yfb yfb = new C7755yfb(fcb2, null, i2, annotations, xnb2, type, ea, ca, ba, da, zdb);
        return yfb;
    }
}
