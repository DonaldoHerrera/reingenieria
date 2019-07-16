package com.soundcloud.android.ads;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3692t;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.o;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.ca;
import com.soundcloud.android.image.ca.b;
import java.util.Date;

/* renamed from: com.soundcloud.android.ads.rb reason: case insensitive filesystem */
/* compiled from: AppInstallItemRenderer */
public class C2618rb extends C2629ua<com.soundcloud.android.stream.C6109va.a> {
    /* access modifiers changed from: private */
    public final Resources b;
    /* access modifiers changed from: private */
    public final C5408WFa c;
    /* access modifiers changed from: private */
    public final N d;
    /* access modifiers changed from: private */
    public final C5694cGa e;
    /* access modifiers changed from: private */
    public final C5327TLa f;
    /* access modifiers changed from: private */
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    public final UPa g = new UPa();

    /* renamed from: com.soundcloud.android.ads.rb$a */
    /* compiled from: AppInstallItemRenderer */
    class a extends C5378VEa<com.soundcloud.android.stream.C6109va.a> {
        private TextView a;
        private TextView b;
        private TextView c;
        private TextView d;
        private ImageView e;
        private RatingBar f;
        private TextView g;

        a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(i.ad_item);
            this.b = (TextView) view.findViewById(i.app_name);
            this.c = (TextView) view.findViewById(i.ratings_count);
            this.d = (TextView) view.findViewById(i.call_to_action);
            this.e = (ImageView) view.findViewById(i.image);
            this.f = (RatingBar) view.findViewById(i.rating_bar);
            this.g = (TextView) view.findViewById(i.why_ads);
        }

        public void a(com.soundcloud.android.stream.C6109va.a aVar) {
            C3692t j = aVar.j();
            C2618rb.this.g.b((VPa) C2618rb.this.d.a(j.f(), j.r(), this.e).a((C7256rQa<? super T>) C2589k.a).c(C5220Pua.a((C6776kQa<T>) new C2585j<T>(this, j))));
            this.a.setText(C2618rb.this.b.getString(p.stream_sponsored_app));
            this.b.setText(j.t());
            this.c.setText(C2618rb.this.b.getQuantityString(o.ads_app_ratings, j.u(), new Object[]{C2618rb.this.c.a((long) j.u())}));
            this.d.setText(j.o());
            this.f.setRating(j.v());
            C2618rb.this.a((View) this.g);
            a(j);
        }

        static /* synthetic */ boolean a(ca caVar) throws Exception {
            return caVar instanceof b;
        }

        public /* synthetic */ void a(C3692t tVar, ca caVar) throws Exception {
            Date b2 = C2618rb.this.e.b();
            tVar.a(b2);
            C2618rb.this.f.c(C3876taa.h, new defpackage.C3431IZ.d.a(b2, getAdapterPosition(), tVar));
        }

        private void a(C3692t tVar) {
            OnClickListener a2 = C2618rb.this.a((C3676c) tVar);
            this.d.setOnClickListener(a2);
            this.e.setOnClickListener(a2);
        }
    }

    public C2618rb(Resources resources, C5408WFa wFa, N n, C5694cGa cga, C5327TLa tLa) {
        this.b = resources;
        this.c = wFa;
        this.d = n;
        this.e = cga;
        this.f = tLa;
    }

    public a a(ViewGroup viewGroup) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(l.stream_app_install_card, viewGroup, false));
    }
}
