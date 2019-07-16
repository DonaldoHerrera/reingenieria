package defpackage;

/* renamed from: bQa reason: default package and case insensitive filesystem */
/* compiled from: OnErrorNotImplementedException */
public final class C5636bQa extends RuntimeException {
    public C5636bQa(String str, Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        super(str, th);
    }

    public C5636bQa(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ");
        sb.append(th);
        this(sb.toString(), th);
    }
}
