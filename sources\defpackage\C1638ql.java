package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ql reason: default package and case insensitive filesystem */
/* compiled from: SpringConfigRegistry */
public class C1638ql {
    private static final C1638ql a = new C1638ql(true);
    private final Map<C1608pl, String> b = new HashMap();

    C1638ql(boolean z) {
        if (z) {
            a(C1608pl.a, "default config");
        }
    }

    public static C1638ql b() {
        return a;
    }

    public boolean a(C1608pl plVar, String str) {
        if (plVar == null) {
            throw new IllegalArgumentException("springConfig is required");
        } else if (str == null) {
            throw new IllegalArgumentException("configName is required");
        } else if (this.b.containsKey(plVar)) {
            return false;
        } else {
            this.b.put(plVar, str);
            return true;
        }
    }

    public Map<C1608pl, String> a() {
        return Collections.unmodifiableMap(this.b);
    }
}
