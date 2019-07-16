package defpackage;

/* renamed from: Cob reason: default package */
/* compiled from: DescriptorRenderer.kt */
public abstract class Cob {
    public static final Cob a = j.a((_Xa<? super Pob, RVa>) C7489uob.a);
    public static final Cob b = j.a((_Xa<? super Pob, RVa>) C7351sob.a);
    public static final Cob c = j.a((_Xa<? super Pob, RVa>) C7420tob.a);
    public static final Cob d = j.a((_Xa<? super Pob, RVa>) C7558vob.a);
    public static final Cob e = j.a((_Xa<? super Pob, RVa>) C7834zob.a);
    public static final Cob f = j.a((_Xa<? super Pob, RVa>) C7696xob.a);
    public static final Cob g = j.a((_Xa<? super Pob, RVa>) Aob.a);
    public static final Cob h = j.a((_Xa<? super Pob, RVa>) C7627wob.a);
    public static final Cob i = j.a((_Xa<? super Pob, RVa>) C7765yob.a);
    public static final a j = new a(null);

    /* renamed from: Cob$a */
    /* compiled from: DescriptorRenderer.kt */
    public static final class a {
        private a() {
        }

        public final Cob a(_Xa<? super Pob, RVa> _xa) {
            C7471uYa.b(_xa, "changeOptions");
            Tob tob = new Tob();
            _xa.invoke(tob);
            tob.Y();
            return new Eob(tob);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        public final String a(C5152Ncb ncb) {
            C7471uYa.b(ncb, "classifier");
            if (ncb instanceof C4874Edb) {
                return "typealias";
            }
            if (ncb instanceof C5029Jcb) {
                C5029Jcb jcb = (C5029Jcb) ncb;
                if (jcb.K()) {
                    return "companion object";
                }
                switch (Bob.a[jcb.g().ordinal()]) {
                    case 1:
                        return "class";
                    case 2:
                        return "interface";
                    case 3:
                        return "enum class";
                    case 4:
                        return "object";
                    case 5:
                        return "annotation class";
                    case 6:
                        return "enum entry";
                    default:
                        throw new FVa();
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected classifier: ");
                sb.append(ncb);
                throw new AssertionError(sb.toString());
            }
        }
    }

    /* renamed from: Cob$b */
    /* compiled from: DescriptorRenderer.kt */
    public interface b {

        /* renamed from: Cob$b$a */
        /* compiled from: DescriptorRenderer.kt */
        public static final class a implements b {
            public static final a a = new a();

            private a() {
            }

            public void a(int i, StringBuilder sb) {
                C7471uYa.b(sb, "builder");
                sb.append("(");
            }

            public void a(C5061Kdb kdb, int i, int i2, StringBuilder sb) {
                C7471uYa.b(kdb, "parameter");
                C7471uYa.b(sb, "builder");
            }

            public void b(int i, StringBuilder sb) {
                C7471uYa.b(sb, "builder");
                sb.append(")");
            }

            public void b(C5061Kdb kdb, int i, int i2, StringBuilder sb) {
                C7471uYa.b(kdb, "parameter");
                C7471uYa.b(sb, "builder");
                if (i != i2 - 1) {
                    sb.append(", ");
                }
            }
        }

        void a(int i, StringBuilder sb);

        void a(C5061Kdb kdb, int i, int i2, StringBuilder sb);

        void b(int i, StringBuilder sb);

        void b(C5061Kdb kdb, int i, int i2, StringBuilder sb);
    }

    public final Cob a(_Xa<? super Pob, RVa> _xa) {
        C7471uYa.b(_xa, "changeOptions");
        Tob e2 = ((Eob) this).t().e();
        _xa.invoke(e2);
        e2.Y();
        return new Eob(e2);
    }

    public abstract String a(C5272Rcb rcb);

    public abstract String a(Stb stb);

    public abstract String a(C6315deb deb, C6451feb feb);

    public abstract String a(String str, String str2, C5301Sbb sbb);

    public abstract String a(C7487unb unb);

    public abstract String a(C7694xnb xnb, boolean z);

    public abstract String a(C7706xtb xtb);

    public static /* synthetic */ String a(Cob cob, C6315deb deb, C6451feb feb, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                feb = null;
            }
            return cob.a(deb, feb);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
    }
}
