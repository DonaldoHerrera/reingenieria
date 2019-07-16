package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vg reason: default package and case insensitive filesystem */
public final class C1782vg implements C1294fg<JSONObject> {
    private static final String a = Hg.a(C1782vg.class);
    private JSONObject b = new JSONObject();

    public C1782vg() {
    }

    static boolean c(String str) {
        if (!Ng.d(str)) {
            return true;
        }
        Hg.e(a, "The Appboy property value cannot be null or contain only whitespaces. Not adding property.");
        return false;
    }

    public C1782vg a(String str, boolean z) {
        if (!a(str)) {
            return this;
        }
        try {
            this.b.put(Og.a(str), z);
        } catch (JSONException e) {
            Hg.b(a, "Caught json exception trying to add property.", e);
        }
        return this;
    }

    public int h() {
        return this.b.length();
    }

    public JSONObject forJsonPut() {
        return this.b;
    }

    public C1782vg(JSONObject jSONObject) {
        this.b = jSONObject;
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        for (String str : arrayList) {
            if (!a(str)) {
                this.b.remove(str);
            } else {
                try {
                    if (jSONObject.get(str) instanceof String) {
                        if (!c(jSONObject.getString(str))) {
                            this.b.remove(str);
                        }
                    } else if (jSONObject.get(str) == JSONObject.NULL) {
                        this.b.remove(str);
                    }
                } catch (JSONException e) {
                    String str2 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Caught json exception validating property with key name: ");
                    sb.append(str);
                    Hg.b(str2, sb.toString(), e);
                }
            }
        }
    }

    public C1782vg a(String str, String str2) {
        if (a(str) && c(str2)) {
            try {
                this.b.put(Og.a(str), Og.a(str2));
            } catch (JSONException e) {
                Hg.b(a, "Caught json exception trying to add property.", e);
            }
        }
        return this;
    }

    static boolean a(String str) {
        if (Ng.d(str)) {
            Hg.e(a, "The Appboy property key cannot be null or contain only whitespaces. Not adding property.");
            return false;
        } else if (!str.startsWith("$")) {
            return true;
        } else {
            Hg.e(a, "The leading character in the key string may not be '$'. Not adding property.");
            return false;
        }
    }
}
