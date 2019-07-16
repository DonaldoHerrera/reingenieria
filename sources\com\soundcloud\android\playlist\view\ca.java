package com.soundcloud.android.playlist.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.upsell.m;

/* compiled from: PlaylistUpsellItemRenderer.kt */
public final class ca extends m<C6260cqa, f> {
    public ca(C2436_U _u) {
        C7471uYa.b(_u, "featureOperations");
        super(_u);
    }

    /* access modifiers changed from: protected */
    public String a(Context context) {
        C7471uYa.b(context, "context");
        String string = context.getString(p.upsell_playlist_upgrade_description);
        C7471uYa.a((Object) string, "context.getString(R.stri…list_upgrade_description)");
        return string;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        super.b(viewGroup);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.playlist_upsell_item, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…sell_item, parent, false)");
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
        String string = context.getString(p.upsell_playlist_upgrade_title);
        C7471uYa.a((Object) string, "context.getString(R.stri…l_playlist_upgrade_title)");
        return string;
    }
}
