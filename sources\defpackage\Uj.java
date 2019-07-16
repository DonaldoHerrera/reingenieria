package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.facebook.C0594t;
import com.facebook.O;
import com.facebook.internal.W;
import com.facebook.internal.ia;
import com.soundcloud.flippernative.BuildConfig;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Uj reason: default package */
/* compiled from: AppEvent */
class Uj implements Serializable {
    private static final HashSet<String> a = new HashSet<>();
    private final JSONObject b;
    private final boolean c;
    private final boolean d;
    private final String e;
    private final String f;

    /* renamed from: Uj$a */
    /* compiled from: AppEvent */
    static class a implements Serializable {
        private final String a;
        private final boolean b;
        private final boolean c;

        private Object readResolve() throws JSONException {
            Uj uj = new Uj(this.a, this.b, this.c, null);
            return uj;
        }
    }

    /* renamed from: Uj$b */
    /* compiled from: AppEvent */
    static class b implements Serializable {
        private final String a;
        private final boolean b;
        private final boolean c;
        private final String d;

        private Object readResolve() throws JSONException {
            Uj uj = new Uj(this.a, this.b, this.c, this.d);
            return uj;
        }

        private b(String str, boolean z, boolean z2, String str2) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = str2;
        }
    }

    private String e() {
        if (VERSION.SDK_INT > 19) {
            return a(this.b.toString());
        }
        ArrayList arrayList = new ArrayList();
        Iterator keys = this.b.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str);
            sb.append(" = ");
            sb.append(this.b.optString(str));
            sb.append(10);
        }
        return a(sb.toString());
    }

    private Object writeReplace() {
        b bVar = new b(this.b.toString(), this.c, this.d, this.f);
        return bVar;
    }

    public boolean a() {
        return this.c;
    }

    public JSONObject b() {
        return this.b;
    }

    public String c() {
        return this.e;
    }

    public boolean d() {
        if (this.f == null) {
            return true;
        }
        return e().equals(this.f);
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", new Object[]{this.b.optString("_eventName"), Boolean.valueOf(this.c), this.b.toString()});
    }

    public Uj(String str, String str2, Double d2, Bundle bundle, boolean z, boolean z2, UUID uuid) throws JSONException, C0594t {
        this.b = a(str, str2, d2, bundle, z, z2, uuid);
        this.c = z;
        this.d = z2;
        this.e = str2;
        this.f = e();
    }

    private static JSONObject a(String str, String str2, Double d2, Bundle bundle, boolean z, boolean z2, UUID uuid) throws C0594t, JSONException {
        b(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_eventName", str2);
        jSONObject.put("_eventName_md5", a(str2));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (d2 != null) {
            jSONObject.put("_valueToSum", d2.doubleValue());
        }
        String str3 = "1";
        if (z) {
            jSONObject.put("_implicitlyLogged", str3);
        }
        if (z2) {
            jSONObject.put("_inBackground", str3);
        }
        if (bundle != null) {
            for (String str4 : bundle.keySet()) {
                b(str4);
                Object obj = bundle.get(str4);
                if ((obj instanceof String) || (obj instanceof Number)) {
                    jSONObject.put(str4, obj.toString());
                } else {
                    throw new C0594t(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{obj, str4}));
                }
            }
        }
        if (!z) {
            W.a(O.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    private static void b(String str) throws C0594t {
        boolean contains;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new C0594t(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, Integer.valueOf(40)}));
        }
        synchronized (a) {
            contains = a.contains(str);
        }
        if (contains) {
            return;
        }
        if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            synchronized (a) {
                a.add(str);
            }
            return;
        }
        throw new C0594t(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
    }

    private Uj(String str, boolean z, boolean z2, String str2) throws JSONException {
        this.b = new JSONObject(str);
        this.c = z;
        this.e = this.b.optString("_eventName");
        this.f = str2;
        this.d = z2;
    }

    private static String a(String str) {
        String str2 = "Failed to generate checksum: ";
        try {
            MessageDigest instance = MessageDigest.getInstance(Constants.MD5);
            byte[] bytes = str.getBytes("UTF-8");
            instance.update(bytes, 0, bytes.length);
            return Qk.a(instance.digest());
        } catch (NoSuchAlgorithmException e2) {
            ia.a(str2, (Exception) e2);
            return BuildConfig.VERSION_NAME;
        } catch (UnsupportedEncodingException e3) {
            ia.a(str2, (Exception) e3);
            return "1";
        }
    }
}
