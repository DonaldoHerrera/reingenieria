package defpackage;

import com.soundcloud.android.creators.record.jni.DecoderException;
import com.soundcloud.android.creators.record.jni.VorbisDecoder;
import com.soundcloud.android.creators.record.jni.VorbisInfo;
import com.soundcloud.android.features.record.C3668u;
import com.soundcloud.android.features.record.C3671x;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: tca reason: default package and case insensitive filesystem */
/* compiled from: VorbisReader */
public class C3878tca extends C3671x {
    private VorbisDecoder b;
    private VorbisInfo c;

    public C3878tca(File file) throws IOException {
        this.b = new VorbisDecoder(file);
    }

    private VorbisInfo c() {
        if (this.c == null) {
            this.c = this.b.getInfo();
            if (this.c == null) {
                this.c = new VorbisInfo();
            }
        }
        return this.c;
    }

    public File a() {
        return this.b.file;
    }

    public int b(ByteBuffer byteBuffer, int i) throws IOException {
        int decode = this.b.decode(byteBuffer, i);
        if (decode == 0) {
            return -1;
        }
        if (decode <= 0 || decode > byteBuffer.limit()) {
            throw new DecoderException("error decoding", decode);
        }
        byteBuffer.position(decode);
        return decode;
    }

    public void close() throws IOException {
        this.b.release();
    }

    public long getDuration() {
        return (long) (c().duration * 1000.0d);
    }

    public long getPosition() {
        return (long) (this.b.timeTell() * 1000.0d);
    }

    public void h(long j) throws IOException {
        int timeSeek = this.b.timeSeek(((double) j) / 1000.0d);
        if (timeSeek < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("timeSeek(");
            sb.append(j);
            sb.append(") returned ");
            sb.append(timeSeek);
            throw new IOException(sb.toString());
        }
    }

    public C3668u w() {
        return C3668u.a(c().sampleRate, c().channels);
    }

    public void b() throws DecoderException {
        VorbisDecoder vorbisDecoder = this.b;
        File file = vorbisDecoder.file;
        vorbisDecoder.release();
        this.b = new VorbisDecoder(file);
        this.c = null;
    }
}
