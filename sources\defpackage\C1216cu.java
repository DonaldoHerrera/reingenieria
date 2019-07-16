package defpackage;

/* renamed from: cu reason: default package and case insensitive filesystem */
public final class C1216cu {
    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(Uu.a(str, objArr));
        }
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
