package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.E.d;
import com.squareup.picasso.M.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.n reason: case insensitive filesystem */
/* compiled from: ContentStreamRequestHandler */
class C6249n extends M {
    final Context a;

    C6249n(Context context) {
        this.a = context;
    }

    public boolean a(K k) {
        return "content".equals(k.e.getScheme());
    }

    /* access modifiers changed from: 0000 */
    public InputStream c(K k) throws FileNotFoundException {
        return this.a.getContentResolver().openInputStream(k.e);
    }

    public a a(K k, int i) throws IOException {
        return new a(C7720yAb.a(c(k)), d.DISK);
    }
}
