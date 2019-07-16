package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: nma reason: default package and case insensitive filesystem */
/* compiled from: MainThreadHandler.kt */
public final class C4624nma implements C4608lma {
    private final Handler a = new Handler(Looper.getMainLooper());

    public void a(PXa<RVa> pXa) {
        C7471uYa.b(pXa, "function");
        this.a.post(new C4616mma(pXa));
    }
}
