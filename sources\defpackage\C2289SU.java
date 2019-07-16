package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@EVa(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u0000 02\u00020\u0001:\u00010B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0012H\u0012J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001c\u001a\u00020\u0012H\u0017J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001eH\u0016J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0012H\u0016J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0#H\u0012J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u000bH\u0016JF\u0010(\u001a\u0010\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002H+\u0018\u00010)\"\u0004\b\u0000\u0010*\"\u0004\b\u0001\u0010+*\u000e\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002H+0,2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u00020/0.H\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u00061"}, d2 = {"Lcom/soundcloud/android/configuration/experiments/RealExperimentOperations;", "Lcom/soundcloud/android/configuration/experiments/ExperimentOperations;", "experimentStorage", "Lcom/soundcloud/android/configuration/experiments/ExperimentStorage;", "(Lcom/soundcloud/android/configuration/experiments/ExperimentStorage;)V", "activeLayers", "", "", "getActiveLayers", "()[Ljava/lang/String;", "assignment", "Lcom/soundcloud/android/configuration/experiments/Assignment;", "getAssignment", "()Lcom/soundcloud/android/configuration/experiments/Assignment;", "setAssignment", "(Lcom/soundcloud/android/configuration/experiments/Assignment;)V", "cachedExperimentConfigurations", "", "Lcom/soundcloud/android/configuration/experiments/ExperimentConfiguration;", "getCachedExperimentConfigurations", "()Ljava/util/Map;", "serializedActiveVariants", "Lcom/soundcloud/java/optional/Optional;", "getSerializedActiveVariants", "()Lcom/soundcloud/java/optional/Optional;", "clear", "", "determineExperimentVariant", "experiment", "findLayer", "Lcom/soundcloud/android/configuration/experiments/Layer;", "forceExperimentVariation", "layer", "getExperimentVariant", "overwriteLayersWithLocalState", "", "", "layers", "update", "updatedAssignment", "findFirst", "", "T", "V", "", "predicate", "Lkotlin/Function1;", "", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: SU reason: default package and case insensitive filesystem */
/* compiled from: RealExperimentOperations.kt */
public class C2289SU implements C2137KU {
    private static final String[] a = {"android_listening", "ads"};
    public static final a b = new a(null);
    private final Map<C2118JU, String> c = new LinkedHashMap();
    private C2020EU d;
    private final C2156LU e;

    /* renamed from: SU$a */
    /* compiled from: RealExperimentOperations.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final boolean a(C2118JU ju, C2232PU pu) {
            C7471uYa.b(ju, "experimentConfiguration");
            C7471uYa.b(pu, "layer");
            if (!C7471uYa.a((Object) ju.c(), (Object) pu.c()) || ju.a() != pu.a()) {
                return false;
            }
            return true;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C2289SU(C2156LU lu) {
        C7471uYa.b(lu, "experimentStorage");
        this.e = lu;
        C2020EU b2 = this.e.b();
        C7471uYa.a((Object) b2, "experimentStorage.readAssignment()");
        this.d = b2;
    }

    public C4928GKa<String> a() {
        List a2 = a(c().b());
        if (a2.isEmpty()) {
            C4928GKa<String> a3 = C4928GKa.a();
            C7471uYa.a((Object) a3, "Optional.absent()");
            return a3;
        }
        C4928GKa<String> c2 = C4928GKa.c(C7676xWa.a(a2, ",", null, null, 0, null, null, 62, null));
        C7471uYa.a((Object) c2, "Optional.of(variantIds.joinToString(\",\"))");
        return c2;
    }

    public String[] b() {
        return a;
    }

    public C2020EU c() {
        return this.d;
    }

    public void clear() {
        this.e.a();
    }

    public Map<C2118JU, String> d() {
        return this.c;
    }

    private String c(C2118JU ju) {
        C2232PU b2 = b(ju);
        if (b2 == null) {
            return "";
        }
        return b2.e();
    }

    public void b(C2020EU eu) {
        C7471uYa.b(eu, "<set-?>");
        this.d = eu;
    }

    public C2232PU b(C2118JU ju) {
        Object obj;
        C7471uYa.b(ju, "experiment");
        Iterator it = c().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (b.a(ju, (C2232PU) obj)) {
                break;
            }
        }
        return (C2232PU) obj;
    }

    public void a(C2020EU eu) {
        C7471uYa.b(eu, "updatedAssignment");
        b(eu);
        this.e.a(eu);
    }

    public String a(C2118JU ju) {
        C7471uYa.b(ju, "experiment");
        Map d2 = d();
        Object obj = d2.get(ju);
        if (obj == null) {
            obj = c(ju);
            d2.put(ju, obj);
        }
        return (String) obj;
    }

    public void a(C2232PU pu) {
        C7471uYa.b(pu, "layer");
        List b2 = c().b();
        ArrayList arrayList = new ArrayList(b2.size() + 1);
        Iterator it = b2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2232PU pu2 = (C2232PU) it.next();
            if (!C7471uYa.a((Object) pu2.c(), (Object) pu.c())) {
                arrayList.add(pu2);
                break;
            }
        }
        arrayList.add(pu);
        b(new C2020EU(arrayList));
        a(c());
    }

    private <T, V> Entry<T, V> a(Map<T, ? extends V> map, _Xa<? super T, Boolean> _xa) {
        for (Entry<T, V> entry : map.entrySet()) {
            if (((Boolean) _xa.invoke(entry.getKey())).booleanValue()) {
                return entry;
            }
        }
        return null;
    }

    private List<Integer> a(List<C2232PU> list) {
        int i;
        Object obj;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C2232PU pu : list) {
            Entry a2 = a(d(), new C2308TU(pu));
            if (a2 != null) {
                Iterator it = ((C2118JU) a2.getKey()).d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C7471uYa.a((Object) ((C2213OU) obj).b(), (Object) (String) a2.getValue())) {
                        break;
                    }
                }
                C2213OU ou = (C2213OU) obj;
                i = ou != null ? ou.a() : pu.d();
            } else {
                i = pu.d();
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }
}
