package com.soundcloud.android.features.record;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.soundcloud.android.features.record.y reason: case insensitive filesystem */
/* compiled from: AudioWriter */
public interface C3672y extends Closeable {
    int a(ByteBuffer byteBuffer, int i) throws IOException;

    boolean g(long j) throws IOException;

    long getDuration();

    C3671x u() throws IOException;

    C3668u w();

    void y() throws IOException;
}
