package defpackage;

/* renamed from: Haa reason: default package */
/* compiled from: PlayerUICommand */
public final class Haa {
    private final int a;

    private Haa(int i) {
        this.a = i;
    }

    public static Haa a() {
        return new Haa(2);
    }

    public static Haa b() {
        return new Haa(10);
    }

    public static Haa c() {
        return new Haa(1);
    }

    public static Haa d() {
        return new Haa(11);
    }

    public static Haa e() {
        return new Haa(5);
    }

    public static Haa f() {
        return new Haa(6);
    }

    public static Haa s() {
        return new Haa(3);
    }

    public static Haa t() {
        return new Haa(8);
    }

    public static Haa u() {
        return new Haa(0);
    }

    public static Haa v() {
        return new Haa(4);
    }

    public static Haa w() {
        return new Haa(9);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || Haa.class != obj.getClass()) {
            return false;
        }
        if (this.a != ((Haa) obj).a) {
            z = false;
        }
        return z;
    }

    public boolean g() {
        return this.a == 2;
    }

    public boolean h() {
        return this.a == 1;
    }

    public boolean i() {
        return this.a == 5;
    }

    public boolean j() {
        return this.a == 6;
    }

    public boolean k() {
        return this.a == 7;
    }

    public boolean l() {
        return this.a == 3;
    }

    public boolean m() {
        return this.a == 8;
    }

    public boolean n() {
        return this.a == 10;
    }

    public boolean o() {
        return this.a == 11;
    }

    public boolean p() {
        return this.a == 0;
    }

    public boolean q() {
        return this.a == 4;
    }

    public boolean r() {
        return this.a == 9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("player UI command: ");
        sb.append(this.a);
        return sb.toString();
    }
}
