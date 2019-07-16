package defpackage;

/* renamed from: Tfa reason: default package */
/* compiled from: Metadata.kt */
public final class Tfa {
    private final long a;

    public static long a(long j) {
        return j;
    }

    public static boolean a(long j, Object obj) {
        if (obj instanceof Tfa) {
            if (j == ((Tfa) obj).a()) {
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
        sb.append("Metadata(timeToLive=");
        sb.append(C4626oga.c(j));
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
