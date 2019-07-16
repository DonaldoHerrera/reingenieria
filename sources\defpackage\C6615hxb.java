package defpackage;

/* renamed from: hxb reason: default package and case insensitive filesystem */
/* compiled from: Regex.kt */
public final class C6615hxb {
    private final String a;
    private final C6785kZa b;

    public C6615hxb(String str, C6785kZa kza) {
        C7471uYa.b(str, "value");
        C7471uYa.b(kza, "range");
        this.a = str;
        this.b = kza;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6615hxb) {
                C6615hxb hxb = (C6615hxb) obj;
                if (C7471uYa.a((Object) this.a, (Object) hxb.a)) {
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
        C6785kZa kza = this.b;
        if (kza != null) {
            i = kza.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MatchGroup(value=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
