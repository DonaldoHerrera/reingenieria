package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.a;

/* renamed from: zl reason: default package and case insensitive filesystem */
/* compiled from: TapTarget */
public class C1907zl {
    boolean A = false;
    float B = 0.54f;
    final CharSequence a;
    final CharSequence b;
    float c = 0.96f;
    int d = 44;
    Rect e;
    Drawable f;
    Typeface g;
    Typeface h;
    private int i = -1;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private Integer n = null;
    private Integer o = null;
    private Integer p = null;
    private Integer q = null;
    private Integer r = null;
    private int s = -1;
    private int t = -1;
    private int u = 20;
    private int v = 18;
    int w = -1;
    boolean x = false;
    boolean y = true;
    boolean z = true;

    protected C1907zl(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null) {
            this.a = charSequence;
            this.b = charSequence2;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null title");
    }

    public static C1907zl a(View view, CharSequence charSequence, CharSequence charSequence2) {
        return new Ql(view, charSequence, charSequence2);
    }

    public void a(Runnable runnable) {
        throw null;
    }

    public C1907zl b(int i2) {
        this.i = i2;
        return this;
    }

    public C1907zl c(int i2) {
        this.j = i2;
        return this;
    }

    public C1907zl d(int i2) {
        this.l = i2;
        this.m = i2;
        return this;
    }

    public C1907zl e(int i2) {
        this.s = i2;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public Integer f(Context context) {
        return a(context, this.q, this.l);
    }

    /* access modifiers changed from: 0000 */
    public int g(Context context) {
        return a(context, this.u, this.s);
    }

    public C1907zl a(boolean z2) {
        this.A = z2;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public int b(Context context) {
        return a(context, this.v, this.t);
    }

    /* access modifiers changed from: 0000 */
    public Integer c(Context context) {
        return a(context, this.p, this.k);
    }

    /* access modifiers changed from: 0000 */
    public Integer e(Context context) {
        return a(context, this.o, this.j);
    }

    public C1907zl a(Typeface typeface) {
        if (typeface != null) {
            this.g = typeface;
            this.h = typeface;
            return this;
        }
        throw new IllegalArgumentException("Cannot use a null typeface");
    }

    /* access modifiers changed from: 0000 */
    public Integer d(Context context) {
        return a(context, this.n, this.i);
    }

    public C1907zl a(int i2) {
        this.t = i2;
        return this;
    }

    public C1907zl a(Drawable drawable) {
        a(drawable, false);
        return this;
    }

    public C1907zl a(Drawable drawable, boolean z2) {
        if (drawable != null) {
            this.f = drawable;
            if (!z2) {
                Drawable drawable2 = this.f;
                drawable2.setBounds(new Rect(0, 0, drawable2.getIntrinsicWidth(), this.f.getIntrinsicHeight()));
            }
            return this;
        }
        throw new IllegalArgumentException("Cannot use null drawable");
    }

    public Rect a() {
        Rect rect = this.e;
        if (rect != null) {
            return rect;
        }
        throw new IllegalStateException("Requesting bounds that are not set! Make sure your target is ready");
    }

    /* access modifiers changed from: 0000 */
    public Integer a(Context context) {
        return a(context, this.r, this.m);
    }

    private Integer a(Context context, Integer num, int i2) {
        return i2 != -1 ? Integer.valueOf(a.a(context, i2)) : num;
    }

    private int a(Context context, int i2, int i3) {
        if (i3 != -1) {
            return context.getResources().getDimensionPixelSize(i3);
        }
        return Ol.b(context, i2);
    }
}
