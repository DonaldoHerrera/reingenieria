package com.squareup.picasso;

import com.squareup.picasso.M.a;
import java.io.IOException;

/* renamed from: com.squareup.picasso.d reason: case insensitive filesystem */
/* compiled from: BitmapHunter */
class C6239d extends M {
    C6239d() {
    }

    public a a(K k, int i) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized type of request: ");
        sb.append(k);
        throw new IllegalStateException(sb.toString());
    }

    public boolean a(K k) {
        return true;
    }
}
