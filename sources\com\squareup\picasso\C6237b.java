package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.E.d;
import com.squareup.picasso.M.a;
import java.io.IOException;

/* renamed from: com.squareup.picasso.b reason: case insensitive filesystem */
/* compiled from: AssetRequestHandler */
class C6237b extends M {
    private static final int a = 22;
    private final Context b;
    private final Object c = new Object();
    private AssetManager d;

    C6237b(Context context) {
        this.b = context;
    }

    static String c(K k) {
        return k.e.toString().substring(a);
    }

    public boolean a(K k) {
        Uri uri = k.e;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty()) {
            return false;
        }
        if ("android_asset".equals(uri.getPathSegments().get(0))) {
            return true;
        }
        return false;
    }

    public a a(K k, int i) throws IOException {
        if (this.d == null) {
            synchronized (this.c) {
                if (this.d == null) {
                    this.d = this.b.getAssets();
                }
            }
        }
        return new a(C7720yAb.a(this.d.open(c(k))), d.DISK);
    }
}
