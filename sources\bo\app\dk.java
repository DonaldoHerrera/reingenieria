package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONException;
import org.json.JSONObject;

public class dk implements dh {
    private static final String a = Hg.a(dk.class);
    private final SharedPreferences b;

    public dk(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.session_storage");
        sb.append(Ng.a(context, str, str2));
        this.b = context.getSharedPreferences(sb.toString(), 0);
    }

    public void a(bt btVar) {
        String bvVar = btVar.a().toString();
        JSONObject f = btVar.forJsonPut();
        Editor edit = this.b.edit();
        a(f);
        edit.putString(bvVar, f.toString());
        String str = "current_open_session";
        if (!btVar.c()) {
            edit.putString(str, bvVar);
        } else if (this.b.getString(str, "").equals(bvVar)) {
            edit.remove(str);
        }
        edit.apply();
    }

    public void b(bt btVar) {
        String str = "current_open_session";
        String string = this.b.getString(str, null);
        String bvVar = btVar.a().toString();
        Editor edit = this.b.edit();
        edit.remove(bvVar);
        if (bvVar.equals(string)) {
            edit.remove(str);
        }
        edit.apply();
    }

    public bt a() {
        JSONObject jSONObject;
        String str;
        String str2 = "";
        String str3 = "current_open_session";
        if (!this.b.contains(str3)) {
            Hg.a(a, "No stored open session in storage.");
            return null;
        }
        try {
            str = this.b.getString(str3, str2);
            try {
                jSONObject = new JSONObject(this.b.getString(str, str2));
            } catch (JSONException e) {
                e = e;
                jSONObject = null;
                String str4 = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Could not create new mutable session for open session with id: ");
                sb.append(str);
                sb.append(" and json data: ");
                sb.append(jSONObject);
                Hg.b(str4, sb.toString(), e);
                return null;
            }
            try {
                return new bt(jSONObject);
            } catch (JSONException e2) {
                e = e2;
                String str42 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not create new mutable session for open session with id: ");
                sb2.append(str);
                sb2.append(" and json data: ");
                sb2.append(jSONObject);
                Hg.b(str42, sb2.toString(), e);
                return null;
            }
        } catch (JSONException e3) {
            e = e3;
            str = null;
            jSONObject = null;
            String str422 = a;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Could not create new mutable session for open session with id: ");
            sb22.append(str);
            sb22.append(" and json data: ");
            sb22.append(jSONObject);
            Hg.b(str422, sb22.toString(), e);
            return null;
        }
    }

    private void a(JSONObject jSONObject) {
        String str = "end_time";
        if (!jSONObject.has(str)) {
            try {
                jSONObject.put(str, dn.b());
            } catch (JSONException unused) {
                Hg.b(a, "Failed to set end time to now for session json data");
            }
        }
    }
}
