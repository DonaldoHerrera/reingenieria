package com.soundcloud.flippernative;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import java.nio.ByteBuffer;

public class AndroidPlatformDecoder {
    public static final int AAC_LC_PROFILE = 2;
    public static final String AAC_MIME_TYPE = new String("audio/mp4a-latm");
    public static final int AAC_SAMPLE_RATE = 48000;
    public static final int CHANNEL_COUNT = 2;
    public static final long DECODER_TIMEOUT_US = 50000;
    public static final String MP3_MIME_TYPE = new String("audio/mpeg");
    private static final String TAG = "AndroidPlatformDecoder";
    private MediaCodec codec;
    private ByteBuffer[] codecInputBuffers;
    private ByteBuffer[] codecOutputBuffers;
    private BufferInfo info;
    private boolean isOpen = false;
    private boolean sawOutputEOS;

    private void configureCodec(String str) {
        MediaFormat mediaFormat;
        if (str.equalsIgnoreCase(AAC_MIME_TYPE)) {
            mediaFormat = getAACMediaFormat();
        } else if (str.equalsIgnoreCase(MP3_MIME_TYPE)) {
            mediaFormat = MediaFormat.createAudioFormat(MP3_MIME_TYPE, 44100, 2);
        } else {
            throw new IllegalStateException("Unsupported mime type!");
        }
        this.codec.configure(mediaFormat, null, null, 0);
    }

    private void createDecoder(String str) {
        this.codec = createGoogleDecoder(str);
        if (this.codec == null) {
            Log.w(TAG, "Failed to create google software decoder. Creating decoder by mime type..");
            this.codec = createDecoderForMimeType(str);
        }
    }

    private static MediaCodec createDecoderForMimeType(String str) {
        String str2 = TAG;
        MediaCodec mediaCodec = null;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                String name = codecInfoAt.getName();
                if (isDecoderUsable(codecInfoAt)) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    int i2 = 0;
                    while (i2 < supportedTypes.length) {
                        if (supportedTypes[i2].equalsIgnoreCase(str)) {
                            MediaCodec createByCodecName = MediaCodec.createByCodecName(name);
                            try {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Creating decoder with name: ");
                                sb.append(name);
                                Log.i(str2, sb.toString());
                                return createByCodecName;
                            } catch (Exception e) {
                                Throwable th = e;
                                mediaCodec = createByCodecName;
                                e = th;
                                Log.e(str2, "Couldn't create decoder!", e);
                                return mediaCodec;
                            }
                        } else {
                            i2++;
                        }
                    }
                    continue;
                }
            }
        } catch (Exception e2) {
            e = e2;
            Log.e(str2, "Couldn't create decoder!", e);
            return mediaCodec;
        }
        return mediaCodec;
    }

    private static MediaCodec createGoogleDecoder(String str) {
        MediaCodec createByCodecName;
        String str2 = TAG;
        try {
            if (str.equalsIgnoreCase(MP3_MIME_TYPE)) {
                Log.i(str2, "Creating google MP3 decoder");
                createByCodecName = MediaCodec.createByCodecName("OMX.google.mp3.decoder");
            } else if (!str.equalsIgnoreCase(AAC_MIME_TYPE)) {
                return null;
            } else {
                Log.i(str2, "Creating google aac decoder");
                createByCodecName = MediaCodec.createByCodecName("OMX.google.aac.decoder");
            }
            return createByCodecName;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Couldn't create google decoder for mimeType: ");
            sb.append(str);
            sb.append(". Exception: ");
            Log.e(str2, sb.toString(), e);
            return null;
        }
    }

    private byte[] decode(byte[] bArr, long j, boolean z) {
        byte[] bArr2 = bArr;
        String str = TAG;
        byte[] bArr3 = new byte[0];
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(DECODER_TIMEOUT_US);
            if (dequeueInputBuffer >= 0) {
                ByteBuffer byteBuffer = this.codecInputBuffers[dequeueInputBuffer];
                int length = bArr2.length;
                for (int i = 0; i < length; i++) {
                    byteBuffer.putShort(i, (short) bArr2[i]);
                }
                this.codec.queueInputBuffer(dequeueInputBuffer, 0, length, j, z ? 4 : 0);
            }
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(this.info, DECODER_TIMEOUT_US);
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer2 = this.codecOutputBuffers[dequeueOutputBuffer];
                bArr3 = new byte[this.info.size];
                for (int i2 = 0; i2 < this.info.size; i2++) {
                    bArr3[i2] = byteBuffer2.get(this.info.offset + i2);
                }
                this.codec.releaseOutputBuffer(dequeueOutputBuffer, false);
                if ((this.info.flags & 4) != 0) {
                    Log.d(str, "saw output EOS.");
                    this.sawOutputEOS = true;
                }
            } else if (dequeueOutputBuffer == -3) {
                this.codecOutputBuffers = this.codec.getOutputBuffers();
                Log.d(str, "output buffers have changed.");
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.codec.getOutputFormat();
                StringBuilder sb = new StringBuilder();
                sb.append("output format has changed to ");
                sb.append(outputFormat);
                Log.d(str, sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("dequeueOutputBuffer returned ");
                sb2.append(dequeueOutputBuffer);
                Log.d(str, sb2.toString());
            }
        } catch (Exception e) {
            Log.e(str, "Exception while decoding!", e);
        }
        return bArr3;
    }

    private MediaFormat getAACMediaFormat() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", AAC_MIME_TYPE);
        mediaFormat.setInteger("channel-count", 2);
        mediaFormat.setInteger("sample-rate", AAC_SAMPLE_RATE);
        mediaFormat.setInteger("aac-profile", 2);
        int[] iArr = {96000, 88200, 64000, AAC_SAMPLE_RATE, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000};
        int i = -1;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == 48000) {
                StringBuilder sb = new StringBuilder();
                sb.append("kSamplingFreq ");
                sb.append(iArr[i2]);
                sb.append(" i : ");
                sb.append(i2);
                Log.d("TAG", sb.toString());
                i = i2;
            }
        }
        if (i != -1) {
            ByteBuffer allocate = ByteBuffer.allocate(2);
            allocate.put(0, (byte) ((i >> 1) | 16));
            allocate.put(1, (byte) (((i << 7) & 128) | 16));
            mediaFormat.setByteBuffer("csd-0", allocate);
            return mediaFormat;
        }
        throw new IllegalStateException("Sample rate is not in the list of supported sampling frequencies.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (android.os.Build.DEVICE.startsWith("HM") != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00eb, code lost:
        if ("SCV31".equals(android.os.Build.DEVICE) != false) goto L_0x00ed;
     */
    private static boolean isDecoderUsable(MediaCodecInfo mediaCodecInfo) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        String name = mediaCodecInfo.getName();
        if (VERSION.SDK_INT < 21 && ("CIPAACDecoder".equals(name) || "CIPMP3Decoder".equals(name) || "CIPVorbisDecoder".equals(name) || "CIPAMRNBDecoder".equals(name) || "AACDecoder".equals(name) || "MP3Decoder".equals(name))) {
            return false;
        }
        if (VERSION.SDK_INT < 18 && "OMX.SEC.MP3.Decoder".equals(name)) {
            return false;
        }
        if (VERSION.SDK_INT < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(name)) {
            if (!"a70".equals(Build.DEVICE)) {
                if ("Xiaomi".equals(Build.MANUFACTURER)) {
                }
            }
            return false;
        }
        if (VERSION.SDK_INT < 24 && ("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name))) {
            if ("samsung".equals(Build.MANUFACTURER)) {
                if (!Build.DEVICE.startsWith("zeroflte") && !Build.DEVICE.startsWith("zerolte") && !Build.DEVICE.startsWith("zenlte")) {
                    if (!"SC-05G".equals(Build.DEVICE)) {
                        if (!"marinelteatt".equals(Build.DEVICE)) {
                            if (!"404SC".equals(Build.DEVICE)) {
                                if (!"SC-04G".equals(Build.DEVICE)) {
                                }
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public void close() {
        stop();
        if (this.isOpen) {
            this.codec.release();
        }
        this.sawOutputEOS = false;
        this.isOpen = false;
    }

    public boolean isOutputEOS() {
        return this.sawOutputEOS;
    }

    public boolean open(String str) {
        createDecoder(str);
        if (this.codec == null) {
            return false;
        }
        configureCodec(str);
        this.sawOutputEOS = false;
        this.isOpen = true;
        return true;
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
