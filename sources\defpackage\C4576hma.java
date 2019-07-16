package defpackage;

/* renamed from: hma reason: default package and case insensitive filesystem */
/* compiled from: FlipperEvent.kt */
public final class C4576hma {
    private final String a;
    private final long b;
    private final long c;

    public C4576hma(String str, long j, long j2) {
        C7471uYa.b(str, "uri");
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final long a() {
        return this.c;
    }

    public final long b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4576hma) {
                C4576hma hma = (C4576hma) obj;
                if (C7471uYa.a((Object) this.a, (Object) hma.a)) {
                    if (this.b == hma.b) {
                        if (this.c == hma.c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.b;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProgressChange(uri=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
