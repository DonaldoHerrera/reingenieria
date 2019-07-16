package defpackage;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ZH reason: default package and case insensitive filesystem */
public class C2405ZH {
    private static final String a = "ZH";

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003b */
    public static C2424_H a(JSONObject jSONObject) {
        StringBuilder sb;
        String str;
        String str2 = "userData";
        String str3 = "pixel";
        String str4 = "event";
        String str5 = "name";
        String str6 = "services";
        String str7 = "uuid";
        String str8 = "location_services_enabled";
        String str9 = "site";
        String str10 = "publisher";
        String str11 = "params";
        C2424_H _h = new C2424_H();
        try {
            if (jSONObject.has(str11) && jSONObject.getJSONObject(str11).has(str8)) {
                Object obj = jSONObject.getJSONObject(str11).get(str8);
                _h.f = ((Boolean) obj).booleanValue();
                _h.f = Boolean.parseBoolean((String) obj);
            }
            if (jSONObject.has(str10) && jSONObject.getJSONObject(str10).has(str7)) {
                _h.a = jSONObject.getJSONObject(str10).getString(str7);
            }
            if (jSONObject.has(str9) && jSONObject.getJSONObject(str9).has(str5)) {
                _h.d = jSONObject.getJSONObject(str9).getString(str5);
            }
            if (jSONObject.has(str6)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str6);
                String str12 = "https:";
                if (jSONObject2.has(str4)) {
                    StringBuilder sb2 = new StringBuilder(str12);
                    sb2.append(jSONObject2.getString(str4));
                    _h.c = sb2.toString();
                }
                if (jSONObject2.has(str3)) {
                    StringBuilder sb3 = new StringBuilder(str12);
                    sb3.append(jSONObject2.getString(str3));
                    _h.b = sb3.toString();
                }
                if (jSONObject2.has(str2)) {
                    StringBuilder sb4 = new StringBuilder(str12);
                    sb4.append(jSONObject2.getString(str2));
                    _h.e = sb4.toString();
                }
            }
        } catch (JSONException e) {
            str = a;
            sb = new StringBuilder("Krux Config parse error");
            sb.append(e.getMessage());
            Log.e(str, sb.toString());
            return _h;
        } catch (Exception e2) {
            str = a;
            sb = new StringBuilder("Exception: ");
            sb.append(e2);
            Log.e(str, sb.toString());
            return _h;
        }
        return _h;
    }
}
