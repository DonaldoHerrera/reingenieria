package bo.app;

import java.net.URI;
import java.util.Map;
import org.json.JSONObject;

final class h implements d {
    private static final String a = Hg.a(h.class);
    private final d b;

    public h(d dVar) {
        this.b = dVar;
    }

    public JSONObject a(URI uri, Map<String, String> map) {
        String str = "]";
        String str2 = ":";
        String str3 = "ms] [";
        String str4 = "Request Executed in [";
        long currentTimeMillis = System.currentTimeMillis();
        try {
            JSONObject a2 = this.b.a(uri, map);
            return a2;
        } finally {
            long currentTimeMillis2 = System.currentTimeMillis();
            String str5 = a;
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(currentTimeMillis2 - currentTimeMillis);
            sb.append(str3);
            sb.append(w.GET.toString());
            sb.append(str2);
            sb.append(uri.toString());
            sb.append(str);
            Hg.a(str5, sb.toString());
        }
    }

    public JSONObject a(URI uri, Map<String, String> map, JSONObject jSONObject) {
        String str = "]";
        String str2 = ":";
        String str3 = "ms] [";
        String str4 = "Request Executed in [";
        long currentTimeMillis = System.currentTimeMillis();
        try {
            JSONObject a2 = this.b.a(uri, map, jSONObject);
            return a2;
        } finally {
            long currentTimeMillis2 = System.currentTimeMillis();
            String str5 = a;
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(currentTimeMillis2 - currentTimeMillis);
            sb.append(str3);
            sb.append(w.POST.toString());
            sb.append(str2);
            sb.append(uri.toString());
            sb.append(str);
            Hg.a(str5, sb.toString());
        }
    }
}
