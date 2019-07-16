package com.soundcloud.android.ads;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.ads.Zc.a;
import com.soundcloud.android.foundation.ads.X;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.ca;
import com.soundcloud.android.image.ca.b;

/* compiled from: SponsoredSessionCardView */
class bd extends Zc {
    private final N a;
    private final Resources b;
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa c = new UPa();
    private ImageView d;
    private TextView e;
    private TextView f;
    private TextView g;

    bd(N n, Resources resources) {
        this.a = n;
        this.b = resources;
    }

    public void a(View view, X x, a aVar, a aVar2) {
        a(view);
        this.c.b((VPa) this.a.a(x.f(), x.n().f(), this.d).a((C7256rQa<? super T>) J.a).c(C5220Pua.a((C6776kQa<T>) new G<T>(aVar, x, aVar2))));
        this.d.setOnClickListener(new I(aVar, x, aVar2));
        this.f.setText(aVar2.g);
        this.f.setOnClickListener(new F(aVar, aVar2, x));
        this.g.setText(aVar2.h);
        this.g.setOnClickListener(new H(aVar, aVar2, x));
        this.e.setText(a(aVar2, x));
    }

    static /* synthetic */ boolean a(ca caVar) throws Exception {
        return caVar instanceof b;
    }

    private void a(View view) {
        this.d = (ImageView) view.findViewById(i.ad_image_view);
        this.e = (TextView) view.findViewById(i.opt_in_text);
        this.f = (TextView) view.findViewById(i.btn_left);
        this.g = (TextView) view.findViewById(i.btn_right);
    }

    private String a(a aVar, X x) {
        String string = this.b.getString(aVar.f);
        if (aVar != a.OPT_IN_CARD) {
            return string;
        }
        return String.format(string, new Object[]{Integer.valueOf(x.m())});
    }
}
