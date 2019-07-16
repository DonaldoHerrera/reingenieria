package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: Vgb reason: default package */
/* compiled from: util.kt */
public final class Vgb {
    public static final List<C5061Kdb> a(Collection<Wgb> collection, Collection<? extends C5061Kdb> collection2, C4904Fcb fcb) {
        C7471uYa.b(collection, "newValueParametersTypes");
        C7471uYa.b(collection2, "oldValueParameters");
        C7471uYa.b(fcb, "newOwner");
        boolean z = collection.size() == collection2.size();
        if (!TVa.a || z) {
            List<HVa> e = C7676xWa.e((Iterable) collection, (Iterable) collection2);
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) e, 10));
            for (HVa hVa : e) {
                Wgb wgb = (Wgb) hVa.a();
                C5061Kdb kdb = (C5061Kdb) hVa.b();
                int index = kdb.getIndex();
                C6723jeb annotations = kdb.getAnnotations();
                C7694xnb name = kdb.getName();
                C7471uYa.a((Object) name, "oldParameter.name");
                C7706xtb b = wgb.b();
                boolean a = wgb.a();
                boolean ca = kdb.ca();
                boolean ba = kdb.ba();
                C7706xtb a2 = kdb.da() != null ? C7148pqb.e(fcb).E().a(wgb.b()) : null;
                C7822zdb source = kdb.getSource();
                C7471uYa.a((Object) source, "oldParameter.source");
                C7755yfb yfb = new C7755yfb(fcb, null, index, annotations, name, b, a, ca, ba, a2, source);
                arrayList.add(yfb);
            }
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Different value parameters sizes: Enhanced = ");
        sb.append(collection.size());
        sb.append(", Old = ");
        sb.append(collection2.size());
        throw new AssertionError(sb.toString());
    }

    public static final C6727jib a(C5029Jcb jcb) {
        C7471uYa.b(jcb, "$this$getParentJavaStaticClassScope");
        C5029Jcb b = C7148pqb.b(jcb);
        if (b == null) {
            return null;
        }
        Eqb L = b.L();
        C7471uYa.a((Object) L, "superClassDescriptor.staticScope");
        if (!(L instanceof C6727jib)) {
            return a(b);
        }
        return (C6727jib) L;
    }

    public static final C7355sqb a(C7083osb osb) {
        C7471uYa.b(osb, "$this$getImplClassNameForDeserialized");
        C7014nsb la = osb.la();
        if (!(la instanceof C7691xkb)) {
            la = null;
        }
        C7691xkb xkb = (C7691xkb) la;
        if (xkb != null) {
            return xkb.d();
        }
        return null;
    }

    public static final Mgb a(C5061Kdb kdb) {
        C7471uYa.b(kdb, "$this$getDefaultValueFromAnnotation");
        C6723jeb annotations = kdb.getAnnotations();
        C7349snb snb = C6657igb.n;
        C7471uYa.a((Object) snb, "JvmAnnotationNames.DEFAULT_VALUE_FQ_NAME");
        C6315deb a = annotations.a(snb);
        if (a != null) {
            Npb a2 = C7148pqb.a(a);
            if (a2 != null) {
                if (!(a2 instanceof C5665bqb)) {
                    a2 = null;
                }
                C5665bqb bqb = (C5665bqb) a2;
                if (bqb != null) {
                    String str = (String) bqb.a();
                    if (str != null) {
                        return new Ugb(str);
                    }
                }
            }
        }
        C6723jeb annotations2 = kdb.getAnnotations();
        C7349snb snb2 = C6657igb.o;
        C7471uYa.a((Object) snb2, "JvmAnnotationNames.DEFAULT_NULL_FQ_NAME");
        if (annotations2.b(snb2)) {
            return Tgb.a;
        }
        return null;
    }
}
