package bo.app;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

public final class cp extends cl {
    private static final String b = Hg.a(cp.class);
    private final bo c;

    public cp(String str, bq bqVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("geofence/request");
        super(Uri.parse(sb.toString()), null);
        this.c = bx.a(bqVar);
    }

    public w a() {
        return w.POST;
    }

    public JSONObject h() {
        JSONObject h = super.h();
        if (h == null) {
            return null;
        }
        try {
            if (this.c != null) {
                h.put("location_event", this.c.forJsonPut());
            }
            return h;
        } catch (JSONException e) {
            Hg.d(b, "Experienced JSONException while creating geofence refresh request. Returning null.", e);
            return null;
        }
    }

    public boolean i() {
        return false;
    }

    public void a(ab abVar, bm bmVar) {
        Hg.a(b, "GeofenceRefreshRequest executed successfully.");
    }
}
