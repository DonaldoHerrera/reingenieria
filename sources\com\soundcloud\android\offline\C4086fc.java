package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.fc reason: case insensitive filesystem */
/* compiled from: DownloadOperations.kt */
final class C4086fc<T> implements C6776kQa<Throwable> {
    final /* synthetic */ C4110jc a;
    final /* synthetic */ C3508cda b;

    C4086fc(C4110jc jcVar, C3508cda cda) {
        this.a = jcVar;
        this.b = cda;
    }

    /* renamed from: a */
    public final void accept(Throwable th) {
        C7471uYa.b(th, "throwable");
        Qb a2 = this.a.a.o;
        StringBuilder sb = new StringBuilder();
        sb.append("Error removing download entry for ");
        sb.append(this.b);
        a2.a(sb.toString(), th);
    }
}
