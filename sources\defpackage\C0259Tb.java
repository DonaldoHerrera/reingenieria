package defpackage;

/* renamed from: Tb reason: default package and case insensitive filesystem */
/* compiled from: Pools */
public class C0259Tb<T> extends C0255Sb<T> {
    private final Object c = new Object();

    public C0259Tb(int i) {
        super(i);
    }

    public T a() {
        T a;
        synchronized (this.c) {
            a = super.a();
        }
        return a;
    }

    public boolean a(T t) {
        boolean a;
        synchronized (this.c) {
            a = super.a(t);
        }
        return a;
    }
}
