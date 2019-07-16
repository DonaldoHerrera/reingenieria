package defpackage;

/* renamed from: YWa reason: default package */
/* compiled from: Comparisons.kt */
class YWa {
    public static <T extends Comparable<?>> int a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
