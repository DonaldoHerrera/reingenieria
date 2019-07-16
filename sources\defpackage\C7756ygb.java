package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ygb reason: default package and case insensitive filesystem */
/* compiled from: JavaAnnotationMapper.kt */
public final class C7756ygb {
    private static final Map<String, EnumSet<C7409teb>> a = LWa.b((HVa<? extends K, ? extends V>[]) new HVa[]{NVa.a("PACKAGE", EnumSet.noneOf(C7409teb.class)), NVa.a("TYPE", EnumSet.of(C7409teb.CLASS, C7409teb.FILE)), NVa.a("ANNOTATION_TYPE", EnumSet.of(C7409teb.ANNOTATION_CLASS)), NVa.a("TYPE_PARAMETER", EnumSet.of(C7409teb.TYPE_PARAMETER)), NVa.a("FIELD", EnumSet.of(C7409teb.FIELD)), NVa.a("LOCAL_VARIABLE", EnumSet.of(C7409teb.LOCAL_VARIABLE)), NVa.a("PARAMETER", EnumSet.of(C7409teb.VALUE_PARAMETER)), NVa.a("CONSTRUCTOR", EnumSet.of(C7409teb.CONSTRUCTOR)), NVa.a("METHOD", EnumSet.of(C7409teb.FUNCTION, C7409teb.PROPERTY_GETTER, C7409teb.PROPERTY_SETTER)), NVa.a("TYPE_USE", EnumSet.of(C7409teb.TYPE))});
    private static final Map<String, C7340seb> b = LWa.b((HVa<? extends K, ? extends V>[]) new HVa[]{NVa.a("RUNTIME", C7340seb.RUNTIME), NVa.a("CLASS", C7340seb.BINARY), NVa.a("SOURCE", C7340seb.SOURCE)});
    public static final C7756ygb c = new C7756ygb();

    private C7756ygb() {
    }

    public final Set<C7409teb> a(String str) {
        EnumSet enumSet = (EnumSet) a.get(str);
        return enumSet != null ? enumSet : SWa.a();
    }

    public final Npb<?> a(Fib fib) {
        if (!(fib instanceof Qib)) {
            fib = null;
        }
        Qib qib = (Qib) fib;
        if (qib == null) {
            return null;
        }
        Map<String, C7340seb> map = b;
        C7694xnb d = qib.d();
        C7340seb seb = (C7340seb) map.get(d != null ? d.a() : null);
        if (seb == null) {
            return null;
        }
        C7280rnb a2 = C7280rnb.a(C5301Sbb.h.F);
        C7471uYa.a((Object) a2, "ClassId.topLevel(KotlinB…AMES.annotationRetention)");
        C7694xnb b2 = C7694xnb.b(seb.name());
        C7471uYa.a((Object) b2, "Name.identifier(retention.name)");
        return new Spb(a2, b2);
    }

    public final Npb<?> a(List<? extends Fib> list) {
        C7471uYa.b(list, "arguments");
        ArrayList<Qib> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (next instanceof Qib) {
                arrayList.add(next);
            }
        }
        ArrayList<C7409teb> arrayList2 = new ArrayList<>();
        for (Qib qib : arrayList) {
            C7756ygb ygb = c;
            C7694xnb d = qib.d();
            C7331sWa.a((Collection<? super T>) arrayList2, (Iterable<? extends T>) ygb.a(d != null ? d.a() : null));
        }
        ArrayList arrayList3 = new ArrayList(C6986nWa.a((Iterable<? extends T>) arrayList2, 10));
        for (C7409teb teb : arrayList2) {
            C7280rnb a2 = C7280rnb.a(C5301Sbb.h.E);
            C7471uYa.a((Object) a2, "ClassId.topLevel(KotlinB…Q_NAMES.annotationTarget)");
            C7694xnb b2 = C7694xnb.b(teb.name());
            C7471uYa.a((Object) b2, "Name.identifier(kotlinTarget.name)");
            arrayList3.add(new Spb(a2, b2));
        }
        return new Ipb(arrayList3, C7687xgb.a);
    }
}
