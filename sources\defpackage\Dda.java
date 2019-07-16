package defpackage;

/* renamed from: Dda reason: default package */
/* compiled from: AutoValue_PlaylistStats */
final class Dda extends Gda {
    private final int a;
    private final int b;

    Dda(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Gda)) {
            return false;
        }
        Gda gda = (Gda) obj;
        if (!(this.a == gda.b() && this.b == gda.a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaylistStats{repostsCount=");
        sb.append(this.a);
        sb.append(", likesCount=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
