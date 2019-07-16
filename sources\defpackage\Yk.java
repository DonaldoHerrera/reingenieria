package defpackage;

import android.content.Context;
import com.facebook.B;
import java.util.ArrayList;

/* renamed from: Yk reason: default package */
/* compiled from: InAppPurchaseActivityLifecycleTracker */
class Yk implements Runnable {
    final /* synthetic */ Zk a;

    Yk(Zk zk) {
        this.a = zk;
    }

    public void run() {
        Context e = B.e();
        ArrayList b = C0311al.b(e, _k.h);
        if (b.isEmpty()) {
            b = C0311al.a(e, _k.h);
        }
        _k.b(e, b);
    }
}
