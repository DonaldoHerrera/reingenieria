package defpackage;

/* renamed from: Km reason: default package */
/* compiled from: WavUtil */
public final class Km {
    public static final int a = C0471ar.b("RIFF");
    public static final int b = C0471ar.b("WAVE");
    public static final int c = C0471ar.b("fmt ");
    public static final int d = C0471ar.b("data");

    public static int a(int i, int i2) {
        if (i != 1) {
            int i3 = 0;
            if (i == 3) {
                if (i2 == 32) {
                    i3 = 4;
                }
                return i3;
            } else if (i != 65534) {
                if (i != 6) {
                    return i != 7 ? 0 : 268435456;
                }
                return 536870912;
            }
        }
        return C0471ar.c(i2);
    }
}
