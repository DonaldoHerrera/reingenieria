package defpackage;

/* renamed from: dQa reason: default package and case insensitive filesystem */
/* compiled from: UndeliverableException */
public final class C6300dQa extends IllegalStateException {
    public C6300dQa(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ");
        sb.append(th);
        super(sb.toString(), th);
    }
}
