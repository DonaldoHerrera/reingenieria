package com.soundcloud.android.foundation.events;

/* renamed from: com.soundcloud.android.foundation.events.h reason: case insensitive filesystem */
/* compiled from: AutoValue_PerformanceEvent */
final class C3706h extends x {
    private final u a;
    private final t b;

    public t a() {
        return this.b;
    }

    public u b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.a.equals(xVar.b()) || !this.b.equals(xVar.a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PerformanceEvent{metricType=");
        sb.append(this.a);
        sb.append(", metricParams=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
