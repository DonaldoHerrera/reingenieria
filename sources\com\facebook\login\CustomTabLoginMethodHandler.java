package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.FragmentActivity;
import com.facebook.B;
import com.facebook.C0538h;
import com.facebook.C0594t;
import com.facebook.C0596v;
import com.facebook.CustomTabMainActivity;
import com.facebook.D;
import com.facebook.FacebookRequestError;
import com.facebook.internal.A;
import com.facebook.internal.E;
import com.facebook.internal.ia;
import com.facebook.internal.ja;
import com.facebook.login.LoginClient.Request;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Creator<CustomTabLoginMethodHandler> CREATOR = new C0568a();
    private static final String[] d = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    private String e;
    private String f;

    CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f = ia.a(20);
    }

    private String h() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        FragmentActivity c = this.b.c();
        List<ResolveInfo> queryIntentServices = c.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null) {
            HashSet hashSet = new HashSet(Arrays.asList(d));
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    this.e = serviceInfo.packageName;
                    return this.e;
                }
            }
        }
        return null;
    }

    private boolean i() {
        return k() && h() != null && j() && ja.a(B.e());
    }

    private boolean j() {
        return !ia.d((Context) this.b.c());
    }

    private boolean k() {
        A b = E.b(ia.c((Context) this.b.c()));
        return b != null && b.c();
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Request request) {
        if (!i()) {
            return false;
        }
        Bundle b = b(request);
        a(b, request);
        Intent intent = new Intent(this.b.c(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.a, b);
        intent.putExtra(CustomTabMainActivity.b, h());
        this.b.f().startActivityForResult(intent, 1);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public String b() {
        return "custom_tab";
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "chrome_custom_tab";
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public C0538h e() {
        return C0538h.CHROME_CUSTOM_TAB;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f);
    }

    CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f = parcel.readString();
    }

    /* access modifiers changed from: 0000 */
    public boolean a(int i, int i2, Intent intent) {
        if (i != 1) {
            return super.a(i, i2, intent);
        }
        Request i3 = this.b.i();
        if (i2 == -1) {
            a(intent.getStringExtra(CustomTabMainActivity.c), i3);
            return true;
        }
        super.a(i3, null, new C0596v());
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    private void a(String str, Request request) {
        int i;
        if (str != null && str.startsWith(CustomTabMainActivity.a())) {
            Uri parse = Uri.parse(str);
            Bundle d2 = ia.d(parse.getQuery());
            d2.putAll(ia.d(parse.getFragment()));
            if (!a(d2)) {
                super.a(request, null, new C0594t("Invalid state parameter"));
                return;
            }
            String string = d2.getString("error");
            if (string == null) {
                string = d2.getString("error_type");
            }
            String string2 = d2.getString("error_msg");
            if (string2 == null) {
                string2 = d2.getString("error_message");
            }
            if (string2 == null) {
                string2 = d2.getString("error_description");
            }
            String string3 = d2.getString("error_code");
            if (!ia.b(string3)) {
                try {
                    i = Integer.parseInt(string3);
                } catch (NumberFormatException unused) {
                }
                if (!ia.b(string) && ia.b(string2) && i == -1) {
                    super.a(request, d2, null);
                } else if (string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) {
                    super.a(request, null, new C0596v());
                } else if (i != 4201) {
                    super.a(request, null, new C0596v());
                } else {
                    super.a(request, null, new D(new FacebookRequestError(i, string, string2), string2));
                }
            }
            i = -1;
            if (!ia.b(string)) {
            }
            if (string == null) {
            }
            if (i != 4201) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f);
    }

    private boolean a(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f);
        } catch (JSONException unused) {
            return false;
        }
    }
}
