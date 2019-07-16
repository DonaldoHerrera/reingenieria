package com.soundcloud.android.playback.views;

import android.os.Parcel;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.soundcloud.android.ia.i;

public abstract class PlaybackRemoteViews extends RemoteViews {
    private int a;
    private int b;

    public PlaybackRemoteViews(String str, int i, int i2, int i3) {
        super(str, i);
        this.a = i2;
        this.b = i3;
    }

    public void a(boolean z) {
        setViewVisibility(i.btn_like, z ? 0 : 8);
    }

    public void b(CharSequence charSequence) {
        setTextViewText(i.title_txt, charSequence);
    }

    public void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            setViewVisibility(i.separator_txt, 8);
            setViewVisibility(i.user_txt, 8);
            return;
        }
        setTextViewText(i.user_txt, charSequence);
        setViewVisibility(i.separator_txt, 0);
        setViewVisibility(i.user_txt, 0);
    }

    public void b(boolean z) {
        setImageViewResource(i.toggle_playback, z ? this.b : this.a);
    }

    public PlaybackRemoteViews(Parcel parcel) {
        super(parcel);
    }
}
