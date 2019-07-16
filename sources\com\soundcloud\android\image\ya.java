package com.soundcloud.android.image;

import android.graphics.Bitmap;
import com.squareup.picasso.C6246k;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: WeakReferenceImageCache.kt */
public final class ya implements C6246k {
    private final HashMap<String, WeakReference<Bitmap>> a = new HashMap<>();

    public Bitmap a(String str) {
        C7471uYa.b(str, "key");
        WeakReference weakReference = (WeakReference) this.a.get(str);
        if ((weakReference != null ? (Bitmap) weakReference.get() : null) == null) {
            this.a.remove(str);
        }
        if (weakReference != null) {
            return (Bitmap) weakReference.get();
        }
        return null;
    }

    public int size() {
        return this.a.size();
    }

    public void a(String str, Bitmap bitmap) {
        C7471uYa.b(str, "key");
        C7471uYa.b(bitmap, "bitmap");
        this.a.put(str, new WeakReference(bitmap));
    }

    public int a() {
        throw new GVa(null, 1, null);
    }
}
