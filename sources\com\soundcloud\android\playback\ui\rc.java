package com.soundcloud.android.playback.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.N;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.C4519wc;
import com.soundcloud.android.settings.C5956m;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: VideoAdPresenter */
class rc extends Ca<tc> implements OnClickListener {
    private final N b;
    private final Aa c;
    private final com.soundcloud.android.playback.ui.Ab.a d;
    private final C6699jHa e;
    private final Resources f;

    /* compiled from: VideoAdPresenter */
    static class a extends com.soundcloud.android.playback.ui.Ca.a {
        /* access modifiers changed from: private */
        public final Ab A;
        /* access modifiers changed from: private */
        public final Iterable<View> B;
        Iterable<View> C = Collections.emptyList();
        private b D = b.INITIAL;
        /* access modifiers changed from: private */
        public final View r;
        /* access modifiers changed from: private */
        public final TextureView s;
        /* access modifiers changed from: private */
        public final View t;
        /* access modifiers changed from: private */
        public final View u;
        /* access modifiers changed from: private */
        public final View v;
        /* access modifiers changed from: private */
        public final View w;
        /* access modifiers changed from: private */
        public final View x;
        /* access modifiers changed from: private */
        public final View y;
        /* access modifiers changed from: private */
        public final View z;

        a(View view, com.soundcloud.android.playback.ui.Ab.a aVar) {
            super(view);
            this.r = view.findViewById(i.video_container);
            this.s = (TextureView) view.findViewById(i.video_view);
            this.t = view.findViewById(i.video_overlay_container);
            this.u = view.findViewById(i.video_overlay);
            this.v = view.findViewById(i.viewability_layer);
            this.w = view.findViewById(i.video_fullscreen_control);
            this.x = view.findViewById(i.video_shrink_control);
            this.y = view.findViewById(i.video_progress);
            this.z = view.findViewById(i.letterbox_background);
            this.A = aVar.a(this.u);
            this.B = C1943BD.b(Arrays.asList(new View[]{this.a, this.b, this.c, this.x, this.w, this.u, this.s, this.k, this.l, this.e}), this.q);
        }

        /* access modifiers changed from: 0000 */
        public boolean a(b bVar) {
            return this.D == bVar;
        }

        /* access modifiers changed from: 0000 */
        public void b(b bVar) {
            this.D = bVar;
        }

        /* access modifiers changed from: 0000 */
        public void a(boolean z2) {
            List list;
            if (z2) {
                list = a();
            } else {
                list = Collections.singletonList(this.t);
            }
            this.C = C1943BD.b(list, this.q);
        }

        private List<View> a() {
            return Arrays.asList(new View[]{this.l, this.m, this.k, this.h, this.t});
        }
    }

    /* compiled from: VideoAdPresenter */
    private enum b {
        INITIAL,
        INACTIVE,
        PAUSED
    }

    public rc(N n, Aa aa, com.soundcloud.android.playback.ui.Ab.a aVar, C6699jHa jha, Resources resources, C5956m mVar) {
        super(mVar);
        this.b = n;
        this.c = aa;
        this.d = aVar;
        this.e = jha;
        this.f = resources;
    }

    private void b(a aVar) {
        b(true, aVar.C);
        aVar.b(b.INITIAL);
    }

    private void c(a aVar) {
        a(aVar.C);
        b(true, aVar.C);
        aVar.b(b.PAUSED);
    }

    private a l(View view) {
        return (a) view.getTag();
    }

    public void a(View view, Set<C3799jda> set) {
    }

    public View g(View view) {
        b(l(view));
        return view;
    }

    public void h(View view) {
    }

    /* access modifiers changed from: 0000 */
    public TextureView j(View view) {
        return l(view).s;
    }

    /* access modifiers changed from: 0000 */
    public View k(View view) {
        return l(view).v;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == i.player_play || id == i.video_view || id == i.video_overlay) {
            this.c.d();
        } else if (id == i.player_next) {
            this.c.h();
        } else if (id == i.player_previous) {
            this.c.i();
        } else if (id == i.video_fullscreen_control) {
            this.c.g();
        } else if (id == i.video_shrink_control) {
            this.c.j();
        } else if (id == i.cta_button) {
            this.c.f();
        } else if (id == i.why_ads) {
            this.c.a(view.getContext());
        } else if (id == i.skip_ad) {
            this.c.k();
        } else {
            throw new IllegalArgumentException("Unexpected View ID");
        }
    }

    public View a(ViewGroup viewGroup, Xb xb) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.player_ad_video_page, viewGroup, false);
        a aVar = new a(inflate, this.d);
        inflate.setTag(aVar);
        aVar.u.setTag(aVar);
        return inflate;
    }

    public void a(View view, tc tcVar) {
        a l = l(view);
        a(l, tcVar.s(), false);
        a(view, tcVar, l);
        a((C4489sb) tcVar, (com.soundcloud.android.playback.ui.Ca.a) l, this.b, this.f);
        a((com.soundcloud.android.playback.ui.Ca.a) l, (C4489sb) tcVar, this.f);
        a((OnClickListener) this, l.B);
        a((com.soundcloud.android.playback.ui.Ca.a) l, tcVar);
    }

    private void a(View view, tc tcVar, a aVar) {
        LayoutParams a2 = a(tcVar, aVar);
        view.setBackgroundColor(this.f.getColor(this.e.k() ? f.black : f.ad_default_background));
        aVar.s.setLayoutParams(a2);
        aVar.z.setLayoutParams(a2);
        aVar.v.setLayoutParams(a2);
        if (this.e.m()) {
            aVar.t.setLayoutParams(a2);
        }
        int i = 8;
        boolean z = false;
        aVar.w.setVisibility((!tcVar.s() || !this.e.m()) ? 8 : 0);
        View i2 = aVar.x;
        if (tcVar.s() && this.e.k()) {
            i = 0;
        }
        i2.setVisibility(i);
        if (tcVar.t() || !this.e.m()) {
            z = true;
        }
        aVar.a(z);
        if (!aVar.a(b.INITIAL)) {
            a(aVar, tcVar.s(), true);
            a(aVar, view.getContext());
        }
    }

    private LayoutParams a(tc tcVar, a aVar) {
        LayoutParams layoutParams = aVar.s.getLayoutParams();
        if (tcVar.t()) {
            int g = tcVar.q().g();
            float f2 = (float) g;
            float b2 = (float) tcVar.q().b();
            float a2 = a(aVar.r, f2, b2);
            layoutParams.width = (int) (f2 * a2);
            layoutParams.height = (int) (b2 * a2);
        } else if (this.e.m()) {
            layoutParams.width = aVar.r.getWidth() - (C6768kIa.a(this.f, 5) * 2);
            layoutParams.height = (int) (((float) layoutParams.width) / tcVar.r());
        } else {
            layoutParams.height = aVar.r.getHeight();
            layoutParams.width = (int) (((float) layoutParams.height) * tcVar.r());
        }
        return layoutParams;
    }

    private float a(View view, float f2, float f3) {
        int width = view.getWidth();
        float height = (float) view.getHeight();
        float f4 = (float) width;
        return f2 * height > f4 * f3 ? height / f3 : f4 / f2;
    }

    public void a(View view, C4519wc wcVar) {
        a((com.soundcloud.android.playback.ui.Ca.a) l(view), wcVar, this.f);
    }

    public void a(View view, C4431ub ubVar, boolean z, boolean z2, boolean z3) {
        a l = l(view);
        l.d.setVisibility(ubVar.p() ? 8 : 0);
        l.A.a(ubVar);
        a(l, ubVar, z);
        if (!z) {
            return;
        }
        if (l.a(b.INITIAL) && ubVar.j()) {
            a(l, view.getContext());
        } else if (l.a(b.PAUSED) && ubVar.p()) {
            a(l, view.getContext());
        } else if (!l.a(b.INITIAL) && !ubVar.p()) {
            c(l);
        }
    }

    private void a(a aVar, C4431ub ubVar, boolean z) {
        int i = 8;
        if (z) {
            View c2 = aVar.y;
            if (ubVar.f() && ubVar.p()) {
                i = 0;
            }
            c2.setVisibility(i);
            if (ubVar.j() && !a(aVar)) {
                aVar.s.setVisibility(0);
                return;
            }
            return;
        }
        View c3 = aVar.y;
        if (ubVar.p()) {
            i = 0;
        }
        c3.setVisibility(i);
    }

    private boolean a(a aVar) {
        return aVar.s.getVisibility() == 0;
    }

    private void a(a aVar, boolean z, boolean z2) {
        int i = 0;
        aVar.y.setVisibility(((aVar.d.getVisibility() == 0) || z2) ? 8 : 0);
        aVar.s.setVisibility(z2 ? 0 : 8);
        if (z) {
            aVar.z.setVisibility(z2 ? 8 : 0);
            View g = aVar.t;
            if (!z2) {
                i = 8;
            }
            g.setVisibility(i);
        }
    }

    private void a(a aVar, Context context) {
        a(aVar.C, AnimationUtils.loadAnimation(context, com.soundcloud.android.ia.a.ak_delayed_fade_out));
        aVar.b(b.INACTIVE);
    }
}
