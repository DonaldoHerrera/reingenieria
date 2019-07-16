package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.provider.MediaStore.Images;
import android.provider.MediaStore.Video.Thumbnails;
import com.squareup.picasso.E.d;
import java.io.IOException;

/* compiled from: MediaStoreRequestHandler */
class y extends C6249n {
    private static final String[] b = {"orientation"};

    /* compiled from: MediaStoreRequestHandler */
    enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        
        final int e;
        final int f;
        final int g;

        private a(int i, int i2, int i3) {
            this.e = i;
            this.f = i2;
            this.g = i3;
        }
    }

    y(Context context) {
        super(context);
    }

    public boolean a(K k) {
        Uri uri = k.e;
        if ("content".equals(uri.getScheme())) {
            if ("media".equals(uri.getAuthority())) {
                return true;
            }
        }
        return false;
    }

    public com.squareup.picasso.M.a a(K k, int i) throws IOException {
        Bitmap bitmap;
        K k2 = k;
        ContentResolver contentResolver = this.a.getContentResolver();
        int a2 = a(contentResolver, k2.e);
        String type = contentResolver.getType(k2.e);
        boolean z = type != null && type.startsWith("video/");
        if (k.c()) {
            a a3 = a(k2.i, k2.j);
            if (!z && a3 == a.FULL) {
                return new com.squareup.picasso.M.a(null, C7720yAb.a(c(k)), d.DISK, a2);
            }
            long parseId = ContentUris.parseId(k2.e);
            Options b2 = M.b(k);
            b2.inJustDecodeBounds = true;
            Options options = b2;
            M.a(k2.i, k2.j, a3.f, a3.g, b2, k);
            if (z) {
                bitmap = Thumbnails.getThumbnail(contentResolver, parseId, a3 == a.FULL ? 1 : a3.e, options);
            } else {
                bitmap = Images.Thumbnails.getThumbnail(contentResolver, parseId, a3.e, options);
            }
            if (bitmap != null) {
                return new com.squareup.picasso.M.a(bitmap, null, d.DISK, a2);
            }
        }
        return new com.squareup.picasso.M.a(null, C7720yAb.a(c(k)), d.DISK, a2);
    }

    static a a(int i, int i2) {
        a aVar = a.MICRO;
        if (i <= aVar.f && i2 <= aVar.g) {
            return aVar;
        }
        a aVar2 = a.MINI;
        if (i > aVar2.f || i2 > aVar2.g) {
            return a.FULL;
        }
        return aVar2;
    }

    static int a(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, b, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i = query.getInt(0);
                    if (query != null) {
                        query.close();
                    }
                    return i;
                }
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
