package com.soundcloud.android.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.profile.P.a;

/* renamed from: com.soundcloud.android.profile.n reason: case insensitive filesystem */
/* compiled from: DividerRenderer.kt */
public final class C5820n extends C5541_ta<a> {
    public void a(int i, View view, a aVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(aVar, "item");
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.profile_user_sounds_divider, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…s_divider, parent, false)");
        return inflate;
    }
}
