package defpackage;

import java.util.List;

/* renamed from: Kgb reason: default package */
/* compiled from: SignaturePropagator */
public interface Kgb {
    public static final Kgb a = new Jgb();

    /* renamed from: Kgb$a */
    /* compiled from: SignaturePropagator */
    public static class a {
        private final C7706xtb a;
        private final C7706xtb b;
        private final List<C5061Kdb> c;
        private final List<C4905Fdb> d;
        private final List<String> e;
        private final boolean f;

        public a(C7706xtb xtb, C7706xtb xtb2, List<C5061Kdb> list, List<C4905Fdb> list2, List<String> list3, boolean z) {
            if (xtb == null) {
                a(0);
                throw null;
            } else if (list == null) {
                a(1);
                throw null;
            } else if (list2 == null) {
                a(2);
                throw null;
            } else if (list3 != null) {
                this.a = xtb;
                this.b = xtb2;
                this.c = list;
                this.d = list2;
                this.e = list3;
                this.f = z;
            } else {
                a(3);
                throw null;
            }
        }

        private static /* synthetic */ void a(int i) {
            String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = str2;
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = str2;
            } else {
                objArr[1] = "getErrors";
            }
            if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 4 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public List<String> a() {
            List<String> list = this.e;
            if (list != null) {
                return list;
            }
            a(7);
            throw null;
        }

        public C7706xtb b() {
            return this.b;
        }

        public C7706xtb c() {
            C7706xtb xtb = this.a;
            if (xtb != null) {
                return xtb;
            }
            a(4);
            throw null;
        }

        public List<C4905Fdb> d() {
            List<C4905Fdb> list = this.d;
            if (list != null) {
                return list;
            }
            a(6);
            throw null;
        }

        public List<C5061Kdb> e() {
            List<C5061Kdb> list = this.c;
            if (list != null) {
                return list;
            }
            a(5);
            throw null;
        }

        public boolean f() {
            return this.f;
        }
    }

    a a(Uib uib, C5029Jcb jcb, C7706xtb xtb, C7706xtb xtb2, List<C5061Kdb> list, List<C4905Fdb> list2);

    void a(C4935Gcb gcb, List<String> list);
}
