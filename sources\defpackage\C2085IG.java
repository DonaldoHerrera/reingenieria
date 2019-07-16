package defpackage;

import org.json.JSONObject;

/* renamed from: IG reason: default package and case insensitive filesystem */
public class C2085IG {
    private final C2161MG a;
    private final C2161MG b;
    private final boolean c;

    private C2085IG(C2161MG mg, C2161MG mg2, boolean z) {
        this.a = mg;
        if (mg2 == null) {
            this.b = C2161MG.NONE;
        } else {
            this.b = mg2;
        }
        this.c = z;
    }

    public static C2085IG a(C2161MG mg, C2161MG mg2, boolean z) {
        C3067jH.a((Object) mg, "Impression owner is null");
        C3067jH.a(mg);
        return new C2085IG(mg, mg2, z);
    }

    public boolean a() {
        return C2161MG.NATIVE == this.a;
    }

    public boolean b() {
        return C2161MG.NATIVE == this.b;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        C3010gH.a(jSONObject, "impressionOwner", this.a);
        C3010gH.a(jSONObject, "videoEventsOwner", this.b);
        C3010gH.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.c));
        return jSONObject;
    }
}
