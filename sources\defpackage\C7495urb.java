package defpackage;

import defpackage.Bmb;

/* renamed from: urb reason: default package and case insensitive filesystem */
/* compiled from: IncompatibleVersionErrorData.kt */
public final class C7495urb<T extends Bmb> {
    private final T a;
    private final T b;
    private final String c;
    private final C7280rnb d;

    public C7495urb(T t, T t2, String str, C7280rnb rnb) {
        C7471uYa.b(t, "actualVersion");
        C7471uYa.b(t2, "expectedVersion");
        C7471uYa.b(str, "filePath");
        C7471uYa.b(rnb, "classId");
        this.a = t;
        this.b = t2;
        this.c = str;
        this.d = rnb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x0033;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7495urb) {
                C7495urb urb = (C7495urb) obj;
                if (C7471uYa.a((Object) this.a, (Object) urb.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) urb.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) urb.c)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        T t2 = this.b;
        int hashCode2 = (hashCode + (t2 != null ? t2.hashCode() : 0)) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C7280rnb rnb = this.d;
        if (rnb != null) {
            i = rnb.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.a);
        sb.append(", expectedVersion=");
        sb.append(this.b);
        sb.append(", filePath=");
        sb.append(this.c);
        sb.append(", classId=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
