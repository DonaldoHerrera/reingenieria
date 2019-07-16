package defpackage;

import com.soundcloud.android.creators.record.jni.EncoderException;
import com.soundcloud.android.creators.record.jni.EncoderOptions;
import com.soundcloud.android.creators.record.jni.VorbisEncoder;
import com.soundcloud.android.features.record.C3668u;
import com.soundcloud.android.features.record.C3671x;
import com.soundcloud.android.features.record.C3672y;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: xca reason: default package and case insensitive filesystem */
/* compiled from: VorbisWriter */
public class C3910xca implements C3672y {
    private VorbisEncoder a;
    private final C3668u b;
    private final File c;

    public C3910xca(File file, C3668u uVar) {
        this.c = file;
        this.b = uVar;
    }

    public int a(ByteBuffer byteBuffer, int i) throws IOException {
        a();
        int write = this.a.write(byteBuffer, (long) i);
        if (write >= 0) {
            return write;
        }
        throw new EncoderException("Error writing", write);
    }

    public void close() throws IOException {
        VorbisEncoder vorbisEncoder = this.a;
        if (vorbisEncoder != null) {
            vorbisEncoder.release();
            this.a = null;
        }
    }

    public boolean g(long j) throws IOException {
        a();
        this.a.pause();
        return this.a.startNewStream(((double) j) / 1000.0d);
    }

    public long getDuration() {
        return -1;
    }

    public C3671x u() throws IOException {
        return new C3878tca(this.c);
    }

    public C3668u w() {
        return this.b;
    }

    public void y() throws IOException {
        a();
        this.a.pause();
    }

    private void a() throws EncoderException {
        if (this.a == null) {
            File file = this.c;
            C3668u uVar = this.b;
            VorbisEncoder vorbisEncoder = new VorbisEncoder(file, "w+", (long) uVar.k, (long) uVar.j, EncoderOptions.DEFAULT.quality);
            this.a = vorbisEncoder;
        }
    }
}
