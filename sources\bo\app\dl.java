package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.Scopes;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class dl extends cz<cd> {
    private static final String c = Hg.a(dl.class);
    final SharedPreferences a;
    final SharedPreferences b;
    private final bk d;
    private final dj e;
    private final String f;

    public dl(Context context, bk bkVar, dj djVar) {
        this(context, null, null, bkVar, djVar);
    }

    public synchronized void b(String str) {
        c("first_name", str);
    }

    public synchronized void c(String str) {
        c("last_name", str);
    }

    public synchronized boolean d(String str) {
        if (str != null) {
            try {
                str = str.trim();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str != null) {
            if (!Og.b(str)) {
                String str2 = c;
                StringBuilder sb = new StringBuilder();
                sb.append("Email address is not valid: ");
                sb.append(str);
                Hg.e(str2, sb.toString());
                return false;
            }
        }
        return c(Scopes.EMAIL, str);
    }

    public synchronized void e(String str) {
        c("country", str);
    }

    public synchronized void f(String str) {
        c("home_city", str);
    }

    public synchronized void g(String str) {
        c("language", str);
    }

    public synchronized boolean h(String str) {
        if (str != null) {
            try {
                str = str.trim();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str != null) {
            if (!Og.c(str)) {
                String str2 = c;
                StringBuilder sb = new StringBuilder();
                sb.append("Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): ");
                sb.append(str);
                Hg.e(str2, sb.toString());
                return false;
            }
        }
        return c("phone", str);
    }

    public synchronized void i(String str) {
        c("image_url", str);
    }

    public synchronized void j(String str) {
        if (Ng.d(str)) {
            c("piqid", null);
        } else {
            c("piqid", str);
        }
        if (be.e()) {
            c("piqid_changed", Boolean.valueOf(true));
        }
    }

    public synchronized boolean k(String str) {
        if (!Jg.a(str, this.e.n())) {
            Hg.e(c, "Custom attribute key cannot be null.");
            return false;
        }
        return b(Og.a(str), JSONObject.NULL);
    }

    public dl(Context context, String str, String str2, bk bkVar, dj djVar) {
        String a2 = Ng.a(context, str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.user_cache.v3");
        sb.append(a2);
        this.a = context.getSharedPreferences(sb.toString(), 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.appboy.storage.user_cache.push_token_store");
        sb2.append(a2);
        this.b = context.getSharedPreferences(sb2.toString(), 0);
        this.d = bkVar;
        this.e = djVar;
        this.f = str;
    }

    private boolean c(String str, Object obj) {
        JSONObject f2 = f();
        if (obj == null) {
            try {
                f2.put(str, JSONObject.NULL);
            } catch (JSONException unused) {
                String str2 = c;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to write to user object json from prefs with key: [");
                sb.append(str);
                sb.append("] value: [");
                sb.append(obj);
                sb.append("] ");
                Hg.e(str2, sb.toString());
                return false;
            }
        } else {
            f2.put(str, obj);
        }
        Editor edit = this.a.edit();
        edit.putString("user_cache_attributes_object", f2.toString());
        edit.apply();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    private JSONObject g() {
        JSONObject jSONObject;
        JSONObject f2 = f();
        String str = "custom";
        if (f2.has(str)) {
            try {
                jSONObject = f2.getJSONObject(str);
            } catch (JSONException e2) {
                Hg.b(c, "Could not create custom attributes json object from preferences.", e2);
            }
            return jSONObject != null ? new JSONObject() : jSONObject;
        }
        jSONObject = null;
        if (jSONObject != null) {
        }
    }

    public synchronized void a(String str) {
        c("user_id", str);
    }

    public synchronized void b(Mf mf) {
        if (mf == null) {
            c("push_subscribe", null);
        } else {
            c("push_subscribe", mf.forJsonPut());
        }
    }

    /* renamed from: e */
    public cd a() {
        if (!Ng.e(this.f)) {
            a(this.f);
        }
        JSONObject f2 = f();
        try {
            a(f2);
        } catch (JSONException e2) {
            Hg.b(c, "Couldn't add push token to outbound json", e2);
        }
        this.a.edit().clear().apply();
        return new cd(f2);
    }

    /* access modifiers changed from: 0000 */
    public JSONObject f() {
        String string = this.a.getString("user_cache_attributes_object", null);
        if (string == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e2) {
            String str = c;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to load user object json from prefs with json string: ");
            sb.append(string);
            Hg.b(str, sb.toString(), e2);
            return new JSONObject();
        }
    }

    public synchronized void a(Jf jf) {
        if (jf == null) {
            c("gender", null);
        } else {
            c("gender", jf.forJsonPut());
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean b(String str, Object obj) {
        JSONObject g = g();
        if (obj == null) {
            try {
                g.put(str, JSONObject.NULL);
            } catch (JSONException e2) {
                String str2 = c;
                StringBuilder sb = new StringBuilder();
                sb.append("Could not write to custom attributes json object with key: [");
                sb.append(str);
                sb.append("] value: [");
                sb.append(obj);
                sb.append("] ");
                Hg.d(str2, sb.toString(), e2);
                return false;
            }
        } else {
            g.put(str, obj);
        }
        return c("custom", g);
    }

    public synchronized void d() {
        this.b.edit().clear().apply();
    }

    public synchronized boolean a(int i, Kf kf, int i2) {
        if (kf == null) {
            Hg.e(c, "Month cannot be null.");
            return false;
        }
        return c("dob", dn.a(dn.a(i, kf.a(), i2), s.SHORT));
    }

    public synchronized void a(Mf mf) {
        if (mf == null) {
            c("email_subscribe", null);
        } else {
            c("email_subscribe", mf.forJsonPut());
        }
    }

    public synchronized void a(C1902zg zgVar) {
        a("twitter", zgVar != null ? zgVar.forJsonPut() : null);
    }

    public synchronized void a(C1842xg xgVar) {
        a("facebook", xgVar != null ? xgVar.forJsonPut() : null);
    }

    public synchronized void a(C1812wg wgVar) {
        a("ab_install_attribution", wgVar != null ? wgVar.forJsonPut() : null);
    }

    public synchronized boolean a(String str, Object obj) {
        if (!Jg.a(str, this.e.n())) {
            Hg.e(c, "Custom attribute key cannot be null.");
            return false;
        }
        String a2 = Og.a(str);
        if (!(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Long)) {
            if (!(obj instanceof Double)) {
                if (obj instanceof String) {
                    return b(a2, Og.a((String) obj));
                } else if (obj instanceof Date) {
                    return b(a2, dn.a((Date) obj, s.LONG));
                } else if (obj instanceof String[]) {
                    return b(a2, du.a((T[]) (String[]) obj));
                } else {
                    String str2 = c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not add unsupported custom attribute type with key: ");
                    sb.append(a2);
                    sb.append(" and value: ");
                    sb.append(obj);
                    Hg.e(str2, sb.toString());
                    return false;
                }
            }
        }
        return b(a2, obj);
    }

    public synchronized boolean a(String str, long j) {
        return a(str, (Object) dn.a(j));
    }

    /* access modifiers changed from: 0000 */
    public void a(JSONObject jSONObject) {
        String a2 = this.d.a();
        if (a2 == null) {
            Hg.a(c, "Cannot add null push token to attributes object.");
            return;
        }
        String str = "push_token";
        String string = this.b.getString(str, null);
        if (string == null || !a2.equals(string)) {
            jSONObject.put(str, a2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(cd cdVar, boolean z) {
        if (cdVar == null || cdVar.a() == null) {
            Hg.a(c, "Tried to confirm with a null outbound user. Doing nothing.");
            return;
        }
        JSONObject a2 = cdVar.a();
        String str = "push_token";
        if (z) {
            if (a2.has(str)) {
                Editor edit = this.b.edit();
                edit.putString(str, a2.optString(str));
                edit.apply();
            }
            return;
        }
        JSONObject f2 = f();
        JSONObject a3 = du.a(a2, f2);
        a3.remove(str);
        String str2 = "custom";
        JSONObject optJSONObject = f2.optJSONObject(str2);
        JSONObject optJSONObject2 = a2.optJSONObject(str2);
        if (optJSONObject != null && optJSONObject2 != null) {
            try {
                a3.put(str2, du.a(optJSONObject2, optJSONObject));
            } catch (JSONException e2) {
                Hg.d(c, "Failed to add merged custom attributes back to user object.", e2);
            }
        } else if (optJSONObject != null) {
            a3.put(str2, optJSONObject);
        } else if (optJSONObject2 != null) {
            a3.put(str2, optJSONObject2);
        }
        Editor edit2 = this.a.edit();
        edit2.putString("user_cache_attributes_object", a3.toString());
        edit2.apply();
    }

    /* access modifiers changed from: 0000 */
    public boolean a(String str, JSONObject jSONObject) {
        JSONObject f2 = f();
        if (jSONObject == null) {
            try {
                f2.put(str, JSONObject.NULL);
            } catch (JSONException unused) {
                String str2 = c;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to write to user object json from prefs with key: [");
                sb.append(str);
                sb.append("] value: [");
                sb.append(jSONObject);
                sb.append("] ");
                Hg.e(str2, sb.toString());
                return false;
            }
        } else {
            JSONObject optJSONObject = f2.optJSONObject(str);
            if (optJSONObject != null) {
                f2.put(str, du.a(optJSONObject, jSONObject));
            } else {
                f2.put(str, jSONObject);
            }
        }
        Editor edit = this.a.edit();
        edit.putString("user_cache_attributes_object", f2.toString());
        edit.apply();
        return true;
    }
}
