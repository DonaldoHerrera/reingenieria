package com.soundcloud.android.ads;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import androidx.appcompat.app.C0325l.a;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.customfontviews.b;

/* compiled from: WhyAdsDialogPresenter */
public class od {
    private final C4655rja a;
    private final C2436_U b;
    private final C3700b c;

    public od(C4655rja rja, C2436_U _u, C3700b bVar) {
        this.a = rja;
        this.b = _u;
        this.c = bVar;
    }

    private void b(b bVar, a aVar) {
        aVar.b(bVar.b(p.ads_why_ads_upsell_dialog_message).a());
        aVar.c(p.upsell_remove_ads, (OnClickListener) new C2566ea(this));
        aVar.a(17039370, (OnClickListener) null);
    }

    public void a(Context context) {
        b c2 = new b(context).c(p.ads_why_ads);
        a aVar = new a(context);
        if (this.b.a()) {
            this.c.a((J) Waa.R());
            b(c2, aVar);
        } else {
            a(c2, aVar);
        }
        C5232QGa.a((Dialog) aVar.a());
    }

    private void a(b bVar, a aVar) {
        aVar.b(bVar.b(p.ads_why_ads_dialog_message).a());
        aVar.c(17039370, (OnClickListener) null);
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        this.a.a(C4621nja.a(C3920yea.ADS));
        this.c.a((J) Waa.Q());
    }
}
