package com.soundcloud.android.features.record;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.io.File;
import java.io.IOException;

/* compiled from: PlaybackStream */
class F implements Creator<PlaybackStream> {
    F() {
    }

    public PlaybackStream createFromParcel(Parcel parcel) {
        try {
            PlaybackStream playbackStream = new PlaybackStream(C3671x.a(new File(parcel.readString())));
            playbackStream.c = parcel.readLong();
            playbackStream.d = parcel.readLong();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            playbackStream.g = z;
            playbackStream.f = (PlaybackFilter) parcel.readParcelable(getClass().getClassLoader());
            playbackStream.p();
            return playbackStream;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PlaybackStream[] newArray(int i) {
        return new PlaybackStream[i];
    }
}
