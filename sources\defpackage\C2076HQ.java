package defpackage;

import java.io.IOException;

/* renamed from: HQ reason: default package and case insensitive filesystem */
/* compiled from: AppFeaturesProvider.kt */
final class C2076HQ<TResult> implements Ry<Void> {
    final /* synthetic */ JPa a;

    C2076HQ(JPa jPa) {
        this.a = jPa;
    }

    public final void onComplete(Wy<Void> wy) {
        C7471uYa.b(wy, "task");
        if (wy.e()) {
            SDb.a("Remote config successfully fetched", new Object[0]);
            JPa jPa = this.a;
            a aVar = IVa.a;
            RVa rVa = RVa.a;
            IVa.b(rVa);
            jPa.onSuccess(IVa.a(rVa));
            return;
        }
        Throwable a2 = wy.a();
        if (a2 == null) {
            a2 = new IOException("Error updating remote flags");
        }
        SDb.a(a2, "Remote config fetch error", new Object[0]);
        JPa jPa2 = this.a;
        a aVar2 = IVa.a;
        Object a3 = JVa.a(a2);
        IVa.b(a3);
        jPa2.onSuccess(IVa.a(a3));
    }
}
