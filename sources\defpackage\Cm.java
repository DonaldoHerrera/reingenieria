package defpackage;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

/* renamed from: Cm reason: default package */
/* compiled from: FloatResamplingAudioProcessor */
final class Cm extends C1818wm {
    private static final int g = Float.floatToIntBits(Float.NaN);

    Cm() {
    }

    public boolean a(int i, int i2, int i3) throws a {
        if (C0471ar.e(i3)) {
            return b(i, i2, i3);
        }
        throw new a(i, i2, i3);
    }

    public int e() {
        return 4;
    }

    public boolean isActive() {
        return C0471ar.e(this.c);
    }

    public void a(ByteBuffer byteBuffer) {
        boolean z = this.c == 1073741824;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (!z) {
            i = (i / 3) * 4;
        }
        ByteBuffer a = a(i);
        if (z) {
            while (position < limit) {
                a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 3) & 255) << Ascii.CAN), a);
                position += 4;
            }
        } else {
            while (position < limit) {
                a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 2) & 255) << Ascii.CAN), a);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        a.flip();
    }

    private static void a(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (floatToIntBits == g) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
