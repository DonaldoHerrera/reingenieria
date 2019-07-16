package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.NetworkInfo;
import com.squareup.picasso.E.d;
import java.io.IOException;

/* compiled from: RequestHandler */
public abstract class M {

    /* compiled from: RequestHandler */
    public static final class a {
        private final d a;
        private final Bitmap b;
        private final HAb c;
        private final int d;

        public a(Bitmap bitmap, d dVar) {
            W.a(bitmap, "bitmap == null");
            this(bitmap, null, dVar, 0);
        }

        public Bitmap a() {
            return this.b;
        }

        /* access modifiers changed from: 0000 */
        public int b() {
            return this.d;
        }

        public d c() {
            return this.a;
        }

        public HAb d() {
            return this.c;
        }

        public a(HAb hAb, d dVar) {
            W.a(hAb, "source == null");
            this(null, hAb, dVar, 0);
        }

        a(Bitmap bitmap, HAb hAb, d dVar, int i) {
            boolean z = true;
            boolean z2 = bitmap != null;
            if (hAb == null) {
                z = false;
            }
            if (z2 != z) {
                this.b = bitmap;
                this.c = hAb;
                W.a(dVar, "loadedFrom == null");
                this.a = dVar;
                this.d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    static boolean a(Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    static Options b(K k) {
        boolean c = k.c();
        boolean z = k.t != null;
        Options options = null;
        if (c || z || k.s) {
            options = new Options();
            options.inJustDecodeBounds = c;
            boolean z2 = k.s;
            options.inInputShareable = z2;
            options.inPurgeable = z2;
            if (z) {
                options.inPreferredConfig = k.t;
            }
        }
        return options;
    }

    /* access modifiers changed from: 0000 */
    public int a() {
        return 0;
    }

    public abstract a a(K k, int i) throws IOException;

    public abstract boolean a(K k);

    /* access modifiers changed from: 0000 */
    public boolean a(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return false;
    }

    static void a(int i, int i2, Options options, K k) {
        a(i, i2, options.outWidth, options.outHeight, options, k);
    }

    static void a(int i, int i2, int i3, int i4, Options options, K k) {
        int i5;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = Math.floor((double) (((float) i3) / ((float) i)));
            } else if (i == 0) {
                floor = Math.floor((double) (((float) i4) / ((float) i2)));
            } else {
                int floor2 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                int floor3 = (int) Math.floor((double) (((float) i3) / ((float) i)));
                i5 = k.m ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            i5 = (int) floor;
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }
}
