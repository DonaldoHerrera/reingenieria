package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

public final class eg extends eq {
    private static final String b = Hg.a(eg.class);
    private String c;

    public eg(JSONObject jSONObject) {
        super(jSONObject);
        this.c = jSONObject.getJSONObject("data").getString("event_name");
    }

    public boolean a(fb fbVar) {
        if (fbVar instanceof fa) {
            fa faVar = (fa) fbVar;
            if (!Ng.d(faVar.a()) && faVar.a().equals(this.c)) {
                return super.a(fbVar);
            }
        }
        return false;
    }

    /* renamed from: a */
    public JSONObject forJsonPut() {
        String str = "data";
        JSONObject a = super.forJsonPut();
        try {
            a.put(C1325gg.TYPE, "custom_event_property");
            JSONObject jSONObject = a.getJSONObject(str);
            jSONObject.put("event_name", this.c);
            a.put(str, jSONObject);
        } catch (JSONException e) {
            Hg.b(b, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e);
        }
        return a;
    }
}
