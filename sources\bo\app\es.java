package bo.app;

import java.util.List;
import org.json.JSONArray;

public abstract class es implements eh {
    private static final String b = Hg.a(es.class);
    protected List<eh> a;

    protected es(List<eh> list) {
        this.a = list;
    }

    /* renamed from: a */
    public JSONArray forJsonPut() {
        JSONArray jSONArray = new JSONArray();
        try {
            for (eh forJsonPut : this.a) {
                jSONArray.put(forJsonPut.forJsonPut());
            }
        } catch (Exception e) {
            Hg.b(b, "Caught exception creating Json.", e);
        }
        return jSONArray;
    }
}
