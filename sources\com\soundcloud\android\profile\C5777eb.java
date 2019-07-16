package com.soundcloud.android.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

/* renamed from: com.soundcloud.android.profile.eb reason: case insensitive filesystem */
/* compiled from: UserBioRenderer.kt */
public final class C5777eb extends C5541_ta<C5772db> {
    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        return LayoutInflater.from(viewGroup.getContext()).inflate(l.user_detail_bio_item, viewGroup, false);
    }

    public void a(int i, View view, C5772db dbVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(dbVar, "item");
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.bio_text);
        C7471uYa.a((Object) customFontTextView, "itemView.bio_text");
        customFontTextView.setText(C7315sGa.b.a(dbVar.a()));
    }
}
