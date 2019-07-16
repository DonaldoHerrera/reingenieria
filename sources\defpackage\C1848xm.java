package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: xm reason: default package and case insensitive filesystem */
/* compiled from: ChannelMappingAudioProcessor */
final class C1848xm extends C1818wm {
    private int[] g;
    private boolean h;
    private int[] i;

    C1848xm() {
    }

    public void a(int[] iArr) {
        this.g = iArr;
    }

    public int c() {
        int[] iArr = this.i;
        return iArr == null ? this.b : iArr.length;
    }

    public boolean isActive() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public void j() {
        this.i = null;
        this.g = null;
        this.h = false;
    }

    public boolean a(int i2, int i3, int i4) throws a {
        boolean z = !Arrays.equals(this.g, this.i);
        this.i = this.g;
        int[] iArr = this.i;
        if (iArr == null) {
            this.h = false;
            return z;
        } else if (i4 != 2) {
            throw new a(i2, i3, i4);
        } else if (!z && !b(i2, i3, i4)) {
            return false;
        } else {
            this.h = i3 != iArr.length;
            int i5 = 0;
            while (i5 < iArr.length) {
                int i6 = iArr[i5];
                if (i6 < i3) {
                    this.h = (i6 != i5) | this.h;
                    i5++;
                } else {
                    throw new a(i2, i3, i4);
                }
            }
            return true;
        }
    }

    public void a(ByteBuffer byteBuffer) {
        int[] iArr = this.i;
        C1852xq.a(iArr);
        int[] iArr2 = iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer a = a(((limit - position) / (this.b * 2)) * iArr2.length * 2);
        while (position < limit) {
            for (int i2 : iArr2) {
                a.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.b * 2;
        }
        byteBuffer.position(limit);
        a.flip();
    }
}
