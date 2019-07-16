package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* renamed from: zn reason: default package and case insensitive filesystem */
/* compiled from: Sniffer */
final class C1909zn {
    private final Pq a = new Pq(8);
    private int b;

    private long b(C0313an anVar) throws IOException, InterruptedException {
        int i = 0;
        anVar.a(this.a.a, 0, 1);
        byte b2 = this.a.a[0] & 255;
        if (b2 == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b2 & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b2 & (~i2);
        anVar.a(this.a.a, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.a.a[i] & 255) + (i4 << 8);
        }
        this.b += i3 + 1;
        return (long) i4;
    }

    public boolean a(C0313an anVar) throws IOException, InterruptedException {
        C0313an anVar2 = anVar;
        long length = anVar.getLength();
        long j = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        int i = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        if (i != 0 && length <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = length;
        }
        int i2 = (int) j;
        anVar2.a(this.a.a, 0, 4);
        long v = this.a.v();
        this.b = 4;
        while (true) {
            boolean z = true;
            if (v != 440786851) {
                int i3 = this.b + 1;
                this.b = i3;
                if (i3 == i2) {
                    return false;
                }
                anVar2.a(this.a.a, 0, 1);
                v = ((v << 8) & -256) | ((long) (this.a.a[0] & 255));
            } else {
                long b2 = b(anVar);
                long j2 = (long) this.b;
                if (b2 == Long.MIN_VALUE || (i != 0 && j2 + b2 >= length)) {
                    return false;
                }
                while (true) {
                    int i4 = this.b;
                    long j3 = j2 + b2;
                    if (((long) i4) >= j3) {
                        if (((long) i4) != j3) {
                            z = false;
                        }
                        return z;
                    } else if (b(anVar) == Long.MIN_VALUE) {
                        return false;
                    } else {
                        long b3 = b(anVar);
                        int i5 = (b3 > 0 ? 1 : (b3 == 0 ? 0 : -1));
                        if (i5 < 0 || b3 > 2147483647L) {
                            return false;
                        }
                        if (i5 != 0) {
                            int i6 = (int) b3;
                            anVar2.a(i6);
                            this.b += i6;
                        }
                    }
                }
                return false;
            }
        }
    }
}
