package defpackage;

/* renamed from: ZWa reason: default package */
/* compiled from: _ComparisonsJvm.kt */
class ZWa extends YWa {
    public static <T extends Comparable<? super T>> T b(T t, T t2) {
        C7471uYa.b(t, "a");
        C7471uYa.b(t2, "b");
        return t.compareTo(t2) >= 0 ? t : t2;
    }
}
