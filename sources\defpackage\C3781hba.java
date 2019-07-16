package defpackage;

/* renamed from: hba reason: default package and case insensitive filesystem */
/* compiled from: ExoPlayerConfiguration.kt */
public final class C3781hba {
    private final String a;
    private final String b;

    public C3781hba(String str, String str2) {
        C7471uYa.b(str, "exoVersion");
        C7471uYa.b(str2, "userAgent");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3781hba) {
                C3781hba hba = (C3781hba) obj;
                if (C7471uYa.a((Object) this.a, (Object) hba.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExoPlayerConfiguration(exoVersion=");
        sb.append(this.a);
        sb.append(", userAgent=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
