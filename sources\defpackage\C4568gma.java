package defpackage;

import java.util.Map;

/* renamed from: gma reason: default package and case insensitive filesystem */
/* compiled from: FlipperEvent.kt */
public final class C4568gma {
    private final long a;
    private final Map<String, Object> b;

    public C4568gma(long j, Map<String, ? extends Object> map) {
        C7471uYa.b(map, "payload");
        this.a = j;
        this.b = map;
    }

    public final Map<String, Object> a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4568gma) {
                C4568gma gma = (C4568gma) obj;
                if (!(this.a == gma.a) || !C7471uYa.a((Object) this.b, (Object) gma.b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Map<String, Object> map = this.b;
        return i + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PerformanceEvent(timestamp=");
        sb.append(this.a);
        sb.append(", payload=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
