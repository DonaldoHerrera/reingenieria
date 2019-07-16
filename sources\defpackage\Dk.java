package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Dk reason: default package */
/* compiled from: ParameterComponent */
public final class Dk {
    public final String a;
    public final String b;
    public final List<Ek> c;
    public final String d;

    public Dk(JSONObject jSONObject) throws JSONException {
        this.a = jSONObject.getString("name");
        this.b = jSONObject.optString("value");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new Ek(optJSONArray.getJSONObject(i)));
            }
        }
        this.c = arrayList;
        this.d = jSONObject.optString("path_type", "absolute");
    }
}
