package defpackage;

/* renamed from: GPa reason: default package */
/* compiled from: Observer */
public interface GPa<T> {
    void a(VPa vPa);

    void a(T t);

    void a(Throwable th);

    void onComplete();
}
