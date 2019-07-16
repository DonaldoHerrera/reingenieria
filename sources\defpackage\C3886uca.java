package defpackage;

import android.util.Log;
import com.soundcloud.android.features.record.C3668u;
import com.soundcloud.android.features.record.C3671x;
import com.soundcloud.android.features.record.ja;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

/* renamed from: uca reason: default package and case insensitive filesystem */
/* compiled from: WavReader */
public class C3886uca extends C3671x {
    private final File b;
    private RandomAccessFile c;
    private ja d;

    public C3886uca(File file) throws IOException {
        this.b = file;
        c();
    }

    private void c() throws IOException {
        RandomAccessFile randomAccessFile = this.c;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        this.c = new RandomAccessFile(this.b, "r");
        this.d = new ja(new FileInputStream(this.b));
    }

    public File a() {
        return this.b;
    }

    public int b(ByteBuffer byteBuffer, int i) throws IOException {
        return this.c.getChannel().read(byteBuffer);
    }

    public void close() throws IOException {
        this.c.close();
    }

    public long getDuration() {
        return this.d.d();
    }

    public long getPosition() {
        try {
            return w().a(this.c.getFilePointer() - 44);
        } catch (IOException unused) {
            return -1;
        }
    }

    public void h(long j) throws IOException {
        this.c.seek(this.d.a(j));
    }

    public C3668u w() {
        return this.d.a();
    }

    public void b() {
        try {
            c();
        } catch (IOException e) {
            Log.w(C3886uca.class.getSimpleName(), e);
        }
    }
}
