package defpackage;

import java.nio.ByteBuffer;

/* renamed from: Qm reason: default package */
/* compiled from: DecoderInputBuffer */
public class Qm extends Lm {
    public final Nm b = new Nm();
    public ByteBuffer c;
    public long d;
    private final int e;

    public Qm(int i) {
        this.e = i;
    }

    public static Qm v() {
        return new Qm(0);
    }

    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public void f(int i) {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = g(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.c.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer g = g(i2);
            if (position > 0) {
                this.c.position(0);
                this.c.limit(position);
                g.put(this.c);
            }
            this.c = g;
        }
    }

    public final boolean g() {
        return d(1073741824);
    }

    public final boolean u() {
        return this.c == null && this.e == 0;
    }

    private ByteBuffer g(int i) {
        int i2 = this.e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder();
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    public final void f() {
        this.c.flip();
    }
}
