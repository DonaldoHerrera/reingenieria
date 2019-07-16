package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.gms.cast.framework.media.ImageHints;

public final class Pa implements C0695b {
    private final Context a;
    private final ImageHints b;
    private Uri c;
    private Qa d;
    private C0701e e;
    private Bitmap f;
    private boolean g;
    private Ra h;

    public Pa(Context context) {
        this(context, new ImageHints(-1, 0, 0));
    }

    private final void b() {
        Qa qa = this.d;
        if (qa != null) {
            qa.cancel(true);
            this.d = null;
        }
        this.c = null;
        this.f = null;
        this.g = false;
    }

    public final void a(Ra ra) {
        this.h = ra;
    }

    public Pa(Context context, ImageHints imageHints) {
        this.a = context;
        this.b = imageHints;
        this.e = new C0701e();
        b();
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            b();
            return true;
        } else if (!uri.equals(this.c)) {
            b();
            this.c = uri;
            if (this.b.G() == 0 || this.b.i() == 0) {
                this.d = new Qa(this.a, this);
            } else {
                Qa qa = new Qa(this.a, this.b.G(), this.b.i(), false, this);
                this.d = qa;
            }
            Qa qa2 = this.d;
            Uri uri2 = this.c;
            qa2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Uri[]{uri2});
            return false;
        } else if (this.g) {
            return true;
        } else {
            return false;
        }
    }

    public final void a() {
        b();
        this.h = null;
    }

    public final void a(Bitmap bitmap) {
        this.f = bitmap;
        this.g = true;
        Ra ra = this.h;
        if (ra != null) {
            ra.a(this.f);
        }
        this.d = null;
    }
}
