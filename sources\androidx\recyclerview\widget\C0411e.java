package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0425t.b;

/* renamed from: androidx.recyclerview.widget.e reason: case insensitive filesystem */
/* compiled from: AsyncListDiffer */
class C0411e implements Runnable {
    final /* synthetic */ b a;
    final /* synthetic */ C0412f b;

    C0411e(C0412f fVar, b bVar) {
        this.b = fVar;
        this.a = bVar;
    }

    public void run() {
        C0412f fVar = this.b;
        C0413g gVar = fVar.d;
        if (gVar.g == fVar.c) {
            gVar.a(fVar.b, this.a);
        }
    }
}
