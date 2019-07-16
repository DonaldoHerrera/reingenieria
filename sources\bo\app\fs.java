package bo.app;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class fs {
    private static final String a = Hg.a(fs.class);

    public static C0522cg a(JSONObject jSONObject, bg bgVar) {
        if (jSONObject == null) {
            try {
                Hg.a(a, "Templated message Json was null. Not de-serializing templated message.");
                return null;
            } catch (JSONException e) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered JSONException processing templated message: ");
                sb.append(jSONObject);
                Hg.d(str, sb.toString(), e);
                return null;
            } catch (Exception e2) {
                String str2 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered general exception processing templated message: ");
                sb2.append(jSONObject);
                Hg.d(str2, sb2.toString(), e2);
                return null;
            }
        } else {
            String string = jSONObject.getString(C1325gg.TYPE);
            if (string.equals("inapp")) {
                return dt.a(jSONObject.getJSONObject("data"), bgVar);
            }
            String str3 = a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Received templated message Json with unknown type: ");
            sb3.append(string);
            sb3.append(". Not parsing.");
            Hg.e(str3, sb3.toString());
            return null;
        }
    }

    public static eb b(JSONObject jSONObject, bg bgVar) {
        eb edVar;
        try {
            String string = jSONObject.getString(C1325gg.TYPE);
            if (string.equals("inapp")) {
                edVar = new ec(jSONObject, bgVar);
            } else if (string.equals("templated_iam")) {
                edVar = new ed(jSONObject, bgVar);
            } else {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Received unknown trigger type: ");
                sb.append(string);
                Hg.c(str, sb.toString());
                return null;
            }
            return edVar;
        } catch (JSONException e) {
            String str2 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Encountered JSONException processing triggered action Json: ");
            sb2.append(jSONObject);
            Hg.d(str2, sb2.toString(), e);
            return null;
        } catch (Exception e2) {
            String str3 = a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to deserialize triggered action Json: ");
            sb3.append(jSONObject);
            Hg.d(str3, sb3.toString(), e2);
            return null;
        }
    }

    public static List<eb> a(JSONArray jSONArray, bg bgVar) {
        if (jSONArray == null) {
            try {
                Hg.a(a, "Triggered actions Json array was null. Not de-serializing triggered actions.");
                return null;
            } catch (JSONException e) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered JSONException processing triggered actions Json array: ");
                sb.append(jSONArray);
                Hg.d(str, sb.toString(), e);
                return null;
            } catch (Exception e2) {
                String str2 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to deserialize triggered actions Json array: ");
                sb2.append(jSONArray);
                Hg.d(str2, sb2.toString(), e2);
                return null;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                eb b = b(jSONArray.getJSONObject(i), bgVar);
                if (b != null) {
                    arrayList.add(b);
                }
            }
            return arrayList;
        }
    }

    public static List<ei> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                Hg.e(a, "Received null or blank trigger condition Json. Not parsing.");
            } else {
                String string = optJSONObject.getString(C1325gg.TYPE);
                if (string.equals("purchase")) {
                    arrayList.add(new em(optJSONObject));
                } else if (string.equals("custom_event")) {
                    arrayList.add(new ef(optJSONObject));
                } else if (string.equals("push_click")) {
                    arrayList.add(new eo(optJSONObject));
                } else if (string.equals("open")) {
                    arrayList.add(new ek());
                } else if (string.equals("iam_click")) {
                    arrayList.add(new ej(optJSONObject));
                } else if (string.equals("test")) {
                    arrayList.add(new ep());
                } else if (string.equals("custom_event_property")) {
                    arrayList.add(new eg(optJSONObject));
                } else if (string.equals("purchase_property")) {
                    arrayList.add(new en(optJSONObject));
                } else {
                    String str = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received triggered condition Json with unknown type: ");
                    sb.append(string);
                    sb.append(". Not parsing.");
                    Hg.e(str, sb.toString());
                }
            }
        }
        return arrayList;
    }
}
