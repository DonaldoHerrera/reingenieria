package bo.app;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bx implements bo {
    private static final String a = Hg.a(bx.class);
    private final u b;
    private final JSONObject c;
    private final double d;
    private final String e;
    private String f;
    private bv g;

    private bx(u uVar, JSONObject jSONObject) {
        this(uVar, jSONObject, dn.b());
    }

    public static bx a(String str, C1782vg vgVar) {
        JSONObject jSONObject = new JSONObject();
        Ng.a(str);
        jSONObject.put("n", str);
        if (vgVar != null && vgVar.h() > 0) {
            jSONObject.put("p", vgVar.forJsonPut());
        }
        return new bx(u.CUSTOM_EVENT, jSONObject);
    }

    public static bx b(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cid", str);
        return new bx(u.PUSH_NOTIFICATION_TRACKING, jSONObject);
    }

    public static bx c(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new bx(u.CARD_IMPRESSION, jSONObject);
    }

    public static bx d(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new bx(u.CARD_CLICK, jSONObject);
    }

    public static bx e(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("n", str);
        return new bx(u.INTERNAL, jSONObject);
    }

    public static bx g() {
        return e("feed_displayed");
    }

    public static bx h() {
        return e("feedback_displayed");
    }

    public static bx i() {
        return new bx(u.SESSION_START, new JSONObject());
    }

    public bv f() {
        return this.g;
    }

    /* renamed from: j */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.b.forJsonPut());
            jSONObject.put("data", this.c);
            jSONObject.put("time", this.d);
            if (!Ng.e(this.f)) {
                jSONObject.put("user_id", this.f);
            }
            if (this.g != null) {
                jSONObject.put("session_id", this.g.forJsonPut());
            }
        } catch (JSONException e2) {
            Hg.b(a, "Caught exception creating Appboy event Json.", e2);
        }
        return jSONObject;
    }

    public String toString() {
        JSONObject j = forJsonPut();
        return (j == null || j.length() <= 0) ? "" : j.toString();
    }

    private bx(u uVar, JSONObject jSONObject, double d2) {
        this(uVar, jSONObject, d2, UUID.randomUUID().toString());
    }

    private bx(u uVar, JSONObject jSONObject, double d2, String str) {
        this.f = null;
        this.g = null;
        if (jSONObject == null) {
            throw new NullPointerException("Event data cannot be null");
        } else if (uVar.forJsonPut() != null) {
            this.b = uVar;
            this.c = jSONObject;
            this.d = d2;
            this.e = str;
        } else {
            throw new NullPointerException("Event type cannot be null");
        }
    }

    public static bx b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cid", str);
        jSONObject.put("a", str2);
        return new bx(u.PUSH_NOTIFICATION_ACTION_TRACKING, jSONObject);
    }

    public static bx e(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        jSONObject.put("value", str2);
        return new bx(u.REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY, jSONObject);
    }

    public static bx a(String str, String str2, BigDecimal bigDecimal, int i, C1782vg vgVar) {
        BigDecimal a2 = dw.a(bigDecimal);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pid", str);
        jSONObject.put("c", str2);
        jSONObject.put("p", a2.doubleValue());
        jSONObject.put("q", i);
        if (vgVar != null && vgVar.h() > 0) {
            jSONObject.put("pr", vgVar.forJsonPut());
        }
        return new bx(u.PURCHASE, jSONObject);
    }

    public static bx c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("geo_id", str);
        jSONObject.put("event_type", str2);
        return new bx(u.GEOFENCE, jSONObject);
    }

    static JSONObject d(String str, String str2, String str3) {
        return b(str, str2, str3, null);
    }

    public static bx d(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        jSONObject.put("value", str2);
        return new bx(u.ADD_TO_CUSTOM_ATTRIBUTE_ARRAY, jSONObject);
    }

    public static bx b(String str, String str2, String str3) {
        return new bx(u.INAPP_MESSAGE_IMPRESSION, d(str, str2, str3));
    }

    public String e() {
        return this.f;
    }

    static JSONObject b(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        if (!Ng.e(str)) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("campaign_ids", jSONArray);
        }
        if (!Ng.e(str2)) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str2);
            jSONObject.put("card_ids", jSONArray2);
        }
        if (!Ng.e(str3)) {
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put(str3);
            jSONObject.put("trigger_ids", jSONArray3);
        }
        if (!Ng.e(str4)) {
            jSONObject.put("bid", str4);
        }
        return jSONObject;
    }

    public static bx c(String str, String str2, String str3) {
        return new bx(u.INAPP_MESSAGE_CLICK, d(str, str2, str3));
    }

    public JSONObject c() {
        return this.c;
    }

    public String d() {
        return this.e;
    }

    private bx(u uVar, JSONObject jSONObject, double d2, String str, String str2, String str3) {
        this.f = null;
        this.g = null;
        if (jSONObject == null) {
            throw new NullPointerException("Event data cannot be null");
        } else if (uVar.forJsonPut() != null) {
            this.b = uVar;
            this.c = jSONObject;
            this.d = d2;
            this.e = str;
            this.f = str2;
            if (str3 != null) {
                this.g = bv.a(str3);
            }
        } else {
            throw new NullPointerException("Event type cannot be null");
        }
    }

    public static bx a(bq bqVar) {
        return new bx(u.LOCATION_RECORDED, (JSONObject) bqVar.forJsonPut());
    }

    public static bx a(Throwable th, bv bvVar) {
        String b2 = b(th, bvVar);
        String a2 = a(th);
        StringBuilder sb = new StringBuilder(b2);
        sb.append("\n");
        sb.append(a2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("e", sb.toString());
        return new bx(u.INTERNAL_ERROR, jSONObject);
    }

    public static bx a(aq aqVar, bv bvVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("nop", true);
        String b2 = b((Throwable) aqVar, bvVar);
        String a2 = a((Throwable) aqVar);
        StringBuilder sb = new StringBuilder(b2);
        sb.append("\n");
        sb.append(a2);
        jSONObject.put("e", sb.toString());
        return new bx(u.INTERNAL_ERROR, jSONObject);
    }

    public u b() {
        return this.b;
    }

    static String b(Throwable th, bv bvVar) {
        StringBuilder sb = new StringBuilder();
        String th2 = th.toString();
        if (th2.length() > 5000) {
            th2 = th2.substring(0, 5000);
        }
        sb.append("exception_class: ");
        sb.append(th2);
        sb.append(",");
        sb.append("session_id: ");
        sb.append(bvVar != null ? bvVar.toString() : null);
        return sb.toString();
    }

    public static bx a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("a", str);
        jSONObject.put("l", str2);
        return new bx(u.USER_ALIAS, jSONObject);
    }

    public static bx a(String str, String str2, String str3) {
        return new bx(u.INAPP_MESSAGE_CONTROL_IMPRESSION, d(str, str2, str3));
    }

    public static bx a(String str, String str2, String str3, C1541ng ngVar) {
        return new bx(u.INAPP_MESSAGE_BUTTON_CLICK, b(str, str2, str3, a(ngVar)));
    }

    public static bx a(String str, String str2, String str3, String str4) {
        return new bx(u.INAPP_MESSAGE_BUTTON_CLICK, b(str, str2, str3, str4));
    }

    public static String a(C1541ng ngVar) {
        if (ngVar != null) {
            return String.valueOf(ngVar.h());
        }
        return null;
    }

    public static bx a(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        jSONObject.put("value", i);
        return new bx(u.INCREMENT, jSONObject);
    }

    public static bx a(String str, String[] strArr) {
        JSONArray jSONArray = strArr == null ? null : new JSONArray();
        if (strArr != null) {
            for (String put : strArr) {
                jSONArray.put(put);
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        String str2 = "value";
        if (strArr == null) {
            jSONObject.put(str2, JSONObject.NULL);
        } else {
            jSONObject.put(str2, jSONArray);
        }
        return new bx(u.SET_CUSTOM_ATTRIBUTE_ARRAY, jSONObject);
    }

    public static bx a(long j) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("d", j);
        return new bx(u.SESSION_END, jSONObject);
    }

    public static bx a(String str, String str2, double d2, String str3, String str4, String str5) {
        u a2 = u.a(str);
        if (a2 != null) {
            bx bxVar = new bx(a2, new JSONObject(str2), d2, str3, str4, str5);
            return bxVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot parse eventType ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public double a() {
        return this.d;
    }

    static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        return stringWriter2.length() > 5000 ? stringWriter2.substring(0, 5000) : stringWriter2;
    }

    public void a(bv bvVar) {
        if (this.g == null) {
            this.g = bvVar;
            return;
        }
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Session id can only be set once. Doing nothing. Given session id: ");
        sb.append(bvVar);
        Hg.a(str, sb.toString());
    }

    public void a(String str) {
        if (this.f == null) {
            this.f = str;
            return;
        }
        String str2 = a;
        StringBuilder sb = new StringBuilder();
        sb.append("User id can only be set once. Doing nothing. Given user id: ");
        sb.append(str);
        Hg.a(str2, sb.toString());
    }
}
