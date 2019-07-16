package bo.app;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class hz {
    private boolean a;
    private StringBuilder b;
    private String c;
    private Object d;
    private Object e;
    private final List<hv> f;
    private final List<hv> g;
    private final List<hv> h;

    public hz() {
        this(true, null);
    }

    private String d(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\nUnexpected: ");
        sb.append(a(obj));
        sb.append("\n");
        return sb.toString();
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return !this.a;
    }

    public String c() {
        return this.b.toString();
    }

    public String toString() {
        return this.b.toString();
    }

    private hz(boolean z, String str) {
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.a = z;
        if (str == null) {
            str = "";
        }
        this.b = new StringBuilder(str);
    }

    private String b(String str, Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\nExpected: ");
        sb.append(a(obj));
        sb.append("\n     got: ");
        sb.append(a(obj2));
        sb.append("\n");
        return sb.toString();
    }

    private String c(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\nExpected: ");
        sb.append(a(obj));
        sb.append("\n     but none found\n");
        return sb.toString();
    }

    public void a(String str) {
        this.a = false;
        if (this.b.length() == 0) {
            this.b.append(str);
            return;
        }
        StringBuilder sb = this.b;
        sb.append(" ; ");
        sb.append(str);
    }

    public hz b(String str, Object obj) {
        this.h.add(new hv(str, null, obj));
        a(d(str, obj));
        return this;
    }

    public hz a(String str, Object obj, Object obj2) {
        this.f.add(new hv(str, obj, obj2));
        this.c = str;
        this.d = obj;
        this.e = obj2;
        a(b(str, obj, obj2));
        return this;
    }

    public hz a(String str, Object obj) {
        this.g.add(new hv(str, obj, null));
        a(c(str, obj));
        return this;
    }

    private static String a(Object obj) {
        if (obj instanceof JSONArray) {
            return "a JSON array";
        }
        if (obj instanceof JSONObject) {
            return "a JSON object";
        }
        return obj.toString();
    }
}
