package defpackage;

/* renamed from: jda reason: default package and case insensitive filesystem */
/* compiled from: CommentWithAuthor.kt */
public final class C3799jda {
    private final C3791ida a;
    private final C3784hea b;

    public C3799jda(C3791ida ida, C3784hea hea) {
        C7471uYa.b(ida, "comment");
        C7471uYa.b(hea, "author");
        this.a = ida;
        this.b = hea;
    }

    public final C3791ida a() {
        return this.a;
    }

    public final C3784hea b() {
        return this.b;
    }

    public final C3791ida c() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3799jda) {
                C3799jda jda = (C3799jda) obj;
                if (C7471uYa.a((Object) this.a, (Object) jda.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3791ida ida = this.a;
        int i = 0;
        int hashCode = (ida != null ? ida.hashCode() : 0) * 31;
        C3784hea hea = this.b;
        if (hea != null) {
            i = hea.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CommentWithAuthor(comment=");
        sb.append(this.a);
        sb.append(", author=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
