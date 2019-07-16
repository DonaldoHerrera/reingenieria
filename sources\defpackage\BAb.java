package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: BAb reason: default package */
/* compiled from: RealBufferedSource */
class BAb extends InputStream {
    final /* synthetic */ CAb a;

    BAb(CAb cAb) {
        this.a = cAb;
    }

    public int available() throws IOException {
        CAb cAb = this.a;
        if (!cAb.c) {
            return (int) Math.min(cAb.a.c, 2147483647L);
        }
        throw new IOException("closed");
    }

    public void close() throws IOException {
        this.a.close();
    }

    public int read() throws IOException {
        CAb cAb = this.a;
        if (!cAb.c) {
            C6825lAb lab = cAb.a;
            if (lab.c == 0 && cAb.b.b(lab, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return this.a.a.readByte() & 255;
        }
        throw new IOException("closed");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(".inputStream()");
        return sb.toString();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.a.c) {
            KAb.a((long) bArr.length, (long) i, (long) i2);
            CAb cAb = this.a;
            C6825lAb lab = cAb.a;
            if (lab.c == 0 && cAb.b.b(lab, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return this.a.a.a(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
