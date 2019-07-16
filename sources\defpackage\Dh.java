package defpackage;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import com.comscore.TrackingPropertyType;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Dh reason: default package */
/* compiled from: SessionEventTransform */
class Dh implements C6910mOa<Bh> {
    Dh() {
    }

    /* renamed from: b */
    public byte[] a(Bh bh) throws IOException {
        return a(bh).toString().getBytes("UTF-8");
    }

    @TargetApi(9)
    public JSONObject a(Bh bh) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            Ch ch = bh.a;
            jSONObject.put("appBundleId", ch.a);
            jSONObject.put("executionId", ch.b);
            jSONObject.put("installationId", ch.c);
            jSONObject.put("limitAdTrackingEnabled", ch.d);
            jSONObject.put("betaDeviceToken", ch.e);
            jSONObject.put("buildId", ch.f);
            jSONObject.put("osVersion", ch.g);
            jSONObject.put(TrackingPropertyType.DEVICE_MODEL, ch.h);
            jSONObject.put("appVersionCode", ch.i);
            jSONObject.put("appVersionName", ch.j);
            jSONObject.put("timestamp", bh.b);
            jSONObject.put(C1325gg.TYPE, bh.c.toString());
            if (bh.d != null) {
                jSONObject.put("details", new JSONObject(bh.d));
            }
            jSONObject.put("customType", bh.e);
            if (bh.f != null) {
                jSONObject.put("customAttributes", new JSONObject(bh.f));
            }
            jSONObject.put("predefinedType", bh.g);
            if (bh.h != null) {
                jSONObject.put("predefinedAttributes", new JSONObject(bh.h));
            }
            return jSONObject;
        } catch (JSONException e) {
            if (VERSION.SDK_INT >= 9) {
                throw new IOException(e.getMessage(), e);
            }
            throw new IOException(e.getMessage());
        }
    }
}
