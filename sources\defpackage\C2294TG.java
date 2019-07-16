package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: TG reason: default package and case insensitive filesystem */
public final class C2294TG {
    private final boolean a;
    private final Float b;
    private final boolean c;
    private final C2275SG d;

    private C2294TG(boolean z, Float f, boolean z2, C2275SG sg) {
        this.a = z;
        this.b = f;
        this.c = z2;
        this.d = sg;
    }

    public static C2294TG a(float f, boolean z, C2275SG sg) {
        C3067jH.a((Object) sg, "Position is null");
        return new C2294TG(true, Float.valueOf(f), z, sg);
    }

    public static C2294TG a(boolean z, C2275SG sg) {
        C3067jH.a((Object) sg, "Position is null");
        return new C2294TG(false, null, z, sg);
    }

    /* access modifiers changed from: 0000 */
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.a);
            if (this.a) {
                jSONObject.put("skipOffset", this.b);
            }
            jSONObject.put("autoPlay", this.c);
            jSONObject.put("position", this.d);
        } catch (JSONException e) {
            C3029hH.a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }
}
