package defpackage;

/* renamed from: Elb reason: default package */
/* compiled from: ProtoBuf */
public enum Elb implements a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);
    
    private static b<Elb> e;
    private final int g;

    static {
        e = new Dlb();
    }

    private Elb(int i, int i2) {
        this.g = i2;
    }

    public static Elb a(int i) {
        if (i == 0) {
            return DECLARATION;
        }
        if (i == 1) {
            return FAKE_OVERRIDE;
        }
        if (i == 2) {
            return DELEGATION;
        }
        if (i != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    public final int i() {
        return this.g;
    }
}
