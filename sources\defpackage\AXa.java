package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: AXa reason: default package */
/* compiled from: IOStreams.kt */
public final class AXa {
    public static /* synthetic */ long a(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return a(inputStream, outputStream, i);
    }

    public static final long a(InputStream inputStream, OutputStream outputStream, int i) {
        C7471uYa.b(inputStream, "$this$copyTo");
        C7471uYa.b(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    public static final byte[] a(InputStream inputStream) {
        C7471uYa.b(inputStream, "$this$readBytes");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        a(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C7471uYa.a((Object) byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}
