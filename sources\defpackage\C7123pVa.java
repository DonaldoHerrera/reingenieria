package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.renderscript.RSRuntimeException;
import com.squareup.picasso.U;

/* renamed from: pVa reason: default package and case insensitive filesystem */
/* compiled from: BlurTransformation */
public class C7123pVa implements U {
    private static int a = 1;
    private Context b;
    private int c;
    private int d;

    public C7123pVa(Context context, int i) {
        this(context, i, a);
    }

    public Bitmap a(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() / this.d, bitmap.getHeight() / this.d, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i = this.d;
        canvas.scale(1.0f / ((float) i), 1.0f / ((float) i));
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (VERSION.SDK_INT >= 18) {
            try {
                C7261rVa.a(this.b, createBitmap, this.c);
            } catch (RSRuntimeException unused) {
                createBitmap = C7192qVa.a(createBitmap, this.c, true);
            }
        } else {
            createBitmap = C7192qVa.a(createBitmap, this.c, true);
        }
        bitmap.recycle();
        return createBitmap;
    }

    public C7123pVa(Context context, int i, int i2) {
        this.b = context.getApplicationContext();
        this.c = i;
        this.d = i2;
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("BlurTransformation(radius=");
        sb.append(this.c);
        sb.append(", sampling=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
