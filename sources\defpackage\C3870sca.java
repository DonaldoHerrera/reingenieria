package defpackage;

import com.soundcloud.android.features.record.C3668u;
import com.soundcloud.android.features.record.C3671x;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: sca reason: default package and case insensitive filesystem */
/* compiled from: EmptyReader */
public class C3870sca extends C3671x {
    public File a() {
        return new File("/dev/null");
    }

    public int b(ByteBuffer byteBuffer, int i) throws IOException {
        return -1;
    }

    public void b() throws IOException {
    }

    public void close() throws IOException {
    }

    public long getDuration() {
        return -1;
    }

    public long getPosition() {
        return -1;
    }

    public void h(long j) throws IOException {
    }

    public C3668u w() {
        return C3668u.PCM16_44100_1;
    }
}
