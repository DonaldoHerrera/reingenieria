package bo.app;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bs {
    private static final String a = Hg.a(bs.class);

    public static <T> T a(String str, Class<T> cls, bb bbVar, df dfVar) {
        if (cls.equals(String.class)) {
            return dm.a(str, cls);
        }
        if (cls.equals(C1662rg.class)) {
            return dm.a(a(new JSONObject(str), bbVar, dfVar), cls);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to construct java object ");
        sb.append(str);
        sb.append(", target class ");
        sb.append(cls.toString());
        sb.append(" isn'tString nor Card. Please update the createObject in ModelFactory to handle extra class type.");
        throw new JSONException(sb.toString());
    }

    public static <T> List<T> a(JSONArray jSONArray, Class<T> cls, bb bbVar, df dfVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object a2 = a(jSONArray.optString(i), cls, bbVar, dfVar);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            } catch (JSONException e) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to cast JSON to [");
                sb.append(cls.getName());
                sb.append("] in array. Ignoring.");
                Hg.a(str, sb.toString(), e);
            }
        }
        return arrayList;
    }

    static C1662rg a(JSONObject jSONObject, bb bbVar, df dfVar) {
        String string = jSONObject.getString(C1325gg.TYPE);
        if ("banner_image".equals(string)) {
            return new C1603pg(jSONObject, bbVar, dfVar);
        }
        if ("captioned_image".equals(string)) {
            return new C1633qg(jSONObject, bbVar, dfVar);
        }
        if ("cross_promotion_small".equals(string)) {
            return new C1692sg(jSONObject, bbVar, dfVar);
        }
        if ("short_news".equals(string)) {
            return new C1722tg(jSONObject, bbVar, dfVar);
        }
        if ("text_announcement".equals(string)) {
            return new C1752ug(jSONObject, bbVar, dfVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to construct java object of type ");
        sb.append(string);
        sb.append(" from JSON [");
        sb.append(jSONObject.toString());
        sb.append("]");
        throw new JSONException(sb.toString());
    }
}
