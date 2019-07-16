package bo.app;

import com.facebook.stetho.server.http.HttpHeaders;
import java.util.HashMap;
import java.util.Map;

public final class a implements e {
    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Encoding", "gzip, deflate");
        hashMap.put(HttpHeaders.CONTENT_TYPE, "application/json");
        return hashMap;
    }
}
