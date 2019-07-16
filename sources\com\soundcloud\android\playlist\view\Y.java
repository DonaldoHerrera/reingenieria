package com.soundcloud.android.playlist.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.soundcloud.android.offline.C4070ce;
import com.soundcloud.android.offlinestate.OfflineStateButton;
import com.soundcloud.android.playback.ui.C4454gb;

/* compiled from: PlaylistEngagementsRenderer */
class Y {
    private final Context a;
    private final Resources b;
    private final defpackage.C4772BJa.a c;
    private final C4454gb d;
    private final Iea e;
    private final C4070ce f;
    private final C6834lGa g;

    /* compiled from: PlaylistEngagementsRenderer */
    private static final class a implements b {
        private final T a;
        private C6532gqa b;

        /* synthetic */ a(T t, C6532gqa gqa, X x) {
            this(t, gqa);
        }

        public boolean a(MenuItem menuItem, Context context) {
            int itemId = menuItem.getItemId();
            if (itemId == i.play_next) {
                this.a.h(this.b);
                return true;
            } else if (itemId == i.repost) {
                this.a.b(this.b, true);
                return true;
            } else if (itemId == i.unpost) {
                this.a.b(this.b, false);
                return true;
            } else if (itemId == i.share) {
                this.a.j(this.b);
                return true;
            } else if (itemId == i.shuffle) {
                this.a.i(this.b);
                return true;
            } else if (itemId == i.edit_playlist) {
                this.a.s();
                return true;
            } else if (itemId == i.upsell_offline_content) {
                this.a.f(this.b);
                return true;
            } else if (itemId == i.make_offline_available) {
                this.a.c(this.b);
                return true;
            } else if (itemId == i.make_offline_unavailable) {
                this.a.d(this.b);
                return true;
            } else if (itemId == i.delete_playlist) {
                this.a.a(this.b.a());
                return true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected menu item clicked ");
                sb.append(menuItem);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public void onDismiss() {
        }

        private a(T t, C6532gqa gqa) {
            this.a = t;
            this.b = gqa;
        }
    }

    Y(Context context, defpackage.C4772BJa.a aVar, C4454gb gbVar, Iea iea, C4070ce ceVar, C6834lGa lga) {
        this.a = context;
        this.d = gbVar;
        this.b = context.getResources();
        this.c = aVar;
        this.e = iea;
        this.f = ceVar;
        this.g = lga;
    }

    private void b(View view, T t, C6532gqa gqa) {
        a(view, gqa, t);
        b(view, gqa, t);
        c(view, t, gqa);
    }

    private void c(View view, T t, C6532gqa gqa) {
        int i = X.a[a(gqa).ordinal()];
        if (i == 1) {
            c(view, gqa, t);
        } else if (i == 2) {
            d(view, t, gqa);
        } else if (i == 3) {
            a(view);
        }
    }

    private void d(C6532gqa gqa, C4772BJa bJa) {
        if (gqa.g()) {
            bJa.a(i.shuffle, true);
        } else {
            bJa.a(i.shuffle, false);
        }
    }

    private void e(C4772BJa bJa) {
        bJa.b(i.make_offline_available, false);
        bJa.b(i.make_offline_unavailable, false);
        bJa.b(i.upsell_offline_content, true);
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, T t, C6532gqa gqa) {
        view.findViewById(i.playlist_engagement_bar).setVisibility(0);
        b(view, t, gqa);
        a(view, C5035Jsa.a(view.getResources(), gqa.p(), gqa.h()));
    }

    private void a(View view, String str) {
        ((TextView) view.findViewById(i.header_text)).setText(str);
    }

    private void b(View view, C6532gqa gqa, T t) {
        View findViewById = view.findViewById(i.playlist_details_overflow_button);
        C5736g gVar = new C5736g(this, view, findViewById, gqa, t);
        findViewById.setOnClickListener(gVar);
        if (gqa.r()) {
            this.e.a(Dea.a().a("edit_playlist").a(findViewById).b(p.edit_playlists_introductory_overlay_title).a(p.edit_playlists_introductory_overlay_description).a());
        }
    }

    private void d(View view, T t, C6532gqa gqa) {
        OfflineStateButton offlineStateButton = (OfflineStateButton) view.findViewById(i.offline_state_button);
        offlineStateButton.setVisibility(0);
        offlineStateButton.setOnClickListener(new C5737h(t, gqa));
    }

    private void c(C6532gqa gqa, C4772BJa bJa) {
        if (!gqa.l().m() || gqa.r()) {
            bJa.b(i.share, true);
        } else {
            bJa.b(i.share, false);
        }
    }

    private void a(View view, C6532gqa gqa, T t) {
        ToggleButton toggleButton = (ToggleButton) view.findViewById(i.toggle_like);
        if (gqa.l().m()) {
            toggleButton.setVisibility(8);
            return;
        }
        toggleButton.setOnClickListener(new C5734e(t, gqa, toggleButton));
        a(toggleButton, p.accessibility_like_action, o.accessibility_stats_likes, C4928GKa.c(Integer.valueOf(gqa.l().q())), gqa.l().o(), p.accessibility_stats_user_liked);
    }

    private void d(C4772BJa bJa) {
        bJa.b(i.make_offline_available, false);
        bJa.b(i.make_offline_unavailable, true);
        bJa.b(i.upsell_offline_content, false);
    }

    private void c(View view, C6532gqa gqa, T t) {
        OfflineStateButton offlineStateButton = (OfflineStateButton) view.findViewById(i.offline_state_button);
        offlineStateButton.setVisibility(0);
        a(offlineStateButton, gqa.l().r());
        offlineStateButton.setOnClickListener(new C5738i(this, gqa, t));
    }

    private void c(C4772BJa bJa) {
        bJa.b(i.make_offline_available, true);
        bJa.b(i.make_offline_unavailable, false);
        bJa.b(i.upsell_offline_content, false);
    }

    private void b(C6532gqa gqa, C4772BJa bJa) {
        boolean z = false;
        if (gqa.l().m() || gqa.r()) {
            bJa.b(i.repost, false);
            bJa.b(i.unpost, false);
            return;
        }
        boolean p = gqa.l().p();
        int i = i.repost;
        if (!p) {
            z = true;
        }
        bJa.b(i, z);
        bJa.b(i.unpost, p);
    }

    public /* synthetic */ void a(View view, View view2, C6532gqa gqa, T t, View view3) {
        C4772BJa a2 = this.c.a(view.getContext(), view2);
        a2.b(m.playlist_details_actions);
        a(gqa, a2);
        b(gqa, a2);
        c(gqa, a2);
        d(gqa, a2);
        a(a2);
        a(gqa, a2, t);
        a2.b((b) new a(t, gqa, null));
        a2.b();
    }

    private boolean b() {
        return this.f.a() && !this.g.a();
    }

    private void b(C4772BJa bJa) {
        bJa.b(i.make_offline_available, false);
        bJa.b(i.make_offline_unavailable, false);
        bJa.b(i.upsell_offline_content, false);
    }

    private void b(ToggleButton toggleButton, int i, int i2, C4928GKa<Integer> gKa, boolean z, int i3) {
        if (C5232QGa.a(this.a) && C5206PKa.a(toggleButton.getContentDescription())) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.getString(i));
            String str = ", ";
            if (gKa.c() && ((Integer) gKa.b()).intValue() >= 0) {
                sb.append(str);
                sb.append(this.b.getQuantityString(i2, ((Integer) gKa.b()).intValue(), new Object[]{gKa.b()}));
            }
            if (z) {
                sb.append(str);
                sb.append(this.b.getString(i3));
            }
            toggleButton.setContentDescription(sb.toString());
        }
    }

    private void a(C6532gqa gqa, C4772BJa bJa) {
        if (gqa.r()) {
            bJa.b(i.edit_playlist, true);
            bJa.b(i.delete_playlist, true);
            return;
        }
        bJa.b(i.edit_playlist, false);
        bJa.b(i.delete_playlist, false);
    }

    public /* synthetic */ void a(C6532gqa gqa, T t, View view) {
        a(gqa, t);
    }

    private void a(OfflineStateButton offlineStateButton, C3823mda mda) {
        if (C3823mda.REQUESTED == mda && b()) {
            offlineStateButton.b();
        } else if (C3823mda.REQUESTED != mda || !a()) {
            offlineStateButton.setState(mda);
        } else {
            offlineStateButton.a();
        }
    }

    private boolean a() {
        return !this.g.d();
    }

    private void a(C6532gqa gqa, T t) {
        if (gqa.l().G().booleanValue()) {
            t.d(gqa);
        } else {
            t.c(gqa);
        }
    }

    private void a(C6532gqa gqa, C4772BJa bJa, T t) {
        int i = X.a[a(gqa).ordinal()];
        if (i != 1) {
            if (i == 2) {
                e(bJa);
                t.g(gqa);
            } else if (i == 3) {
                b(bJa);
            }
        } else if (gqa.l().G().booleanValue()) {
            d(bJa);
        } else {
            c(bJa);
        }
    }

    private defpackage.C6532gqa.a a(C6532gqa gqa) {
        return (!gqa.l().m() || gqa.r()) ? gqa.i() : defpackage.C6532gqa.a.NONE;
    }

    private void a(View view) {
        view.findViewById(i.offline_state_button).setVisibility(8);
    }

    private void a(C4772BJa bJa) {
        bJa.b(i.play_next, true);
    }

    private void a(ToggleButton toggleButton, int i, int i2, C4928GKa<Integer> gKa, boolean z, int i3) {
        gKa.a((C7733yKa<? super T>) new C5735f<Object>(this, toggleButton));
        toggleButton.setChecked(z);
        b(toggleButton, i, i2, gKa, z, i3);
    }

    public /* synthetic */ void a(ToggleButton toggleButton, Integer num) {
        this.d.a(toggleButton, num.intValue(), h.ic_liked, h.ic_like);
    }
}
