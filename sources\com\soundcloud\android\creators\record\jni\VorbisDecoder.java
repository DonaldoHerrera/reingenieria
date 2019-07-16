package com.soundcloud.android.creators.record.jni;

import android.util.Log;
import java.io.File;
import java.nio.ByteBuffer;

public class VorbisDecoder {
    private static final boolean ALIGN_SEEK_ON_PAGE = false;
    private static final String TAG = "VorbisDecoder";
    private int decoder_state;
    public final File file;

    static {
        try {
            System.loadLibrary("soundcloud_vorbis_decoder");
        } catch (UnsatisfiedLinkError e) {
            if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
                throw e;
            }
        }
    }

    public VorbisDecoder(File file2) throws DecoderException {
        this.file = file2;
        int init = init(file2.getAbsolutePath());
        if (init != 0) {
            throw new DecoderException("Error initializing decoder", init);
        }
    }

    private native int decodeToFile(String str);

    private native int init(String str);

    public native int decode(ByteBuffer byteBuffer, int i);

    public void decodeToFile(File file2) throws DecoderException {
        int decodeToFile = decodeToFile(file2.getAbsolutePath());
        if (decodeToFile < 0) {
            throw new DecoderException("decode return < 0", decodeToFile);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        if (getState() >= 0) {
            Log.w(TAG, "still unreleased in finalize() - call release() when done with decode");
            release();
        }
    }

    public native VorbisInfo getInfo();

    public native int getState();

    public int pcmSeek(long j) {
        return pcmSeek(j, false);
    }

    public native int pcmSeek(long j, boolean z);

    public native void release();

    public int timeSeek(double d) {
        return timeSeek(d, false);
    }

    public native int timeSeek(double d, boolean z);

    public native double timeTell();
}
