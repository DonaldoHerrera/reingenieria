package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.E.d;

/* compiled from: TargetAction */
final class T extends C6236a<S> {
    T(E e, S s, K k, int i, int i2, Drawable drawable, String str, Object obj, int i3) {
        super(e, s, k, i, i2, i3, drawable, str, obj, false);
    }

    /* access modifiers changed from: 0000 */
    public void a(Bitmap bitmap, d dVar) {
        if (bitmap != null) {
            S s = (S) i();
            if (s != null) {
                s.a(bitmap, dVar);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* access modifiers changed from: 0000 */
    public void a(Exception exc) {
        S s = (S) i();
        if (s == null) {
            return;
        }
        if (this.g != 0) {
            s.a(exc, this.a.g.getResources().getDrawable(this.g));
        } else {
            s.a(exc, this.h);
        }
    }
}
