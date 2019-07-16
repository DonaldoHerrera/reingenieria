package bo.app;

import android.net.Uri;
import java.util.Map;

public abstract class cw implements cs {
    public final Uri a;
    private Map<String, String> b;

    protected cw(Uri uri, Map<String, String> map) {
        this.b = map;
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append(j());
        this.a = Uri.parse(sb.toString());
    }

    public Uri c() {
        return this.a;
    }

    public String j() {
        Map<String, String> map = this.b;
        if (map == null || map.size() == 0) {
            return "";
        }
        String str = "?";
        for (String str2 : this.b.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append("=");
            sb.append((String) this.b.get(str2));
            sb.append("&");
            str = sb.toString();
        }
        return str.substring(0, str.length() - 1);
    }
}
