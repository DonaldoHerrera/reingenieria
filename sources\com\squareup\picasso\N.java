package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.squareup.picasso.E.d;
import com.squareup.picasso.M.a;
import java.io.IOException;

/* compiled from: ResourceRequestHandler */
class N extends M {
    private final Context a;

    N(Context context) {
        this.a = context;
    }

    public boolean a(K k) {
        if (k.f != 0) {
            return true;
        }
        return "android.resource".equals(k.e.getScheme());
    }

    public a a(K k, int i) throws IOException {
        Resources a2 = W.a(this.a, k);
        return new a(a(a2, W.a(a2, k), k), d.DISK);
    }

    private static Bitmap a(Resources resources, int i, K k) {
        Options b = M.b(k);
        if (M.a(b)) {
            BitmapFactory.decodeResource(resources, i, b);
            M.a(k.i, k.j, b, k);
        }
        return BitmapFactory.decodeResource(resources, i, b);
    }
}
