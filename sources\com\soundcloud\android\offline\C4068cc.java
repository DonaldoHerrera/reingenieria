package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.cc reason: case insensitive filesystem */
/* compiled from: DownloadOperations.kt */
final class C4068cc<T> implements C6776kQa<Throwable> {
    final /* synthetic */ C4074dc a;
    final /* synthetic */ C3508cda b;

    C4068cc(C4074dc dcVar, C3508cda cda) {
        this.a = dcVar;
        this.b = cda;
    }

    /* renamed from: a */
    public final void accept(Throwable th) {
        Qb a2 = this.a.a.o;
        StringBuilder sb = new StringBuilder();
        sb.append("Error removing download file for ");
        sb.append(this.b);
        String sb2 = sb.toString();
        C7471uYa.a((Object) th, "throwable");
        a2.a(sb2, th);
    }
}
