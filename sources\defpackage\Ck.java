package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Ck reason: default package */
/* compiled from: EventBinding */
public class Ck {
    private final String a;
    private final b b;
    private final a c;
    private final String d;
    private final List<Ek> e;
    private final List<Dk> f;
    private final String g;
    private final String h;
    private final String i;

    /* renamed from: Ck$a */
    /* compiled from: EventBinding */
    public enum a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* renamed from: Ck$b */
    /* compiled from: EventBinding */
    public enum b {
        MANUAL,
        INFERENCE
    }

    public Ck(String str, b bVar, a aVar, String str2, List<Ek> list, List<Dk> list2, String str3, String str4, String str5) {
        this.a = str;
        this.b = bVar;
        this.c = aVar;
        this.d = str2;
        this.e = list;
        this.f = list2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010 A[Catch:{ IllegalArgumentException | JSONException -> 0x001e }] */
    public static List<Ck> a(JSONArray jSONArray) {
        int i2;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                i2 = jSONArray.length();
                for (int i3 = 0; i3 < i2; i3++) {
                    arrayList.add(a(jSONArray.getJSONObject(i3)));
                }
            } catch (IllegalArgumentException | JSONException unused) {
            }
        } else {
            i2 = 0;
            while (i3 < i2) {
            }
        }
        return arrayList;
    }

    public String b() {
        return this.a;
    }

    public a c() {
        return this.c;
    }

    public List<Dk> d() {
        return Collections.unmodifiableList(this.f);
    }

    public List<Ek> e() {
        return Collections.unmodifiableList(this.e);
    }

    public static Ck a(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        String string = jSONObject.getString("event_name");
        b valueOf = b.valueOf(jSONObject.getString("method").toUpperCase(Locale.ENGLISH));
        a valueOf2 = a.valueOf(jSONObject.getString("event_type").toUpperCase(Locale.ENGLISH));
        String string2 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(new Ek(jSONArray.getJSONObject(i2)));
        }
        String optString = jSONObject.optString("path_type", "absolute");
        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                arrayList2.add(new Dk(optJSONArray.getJSONObject(i3)));
            }
        }
        Ck ck = new Ck(string, valueOf, valueOf2, string2, arrayList, arrayList2, jSONObject.optString("component_id"), optString, jSONObject.optString("activity_name"));
        return ck;
    }

    public String a() {
        return this.i;
    }
}
