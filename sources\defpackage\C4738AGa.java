package defpackage;

/* renamed from: AGa reason: default package and case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4738AGa implements Runnable {
    private final /* synthetic */ Throwable a;
    private final /* synthetic */ Class b;

    public /* synthetic */ C4738AGa(Throwable th, Class cls) {
        this.a = th;
        this.b = cls;
    }

    public final void run() {
        C7316sHa.b(this.a, this.b.getCanonicalName());
    }
}
