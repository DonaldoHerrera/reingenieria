package defpackage;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aI reason: default package and case insensitive filesystem */
public class C2443aI {
    private static final String a = "aI";

    public static JSONArray a(JSONObject jSONObject) {
        String str = "segments";
        String str2 = "body";
        JSONArray jSONArray = new JSONArray();
        try {
            if (!jSONObject.has(str2)) {
                return jSONArray;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            return jSONObject2.has(str) ? jSONObject2.getJSONArray(str) : jSONArray;
        } catch (JSONException unused) {
            Log.e(a, "Krux segments parse segments error.");
            return jSONArray;
        } catch (Exception e) {
            String str3 = a;
            StringBuilder sb = new StringBuilder("Exception: ");
            sb.append(e);
            Log.e(str3, sb.toString());
            return jSONArray;
        }
    }
}
