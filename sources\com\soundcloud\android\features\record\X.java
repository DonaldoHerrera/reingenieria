package com.soundcloud.android.features.record;

import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* compiled from: ScAudioTrack */
public class X extends AudioTrack {
    private final byte[] a;

    public X(C3668u uVar, int i) {
        super(3, uVar.j, uVar.a(false), uVar.getFormat(), i, 1);
        this.a = new byte[i];
    }

    public int a(ByteBuffer byteBuffer, int i) {
        byteBuffer.get(this.a, 0, i);
        return write(this.a, 0, i);
    }
}
