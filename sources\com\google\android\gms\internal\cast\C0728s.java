package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.C0635c;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.media.C0646a;
import com.google.android.gms.cast.framework.media.C0648c;
import com.google.android.gms.cast.framework.media.C0650e;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.common.images.WebImage;

/* renamed from: com.google.android.gms.internal.cast.s reason: case insensitive filesystem */
public final class C0728s extends C1644qr {
    /* access modifiers changed from: private */
    public final ImageView b;
    private final ImageHints c;
    private final Bitmap d;
    /* access modifiers changed from: private */
    public final View e;
    private final C0646a f;
    private final Pa g;

    public C0728s(ImageView imageView, Context context, ImageHints imageHints, int i, View view) {
        this.b = imageView;
        this.c = imageHints;
        C0646a aVar = null;
        this.d = i != 0 ? BitmapFactory.decodeResource(context.getResources(), i) : null;
        this.e = view;
        C0635c b2 = C0635c.b(context);
        if (b2 != null) {
            CastMediaOptions i2 = b2.a().i();
            if (i2 != null) {
                aVar = i2.F();
            }
            this.f = aVar;
        } else {
            this.f = null;
        }
        this.g = new Pa(context.getApplicationContext());
    }

    private final void e() {
        Uri uri;
        C0650e a = a();
        if (a == null || !a.m()) {
            f();
            return;
        }
        MediaInfo g2 = a.g();
        if (g2 == null) {
            uri = null;
        } else {
            C0646a aVar = this.f;
            if (aVar != null) {
                WebImage a2 = aVar.a(g2.getMetadata(), this.c);
                if (!(a2 == null || a2.getUrl() == null)) {
                    uri = a2.getUrl();
                }
            }
            uri = C0648c.a(g2, 0);
        }
        if (uri == null) {
            f();
        } else {
            this.g.a(uri);
        }
    }

    private final void f() {
        View view = this.e;
        if (view != null) {
            view.setVisibility(0);
            this.b.setVisibility(4);
        }
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            this.b.setImageBitmap(bitmap);
        }
    }

    public final void a(C0636d dVar) {
        super.a(dVar);
        this.g.a((Ra) new C0729t(this));
        f();
        e();
    }

    public final void b() {
        e();
    }

    public final void d() {
        this.g.a();
        f();
        super.d();
    }
}
