package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: com.squareup.picasso.w reason: case insensitive filesystem */
/* compiled from: LruCache */
public final class C6257w implements C6246k {
    final LruCache<String, a> a;

    /* renamed from: com.squareup.picasso.w$a */
    /* compiled from: LruCache */
    static final class a {
        final Bitmap a;
        final int b;

        a(Bitmap bitmap, int i) {
            this.a = bitmap;
            this.b = i;
        }
    }

    public C6257w(Context context) {
        this(W.a(context));
    }

    public Bitmap a(String str) {
        a aVar = (a) this.a.get(str);
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public int size() {
        return this.a.size();
    }

    public C6257w(int i) {
        this.a = new C6256v(this, i);
    }

    public void a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int a2 = W.a(bitmap);
        if (a2 > a()) {
            this.a.remove(str);
        } else {
            this.a.put(str, new a(bitmap, a2));
        }
    }

    public int a() {
        return this.a.maxSize();
    }
}
