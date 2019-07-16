package defpackage;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: CH reason: default package and case insensitive filesystem */
public class C1967CH implements b {
    private JSONObject a;
    private final C3350xH b;

    public C1967CH(C3350xH xHVar) {
        this.b = xHVar;
    }

    public void a() {
        this.b.b(new C3370yH(this));
    }

    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, double d) {
        C3350xH xHVar = this.b;
        C1927AH ah = new C1927AH(this, hashSet, jSONObject, d);
        xHVar.b(ah);
    }

    public JSONObject b() {
        return this.a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, double d) {
        C3350xH xHVar = this.b;
        C3390zH zHVar = new C3390zH(this, hashSet, jSONObject, d);
        xHVar.b(zHVar);
    }
}
