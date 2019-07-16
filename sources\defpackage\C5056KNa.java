package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.base.Ascii;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: KNa reason: default package and case insensitive filesystem */
/* compiled from: QueueFile */
public class C5056KNa implements Closeable {
    private static final Logger a = Logger.getLogger(C5056KNa.class.getName());
    /* access modifiers changed from: private */
    public final RandomAccessFile b;
    int c;
    private int d;
    private a e;
    private a f;
    private final byte[] g = new byte[16];

    /* renamed from: KNa$a */
    /* compiled from: QueueFile */
    static class a {
        static final a a = new a(0, 0);
        final int b;
        final int c;

        a(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(a.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.b);
            sb.append(", length = ");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: KNa$b */
    /* compiled from: QueueFile */
    private final class b extends InputStream {
        private int a;
        private int b;

        /* synthetic */ b(C5056KNa kNa, a aVar, C5024JNa jNa) {
            this(aVar);
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            C5056KNa.b(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.b;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            C5056KNa.this.a(this.a, bArr, i, i2);
            this.a = C5056KNa.this.e(this.a + i2);
            this.b -= i2;
            return i2;
        }

        private b(a aVar) {
            this.a = C5056KNa.this.e(aVar.b + 4);
            this.b = aVar.c;
        }

        public int read() throws IOException {
            if (this.b == 0) {
                return -1;
            }
            C5056KNa.this.b.seek((long) this.a);
            int read = C5056KNa.this.b.read();
            this.a = C5056KNa.this.e(this.a + 1);
            this.b--;
            return read;
        }
    }

    /* renamed from: KNa$c */
    /* compiled from: QueueFile */
    public interface c {
        void a(InputStream inputStream, int i) throws IOException;
    }

    public C5056KNa(File file) throws IOException {
        if (!file.exists()) {
            a(file);
        }
        this.b = b(file);
        e();
    }

    private static void b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private void e() throws IOException {
        this.b.seek(0);
        this.b.readFully(this.g);
        this.c = a(this.g, 0);
        if (((long) this.c) <= this.b.length()) {
            this.d = a(this.g, 4);
            int a2 = a(this.g, 8);
            int a3 = a(this.g, 12);
            this.e = b(a2);
            this.f = b(a3);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("File is truncated. Expected length: ");
        sb.append(this.c);
        sb.append(", Actual length: ");
        sb.append(this.b.length());
        throw new IOException(sb.toString());
    }

    private int f() {
        return this.c - d();
    }

    public synchronized void c() throws IOException {
        if (b()) {
            throw new NoSuchElementException();
        } else if (this.d == 1) {
            a();
        } else {
            int e2 = e(this.e.b + 4 + this.e.c);
            a(e2, this.g, 0, 4);
            int a2 = a(this.g, 0);
            a(this.c, this.d - 1, e2, this.f.b);
            this.d--;
            this.e = new a(e2, a2);
        }
    }

    public synchronized void close() throws IOException {
        this.b.close();
    }

    public int d() {
        if (this.d == 0) {
            return 16;
        }
        a aVar = this.f;
        int i = aVar.b;
        int i2 = this.e.b;
        if (i >= i2) {
            return (i - i2) + 4 + aVar.c + 16;
        }
        return (((i + 4) + aVar.c) + this.c) - i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C5056KNa.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.c);
        sb.append(", size=");
        sb.append(this.d);
        sb.append(", first=");
        sb.append(this.e);
        sb.append(", last=");
        sb.append(this.f);
        sb.append(", element lengths=[");
        try {
            a((c) new C5024JNa(this, sb));
        } catch (IOException e2) {
            a.log(Level.WARNING, "read error", e2);
        }
        sb.append("]]");
        return sb.toString();
    }

    private static void a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int b2 : iArr) {
            b(bArr, i, b2);
            i += 4;
        }
    }

    private a b(int i) throws IOException {
        if (i == 0) {
            return a.a;
        }
        this.b.seek((long) i);
        return new a(i, this.b.readInt());
    }

    private void d(int i) throws IOException {
        this.b.setLength((long) i);
        this.b.getChannel().force(true);
    }

    private static int a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << Ascii.CAN) + ((bArr[i + 1] & 255) << Ascii.DLE) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private void a(int i, int i2, int i3, int i4) throws IOException {
        a(this.g, i, i2, i3, i4);
        this.b.seek(0);
        this.b.write(this.g);
    }

    private static RandomAccessFile b(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private void b(int i, byte[] bArr, int i2, int i3) throws IOException {
        int e2 = e(i);
        int i4 = e2 + i3;
        int i5 = this.c;
        if (i4 <= i5) {
            this.b.seek((long) e2);
            this.b.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - e2;
        this.b.seek((long) e2);
        this.b.write(bArr, i2, i6);
        this.b.seek(16);
        this.b.write(bArr, i2 + i6, i3 - i6);
    }

    /* JADX INFO: finally extract failed */
    private static void a(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".tmp");
        File file2 = new File(sb.toString());
        RandomAccessFile b2 = b(file2);
        try {
            b2.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            b2.seek(0);
            byte[] bArr = new byte[16];
            a(bArr, 4096, 0, 0, 0);
            b2.write(bArr);
            b2.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            b2.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public int e(int i) {
        int i2 = this.c;
        return i < i2 ? i : (i + 16) - i2;
    }

    public synchronized boolean b() {
        return this.d == 0;
    }

    /* access modifiers changed from: private */
    public static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* access modifiers changed from: private */
    public void a(int i, byte[] bArr, int i2, int i3) throws IOException {
        int e2 = e(i);
        int i4 = e2 + i3;
        int i5 = this.c;
        if (i4 <= i5) {
            this.b.seek((long) e2);
            this.b.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - e2;
        this.b.seek((long) e2);
        this.b.readFully(bArr, i2, i6);
        this.b.seek(16);
        this.b.readFully(bArr, i2 + i6, i3 - i6);
    }

    public void a(byte[] bArr) throws IOException {
        a(bArr, 0, bArr.length);
    }

    public synchronized void a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        b(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        a(i2);
        boolean b2 = b();
        if (b2) {
            i3 = 16;
        } else {
            i3 = e(this.f.b + 4 + this.f.c);
        }
        a aVar = new a(i3, i2);
        b(this.g, 0, i2);
        b(aVar.b, this.g, 0, 4);
        b(aVar.b + 4, bArr, i, i2);
        a(this.c, this.d + 1, b2 ? aVar.b : this.e.b, aVar.b);
        this.f = aVar;
        this.d++;
        if (b2) {
            this.e = this.f;
        }
    }

    private void a(int i) throws IOException {
        int i2 = i + 4;
        int f2 = f();
        if (f2 < i2) {
            int i3 = this.c;
            do {
                f2 += i3;
                i3 <<= 1;
            } while (f2 < i2);
            d(i3);
            a aVar = this.f;
            int e2 = e(aVar.b + 4 + aVar.c);
            if (e2 < this.e.b) {
                FileChannel channel = this.b.getChannel();
                channel.position((long) this.c);
                long j = (long) (e2 - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f.b;
            int i5 = this.e.b;
            if (i4 < i5) {
                int i6 = (this.c + i4) - 16;
                a(i3, this.d, i5, i6);
                this.f = new a(i6, this.f.c);
            } else {
                a(i3, this.d, i5, i4);
            }
            this.c = i3;
        }
    }

    public synchronized void a(c cVar) throws IOException {
        int i = this.e.b;
        for (int i2 = 0; i2 < this.d; i2++) {
            a b2 = b(i);
            cVar.a(new b(this, b2, null), b2.c);
            i = e(b2.b + 4 + b2.c);
        }
    }

    public synchronized void a() throws IOException {
        a(4096, 0, 0, 0);
        this.d = 0;
        this.e = a.a;
        this.f = a.a;
        if (this.c > 4096) {
            d(4096);
        }
        this.c = 4096;
    }

    public boolean a(int i, int i2) {
        return (d() + 4) + i <= i2;
    }
}
