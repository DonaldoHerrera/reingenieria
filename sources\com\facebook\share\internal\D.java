package com.facebook.share.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.C0594t;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.ParcelableResourceWithMimeType;
import com.facebook.GraphRequest.b;
import com.facebook.M;
import com.facebook.internal.C0540a;
import com.facebook.internal.Z;
import com.facebook.internal.ia;
import com.facebook.share.internal.A.a;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.widget.LikeView.e;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ShareInternalUtility */
public final class D {
    public static boolean a(int i, int i2, Intent intent, B b) {
        C0540a a = a(i, i2, intent);
        if (a == null) {
            return false;
        }
        a.a();
        throw null;
    }

    private static C0540a a(int i, int i2, Intent intent) {
        UUID b = Z.b(intent);
        if (b == null) {
            return null;
        }
        return C0540a.a(b, i);
    }

    public static JSONObject a(ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        return A.a(shareOpenGraphContent.c(), (a) new C());
    }

    public static JSONArray a(JSONArray jSONArray, boolean z) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    public static JSONObject a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = a((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    obj = a((JSONArray) obj, true);
                }
                Pair a = a(string);
                String str = (String) a.first;
                String str2 = (String) a.second;
                if (z) {
                    if (str == null || !str.equals("fbsdk")) {
                        if (str != null) {
                            if (!str.equals("og")) {
                                jSONObject3.put(str2, obj);
                            }
                        }
                        jSONObject2.put(str2, obj);
                    } else {
                        jSONObject2.put(string, obj);
                    }
                } else if (str == null || !str.equals("fb")) {
                    jSONObject2.put(str2, obj);
                } else {
                    jSONObject2.put(string, obj);
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new C0594t("Failed to create json object from share content");
        }
    }

    public static Pair<String, String> a(String str) {
        String str2;
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            int i = indexOf + 1;
            if (str.length() > i) {
                str2 = str.substring(0, indexOf);
                str = str.substring(i);
                return new Pair<>(str2, str);
            }
        }
        str2 = null;
        return new Pair<>(str2, str);
    }

    public static GraphRequest a(AccessToken accessToken, File file, b bVar) throws FileNotFoundException {
        ParcelableResourceWithMimeType parcelableResourceWithMimeType = new ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        AccessToken accessToken2 = accessToken;
        GraphRequest graphRequest = new GraphRequest(accessToken2, "me/staging_resources", bundle, M.POST, bVar);
        return graphRequest;
    }

    public static GraphRequest a(AccessToken accessToken, Uri uri, b bVar) throws FileNotFoundException {
        if (ia.c(uri)) {
            return a(accessToken, new File(uri.getPath()), bVar);
        }
        if (ia.b(uri)) {
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = new ParcelableResourceWithMimeType(uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            AccessToken accessToken2 = accessToken;
            GraphRequest graphRequest = new GraphRequest(accessToken2, "me/staging_resources", bundle, M.POST, bVar);
            return graphRequest;
        }
        throw new C0594t("The image Uri must be either a file:// or content:// Uri");
    }

    public static e a(e eVar, e eVar2) {
        if (eVar == eVar2) {
            return eVar;
        }
        e eVar3 = e.UNKNOWN;
        if (eVar == eVar3) {
            return eVar2;
        }
        if (eVar2 == eVar3) {
            return eVar;
        }
        return null;
    }
}
