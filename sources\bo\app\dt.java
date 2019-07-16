package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

public final class dt {
    private static final String a = Hg.a(dt.class);

    /* renamed from: bo.app.dt$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Tf.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            a[Tf.FULL.ordinal()] = 1;
            a[Tf.MODAL.ordinal()] = 2;
            a[Tf.SLIDEUP.ordinal()] = 3;
            try {
                a[Tf.HTML_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static C0522cg a(String str, bg bgVar) {
        try {
            if (!Ng.d(str)) {
                return a(new JSONObject(str), bgVar);
            }
            Hg.c(a, "In-app message string was null or blank. Not de-serializing message.");
            return null;
        } catch (JSONException e) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Encountered JSONException processing in-app message string: ");
            sb.append(str);
            Hg.d(str2, sb.toString(), e);
            return null;
        } catch (Exception e2) {
            String str3 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to deserialize the in-app message string.");
            sb2.append(str);
            Hg.b(str3, sb2.toString(), e2);
            return null;
        }
    }

    public static C0522cg a(JSONObject jSONObject, bg bgVar) {
        if (jSONObject == null) {
            try {
                Hg.a(a, "In-app message Json was null. Not de-serializing message.");
                return null;
            } catch (JSONException e) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered JSONException processing in-app message: ");
                sb.append(jSONObject.toString());
                Hg.d(str, sb.toString(), e);
                return null;
            } catch (Exception e2) {
                String str2 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to deserialize the in-app message: ");
                sb2.append(jSONObject.toString());
                Hg.b(str2, sb2.toString(), e2);
                return null;
            }
        } else {
            Tf tf = (Tf) du.a(jSONObject, C1325gg.TYPE, Tf.class, null);
            if (tf == null) {
                String str3 = a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("In-app message type was null. Not de-serializing message: ");
                sb3.append(jSONObject.toString());
                Hg.c(str3, sb3.toString());
                return null;
            }
            int i = AnonymousClass1.a[tf.ordinal()];
            if (i == 1) {
                return new C1356hg(jSONObject, bgVar);
            }
            if (i == 2) {
                return new C1479lg(jSONObject, bgVar);
            }
            if (i == 3) {
                return new C1510mg(jSONObject, bgVar);
            }
            if (i == 4) {
                return new C1417jg(jSONObject, bgVar);
            }
            String str4 = a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown in-app message type. Not de-serializing message: ");
            sb4.append(jSONObject.toString());
            Hg.b(str4, sb4.toString());
            return null;
        }
    }
}
