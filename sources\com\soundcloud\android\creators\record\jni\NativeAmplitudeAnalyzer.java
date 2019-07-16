package com.soundcloud.android.creators.record.jni;

import com.soundcloud.android.features.record.C3668u;
import com.soundcloud.android.features.record.r;
import java.nio.ByteBuffer;

public class NativeAmplitudeAnalyzer implements r {
    private final int bytes_per_sample;
    private final int channels;
    private int current_adjusted_max_amplitude;
    private int last_max;
    private int last_value;

    static {
        try {
            System.loadLibrary("native_amplitude_analyzer");
        } catch (UnsatisfiedLinkError e) {
            if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
                throw e;
            }
        }
    }

    public NativeAmplitudeAnalyzer(C3668u uVar) {
        this.channels = uVar.k;
        this.bytes_per_sample = uVar.l / 8;
    }

    public native float frameAmplitude(ByteBuffer byteBuffer, int i);

    public native int getLastValue();
}
