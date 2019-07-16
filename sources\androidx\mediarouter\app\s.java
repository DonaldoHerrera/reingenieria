package androidx.mediarouter.app;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.Map;

/* compiled from: MediaRouteControllerDialog */
class s implements OnGlobalLayoutListener {
    final /* synthetic */ Map a;
    final /* synthetic */ Map b;
    final /* synthetic */ u c;

    s(u uVar, Map map, Map map2) {
        this.c = uVar;
        this.a = map;
        this.b = map2;
    }

    public void onGlobalLayout() {
        this.c.F.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.c.a(this.a, this.b);
    }
}
