package defpackage;

/* renamed from: Iaa reason: default package */
/* compiled from: PlayerUIEvent */
public class Iaa {
    public static final C7256rQa<Iaa> a = C3907xZ.a;
    public static final C7256rQa<Iaa> b = C3915yZ.a;
    private final int c;

    public Iaa(int i) {
        this.c = i;
    }

    static /* synthetic */ boolean a(Iaa iaa) throws Exception {
        return iaa.c() == 1;
    }

    static /* synthetic */ boolean b(Iaa iaa) throws Exception {
        return iaa.c() == 0;
    }

    public int c() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("player UI event: ");
        sb.append(this.c);
        return sb.toString();
    }

    public static Iaa a() {
        return new Iaa(1);
    }

    public static Iaa b() {
        return new Iaa(0);
    }
}
