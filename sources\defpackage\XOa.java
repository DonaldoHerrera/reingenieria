package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: XOa reason: default package */
/* compiled from: DefaultSettingsJsonTransform */
class XOa implements C6639iPa {
    XOa() {
    }

    private QOa b(JSONObject jSONObject) throws JSONException {
        String str = "icon";
        QOa qOa = new QOa(jSONObject.getString("identifier"), jSONObject.getString("status"), jSONObject.getString(ImagesContract.URL), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false), (!jSONObject.has(str) || !jSONObject.getJSONObject(str).has("hash")) ? null : e(jSONObject.getJSONObject(str)));
        return qOa;
    }

    private SOa c(JSONObject jSONObject) throws JSONException {
        return new SOa(jSONObject.optString("update_endpoint", C6571hPa.a), jSONObject.optInt("update_suspend_duration", 3600));
    }

    private ZOa d(JSONObject jSONObject) {
        ZOa zOa = new ZOa(jSONObject.optBoolean("prompt_enabled", false), jSONObject.optBoolean("collect_logged_exceptions", true), jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_analytics", false), jSONObject.optBoolean("firebase_crashlytics_enabled", false));
        return zOa;
    }

    private OOa e(JSONObject jSONObject) throws JSONException {
        return new OOa(jSONObject.getString("hash"), jSONObject.getInt("width"), jSONObject.getInt("height"));
    }

    private C5567aPa f(JSONObject jSONObject) throws JSONException {
        C5567aPa apa = new C5567aPa(jSONObject.optString("title", "Send Crash Report?"), jSONObject.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), jSONObject.optString("send_button_title", "Send"), jSONObject.optBoolean("show_cancel_button", true), jSONObject.optString("cancel_button_title", "Don't Send"), jSONObject.optBoolean("show_always_send_button", true), jSONObject.optString("always_send_button_title", "Always Send"));
        return apa;
    }

    private C5635bPa g(JSONObject jSONObject) throws JSONException {
        C5635bPa bpa = new C5635bPa(jSONObject.optInt("log_buffer_size", 64000), jSONObject.optInt("max_chained_exception_depth", 8), jSONObject.optInt("max_custom_exception_events", 64), jSONObject.optInt("max_custom_key_value_pairs", 64), jSONObject.optInt("identifier_mask", 255), jSONObject.optBoolean("send_session_without_crash", false), jSONObject.optInt("max_complete_sessions_count", 4));
        return bpa;
    }

    public C6503gPa a(C7529vNa vna, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        C6503gPa gpa = new C6503gPa(a(vna, (long) optInt2, jSONObject), b(jSONObject.getJSONObject("app")), g(jSONObject.getJSONObject("session")), f(jSONObject.getJSONObject("prompt")), d(jSONObject.getJSONObject("features")), a(jSONObject.getJSONObject("analytics")), c(jSONObject.getJSONObject("beta")), optInt, optInt2);
        return gpa;
    }

    private NOa a(JSONObject jSONObject) {
        NOa nOa = new NOa(jSONObject.optString(ImagesContract.URL, "https://e.crashlytics.com/spi/v2/events"), jSONObject.optInt("flush_interval_secs", 600), jSONObject.optInt("max_byte_size_per_file", 8000), jSONObject.optInt("max_file_count_per_send", 1), jSONObject.optInt("max_pending_send_file_count", 100), jSONObject.optBoolean("forward_to_google_analytics", false), jSONObject.optBoolean("include_purchase_events_in_forwarded_events", false), jSONObject.optBoolean("track_custom_events", true), jSONObject.optBoolean("track_predefined_events", true), jSONObject.optInt("sampling_rate", 1), jSONObject.optBoolean("flush_on_background", true));
        return nOa;
    }

    private long a(C7529vNa vna, long j, JSONObject jSONObject) throws JSONException {
        String str = "expires_at";
        if (jSONObject.has(str)) {
            return jSONObject.getLong(str);
        }
        return vna.a() + (j * 1000);
    }
}
