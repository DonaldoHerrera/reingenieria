package defpackage;

/* renamed from: wva reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_SearchSuggestionItem */
final class C7640wva extends C7366swa {
    private final C3508cda a;
    private final C4928GKa<String> b;
    private final b c;
    private final String d;
    private final C4928GKa<C7642wwa> e;
    private final String f;
    private final boolean g;

    C7640wva(C3508cda cda, C4928GKa<String> gKa, b bVar, String str, C4928GKa<C7642wwa> gKa2, String str2, boolean z) {
        if (cda != null) {
            this.a = cda;
            if (gKa != null) {
                this.b = gKa;
                if (bVar != null) {
                    this.c = bVar;
                    if (str != null) {
                        this.d = str;
                        if (gKa2 != null) {
                            this.e = gKa2;
                            if (str2 != null) {
                                this.f = str2;
                                this.g = z;
                                return;
                            }
                            throw new NullPointerException("Null displayedText");
                        }
                        throw new NullPointerException("Null suggestionHighlight");
                    }
                    throw new NullPointerException("Null userQuery");
                }
                throw new NullPointerException("Null kind");
            }
            throw new NullPointerException("Null getImageUrlTemplate");
        }
        throw new NullPointerException("Null getUrn");
    }

    public C3508cda a() {
        return this.a;
    }

    public C4928GKa<String> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7366swa)) {
            return false;
        }
        C7366swa swa = (C7366swa) obj;
        if (!this.a.equals(swa.a()) || !this.b.equals(swa.b()) || !this.c.equals(swa.f()) || !this.d.equals(swa.g()) || !this.e.equals(swa.j()) || !this.f.equals(swa.h()) || this.g != swa.i()) {
            z = false;
        }
        return z;
    }

    public b f() {
        return this.c;
    }

    public String g() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public String h() {
        return this.f;
    }

    public int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (this.g ? 1231 : 1237);
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<C7642wwa> j() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchSuggestionItem{getUrn=");
        sb.append(this.a);
        sb.append(", getImageUrlTemplate=");
        sb.append(this.b);
        sb.append(", kind=");
        sb.append(this.c);
        sb.append(", userQuery=");
        sb.append(this.d);
        sb.append(", suggestionHighlight=");
        sb.append(this.e);
        sb.append(", displayedText=");
        sb.append(this.f);
        sb.append(", isPro=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
