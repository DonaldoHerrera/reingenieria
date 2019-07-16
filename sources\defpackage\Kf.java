package defpackage;

/* renamed from: Kf reason: default package */
public enum Kf {
    JANUARY(0),
    FEBRUARY(1),
    MARCH(2),
    APRIL(3),
    MAY(4),
    JUNE(5),
    JULY(6),
    AUGUST(7),
    SEPTEMBER(8),
    OCTOBER(9),
    NOVEMBER(10),
    DECEMBER(11);
    
    private static final String m = null;
    private final int o;

    static {
        m = Hg.a(Kf.class);
    }

    private Kf(int i) {
        this.o = i;
    }

    public int a() {
        return this.o;
    }

    public static Kf a(int i) {
        Kf[] values;
        for (Kf kf : values()) {
            if (kf.a() == i) {
                return kf;
            }
        }
        String str = m;
        StringBuilder sb = new StringBuilder();
        sb.append("No month with value ");
        sb.append(i);
        sb.append(", value must be in (0,11)");
        Hg.b(str, sb.toString());
        return null;
    }
}
