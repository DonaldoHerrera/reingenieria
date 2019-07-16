package defpackage;

import java.util.List;

/* renamed from: He reason: default package */
/* compiled from: ConstraintTracker */
class He implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ Ie b;

    He(Ie ie, List list) {
        this.b = ie;
        this.a = list;
    }

    public void run() {
        for (C1660re a2 : this.a) {
            a2.a(this.b.f);
        }
    }
}
