package defpackage;

import com.facebook.B;
import com.facebook.internal.A;

/* renamed from: Lk reason: default package */
/* compiled from: ActivityLifecycleTracker */
class Lk implements a {
    final /* synthetic */ A a;
    final /* synthetic */ String b;

    Lk(A a2, String str) {
        this.a = a2;
        this.b = str;
    }

    public void a() {
        A a2 = this.a;
        boolean z = true;
        boolean z2 = a2 != null && a2.b();
        if (!B.l()) {
            z = false;
        }
        if (z2 && z) {
            Pk.b(this.b);
        }
    }
}
