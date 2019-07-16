package defpackage;

/* renamed from: pO reason: default package and case insensitive filesystem */
/* compiled from: MobilePlaySessionBuilder.kt */
public final class C3198pO extends C3217qO {
    private final long a;

    public C3198pO(long j) {
        super(null);
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3198pO) {
                if (this.a == ((C3198pO) obj).a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Playing(start=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
