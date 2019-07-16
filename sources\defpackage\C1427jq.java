package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: jq reason: default package and case insensitive filesystem */
/* compiled from: FileDataSource */
public final class C1427jq extends Vp {
    private RandomAccessFile e;
    private Uri f;
    private long g;
    private boolean h;

    /* renamed from: jq$a */
    /* compiled from: FileDataSource */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public C1427jq() {
        super(false);
    }

    public long a(C0470aq aqVar) throws a {
        try {
            this.f = aqVar.a;
            b(aqVar);
            this.e = new RandomAccessFile(aqVar.a.getPath(), "r");
            this.e.seek(aqVar.f);
            this.g = aqVar.g == -1 ? this.e.length() - aqVar.f : aqVar.g;
            if (this.g >= 0) {
                this.h = true;
                c(aqVar);
                return this.g;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    public void close() throws a {
        this.f = null;
        try {
            if (this.e != null) {
                this.e.close();
            }
            this.e = null;
            if (this.h) {
                this.h = false;
                b();
            }
        } catch (IOException e2) {
            throw new a(e2);
        } catch (Throwable th) {
            this.e = null;
            if (this.h) {
                this.h = false;
                b();
            }
            throw th;
        }
    }

    public Uri getUri() {
        return this.f;
    }

    public int read(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.e.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.g -= (long) read;
                a(read);
            }
            return read;
        } catch (IOException e2) {
            throw new a(e2);
        }
    }
}
