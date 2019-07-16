package androidx.mediarouter.app;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: MediaRouteControllerDialog */
class p implements OnClickListener {
    final /* synthetic */ u a;

    p(u uVar) {
        this.a = uVar;
    }

    public void onClick(View view) {
        u uVar = this.a;
        uVar.fa = !uVar.fa;
        if (uVar.fa) {
            uVar.F.setVisibility(0);
        }
        this.a.f();
        this.a.d(true);
    }
}
