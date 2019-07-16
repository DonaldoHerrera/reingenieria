package defpackage;

@EVa(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JC\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052,\b\u0002\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0007\"\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/soundcloud/android/error/reporting/ErrorReporter;", "", "reportSilentException", "", "t", "", "contextValuePairs", "", "Lkotlin/Pair;", "", "(Ljava/lang/Throwable;[Lkotlin/Pair;)V", "error-reporting"}, mv = {1, 1, 15})
/* renamed from: VY reason: default package and case insensitive filesystem */
/* compiled from: ErrorReporter.kt */
public interface C3469VY {

    /* renamed from: VY$a */
    /* compiled from: ErrorReporter.kt */
    public static final class a {
        public static /* synthetic */ void a(C3469VY vy, Throwable th, HVa[] hVaArr, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    hVaArr = new HVa[0];
                }
                vy.a(th, hVaArr);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportSilentException");
        }
    }

    void a(Throwable th, HVa<String, String>... hVaArr);
}
