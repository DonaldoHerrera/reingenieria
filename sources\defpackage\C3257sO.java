package defpackage;

import com.soundcloud.android.foundation.events.t;
import com.soundcloud.android.foundation.events.u;

/* renamed from: sO reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_PerformanceMetric */
final class C3257sO extends C1994DO {
    private final u a;
    private final t b;
    private final long c;
    private final C2093IO d;

    /* renamed from: sO$a */
    /* compiled from: AutoValue_PerformanceMetric */
    static final class a extends defpackage.C1994DO.a {
        private u a;
        private t b;
        private Long c;
        private C2093IO d;

        a() {
        }

        public defpackage.C1994DO.a a(u uVar) {
            if (uVar != null) {
                this.a = uVar;
                return this;
            }
            throw new NullPointerException("Null metricType");
        }

        /* access modifiers changed from: 0000 */
        public u c() {
            u uVar = this.a;
            if (uVar != null) {
                return uVar;
            }
            throw new IllegalStateException("Property \"metricType\" has not been set");
        }

        /* access modifiers changed from: 0000 */
        public C2093IO d() {
            C2093IO io = this.d;
            if (io != null) {
                return io;
            }
            throw new IllegalStateException("Property \"traceMetric\" has not been set");
        }

        public defpackage.C1994DO.a a(t tVar) {
            if (tVar != null) {
                this.b = tVar;
                return this;
            }
            throw new NullPointerException("Null metricParams");
        }

        /* access modifiers changed from: 0000 */
        public defpackage.C1994DO.a a(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public defpackage.C1994DO.a a(C2093IO io) {
            if (io != null) {
                this.d = io;
                return this;
            }
            throw new NullPointerException("Null traceMetric");
        }

        /* access modifiers changed from: 0000 */
        public C1994DO a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" metricType");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" metricParams");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" timestamp");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" traceMetric");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                C3257sO sOVar = new C3257sO(this.a, this.b, this.c.longValue(), this.d);
                return sOVar;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    public t b() {
        return this.b;
    }

    public u c() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public long d() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public C2093IO e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1994DO)) {
            return false;
        }
        C1994DO doR = (C1994DO) obj;
        if (!this.a.equals(doR.c()) || !this.b.equals(doR.b()) || this.c != doR.d() || !this.d.equals(doR.e())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PerformanceMetric{metricType=");
        sb.append(this.a);
        sb.append(", metricParams=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(", traceMetric=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    private C3257sO(u uVar, t tVar, long j, C2093IO io) {
        this.a = uVar;
        this.b = tVar;
        this.c = j;
        this.d = io;
    }
}
