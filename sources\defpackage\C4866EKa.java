package defpackage;

import java.util.Iterator;

/* renamed from: EKa reason: default package and case insensitive filesystem */
/* compiled from: Optional */
class C4866EKa extends C2400ZC<T> {
    final /* synthetic */ Iterator c;
    final /* synthetic */ C4897FKa d;

    C4866EKa(C4897FKa fKa, Iterator it) {
        this.d = fKa;
        this.c = it;
    }

    /* access modifiers changed from: protected */
    public T a() {
        while (this.c.hasNext()) {
            C4928GKa gKa = (C4928GKa) this.c.next();
            if (gKa.c()) {
                return gKa.b();
            }
        }
        return b();
    }
}
