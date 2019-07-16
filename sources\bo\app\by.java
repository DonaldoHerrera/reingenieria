package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

public final class by implements bp, C1294fg<JSONObject> {
    private static final String a = Hg.a(by.class);
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private String g;
    private final String h;

    /* renamed from: bo.app.by$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[t.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            a[t.TIMEZONE.ordinal()] = 1;
            a[t.CARRIER.ordinal()] = 2;
            a[t.ANDROID_VERSION.ordinal()] = 3;
            a[t.RESOLUTION.ordinal()] = 4;
            a[t.LOCALE.ordinal()] = 5;
            a[t.MODEL.ordinal()] = 6;
            try {
                a[t.GOOGLE_ADVERTISING_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public by(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.g = str5;
        this.h = str6;
        this.f = str7;
    }

    public static by a(JSONObject jSONObject) {
        t[] values;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        for (t tVar : t.values()) {
            switch (AnonymousClass1.a[tVar.ordinal()]) {
                case 1:
                    str5 = Ng.b(jSONObject.optString(tVar.a()));
                    break;
                case 2:
                    str2 = Ng.b(jSONObject.optString(tVar.a()));
                    break;
                case 3:
                    str = Ng.b(jSONObject.optString(tVar.a()));
                    break;
                case 4:
                    str7 = Ng.b(jSONObject.optString(tVar.a()));
                    break;
                case 5:
                    str4 = Ng.b(jSONObject.optString(tVar.a()));
                    break;
                case 6:
                    str3 = Ng.b(jSONObject.optString(tVar.a()));
                    break;
                case 7:
                    str6 = Ng.b(jSONObject.optString(tVar.a()));
                    break;
                default:
                    String str8 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown key encountered in Device createFromJson ");
                    sb.append(tVar);
                    Hg.b(str8, sb.toString());
                    break;
            }
        }
        by byVar = new by(str, str2, str3, str4, str5, str6, str7);
        return byVar;
    }

    public boolean b() {
        return forJsonPut().length() == 0;
    }

    /* renamed from: a */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(t.ANDROID_VERSION.a(), this.b);
            jSONObject.putOpt(t.CARRIER.a(), this.c);
            jSONObject.putOpt(t.MODEL.a(), this.d);
            jSONObject.putOpt(t.RESOLUTION.a(), this.f);
            jSONObject.putOpt(t.LOCALE.a(), this.e);
            jSONObject.putOpt(t.GOOGLE_ADVERTISING_ID.a(), this.h);
            if (!Ng.d(this.g)) {
                jSONObject.put(t.TIMEZONE.a(), this.g);
            }
        } catch (JSONException e2) {
            Hg.b(a, "Caught exception creating device Json.", e2);
        }
        return jSONObject;
    }
}
