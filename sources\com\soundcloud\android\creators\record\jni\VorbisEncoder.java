package com.soundcloud.android.creators.record.jni;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.soundcloud.android.features.record.C3668u;
import com.soundcloud.android.features.record.C3673z;
import com.soundcloud.android.features.record.PlaybackFilter;
import com.soundcloud.android.features.record.ja;
import com.soundcloud.android.features.record.ja.a;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class VorbisEncoder {
    public static final int STATE_CLOSED = 2;
    public static final int STATE_PAUSED = 1;
    public static final int STATE_READY = 0;
    public static final String TAG = "VorbisEncoder";
    public final long channels;
    private int encoder_state;
    public final File file;
    public final float quality;
    public final long rate;

    static {
        try {
            System.loadLibrary("soundcloud_vorbis_encoder");
        } catch (UnsatisfiedLinkError e) {
            if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
                throw e;
            }
        }
    }

    public VorbisEncoder(File file2, String str, long j, long j2, float f) throws EncoderException {
        int init = init(file2.getAbsolutePath(), str, j, j2, f);
        if (init == 0) {
            this.file = file2;
            this.channels = j;
            this.rate = j2;
            this.quality = f;
            return;
        }
        throw new EncoderException("Error initialising encoder", init);
    }

    private static native int chop(String str, String str2, double d, double d2);

    private native int closeStream();

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0043  */
    public static int encodeFile(File file2, File file3, EncoderOptions encoderOptions) throws IOException {
        String c = C6630iGa.c(file2);
        if ("wav".equals(c)) {
            return encodeWav(file2, file3, encoderOptions);
        }
        if ("ogg".equals(c)) {
            return encodeVorbis(file2, file3, encoderOptions);
        }
        try {
            ja.a(file2);
            return encodeWav(file2, file3, encoderOptions);
        } catch (IOException unused) {
            VorbisDecoder vorbisDecoder = null;
            try {
                VorbisDecoder vorbisDecoder2 = new VorbisDecoder(file2);
                try {
                    int encodeVorbis = encodeVorbis(file2, file3, encoderOptions);
                    vorbisDecoder2.release();
                    return encodeVorbis;
                } catch (DecoderException unused2) {
                    vorbisDecoder = vorbisDecoder2;
                    if (vorbisDecoder != null) {
                        vorbisDecoder.release();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("File format of ");
                    sb.append(file2);
                    sb.append(" is not supported");
                    throw new IOException(sb.toString());
                } catch (Throwable th) {
                    th = th;
                    vorbisDecoder = vorbisDecoder2;
                    if (vorbisDecoder != null) {
                        vorbisDecoder.release();
                    }
                    throw th;
                }
            } catch (DecoderException unused3) {
                if (vorbisDecoder != null) {
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("File format of ");
                sb2.append(file2);
                sb2.append(" is not supported");
                throw new IOException(sb2.toString());
            } catch (Throwable th2) {
                th = th2;
                if (vorbisDecoder != null) {
                }
                throw th;
            }
        }
    }

    public static int encodeVorbis(File file2, File file3, EncoderOptions encoderOptions) throws IOException {
        VorbisEncoder vorbisEncoder;
        int decode;
        int i;
        EncoderOptions encoderOptions2 = encoderOptions;
        VorbisDecoder vorbisDecoder = new VorbisDecoder(file2);
        VorbisInfo info = vorbisDecoder.getInfo();
        PlaybackFilter playbackFilter = encoderOptions2.filter;
        ProgressListener progressListener = encoderOptions2.listener;
        File file4 = file3;
        VorbisEncoder vorbisEncoder2 = new VorbisEncoder(file4, "w", (long) info.channels, (long) info.sampleRate, encoderOptions2.quality);
        long j = encoderOptions2.start;
        double d = 1000.0d;
        if (j != 0) {
            int timeSeek = vorbisDecoder.timeSeek(((double) j) / 1000.0d);
            if (timeSeek != 0) {
                throw new EncoderException("Could not seek", timeSeek);
            }
        }
        ByteBuffer a = C3673z.a(16384);
        int i2 = 0;
        while (true) {
            try {
                decode = vorbisDecoder.decode(a, a.capacity());
                if (decode <= 0 || (encoderOptions2.end != -1 && vorbisDecoder.timeTell() >= ((double) encoderOptions2.end) / d)) {
                    VorbisEncoder vorbisEncoder3 = vorbisEncoder2;
                    int i3 = decode;
                    vorbisEncoder3.closeStream();
                } else {
                    if (playbackFilter != null) {
                        vorbisEncoder = vorbisEncoder2;
                        i = decode;
                        try {
                            playbackFilter.a(a, (long) i2, (long) decode);
                        } catch (Throwable th) {
                            th = th;
                            vorbisEncoder.release();
                            vorbisDecoder.release();
                            throw th;
                        }
                    } else {
                        vorbisEncoder = vorbisEncoder2;
                        i = decode;
                    }
                    vorbisEncoder.write(a, (long) i);
                    i2 += i;
                    if (progressListener != null) {
                        progressListener.onProgress((long) vorbisDecoder.timeTell(), (long) info.duration);
                    }
                    vorbisEncoder2 = vorbisEncoder;
                    d = 1000.0d;
                }
            } catch (Throwable th2) {
                th = th2;
                vorbisEncoder = vorbisEncoder2;
                vorbisEncoder.release();
                vorbisDecoder.release();
                throw th;
            }
        }
        VorbisEncoder vorbisEncoder32 = vorbisEncoder2;
        int i32 = decode;
        vorbisEncoder32.closeStream();
        vorbisEncoder32.release();
        vorbisDecoder.release();
        if (i32 >= 0) {
            return 0;
        }
        throw new EncoderException("Error encoding", i32);
    }

    public static int encodeWav(File file2, File file3, EncoderOptions encoderOptions) throws IOException {
        return encodeWav((InputStream) new BufferedInputStream(new FileInputStream(file2)), file3, encoderOptions);
    }

    public static void extract(File file2, File file3, double d, double d2) throws EncoderException {
        int chop = chop(file2.getAbsolutePath(), file3.getAbsolutePath(), d, d2);
        if (chop != 0) {
            throw new EncoderException("Eror extracting ogg", chop);
        }
    }

    private native int init(String str, String str2, long j, long j2, float f);

    private static native int validate(String str);

    public static boolean validate(File file2) {
        return validate(file2.getAbsolutePath()) == 0;
    }

    public void encodeStream(InputStream inputStream) throws IOException {
        encodeStream(inputStream, -1, EncoderOptions.DEFAULT);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        if (getState() >= 0) {
            Log.w(TAG, "unreleased encoder in finalize() - call release() when done with encoder");
            release();
        }
    }

    public native int getState();

    public native int pause();

    public native void release();

    public boolean startNewStream(double d) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("startNewStream(");
        sb.append(d);
        sb.append(")");
        Log.d(TAG, sb.toString());
        if (getState() == 1) {
            closeStream();
            if (d == -1.0d) {
                return false;
            }
            File a = C6630iGa.a(this.file, "_temp");
            extract(this.file, a, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, d);
            if (a.renameTo(this.file)) {
                return true;
            }
            throw new EncoderException("could not rename file", -1);
        }
        throw new IllegalStateException("cannot move head when not paused");
    }

    public native int write(ByteBuffer byteBuffer, long j);

    public static int encodeWav(InputStream inputStream, File file2, EncoderOptions encoderOptions) throws IOException {
        VorbisEncoder vorbisEncoder;
        try {
            ja jaVar = new ja(inputStream);
            vorbisEncoder = new VorbisEncoder(file2, "w", (long) jaVar.e(), (long) jaVar.f(), encoderOptions.quality);
            a a = jaVar.a(encoderOptions.start, encoderOptions.end);
            vorbisEncoder.encodeStream(a.a, a.b, encoderOptions);
            vorbisEncoder.closeStream();
            vorbisEncoder.release();
            C6698jGa.a((Closeable) inputStream);
            return 0;
        } catch (Throwable th) {
            C6698jGa.a((Closeable) inputStream);
            throw th;
        }
    }

    public void encodeStream(InputStream inputStream, long j, EncoderOptions encoderOptions) throws IOException {
        long j2 = j;
        EncoderOptions encoderOptions2 = encoderOptions;
        StringBuilder sb = new StringBuilder();
        sb.append("encodeStream(length=");
        sb.append(j2);
        sb.append(", ");
        sb.append(encoderOptions2);
        sb.append(")");
        Log.d(TAG, sb.toString());
        PlaybackFilter playbackFilter = encoderOptions2.filter;
        ProgressListener progressListener = encoderOptions2.listener;
        ByteBuffer a = C3673z.a(C3668u.g.n * 2);
        byte[] bArr = new byte[a.capacity()];
        InputStream inputStream2 = inputStream;
        long j3 = 0;
        while (true) {
            int read = inputStream2.read(bArr);
            if (read != -1) {
                a.rewind();
                a.put(bArr, 0, read);
                a.flip();
                if (playbackFilter != null) {
                    playbackFilter.a(a, j3, j);
                }
                long j4 = (long) read;
                int write = write(a, j4);
                if (write >= 0) {
                    j3 += j4;
                    if (progressListener != null) {
                        progressListener.onProgress(j3, j2);
                    }
                } else {
                    throw new EncoderException("addSamples returned error", write);
                }
            } else {
                return;
            }
        }
    }
}
