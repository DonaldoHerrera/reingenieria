package bo.app;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

public final class cq extends cl {
    private static final String b = Hg.a(cq.class);
    private final bo c;

    public cq(String str, bo boVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("geofence/report");
        super(Uri.parse(sb.toString()), null);
        this.c = boVar;
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
                h.put("geofence_event", this.c.forJsonPut());
            }
            return h;
        } catch (JSONException e) {
            Hg.d(b, "Experienced JSONException while creating geofence report request. Returning null.", e);
            return null;
        }
    }

    public boolean i() {
        return false;
    }

    public void a(ab abVar, bm bmVar) {
        Hg.a(b, "GeofenceReportRequest executed successfully.");
    }
}
