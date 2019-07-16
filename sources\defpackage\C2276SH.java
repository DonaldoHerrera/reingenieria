package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: SH reason: default package and case insensitive filesystem */
/* compiled from: ViewClickObservable */
final class C2276SH extends APa<Object> {
    private final View a;

    /* renamed from: SH$a */
    /* compiled from: ViewClickObservable */
    static final class a extends OPa implements OnClickListener {
        private final View b;
        private final GPa<? super Object> c;

        a(View view, GPa<? super Object> gPa) {
            this.b = view;
            this.c = gPa;
        }

        /* access modifiers changed from: protected */
        public void b() {
            this.b.setOnClickListener(null);
        }

        public void onClick(View view) {
            if (!a()) {
                this.c.a(C2124KH.INSTANCE);
            }
        }
    }

    C2276SH(View view) {
        this.a = view;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super Object> gPa) {
        if (C2143LH.a(gPa)) {
            a aVar = new a(this.a, gPa);
            gPa.a((VPa) aVar);
            this.a.setOnClickListener(aVar);
        }
    }
}
