package defpackage;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: qIa reason: default package and case insensitive filesystem */
/* compiled from: LongExtensions.kt */
public final class C7179qIa {
    public static final String a(long j) {
        return C7315sGa.a(j, TimeUnit.MILLISECONDS);
    }

    public static final long b(long j) {
        return TimeUnit.MILLISECONDS.toSeconds(j);
    }

    public static final long c(long j) {
        return TimeUnit.SECONDS.toMillis(j);
    }

    public static final Date d(long j) {
        return new Date(j);
    }
}
