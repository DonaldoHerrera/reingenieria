package com.soundcloud.android.ads;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.soundcloud.android.ads.C2617ra.b;
import com.soundcloud.android.ads.C2617ra.c;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.stream.C6109va.e;
import com.soundcloud.android.view.AspectRatioTextureView;
import com.soundcloud.android.view.CircularProgressBar;
import com.soundcloud.android.view.IconToggleButton;

/* compiled from: VideoAdItemRenderer */
public class id extends C2629ua<e> {
    /* access modifiers changed from: private */
    public final Resources b;
    private final C5327TLa c;
    /* access modifiers changed from: private */
    public final Ga d;
    private final C5694cGa e;

    /* compiled from: VideoAdItemRenderer */
    class a extends C5378VEa<e> {
        private TextView a;
        private TextView b;
        /* access modifiers changed from: private */
        public AspectRatioTextureView c;
        /* access modifiers changed from: private */
        public IconToggleButton d;
        /* access modifiers changed from: private */
        public Button e;
        /* access modifiers changed from: private */
        public CircularProgressBar f;
        /* access modifiers changed from: private */
        public View g;
        /* access modifiers changed from: private */
        public ImageButton h;
        /* access modifiers changed from: private */
        public View i;
        /* access modifiers changed from: private */
        public TextView j;
        /* access modifiers changed from: private */
        public TextView k;
        /* access modifiers changed from: private */
        public TextView l;
        /* access modifiers changed from: private */
        public boolean m;

        a(View view) {
            super(view);
            view.setTag(this);
            this.a = (TextView) view.findViewById(i.ad_item);
            this.b = (TextView) view.findViewById(i.why_ads);
            this.c = (AspectRatioTextureView) view.findViewById(i.video_view);
            this.d = (IconToggleButton) view.findViewById(i.video_volume_control);
            this.e = (Button) view.findViewById(i.video_fullscreen_control);
            this.f = (CircularProgressBar) view.findViewById(i.video_progress);
            this.g = view.findViewById(i.viewability_layer);
            this.h = (ImageButton) view.findViewById(i.player_play);
            this.i = view.findViewById(i.footer_with_title);
            this.j = (TextView) view.findViewById(i.title);
            this.k = (TextView) view.findViewById(i.call_to_action_with_title);
            this.l = (TextView) view.findViewById(i.call_to_action_without_title);
        }

        private void l(a aVar) {
            aVar.m = false;
        }

        public /* synthetic */ void b(aa aaVar, a aVar, View view) {
            id.this.a(getAdapterPosition(), aaVar, aVar);
        }

        public /* synthetic */ void b(aa aaVar, View view) {
            id.this.a().a(new b(aaVar));
        }

        public void a(e eVar) {
            aa j2 = eVar.j();
            a a2 = id.this.c(this.itemView);
            a2.a.setText(id.this.b.getString(p.stream_sponsored_video));
            a2.c.setAspectRatio(j2.K());
            a2.c.setVisibility(4);
            a2.l(a2);
            id.this.a(j2, a2);
            id.this.a((View) a2.b);
            a2.d.setOnClickListener(new V(this, j2, a2));
            a2.h.setOnClickListener(new Y(this, j2));
            a2.c.setOnClickListener(new W(this, j2, a2));
            a2.e.setOnClickListener(new Z(this, j2));
            id.this.a(this.itemView, j2);
            id.this.d.a(j2.I()).a((C7733yKa<? super T>) new X<Object>(this));
        }

        public /* synthetic */ void a(aa aaVar, a aVar, View view) {
            id.this.b(getAdapterPosition(), aaVar, aVar);
        }

        public /* synthetic */ void a(aa aaVar, View view) {
            id.this.a(getAdapterPosition(), aaVar);
        }

        public /* synthetic */ void a(defpackage.C3431IZ.a aVar) {
            id.this.a(this.itemView, aVar.j(), aVar.l());
        }
    }

    id(Resources resources, C5327TLa tLa, Ga ga, C5694cGa cga) {
        this.b = resources;
        this.c = tLa;
        this.d = ga;
        this.e = cga;
    }

    /* access modifiers changed from: private */
    public a c(View view) {
        return (a) view.getTag();
    }

    /* access modifiers changed from: private */
    public void b(int i, aa aaVar, a aVar) {
        aVar.m = true;
        this.c.c(C3876taa.h, new C0071d(this.e.b(), i, aaVar));
    }

    /* access modifiers changed from: 0000 */
    public TextureView b(View view) {
        return c(view).c;
    }

    public C5378VEa<e> a(ViewGroup viewGroup) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(l.stream_video_ad_card, viewGroup, false));
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, aa aaVar) {
        a c2 = c(view);
        a().a(new c(c2.c, c2.g, aaVar));
    }

    /* access modifiers changed from: private */
    public void a(int i, aa aaVar, a aVar) {
        if (aVar.m) {
            a(i, aaVar);
        } else {
            b(i, aaVar, aVar);
        }
    }

    /* access modifiers changed from: private */
    public void a(int i, aa aaVar) {
        this.c.c(C3876taa.h, new c(this.e.b(), i, aaVar));
    }

    /* access modifiers changed from: private */
    public void a(aa aaVar, a aVar) {
        String m = aaVar.m() != null ? aaVar.m() : this.b.getString(p.ads_call_to_action);
        int i = 0;
        boolean z = aaVar.G() != null;
        aVar.i.setVisibility(z ? 0 : 8);
        TextView f = aVar.l;
        if (z) {
            i = 8;
        }
        f.setVisibility(i);
        if (z) {
            aVar.j.setText(aaVar.G());
            a(aaVar, aVar.k, m);
            return;
        }
        a(aaVar, aVar.l, m);
    }

    private void a(aa aaVar, TextView textView, String str) {
        textView.setText(str);
        textView.setOnClickListener(a((C3676c) aaVar));
    }

    public void a(View view, C4431ub ubVar, boolean z) {
        a c2 = c(view);
        boolean z2 = ubVar.j() || ubVar.k();
        boolean m = ubVar.m();
        boolean z3 = c2.c.getVisibility() == 0;
        c2.d.setChecked(!z);
        int i = 8;
        c2.d.setVisibility(m ? 8 : 0);
        c2.e.setVisibility(8);
        c2.h.setVisibility((ubVar.k() || m) ? 0 : 8);
        CircularProgressBar c3 = c2.f;
        if (ubVar.f()) {
            i = 0;
        }
        c3.setVisibility(i);
        if (!z3 && z2) {
            c2.c.setVisibility(0);
        } else if (m) {
            c2.c.setVisibility(4);
        }
    }
}
