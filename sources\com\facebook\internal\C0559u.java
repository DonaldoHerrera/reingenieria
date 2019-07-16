package com.facebook.internal;

import com.facebook.FacebookRequestError.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.u reason: case insensitive filesystem */
/* compiled from: FacebookRequestErrorClassification */
public final class C0559u {
    private static C0559u a;
    private final Map<Integer, Set<Integer>> b;
    private final Map<Integer, Set<Integer>> c;
    private final Map<Integer, Set<Integer>> d;
    private final String e;
    private final String f;
    private final String g;

    C0559u(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    private static C0559u b() {
        C0559u uVar = new C0559u(null, new r(), new C0557s(), null, null, null);
        return uVar;
    }

    public String a(a aVar) {
        int i = C0558t.a[aVar.ordinal()];
        if (i == 1) {
            return this.e;
        }
        if (i == 2) {
            return this.g;
        }
        if (i != 3) {
            return null;
        }
        return this.f;
    }

    public a a(int i, int i2, boolean z) {
        if (z) {
            return a.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.b;
        if (map != null && map.containsKey(Integer.valueOf(i))) {
            Set set = (Set) this.b.get(Integer.valueOf(i));
            if (set == null || set.contains(Integer.valueOf(i2))) {
                return a.OTHER;
            }
        }
        Map<Integer, Set<Integer>> map2 = this.d;
        if (map2 != null && map2.containsKey(Integer.valueOf(i))) {
            Set set2 = (Set) this.d.get(Integer.valueOf(i));
            if (set2 == null || set2.contains(Integer.valueOf(i2))) {
                return a.LOGIN_RECOVERABLE;
            }
        }
        Map<Integer, Set<Integer>> map3 = this.c;
        if (map3 != null && map3.containsKey(Integer.valueOf(i))) {
            Set set3 = (Set) this.c.get(Integer.valueOf(i));
            if (set3 == null || set3.contains(Integer.valueOf(i2))) {
                return a.TRANSIENT;
            }
        }
        return a.OTHER;
    }

    public static synchronized C0559u a() {
        C0559u uVar;
        synchronized (C0559u.class) {
            if (a == null) {
                a = b();
            }
            uVar = a;
        }
        return uVar;
    }

    private static Map<Integer, Set<Integer>> a(JSONObject jSONObject) {
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("code");
                if (optInt != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            int optInt2 = optJSONArray2.optInt(i2);
                            if (optInt2 != 0) {
                                hashSet.add(Integer.valueOf(optInt2));
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
            }
        }
        return hashMap;
    }

    public static C0559u a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("name");
                if (optString != null) {
                    String str4 = "recovery_message";
                    if (optString.equalsIgnoreCase("other")) {
                        str = optJSONObject.optString(str4, null);
                        map = a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("transient")) {
                        str2 = optJSONObject.optString(str4, null);
                        map2 = a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("login_recoverable")) {
                        str3 = optJSONObject.optString(str4, null);
                        map3 = a(optJSONObject);
                    }
                }
            }
        }
        C0559u uVar = new C0559u(map, map2, map3, str, str2, str3);
        return uVar;
    }
}
