package androidx.mediarouter.app;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: androidx.mediarouter.app.d reason: case insensitive filesystem */
/* compiled from: MediaRouteCastDialog */
class C0391d implements OnClickListener {
    final /* synthetic */ C0392e a;

    C0391d(C0392e eVar) {
        this.a = eVar;
    }

    public void onClick(View view) {
        if (this.a.g.w()) {
            this.a.d.a(2);
        }
        this.a.dismiss();
    }
}
