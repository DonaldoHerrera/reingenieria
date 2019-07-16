package androidx.recyclerview.widget;

import java.util.List;

/* renamed from: androidx.recyclerview.widget.f reason: case insensitive filesystem */
/* compiled from: AsyncListDiffer */
class C0412f implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ int c;
    final /* synthetic */ C0413g d;

    C0412f(C0413g gVar, List list, List list2, int i) {
        this.d = gVar;
        this.a = list;
        this.b = list2;
        this.c = i;
    }

    public void run() {
        this.d.d.execute(new C0411e(this, C0425t.a(new C0410d(this))));
    }
}
