package defpackage;

import android.util.Log;
import com.soundcloud.android.features.record.C3668u;
import com.soundcloud.android.features.record.C3671x;
import com.soundcloud.android.features.record.C3672y;
import com.soundcloud.android.features.record.ja;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

/* renamed from: yca reason: default package and case insensitive filesystem */
/* compiled from: WavWriter */
public class C3918yca implements C3672y {
    private static final String a = "yca";
    public final File b;
    public final C3668u c;
    private RandomAccessFile d;

    public C3918yca(File file, C3668u uVar) {
        this.b = file;
        this.c = uVar;
    }

    private RandomAccessFile b() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.b, "rw");
        if (!this.b.exists() || randomAccessFile.length() == 0) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("creating new WAV file (");
            sb.append(this.b.getAbsolutePath());
            sb.append(")");
            Log.d(str, sb.toString());
            randomAccessFile.setLength(0);
            this.c.b().a((DataOutput) randomAccessFile);
        } else {
            long length = randomAccessFile.length();
            String str2 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("appending to existing WAV file (");
            sb2.append(this.b.getAbsolutePath());
            sb2.append(") at ");
            sb2.append(length);
            Log.d(str2, sb2.toString());
            randomAccessFile.seek(length);
        }
        return randomAccessFile;
    }

    public int a(ByteBuffer byteBuffer, int i) throws IOException {
        if (this.d == null) {
            this.d = b();
        }
        return this.d.getChannel().write(byteBuffer);
    }

    public void close() throws IOException {
        if (!a()) {
            y();
        }
    }

    public boolean g(long j) throws IOException {
        if (j >= 0) {
            long b2 = this.c.b(j) + 44;
            if (this.d == null) {
                this.d = b();
            }
            if (b2 < this.d.length()) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("setting new pos ");
                sb.append(b2);
                Log.d(str, sb.toString());
                this.d.setLength(b2);
                ja.a(this.d);
                this.d.seek(b2);
                return true;
            }
        }
        return false;
    }

    public long getDuration() {
        return this.c.a(this.b.length() - 44);
    }

    public C3671x u() throws IOException {
        return new C3886uca(this.b);
    }

    public C3668u w() {
        return this.c;
    }

    public void y() throws IOException {
        RandomAccessFile randomAccessFile = this.d;
        if (randomAccessFile != null) {
            long length = randomAccessFile.length();
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("finalising recording file (length=");
            sb.append(length);
            sb.append(")");
            Log.d(str, sb.toString());
            ja.a(this.d);
            this.d.close();
            this.d = null;
        }
    }

    public boolean a() {
        return this.d == null;
    }
}
