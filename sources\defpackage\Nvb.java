package defpackage;

import java.io.Serializable;

/* renamed from: Nvb reason: default package */
/* compiled from: MapEntry */
final class Nvb<K, V> implements Serializable {
    public final K a;
    public final V b;

    public Nvb(K k, V v) {
        this.a = k;
        this.b = v;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof Nvb)) {
            return false;
        }
        Nvb nvb = (Nvb) obj;
        K k = this.a;
        if (k != null ? k.equals(nvb.a) : nvb.a == null) {
            V v = this.b;
            if (v != null ? v.equals(nvb.b) : nvb.b == null) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        K k = this.a;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.b;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("=");
        sb.append(this.b);
        return sb.toString();
    }
}
