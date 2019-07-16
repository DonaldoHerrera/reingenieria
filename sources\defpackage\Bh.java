package defpackage;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

/* renamed from: Bh reason: default package */
/* compiled from: SessionEvent */
final class Bh {
    public final Ch a;
    public final long b;
    public final b c;
    public final Map<String, String> d;
    public final String e;
    public final Map<String, Object> f;
    public final String g;
    public final Map<String, Object> h;
    private String i;

    /* renamed from: Bh$a */
    /* compiled from: SessionEvent */
    static class a {
        final b a;
        final long b = System.currentTimeMillis();
        Map<String, String> c = null;
        String d = null;
        Map<String, Object> e = null;
        String f = null;
        Map<String, Object> g = null;

        public a(b bVar) {
            this.a = bVar;
        }

        public a a(String str) {
            this.d = str;
            return this;
        }

        public a b(Map<String, String> map) {
            this.c = map;
            return this;
        }

        public a a(Map<String, Object> map) {
            this.e = map;
            return this;
        }

        public Bh a(Ch ch) {
            Bh bh = new Bh(ch, this.b, this.a, this.c, this.d, this.e, this.f, this.g);
            return bh;
        }
    }

    /* renamed from: Bh$b */
    /* compiled from: SessionEvent */
    enum b {
        START,
        RESUME,
        PAUSE,
        STOP,
        CRASH,
        INSTALL,
        CUSTOM,
        PREDEFINED
    }

    public static a a(b bVar, Activity activity) {
        Map singletonMap = Collections.singletonMap("activity", activity.getClass().getName());
        a aVar = new a(bVar);
        aVar.b(singletonMap);
        return aVar;
    }

    public String toString() {
        if (this.i == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(Bh.class.getSimpleName());
            sb.append(": ");
            sb.append("timestamp=");
            sb.append(this.b);
            sb.append(", type=");
            sb.append(this.c);
            sb.append(", details=");
            sb.append(this.d);
            sb.append(", customType=");
            sb.append(this.e);
            sb.append(", customAttributes=");
            sb.append(this.f);
            sb.append(", predefinedType=");
            sb.append(this.g);
            sb.append(", predefinedAttributes=");
            sb.append(this.h);
            sb.append(", metadata=[");
            sb.append(this.a);
            sb.append("]]");
            this.i = sb.toString();
        }
        return this.i;
    }

    private Bh(Ch ch, long j, b bVar, Map<String, String> map, String str, Map<String, Object> map2, String str2, Map<String, Object> map3) {
        this.a = ch;
        this.b = j;
        this.c = bVar;
        this.d = map;
        this.e = str;
        this.f = map2;
        this.g = str2;
        this.h = map3;
    }

    public static a a(long j) {
        a aVar = new a(b.INSTALL);
        aVar.b(Collections.singletonMap("installedAt", String.valueOf(j)));
        return aVar;
    }

    public static a a(String str) {
        Map singletonMap = Collections.singletonMap("sessionId", str);
        a aVar = new a(b.CRASH);
        aVar.b(singletonMap);
        return aVar;
    }

    public static a a(String str, String str2) {
        a a2 = a(str);
        a2.a(Collections.singletonMap("exceptionName", str2));
        return a2;
    }

    public static a a(C1387ih ihVar) {
        a aVar = new a(b.CUSTOM);
        aVar.a(ihVar.b());
        aVar.a(ihVar.a());
        return aVar;
    }
}
