package bo.app;

import java.util.HashMap;
import java.util.Map;

public final class ci implements e {
    private static final Map<String, String> a = new HashMap();

    static {
        a.put("Accept-Encoding", "gzip, deflate");
    }

    public Map<String, String> a() {
        return a;
    }
}
