package defpackage;

import java.io.Serializable;

/* renamed from: Gfb reason: default package */
/* compiled from: LookupLocation.kt */
public final class Gfb implements Serializable {
    /* access modifiers changed from: private */
    public static final Gfb a = new Gfb(-1, -1);
    public static final a b = new a(null);
    private final int c;
    private final int d;

    /* renamed from: Gfb$a */
    /* compiled from: LookupLocation.kt */
    public static final class a {
        private a() {
        }

        public final Gfb a() {
            return Gfb.a;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Gfb(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Gfb) {
                Gfb gfb = (Gfb) obj;
                if (this.c == gfb.c) {
                    if (this.d == gfb.d) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.c * 31) + this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Position(line=");
        sb.append(this.c);
        sb.append(", column=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
