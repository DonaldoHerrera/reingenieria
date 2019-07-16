package defpackage;

/* renamed from: aF reason: default package and case insensitive filesystem */
/* compiled from: Dimension */
public final class C2440aF {
    private final int a;
    private final int b;

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2440aF) {
            C2440aF aFVar = (C2440aF) obj;
            if (this.a == aFVar.a && this.b == aFVar.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 32713) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("x");
        sb.append(this.b);
        return sb.toString();
    }
}
