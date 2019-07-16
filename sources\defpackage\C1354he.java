package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* renamed from: he reason: default package and case insensitive filesystem */
/* compiled from: AnimatedVectorDrawableCompat */
class C1354he implements Callback {
    final /* synthetic */ C1385ie a;

    C1354he(C1385ie ieVar) {
        this.a = ieVar;
    }

    public void invalidateDrawable(Drawable drawable) {
        this.a.invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.a.scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.a.unscheduleSelf(runnable);
    }
}
