package defpackage;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: Gf reason: default package */
public enum Gf {
    ADVERTISING,
    ANNOUNCEMENTS,
    NEWS,
    SOCIAL,
    NO_CATEGORY;
    
    private static final Map<String, Gf> f = null;

    static {
        f = new HashMap();
        Iterator it = EnumSet.allOf(Gf.class).iterator();
        while (it.hasNext()) {
            Gf gf = (Gf) it.next();
            f.put(gf.toString(), gf);
        }
    }

    public static Gf a(String str) {
        return (Gf) f.get(str.toUpperCase(Locale.US));
    }

    public static EnumSet<Gf> a() {
        return EnumSet.allOf(Gf.class);
    }
}
