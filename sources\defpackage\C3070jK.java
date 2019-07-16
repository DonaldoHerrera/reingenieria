package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;

/* renamed from: jK reason: default package and case insensitive filesystem */
/* compiled from: AlphaDialogHelper.kt */
public final class C3070jK {
    private final Activity a;
    private final Bitmap b;

    public C3070jK(Activity activity, Bitmap bitmap) {
        C7471uYa.b(activity, "activity");
        C7471uYa.b(bitmap, "bitmap");
        this.a = activity;
        this.b = bitmap;
    }

    public final Activity a() {
        return this.a;
    }

    public final Bitmap b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3070jK) {
                C3070jK jKVar = (C3070jK) obj;
                if (C7471uYa.a((Object) this.a, (Object) jKVar.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Activity activity = this.a;
        int i = 0;
        int hashCode = (activity != null ? activity.hashCode() : 0) * 31;
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            i = bitmap.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityAndBitmap(activity=");
        sb.append(this.a);
        sb.append(", bitmap=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
