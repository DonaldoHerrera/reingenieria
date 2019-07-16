package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.ec reason: case insensitive filesystem */
/* compiled from: DownloadOperations.kt */
final class C4080ec<T> implements C6776kQa<Long> {
    final /* synthetic */ C4110jc a;
    final /* synthetic */ C3508cda b;

    C4080ec(C4110jc jcVar, C3508cda cda) {
        this.a = jcVar;
        this.b = cda;
    }

    public final void a(long j) {
        Qb a2 = this.a.a.o;
        StringBuilder sb = new StringBuilder();
        sb.append("Download entries removed for ");
        sb.append(this.b);
        sb.append(" : ");
        sb.append(j);
        a2.a(sb.toString());
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        a(((Number) obj).longValue());
    }
}
