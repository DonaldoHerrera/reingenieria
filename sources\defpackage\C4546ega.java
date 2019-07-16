package defpackage;

/* renamed from: ega reason: default package and case insensitive filesystem */
/* compiled from: Timestamp.kt */
public final class C4546ega {
    private final long a;

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean a(long j, Object obj) {
        if (obj instanceof C4546ega) {
            if (j == ((C4546ega) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public static String b(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Timestamp(timestamp=");
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
        return a(this.a);
    }

    public String toString() {
        return b(this.a);
    }
}
