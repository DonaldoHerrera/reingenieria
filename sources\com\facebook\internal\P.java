package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.facebook.B;
import java.util.Locale;

/* compiled from: ImageRequest */
public class P {
    private Context a;
    private Uri b;
    private b c;
    private boolean d;
    private Object e;

    /* compiled from: ImageRequest */
    public static class a {
        /* access modifiers changed from: private */
        public Context a;
        /* access modifiers changed from: private */
        public Uri b;
        /* access modifiers changed from: private */
        public b c;
        /* access modifiers changed from: private */
        public boolean d;
        /* access modifiers changed from: private */
        public Object e;

        public a(Context context, Uri uri) {
            ja.a((Object) uri, "imageUri");
            this.a = context;
            this.b = uri;
        }

        public a a(b bVar) {
            this.c = bVar;
            return this;
        }

        public a a(Object obj) {
            this.e = obj;
            return this;
        }

        public a a(boolean z) {
            this.d = z;
            return this;
        }

        public P a() {
            return new P(this);
        }
    }

    /* compiled from: ImageRequest */
    public interface b {
        void a(Q q);
    }

    public static Uri a(String str, int i, int i2) {
        ja.a(str, "userId");
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (max == 0 && max2 == 0) {
            throw new IllegalArgumentException("Either width or height must be greater than 0");
        }
        Builder path = Uri.parse(da.c()).buildUpon().path(String.format(Locale.US, "%s/%s/picture", new Object[]{B.o(), str}));
        if (max2 != 0) {
            path.appendQueryParameter("height", String.valueOf(max2));
        }
        if (max != 0) {
            path.appendQueryParameter("width", String.valueOf(max));
        }
        path.appendQueryParameter("migration_overrides", "{october_2012:true}");
        return path.build();
    }

    public Object b() {
        return this.e;
    }

    public Context c() {
        return this.a;
    }

    public Uri d() {
        return this.b;
    }

    public boolean e() {
        return this.d;
    }

    private P(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e == null ? new Object() : aVar.e;
    }

    public b a() {
        return this.c;
    }
}
