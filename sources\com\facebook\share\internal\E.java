package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.C0594t;
import com.facebook.internal.ia;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebDialogParameters */
public class E {
    public static Bundle a(ShareLinkContent shareLinkContent) {
        Bundle a = a((ShareContent) shareLinkContent);
        ia.a(a, "href", shareLinkContent.a());
        ia.a(a, "quote", shareLinkContent.c());
        return a;
    }

    public static Bundle a(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle a = a((ShareContent) shareOpenGraphContent);
        ia.a(a, "action_type", shareOpenGraphContent.c().c());
        try {
            JSONObject a2 = D.a(D.a(shareOpenGraphContent), false);
            if (a2 != null) {
                ia.a(a, "action_properties", a2.toString());
            }
            return a;
        } catch (JSONException e) {
            throw new C0594t("Unable to serialize the ShareOpenGraphContent to JSON", (Throwable) e);
        }
    }

    public static Bundle a(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag b = shareContent.b();
        if (b != null) {
            ia.a(bundle, "hashtag", b.a());
        }
        return bundle;
    }
}
