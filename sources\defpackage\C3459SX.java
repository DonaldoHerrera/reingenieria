package defpackage;

import java.util.List;

/* renamed from: SX reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_ApiSingleContentSelectionCard */
final class C3459SX extends C3447OX {
    private final C3508cda a;
    private final C4928GKa<C3508cda> b;
    private final C4928GKa<String> c;
    private final C4928GKa<String> d;
    private final C4928GKa<String> e;
    private final C4928GKa<String> f;
    private final C4928GKa<String> g;
    private final C3444NX h;
    private final List<String> i;

    C3459SX(C3508cda cda, C4928GKa<C3508cda> gKa, C4928GKa<String> gKa2, C4928GKa<String> gKa3, C4928GKa<String> gKa4, C4928GKa<String> gKa5, C4928GKa<String> gKa6, C3444NX nx, List<String> list) {
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
                            if (gKa5 != null) {
                                this.f = gKa5;
                                if (gKa6 != null) {
                                    this.g = gKa6;
                                    if (nx != null) {
                                        this.h = nx;
                                        if (list != null) {
                                            this.i = list;
                                            return;
                                        }
                                        throw new NullPointerException("Null socialProofAvatarUrlTemplates");
                                    }
                                    throw new NullPointerException("Null selectionItem");
                                }
                                throw new NullPointerException("Null trackingFeatureName");
                            }
                            throw new NullPointerException("Null socialProof");
                        }
                        throw new NullPointerException("Null description");
                    }
                    throw new NullPointerException("Null title");
                }
                throw new NullPointerException("Null style");
            }
            throw new NullPointerException("Null queryUrn");
        }
        throw new NullPointerException("Null selectionUrn");
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> a() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<C3508cda> b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public C3444NX c() {
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    public C3508cda d() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3447OX)) {
            return false;
        }
        C3447OX ox = (C3447OX) obj;
        if (!this.a.equals(ox.d()) || !this.b.equals(ox.b()) || !this.c.equals(ox.g()) || !this.d.equals(ox.h()) || !this.e.equals(ox.a()) || !this.f.equals(ox.e()) || !this.g.equals(ox.i()) || !this.h.equals(ox.c()) || !this.i.equals(ox.f())) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public List<String> f() {
        return this.i;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> g() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> h() {
        return this.d;
    }

    public int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> i() {
        return this.g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiSingleContentSelectionCard{selectionUrn=");
        sb.append(this.a);
        sb.append(", queryUrn=");
        sb.append(this.b);
        sb.append(", style=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", socialProof=");
        sb.append(this.f);
        sb.append(", trackingFeatureName=");
        sb.append(this.g);
        sb.append(", selectionItem=");
        sb.append(this.h);
        sb.append(", socialProofAvatarUrlTemplates=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
