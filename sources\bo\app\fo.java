package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Process;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

public class fo implements fk {
    /* access modifiers changed from: private */
    public static final String a = Hg.a(fo.class);
    private final Context b;
    private final ThreadPoolExecutor c;
    private final SharedPreferences d;
    /* access modifiers changed from: private */
    public Map<String, String> e;
    private Map<String, String> f = new HashMap();

    public fo(Context context, ThreadPoolExecutor threadPoolExecutor, String str) {
        this.b = context;
        this.c = threadPoolExecutor;
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.triggers.local_assets.");
        sb.append(str);
        this.d = context.getSharedPreferences(sb.toString(), 0);
        this.e = a();
    }

    /* access modifiers changed from: 0000 */
    public File b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.getCacheDir().getPath());
        sb.append("/");
        sb.append("ab_triggers");
        return new File(sb.toString());
    }

    public void a(List<eb> list) {
        final HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (eb ebVar : list) {
            fr d2 = ebVar.d();
            if (d2 != null && !Ng.d(d2.b())) {
                String str = ".";
                if (ebVar.a()) {
                    String str2 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received new remote path for triggered action ");
                    sb.append(ebVar.b());
                    sb.append(" at ");
                    sb.append(d2.b());
                    sb.append(str);
                    Hg.a(str2, sb.toString());
                    hashSet.add(d2);
                    hashSet2.add(d2.b());
                } else {
                    String str3 = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Pre-fetch off for triggered action ");
                    sb2.append(ebVar.b());
                    sb2.append(". Not pre-fetching assets at remote path ");
                    sb2.append(d2.b());
                    sb2.append(str);
                    Hg.a(str3, sb2.toString());
                }
            }
        }
        final Editor edit = this.d.edit();
        for (String str4 : new HashSet(this.e.keySet())) {
            if (this.f.containsKey(str4)) {
                String str5 = a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Not removing local path for remote path ");
                sb3.append(str4);
                sb3.append(" from cache because it is being preserved until the end of the app run.");
                Hg.a(str5, sb3.toString());
            } else if (!hashSet2.contains(str4)) {
                String str6 = (String) this.e.get(str4);
                String str7 = a;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Removing obsolete local path ");
                sb4.append(str6);
                sb4.append(" for obsolete remote path ");
                sb4.append(str4);
                sb4.append(" from cache.");
                Hg.a(str7, sb4.toString());
                this.e.remove(str4);
                edit.remove(str4);
                Fg.a(new File(str6));
            }
        }
        edit.apply();
        try {
            File[] listFiles = b().listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    String path = file.getPath();
                    String str8 = "Asset ";
                    if (this.e.containsValue(path)) {
                        String str9 = a;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str8);
                        sb5.append(path);
                        sb5.append(" is not obsolete. Not deleting.");
                        Hg.a(str9, sb5.toString());
                    } else if (!this.f.containsValue(path)) {
                        String str10 = a;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("Deleting obsolete asset ");
                        sb6.append(path);
                        sb6.append(" from filesystem.");
                        Hg.a(str10, sb6.toString());
                        Fg.a(file);
                    } else {
                        String str11 = a;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str8);
                        sb7.append(path);
                        sb7.append(" is being preserved. Not deleting.");
                        Hg.a(str11, sb7.toString());
                    }
                }
            }
        } catch (Exception e2) {
            Hg.a(a, "Exception while deleting obsolete assets from filesystem.", e2);
        }
        this.c.execute(new Runnable() {
            public void run() {
                Process.setThreadPriority(10);
                for (fr frVar : hashSet) {
                    String b2 = frVar.b();
                    if (!fo.this.e.containsKey(b2)) {
                        try {
                            String a2 = fo.this.a(frVar);
                            if (!Ng.d(a2)) {
                                String c2 = fo.a;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Adding new local path ");
                                sb.append(a2);
                                sb.append(" for remote path ");
                                sb.append(b2);
                                sb.append(" to cache.");
                                Hg.a(c2, sb.toString());
                                fo.this.e.put(b2, a2);
                                edit.putString(b2, a2);
                            }
                        } catch (Exception e) {
                            String c3 = fo.a;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failed to add new local path for remote path ");
                            sb2.append(b2);
                            sb2.append(".");
                            Hg.a(c3, sb2.toString(), e);
                        }
                    }
                }
                edit.apply();
            }
        });
    }

    public String a(eb ebVar) {
        if (!ebVar.a()) {
            Hg.a(a, "Prefetch turned off for this triggered action. Not retrieving local asset path.");
            return null;
        }
        fr d2 = ebVar.d();
        if (d2 == null) {
            Hg.c(a, "Remote path was null or blank. Not retrieving local asset path.");
            return null;
        }
        String b2 = d2.b();
        if (Ng.d(b2)) {
            Hg.e(a, "Remote asset path string was null or blank. Not retrieving local asset path.");
            return null;
        } else if (this.e.containsKey(b2)) {
            String str = (String) this.e.get(b2);
            if (!new File(str).exists()) {
                String str2 = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Local asset for remote asset path did not exist: ");
                sb.append(b2);
                Hg.e(str2, sb.toString());
                return null;
            }
            String str3 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Retrieving local asset path for remote asset path: ");
            sb2.append(b2);
            Hg.c(str3, sb2.toString());
            this.f.put(b2, str);
            return str;
        } else {
            String str4 = a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("No local asset path found for remote asset path: ");
            sb3.append(b2);
            Hg.e(str4, sb3.toString());
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public String a(fr frVar) {
        File b2 = b();
        String b3 = frVar.b();
        String str = " for remote path ";
        String str2 = ". Not storing local asset";
        if (frVar.a().equals(ez.ZIP)) {
            String a2 = Pg.a(b2, b3);
            if (!Ng.d(a2)) {
                String str3 = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Storing local triggered action html zip asset at local path ");
                sb.append(a2);
                sb.append(str);
                sb.append(b3);
                Hg.c(str3, sb.toString());
                return a2;
            }
            String str4 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to store html zip asset for remote path ");
            sb2.append(b3);
            sb2.append(str2);
            Hg.a(str4, sb2.toString());
            return null;
        }
        File a3 = Fg.a(b2.toString(), b3, Integer.toString(Kg.a()), null);
        if (a3 != null) {
            Uri fromFile = Uri.fromFile(a3);
            if (fromFile != null) {
                String str5 = a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Storing local triggered action image asset at local path ");
                sb3.append(fromFile.getPath());
                sb3.append(str);
                sb3.append(b3);
                Hg.c(str5, sb3.toString());
                return fromFile.getPath();
            }
            String str6 = a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Failed to store image asset for remote path ");
            sb4.append(b3);
            sb4.append(str2);
            Hg.a(str6, sb4.toString());
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public Map<String, String> a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map all = this.d.getAll();
        if (!(all == null || all.size() == 0)) {
            Set<String> keySet = all.keySet();
            if (!(keySet == null || keySet.size() == 0)) {
                try {
                    for (String str : keySet) {
                        String string = this.d.getString(str, null);
                        if (!Ng.d(string)) {
                            String str2 = a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Retrieving trigger local asset path ");
                            sb.append(string);
                            sb.append(" from local storage for remote path ");
                            sb.append(str);
                            sb.append(".");
                            Hg.a(str2, sb.toString());
                            concurrentHashMap.put(str, string);
                        }
                    }
                } catch (Exception e2) {
                    Hg.b(a, "Encountered unexpected exception while parsing stored triggered action local assets.", e2);
                }
            }
        }
        return concurrentHashMap;
    }
}
