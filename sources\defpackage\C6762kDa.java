package defpackage;

/* renamed from: kDa reason: default package and case insensitive filesystem */
/* compiled from: MediaStreamsRepository.kt */
public final class C6762kDa {
    private final C3508cda a;
    private final String b;
    private final String c;
    private final String d;

    public C6762kDa(C3508cda cda, String str, String str2, String str3) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(str, "preset");
        C7471uYa.b(str2, "quality");
        C7471uYa.b(str3, "mimeType");
        this.a = cda;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final C3508cda d() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x0033;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6762kDa) {
                C6762kDa kda = (C6762kDa) obj;
                if (C7471uYa.a((Object) this.a, (Object) kda.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) kda.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) kda.c)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DownloadedMediaStreamsEntry(urn=");
        sb.append(this.a);
        sb.append(", preset=");
        sb.append(this.b);
        sb.append(", quality=");
        sb.append(this.c);
        sb.append(", mimeType=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
