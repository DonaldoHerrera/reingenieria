package defpackage;

/* renamed from: uUa reason: default package and case insensitive filesystem */
/* compiled from: EmptySubscription */
public enum C7467uUa implements KQa<Object> {
    INSTANCE;

    public int a(int i) {
        return i & 2;
    }

    public void a(long j) {
        C7605wUa.b(j);
    }

    public void cancel() {
    }

    public void clear() {
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() {
        return null;
    }

    public String toString() {
        return "EmptySubscription";
    }

    public static void a(Throwable th, C5551aBb<?> abb) {
        abb.a((C5619bBb) INSTANCE);
        abb.a(th);
    }

    public static void a(C5551aBb<?> abb) {
        abb.a((C5619bBb) INSTANCE);
        abb.onComplete();
    }
}
