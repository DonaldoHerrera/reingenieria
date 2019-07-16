package defpackage;

/* renamed from: fga reason: default package and case insensitive filesystem */
/* compiled from: Tombstone.kt */
public final class C4554fga<Key> {
    private final Key a;
    private final long b;

    public final Key a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4554fga) {
                C4554fga fga = (C4554fga) obj;
                if (C7471uYa.a((Object) this.a, (Object) fga.a)) {
                    if (this.b == fga.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Key key = this.a;
        int hashCode = (key != null ? key.hashCode() : 0) * 31;
        long j = this.b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tombstone(key=");
        sb.append(this.a);
        sb.append(", expire=");
        sb.append(C4546ega.b(this.b));
        sb.append(")");
        return sb.toString();
    }
}
