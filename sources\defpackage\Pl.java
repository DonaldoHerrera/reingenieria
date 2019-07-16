package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: Pl reason: default package */
/* compiled from: ViewTapTarget */
class Pl implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ Ql b;

    Pl(Ql ql, Runnable runnable) {
        this.b = ql;
        this.a = runnable;
    }

    public void run() {
        int[] iArr = new int[2];
        this.b.C.getLocationOnScreen(iArr);
        Ql ql = this.b;
        ql.e = new Rect(iArr[0], iArr[1], iArr[0] + ql.C.getWidth(), iArr[1] + this.b.C.getHeight());
        Ql ql2 = this.b;
        if (ql2.f == null && ql2.C.getWidth() > 0 && this.b.C.getHeight() > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(this.b.C.getWidth(), this.b.C.getHeight(), Config.ARGB_8888);
            this.b.C.draw(new Canvas(createBitmap));
            Ql ql3 = this.b;
            ql3.f = new BitmapDrawable(ql3.C.getContext().getResources(), createBitmap);
            Drawable drawable = this.b.f;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.b.f.getIntrinsicHeight());
        }
        this.a.run();
    }
}
