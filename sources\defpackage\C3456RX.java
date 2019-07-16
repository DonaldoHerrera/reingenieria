package defpackage;

import com.soundcloud.android.image.W;

/* renamed from: RX reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_ApiSelectionItem */
final class C3456RX extends C3444NX {
    private final C4928GKa<C3508cda> a;
    private final C4928GKa<String> b;
    private final C4928GKa<W> c;
    private final C4928GKa<Integer> d;
    private final C4928GKa<String> e;
    private final C4928GKa<String> f;
    private final C4928GKa<String> g;
    private final C4928GKa<String> h;

    C3456RX(C4928GKa<C3508cda> gKa, C4928GKa<String> gKa2, C4928GKa<W> gKa3, C4928GKa<Integer> gKa4, C4928GKa<String> gKa5, C4928GKa<String> gKa6, C4928GKa<String> gKa7, C4928GKa<String> gKa8) {
        if (gKa != null) {
            this.a = gKa;
            if (gKa2 != null) {
                this.b = gKa2;
                if (gKa3 != null) {
                    this.c = gKa3;
                    if (gKa4 != null) {
                        this.d = gKa4;
                        if (gKa5 != null) {
                            this.e = gKa5;
                            if (gKa6 != null) {
                                this.f = gKa6;
                                if (gKa7 != null) {
                                    this.g = gKa7;
                                    if (gKa8 != null) {
                                        this.h = gKa8;
                                        return;
                                    }
                                    throw new NullPointerException("Null webLink");
                                }
                                throw new NullPointerException("Null appLink");
                            }
                            throw new NullPointerException("Null shortSubtitle");
                        }
                        throw new NullPointerException("Null shortTitle");
                    }
                    throw new NullPointerException("Null count");
                }
                throw new NullPointerException("Null artworkStyle");
            }
            throw new NullPointerException("Null artworkUrlTemplate");
        }
        throw new NullPointerException("Null urn");
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> a() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<W> b() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> c() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<Integer> d() {
        return this.d;
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
        if (!(obj instanceof C3444NX)) {
            return false;
        }
        C3444NX nx = (C3444NX) obj;
        if (!this.a.equals(nx.g()) || !this.b.equals(nx.c()) || !this.c.equals(nx.b()) || !this.d.equals(nx.d()) || !this.e.equals(nx.f()) || !this.f.equals(nx.e()) || !this.g.equals(nx.a()) || !this.h.equals(nx.h())) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> f() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<C3508cda> g() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> h() {
        return this.h;
    }

    public int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiSelectionItem{urn=");
        sb.append(this.a);
        sb.append(", artworkUrlTemplate=");
        sb.append(this.b);
        sb.append(", artworkStyle=");
        sb.append(this.c);
        sb.append(", count=");
        sb.append(this.d);
        sb.append(", shortTitle=");
        sb.append(this.e);
        sb.append(", shortSubtitle=");
        sb.append(this.f);
        sb.append(", appLink=");
        sb.append(this.g);
        sb.append(", webLink=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}
