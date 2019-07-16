package defpackage;

/* renamed from: xva reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_SuggestionItem_AutocompletionItem */
final class C7709xva extends a {
    private final b a;
    private final String b;
    private final String c;
    private final String d;
    private final C4928GKa<C3508cda> e;

    C7709xva(b bVar, String str, String str2, String str3, C4928GKa<C3508cda> gKa) {
        if (bVar != null) {
            this.a = bVar;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    if (str3 != null) {
                        this.d = str3;
                        if (gKa != null) {
                            this.e = gKa;
                            return;
                        }
                        throw new NullPointerException("Null queryUrn");
                    }
                    throw new NullPointerException("Null output");
                }
                throw new NullPointerException("Null apiQuery");
            }
            throw new NullPointerException("Null userQuery");
        }
        throw new NullPointerException("Null kind");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.a.equals(aVar.f()) || !this.b.equals(aVar.g()) || !this.c.equals(aVar.h()) || !this.d.equals(aVar.i()) || !this.e.equals(aVar.j())) {
            z = false;
        }
        return z;
    }

    public b f() {
        return this.a;
    }

    public String g() {
        return this.b;
    }

    public String h() {
        return this.c;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String i() {
        return this.d;
    }

    public C4928GKa<C3508cda> j() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AutocompletionItem{kind=");
        sb.append(this.a);
        sb.append(", userQuery=");
        sb.append(this.b);
        sb.append(", apiQuery=");
        sb.append(this.c);
        sb.append(", output=");
        sb.append(this.d);
        sb.append(", queryUrn=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
