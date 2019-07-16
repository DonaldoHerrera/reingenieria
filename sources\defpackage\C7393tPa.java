package defpackage;

/* renamed from: tPa reason: default package and case insensitive filesystem */
/* compiled from: Flowable */
public abstract class C7393tPa<T> implements _Ab<T> {
    static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static int a() {
        return a;
    }

    public final C7393tPa<T> b() {
        return a(a(), false, true);
    }

    /* access modifiers changed from: protected */
    public abstract void b(C5551aBb<? super T> abb);

    public final C7393tPa<T> c() {
        return WUa.a((C7393tPa<T>) new C7671xRa<T>(this));
    }

    public final C7393tPa<T> d() {
        return WUa.a((C7393tPa<T>) new C7809zRa<T>(this));
    }

    public final APa<T> e() {
        return WUa.a((APa<T>) new LSa<T>(this));
    }

    public static <T> C7393tPa<T> a(Iterable<? extends T> iterable) {
        AQa.a(iterable, "source is null");
        return WUa.a((C7393tPa<T>) new C7464uRa<T>(iterable));
    }

    public final C7393tPa<T> a(int i, boolean z, boolean z2) {
        AQa.a(i, "capacity");
        C7602wRa wra = new C7602wRa(this, i, z2, z, C7808zQa.c);
        return WUa.a((C7393tPa<T>) wra);
    }

    public final void a(C5551aBb<? super T> abb) {
        if (abb instanceof C7462uPa) {
            a((C7462uPa) abb);
            return;
        }
        AQa.a(abb, "s is null");
        a((C7462uPa<? super T>) new C7191qUa<Object>(abb));
    }

    public final void a(C7462uPa<? super T> upa) {
        AQa.a(upa, "s is null");
        try {
            C5551aBb a2 = WUa.a(this, (C5551aBb<? super T>) upa);
            AQa.a(a2, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            b(a2);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            _Pa.b(th);
            WUa.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
