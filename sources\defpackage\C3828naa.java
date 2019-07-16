package defpackage;

import java.util.Map;

/* renamed from: naa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_UserChangedEvent */
final class C3828naa extends C3498bba {
    private final Map<C3508cda, C3784hea> a;

    C3828naa(Map<C3508cda, C3784hea> map) {
        if (map != null) {
            this.a = map;
            return;
        }
        throw new NullPointerException("Null changeMap");
    }

    public Map<C3508cda, C3784hea> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3498bba)) {
            return false;
        }
        return this.a.equals(((C3498bba) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserChangedEvent{changeMap=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
