package com.soundcloud.android.ads;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.ads.Zc.a;
import com.soundcloud.android.foundation.ads.ea;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.ca;
import com.soundcloud.android.image.ca.b;

/* compiled from: VisualPrestitialView */
class md extends Zc {
    private final N a;
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa b = new UPa();
    ImageView c;
    View d;

    md(N n) {
        this.a = n;
    }

    public void a(AppCompatActivity appCompatActivity, ea eaVar, a aVar) {
        this.c = (ImageView) appCompatActivity.findViewById(i.ad_image_view);
        this.d = appCompatActivity.findViewById(i.btn_continue);
        this.b.b((VPa) this.a.a(eaVar.f(), eaVar.v(), this.c).a((C7256rQa<? super T>) C2556da.a).c(C5220Pua.a((C6776kQa<T>) new C2544aa<T>(aVar, eaVar))));
        this.d.setOnClickListener(new C2552ca(aVar));
        this.c.setOnClickListener(new C2548ba(aVar, eaVar));
    }

    static /* synthetic */ boolean a(ca caVar) throws Exception {
        return caVar instanceof b;
    }
}
