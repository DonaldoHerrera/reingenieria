package defpackage;

@EVa(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/soundcloud/android/analytics/TrackingRecord;", "", "id", "", "timestamp", "backend", "", "data", "(JJLjava/lang/String;Ljava/lang/String;)V", "getBackend", "()Ljava/lang/String;", "getData", "getId", "()J", "getTimestamp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "analytics-base_release"}, mv = {1, 1, 15})
/* renamed from: JM reason: default package and case insensitive filesystem */
/* compiled from: TrackingRecord.kt */
public final class C2110JM {
    public static final a a = new a(null);
    private final long b;
    private final long c;
    private final String d;
    private final String e;

    /* renamed from: JM$a */
    /* compiled from: TrackingRecord.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final C2110JM a(long j, String str, String str2) {
            C7471uYa.b(str, "backend");
            C7471uYa.b(str2, "data");
            C2110JM jm = new C2110JM(0, j, str, str2, 1, null);
            return jm;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C2110JM(long j, long j2, String str, String str2) {
        C7471uYa.b(str, "backend");
        C7471uYa.b(str2, "data");
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = str2;
    }

    @NXa
    public static final C2110JM a(long j, String str, String str2) {
        return a.a(j, str, str2);
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final long c() {
        return this.b;
    }

    public final long d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2110JM) {
                C2110JM jm = (C2110JM) obj;
                if (this.b == jm.b) {
                    if (!(this.c == jm.c) || !C7471uYa.a((Object) this.d, (Object) jm.d) || !C7471uYa.a((Object) this.e, (Object) jm.e)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.d;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode + i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackingRecord(id=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(", backend=");
        sb.append(this.d);
        sb.append(", data=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C2110JM(long j, long j2, String str, String str2, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            j = -1;
        }
        this(j, j2, str, str2);
    }
}
