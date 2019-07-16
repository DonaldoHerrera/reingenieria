package defpackage;

/* renamed from: YPa reason: default package */
/* compiled from: RunnableDisposable */
final class YPa extends XPa<Runnable> {
    YPa(Runnable runnable) {
        super(runnable);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RunnableDisposable(disposed=");
        sb.append(a());
        sb.append(", ");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void a(Runnable runnable) {
        runnable.run();
    }
}
