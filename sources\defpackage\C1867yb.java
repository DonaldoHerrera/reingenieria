package defpackage;

import android.os.Handler;

/* renamed from: yb reason: default package and case insensitive filesystem */
/* compiled from: FontsContractCompat */
class C1867yb implements a<c> {
    final /* synthetic */ a a;
    final /* synthetic */ Handler b;

    C1867yb(a aVar, Handler handler) {
        this.a = aVar;
        this.b = handler;
    }

    public void a(c cVar) {
        if (cVar == null) {
            this.a.a(1, this.b);
            return;
        }
        int i = cVar.b;
        if (i == 0) {
            this.a.a(cVar.a, this.b);
        } else {
            this.a.a(i, this.b);
        }
    }
}
