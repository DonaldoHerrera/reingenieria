package com.soundcloud.android;

import com.soundcloud.android.ra.a;

/* compiled from: UncaughtExceptionHandlerController.kt */
final class qa<T> implements C6776kQa<Throwable> {
    final /* synthetic */ boolean a;

    qa(boolean z) {
        this.a = z;
    }

    /* renamed from: a */
    public final void accept(Throwable th) {
        String str = "e";
        if (!this.a) {
            C7471uYa.a((Object) th, str);
            if (sa.a(th)) {
                C7316sHa.a("RxError", th);
                return;
            }
            return;
        }
        a aVar = ra.a;
        C7471uYa.a((Object) th, str);
        aVar.a(th);
    }
}
