package com.soundcloud.flippernative;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.util.Log;
import com.soundcloud.flippernative.api.MediaCodecDelegate;
import com.soundcloud.flippernative.api.VectorChar;
import java.io.IOException;
import java.nio.ByteBuffer;

public class Decoder extends MediaCodecDelegate {
    private static final String TAG = "Mp3DecoderJava";
    private MediaCodec codec;
    private ByteBuffer[] codecInputBuffers;
    private ByteBuffer[] codecOutputBuffers;
    private BufferInfo info;
    private boolean isOpen = false;
    private boolean sawOutputEOS;

    private void createDecoder() {
        try {
            this.codec = MediaCodec.createByCodecName("OMX.google.mp3.decoder");
            if (this.codec == null) {
                this.codec = MediaCodec.createDecoderByType("audio/mpeg");
            }
            if (this.codec == null) {
                throw new IOException();
            }
        } catch (IOException unused) {
            Log.e(TAG, "Could not create MP3 decoder!");
        }
    }

    public void close() {
        stop();
        if (this.isOpen) {
            this.codec.release();
        }
        this.sawOutputEOS = false;
        this.isOpen = false;
    }

    public VectorChar decode(VectorChar vectorChar, long j, boolean z) {
        VectorChar vectorChar2 = new VectorChar();
        int dequeueInputBuffer = this.codec.dequeueInputBuffer(5000);
        if (dequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer = this.codecInputBuffers[dequeueInputBuffer];
            int size = (int) vectorChar.size();
            for (int i = 0; i < size; i++) {
                VectorChar vectorChar3 = vectorChar;
                byteBuffer.putShort(i, vectorChar.get(i));
            }
            this.codec.queueInputBuffer(dequeueInputBuffer, 0, size, j, z ? 4 : 0);
        }
        int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(this.info, 5000);
        String str = TAG;
        if (dequeueOutputBuffer >= 0) {
            ByteBuffer byteBuffer2 = this.codecOutputBuffers[dequeueOutputBuffer];
            VectorChar vectorChar4 = new VectorChar((long) this.info.size);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                BufferInfo bufferInfo = this.info;
                if (i2 >= bufferInfo.size) {
                    break;
                }
                int i4 = i3 + 1;
                vectorChar4.set(i3, (short) byteBuffer2.get(bufferInfo.offset + i2));
                i2++;
                i3 = i4;
            }
            this.codec.releaseOutputBuffer(dequeueOutputBuffer, false);
            if ((this.info.flags & 4) != 0) {
                Log.d(str, "saw output EOS.");
                this.sawOutputEOS = true;
            }
            return vectorChar4;
        } else if (dequeueOutputBuffer == -3) {
            this.codecOutputBuffers = this.codec.getOutputBuffers();
            Log.d(str, "output buffers have changed.");
            return vectorChar2;
        } else if (dequeueOutputBuffer == -2) {
            MediaFormat outputFormat = this.codec.getOutputFormat();
            StringBuilder sb = new StringBuilder();
            sb.append("output format has changed to ");
            sb.append(outputFormat);
            Log.d(str, sb.toString());
            return vectorChar2;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("dequeueOutputBuffer returned ");
            sb2.append(dequeueOutputBuffer);
            Log.d(str, sb2.toString());
            return vectorChar2;
        }
    }

    public boolean isOutputEOS() {
        return this.sawOutputEOS;
    }

    public void open() {
        createDecoder();
        this.codec.configure(MediaFormat.createAudioFormat("audio/mpeg", 44100, 2), null, null, 0);
        this.sawOutputEOS = false;
        this.isOpen = true;
    }

    public void start() {
        this.info = new BufferInfo();
        this.codec.start();
        this.codecInputBuffers = this.codec.getInputBuffers();
        this.codecOutputBuffers = this.codec.getOutputBuffers();
    }

    public void stop() {
        if (this.isOpen) {
            this.codec.stop();
        }
        this.info = null;
    }
}
