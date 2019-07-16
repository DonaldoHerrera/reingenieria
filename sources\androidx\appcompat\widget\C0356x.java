package androidx.appcompat.widget;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: androidx.appcompat.widget.x reason: case insensitive filesystem */
/* compiled from: AppCompatSpinner */
class C0356x implements OnGlobalLayoutListener {
    final /* synthetic */ b a;

    C0356x(b bVar) {
        this.a = bVar;
    }

    public void onGlobalLayout() {
        b bVar = this.a;
        if (!bVar.b(AppCompatSpinner.this)) {
            this.a.dismiss();
            return;
        }
        this.a.l();
        C0356x.super.c();
    }
}
