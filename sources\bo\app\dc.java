package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class dc extends cz<by> {
    private static final String b = Hg.a(dc.class);
    final SharedPreferences a;
    private by c;

    public dc(Context context) {
        this(context, null, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public by a() {
        JSONObject a2 = this.c.forJsonPut();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = new JSONObject(this.a.getString("cached_device", "{}"));
        } catch (JSONException e) {
            Hg.b(b, "Caught exception confirming and unlocking Json objects.", e);
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator keys = a2.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object opt = a2.opt(str);
            Object opt2 = jSONObject.opt(str);
            if ((opt instanceof JSONObject) || (opt instanceof JSONArray)) {
                if (opt2 != null) {
                    try {
                        if (!hx.a(String.valueOf(opt), String.valueOf(opt2), hy.NON_EXTENSIBLE).b()) {
                        }
                    } catch (JSONException e2) {
                        Hg.a(b, "Caught json exception creating dirty outbound device on a jsonObject value. Returning the whole device.", e2);
                        return this.c;
                    }
                }
                jSONObject2.put(str, opt);
            } else if (!opt.equals(opt2)) {
                try {
                    jSONObject2.put(str, opt);
                } catch (JSONException e3) {
                    Hg.b(b, "Caught json exception creating dirty outbound device. Returning the whole device.", e3);
                    return this.c;
                }
            }
        }
        try {
            return by.a(jSONObject2);
        } catch (JSONException e4) {
            Hg.a(b, "Caught json exception creating device from json. Returning the whole device.", e4);
            return this.c;
        }
    }

    public dc(Context context, String str, String str2) {
        this.c = null;
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.device_cache.v3");
        sb.append(Ng.a(context, str, str2));
        this.a = context.getSharedPreferences(sb.toString(), 0);
    }

    public void a(by byVar) {
        this.c = byVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(by byVar, boolean z) {
        String str = "cached_device";
        if (z && byVar != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.a.getString(str, "{}"));
                JSONObject a2 = byVar.forJsonPut();
                Editor edit = this.a.edit();
                edit.putString(str, du.a(jSONObject, a2).toString());
                edit.apply();
            } catch (JSONException e) {
                Hg.a(b, "Caught exception confirming and unlocking device cache.", e);
            }
        }
    }
}
