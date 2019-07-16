package com.soundcloud.android.accounts;

import java.util.concurrent.Callable;

/* compiled from: DefaultSessionProvider.kt */
final class t<T> implements C6776kQa<VPa> {
    final /* synthetic */ C2529j a;

    t(C2529j jVar) {
        this.a = jVar;
    }

    /* renamed from: a */
    public final void accept(VPa vPa) {
        if (!this.a.b.a() && this.a.b.c() == 0) {
            UPa b = this.a.b;
            C7531vPa b2 = C7531vPa.b((Callable<? extends T>) new r<Object>(this)).b(this.a.d);
            C5190Oua a2 = C5190Oua.a(new C2535p(new s(this.a.a)));
            b2.c(a2);
            b.b(a2);
        }
    }
}
