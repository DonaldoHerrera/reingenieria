package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class fq implements fn {
    private static final String a = Hg.a(fq.class);
    private final SharedPreferences b;
    private Map<String, Long> c = a();

    public fq(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.triggers.re_eligibility");
        sb.append(Ng.a(context, str, str2));
        this.b = context.getSharedPreferences(sb.toString(), 0);
    }

    public void a(List<eb> list) {
        HashSet hashSet = new HashSet();
        for (eb b2 : list) {
            hashSet.add(b2.b());
        }
        HashSet<String> hashSet2 = new HashSet<>(this.c.keySet());
        Editor edit = this.b.edit();
        for (String str : hashSet2) {
            if (!hashSet.contains(str)) {
                String str2 = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Deleting outdated triggered action id ");
                sb.append(str);
                sb.append(" from re-eligibility list.");
                Hg.a(str2, sb.toString());
                this.c.remove(str);
                edit.remove(str);
            } else {
                String str3 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Retaining triggered action ");
                sb2.append(str);
                sb2.append(" in re-eligibility list.");
                Hg.a(str3, sb2.toString());
            }
        }
        edit.apply();
    }

    public boolean a(eb ebVar) {
        eu f = ebVar.c().f();
        String str = "Triggered action id ";
        if (f.a()) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(ebVar.b());
            sb.append(" always eligible via configuration. Returning true for eligibility status");
            Hg.a(str2, sb.toString());
            return true;
        } else if (!this.c.containsKey(ebVar.b())) {
            String str3 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(ebVar.b());
            sb2.append(" always eligible via never having been triggered. Returning true for eligibility status");
            Hg.a(str3, sb2.toString());
            return true;
        } else if (f.b()) {
            String str4 = a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(ebVar.b());
            sb3.append(" no longer eligible due to having been triggered in the past");
            Hg.a(str4, sb3.toString());
            return false;
        } else {
            long a2 = dn.a() - ((Long) this.c.get(ebVar.b())).longValue();
            String str5 = ").";
            String str6 = " seconds have passed since the last time it was triggered (minimum interval: ";
            if (a2 > ((long) f.c().intValue())) {
                String str7 = a;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Trigger action is re-eligible for display since ");
                sb4.append(a2);
                sb4.append(str6);
                sb4.append(f.c());
                sb4.append(str5);
                Hg.a(str7, sb4.toString());
                return true;
            }
            String str8 = a;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Trigger action is not re-eligible for display since only ");
            sb5.append(a2);
            sb5.append(str6);
            sb5.append(f.c());
            sb5.append(str5);
            Hg.a(str8, sb5.toString());
            return false;
        }
    }

    public void a(eb ebVar, long j) {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Updating re-eligibility for action Id ");
        sb.append(ebVar.b());
        sb.append(" to time ");
        sb.append(j);
        sb.append(".");
        Hg.a(str, sb.toString());
        this.c.put(ebVar.b(), Long.valueOf(j));
        Editor edit = this.b.edit();
        edit.putLong(ebVar.b(), j);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public Map<String, Long> a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map all = this.b.getAll();
        if (!(all == null || all.size() == 0)) {
            Set<String> keySet = all.keySet();
            if (!(keySet == null || keySet.size() == 0)) {
                try {
                    for (String str : keySet) {
                        long j = this.b.getLong(str, 0);
                        String str2 = a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Retrieving triggered action id ");
                        sb.append(str);
                        sb.append(" eligibility information from local storage.");
                        Hg.a(str2, sb.toString());
                        concurrentHashMap.put(str, Long.valueOf(j));
                    }
                } catch (Exception e) {
                    Hg.b(a, "Encountered unexpected exception while parsing stored re-eligibility information.", e);
                }
            }
        }
        return concurrentHashMap;
    }
}
