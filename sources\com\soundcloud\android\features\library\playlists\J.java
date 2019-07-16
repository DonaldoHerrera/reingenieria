package com.soundcloud.android.features.library.playlists;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.RadioButton;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.features.library.aa.i;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.features.library.aa.p;
import com.soundcloud.android.view.customfontviews.CustomFontToggleButton;

@EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/soundcloud/android/features/library/playlists/PlaylistOptionsPresenter;", "", "featureOperations", "Lcom/soundcloud/android/configuration/plans/FeatureOperations;", "collection2Experiment", "Lcom/soundcloud/android/configuration/experiments/Collection2Experiment;", "(Lcom/soundcloud/android/configuration/plans/FeatureOperations;Lcom/soundcloud/android/configuration/experiments/Collection2Experiment;)V", "showOptions", "", "context", "Landroid/content/Context;", "listener", "Lcom/soundcloud/android/features/library/playlists/PlaylistOptionsPresenter$Listener;", "initialOptions", "Lcom/soundcloud/android/foundation/domain/playable/PlaylistsOptions;", "showOptions$collections_ui_release", "Listener", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: PlaylistOptionsPresenter.kt */
public final class J {
    private final C2436_U a;
    private final C2040FU b;

    /* compiled from: PlaylistOptionsPresenter.kt */
    public interface a {
        void a(C3871sda sda);
    }

    public J(C2436_U _u, C2040FU fu) {
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(fu, "collection2Experiment");
        this.a = _u;
        this.b = fu;
    }

    public final void a(Context context, a aVar, C3871sda sda) {
        C7471uYa.b(context, "context");
        C7471uYa.b(aVar, CastExtraArgs.LISTENER);
        C7471uYa.b(sda, "initialOptions");
        View inflate = View.inflate(context, l.dialog_collections_options, null);
        CustomFontToggleButton customFontToggleButton = (CustomFontToggleButton) inflate.findViewById(i.show_likes);
        String str = "showLikes";
        C7471uYa.a((Object) customFontToggleButton, str);
        customFontToggleButton.setTextOn(context.getResources().getString(p.collections_options_toggle_likes));
        CustomFontToggleButton customFontToggleButton2 = (CustomFontToggleButton) inflate.findViewById(i.show_likes);
        C7471uYa.a((Object) customFontToggleButton2, str);
        customFontToggleButton2.setTextOff(context.getResources().getString(p.collections_options_toggle_likes));
        CustomFontToggleButton customFontToggleButton3 = (CustomFontToggleButton) inflate.findViewById(i.show_likes);
        C7471uYa.a((Object) customFontToggleButton3, str);
        customFontToggleButton3.setChecked(sda.a());
        CustomFontToggleButton customFontToggleButton4 = (CustomFontToggleButton) inflate.findViewById(i.show_posts);
        C7471uYa.a((Object) customFontToggleButton4, "showPosts");
        customFontToggleButton4.setChecked(sda.c());
        RadioButton radioButton = (RadioButton) inflate.findViewById(i.sort_by_title);
        C7471uYa.a((Object) radioButton, "sortByTitle");
        boolean z = true;
        radioButton.setChecked(sda.d() == C3911xda.TITLE);
        RadioButton radioButton2 = (RadioButton) inflate.findViewById(i.sort_by_added_at);
        C7471uYa.a((Object) radioButton2, "sortByAddedAt");
        radioButton2.setChecked(sda.d() == C3911xda.ADDED_AT);
        RadioButton radioButton3 = (RadioButton) inflate.findViewById(i.sort_by_updated_at);
        String str2 = "sortByUpdatedAt";
        C7471uYa.a((Object) radioButton3, str2);
        if (sda.d() != C3911xda.UPDATED_AT) {
            z = false;
        }
        radioButton3.setChecked(z);
        RadioButton radioButton4 = (RadioButton) inflate.findViewById(i.sort_by_updated_at);
        C7471uYa.a((Object) radioButton4, str2);
        radioButton4.setVisibility(this.b.b() ? 0 : 8);
        String str3 = "showOffline";
        if (this.a.l()) {
            CustomFontToggleButton customFontToggleButton5 = (CustomFontToggleButton) inflate.findViewById(i.show_offline);
            C7471uYa.a((Object) customFontToggleButton5, str3);
            customFontToggleButton5.setVisibility(0);
            CustomFontToggleButton customFontToggleButton6 = (CustomFontToggleButton) inflate.findViewById(i.show_offline);
            C7471uYa.a((Object) customFontToggleButton6, str3);
            customFontToggleButton6.setChecked(sda.b());
        } else {
            CustomFontToggleButton customFontToggleButton7 = (CustomFontToggleButton) inflate.findViewById(i.show_offline);
            C7471uYa.a((Object) customFontToggleButton7, str3);
            customFontToggleButton7.setVisibility(8);
            CustomFontToggleButton customFontToggleButton8 = (CustomFontToggleButton) inflate.findViewById(i.show_offline);
            C7471uYa.a((Object) customFontToggleButton8, str3);
            customFontToggleButton8.setChecked(false);
        }
        androidx.appcompat.app.C0325l.a aVar2 = new androidx.appcompat.app.C0325l.a(context);
        aVar2.b(inflate);
        aVar2.a(17039360, (OnClickListener) L.a);
        int i = p.btn_done;
        K k = new K(inflate, this, context, sda, aVar);
        aVar2.c(i, (OnClickListener) k);
        aVar2.c();
    }
}
