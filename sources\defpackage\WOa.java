package defpackage;

import android.annotation.SuppressLint;
import android.content.SharedPreferences.Editor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: WOa reason: default package */
/* compiled from: DefaultSettingsController */
class WOa implements C6435fPa {
    private final C6707jPa a;
    private final C6639iPa b;
    private final C7529vNa c;
    private final TOa d;
    private final C6775kPa e;
    private final C5531_Ma f;
    private final C5057KOa g = new C5088LOa(this.f);
    private final C7598wNa h;

    public WOa(C5531_Ma _ma, C6707jPa jpa, C7529vNa vna, C6639iPa ipa, TOa tOa, C6775kPa kpa, C7598wNa wna) {
        this.f = _ma;
        this.a = jpa;
        this.c = vna;
        this.b = ipa;
        this.d = tOa;
        this.e = kpa;
        this.h = wna;
    }

    private C6503gPa b(C6367ePa epa) {
        String str = "Fabric";
        C6503gPa gpa = null;
        try {
            if (C6367ePa.SKIP_CACHE_LOOKUP.equals(epa)) {
                return null;
            }
            JSONObject a2 = this.d.a();
            if (a2 != null) {
                C6503gPa a3 = this.b.a(this.c, a2);
                if (a3 != null) {
                    a(a2, "Loaded cached settings: ");
                    long a4 = this.c.a();
                    if (!C6367ePa.IGNORE_CACHE_EXPIRATION.equals(epa)) {
                        if (a3.a(a4)) {
                            C5328TMa.e().d(str, "Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        C5328TMa.e().d(str, "Returning cached settings.");
                        return a3;
                    } catch (Exception e2) {
                        e = e2;
                        gpa = a3;
                        C5328TMa.e().e(str, "Failed to get cached settings", e);
                        return gpa;
                    }
                } else {
                    C5328TMa.e().e(str, "Failed to transform cached settings data.", null);
                    return null;
                }
            } else {
                C5328TMa.e().d(str, "No cached settings data found.");
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            C5328TMa.e().e(str, "Failed to get cached settings", e);
            return gpa;
        }
    }

    public C6503gPa a() {
        return a(C6367ePa.USE_CACHE);
    }

    /* access modifiers changed from: 0000 */
    public String c() {
        return C7391tNa.a(C7391tNa.n(this.f.e()));
    }

    /* access modifiers changed from: 0000 */
    public String d() {
        return this.g.get().getString("existing_instance_identifier", "");
    }

    public C6503gPa a(C6367ePa epa) {
        String str = "Fabric";
        C6503gPa gpa = null;
        if (!this.h.a()) {
            C5328TMa.e().d(str, "Not fetching settings, because data collection is disabled by Firebase.");
            return null;
        }
        try {
            if (!C5328TMa.g() && !b()) {
                gpa = b(epa);
            }
            if (gpa == null) {
                JSONObject a2 = this.e.a(this.a);
                if (a2 != null) {
                    gpa = this.b.a(this.c, a2);
                    this.d.a(gpa.g, a2);
                    a(a2, "Loaded settings: ");
                    a(c());
                }
            }
            if (gpa == null) {
                gpa = b(C6367ePa.IGNORE_CACHE_EXPIRATION);
            }
        } catch (Exception e2) {
            C5328TMa.e().e(str, "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e2);
        }
        return gpa;
    }

    private void a(JSONObject jSONObject, String str) throws JSONException {
        C5701cNa e2 = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(jSONObject.toString());
        e2.d("Fabric", sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return !d().equals(c());
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"CommitPrefEdits"})
    public boolean a(String str) {
        Editor edit = this.g.edit();
        edit.putString("existing_instance_identifier", str);
        return this.g.a(edit);
    }
}
