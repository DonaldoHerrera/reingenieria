package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: gcb reason: default package and case insensitive filesystem */
/* compiled from: FunctionInvokeDescriptor.kt */
public final class C6517gcb extends C7341sfb {
    public static final a D = new a(null);

    /* renamed from: gcb$a */
    /* compiled from: FunctionInvokeDescriptor.kt */
    public static final class a {
        private a() {
        }

        public final C6517gcb a(C5649bcb bcb, boolean z) {
            C7471uYa.b(bcb, "functionClass");
            List B = bcb.B();
            C6517gcb gcb = new C6517gcb(bcb, null, defpackage.C4935Gcb.a.DECLARATION, z, null);
            C7615wdb O = bcb.O();
            List a = C6918mWa.a();
            ArrayList arrayList = new ArrayList();
            for (Object next : B) {
                if (!(((C4905Fdb) next).pa() == C6473fub.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(next);
            }
            Iterable<CWa> u = C7676xWa.u(arrayList);
            ArrayList arrayList2 = new ArrayList(C6986nWa.a(u, 10));
            for (CWa cWa : u) {
                arrayList2.add(C6517gcb.D.a(gcb, cWa.c(), (C4905Fdb) cWa.d()));
            }
            gcb.a((C7615wdb) null, O, a, (List) arrayList2, (C7706xtb) ((C4905Fdb) C7676xWa.h(B)).z(), C6314ddb.ABSTRACT, _db.e);
            gcb.e(true);
            return gcb;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        private final C5061Kdb a(C6517gcb gcb, int i, C4905Fdb fdb) {
            String str;
            String a = fdb.getName().a();
            C7471uYa.a((Object) a, "typeParameter.name.asString()");
            int hashCode = a.hashCode();
            if (hashCode != 69) {
                if (hashCode == 84 && a.equals("T")) {
                    str = "instance";
                    C6723jeb a2 = C6723jeb.c.a();
                    C7694xnb b = C7694xnb.b(str);
                    C7471uYa.a((Object) b, "Name.identifier(name)");
                    Etb z = fdb.z();
                    C7471uYa.a((Object) z, "typeParameter.defaultType");
                    C7822zdb zdb = C7822zdb.a;
                    C7471uYa.a((Object) zdb, "SourceElement.NO_SOURCE");
                    C7755yfb yfb = new C7755yfb(gcb, null, i, a2, b, z, false, false, false, null, zdb);
                    return yfb;
                }
            } else if (a.equals("E")) {
                str = "receiver";
                C6723jeb a22 = C6723jeb.c.a();
                C7694xnb b2 = C7694xnb.b(str);
                C7471uYa.a((Object) b2, "Name.identifier(name)");
                Etb z2 = fdb.z();
                C7471uYa.a((Object) z2, "typeParameter.defaultType");
                C7822zdb zdb2 = C7822zdb.a;
                C7471uYa.a((Object) zdb2, "SourceElement.NO_SOURCE");
                C7755yfb yfb2 = new C7755yfb(gcb, null, i, a22, b2, z2, false, false, false, null, zdb2);
                return yfb2;
            }
            if (a != null) {
                str = a.toLowerCase();
                C7471uYa.a((Object) str, "(this as java.lang.String).toLowerCase()");
                C6723jeb a222 = C6723jeb.c.a();
                C7694xnb b22 = C7694xnb.b(str);
                C7471uYa.a((Object) b22, "Name.identifier(name)");
                Etb z22 = fdb.z();
                C7471uYa.a((Object) z22, "typeParameter.defaultType");
                C7822zdb zdb22 = C7822zdb.a;
                C7471uYa.a((Object) zdb22, "SourceElement.NO_SOURCE");
                C7755yfb yfb22 = new C7755yfb(gcb, null, i, a222, b22, z22, false, false, false, null, zdb22);
                return yfb22;
            }
            throw new OVa("null cannot be cast to non-null type java.lang.String");
        }
    }

    public /* synthetic */ C6517gcb(C5272Rcb rcb, C6517gcb gcb, defpackage.C4935Gcb.a aVar, boolean z, C7264rYa rya) {
        this(rcb, gcb, aVar, z);
    }

    /* access modifiers changed from: protected */
    public C5582adb a(defpackage._eb.a aVar) {
        boolean z;
        C7471uYa.b(aVar, "configuration");
        C6517gcb gcb = (C6517gcb) super.a(aVar);
        if (gcb == null) {
            return null;
        }
        List f = gcb.f();
        String str = "substituted.valueParameters";
        C7471uYa.a((Object) f, str);
        String str2 = "it.type";
        String str3 = "it";
        boolean z2 = true;
        if (!(f instanceof Collection) || !f.isEmpty()) {
            Iterator it = f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C5061Kdb kdb = (C5061Kdb) it.next();
                C7471uYa.a((Object) kdb, str3);
                C7706xtb type = kdb.getType();
                C7471uYa.a((Object) type, str2);
                if (C5181Obb.a(type) != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2) {
            return gcb;
        }
        List<C5061Kdb> f2 = gcb.f();
        C7471uYa.a((Object) f2, str);
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) f2, 10));
        for (C5061Kdb kdb2 : f2) {
            C7471uYa.a((Object) kdb2, str3);
            C7706xtb type2 = kdb2.getType();
            C7471uYa.a((Object) type2, str2);
            arrayList.add(C5181Obb.a(type2));
        }
        return gcb.a((List<C7694xnb>) arrayList);
    }

    public boolean isInline() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean r() {
        return false;
    }

    private C6517gcb(C5272Rcb rcb, C6517gcb gcb, defpackage.C4935Gcb.a aVar, boolean z) {
        super(rcb, gcb, C6723jeb.c.a(), C6407evb.g, aVar, C7822zdb.a);
        h(true);
        i(z);
        d(false);
    }

    /* access modifiers changed from: protected */
    public _eb a(C5272Rcb rcb, C5582adb adb, defpackage.C4935Gcb.a aVar, C7694xnb xnb, C6723jeb jeb, C7822zdb zdb) {
        C7471uYa.b(rcb, "newOwner");
        C7471uYa.b(aVar, "kind");
        C7471uYa.b(jeb, "annotations");
        C7471uYa.b(zdb, "source");
        return new C6517gcb(rcb, (C6517gcb) adb, aVar, s());
    }

    private final C5582adb a(List<C7694xnb> list) {
        boolean z;
        int size = f().size() - list.size();
        boolean z2 = false;
        boolean z3 = size == 0 || size == 1;
        if (!TVa.a || z3) {
            List<C5061Kdb> f = f();
            C7471uYa.a((Object) f, "valueParameters");
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) f, 10));
            for (C5061Kdb kdb : f) {
                C7471uYa.a((Object) kdb, "it");
                C7694xnb name = kdb.getName();
                C7471uYa.a((Object) name, "it.name");
                int index = kdb.getIndex();
                int i = index - size;
                if (i >= 0) {
                    C7694xnb xnb = (C7694xnb) list.get(i);
                    if (xnb != null) {
                        name = xnb;
                    }
                }
                arrayList.add(kdb.a(this, name, index));
            }
            defpackage._eb.a b = b(_tb.a);
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C7694xnb) it.next()) == null) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            b.b(z2);
            b.a((List<C5061Kdb>) arrayList);
            b.a((C4935Gcb) getOriginal());
            C7471uYa.a((Object) b, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
            C5582adb a2 = super.a(b);
            if (a2 != null) {
                return a2;
            }
            C7471uYa.a();
            throw null;
        }
        throw new AssertionError("Assertion failed");
    }
}
