package defpackage;

/* renamed from: se reason: default package and case insensitive filesystem */
/* compiled from: NetworkState */
public class C1690se {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;

    public C1690se(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1690se.class != obj.getClass()) {
            return false;
        }
        C1690se seVar = (C1690se) obj;
        if (!(this.a == seVar.a && this.b == seVar.b && this.c == seVar.c && this.d == seVar.d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = this.a ? 1 : 0;
        if (this.b) {
            i += 16;
        }
        if (this.c) {
            i += 256;
        }
        return this.d ? i + 4096 : i;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }
}
