package defpackage;

import com.soundcloud.android.foundation.events.I;

/* renamed from: SZ reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_AdSessionEventArgs */
final class C3461SZ extends C3443MZ {
    private final I a;
    private final long b;
    private final long c;
    private final String d;
    private final String e;
    private final String f;

    C3461SZ(I i, long j, long j2, String str, String str2, String str3) {
        if (i != null) {
            this.a = i;
            this.b = j;
            this.c = j2;
            this.d = str;
            if (str2 != null) {
                this.e = str2;
                if (str3 != null) {
                    this.f = str3;
                    return;
                }
                throw new NullPointerException("Null uuid");
            }
            throw new NullPointerException("Null playerType");
        }
        throw new NullPointerException("Null trackSourceInfo");
    }

    public long a() {
        return this.c;
    }

    public String b() {
        return this.e;
    }

    public long c() {
        return this.b;
    }

    public String d() {
        return this.d;
    }

    public I e() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r7.f.equals(r8.f()) != false) goto L_0x005a;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3443MZ)) {
            return false;
        }
        C3443MZ mz = (C3443MZ) obj;
        if (this.a.equals(mz.e()) && this.b == mz.c() && this.c == mz.a()) {
            String str = this.d;
            if (str != null ? str.equals(mz.d()) : mz.d() == null) {
                if (this.e.equals(mz.b())) {
                }
            }
        }
        z = false;
        return z;
    }

    public String f() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.c;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str = this.d;
        return ((((i2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdSessionEventArgs{trackSourceInfo=");
        sb.append(this.a);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", protocol=");
        sb.append(this.d);
        sb.append(", playerType=");
        sb.append(this.e);
        sb.append(", uuid=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
