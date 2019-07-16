package defpackage;

/* renamed from: QX reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_ApiMultipleContentSelectionCard */
final class C3453QX extends C3438LX {
    private final C3508cda a;
    private final C4928GKa<String> b;
    private final C4928GKa<String> c;
    private final C4928GKa<String> d;
    private final C4928GKa<String> e;
    private final Pca<C3444NX> f;

    C3453QX(C3508cda cda, C4928GKa<String> gKa, C4928GKa<String> gKa2, C4928GKa<String> gKa3, C4928GKa<String> gKa4, Pca<C3444NX> pca) {
        if (cda != null) {
            this.a = cda;
            if (gKa != null) {
                this.b = gKa;
                if (gKa2 != null) {
                    this.c = gKa2;
                    if (gKa3 != null) {
                        this.d = gKa3;
                        if (gKa4 != null) {
                            this.e = gKa4;
                            if (pca != null) {
                                this.f = pca;
                                return;
                            }
                            throw new NullPointerException("Null selectionItems");
                        }
                        throw new NullPointerException("Null trackingFeatureName");
                    }
                    throw new NullPointerException("Null description");
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null style");
        }
        throw new NullPointerException("Null selectionUrn");
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> a() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public Pca<C3444NX> b() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public C3508cda c() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> d() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3438LX)) {
            return false;
        }
        C3438LX lx = (C3438LX) obj;
        if (!this.a.equals(lx.c()) || !this.b.equals(lx.d()) || !this.c.equals(lx.e()) || !this.d.equals(lx.a()) || !this.e.equals(lx.f()) || !this.f.equals(lx.b())) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> f() {
        return this.e;
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiMultipleContentSelectionCard{selectionUrn=");
        sb.append(this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", trackingFeatureName=");
        sb.append(this.e);
        sb.append(", selectionItems=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
