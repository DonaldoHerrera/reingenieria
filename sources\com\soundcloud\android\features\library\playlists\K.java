package com.soundcloud.android.features.library.playlists;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.RadioButton;
import com.soundcloud.android.features.library.aa.i;
import com.soundcloud.android.features.library.playlists.J.a;
import com.soundcloud.android.view.customfontviews.CustomFontToggleButton;

/* compiled from: PlaylistOptionsPresenter.kt */
final class K implements OnClickListener {
    final /* synthetic */ View a;
    final /* synthetic */ J b;
    final /* synthetic */ Context c;
    final /* synthetic */ C3871sda d;
    final /* synthetic */ a e;

    K(View view, J j, Context context, C3871sda sda, a aVar) {
        this.a = view;
        this.b = j;
        this.c = context;
        this.d = sda;
        this.e = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3911xda xda;
        RadioButton radioButton = (RadioButton) this.a.findViewById(i.sort_by_updated_at);
        C7471uYa.a((Object) radioButton, "sortByUpdatedAt");
        if (radioButton.isChecked()) {
            xda = C3911xda.UPDATED_AT;
        } else {
            RadioButton radioButton2 = (RadioButton) this.a.findViewById(i.sort_by_title);
            C7471uYa.a((Object) radioButton2, "sortByTitle");
            if (radioButton2.isChecked()) {
                xda = C3911xda.TITLE;
            } else {
                xda = C3911xda.ADDED_AT;
            }
        }
        a aVar = this.e;
        CustomFontToggleButton customFontToggleButton = (CustomFontToggleButton) this.a.findViewById(i.show_likes);
        C7471uYa.a((Object) customFontToggleButton, "showLikes");
        boolean isChecked = customFontToggleButton.isChecked();
        CustomFontToggleButton customFontToggleButton2 = (CustomFontToggleButton) this.a.findViewById(i.show_posts);
        C7471uYa.a((Object) customFontToggleButton2, "showPosts");
        boolean isChecked2 = customFontToggleButton2.isChecked();
        CustomFontToggleButton customFontToggleButton3 = (CustomFontToggleButton) this.a.findViewById(i.show_offline);
        C7471uYa.a((Object) customFontToggleButton3, "showOffline");
        aVar.a(new C3871sda(xda, isChecked, isChecked2, customFontToggleButton3.isChecked()));
    }
}
