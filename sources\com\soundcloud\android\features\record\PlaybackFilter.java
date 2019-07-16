package com.soundcloud.android.features.record;

import android.os.Parcelable;
import java.nio.ByteBuffer;

public interface PlaybackFilter extends Parcelable {
    ByteBuffer a(ByteBuffer byteBuffer, long j, long j2);
}
