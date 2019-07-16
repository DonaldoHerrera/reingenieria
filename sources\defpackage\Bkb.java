package defpackage;

import java.util.Arrays;

/* renamed from: Bkb reason: default package */
/* compiled from: KotlinClassFinder.kt */
public interface Bkb {

    /* renamed from: Bkb$a */
    /* compiled from: KotlinClassFinder.kt */
    public static abstract class a {

        /* renamed from: Bkb$a$a reason: collision with other inner class name */
        /* compiled from: KotlinClassFinder.kt */
        public static final class C0138a extends a {
            private final byte[] a;

            public final byte[] b() {
                return this.a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.Bkb.a.C0138a) r2).a) != false) goto L_0x0015;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C0138a) {
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                byte[] bArr = this.a;
                if (bArr != null) {
                    return Arrays.hashCode(bArr);
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("ClassFileContent(content=");
                sb.append(Arrays.toString(this.a));
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: Bkb$a$b */
        /* compiled from: KotlinClassFinder.kt */
        public static final class b extends a {
            private final Dkb a;

            public b(Dkb dkb) {
                C7471uYa.b(dkb, "kotlinJvmBinaryClass");
                super(null);
                this.a = dkb;
            }

            public final Dkb b() {
                return this.a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.Bkb.a.b) r2).a) != false) goto L_0x0015;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Dkb dkb = this.a;
                if (dkb != null) {
                    return dkb.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("KotlinClass(kotlinJvmBinaryClass=");
                sb.append(this.a);
                sb.append(")");
                return sb.toString();
            }
        }

        private a() {
        }

        public final Dkb a() {
            b bVar = (b) (!(this instanceof b) ? null : this);
            if (bVar != null) {
                return bVar.b();
            }
            return null;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    a a(Kib kib);

    a a(C7280rnb rnb);
}
