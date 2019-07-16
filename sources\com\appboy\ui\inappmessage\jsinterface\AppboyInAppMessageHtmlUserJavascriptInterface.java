package com.appboy.ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.appboy.h;
import com.appboy.j;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public class AppboyInAppMessageHtmlUserJavascriptInterface {
    private static final String TAG = Hg.a(AppboyInAppMessageHtmlUserJavascriptInterface.class);
    private Context mContext;

    public AppboyInAppMessageHtmlUserJavascriptInterface(Context context) {
        this.mContext = context;
    }

    @JavascriptInterface
    public void addToCustomAttributeArray(String str, String str2) {
        h.a(this.mContext).c().a(str, str2);
    }

    @JavascriptInterface
    public void incrementCustomUserAttribute(String str) {
        h.a(this.mContext).c().b(str);
    }

    /* access modifiers changed from: 0000 */
    public Kf monthFromInt(int i) {
        if (i < 1 || i > 12) {
            return null;
        }
        return Kf.a(i - 1);
    }

    /* access modifiers changed from: 0000 */
    public Jf parseGender(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (lowerCase.equals("m")) {
            return Jf.MALE;
        }
        if (lowerCase.equals("f")) {
            return Jf.FEMALE;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public String[] parseStringArrayFromJsonString(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception e) {
            Hg.b(TAG, "Failed to parse custom attribute array", e);
            return null;
        }
    }

    @JavascriptInterface
    public void removeFromCustomAttributeArray(String str, String str2) {
        h.a(this.mContext).c().b(str, str2);
    }

    @JavascriptInterface
    public void setCountry(String str) {
        h.a(this.mContext).c().c(str);
    }

    /* access modifiers changed from: 0000 */
    public void setCustomAttribute(j jVar, String str, String str2) {
        String str3 = "Failed to parse custom attribute type for key: ";
        try {
            Object obj = new JSONObject(str2).get("value");
            if (obj instanceof String) {
                jVar.c(str, (String) obj);
            } else if (obj instanceof Boolean) {
                jVar.a(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                jVar.b(str, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                jVar.a(str, ((Double) obj).floatValue());
            } else {
                String str4 = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                Hg.b(str4, sb.toString());
            }
        } catch (Exception e) {
            String str5 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(str);
            Hg.b(str5, sb2.toString(), e);
        }
    }

    @JavascriptInterface
    public void setCustomUserAttributeArray(String str, String str2) {
        String[] parseStringArrayFromJsonString = parseStringArrayFromJsonString(str2);
        if (parseStringArrayFromJsonString == null) {
            String str3 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set custom attribute array for key ");
            sb.append(str);
            Hg.b(str3, sb.toString());
            return;
        }
        h.a(this.mContext).c().a(str, parseStringArrayFromJsonString);
    }

    @JavascriptInterface
    public void setCustomUserAttributeJSON(String str, String str2) {
        setCustomAttribute(h.a(this.mContext).c(), str, str2);
    }

    @JavascriptInterface
    public void setDateOfBirth(int i, int i2, int i3) {
        Kf monthFromInt = monthFromInt(i2);
        if (monthFromInt == null) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse month for value ");
            sb.append(i2);
            Hg.b(str, sb.toString());
            return;
        }
        h.a(this.mContext).c().a(i, monthFromInt, i3);
    }

    @JavascriptInterface
    public void setEmail(String str) {
        h.a(this.mContext).c().d(str);
    }

    @JavascriptInterface
    public void setEmailNotificationSubscriptionType(String str) {
        Mf subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(str);
        if (subscriptionTypeFromJavascriptString == null) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse email subscription type in Appboy HTML in-app message javascript interface with subscription ");
            sb.append(str);
            Hg.b(str2, sb.toString());
            return;
        }
        h.a(this.mContext).c().a(subscriptionTypeFromJavascriptString);
    }

    @JavascriptInterface
    public void setFirstName(String str) {
        h.a(this.mContext).c().e(str);
    }

    @JavascriptInterface
    public void setGender(String str) {
        Jf parseGender = parseGender(str);
        if (parseGender == null) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse gender in Appboy HTML in-app message javascript interface with gender: ");
            sb.append(str);
            Hg.b(str2, sb.toString());
            return;
        }
        h.a(this.mContext).c().a(parseGender);
    }

    @JavascriptInterface
    public void setHomeCity(String str) {
        h.a(this.mContext).c().f(str);
    }

    @JavascriptInterface
    public void setLanguage(String str) {
        h.a(this.mContext).c().g(str);
    }

    @JavascriptInterface
    public void setLastName(String str) {
        h.a(this.mContext).c().h(str);
    }

    @JavascriptInterface
    public void setPhoneNumber(String str) {
        h.a(this.mContext).c().i(str);
    }

    @JavascriptInterface
    public void setPushNotificationSubscriptionType(String str) {
        Mf subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(str);
        if (subscriptionTypeFromJavascriptString == null) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse push subscription type in Appboy HTML in-app message javascript interface with subscription: ");
            sb.append(str);
            Hg.b(str2, sb.toString());
            return;
        }
        h.a(this.mContext).c().b(subscriptionTypeFromJavascriptString);
    }

    /* access modifiers changed from: 0000 */
    public Mf subscriptionTypeFromJavascriptString(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        if (lowerCase.equals("subscribed")) {
            return Mf.SUBSCRIBED;
        }
        if (lowerCase.equals("unsubscribed")) {
            return Mf.UNSUBSCRIBED;
        }
        if (lowerCase.equals("opted_in")) {
            return Mf.OPTED_IN;
        }
        return null;
    }
}
