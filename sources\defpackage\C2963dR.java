package defpackage;

import java.util.Set;

/* renamed from: dR reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_FollowingStatuses */
final class C2963dR extends C3400zR {
    private final Set<C3508cda> a;

    C2963dR(Set<C3508cda> set) {
        if (set != null) {
            this.a = set;
            return;
        }
        throw new NullPointerException("Null followings");
    }

    public Set<C3508cda> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3400zR)) {
            return false;
        }
        return this.a.equals(((C3400zR) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FollowingStatuses{followings=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
