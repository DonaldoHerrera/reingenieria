package defpackage;

import java.util.Map;

/* renamed from: daa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_PlaylistTrackCountChangedEvent */
final class C3748daa extends Maa {
    private final a b;
    private final Map<C3508cda, Integer> c;

    C3748daa(a aVar, Map<C3508cda, Integer> map) {
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

    public Map<C3508cda, Integer> a() {
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
        if (!(obj instanceof Maa)) {
            return false;
        }
        Maa maa = (Maa) obj;
        if (!this.b.equals(maa.b()) || !this.c.equals(maa.a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaylistTrackCountChangedEvent{kind=");
        sb.append(this.b);
        sb.append(", changeMap=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
