package com.soundcloud.android.upsell;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.view.customfontviews.CustomFontButton;

/* compiled from: TitleBarUpsellController.kt */
final class h implements OnClickListener {
    final /* synthetic */ i a;
    final /* synthetic */ String b;
    final /* synthetic */ CustomFontButton c;
    final /* synthetic */ defpackage.Waa.h d;

    h(i iVar, String str, CustomFontButton customFontButton, defpackage.Waa.h hVar) {
        this.a = iVar;
        this.b = str;
        this.c = customFontButton;
        this.d = hVar;
    }

    public final void onClick(View view) {
        C3700b a2 = this.a.a;
        Waa a3 = Waa.a(this.d);
        C7471uYa.a((Object) a3, "UpgradeFunnelEvent.forTitleBarClick(tcode)");
        a2.a((J) a3);
        C4655rja b2 = this.a.d;
        C4621nja a4 = C4621nja.a(C3920yea.GENERAL);
        C7471uYa.a((Object) a4, "NavigationTarget.forUpgrade(UpsellContext.GENERAL)");
        b2.a(a4);
    }
}
