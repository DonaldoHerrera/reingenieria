package bo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public class hb implements hc {
    protected final boolean a;

    public static class a {
        public final int a;
        public final boolean b;

        protected a() {
            this.a = 0;
            this.b = false;
        }

        protected a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }
    }

    public static class b {
        public final gt a;
        public final a b;

        protected b(gt gtVar, a aVar) {
            this.a = gtVar;
            this.b = aVar;
        }
    }

    public hb(boolean z) {
        this.a = z;
    }

    public Bitmap a(hd hdVar) {
        InputStream b2 = b(hdVar);
        if (b2 == null) {
            hr.d("No stream for image [%s]", hdVar.a());
            return null;
        }
        try {
            b a2 = a(b2, hdVar);
            b2 = b(b2, hdVar);
            Bitmap decodeStream = BitmapFactory.decodeStream(b2, null, a(a2.a, hdVar));
            if (decodeStream == null) {
                hr.d("Image can't be decoded [%s]", hdVar.a());
            } else {
                a aVar = a2.b;
                decodeStream = a(decodeStream, hdVar, aVar.a, aVar.b);
            }
            return decodeStream;
        } finally {
            hq.a((Closeable) b2);
        }
    }

    /* access modifiers changed from: protected */
    public InputStream b(hd hdVar) {
        return hdVar.f().a(hdVar.b(), hdVar.g());
    }

    /* access modifiers changed from: protected */
    public InputStream b(InputStream inputStream, hd hdVar) {
        if (inputStream.markSupported()) {
            try {
                inputStream.reset();
                return inputStream;
            } catch (IOException unused) {
            }
        }
        hq.a((Closeable) inputStream);
        return b(hdVar);
    }

    /* access modifiers changed from: protected */
    public b a(InputStream inputStream, hd hdVar) {
        a aVar;
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        String b2 = hdVar.b();
        if (!hdVar.h() || !a(b2, options.outMimeType)) {
            aVar = new a();
        } else {
            aVar = a(b2);
        }
        return new b(new gt(options.outWidth, options.outHeight, aVar.a), aVar);
    }

    private boolean a(String str, String str2) {
        return "image/jpeg".equalsIgnoreCase(str2) && bo.app.hh.a.a(str) == bo.app.hh.a.FILE;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r1 = r0;
        r0 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        r1 = r0;
        r0 = 270(0x10e, float:3.78E-43);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        r1 = r0;
        r0 = 180(0xb4, float:2.52E-43);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 6 */
    public a a(String str) {
        int i = 0;
        boolean z = 1;
        try {
            switch (new ExifInterface(bo.app.hh.a.FILE.c(str)).getAttributeInt("Orientation", 1)) {
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    i = 1;
                    break;
                case 5:
                    i = 1;
                    break;
                case 6:
                    break;
                case 7:
                    i = 1;
                    break;
                case 8:
                    break;
            }
        } catch (IOException unused) {
            hr.c("Can't read EXIF tags from file [%s]", str);
        }
        i = i;
        z = 0;
        return new a(i, z);
    }

    /* access modifiers changed from: protected */
    public Options a(gt gtVar, hd hdVar) {
        int i;
        gs d = hdVar.d();
        if (d == gs.NONE) {
            i = 1;
        } else if (d == gs.NONE_SAFE) {
            i = hp.a(gtVar);
        } else {
            i = hp.a(gtVar, hdVar.c(), hdVar.e(), d == gs.IN_SAMPLE_POWER_OF_2);
        }
        if (i > 1 && this.a) {
            hr.a("Subsample original image (%1$s) to %2$s (scale = %3$d) [%4$s]", gtVar, gtVar.a(i), Integer.valueOf(i), hdVar.a());
        }
        Options i2 = hdVar.i();
        i2.inSampleSize = i;
        return i2;
    }

    /* access modifiers changed from: protected */
    public Bitmap a(Bitmap bitmap, hd hdVar, int i, boolean z) {
        Matrix matrix = new Matrix();
        gs d = hdVar.d();
        if (d == gs.EXACTLY || d == gs.EXACTLY_STRETCHED) {
            gt gtVar = new gt(bitmap.getWidth(), bitmap.getHeight(), i);
            float b2 = hp.b(gtVar, hdVar.c(), hdVar.e(), d == gs.EXACTLY_STRETCHED);
            if (Float.compare(b2, 1.0f) != 0) {
                matrix.setScale(b2, b2);
                if (this.a) {
                    hr.a("Scale subsampled image (%1$s) to %2$s (scale = %3$.5f) [%4$s]", gtVar, gtVar.a(b2), Float.valueOf(b2), hdVar.a());
                }
            }
        }
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
            if (this.a) {
                hr.a("Flip image horizontally [%s]", hdVar.a());
            }
        }
        if (i != 0) {
            matrix.postRotate((float) i);
            if (this.a) {
                hr.a("Rotate image on %1$d° [%2$s]", Integer.valueOf(i), hdVar.a());
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }
}
