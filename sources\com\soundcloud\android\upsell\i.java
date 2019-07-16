package com.soundcloud.android.upsell;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.customfontviews.CustomFontButton;

/* compiled from: TitleBarUpsellController.kt */
public final class i {
    /* access modifiers changed from: private */
    public final C3700b a;
    private final C2436_U b;
    private final Context c;
    /* access modifiers changed from: private */
    public final C4655rja d;
    private final Aca e;

    public i(C3700b bVar, C2436_U _u, Context context, C4655rja rja, Aca aca) {
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(context, "appContext");
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(aca, "upsellHeaderFeature");
        this.a = bVar;
        this.b = _u;
        this.c = context;
        this.d = rja;
        this.e = aca;
    }

    public final void a(Menu menu, Yca yca) {
        C7471uYa.b(menu, "menu");
        C7471uYa.b(yca, "source");
        MenuItem findItem = menu.findItem(com.soundcloud.android.ia.i.upsell_item_menu);
        if (findItem == null) {
            SDb.a((Throwable) new IllegalStateException("MenuItem for Upsell doesn't exist"));
        } else if (!this.b.s() || this.e.a()) {
            a(findItem);
        } else {
            String a2 = a(p.upsell_title_bar_go_plus);
            C7471uYa.a((Object) a2, "getUpsellTitle(R.string.upsell_title_bar_go_plus)");
            a(findItem, a2, a(yca));
        }
    }

    private final void a(MenuItem menuItem) {
        menuItem.setVisible(false);
    }

    private final void a(MenuItem menuItem, String str, h hVar) {
        menuItem.setVisible(true);
        View actionView = menuItem.getActionView();
        if (actionView != null) {
            CustomFontButton customFontButton = (CustomFontButton) ((ViewGroup) actionView).findViewById(com.soundcloud.android.ia.i.upsellTitleBarBtn);
            customFontButton.setText(str);
            C7471uYa.a((Object) customFontButton, "upsellBarBtn");
            customFontButton.setTypeface(customFontButton.getTypeface(), 1);
            customFontButton.setOnClickListener(new h(this, str, customFontButton, hVar));
            return;
        }
        throw new OVa("null cannot be cast to non-null type android.view.ViewGroup");
    }

    private final String a(int i) {
        return this.c.getString(i);
    }

    private final h a(Yca yca) {
        int i = g.a[yca.ordinal()];
        if (i == 1) {
            return h.UPSELL_FROM_DISCOVERY_GO;
        }
        if (i == 2) {
            return h.UPSELL_FROM_STREAM_GO;
        }
        if (i == 3) {
            return h.UPSELL_FROM_COLLECTION_GO;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown screen ");
        sb.append(yca);
        throw new k(sb.toString());
    }
}
