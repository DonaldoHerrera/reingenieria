package defpackage;

/* renamed from: Yia reason: default package */
/* compiled from: AutoValue_NavigationTarget_LinkNavigationParameters */
final class Yia extends c {
    private final String a;
    private final C4928GKa<String> b;

    Yia(String str, C4928GKa<String> gKa) {
        this.a = str;
        if (gKa != null) {
            this.b = gKa;
            return;
        }
        throw new NullPointerException("Null fallback");
    }

    public C4928GKa<String> a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r4.b.equals(r5.a()) != false) goto L_0x002e;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.a;
        if (str != null ? str.equals(cVar.b()) : cVar.b() == null) {
        }
        z = false;
        return z;
    }

    public int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LinkNavigationParameters{target=");
        sb.append(this.a);
        sb.append(", fallback=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
