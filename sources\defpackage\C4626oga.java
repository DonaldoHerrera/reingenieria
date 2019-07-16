package defpackage;

/* renamed from: oga reason: default package and case insensitive filesystem */
/* compiled from: TimeToLive.kt */
public final class C4626oga {
    private final long a;

    public static long a(long j) {
        return j;
    }

    public static boolean a(long j, Object obj) {
        if (obj instanceof C4626oga) {
            if (j == ((C4626oga) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static String c(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("TimeToLive(timestamp=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public int hashCode() {
        return b(this.a);
    }

    public String toString() {
        return c(this.a);
    }
}
