package defpackage;

import com.soundcloud.android.payments.Aa;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pla reason: default package and case insensitive filesystem */
/* compiled from: ResponseProcessor */
class C4639pla {
    C4639pla() {
    }

    /* access modifiers changed from: 0000 */
    public String a(String str) throws JSONException {
        return new JSONObject(str).getString("developerPayload");
    }

    /* access modifiers changed from: 0000 */
    public Aa b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return new Aa(jSONObject.getString("productId"), C4623nla.b(jSONObject.optString("title")), jSONObject.optString("description"), jSONObject.optString("price"));
    }
}
