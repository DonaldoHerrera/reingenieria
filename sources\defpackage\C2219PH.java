package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;

/* renamed from: PH reason: default package and case insensitive filesystem */
/* compiled from: RecyclerViewScrollEventObservable */
final class C2219PH extends APa<C2181NH> {
    private final RecyclerView a;

    /* renamed from: PH$a */
    /* compiled from: RecyclerViewScrollEventObservable */
    final class a extends OPa {
        private final RecyclerView b;
        final m c;

        a(RecyclerView recyclerView, GPa<? super C2181NH> gPa) {
            this.b = recyclerView;
            this.c = new C2200OH(this, C2219PH.this, gPa);
        }

        /* access modifiers changed from: protected */
        public void b() {
            this.b.b(this.c);
        }
    }

    C2219PH(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super C2181NH> gPa) {
        if (C2143LH.a(gPa)) {
            a aVar = new a(this.a, gPa);
            gPa.a((VPa) aVar);
            this.a.a(aVar.c);
        }
    }
}
