package com.appboy.ui.support;

import android.content.Context;
import android.net.Uri;
import com.appboy.h;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

public class FrescoLibraryUtils {
    private static final String TAG = Hg.a(FrescoLibraryUtils.class);
    private static final String[] USED_FRESCO_CLASSES = {"com.facebook.drawee.backends.pipeline.Fresco", "com.facebook.drawee.interfaces.DraweeController", "com.facebook.drawee.view.SimpleDraweeView", "com.facebook.drawee.backends.pipeline.Fresco", "com.facebook.drawee.controller.BaseControllerListener", "com.facebook.drawee.controller.ControllerListener", "com.facebook.imagepipeline.image.ImageInfo"};
    private static boolean sCanUseFresco = false;
    private static boolean sCanUseFrescoSet = false;

    public static boolean canUseFresco(Context context) {
        if (sCanUseFrescoSet) {
            return sCanUseFresco;
        }
        if (!getIsFrescoEnabled(context.getApplicationContext())) {
            sCanUseFresco = false;
            sCanUseFrescoSet = true;
            return false;
        }
        try {
            ClassLoader classLoader = FrescoLibraryUtils.class.getClassLoader();
            sCanUseFresco = true;
            String[] strArr = USED_FRESCO_CLASSES;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (Class.forName(strArr[i], false, classLoader) == null) {
                    sCanUseFresco = false;
                    break;
                } else {
                    i++;
                }
            }
        } catch (Exception unused) {
            sCanUseFresco = false;
        } catch (NoClassDefFoundError unused2) {
            sCanUseFresco = false;
        } catch (Throwable unused3) {
            sCanUseFresco = false;
        }
        sCanUseFrescoSet = true;
        return sCanUseFresco;
    }

    static Uri getFrescoUri(String str) {
        Uri parse = Uri.parse(str);
        if (!Ng.d(parse.getScheme())) {
            return parse;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("file://");
        sb.append(str);
        return Uri.parse(sb.toString());
    }

    private static boolean getIsFrescoEnabled(Context context) {
        return new Bf(context).m();
    }

    public static void setDraweeControllerHelper(SimpleDraweeView simpleDraweeView, String str, float f, boolean z) {
        setDraweeControllerHelper(simpleDraweeView, str, f, z, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.facebook.drawee.controller.ControllerListener<com.facebook.imagepipeline.image.ImageInfo>, code=com.appboy.ui.support.FrescoLibraryUtils$1, for r9v0, types: [com.facebook.drawee.controller.ControllerListener<com.facebook.imagepipeline.image.ImageInfo>] */
    public static void setDraweeControllerHelper(final SimpleDraweeView simpleDraweeView, String str, final float f, final boolean z, AnonymousClass1 r9) {
        String str2 = "Fresco controller builder could not be retrieved. Fresco most likely prematurely shutdown.";
        if (Ng.d(str)) {
            Hg.e(TAG, "The url set for the Drawee controller was null. Controller not set.");
        } else if (simpleDraweeView == null) {
            Hg.e(TAG, "The SimpleDraweeView set for the Drawee controller was null. Controller not set.");
        } else {
            RequestLevel requestLevel = h.e() ? RequestLevel.DISK_CACHE : RequestLevel.FULL_FETCH;
            String str3 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Setting Fresco image request level to: ");
            sb.append(requestLevel);
            Hg.a(str3, sb.toString());
            if (r9 == null) {
                r9 = new BaseControllerListener<ImageInfo>() {
                };
            }
            try {
                Uri frescoUri = getFrescoUri(str);
                simpleDraweeView.setController(Fresco.newDraweeControllerBuilder().setUri(frescoUri).setAutoPlayAnimations(true).setTapToRetryEnabled(true).setControllerListener(r9).setImageRequest(ImageRequestBuilder.newBuilderWithSource(frescoUri).setLowestPermittedRequestLevel(requestLevel).build()).build());
            } catch (NullPointerException e) {
                Hg.b(TAG, str2, e);
            } catch (Exception e2) {
                Hg.b(TAG, str2, e2);
            }
        }
    }
}
