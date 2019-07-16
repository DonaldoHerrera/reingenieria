package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Ek reason: default package */
/* compiled from: PathComponent */
public final class Ek {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    /* renamed from: Ek$a */
    /* compiled from: PathComponent */
    public enum a {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        
        private final int g;

        private a(int i) {
            this.g = i;
        }

        public int a() {
            return this.g;
        }
    }

    Ek(JSONObject jSONObject) throws JSONException {
        this.a = jSONObject.getString("class_name");
        this.b = jSONObject.optInt("index", -1);
        this.c = jSONObject.optInt("id");
        this.d = jSONObject.optString("text");
        this.e = jSONObject.optString("tag");
        this.f = jSONObject.optString("description");
        this.g = jSONObject.optString("hint");
        this.h = jSONObject.optInt("match_bitmask");
    }
}
