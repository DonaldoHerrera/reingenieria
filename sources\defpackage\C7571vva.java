package defpackage;

/* renamed from: vva reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_DatabaseSearchSuggestion */
final class C7571vva extends C4882Eva {
    private final C3508cda a;
    private final String b;
    private final C4928GKa<C7642wwa> c;
    private final boolean d;
    private final C4928GKa<String> e;
    private final boolean f;
    private final a g;

    C7571vva(C3508cda cda, String str, C4928GKa<C7642wwa> gKa, boolean z, C4928GKa<String> gKa2, boolean z2, a aVar) {
        if (cda != null) {
            this.a = cda;
            if (str != null) {
                this.b = str;
                if (gKa != null) {
                    this.c = gKa;
                    this.d = z;
                    if (gKa2 != null) {
                        this.e = gKa2;
                        this.f = z2;
                        if (aVar != null) {
                            this.g = aVar;
                            return;
                        }
                        throw new NullPointerException("Null kind");
                    }
                    throw new NullPointerException("Null getImageUrlTemplate");
                }
                throw new NullPointerException("Null getHighlights");
            }
            throw new NullPointerException("Null getQuery");
        }
        throw new NullPointerException("Null getUrn");
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<C7642wwa> a() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> b() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public String c() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public C3508cda d() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4882Eva)) {
            return false;
        }
        C4882Eva eva = (C4882Eva) obj;
        if (!this.a.equals(eva.d()) || !this.b.equals(eva.c()) || !this.c.equals(eva.a()) || this.d != eva.f() || !this.e.equals(eva.b()) || this.f != eva.e() || !this.g.equals(eva.g())) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        return this.d;
    }

    public a g() {
        return this.g;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.g.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DatabaseSearchSuggestion{getUrn=");
        sb.append(this.a);
        sb.append(", getQuery=");
        sb.append(this.b);
        sb.append(", getHighlights=");
        sb.append(this.c);
        sb.append(", isRemote=");
        sb.append(this.d);
        sb.append(", getImageUrlTemplate=");
        sb.append(this.e);
        sb.append(", isPro=");
        sb.append(this.f);
        sb.append(", kind=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
