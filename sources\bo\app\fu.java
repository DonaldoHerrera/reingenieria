package bo.app;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import bo.app.hq.a;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public abstract class fu implements ft {
    public static final CompressFormat a = CompressFormat.PNG;
    protected final File b;
    protected final File c;
    protected final ga d;
    protected int e = 32768;
    protected CompressFormat f = a;
    protected int g = 100;

    public fu(File file, File file2, ga gaVar) {
        if (file == null) {
            throw new IllegalArgumentException("cacheDir argument must be not null");
        } else if (gaVar != null) {
            this.b = file;
            this.c = file2;
            this.d = gaVar;
        } else {
            throw new IllegalArgumentException("fileNameGenerator argument must be not null");
        }
    }

    public File a(String str) {
        return b(str);
    }

    /* access modifiers changed from: protected */
    public File b(String str) {
        String a2 = this.d.a(str);
        File file = this.b;
        if (!file.exists() && !this.b.mkdirs()) {
            File file2 = this.c;
            if (file2 != null && (file2.exists() || this.c.mkdirs())) {
                file = this.c;
            }
        }
        return new File(file, a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    public boolean a(String str, InputStream inputStream, a aVar) {
        boolean z;
        BufferedOutputStream bufferedOutputStream;
        File b2 = b(str);
        StringBuilder sb = new StringBuilder();
        sb.append(b2.getAbsolutePath());
        sb.append(".tmp");
        File file = new File(sb.toString());
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), this.e);
            z = hq.a(inputStream, bufferedOutputStream, aVar, this.e);
            try {
                hq.a((Closeable) bufferedOutputStream);
                if (z && !file.renameTo(b2)) {
                    z = false;
                }
                if (!z) {
                    file.delete();
                }
                return z;
            } catch (Throwable th) {
                th = th;
                if (z && !file.renameTo(b2)) {
                    z = false;
                }
                if (!z) {
                    file.delete();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            z = false;
            if (!z) {
            }
            throw th;
        }
    }

    public boolean a(String str, Bitmap bitmap) {
        File b2 = b(str);
        StringBuilder sb = new StringBuilder();
        sb.append(b2.getAbsolutePath());
        sb.append(".tmp");
        File file = new File(sb.toString());
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), this.e);
        try {
            boolean compress = bitmap.compress(this.f, this.g, bufferedOutputStream);
            hq.a((Closeable) bufferedOutputStream);
            if (compress && !file.renameTo(b2)) {
                compress = false;
            }
            if (!compress) {
                file.delete();
            }
            bitmap.recycle();
            return compress;
        } catch (Throwable th) {
            hq.a((Closeable) bufferedOutputStream);
            file.delete();
            throw th;
        }
    }
}
