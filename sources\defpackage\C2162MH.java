package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: MH reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_RecyclerViewScrollEvent */
final class C2162MH extends C2181NH {
    private final RecyclerView a;
    private final int b;
    private final int c;

    C2162MH(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView != null) {
            this.a = recyclerView;
            this.b = i;
            this.c = i2;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public RecyclerView c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2181NH)) {
            return false;
        }
        C2181NH nh = (C2181NH) obj;
        if (!(this.a.equals(nh.c()) && this.b == nh.a() && this.c == nh.b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerViewScrollEvent{view=");
        sb.append(this.a);
        sb.append(", dx=");
        sb.append(this.b);
        sb.append(", dy=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
