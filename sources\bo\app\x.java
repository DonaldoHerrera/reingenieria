package bo.app;

import com.comscore.android.id.IdHelperAndroid;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public enum x {
    UNKNOWN("unknown"),
    NONE(IdHelperAndroid.NO_ID_AVAILABLE),
    TWO_G("2g"),
    THREE_G("3g"),
    FOUR_G("4g"),
    WIFI("wifi");
    
    private static final Map<String, x> g = null;
    private final String h;

    static {
        g = new HashMap();
        Iterator it = EnumSet.allOf(x.class).iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            g.put(xVar.a(), xVar);
        }
    }

    private x(String str) {
        this.h = str;
    }

    public String a() {
        return this.h;
    }
}
