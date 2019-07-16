package defpackage;

/* renamed from: Mvb reason: default package */
/* compiled from: IntTreePMap */
final class Mvb<V> {
    private static final Mvb<Object> a = new Mvb<>(Lvb.a);
    private final Lvb<V> b;

    private Mvb(Lvb<V> lvb) {
        this.b = lvb;
    }

    public static <V> Mvb<V> a() {
        return a;
    }

    private Mvb<V> a(Lvb<V> lvb) {
        if (lvb == this.b) {
            return this;
        }
        return new Mvb<>(lvb);
    }

    public V a(int i) {
        return this.b.a((long) i);
    }

    public Mvb<V> a(int i, V v) {
        return a(this.b.a((long) i, v));
    }
}
