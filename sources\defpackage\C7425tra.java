package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.m;
import com.soundcloud.android.ia.p;

/* renamed from: tra reason: default package and case insensitive filesystem */
/* compiled from: PlaylistItemMenuRenderer */
class C7425tra implements b {
    private final a a;
    private final C2526g b;
    private final F c;
    private final C3700b d;
    private final C2436_U e;
    private final Resources f;
    private C4772BJa g;
    private C3863rda h;
    private C5512Zta i;

    /* renamed from: tra$a */
    /* compiled from: PlaylistItemMenuRenderer */
    interface a {
        void a();

        void a(Context context);

        void a(Context context, C3863rda rda);

        void a(C3508cda cda);

        void a(C3863rda rda);

        void a(boolean z);

        void b(Context context);

        void b(Context context, C3863rda rda);

        void c(Context context);

        void onDismiss();
    }

    C7425tra(a aVar, View view, defpackage.C4772BJa.a aVar2, C2526g gVar, F f2, C3700b bVar, C2436_U _u) {
        this.a = aVar;
        this.b = gVar;
        this.c = f2;
        this.d = bVar;
        this.e = _u;
        this.g = aVar2.a(view.getContext(), view);
        this.g.b(m.playlist_item_actions);
        this.g.b((b) this);
        this.g.a((b) this);
        this.f = view.getResources();
    }

    private void b(C3863rda rda) {
        this.g.b(i.toggle_repost, a(rda));
        this.g.b(i.share, f(rda));
        this.g.b(i.delete_playlist, d(rda));
        this.g.b(i.add_to_likes, !rda.m());
        c(rda.p());
    }

    private void c(boolean z) {
        this.g.a(i.toggle_repost).setTitle(z ? p.unpost : p.repost);
    }

    private boolean d(C3863rda rda) {
        return this.b.b(rda.e());
    }

    private boolean e(C3863rda rda) {
        return d(rda) || !rda.m();
    }

    private boolean f(C3863rda rda) {
        if ((!rda.m()) || d(rda)) {
            return true;
        }
        return false;
    }

    private void g(C3863rda rda) {
        b(rda.o());
        b(rda);
        c(rda);
        b();
        a();
        this.g.b();
    }

    /* access modifiers changed from: 0000 */
    public void a(C3863rda rda, C5512Zta zta) {
        this.h = rda;
        this.i = zta;
        g(rda);
    }

    public void onDismiss() {
        this.g = null;
        this.a.onDismiss();
    }

    private void d() {
        this.g.b(i.make_offline_available, true);
        this.g.b(i.make_offline_unavailable, false);
        this.g.b(i.upsell_offline_content, false);
    }

    private void e() {
        this.g.b(i.make_offline_available, false);
        this.g.b(i.make_offline_unavailable, true);
        this.g.b(i.upsell_offline_content, false);
    }

    private void c(C3863rda rda) {
        Boolean G = rda.G();
        if (!e(rda)) {
            c();
        } else if (this.e.l()) {
            a(G.booleanValue());
        } else if (this.e.b()) {
            f();
        } else {
            c();
        }
        if (this.g.a(i.upsell_offline_content).isVisible()) {
            this.d.a((J) Waa.b(this.c.a(), rda.a()));
        }
    }

    private void f() {
        this.g.b(i.make_offline_available, false);
        this.g.b(i.make_offline_unavailable, false);
        this.g.b(i.upsell_offline_content, true);
    }

    private void a() {
        this.g.b(i.go_to_artist, this.i.a());
    }

    private boolean a(C3863rda rda) {
        return !d(rda) && !rda.m();
    }

    private void a(boolean z) {
        if (z) {
            e();
        } else {
            d();
        }
    }

    private void b(boolean z) {
        this.g.a(i.add_to_likes, (CharSequence) this.f.getString(z ? p.btn_unlike : p.btn_like));
    }

    private void b() {
        this.g.b(i.play_next, true);
    }

    public boolean a(MenuItem menuItem, Context context) {
        int itemId = menuItem.getItemId();
        if (itemId == i.play_next) {
            this.a.a();
            return true;
        } else if (itemId == i.add_to_likes) {
            this.a.a(this.h);
            return true;
        } else {
            boolean z = false;
            if (itemId == i.toggle_repost) {
                a aVar = this.a;
                if (!this.h.p()) {
                    z = true;
                }
                aVar.a(z);
                return true;
            } else if (itemId == i.share) {
                this.a.a(context, this.h);
                return true;
            } else if (itemId == i.upsell_offline_content) {
                this.a.b(context);
                return true;
            } else if (itemId == i.make_offline_available) {
                this.a.b(context, this.h);
                return true;
            } else if (itemId == i.make_offline_unavailable) {
                this.a.a(context);
                return true;
            } else if (itemId == i.delete_playlist) {
                this.a.c(context);
                return true;
            } else if (itemId != i.go_to_artist) {
                return false;
            } else {
                this.a.a(this.h.e());
                return true;
            }
        }
    }

    private void c() {
        this.g.b(i.make_offline_available, false);
        this.g.b(i.make_offline_unavailable, false);
        this.g.b(i.upsell_offline_content, false);
    }
}
