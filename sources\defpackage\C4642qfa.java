package defpackage;

import java.util.Date;

/* renamed from: qfa reason: default package and case insensitive filesystem */
/* compiled from: SQLBriteColumnAdapters.kt */
public final class C4642qfa implements C6704jMa<Date, Long> {
    public Date a(long j) {
        return new Date(j);
    }

    public /* bridge */ /* synthetic */ Object decode(Object obj) {
        return a(((Number) obj).longValue());
    }

    /* renamed from: a */
    public Long encode(Date date) {
        C7471uYa.b(date, "date");
        return Long.valueOf(date.getTime());
    }
}
