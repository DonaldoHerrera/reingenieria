package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: CardViewApi17Impl */
class b implements a {
    final /* synthetic */ c a;

    b(c cVar) {
        this.a = cVar;
    }

    public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
        canvas.drawRoundRect(rectF, f, f, paint);
    }
}
