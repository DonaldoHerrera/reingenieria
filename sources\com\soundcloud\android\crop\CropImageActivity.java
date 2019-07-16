package com.soundcloud.android.crop;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLES10;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.stetho.server.http.HttpStatus;
import com.soundcloud.android.crop.q.b;
import com.soundcloud.android.crop.r.e;
import com.soundcloud.android.crop.r.f;
import com.soundcloud.android.crop.r.g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CropImageActivity extends q {
    /* access modifiers changed from: private */
    public final Handler b = new Handler();
    /* access modifiers changed from: private */
    public int c;
    /* access modifiers changed from: private */
    public int d;
    private int e;
    private int f;
    private int g;
    private Uri h;
    private Uri i;
    private boolean j;
    private int k;
    /* access modifiers changed from: private */
    public s l;
    /* access modifiers changed from: private */
    public CropImageView m;
    /* access modifiers changed from: private */
    public m n;

    private class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public void b() {
            int i;
            if (CropImageActivity.this.l != null) {
                m mVar = new m(CropImageActivity.this.m);
                int e = CropImageActivity.this.l.e();
                int b = CropImageActivity.this.l.b();
                boolean z = false;
                Rect rect = new Rect(0, 0, e, b);
                int min = (Math.min(e, b) * 4) / 5;
                if (CropImageActivity.this.c == 0 || CropImageActivity.this.d == 0) {
                    i = min;
                } else if (CropImageActivity.this.c > CropImageActivity.this.d) {
                    i = (CropImageActivity.this.d * min) / CropImageActivity.this.c;
                } else {
                    i = min;
                    min = (CropImageActivity.this.c * min) / CropImageActivity.this.d;
                }
                int i2 = (e - min) / 2;
                int i3 = (b - i) / 2;
                RectF rectF = new RectF((float) i2, (float) i3, (float) (i2 + min), (float) (i3 + i));
                Matrix unrotatedMatrix = CropImageActivity.this.m.getUnrotatedMatrix();
                if (!(CropImageActivity.this.c == 0 || CropImageActivity.this.d == 0)) {
                    z = true;
                }
                mVar.a(unrotatedMatrix, rect, rectF, z);
                CropImageActivity.this.m.a(mVar);
            }
        }

        /* synthetic */ a(CropImageActivity cropImageActivity, c cVar) {
            this();
        }

        public void a() {
            CropImageActivity.this.b.post(new j(this));
        }
    }

    @TargetApi(19)
    private void h() {
        requestWindowFeature(1);
        if (VERSION.SDK_INT >= 19) {
            getWindow().clearFlags(67108864);
        }
    }

    private void i() {
        if (!isFinishing()) {
            this.m.a(this.l, true);
            l.a(this, null, getResources().getString(g.crop__wait), new g(this), this.b);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h();
        g();
        e();
        if (this.l == null) {
            finish();
        } else {
            i();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        s sVar = this.l;
        if (sVar != null) {
            sVar.g();
        }
    }

    public boolean onSearchRequested() {
        return false;
    }

    private int c() {
        int d2 = d();
        if (d2 == 0) {
            return 2048;
        }
        return Math.min(d2, 4096);
    }

    private int d() {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        return iArr[0];
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v16, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: type inference failed for: r1v25 */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v3
  assigns: []
  uses: []
  mth insns count: 87
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 7 */
    private void e() {
        ? r1;
        ? r12;
        ? r13;
        ? r14;
        IOException e2;
        ? r15;
        OutOfMemoryError e3;
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.c = extras.getInt("aspect_x");
            this.d = extras.getInt("aspect_y");
            this.e = extras.getInt("max_x");
            this.f = extras.getInt("max_y");
            this.i = (Uri) extras.getParcelable("output");
        }
        this.h = intent.getData();
        if (this.h != null) {
            ContentResolver contentResolver = getContentResolver();
            ? r16 = this.h;
            this.g = l.a(l.a(this, contentResolver, r16));
            try {
                r12 = r16;
                this.k = a(this.h);
                ? openInputStream = getContentResolver().openInputStream(this.h);
                try {
                    Options options = new Options();
                    options.inSampleSize = this.k;
                    this.l = new s(BitmapFactory.decodeStream(openInputStream, null, options), this.g);
                    r13 = openInputStream;
                } catch (IOException e4) {
                    e2 = e4;
                    r14 = openInputStream;
                } catch (OutOfMemoryError e5) {
                    e3 = e5;
                    r15 = openInputStream;
                    r12 = r15;
                    StringBuilder sb = new StringBuilder();
                    sb.append("OOM reading image: ");
                    sb.append(e3.getMessage());
                    p.a(sb.toString(), e3);
                    a((Throwable) e3);
                    r13 = r15;
                    l.a((Closeable) r13);
                }
            } catch (IOException e6) {
                IOException iOException = e6;
                r14 = 0;
                e2 = iOException;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error reading image: ");
                sb2.append(e2.getMessage());
                p.a(sb2.toString(), e2);
                a((Throwable) e2);
                r13 = r14;
                l.a((Closeable) r13);
            } catch (OutOfMemoryError e7) {
                OutOfMemoryError outOfMemoryError = e7;
                r15 = 0;
                e3 = outOfMemoryError;
                r12 = r15;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("OOM reading image: ");
                sb3.append(e3.getMessage());
                p.a(sb3.toString(), e3);
                a((Throwable) e3);
                r13 = r15;
                l.a((Closeable) r13);
            } catch (Throwable th) {
                th = th;
                r1 = r12;
                l.a((Closeable) r1);
                throw th;
            }
            l.a((Closeable) r13);
        }
    }

    /* access modifiers changed from: private */
    public void f() {
        m mVar = this.n;
        if (mVar != null && !this.j) {
            this.j = true;
            Rect a2 = mVar.a((float) this.k);
            int width = a2.width();
            int height = a2.height();
            int i2 = this.e;
            if (i2 > 0) {
                int i3 = this.f;
                if (i3 > 0 && (width > i2 || height > i3)) {
                    float f2 = ((float) width) / ((float) height);
                    int i4 = this.e;
                    float f3 = (float) i4;
                    int i5 = this.f;
                    if (f3 / ((float) i5) > f2) {
                        width = (int) ((((float) i5) * f2) + 0.5f);
                        height = i5;
                    } else {
                        int i6 = i4;
                        height = (int) ((((float) i4) / f2) + 0.5f);
                        width = i6;
                    }
                }
            }
            try {
                Bitmap a3 = a(a2, width, height);
                if (a3 != null) {
                    this.m.a(new s(a3, this.g), true);
                    this.m.b();
                    this.m.l.clear();
                }
                a(a3);
            } catch (IllegalArgumentException e2) {
                a((Throwable) e2);
                finish();
            }
        }
    }

    private void g() {
        setContentView(f.crop__activity_crop);
        this.m = (CropImageView) findViewById(e.crop_image);
        CropImageView cropImageView = this.m;
        cropImageView.n = this;
        cropImageView.setRecycler(new c(this));
        findViewById(e.btn_cancel).setOnClickListener(new d(this));
        findViewById(e.btn_done).setOnClickListener(new e(this));
    }

    public /* bridge */ /* synthetic */ void b(b bVar) {
        super.b(bVar);
    }

    private void b() {
        this.m.c();
        s sVar = this.l;
        if (sVar != null) {
            sVar.g();
        }
        System.gc();
    }

    public /* bridge */ /* synthetic */ void a(b bVar) {
        super.a(bVar);
    }

    private int a(Uri uri) throws IOException {
        Options options = new Options();
        int i2 = 1;
        options.inJustDecodeBounds = true;
        InputStream inputStream = null;
        try {
            InputStream openInputStream = getContentResolver().openInputStream(uri);
            try {
                BitmapFactory.decodeStream(openInputStream, null, options);
                l.a((Closeable) openInputStream);
                int c2 = c();
                while (true) {
                    if (options.outHeight / i2 <= c2 && options.outWidth / i2 <= c2) {
                        return i2;
                    }
                    i2 <<= 1;
                }
            } catch (Throwable th) {
                th = th;
                inputStream = openInputStream;
                l.a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l.a((Closeable) inputStream);
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void b(Bitmap bitmap) {
        if (this.i != null) {
            OutputStream outputStream = null;
            try {
                outputStream = getContentResolver().openOutputStream(this.i);
                if (outputStream != null) {
                    bitmap.compress(CompressFormat.JPEG, 90, outputStream);
                }
            } catch (IOException e2) {
                a((Throwable) e2);
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot open file: ");
                sb.append(this.i);
                p.a(sb.toString(), e2);
            } catch (Throwable th) {
                l.a((Closeable) null);
                throw th;
            }
            l.a((Closeable) outputStream);
            l.a(l.a(this, getContentResolver(), this.h), l.a(this, getContentResolver(), this.i));
            b(this.i);
        }
        this.b.post(new i(this, bitmap));
        finish();
    }

    private void a(Bitmap bitmap) {
        if (bitmap != null) {
            l.a(this, null, getResources().getString(g.crop__saving), new h(this, bitmap), this.b);
        } else {
            finish();
        }
    }

    private Bitmap a(Rect rect, int i2, int i3) {
        InputStream inputStream;
        Bitmap bitmap;
        Bitmap bitmap2;
        int width;
        int height;
        Rect rect2;
        int i4 = i2;
        int i5 = i3;
        String str = ",";
        b();
        InputStream inputStream2 = null;
        try {
            inputStream = getContentResolver().openInputStream(this.h);
            try {
                BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(inputStream, false);
                width = newInstance.getWidth();
                height = newInstance.getHeight();
                if (this.g != 0) {
                    Matrix matrix = new Matrix();
                    matrix.setRotate((float) (-this.g));
                    RectF rectF = new RectF();
                    matrix.mapRect(rectF, new RectF(rect));
                    float f2 = 0.0f;
                    float f3 = rectF.left < 0.0f ? (float) width : 0.0f;
                    if (rectF.top < 0.0f) {
                        f2 = (float) height;
                    }
                    rectF.offset(f3, f2);
                    rect2 = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                } else {
                    rect2 = rect;
                }
                Bitmap decodeRegion = newInstance.decodeRegion(rect2, new Options());
                if (rect2.width() > i4 || rect2.height() > i5) {
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(((float) i4) / ((float) rect2.width()), ((float) i5) / ((float) rect2.height()));
                    decodeRegion = Bitmap.createBitmap(decodeRegion, 0, 0, decodeRegion.getWidth(), decodeRegion.getHeight(), matrix2, true);
                }
                l.a((Closeable) inputStream);
                return decodeRegion;
            } catch (IllegalArgumentException e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Rectangle ");
                sb.append(rect2);
                sb.append(" is outside of the image (");
                sb.append(width);
                sb.append(str);
                sb.append(height);
                sb.append(str);
                sb.append(this.g);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString(), e2);
            } catch (IOException e3) {
                e = e3;
                bitmap2 = null;
                inputStream2 = inputStream;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error cropping image: ");
                sb2.append(e.getMessage());
                p.a(sb2.toString(), e);
                a((Throwable) e);
                l.a((Closeable) inputStream2);
                return bitmap;
            } catch (OutOfMemoryError e4) {
                e = e4;
                bitmap = null;
                inputStream2 = inputStream;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("OOM cropping image: ");
                sb3.append(e.getMessage());
                p.a(sb3.toString(), e);
                a((Throwable) e);
                l.a((Closeable) inputStream2);
                return bitmap;
            } catch (Throwable th) {
                th = th;
                l.a((Closeable) inputStream);
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            bitmap2 = null;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Error cropping image: ");
            sb22.append(e.getMessage());
            p.a(sb22.toString(), e);
            a((Throwable) e);
            l.a((Closeable) inputStream2);
            return bitmap;
        } catch (OutOfMemoryError e6) {
            e = e6;
            bitmap = null;
            StringBuilder sb32 = new StringBuilder();
            sb32.append("OOM cropping image: ");
            sb32.append(e.getMessage());
            p.a(sb32.toString(), e);
            a((Throwable) e);
            l.a((Closeable) inputStream2);
            return bitmap;
        } catch (Throwable th2) {
            th = th2;
            inputStream = inputStream2;
            l.a((Closeable) inputStream);
            throw th;
        }
    }

    private void b(Uri uri) {
        setResult(-1, new Intent().putExtra("output", uri));
    }

    public boolean a() {
        return this.j;
    }

    private void a(Throwable th) {
        setResult(HttpStatus.HTTP_NOT_FOUND, new Intent().putExtra("error", th));
    }
}
