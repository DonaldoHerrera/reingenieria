package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import androidx.core.app.k.b;
import androidx.core.app.k.c;
import androidx.core.app.k.e;

/* renamed from: Dg reason: default package */
/* compiled from: AppboyNotificationStyleFactory */
public class Dg {
    private static final String a = Hg.a(Dg.class);

    @TargetApi(16)
    public static e a(Context context, Bundle bundle, Bundle bundle2) {
        b b = (bundle2 == null || !bundle2.containsKey("appboy_image_url")) ? null : b(context, bundle, bundle2);
        if (b != null) {
            return b;
        }
        Hg.a(a, "Rendering push notification with BigTextStyle");
        return a(bundle);
    }

    @TargetApi(16)
    public static b b(Context context, Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            String str = "appboy_image_url";
            if (bundle2.containsKey(str)) {
                String string = bundle2.getString(str);
                if (Ng.d(string)) {
                    return null;
                }
                Bitmap a2 = Gg.a(context, Uri.parse(string), Ff.NOTIFICATION_EXPANDED_IMAGE);
                if (a2 == null) {
                    return null;
                }
                try {
                    if (a2.getWidth() > a2.getHeight()) {
                        DisplayMetrics a3 = Gg.a(context);
                        int a4 = Gg.a(a3.densityDpi, 192);
                        int i = a4 * 2;
                        if (i > a3.widthPixels) {
                            i = a3.widthPixels;
                        }
                        try {
                            a2 = Bitmap.createScaledBitmap(a2, i, a4, true);
                        } catch (Exception e) {
                            Hg.b(a, "Failed to scale image bitmap, using original.", e);
                        }
                    }
                    if (a2 == null) {
                        Hg.c(a, "Bitmap download failed for push notification. No image will be included with the notification.");
                        return null;
                    }
                    b bVar = new b();
                    bVar.b(a2);
                    a(bVar, bundle);
                    return bVar;
                } catch (Exception e2) {
                    Hg.b(a, "Failed to create Big Picture Style.", e2);
                }
            }
        }
        return null;
    }

    public static c a(Bundle bundle) {
        String str = null;
        if (bundle == null) {
            return null;
        }
        c cVar = new c();
        cVar.a((CharSequence) bundle.getString("a"));
        String str2 = "ab_bs";
        CharSequence string = bundle.containsKey(str2) ? bundle.getString(str2) : null;
        String str3 = "ab_bt";
        if (bundle.containsKey(str3)) {
            str = bundle.getString(str3);
        }
        if (string != null) {
            cVar.c(string);
        }
        if (str != null) {
            cVar.b(str);
        }
        return cVar;
    }

    static void a(b bVar, Bundle bundle) {
        String str = "ab_bs";
        String str2 = null;
        CharSequence string = bundle.containsKey(str) ? bundle.getString(str) : null;
        String str3 = "ab_bt";
        if (bundle.containsKey(str3)) {
            str2 = bundle.getString(str3);
        }
        if (string != null) {
            bVar.b(string);
        }
        if (str2 != null) {
            bVar.a((CharSequence) str2);
        }
        if (bundle.getString("s") == null && string == null) {
            bVar.b((CharSequence) bundle.getString("a"));
        }
    }
}
