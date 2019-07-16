package defpackage;

import java.util.ArrayList;

/* renamed from: rob reason: default package and case insensitive filesystem */
/* compiled from: ClassifierNamePolicy.kt */
public interface C7282rob {

    /* renamed from: rob$a */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class a implements C7282rob {
        public static final a a = new a();

        private a() {
        }

        public String a(C5122Mcb mcb, Cob cob) {
            C7471uYa.b(mcb, "classifier");
            C7471uYa.b(cob, "renderer");
            if (mcb instanceof C4905Fdb) {
                C7694xnb name = ((C4905Fdb) mcb).getName();
                C7471uYa.a((Object) name, "classifier.name");
                return cob.a(name, false);
            }
            C7487unb e = C6531gpb.e(mcb);
            C7471uYa.a((Object) e, "DescriptorUtils.getFqName(classifier)");
            return cob.a(e);
        }
    }

    /* renamed from: rob$b */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class b implements C7282rob {
        public static final b a = new b();

        private b() {
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=Mcb, code=Rcb, for r2v0, types: [Rcb, java.lang.Object, Mcb] */
        public String a(C5272Rcb rcb, Cob cob) {
            C7471uYa.b(rcb, "classifier");
            C7471uYa.b(cob, "renderer");
            if (rcb instanceof C4905Fdb) {
                C7694xnb name = ((C4905Fdb) rcb).getName();
                C7471uYa.a((Object) name, "classifier.name");
                return cob.a(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(rcb.getName());
                rcb = rcb.e();
            } while (rcb instanceof C5029Jcb);
            return _ob.a(C7400tWa.d(arrayList));
        }
    }

    /* renamed from: rob$c */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class c implements C7282rob {
        public static final c a = new c();

        private c() {
        }

        public String a(C5122Mcb mcb, Cob cob) {
            C7471uYa.b(mcb, "classifier");
            C7471uYa.b(cob, "renderer");
            return a(mcb);
        }

        private final String a(C5122Mcb mcb) {
            C7694xnb name = mcb.getName();
            C7471uYa.a((Object) name, "descriptor.name");
            String a2 = _ob.a(name);
            if (mcb instanceof C4905Fdb) {
                return a2;
            }
            C5272Rcb e = mcb.e();
            C7471uYa.a((Object) e, "descriptor.containingDeclaration");
            String a3 = a(e);
            if (a3 != null && (!C7471uYa.a((Object) a3, (Object) ""))) {
                StringBuilder sb = new StringBuilder();
                sb.append(a3);
                sb.append(".");
                sb.append(a2);
                a2 = sb.toString();
            }
            return a2;
        }

        private final String a(C5272Rcb rcb) {
            if (rcb instanceof C5029Jcb) {
                return a((C5122Mcb) rcb);
            }
            if (!(rcb instanceof C6790kdb)) {
                return null;
            }
            C7487unb g = ((C6790kdb) rcb).q().g();
            C7471uYa.a((Object) g, "descriptor.fqName.toUnsafe()");
            return _ob.a(g);
        }
    }

    String a(C5122Mcb mcb, Cob cob);
}
