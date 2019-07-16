package defpackage;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: Kh reason: default package */
/* compiled from: CLSUUID */
class Kh {
    private static final AtomicLong a = new AtomicLong(0);
    private static String b;

    public Kh(C4931GNa gNa) {
        byte[] bArr = new byte[10];
        c(bArr);
        b(bArr);
        a(bArr);
        String c = C7391tNa.c(gNa.d());
        String a2 = C7391tNa.a(bArr);
        b = String.format(Locale.US, "%s-%s-%s-%s", new Object[]{a2.substring(0, 12), a2.substring(12, 16), a2.subSequence(16, 20), c.substring(0, 12)}).toUpperCase(Locale.US);
    }

    private void a(byte[] bArr) {
        byte[] b2 = b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b2[0];
        bArr[9] = b2[1];
    }

    private void b(byte[] bArr) {
        byte[] b2 = b(a.incrementAndGet());
        bArr[6] = b2[0];
        bArr[7] = b2[1];
    }

    private void c(byte[] bArr) {
        long time = new Date().getTime();
        long j = time / 1000;
        long j2 = time % 1000;
        byte[] a2 = a(j);
        bArr[0] = a2[0];
        bArr[1] = a2[1];
        bArr[2] = a2[2];
        bArr[3] = a2[3];
        byte[] b2 = b(j2);
        bArr[4] = b2[0];
        bArr[5] = b2[1];
    }

    public String toString() {
        return b;
    }

    private static byte[] b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private static byte[] a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }
}
