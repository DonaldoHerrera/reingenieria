package defpackage;

/* renamed from: tj reason: default package and case insensitive filesystem */
/* compiled from: TrimmedThrowableData */
class C1725tj {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final C1725tj d;

    public C1725tj(Throwable th, C1695sj sjVar) {
        this.a = th.getLocalizedMessage();
        this.b = th.getClass().getName();
        this.c = sjVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.d = cause != null ? new C1725tj(cause, sjVar) : null;
    }
}
