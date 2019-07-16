package bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.appboy.services.AppboyGeofenceService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class dp {
    private static final String a = Hg.a(dp.class);

    public static PendingIntent a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".APPBOY_GEOFENCE_UPDATE");
        return PendingIntent.getService(context, 0, new Intent(sb.toString()).setClass(context, AppboyGeofenceService.class), 134217728);
    }

    public static PendingIntent b(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".APPBOY_GEOFENCE_LOCATION_UPDATE");
        return PendingIntent.getService(context, 0, new Intent(sb.toString()).setClass(context, AppboyGeofenceService.class), 134217728);
    }

    public static boolean a(dj djVar) {
        if (!djVar.a()) {
            Hg.c(a, "Geofences implicitly disabled via server configuration.");
            return false;
        } else if (djVar.b()) {
            Hg.c(a, "Geofences enabled in server configuration.");
            return true;
        } else {
            Hg.c(a, "Geofences explicitly disabled via server configuration.");
            return false;
        }
    }

    public static int b(dj djVar) {
        if (djVar.h() > 0) {
            return djVar.h();
        }
        return 20;
    }

    public static List<C0491bg> a(SharedPreferences sharedPreferences) {
        ArrayList arrayList = new ArrayList();
        Map all = sharedPreferences.getAll();
        if (all == null || all.size() == 0) {
            Hg.a(a, "Did not find stored geofences.");
            return arrayList;
        }
        Set<String> keySet = all.keySet();
        if (keySet == null || keySet.size() == 0) {
            Hg.e(a, "Failed to find stored geofence keys.");
            return arrayList;
        }
        for (String str : keySet) {
            String string = sharedPreferences.getString(str, null);
            try {
                if (Ng.d(string)) {
                    String str2 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received null or blank serialized  geofence string for geofence id ");
                    sb.append(str);
                    sb.append(" from shared preferences. Not parsing.");
                    Hg.e(str2, sb.toString());
                } else {
                    arrayList.add(new C0491bg(new JSONObject(string)));
                }
            } catch (JSONException e) {
                String str3 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered Json exception while parsing stored geofence: ");
                sb2.append(string);
                Hg.b(str3, sb2.toString(), e);
            } catch (Exception e2) {
                String str4 = a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Encountered unexpected exception while parsing stored geofence: ");
                sb3.append(string);
                Hg.b(str4, sb3.toString(), e2);
            }
        }
        return arrayList;
    }
}
