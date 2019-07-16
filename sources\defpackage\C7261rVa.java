package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Allocation.MipmapControl;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.RenderScript.RSMessageHandler;
import android.renderscript.ScriptIntrinsicBlur;

/* renamed from: rVa reason: default package and case insensitive filesystem */
/* compiled from: RSBlur */
public class C7261rVa {
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r1v0, types: [android.renderscript.Allocation] */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.renderscript.Allocation] */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Unknown variable types count: 4 */
    @TargetApi(18)
    public static Bitmap a(Context context, Bitmap bitmap, int i) throws RSRuntimeException {
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        RenderScript renderScript;
        ? r1;
        ? r0;
        ScriptIntrinsicBlur scriptIntrinsicBlur2;
        Allocation createFromBitmap;
        Allocation createTyped;
        ? r02;
        ? r03 = 0;
        try {
            renderScript = RenderScript.create(context);
            try {
                renderScript.setMessageHandler(new RSMessageHandler());
                createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap, MipmapControl.MIPMAP_NONE, 1);
            } catch (Throwable th) {
                th = th;
                scriptIntrinsicBlur2 = 0;
                r1 = scriptIntrinsicBlur2;
                r0 = r03;
                scriptIntrinsicBlur = scriptIntrinsicBlur2;
                if (renderScript != null) {
                }
                if (r1 != 0) {
                }
                if (r0 != 0) {
                }
                if (scriptIntrinsicBlur != 0) {
                }
                throw th;
            }
            try {
                createTyped = Allocation.createTyped(renderScript, createFromBitmap.getType());
            } catch (Throwable th2) {
                th = th2;
                scriptIntrinsicBlur = 0;
                r0 = r03;
                r1 = createFromBitmap;
                if (renderScript != null) {
                }
                if (r1 != 0) {
                }
                if (r0 != 0) {
                }
                if (scriptIntrinsicBlur != 0) {
                }
                throw th;
            }
            try {
                r02 = r03;
                ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
                create.setInput(createFromBitmap);
                create.setRadius((float) i);
                create.forEach(createTyped);
                createTyped.copyTo(bitmap);
                r02 = create;
                if (renderScript != null) {
                    renderScript.destroy();
                }
                if (createFromBitmap != 0) {
                    createFromBitmap.destroy();
                }
                if (createTyped != 0) {
                    createTyped.destroy();
                }
                if (create != 0) {
                    create.destroy();
                }
                return bitmap;
            } catch (Throwable th3) {
                th = th3;
                scriptIntrinsicBlur = r02;
                r0 = createTyped;
                r1 = createFromBitmap;
                if (renderScript != null) {
                }
                if (r1 != 0) {
                }
                if (r0 != 0) {
                }
                if (scriptIntrinsicBlur != 0) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            renderScript = null;
            scriptIntrinsicBlur2 = 0;
            r1 = scriptIntrinsicBlur2;
            r0 = r03;
            scriptIntrinsicBlur = scriptIntrinsicBlur2;
            if (renderScript != null) {
                renderScript.destroy();
            }
            if (r1 != 0) {
                r1.destroy();
            }
            if (r0 != 0) {
                r0.destroy();
            }
            if (scriptIntrinsicBlur != 0) {
                scriptIntrinsicBlur.destroy();
            }
            throw th;
        }
    }
}
