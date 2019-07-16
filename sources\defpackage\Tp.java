package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: Tp reason: default package */
/* compiled from: AssetDataSource */
public final class Tp extends Vp {
    private final AssetManager e;
    private Uri f;
    private InputStream g;
    private long h;
    private boolean i;

    /* renamed from: Tp$a */
    /* compiled from: AssetDataSource */
    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public Tp(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    public long a(C0470aq aqVar) throws a {
        try {
            this.f = aqVar.a;
            String path = this.f.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            b(aqVar);
            this.g = this.e.open(path, 1);
            if (this.g.skip(aqVar.f) >= aqVar.f) {
                if (aqVar.g != -1) {
                    this.h = aqVar.g;
                } else {
                    this.h = (long) this.g.available();
                    if (this.h == 2147483647L) {
                        this.h = -1;
                    }
                }
                this.i = true;
                c(aqVar);
                return this.h;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    public void close() throws a {
        this.f = null;
        try {
            if (this.g != null) {
                this.g.close();
            }
            this.g = null;
            if (this.i) {
                this.i = false;
                b();
            }
        } catch (IOException e2) {
            throw new a(e2);
        } catch (Throwable th) {
            this.g = null;
            if (this.i) {
                this.i = false;
                b();
            }
            throw th;
        }
    }

    public Uri getUri() {
        return this.f;
    }

    public int read(byte[] bArr, int i2, int i3) throws a {
        if (i3 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i3 = (int) Math.min(j, (long) i3);
            } catch (IOException e2) {
                throw new a(e2);
            }
        }
        int read = this.g.read(bArr, i2, i3);
        if (read != -1) {
            long j2 = this.h;
            if (j2 != -1) {
                this.h = j2 - ((long) read);
            }
            a(read);
            return read;
        } else if (this.h == -1) {
            return -1;
        } else {
            throw new a(new EOFException());
        }
    }
}
