package defpackage;

import java.util.Set;

/* renamed from: eR reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_RepostStatuses */
final class C2982eR extends C2057GR {
    private final Set<C3508cda> a;

    C2982eR(Set<C3508cda> set) {
        if (set != null) {
            this.a = set;
            return;
        }
        throw new NullPointerException("Null reposts");
    }

    /* access modifiers changed from: protected */
    public Set<C3508cda> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2057GR)) {
            return false;
        }
        return this.a.equals(((C2057GR) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RepostStatuses{reposts=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
