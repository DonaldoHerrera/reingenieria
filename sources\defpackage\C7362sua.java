package defpackage;

/* renamed from: sua reason: default package and case insensitive filesystem */
/* compiled from: LambdaObserver */
public final class C7362sua<T> extends SUa<T> {
    private final C6776kQa<T> c;

    private C7362sua(C6776kQa<T> kqa) {
        this.c = kqa;
    }

    public static <T> C7362sua<T> a(C6776kQa<T> kqa) {
        return new C7362sua<>(kqa);
    }

    public void onComplete() {
    }

    public void a(T t) {
        try {
            this.c.accept(t);
        } catch (Exception e) {
            a((Throwable) e);
        }
    }

    public void a(Throwable th) {
        if (!C7660xGa.a(th)) {
            th.printStackTrace();
            return;
        }
        throw new RuntimeException(th);
    }
}
