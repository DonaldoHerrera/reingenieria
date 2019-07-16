package defpackage;

/* renamed from: jaa reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_ScrollDepthEvent_ItemDetails */
final class C3796jaa extends c {
    private final int a;
    private final int b;
    private final float c;

    C3796jaa(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public float c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!(this.a == cVar.a() && this.b == cVar.b() && Float.floatToIntBits(this.c) == Float.floatToIntBits(cVar.c()))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Float.floatToIntBits(this.c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItemDetails{column=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", viewablePercentage=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
