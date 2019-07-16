package com.soundcloud.android.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.soundcloud.android.utilities.android.m;

/* compiled from: ImageProcessor.kt */
public final class T implements S {
    private final RenderScript a;
    private final ScriptIntrinsicBlur b;
    private boolean c;

    public T(Context context) {
        C7471uYa.b(context, "context");
        RenderScript create = RenderScript.create(context);
        C7471uYa.a((Object) create, "RenderScript.create(context)");
        this.a = create;
        RenderScript renderScript = this.a;
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        C7471uYa.a((Object) create2, "ScriptIntrinsicBlur.crea…ement.U8_4(renderscript))");
        this.b = create2;
    }

    public Bitmap a(Bitmap bitmap, Bitmap bitmap2, C4928GKa<Float> gKa) {
        C7471uYa.b(bitmap, "inBitmap");
        C7471uYa.b(bitmap2, "outBitmap");
        C7471uYa.b(gKa, "blurRadius");
        m.a("Image blurring must not be done on the UI thread");
        if (!this.c) {
            Allocation createFromBitmap = Allocation.createFromBitmap(this.a, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(this.a, bitmap2);
            ScriptIntrinsicBlur scriptIntrinsicBlur = this.b;
            Object d = gKa.d(Float.valueOf(7.0f));
            C7471uYa.a(d, "blurRadius.or(DEFAULT_RADIUS)");
            scriptIntrinsicBlur.setRadius(((Number) d).floatValue());
            this.b.setInput(createFromBitmap);
            this.b.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(bitmap2);
            createFromBitmap.destroy();
            createFromBitmap2.destroy();
            return bitmap2;
        }
        throw new IllegalStateException("ImageProcessor was already destroyed");
    }

    public void destroy() {
        this.c = true;
        this.b.destroy();
    }
}
