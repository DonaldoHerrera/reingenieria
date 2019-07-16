package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: akb reason: default package and case insensitive filesystem */
/* compiled from: predefinedEnhancementInfo.kt */
final class C5589akb {
    /* access modifiers changed from: private */
    public final Map<String, Pjb> a = new LinkedHashMap();

    /* renamed from: akb$a */
    /* compiled from: predefinedEnhancementInfo.kt */
    public final class a {
        private final String a;
        final /* synthetic */ C5589akb b;

        /* renamed from: akb$a$a reason: collision with other inner class name */
        /* compiled from: predefinedEnhancementInfo.kt */
        public final class C0162a {
            private final List<HVa<String, C6457fkb>> a = new ArrayList();
            private HVa<String, C6457fkb> b = NVa.a("V", null);
            private final String c;
            final /* synthetic */ a d;

            public C0162a(a aVar, String str) {
                C7471uYa.b(str, "functionName");
                this.d = aVar;
                this.c = str;
            }

            public final void a(String str, C6592hjb... hjbArr) {
                C6457fkb fkb;
                C7471uYa.b(str, C1325gg.TYPE);
                C7471uYa.b(hjbArr, "qualifiers");
                List<HVa<String, C6457fkb>> list = this.a;
                if (hjbArr.length == 0) {
                    fkb = null;
                } else {
                    Iterable<CWa> m = C6578hWa.m(hjbArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a(m, 10)), 16));
                    for (CWa cWa : m) {
                        linkedHashMap.put(Integer.valueOf(cWa.c()), (C6592hjb) cWa.d());
                    }
                    fkb = new C6457fkb(linkedHashMap);
                }
                list.add(NVa.a(str, fkb));
            }

            public final void b(String str, C6592hjb... hjbArr) {
                C7471uYa.b(str, C1325gg.TYPE);
                C7471uYa.b(hjbArr, "qualifiers");
                Iterable<CWa> m = C6578hWa.m(hjbArr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a(m, 10)), 16));
                for (CWa cWa : m) {
                    linkedHashMap.put(Integer.valueOf(cWa.c()), (C6592hjb) cWa.d());
                }
                this.b = NVa.a(str, new C6457fkb(linkedHashMap));
            }

            public final void a(C7424tqb tqb) {
                C7471uYa.b(tqb, C1325gg.TYPE);
                this.b = NVa.a(tqb.a(), null);
            }

            public final HVa<String, Pjb> a() {
                Lkb lkb = Lkb.a;
                String a2 = this.d.a();
                String str = this.c;
                List<HVa<String, C6457fkb>> list = this.a;
                ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
                for (HVa c2 : list) {
                    arrayList.add((String) c2.c());
                }
                String a3 = lkb.a(a2, lkb.a(str, arrayList, (String) this.b.c()));
                C6457fkb fkb = (C6457fkb) this.b.d();
                List<HVa<String, C6457fkb>> list2 = this.a;
                ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) list2, 10));
                for (HVa d2 : list2) {
                    arrayList2.add((C6457fkb) d2.d());
                }
                return NVa.a(a3, new Pjb(fkb, arrayList2));
            }
        }

        public a(C5589akb akb, String str) {
            C7471uYa.b(str, "className");
            this.b = akb;
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public final void a(String str, _Xa<? super C0162a, RVa> _xa) {
            C7471uYa.b(str, "name");
            C7471uYa.b(_xa, "block");
            Map a2 = this.b.a;
            C0162a aVar = new C0162a(this, str);
            _xa.invoke(aVar);
            HVa a3 = aVar.a();
            a2.put(a3.c(), a3.d());
        }
    }

    public final Map<String, Pjb> a() {
        return this.a;
    }
}
