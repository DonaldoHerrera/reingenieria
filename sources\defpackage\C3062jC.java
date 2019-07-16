package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

/* renamed from: jC reason: default package and case insensitive filesystem */
/* compiled from: CacheStats */
public final class C3062jC {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public C3062jC(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = j;
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        long j11 = j5;
        long j12 = j6;
        boolean z = true;
        Preconditions.checkArgument(j7 >= 0);
        Preconditions.checkArgument(j8 >= 0);
        Preconditions.checkArgument(j9 >= 0);
        Preconditions.checkArgument(j10 >= 0);
        Preconditions.checkArgument(j11 >= 0);
        if (j12 < 0) {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.a = j7;
        this.b = j8;
        this.c = j9;
        this.d = j10;
        this.e = j11;
        this.f = j12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3062jC)) {
            return false;
        }
        C3062jC jCVar = (C3062jC) obj;
        if (this.a == jCVar.a && this.b == jCVar.b && this.c == jCVar.c && this.d == jCVar.d && this.e == jCVar.e && this.f == jCVar.f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f));
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object) this).add("hitCount", this.a).add("missCount", this.b).add("loadSuccessCount", this.c).add("loadExceptionCount", this.d).add("totalLoadTime", this.e).add("evictionCount", this.f).toString();
    }
}
