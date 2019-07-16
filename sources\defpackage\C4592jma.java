package defpackage;

/* renamed from: jma reason: default package and case insensitive filesystem */
/* compiled from: FlipperEvent.kt */
public final class C4592jma {
    private final String a;
    private final boolean b;
    private final long c;

    public C4592jma(String str, boolean z, long j) {
        C7471uYa.b(str, "uri");
        this.a = str;
        this.b = z;
        this.c = j;
    }

    public final boolean a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4592jma) {
                C4592jma jma = (C4592jma) obj;
                if (C7471uYa.a((Object) this.a, (Object) jma.a)) {
                    if (this.b == jma.b) {
                        if (this.c == jma.c) {
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
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        long j = this.c;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SeekingStatusChange(uri=");
        sb.append(this.a);
        sb.append(", seekInProgress=");
        sb.append(this.b);
        sb.append(", targetPosition=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
