package defpackage;

/* renamed from: Ds reason: default package */
public final class Ds {
    private static final Es a;
    private static volatile Es b;

    static {
        Fs fs = new Fs();
        a = fs;
        b = fs;
    }

    public static Es a() {
        return b;
    }
}
