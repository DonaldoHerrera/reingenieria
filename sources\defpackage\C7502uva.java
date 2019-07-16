package defpackage;

/* renamed from: uva reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_Autocompletion */
final class C7502uva extends C7778yva {
    private final String a;
    private final String b;

    C7502uva(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null output");
        }
        throw new NullPointerException("Null apiQuery");
    }

    /* access modifiers changed from: 0000 */
    public String a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7778yva)) {
            return false;
        }
        C7778yva yva = (C7778yva) obj;
        if (!this.a.equals(yva.a()) || !this.b.equals(yva.b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autocompletion{apiQuery=");
        sb.append(this.a);
        sb.append(", output=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
