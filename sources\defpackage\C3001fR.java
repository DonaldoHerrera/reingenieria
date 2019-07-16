package defpackage;

/* renamed from: fR reason: default package and case insensitive filesystem */
/* compiled from: Singles.kt */
public final class C3001fR<T1, T2, R> implements C6504gQa<Long, Boolean, R> {
    final /* synthetic */ boolean a;

    public C3001fR(boolean z) {
        this.a = z;
    }

    public final R apply(Long l, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        long longValue = l.longValue();
        boolean z = this.a;
        if (!(booleanValue == z || longValue == -1)) {
            longValue = z ? longValue + 1 : longValue - 1;
        }
        return Long.valueOf(longValue);
    }
}
