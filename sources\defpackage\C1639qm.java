package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: qm reason: default package and case insensitive filesystem */
/* compiled from: AudioProcessor */
public interface C1639qm {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: qm$a */
    /* compiled from: AudioProcessor */
    public static final class a extends Exception {
        public a(int i, int i2, int i3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unhandled format: ");
            sb.append(i);
            sb.append(" Hz, ");
            sb.append(i2);
            sb.append(" channels in encoding ");
            sb.append(i3);
            super(sb.toString());
        }
    }

    void a(ByteBuffer byteBuffer);

    boolean a();

    boolean a(int i, int i2, int i3) throws a;

    ByteBuffer b();

    int c();

    int d();

    int e();

    void f();

    void flush();

    boolean isActive();

    void reset();
}
