package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class az {
    private static final String h = Hg.a(az.class);
    final SharedPreferences a;
    final SharedPreferences b;
    Map<String, Long> c = a(this.b);
    long d = this.a.getLong("last_request_global", 0);
    long e = this.a.getLong("last_report_global", 0);
    int f;
    int g;

    az(Context context, String str, dj djVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.managers.geofences.eligibility.global.");
        sb.append(str);
        this.a = context.getSharedPreferences(sb.toString(), 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.appboy.managers.geofences.eligibility.individual.");
        sb2.append(str);
        this.b = context.getSharedPreferences(sb2.toString(), 0);
        this.f = djVar.f();
        this.g = djVar.g();
    }

    /* access modifiers changed from: 0000 */
    public void a(List<C0491bg> list) {
        HashSet hashSet = new HashSet();
        for (C0491bg id : list) {
            hashSet.add(id.getId());
        }
        HashSet<String> hashSet2 = new HashSet<>(this.c.keySet());
        Editor edit = this.b.edit();
        for (String str : hashSet2) {
            if (!hashSet.contains(a(str))) {
                String str2 = h;
                StringBuilder sb = new StringBuilder();
                sb.append("Deleting outdated re-eligibility id ");
                sb.append(str);
                sb.append(" from re-eligibility list.");
                Hg.a(str2, sb.toString());
                this.c.remove(str);
                edit.remove(str);
            } else {
                String str3 = h;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Retaining re-eligibility id ");
                sb2.append(str);
                sb2.append(" in re-eligibility list.");
                Hg.a(str3, sb2.toString());
            }
        }
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public boolean a(long j, C0491bg bgVar, v vVar) {
        long j2 = j;
        v vVar2 = vVar;
        if (bgVar == null) {
            Hg.e(h, "Geofence passed into getReportEligible() was null.");
            return false;
        }
        String id = bgVar.getId();
        String a2 = a(id, vVar2);
        int y = vVar2.equals(v.ENTER) ? bgVar.y() : bgVar.J();
        long j3 = j2 - this.e;
        String str = " seconds have passed since the last time geofences were reported globally (minimum interval: ";
        String str2 = "Geofence report suppressed since only ";
        String str3 = "). id:";
        if (((long) this.g) > j3) {
            String str4 = h;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(j3);
            sb.append(str);
            sb.append(this.g);
            sb.append(str3);
            sb.append(id);
            Hg.a(str4, sb.toString());
            return false;
        }
        if (this.c.containsKey(a2)) {
            long longValue = j2 - ((Long) this.c.get(a2)).longValue();
            String str5 = id;
            String str6 = " transition:";
            String str7 = " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: ";
            if (((long) y) > longValue) {
                String str8 = h;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(longValue);
                sb2.append(str7);
                sb2.append(y);
                sb2.append(str3);
                sb2.append(str5);
                sb2.append(str6);
                sb2.append(vVar2);
                Hg.a(str8, sb2.toString());
                return false;
            }
            id = str5;
            String str9 = h;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(longValue);
            sb3.append(str7);
            sb3.append(y);
            sb3.append(str3);
            sb3.append(id);
            sb3.append(str6);
            sb3.append(vVar2);
            Hg.a(str9, sb3.toString());
        } else {
            String str10 = h;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Geofence report eligible since this geofence/transition combination has never reported. id:");
            sb4.append(id);
            sb4.append(" ");
            sb4.append(vVar2);
            Hg.a(str10, sb4.toString());
        }
        String str11 = h;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Geofence report eligible since ");
        sb5.append(j3);
        sb5.append(str);
        sb5.append(this.g);
        sb5.append(str3);
        sb5.append(id);
        Hg.a(str11, sb5.toString());
        this.c.put(a2, Long.valueOf(j));
        Editor edit = this.b.edit();
        long j4 = j;
        edit.putLong(a2, j4);
        edit.apply();
        this.e = j4;
        Editor edit2 = this.a.edit();
        edit2.putLong("last_report_global", j4);
        edit2.apply();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(boolean z, long j) {
        long j2 = j - this.d;
        String str = ").";
        String str2 = " seconds have passed since the last time geofences were requested (minimum interval: ";
        if (z || ((long) this.f) <= j2) {
            if (z) {
                String str3 = h;
                StringBuilder sb = new StringBuilder();
                sb.append("Geofence request eligible. Ignoring rate limit for this geofence request. Elapsed time since last request:");
                sb.append(j2);
                Hg.a(str3, sb.toString());
            } else {
                String str4 = h;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Geofence request eligible since ");
                sb2.append(j2);
                sb2.append(str2);
                sb2.append(this.f);
                sb2.append(str);
                Hg.a(str4, sb2.toString());
            }
            this.d = j;
            Editor edit = this.a.edit();
            edit.putLong("last_request_global", this.d);
            edit.apply();
            return true;
        }
        String str5 = h;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Geofence request suppressed since only ");
        sb3.append(j2);
        sb3.append(str2);
        sb3.append(this.f);
        sb3.append(str);
        Hg.a(str5, sb3.toString());
        return false;
    }

    /* access modifiers changed from: 0000 */
    public String a(String str) {
        try {
            return str.split("_", 2)[1];
        } catch (Exception e2) {
            String str2 = h;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception trying to parse re-eligibility id: ");
            sb.append(str);
            Hg.c(str2, sb.toString(), e2);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public String a(String str, v vVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(vVar.toString().toLowerCase(Locale.US));
        sb.append("_");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void a(bu buVar) {
        int k = buVar.k();
        String str = "s.";
        if (k >= 0) {
            this.f = k;
            String str2 = h;
            StringBuilder sb = new StringBuilder();
            sb.append("Min time since last geofence request reset via server configuration: ");
            sb.append(k);
            sb.append(str);
            Hg.c(str2, sb.toString());
        }
        int l = buVar.l();
        if (l >= 0) {
            this.g = l;
            String str3 = h;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Min time since last geofence report reset via server configuration: ");
            sb2.append(l);
            sb2.append(str);
            Hg.c(str3, sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public Map<String, Long> a(SharedPreferences sharedPreferences) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map all = sharedPreferences.getAll();
        if (!(all == null || all.size() == 0)) {
            Set<String> keySet = all.keySet();
            if (keySet.size() == 0) {
                return concurrentHashMap;
            }
            for (String str : keySet) {
                long j = sharedPreferences.getLong(str, 0);
                String str2 = h;
                StringBuilder sb = new StringBuilder();
                sb.append("Retrieving geofence id ");
                sb.append(a(str));
                sb.append(" eligibility information from local storage.");
                Hg.a(str2, sb.toString());
                concurrentHashMap.put(str, Long.valueOf(j));
            }
        }
        return concurrentHashMap;
    }
}
