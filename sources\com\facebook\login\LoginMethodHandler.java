package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C0538h;
import com.facebook.C0594t;
import com.facebook.internal.ia;
import com.facebook.login.LoginClient.Request;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

abstract class LoginMethodHandler implements Parcelable {
    Map<String, String> a;
    protected LoginClient b;

    LoginMethodHandler(LoginClient loginClient) {
        this.b = loginClient;
    }

    static String b(String str) throws C0594t {
        if (str == null || str.isEmpty()) {
            throw new C0594t("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), "UTF-8")).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new C0594t("Failed to retrieve user_id from signed_request");
    }

    /* access modifiers changed from: 0000 */
    public void a() {
    }

    /* access modifiers changed from: 0000 */
    public void a(LoginClient loginClient) {
        if (this.b == null) {
            this.b = loginClient;
            return;
        }
        throw new C0594t("Can't set LoginClient if it is already set.");
    }

    /* access modifiers changed from: 0000 */
    public void a(JSONObject jSONObject) throws JSONException {
    }

    /* access modifiers changed from: 0000 */
    public boolean a(int i, int i2, Intent intent) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean a(Request request);

    /* access modifiers changed from: 0000 */
    public abstract String b();

    /* access modifiers changed from: protected */
    public void c(String str) {
        String a2 = this.b.i().a();
        C1452kk kkVar = new C1452kk(this.b.c(), a2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", a2);
        kkVar.a("fb_dialogs_web_login_dialog_complete", (Double) null, bundle);
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ia.a(parcel, this.a);
    }

    LoginMethodHandler(Parcel parcel) {
        this.a = ia.a(parcel);
    }

    /* access modifiers changed from: protected */
    public String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", b());
            a(jSONObject);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating client state json: ");
            sb.append(e.getMessage());
            Log.w("LoginMethodHandler", sb.toString());
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: protected */
    public void a(String str, Object obj) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, obj == null ? null : obj.toString());
    }

    static AccessToken a(Bundle bundle, C0538h hVar, String str) {
        Bundle bundle2 = bundle;
        Date a2 = ia.a(bundle2, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList stringArrayList = bundle2.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle2.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date a3 = ia.a(bundle2, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
        if (ia.b(string)) {
            return null;
        }
        AccessToken accessToken = new AccessToken(string, str, bundle2.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, null, hVar, a2, new Date(), a3);
        return accessToken;
    }

    public static AccessToken a(Collection<String> collection, Bundle bundle, C0538h hVar, String str) throws C0594t {
        Bundle bundle2 = bundle;
        Date a2 = ia.a(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        Date a3 = ia.a(bundle, "data_access_expiration_time", new Date(0));
        String string2 = bundle.getString("granted_scopes");
        String str2 = ",";
        Collection<String> arrayList = !ia.b(string2) ? new ArrayList<>(Arrays.asList(string2.split(str2))) : collection;
        String string3 = bundle.getString("denied_scopes");
        Collection arrayList2 = !ia.b(string3) ? new ArrayList(Arrays.asList(string3.split(str2))) : null;
        String string4 = bundle.getString("expired_scopes");
        Collection arrayList3 = !ia.b(string4) ? new ArrayList(Arrays.asList(string4.split(str2))) : null;
        if (ia.b(string)) {
            return null;
        }
        AccessToken accessToken = new AccessToken(string, str, b(bundle.getString("signed_request")), arrayList, arrayList2, arrayList3, hVar, a2, new Date(), a3);
        return accessToken;
    }
}
