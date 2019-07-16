package androidx.mediarouter.app;

import androidx.mediarouter.app.OverlayListView.a.C0010a;
import androidx.mediarouter.media.h.g;

/* compiled from: MediaRouteControllerDialog */
class i implements C0010a {
    final /* synthetic */ g a;
    final /* synthetic */ u b;

    i(u uVar, g gVar) {
        this.b = uVar;
        this.a = gVar;
    }

    public void a() {
        this.b.K.remove(this.a);
        this.b.G.notifyDataSetChanged();
    }
}
