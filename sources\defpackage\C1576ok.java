package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.B;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ok reason: default package and case insensitive filesystem */
/* compiled from: UserDataStore */
public class C1576ok {
    private static final String a = "ok";
    private static ConcurrentHashMap<String, String> b;
    private static SharedPreferences c;
    private static AtomicBoolean d = new AtomicBoolean(false);

    static String a() {
        if (!d.get()) {
            Log.w(a, "initStore should have been called before calling setUserID");
            c();
        }
        return a((Map<String, String>) b);
    }

    static void b() {
        if (!d.get()) {
            c();
        }
    }

    private static synchronized void c() {
        synchronized (C1576ok.class) {
            if (!d.get()) {
                c = PreferenceManager.getDefaultSharedPreferences(B.e());
                b = new ConcurrentHashMap<>(a(c.getString("com.facebook.appevents.UserDataStore.userData", "")));
                d.set(true);
            }
        }
    }

    private static String a(Map<String, String> map) {
        String str = "";
        if (map.isEmpty()) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : map.keySet()) {
                jSONObject.put(str2, map.get(str2));
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    private static Map<String, String> a(String str) {
        if (str.isEmpty()) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, jSONObject.getString(str2));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }
}
