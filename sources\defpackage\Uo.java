package defpackage;

import android.graphics.Bitmap;
import android.text.Layout.Alignment;

/* renamed from: Uo reason: default package */
/* compiled from: Cue */
public class Uo {
    public final CharSequence a;
    public final Alignment b;
    public final Bitmap c;
    public final float d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;
    public final float i;
    public final float j;
    public final boolean k;
    public final int l;
    public final int m;
    public final float n;

    public Uo(Bitmap bitmap, float f2, int i2, float f3, int i3, float f4, float f5) {
        this(null, null, bitmap, f3, 0, i3, f2, i2, Integer.MIN_VALUE, Float.MIN_VALUE, f4, f5, false, -16777216);
    }

    public Uo(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public Uo(CharSequence charSequence, Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, f2, i2, i3, f3, i4, f4, false, -16777216);
    }

    public Uo(CharSequence charSequence, Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, int i5, float f5) {
        this(charSequence, alignment, null, f2, i2, i3, f3, i4, i5, f5, f4, Float.MIN_VALUE, false, -16777216);
    }

    public Uo(CharSequence charSequence, Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z, int i5) {
        this(charSequence, alignment, null, f2, i2, i3, f3, i4, Integer.MIN_VALUE, Float.MIN_VALUE, f4, Float.MIN_VALUE, z, i5);
    }

    private Uo(CharSequence charSequence, Alignment alignment, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6) {
        this.a = charSequence;
        this.b = alignment;
        this.c = bitmap;
        this.d = f2;
        this.e = i2;
        this.f = i3;
        this.g = f3;
        this.h = i4;
        this.i = f5;
        this.j = f6;
        this.k = z;
        this.l = i6;
        this.m = i5;
        this.n = f4;
    }
}
