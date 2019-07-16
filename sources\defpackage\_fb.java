package defpackage;

import java.util.Arrays;
import java.util.Set;

/* renamed from: _fb reason: default package */
/* compiled from: JavaClassFinder.kt */
public interface _fb {

    /* renamed from: _fb$a */
    /* compiled from: JavaClassFinder.kt */
    public static final class a {
        private final C7280rnb a;
        private final byte[] b;
        private final Kib c;

        public a(C7280rnb rnb, byte[] bArr, Kib kib) {
            C7471uYa.b(rnb, "classId");
            this.a = rnb;
            this.b = bArr;
            this.c = kib;
        }

        public final C7280rnb a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
                        if (C7471uYa.a((Object) this.b, (Object) aVar.b)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C7280rnb rnb = this.a;
            int i = 0;
            int hashCode = (rnb != null ? rnb.hashCode() : 0) * 31;
            byte[] bArr = this.b;
            int hashCode2 = (hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
            Kib kib = this.c;
            if (kib != null) {
                i = kib.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Request(classId=");
            sb.append(this.a);
            sb.append(", previouslyFoundClassFileContent=");
            sb.append(Arrays.toString(this.b));
            sb.append(", outerClass=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ a(C7280rnb rnb, byte[] bArr, Kib kib, int i, C7264rYa rya) {
            if ((i & 2) != 0) {
                bArr = null;
            }
            if ((i & 4) != 0) {
                kib = null;
            }
            this(rnb, bArr, kib);
        }
    }

    Kib a(a aVar);

    Xib a(C7349snb snb);

    Set<String> b(C7349snb snb);
}
