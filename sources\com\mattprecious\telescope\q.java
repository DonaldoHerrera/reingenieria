package com.mattprecious.telescope;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.Image.Plane;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: TelescopeLayout */
class q implements OnImageAvailableListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ VirtualDisplay c;
    final /* synthetic */ r d;

    q(r rVar, int i, int i2, VirtualDisplay virtualDisplay) {
        this.d = rVar;
        this.a = i;
        this.b = i2;
        this.c = virtualDisplay;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007f, code lost:
        if (r1 != null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ac, code lost:
        if (r1 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b1, code lost:
        r8.close();
        r7.c.release();
        r7.d.a.stop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c0, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c8  */
    public void onImageAvailable(ImageReader imageReader) {
        Image image;
        Bitmap bitmap = null;
        try {
            image = imageReader.acquireLatestImage();
            try {
                this.d.b.post(new n(this));
                if (image == null) {
                    if (image != null) {
                        image.close();
                    }
                    imageReader.close();
                    this.c.release();
                    this.d.a.stop();
                    return;
                }
                this.d.b.y = true;
                Plane[] planes = image.getPlanes();
                ByteBuffer buffer = planes[0].getBuffer();
                int pixelStride = planes[0].getPixelStride();
                bitmap = Bitmap.createBitmap(this.a + ((planes[0].getRowStride() - (this.a * pixelStride)) / pixelStride), this.b, Config.ARGB_8888);
                bitmap.copyPixelsFromBuffer(buffer);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, this.a, this.b);
                this.d.b.g();
                this.d.b.o.a(createBitmap, new o(this, createBitmap));
                if (bitmap != null) {
                    bitmap.recycle();
                }
            } catch (UnsupportedOperationException e) {
                e = e;
                try {
                    Log.e("Telescope", "Failed to capture system screenshot. Setting the screenshot mode to CANVAS.", e);
                    this.d.b.setScreenshotMode(f.CANVAS);
                    this.d.b.post(new p(this));
                    if (bitmap != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    if (image != null) {
                        image.close();
                    }
                    imageReader.close();
                    this.c.release();
                    this.d.a.stop();
                    throw th;
                }
            }
        } catch (UnsupportedOperationException e2) {
            e = e2;
            image = null;
            Log.e("Telescope", "Failed to capture system screenshot. Setting the screenshot mode to CANVAS.", e);
            this.d.b.setScreenshotMode(f.CANVAS);
            this.d.b.post(new p(this));
            if (bitmap != null) {
                bitmap.recycle();
            }
        } catch (Throwable th2) {
            th = th2;
            image = null;
            if (bitmap != null) {
            }
            if (image != null) {
            }
            imageReader.close();
            this.c.release();
            this.d.a.stop();
            throw th;
        }
    }
}
