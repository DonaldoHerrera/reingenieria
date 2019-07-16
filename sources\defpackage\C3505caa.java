package defpackage;

import java.util.Map;

/* renamed from: caa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_PlaylistMarkedForOfflineStateChangedEvent */
final class C3505caa extends Laa {
    private final a b;
    private final Map<C3508cda, Boolean> c;

    C3505caa(a aVar, Map<C3508cda, Boolean> map) {
        if (aVar != null) {
            this.b = aVar;
            if (map != null) {
                this.c = map;
                return;
            }
            throw new NullPointerException("Null changeMap");
        }
        throw new NullPointerException("Null kind");
    }

    public Map<C3508cda, Boolean> a() {
        return this.c;
    }

    public a b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Laa)) {
            return false;
        }
        Laa laa = (Laa) obj;
        if (!this.b.equals(laa.b()) || !this.c.equals(laa.a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaylistMarkedForOfflineStateChangedEvent{kind=");
        sb.append(this.b);
        sb.append(", changeMap=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
