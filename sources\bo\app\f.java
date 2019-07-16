package bo.app;

import com.comscore.android.id.IdHelperAndroid;
import java.net.URI;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

final class f implements d {
    private static final String a = Hg.a(f.class);
    private final d b;

    public f(d dVar) {
        this.b = dVar;
    }

    private void b(URI uri, Map<String, String> map) {
        try {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Making request to [");
            sb.append(uri.toString());
            sb.append("], with headers: [");
            sb.append(a(map));
            sb.append("]");
            Hg.a(str, sb.toString());
        } catch (Exception e) {
            Hg.a(a, "Exception while logging request: ", e);
        }
    }

    public JSONObject a(URI uri, Map<String, String> map) {
        b(uri, map);
        JSONObject a2 = this.b.a(uri, map);
        a(a2);
        return a2;
    }

    private void b(URI uri, Map<String, String> map, JSONObject jSONObject) {
        try {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Making request to [");
            sb.append(uri.toString());
            sb.append("], with headers: [");
            sb.append(a(map));
            sb.append("] and JSON parameters: [");
            sb.append(jSONObject.toString(2));
            sb.append("]");
            Hg.a(str, sb.toString());
        } catch (Exception e) {
            Hg.a(a, "Exception while logging request: ", e);
        }
    }

    public JSONObject a(URI uri, Map<String, String> map, JSONObject jSONObject) {
        b(uri, map, jSONObject);
        JSONObject a2 = this.b.a(uri, map, jSONObject);
        a(a2);
        return a2;
    }

    private void a(JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            str = IdHelperAndroid.NO_ID_AVAILABLE;
        } else {
            try {
                str = jSONObject.toString(2);
            } catch (Exception e) {
                Hg.a(a, "Exception while logging result: ", e);
                return;
            }
        }
        String str2 = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Result [");
        sb.append(str);
        sb.append("]");
        Hg.a(str2, sb.toString());
    }

    private String a(Map<String, String> map) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Entry entry : map.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append((String) entry.getKey());
            sb.append(" / ");
            sb.append((String) entry.getValue());
            sb.append(")");
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (String append : arrayList) {
            sb2.append(append);
            sb2.append(", ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        return sb2.substring(0, sb2.length() - 2);
    }
}
