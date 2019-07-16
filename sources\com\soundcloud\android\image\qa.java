package com.soundcloud.android.image;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.TransitionDrawable;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.soundcloud.android.image.sa.e;

/* compiled from: PlaceholderGenerator */
public class qa {
    private static final int[][] a;
    protected final Resources b;

    static {
        int[] iArr = {e.aubergine, e.slate};
        int[] iArr2 = {e.aubergine, e.salmon};
        int[] iArr3 = {e.aubergine, e.greige};
        int[] iArr4 = {e.slate, e.aubergine};
        int[] iArr5 = {e.slate, e.salmon};
        int[] iArr6 = {e.slate, e.greige};
        int[] iArr7 = {e.salmon, e.aubergine};
        int[] iArr8 = {e.salmon, e.slate};
        int i = e.greige;
        a = new int[][]{iArr, iArr2, iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, new int[]{e.salmon, i}, new int[]{i, e.aubergine}, new int[]{e.greige, e.slate}, new int[]{e.greige, e.salmon}};
    }

    qa(Resources resources) {
        this.b = resources;
    }

    /* access modifiers changed from: protected */
    public Drawable a() {
        return this.b.getDrawable(e.image_loading_color);
    }

    public TransitionDrawable b(String str) {
        return Z.a(a(), (Drawable) a(str));
    }

    /* access modifiers changed from: protected */
    public int c(String str) {
        return (str.hashCode() & BaseClientBuilder.API_PRIORITY_OTHER) % a.length;
    }

    public GradientDrawable a(String str) {
        int[] iArr = a[c(str)];
        return new GradientDrawable(Orientation.TL_BR, new int[]{this.b.getColor(iArr[0]), this.b.getColor(iArr[1])});
    }

    public GradientDrawable a(String str, Fd fd) {
        int[] iArr = a[c(str)];
        return new GradientDrawable(Orientation.TL_BR, new int[]{fd.a(this.b.getColor(iArr[0])), fd.b(this.b.getColor(iArr[1]))});
    }
}
