package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: YOa reason: default package */
/* compiled from: DefaultSettingsSpiCall */
class YOa extends C6637iNa implements C6775kPa {
    public YOa(C5531_Ma _ma, String str, String str2, C4839DOa dOa) {
        this(_ma, str, str2, dOa, C7806zOa.GET);
    }

    private JSONObject b(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            C5701cNa e2 = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse settings JSON from ");
            sb.append(b());
            String str2 = "Fabric";
            e2.a(str2, sb.toString(), e);
            C5701cNa e3 = C5328TMa.e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Settings response ");
            sb2.append(str);
            e3.d(str2, sb2.toString());
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    public JSONObject a(C6707jPa jpa) {
        C4777BOa bOa;
        C5701cNa e;
        StringBuilder sb;
        String str = "X-REQUEST-ID";
        String str2 = "Settings request ID: ";
        String str3 = "Fabric";
        JSONObject jSONObject = null;
        try {
            Map b = b(jpa);
            bOa = a(b);
            try {
                a(bOa, jpa);
                C5701cNa e2 = C5328TMa.e();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Requesting settings from ");
                sb2.append(b());
                e2.d(str3, sb2.toString());
                C5701cNa e3 = C5328TMa.e();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Settings query params were: ");
                sb3.append(b);
                e3.d(str3, sb3.toString());
                jSONObject = a(bOa);
                if (bOa != null) {
                    e = C5328TMa.e();
                    sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(bOa.d(str));
                    e.d(str3, sb.toString());
                }
            } catch (c e4) {
                e = e4;
                try {
                    C5328TMa.e().e(str3, "Settings request failed.", e);
                    if (bOa != null) {
                        e = C5328TMa.e();
                        sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(bOa.d(str));
                        e.d(str3, sb.toString());
                    }
                    return jSONObject;
                } catch (Throwable th) {
                    th = th;
                    if (bOa != null) {
                    }
                    throw th;
                }
            }
        } catch (c e5) {
            e = e5;
            bOa = null;
            C5328TMa.e().e(str3, "Settings request failed.", e);
            if (bOa != null) {
            }
            return jSONObject;
        } catch (Throwable th2) {
            th = th2;
            bOa = null;
            if (bOa != null) {
                C5701cNa e6 = C5328TMa.e();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append(bOa.d(str));
                e6.d(str3, sb4.toString());
            }
            throw th;
        }
        return jSONObject;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    YOa(C5531_Ma _ma, String str, String str2, C4839DOa dOa, C7806zOa zoa) {
        super(_ma, str, str2, dOa, zoa);
    }

    private Map<String, String> b(C6707jPa jpa) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", jpa.h);
        hashMap.put("display_version", jpa.g);
        hashMap.put("source", Integer.toString(jpa.i));
        String str = jpa.j;
        if (str != null) {
            hashMap.put("icon_hash", str);
        }
        String str2 = jpa.f;
        if (!C7391tNa.b(str2)) {
            hashMap.put("instance", str2);
        }
        return hashMap;
    }

    /* access modifiers changed from: 0000 */
    public JSONObject a(C4777BOa bOa) {
        int g = bOa.g();
        C5701cNa e = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        sb.append("Settings result was: ");
        sb.append(g);
        String str = "Fabric";
        e.d(str, sb.toString());
        if (a(g)) {
            return b(bOa.a());
        }
        C5701cNa e2 = C5328TMa.e();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to retrieve settings from ");
        sb2.append(b());
        e2.e(str, sb2.toString());
        return null;
    }

    private C4777BOa a(C4777BOa bOa, C6707jPa jpa) {
        a(bOa, "X-CRASHLYTICS-API-KEY", jpa.a);
        a(bOa, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a(bOa, "X-CRASHLYTICS-API-CLIENT-VERSION", this.f.x());
        a(bOa, "Accept", "application/json");
        a(bOa, "X-CRASHLYTICS-DEVICE-MODEL", jpa.b);
        a(bOa, "X-CRASHLYTICS-OS-BUILD-VERSION", jpa.c);
        a(bOa, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jpa.d);
        a(bOa, "X-CRASHLYTICS-INSTALLATION-ID", jpa.e);
        return bOa;
    }

    private void a(C4777BOa bOa, String str, String str2) {
        if (str2 != null) {
            bOa.c(str, str2);
        }
    }
}
