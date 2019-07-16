package com.soundcloud.android.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.l;

/* renamed from: com.soundcloud.android.profile.hc reason: case insensitive filesystem */
/* compiled from: UserLoadingRenderer.kt */
public final class C5793hc extends C5541_ta<C5788gc> {
    public void a(int i, View view, C5788gc gcVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(gcVar, "item");
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        return LayoutInflater.from(viewGroup.getContext()).inflate(l.user_detail_loading_item, viewGroup, false);
    }
}
