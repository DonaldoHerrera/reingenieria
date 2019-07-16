package defpackage;

/* renamed from: ymb reason: default package and case insensitive filesystem */
/* compiled from: ProtoBuf */
public enum C7762ymb implements a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);
    
    private static b<C7762ymb> g;
    private final int i;

    static {
        g = new C7693xmb();
    }

    private C7762ymb(int i2, int i3) {
        this.i = i3;
    }

    public static C7762ymb a(int i2) {
        if (i2 == 0) {
            return INTERNAL;
        }
        if (i2 == 1) {
            return PRIVATE;
        }
        if (i2 == 2) {
            return PROTECTED;
        }
        if (i2 == 3) {
            return PUBLIC;
        }
        if (i2 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i2 != 5) {
            return null;
        }
        return LOCAL;
    }

    public final int i() {
        return this.i;
    }
}
