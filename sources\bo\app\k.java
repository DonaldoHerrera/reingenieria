package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONArray;

public class k {
    private static final String a = Hg.a(k.class);
    private final SharedPreferences b;

    public k(Context context) {
        this.b = context.getSharedPreferences("com.appboy.override.configuration.cache", 0);
    }

    public void a(Af af) {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Setting Appboy Override configuration with config: ");
        sb.append(af);
        Hg.a(str, sb.toString());
        Editor edit = this.b.edit();
        a(edit, "com_appboy_api_key", af.c());
        a(edit, "com_appboy_server_target", af.z());
        a(edit, "com_appboy_sdk_flavor", (Enum) af.y());
        a(edit, "com_appboy_enable_fresco_library_use", af.q());
        a(edit, "com_appboy_newsfeed_unread_visual_indicator_on", af.r());
        a(edit, "com_appboy_push_gcm_sender_id", af.m());
        a(edit, "com_appboy_custom_endpoint", af.e());
        a(edit, "com_appboy_push_small_notification_icon", af.B());
        a(edit, "com_appboy_push_large_notification_icon", af.s());
        a(edit, "com_appboy_session_timeout", af.A());
        a(edit, "com_appboy_location_update_time_interval", af.v());
        a(edit, "com_appboy_default_notification_accent_color", af.f());
        a(edit, "com_appboy_trigger_action_minimum_time_interval_seconds", af.C());
        a(edit, "com_appboy_push_gcm_messaging_registration_enabled", af.l());
        a(edit, "com_appboy_push_adm_messaging_registration_enabled", af.b());
        a(edit, "com_appboy_disable_uil_image_cache", af.j());
        a(edit, "com_appboy_handle_push_deep_links_automatically", af.p());
        a(edit, "com_appboy_disable_location_collection", af.i());
        a(edit, "com_appboy_enable_background_location_collection", af.k());
        a(edit, "com_appboy_location_update_distance", af.u());
        a(edit, "com_appboy_data_flush_interval_bad_network", af.d());
        a(edit, "com_appboy_data_flush_interval_good_network", af.n());
        a(edit, "com_appboy_data_flush_interval_great_network", af.o());
        a(edit, "com_appboy_default_notification_channel_name", af.h());
        a(edit, "com_appboy_default_notification_channel_description", af.g());
        a(edit, "com_appboy_push_deep_link_back_stack_activity_enabled", af.x());
        a(edit, "com_appboy_push_deep_link_back_stack_activity_class_name", af.w());
        if (af.t() != null) {
            a(edit, "com_appboy_locale_api_key_map", new JSONArray(af.t()).toString());
        }
        edit.apply();
    }

    public void a() {
        Hg.a(a, "Clearing Appboy Override configuration cache");
        Editor edit = this.b.edit();
        edit.clear();
        edit.apply();
    }

    public String a(String str, String str2) {
        return this.b.getString(str, str2);
    }

    public int a(String str, int i) {
        return this.b.getInt(str, i);
    }

    public boolean a(String str, boolean z) {
        return this.b.getBoolean(str, z);
    }

    public boolean a(String str) {
        return this.b.contains(str);
    }

    /* access modifiers changed from: 0000 */
    public void a(Editor editor, String str, Enum enumR) {
        if (enumR != null) {
            a(editor, str, enumR.toString());
        }
    }

    private static void a(Editor editor, String str, Integer num) {
        if (num != null) {
            editor.putInt(str, num.intValue());
        }
    }

    private static void a(Editor editor, String str, String str2) {
        if (str2 != null) {
            editor.putString(str, str2);
        }
    }

    private static void a(Editor editor, String str, Boolean bool) {
        if (bool != null) {
            editor.putBoolean(str, bool.booleanValue());
        }
    }
}
