package defpackage;

import java.nio.ByteBuffer;

/* renamed from: Fm reason: default package */
/* compiled from: ResamplingAudioProcessor */
final class Fm extends C1818wm {
    Fm() {
    }

    public boolean a(int i, int i2, int i3) throws a {
        if (i3 == 3 || i3 == 2 || i3 == Integer.MIN_VALUE || i3 == 1073741824) {
            return b(i, i2, i3);
        }
        throw new a(i, i2, i3);
    }

    public int e() {
        return 2;
    }

    public boolean isActive() {
        int i = this.c;
        return (i == 0 || i == 2) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061 A[LOOP:2: B:19:0x0061->B:20:0x0063, LOOP_START, PHI: r0 
  PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:10:0x0029, B:20:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    public void a(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        int i4 = this.c;
        if (i4 == Integer.MIN_VALUE) {
            i3 /= 3;
        } else if (i4 != 3) {
            if (i4 == 1073741824) {
                i = i3 / 2;
                ByteBuffer a = a(i);
                i2 = this.c;
                if (i2 != Integer.MIN_VALUE) {
                    while (position < limit) {
                        a.put(byteBuffer.get(position + 1));
                        a.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else if (i2 == 3) {
                    while (position < limit) {
                        a.put(0);
                        a.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else if (i2 == 1073741824) {
                    while (position < limit) {
                        a.put(byteBuffer.get(position + 2));
                        a.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                } else {
                    throw new IllegalStateException();
                }
                byteBuffer.position(byteBuffer.limit());
                a.flip();
            }
            throw new IllegalStateException();
        }
        i = i3 * 2;
        ByteBuffer a2 = a(i);
        i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
        }
        byteBuffer.position(byteBuffer.limit());
        a2.flip();
    }
}
