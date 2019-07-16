package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.jc reason: case insensitive filesystem */
/* compiled from: DownloadOperations.kt */
final class C4110jc<T, R> implements C7118pQa<T, C7669xPa<? extends R>> {
    final /* synthetic */ Vb a;

    C4110jc(Vb vb) {
        this.a = vb;
    }

    /* renamed from: a */
    public final C7531vPa<C3508cda> apply(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        Qb a2 = this.a.o;
        StringBuilder sb = new StringBuilder();
        sb.append("Removing download entry for ");
        sb.append(cda);
        a2.a(sb.toString());
        return this.a.j.a(cda).c((C6776kQa<? super T>) new C4080ec<Object>(this, cda)).a((C6776kQa<? super Throwable>) new C4086fc<Object>(this, cda)).a((C7256rQa<? super T>) C4092gc.a).e(new C4104ic(this, cda));
    }
}
