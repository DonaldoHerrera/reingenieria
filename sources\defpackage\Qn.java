package defpackage;

import com.google.android.exoplayer2.Format;
import com.soundcloud.flippernative.AndroidPlatformDecoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: Qn reason: default package */
/* compiled from: OpusReader */
final class Qn extends Sn {
    private static final int n = C0471ar.b("Opus");
    private static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean p;

    Qn() {
    }

    public static boolean b(Pq pq) {
        int a = pq.a();
        byte[] bArr = o;
        if (a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        pq.a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, o);
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        super.a(z);
        if (z) {
            this.p = false;
        }
    }

    /* access modifiers changed from: protected */
    public long a(Pq pq) {
        return b(a(pq.a));
    }

    /* access modifiers changed from: protected */
    public boolean a(Pq pq, long j, a aVar) {
        boolean z = true;
        if (!this.p) {
            byte[] copyOf = Arrays.copyOf(pq.a, pq.d());
            byte b = copyOf[9] & 255;
            byte b2 = ((copyOf[11] & 255) << 8) | (copyOf[10] & 255);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            a(arrayList, b2);
            a(arrayList, 3840);
            aVar.a = Format.a(null, "audio/opus", null, -1, -1, b, AndroidPlatformDecoder.AAC_SAMPLE_RATE, arrayList, null, 0, null);
            this.p = true;
            return true;
        }
        if (pq.h() != n) {
            z = false;
        }
        pq.e(0);
        return z;
    }

    private void a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }

    private long a(byte[] bArr) {
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        int i3 = i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2;
        return ((long) b3) * ((long) i3);
    }
}
