package bo.app;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.do reason: invalid class name */
public final class Cdo {
    private static final String a = Hg.a(Cdo.class);

    public static List<C0491bg> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                try {
                    Hg.e(a, "Received null or blank geofence Json. Not parsing.");
                } catch (JSONException e) {
                    String str = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to deserialize geofence Json due to JSONException: ");
                    sb.append(optJSONObject);
                    Hg.d(str, sb.toString(), e);
                } catch (Exception e2) {
                    String str2 = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to deserialize geofence Json:");
                    sb2.append(optJSONObject);
                    Hg.b(str2, sb2.toString(), e2);
                }
            } else {
                arrayList.add(new C0491bg(optJSONObject));
            }
        }
        return arrayList;
    }
}
