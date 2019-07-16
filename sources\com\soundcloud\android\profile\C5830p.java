package com.soundcloud.android.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.profile.P.b;

/* renamed from: com.soundcloud.android.profile.p reason: case insensitive filesystem */
/* compiled from: EndOfListDividerRenderer.kt */
public final class C5830p extends C5541_ta<b> {
    public void a(int i, View view, b bVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(bVar, "item");
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.profile_user_sounds_end_of_list_divider, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…t_divider, parent, false)");
        return inflate;
    }
}
