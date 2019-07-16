package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;

/* renamed from: _Oa reason: default package */
/* compiled from: IconRequest */
public class _Oa {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public _Oa(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static _Oa a(Context context, String str) {
        String str2 = "Fabric";
        if (str != null) {
            try {
                int d2 = C7391tNa.d(context);
                C5701cNa e = C5328TMa.e();
                StringBuilder sb = new StringBuilder();
                sb.append("App icon resource ID is ");
                sb.append(d2);
                e.d(str2, sb.toString());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), d2, options);
                return new _Oa(str, d2, options.outWidth, options.outHeight);
            } catch (Exception e2) {
                C5328TMa.e().e(str2, "Failed to load icon", e2);
            }
        }
        return null;
    }
}
