package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.bc reason: case insensitive filesystem */
/* compiled from: DownloadOperations.kt */
final class C4062bc<T> implements C6776kQa<C3508cda> {
    final /* synthetic */ C4074dc a;

    C4062bc(C4074dc dcVar) {
        this.a = dcVar;
    }

    /* renamed from: a */
    public final void accept(C3508cda cda) {
        Qb a2 = this.a.a.o;
        StringBuilder sb = new StringBuilder();
        sb.append("Removed download file for ");
        sb.append(cda);
        a2.a(sb.toString());
    }
}
