package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.picasso.E.d;
import com.squareup.picasso.M.a;
import java.io.IOException;

/* renamed from: com.squareup.picasso.s reason: case insensitive filesystem */
/* compiled from: FileRequestHandler */
class C6253s extends C6249n {
    C6253s(Context context) {
        super(context);
    }

    public boolean a(K k) {
        return "file".equals(k.e.getScheme());
    }

    public a a(K k, int i) throws IOException {
        return new a(null, C7720yAb.a(c(k)), d.DISK, a(k.e));
    }

    static int a(Uri uri) throws IOException {
        return new _c(uri.getPath()).a("Orientation", 1);
    }
}
