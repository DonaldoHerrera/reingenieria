package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: qq reason: default package and case insensitive filesystem */
/* compiled from: RawResourceDataSource */
public final class C1643qq extends Vp {
    private final Resources e;
    private Uri f;
    private AssetFileDescriptor g;
    private InputStream h;
    private long i;
    private boolean j;

    /* renamed from: qq$a */
    /* compiled from: RawResourceDataSource */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(IOException iOException) {
            super(iOException);
        }
    }

    public C1643qq(Context context) {
        super(false);
        this.e = context.getResources();
    }

    public long a(C0470aq aqVar) throws a {
        try {
            this.f = aqVar.a;
            if (TextUtils.equals("rawresource", this.f.getScheme())) {
                int parseInt = Integer.parseInt(this.f.getLastPathSegment());
                b(aqVar);
                this.g = this.e.openRawResourceFd(parseInt);
                this.h = new FileInputStream(this.g.getFileDescriptor());
                this.h.skip(this.g.getStartOffset());
                if (this.h.skip(aqVar.f) >= aqVar.f) {
                    long j2 = -1;
                    if (aqVar.g != -1) {
                        this.i = aqVar.g;
                    } else {
                        long length = this.g.getLength();
                        if (length != -1) {
                            j2 = length - aqVar.f;
                        }
                        this.i = j2;
                    }
                    this.j = true;
                    c(aqVar);
                    return this.i;
                }
                throw new EOFException();
            }
            throw new a("URI must use scheme rawresource");
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.");
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    public void close() throws a {
        this.f = null;
        try {
            if (this.h != null) {
                this.h.close();
            }
            this.h = null;
            try {
                if (this.g != null) {
                    this.g.close();
                }
                this.g = null;
                if (this.j) {
                    this.j = false;
                    b();
                }
            } catch (IOException e2) {
                throw new a(e2);
            } catch (Throwable th) {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    b();
                }
                throw th;
            }
        } catch (IOException e3) {
            throw new a(e3);
        } catch (Throwable th2) {
            this.h = null;
            try {
                if (this.g != null) {
                    this.g.close();
                }
                this.g = null;
                if (this.j) {
                    this.j = false;
                    b();
                }
                throw th2;
            } catch (IOException e4) {
                throw new a(e4);
            } catch (Throwable th3) {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    b();
                }
                throw th3;
            }
        }
    }

    public Uri getUri() {
        return this.f;
    }

    public int read(byte[] bArr, int i2, int i3) throws a {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.i;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, (long) i3);
            } catch (IOException e2) {
                throw new a(e2);
            }
        }
        int read = this.h.read(bArr, i2, i3);
        if (read != -1) {
            long j3 = this.i;
            if (j3 != -1) {
                this.i = j3 - ((long) read);
            }
            a(read);
            return read;
        } else if (this.i == -1) {
            return -1;
        } else {
            throw new a((IOException) new EOFException());
        }
    }
}
