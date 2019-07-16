package com.soundcloud.android.playback.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: PlayerWidgetRemoteViews */
class z implements Creator<PlayerWidgetRemoteViews> {
    z() {
    }

    public PlayerWidgetRemoteViews createFromParcel(Parcel parcel) {
        return new PlayerWidgetRemoteViews(parcel);
    }

    public PlayerWidgetRemoteViews[] newArray(int i) {
        return new PlayerWidgetRemoteViews[i];
    }
}
