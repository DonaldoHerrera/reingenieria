package defpackage;

/* renamed from: bZa reason: default package and case insensitive filesystem */
/* compiled from: Random.kt */
public final class C5645bZa {
    public static final void a(int i, int i2) {
        if (!(i2 > i)) {
            throw new IllegalArgumentException(a((Object) Integer.valueOf(i), (Object) Integer.valueOf(i2)).toString());
        }
    }

    public static final int b(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    public static final String a(Object obj, Object obj2) {
        C7471uYa.b(obj, "from");
        C7471uYa.b(obj2, "until");
        StringBuilder sb = new StringBuilder();
        sb.append("Random range is empty: [");
        sb.append(obj);
        sb.append(", ");
        sb.append(obj2);
        sb.append(").");
        return sb.toString();
    }
}
