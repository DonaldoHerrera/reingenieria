package defpackage;

/* renamed from: eGa reason: default package and case insensitive filesystem */
/* compiled from: ExpensiveInstantiationOnMainThreadException.kt */
public final class C6358eGa extends IllegalStateException {
    public C6358eGa(String str) {
        C7471uYa.b(str, "component");
        StringBuilder sb = new StringBuilder();
        sb.append("Do not instantiate ");
        sb.append(str);
        sb.append(" on the main thread, as it is expensive. Use a lazy and instantiate off the main thread");
        super(sb.toString());
    }
}
