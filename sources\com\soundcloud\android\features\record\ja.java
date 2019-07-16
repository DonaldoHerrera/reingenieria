package com.soundcloud.android.features.record;

import com.soundcloud.android.utilities.android.i;
import java.io.DataOutput;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Locale;

/* compiled from: WavHeader */
public class ja {
    private short a;
    private short b;
    private int c;
    private short d;
    private int e;
    private InputStream f;

    /* compiled from: WavHeader */
    public static class a {
        public final InputStream a;
        public final long b;

        a(InputStream inputStream, long j) {
            this.a = inputStream;
            this.b = j;
        }
    }

    public ja(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    private int a(InputStream inputStream) throws IOException {
        a(inputStream, "RIFF");
        b(inputStream);
        a(inputStream, "WAVE");
        a(inputStream, "fmt ");
        if (16 == b(inputStream)) {
            this.a = c(inputStream);
            this.b = c(inputStream);
            this.c = b(inputStream);
            int b2 = b(inputStream);
            short c2 = c(inputStream);
            this.d = c(inputStream);
            if (b2 != this.b * this.c * c()) {
                throw new IOException("fmt.ByteRate field inconsistent");
            } else if (c2 == this.b * c()) {
                a(inputStream, "data");
                this.e = b(inputStream);
                return 44;
            } else {
                throw new IOException("fmt.BlockAlign field inconsistent");
            }
        } else {
            throw new IOException("fmt chunk length not 16");
        }
    }

    public final short b() {
        return this.d;
    }

    public final int c() {
        return b() / 8;
    }

    public final long d() {
        return a().a((long) this.e);
    }

    public short e() {
        return this.b;
    }

    public int f() {
        return this.c;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "WaveHeader format=%d numChannels=%d sampleRate=%d bitsPerSample=%d numBytes=%d", new Object[]{Short.valueOf(this.a), Short.valueOf(this.b), Integer.valueOf(this.c), Short.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public ja(InputStream inputStream, boolean z) throws IOException {
        if (z) {
            if (inputStream.markSupported()) {
                inputStream.mark(76);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("asked to rewind but ");
                sb.append(inputStream.getClass());
                sb.append(" does not support it");
                throw new IOException(sb.toString());
            }
        }
        a(inputStream);
        if (z) {
            inputStream.reset();
        }
        this.f = inputStream;
    }

    private static int b(InputStream inputStream) throws IOException {
        return (inputStream.read() << 24) | inputStream.read() | (inputStream.read() << 8) | (inputStream.read() << 16);
    }

    private static short c(InputStream inputStream) throws IOException {
        return (short) ((inputStream.read() << 8) | inputStream.read());
    }

    public ja(short s, short s2, int i, short s3, int i2) {
        this.a = s;
        this.c = i;
        this.b = s2;
        this.d = s3;
        this.e = i2;
    }

    private static void a(InputStream inputStream, String str) throws IOException {
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == inputStream.read()) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" tag not present");
                throw new IOException(sb.toString());
            }
        }
    }

    public long a(long j) {
        if (j < 0) {
            return 44;
        }
        return a().c(Math.min((long) this.e, a().b(j))) + 44;
    }

    public int a(DataOutput dataOutput) throws IOException {
        dataOutput.writeBytes("RIFF");
        dataOutput.writeInt(this.e + 36);
        dataOutput.writeBytes("WAVE");
        dataOutput.writeBytes("fmt ");
        dataOutput.writeInt(Integer.reverseBytes(16));
        dataOutput.writeShort(Short.reverseBytes(1));
        dataOutput.writeShort(Short.reverseBytes(this.b));
        dataOutput.writeInt(Integer.reverseBytes(this.c));
        dataOutput.writeInt(Integer.reverseBytes(this.b * this.c * c()));
        dataOutput.writeShort(Short.reverseBytes((short) (this.b * c())));
        dataOutput.writeShort(Short.reverseBytes(this.d));
        dataOutput.writeBytes("data");
        dataOutput.writeInt(this.e);
        return 44;
    }

    public C3668u a() {
        if (this.a == 1 && this.d == 16) {
            return C3668u.a(this.c, this.b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown audioformat: ");
        sb.append(toString());
        throw new IllegalArgumentException(sb.toString());
    }

    public a a(long j, long j2) throws IOException {
        InputStream inputStream = this.f;
        long j3 = (long) this.e;
        C3668u a2 = a();
        if (j > 0) {
            long min = Math.min((long) this.e, a2.c(a2.b(j)));
            a(this.f, min);
            j3 -= min;
        }
        if (j2 > 0) {
            long min2 = Math.min((long) this.e, a2.c(a2.b(j2)));
            inputStream = new i(this.f, min2 - (((long) this.e) - j3));
            j3 -= ((long) this.e) - min2;
        }
        return new a(inputStream, j3);
    }

    private void a(InputStream inputStream, long j) throws IOException {
        while (j > 0) {
            long skip = inputStream.skip(j);
            if (skip != 0) {
                j -= skip;
            } else if (inputStream.read() != -1) {
                j--;
            } else {
                throw new EOFException();
            }
        }
    }

    public static boolean a(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        if (length == 0 || length <= 44) {
            return false;
        }
        randomAccessFile.seek(4);
        randomAccessFile.writeInt(Integer.reverseBytes((int) (length - 8)));
        randomAccessFile.seek(40);
        randomAccessFile.writeInt(Integer.reverseBytes((int) (length - 44)));
        return true;
    }

    public static ja a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ja jaVar = new ja(fileInputStream);
        fileInputStream.close();
        return jaVar;
    }
}
