package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.mediarouter.media.g;
import androidx.mediarouter.media.h;
import androidx.mediarouter.media.h.a;
import androidx.mediarouter.media.h.e;
import java.lang.ref.WeakReference;

/* renamed from: androidx.mediarouter.app.a reason: case insensitive filesystem */
/* compiled from: MediaRouteActionProvider */
public class C0388a extends C0278Xb {
    private final h d;
    private final C0011a e;
    private g f = g.a;
    private B g = B.a();
    private MediaRouteButton h;

    /* renamed from: androidx.mediarouter.app.a$a reason: collision with other inner class name */
    /* compiled from: MediaRouteActionProvider */
    private static final class C0011a extends a {
        private final WeakReference<C0388a> a;

        public C0011a(C0388a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        public void a(h hVar, h.g gVar) {
            a(hVar);
        }

        public void b(h hVar, h.g gVar) {
            a(hVar);
        }

        public void c(h hVar, e eVar) {
            a(hVar);
        }

        public void d(h hVar, h.g gVar) {
            a(hVar);
        }

        public void a(h hVar, e eVar) {
            a(hVar);
        }

        public void b(h hVar, e eVar) {
            a(hVar);
        }

        private void a(h hVar) {
            C0388a aVar = (C0388a) this.a.get();
            if (aVar != null) {
                aVar.j();
            } else {
                hVar.a((a) this);
            }
        }
    }

    public C0388a(Context context) {
        super(context);
        this.d = h.a(context);
        this.e = new C0011a(this);
    }

    public void a(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.f.equals(gVar)) {
            if (!this.f.d()) {
                this.d.a((a) this.e);
            }
            if (!gVar.d()) {
                this.d.a(gVar, (a) this.e);
            }
            this.f = gVar;
            j();
            MediaRouteButton mediaRouteButton = this.h;
            if (mediaRouteButton != null) {
                mediaRouteButton.setRouteSelector(gVar);
            }
        }
    }

    public boolean c() {
        return this.d.a(this.f, 1);
    }

    public View d() {
        if (this.h != null) {
            Log.e("MediaRouteActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        this.h = i();
        this.h.setCheatSheetEnabled(true);
        this.h.setRouteSelector(this.f);
        this.h.setDialogFactory(this.g);
        this.h.setLayoutParams(new LayoutParams(-2, -1));
        return this.h;
    }

    public boolean e() {
        MediaRouteButton mediaRouteButton = this.h;
        if (mediaRouteButton != null) {
            return mediaRouteButton.b();
        }
        return false;
    }

    public boolean f() {
        return true;
    }

    public MediaRouteButton i() {
        return new MediaRouteButton(a());
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        g();
    }

    public void a(B b) {
        if (b == null) {
            throw new IllegalArgumentException("factory must not be null");
        } else if (this.g != b) {
            this.g = b;
            MediaRouteButton mediaRouteButton = this.h;
            if (mediaRouteButton != null) {
                mediaRouteButton.setDialogFactory(b);
            }
        }
    }
}
