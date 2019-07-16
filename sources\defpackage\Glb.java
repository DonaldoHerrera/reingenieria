package defpackage;

/* renamed from: Glb reason: default package */
/* compiled from: ProtoBuf */
public enum Glb implements a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);
    
    private static b<Glb> e;
    private final int g;

    static {
        e = new Flb();
    }

    private Glb(int i, int i2) {
        this.g = i2;
    }

    public static Glb a(int i) {
        if (i == 0) {
            return FINAL;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return ABSTRACT;
        }
        if (i != 3) {
            return null;
        }
        return SEALED;
    }

    public final int i() {
        return this.g;
    }
}
