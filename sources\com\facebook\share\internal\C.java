package com.facebook.share.internal;

import android.net.Uri;
import com.facebook.C0594t;
import com.facebook.internal.ia;
import com.facebook.share.internal.A.a;
import com.facebook.share.model.SharePhoto;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ShareInternalUtility */
class C implements a {
    C() {
    }

    public JSONObject a(SharePhoto sharePhoto) {
        Uri a = sharePhoto.a();
        if (ia.d(a)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ImagesContract.URL, a.toString());
                return jSONObject;
            } catch (JSONException e) {
                throw new C0594t("Unable to attach images", (Throwable) e);
            }
        } else {
            throw new C0594t("Only web images may be used in OG objects shared via the web dialog");
        }
    }
}
