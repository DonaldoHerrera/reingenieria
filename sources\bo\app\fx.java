package bo.app;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import bo.app.fw.c;
import bo.app.hq.a;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class fx implements ft {
    public static final CompressFormat a = CompressFormat.PNG;
    protected fw b;
    protected final ga c;
    protected int d = 32768;
    protected CompressFormat e = a;
    protected int f = 100;
    private File g;

    public fx(File file, File file2, ga gaVar, long j, int i) {
        if (file != null) {
            int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i2 < 0) {
                throw new IllegalArgumentException("cacheMaxSize argument must be positive number");
            } else if (i < 0) {
                throw new IllegalArgumentException("cacheMaxFileCount argument must be positive number");
            } else if (gaVar != null) {
                if (i2 == 0) {
                    j = Long.MAX_VALUE;
                }
                long j2 = j;
                int i3 = i == 0 ? BaseClientBuilder.API_PRIORITY_OTHER : i;
                this.g = file2;
                this.c = gaVar;
                a(file, file2, j2, i3);
            } else {
                throw new IllegalArgumentException("fileNameGenerator argument must be not null");
            }
        } else {
            throw new IllegalArgumentException("cacheDir argument must be not null");
        }
    }

    private void a(File file, File file2, long j, int i) {
        try {
            this.b = fw.a(file, 1, 1, j, i);
        } catch (IOException e2) {
            hr.a((Throwable) e2);
            if (file2 != null) {
                a(file2, null, j, i);
            }
            if (this.b == null) {
                throw e2;
            }
        }
    }

    private String b(String str) {
        return this.c.a(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002e  */
    public File a(String str) {
        Throwable th;
        c cVar;
        c cVar2;
        File file = 0;
        try {
            c a2 = this.b.a(b(str));
            if (a2 != 0) {
                try {
                    file = a2.a(0);
                } catch (IOException e2) {
                    e = e2;
                    cVar2 = a2;
                    try {
                        hr.a((Throwable) e);
                        if (cVar2 != 0) {
                            cVar2.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        cVar = cVar2;
                        th = th3;
                        if (cVar != 0) {
                        }
                        throw th;
                    }
                }
            }
            if (a2 != 0) {
                a2.close();
            }
            return file;
        } catch (IOException e3) {
            e = e3;
            cVar2 = 0;
            hr.a((Throwable) e);
            if (cVar2 != 0) {
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            cVar = file;
            if (cVar != 0) {
                cVar.close();
            }
            throw th;
        }
    }

    public boolean a(String str, InputStream inputStream, a aVar) {
        fw.a b2 = this.b.b(b(str));
        if (b2 == null) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(b2.a(0), this.d);
        try {
            boolean a2 = hq.a(inputStream, bufferedOutputStream, aVar, this.d);
            hq.a((Closeable) bufferedOutputStream);
            if (a2) {
                b2.a();
            } else {
                b2.b();
            }
            return a2;
        } catch (Throwable th) {
            hq.a((Closeable) bufferedOutputStream);
            b2.b();
            throw th;
        }
    }

    public boolean a(String str, Bitmap bitmap) {
        fw.a b2 = this.b.b(b(str));
        if (b2 == null) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(b2.a(0), this.d);
        try {
            boolean compress = bitmap.compress(this.e, this.f, bufferedOutputStream);
            if (compress) {
                b2.a();
            } else {
                b2.b();
            }
            return compress;
        } finally {
            hq.a((Closeable) bufferedOutputStream);
        }
    }
}
