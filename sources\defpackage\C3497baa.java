package defpackage;

import java.util.Map;

/* renamed from: baa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_PlaylistEntityChangedEvent */
final class C3497baa extends Kaa {
    private final a b;
    private final Map<C3508cda, Eda> c;

    C3497baa(a aVar, Map<C3508cda, Eda> map) {
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

    public Map<C3508cda, Eda> a() {
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
        if (!(obj instanceof Kaa)) {
            return false;
        }
        Kaa kaa = (Kaa) obj;
        if (!this.b.equals(kaa.b()) || !this.c.equals(kaa.a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaylistEntityChangedEvent{kind=");
        sb.append(this.b);
        sb.append(", changeMap=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
