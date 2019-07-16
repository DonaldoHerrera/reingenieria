package com.soundcloud.android.likes;

import android.content.Context;
import android.widget.Toast;
import com.soundcloud.android.ia.p;

/* renamed from: com.soundcloud.android.likes.j reason: case insensitive filesystem */
/* compiled from: LikeToggleObserver */
public class C3986j extends C4943Gua {
    private final Context d;
    private final boolean e;

    public C3986j(Context context, boolean z) {
        this.d = context;
        this.e = z;
    }

    private void c() {
        Toast.makeText(this.d, this.e ? p.like_toast_overflow_action : p.unlike_toast_overflow_action, 0).show();
    }

    public void a(Throwable th) {
        super.a(th);
        Toast.makeText(this.d, p.like_error_toast_overflow_action, 1).show();
    }

    public void onComplete() {
        super.onComplete();
        c();
    }
}
