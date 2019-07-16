package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import bo.app.bw;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: Bf reason: default package */
public class Bf extends Cf {
    private static final String a = Hg.a(Bf.class);
    private final Context b;

    /* renamed from: Bf$a */
    enum a {
        SMALL,
        LARGE
    }

    public Bf(Context context) {
        super(context);
        this.b = context;
    }

    public boolean A() {
        return getBooleanValue("com_appboy_enable_background_location_collection", false);
    }

    public boolean B() {
        return getBooleanValue("com_appboy_push_gcm_messaging_registration_enabled", false);
    }

    public boolean C() {
        return !getBooleanValue("com_appboy_disable_location_collection", false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    public String a(Locale locale) {
        String[] strArr;
        if (locale == null) {
            Hg.a(a, "Passed in a null locale to match.");
            return null;
        }
        String str = "com_appboy_locale_api_key_map";
        if (this.mRuntimeAppConfigurationProvider.a(str)) {
            try {
                JSONArray jSONArray = new JSONArray(this.mRuntimeAppConfigurationProvider.a(str, (String) null));
                strArr = new String[jSONArray.length()];
                int i = 0;
                while (i < jSONArray.length()) {
                    try {
                        strArr[i] = jSONArray.getString(i);
                        i++;
                    } catch (JSONException e) {
                        e = e;
                        Hg.b(a, "Caught exception creating locale to api key mapping from override cache", e);
                        if (strArr == null) {
                        }
                    }
                }
            } catch (JSONException e2) {
                e = e2;
                strArr = null;
                Hg.b(a, "Caught exception creating locale to api key mapping from override cache", e);
                if (strArr == null) {
                }
            }
        } else {
            strArr = readStringArrayResourceValue(str, null);
        }
        if (strArr == null) {
            Hg.a(a, "Locale to api key mappings not present in XML.");
            return null;
        }
        for (String str2 : strArr) {
            String str3 = ",";
            if (Ng.a(str2, str3) == 1) {
                String[] split = str2.split(str3);
                if (split.length != 2) {
                    continue;
                } else {
                    String lowerCase = split[0].trim().toLowerCase(Locale.US);
                    boolean equals = lowerCase.equals(locale.toString().toLowerCase(Locale.US));
                    if (lowerCase.equals(locale.getCountry().toLowerCase(Locale.US)) || equals) {
                        return split[1].trim();
                    }
                }
            }
        }
        return null;
    }

    public bw d() {
        String str = "com_appboy_api_key";
        bw bwVar = (bw) this.mConfigurationCache.get(str);
        if (bwVar == null) {
            String a2 = this.mRuntimeAppConfigurationProvider.a(str, (String) null);
            if (a2 != null) {
                Hg.c(a, "Found an override api key. Using it to configure Appboy.");
            } else {
                a2 = a(Locale.getDefault());
                if (a2 != null) {
                    Hg.c(a, "Found a locale that matches the current locale in appboy.xml. Using the associated api key");
                } else {
                    a2 = readStringResourceValue(str, null);
                }
            }
            if (a2 != null) {
                bwVar = new bw(a2);
                this.mConfigurationCache.put(str, bwVar);
            }
        }
        if (bwVar != null) {
            return bwVar;
        }
        String str2 = "****************************************************";
        Hg.b(a, str2);
        String str3 = "**                                                **";
        Hg.b(a, str3);
        Hg.b(a, "**                 !! WARNING !!                  **");
        Hg.b(a, str3);
        Hg.b(a, "**     No API key set in res/values/appboy.xml    **");
        Hg.b(a, "** No cached API Key found from Appboy.configure  **");
        Hg.b(a, "**         Appboy functionality disabled          **");
        Hg.b(a, str3);
        Hg.b(a, str2);
        throw new RuntimeException("Unable to read the Appboy API key from the res/values/appboy.xml file. See log for more details.");
    }

    public int e() {
        String str = "application_icon";
        if (this.mConfigurationCache.containsKey(str)) {
            return ((Integer) this.mConfigurationCache.get(str)).intValue();
        }
        String packageName = this.b.getPackageName();
        int i = 0;
        try {
            i = this.b.getPackageManager().getApplicationInfo(packageName, i).icon;
        } catch (NameNotFoundException unused) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            String str3 = "Cannot find package named ";
            sb.append(str3);
            sb.append(packageName);
            Hg.b(str2, sb.toString());
            try {
                i = this.b.getPackageManager().getApplicationInfo(this.b.getPackageName(), i).icon;
            } catch (NameNotFoundException unused2) {
                String str4 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(packageName);
                Hg.b(str4, sb2.toString());
            }
        }
        this.mConfigurationCache.put(str, Integer.valueOf(i));
        return i;
    }

    public String f() {
        return "STAGING".equals(a().toUpperCase(Locale.US)) ? "https://sondheim.appboy.com/api/v3/" : "https://dev.appboy.com/api/v3/";
    }

    public String g() {
        return getStringValue("com_appboy_custom_endpoint", null);
    }

    @TargetApi(21)
    public int h() {
        return getIntValue("com_appboy_default_notification_accent_color", 0);
    }

    public String i() {
        return getStringValue("com_appboy_default_notification_channel_description", "");
    }

    public String j() {
        return getStringValue("com_appboy_default_notification_channel_name", "General");
    }

    public String k() {
        return getStringValue("com_appboy_push_gcm_sender_id", null);
    }

    public boolean l() {
        return getBooleanValue("com_appboy_handle_push_deep_links_automatically", false);
    }

    public boolean m() {
        return getBooleanValue("com_appboy_enable_fresco_library_use", false);
    }

    public boolean n() {
        return getBooleanValue("com_appboy_newsfeed_unread_visual_indicator_on", true);
    }

    public boolean o() {
        return getBooleanValue("com_appboy_push_deep_link_back_stack_activity_enabled", true);
    }

    public boolean p() {
        return getBooleanValue("com_appboy_disable_uil_image_cache", false);
    }

    public int q() {
        return a(a.LARGE);
    }

    public float r() {
        return (float) getIntValue("com_appboy_location_update_distance", -1);
    }

    public long s() {
        return ((long) getIntValue("com_appboy_location_update_time_interval", -1)) * 1000;
    }

    public String t() {
        return getStringValue("com_appboy_push_deep_link_back_stack_activity_class_name", "");
    }

    public Of u() {
        String stringValue = getStringValue("com_appboy_sdk_flavor", null);
        if (Ng.d(stringValue)) {
            return null;
        }
        try {
            return Of.valueOf(stringValue.toUpperCase(Locale.US));
        } catch (Exception e) {
            Hg.b(a, "Exception while parsing stored SDK flavor. Returning null.", e);
            return null;
        }
    }

    public int v() {
        return getIntValue("com_appboy_session_timeout", 10);
    }

    public int w() {
        return a(a.SMALL);
    }

    public long x() {
        return (long) getIntValue("com_appboy_trigger_action_minimum_time_interval_seconds", 30);
    }

    public int y() {
        int i;
        String str = "version_code";
        if (this.mConfigurationCache.containsKey(str)) {
            return ((Integer) this.mConfigurationCache.get(str)).intValue();
        }
        try {
            i = this.b.getPackageManager().getPackageInfo(Lg.a(this.b), 0).versionCode;
        } catch (Exception e) {
            Hg.b(a, "Unable to read the version code.", e);
            i = -1;
        }
        this.mConfigurationCache.put(str, Integer.valueOf(i));
        return i;
    }

    public boolean z() {
        return getBooleanValue("com_appboy_push_adm_messaging_registration_enabled", false);
    }

    private int a(a aVar) {
        String str = aVar.equals(a.LARGE) ? "com_appboy_push_large_notification_icon" : "com_appboy_push_small_notification_icon";
        if (this.mConfigurationCache.containsKey(str)) {
            return ((Integer) this.mConfigurationCache.get(str)).intValue();
        }
        String str2 = "drawable";
        if (this.mRuntimeAppConfigurationProvider.a(str)) {
            int identifier = this.b.getResources().getIdentifier(this.mRuntimeAppConfigurationProvider.a(str, ""), str2, Lg.a(this.b));
            this.mConfigurationCache.put(str, Integer.valueOf(identifier));
            return identifier;
        }
        int identifier2 = this.b.getResources().getIdentifier(str, str2, Lg.a(this.b));
        this.mConfigurationCache.put(str, Integer.valueOf(identifier2));
        return identifier2;
    }

    private String a() {
        return getStringValue("com_appboy_server_target", "PROD");
    }
}
