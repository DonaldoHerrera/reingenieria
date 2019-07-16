package com.soundcloud.android.offline;

@EVa(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/soundcloud/android/offline/DownloadLogger;", "", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "(Lcom/soundcloud/android/error/reporting/ErrorReporter;)V", "getErrorReporter", "()Lcom/soundcloud/android/error/reporting/ErrorReporter;", "log", "", "message", "", "logError", "throwable", "", "logToConsoleOnly", "Companion", "offline_release"}, mv = {1, 1, 15})
/* compiled from: DownloadLogger.kt */
public class Qb {
    public static final a a = new a(null);
    private final C3469VY b;

    /* compiled from: DownloadLogger.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Qb(C3469VY vy) {
        C7471uYa.b(vy, "errorReporter");
        this.b = vy;
    }

    public C3469VY a() {
        return this.b;
    }

    public void b(String str) {
        C7471uYa.b(str, "message");
        SDb.a("ScDownloads").a(str, new Object[0]);
    }

    public void a(String str) {
        C7471uYa.b(str, "message");
        SDb.a("ScDownloads").d(str, new Object[0]);
    }

    public void a(String str, Throwable th) {
        C7471uYa.b(str, "message");
        C7471uYa.b(th, "throwable");
        b a2 = SDb.a("ScDownloads");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        sb.append(th);
        a2.a(th, sb.toString(), new Object[0]);
        defpackage.C3469VY.a.a(a(), th, null, 2, null);
    }
}
