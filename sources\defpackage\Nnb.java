package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: Nnb reason: default package */
/* compiled from: Internal */
public class Nnb {
    public static final byte[] a = new byte[0];
    public static final ByteBuffer b = ByteBuffer.wrap(a);

    /* renamed from: Nnb$a */
    /* compiled from: Internal */
    public interface a {
        int i();
    }

    /* renamed from: Nnb$b */
    /* compiled from: Internal */
    public interface b<T extends a> {
        T a(int i);
    }

    public static boolean a(byte[] bArr) {
        return C6733job.a(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}
