package com.soundcloud.android.upsell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.stream.C6109va;
import com.soundcloud.android.stream.C6109va.c;

/* compiled from: StreamUpsellItemRenderer.kt */
public final class e extends m<C6109va, c> {
    public e(C2436_U _u) {
        C7471uYa.b(_u, "featureOperations");
        super(_u);
    }

    /* access modifiers changed from: protected */
    public String a(Context context) {
        C7471uYa.b(context, "context");
        String string = context.getString(p.upsell_stream_upgrade_description);
        C7471uYa.a((Object) string, "context.getString(R.stri…ream_upgrade_description)");
        return string;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        super.b(viewGroup);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.upsell_card, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…sell_card, parent, false)");
        return inflate;
    }

    /* access modifiers changed from: protected */
    public String a(Context context, int i) {
        C7471uYa.b(context, "context");
        String string = context.getString(p.upsell_stream_buy_trial, new Object[]{Integer.valueOf(i)});
        C7471uYa.a((Object) string, "context.getString(R.stri…eam_buy_trial, trialDays)");
        return string;
    }

    /* access modifiers changed from: protected */
    public String b(Context context) {
        C7471uYa.b(context, "context");
        String string = context.getString(p.upsell_stream_upgrade_title);
        C7471uYa.a((Object) string, "context.getString(R.stri…ell_stream_upgrade_title)");
        return string;
    }
}
