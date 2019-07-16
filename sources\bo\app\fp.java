package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

public class fp implements fl {
    private static final String b = Hg.a(fp.class);
    public final Object a = new Object();
    /* access modifiers changed from: private */
    public final Context c;
    private final bg d;
    /* access modifiers changed from: private */
    public final ab e;
    private final long f;
    private final SharedPreferences g;
    private final fk h;
    private final fn i;
    private Map<String, eb> j;
    private volatile long k = 0;

    public fp(Context context, bg bgVar, ThreadPoolExecutor threadPoolExecutor, ab abVar, Bf bf, String str, String str2) {
        this.c = context.getApplicationContext();
        this.d = bgVar;
        this.e = abVar;
        this.f = bf.x();
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.triggers.actions");
        sb.append(Ng.a(context, str, str2));
        this.g = context.getSharedPreferences(sb.toString(), 0);
        this.h = new fo(context, threadPoolExecutor, str2);
        this.i = new fq(context, str, str2);
        this.j = a();
    }

    public void a(List<eb> list) {
        boolean z;
        fh fhVar = new fh();
        if (list == null) {
            Hg.e(b, "Received a null list of triggers in registerTriggeredActions(). Doing nothing.");
            return;
        }
        synchronized (this.a) {
            this.j.clear();
            Editor edit = this.g.edit();
            edit.clear();
            String str = b;
            StringBuilder sb = new StringBuilder();
            sb.append("Registering ");
            sb.append(list.size());
            sb.append(" new triggered actions.");
            Hg.a(str, sb.toString());
            z = false;
            for (eb ebVar : list) {
                String str2 = b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Registering triggered action id ");
                sb2.append(ebVar.b());
                Hg.a(str2, sb2.toString());
                this.j.put(ebVar.b(), ebVar);
                edit.putString(ebVar.b(), ((JSONObject) ebVar.forJsonPut()).toString());
                if (ebVar.a((fb) fhVar)) {
                    z = true;
                }
            }
            edit.apply();
        }
        this.i.a(list);
        this.h.a(list);
        if (z) {
            Hg.c(b, "Test triggered actions found, triggering test event.");
            a((fb) fhVar);
        } else {
            Hg.a(b, "No test triggered actions found.");
        }
    }

    /* access modifiers changed from: 0000 */
    public eb b(fb fbVar) {
        synchronized (this.a) {
            long a2 = dn.a() - this.k;
            boolean z = true;
            if (fbVar instanceof fh) {
                Hg.a(b, "Ignoring minimum time interval between triggered actions because the trigger event is a test.");
            } else {
                String str = b;
                StringBuilder sb = new StringBuilder();
                sb.append(a2);
                sb.append(" seconds have passed since the last trigger action (minimum interval: ");
                sb.append(this.f);
                sb.append(").");
                Hg.c(str, sb.toString());
                if (a2 < this.f) {
                    z = false;
                }
            }
            eb ebVar = null;
            int i2 = Integer.MIN_VALUE;
            for (eb ebVar2 : this.j.values()) {
                if (ebVar2.a(fbVar) && this.i.a(ebVar2)) {
                    String str2 = b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Found potential triggered action for incoming trigger event. Action id ");
                    sb2.append(ebVar2.b());
                    sb2.append(".");
                    Hg.a(str2, sb2.toString());
                    ev c2 = ebVar2.c();
                    if (c2.c() > i2) {
                        i2 = c2.c();
                        ebVar = ebVar2;
                    }
                }
            }
            if (ebVar != null) {
                String str3 = b;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Found best triggered action for incoming trigger event ");
                sb3.append(fbVar.e() != null ? fbVar.e().toString() : "");
                sb3.append(". Matched Action id: ");
                sb3.append(ebVar.b());
                sb3.append(".");
                Hg.a(str3, sb3.toString());
                if (z) {
                    Hg.c(b, "Minimum time interval requirement met for matched trigger.");
                } else if (ebVar.c().g() <= -1 || ((long) ebVar.c().g()) > a2) {
                    String str4 = b;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Minimum time interval requirement and triggered action override time interval requirement of ");
                    sb4.append(ebVar.c().g());
                    sb4.append(" not met for matched trigger. Returning null.");
                    Hg.c(str4, sb4.toString());
                    return null;
                } else {
                    String str5 = b;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Triggered action override time interval requirement met: ");
                    sb5.append(ebVar.c().g());
                    Hg.c(str5, sb5.toString());
                }
                this.k = fbVar.c();
                return ebVar;
            }
            String str6 = b;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Failed to match triggered action for incoming <");
            sb6.append(fbVar.b());
            sb6.append(">.");
            Hg.a(str6, sb6.toString());
            return null;
        }
    }

    public void a(fb fbVar) {
        String str = b;
        StringBuilder sb = new StringBuilder();
        sb.append("New incoming <");
        sb.append(fbVar.b());
        sb.append(">. Searching for matching triggers.");
        Hg.a(str, sb.toString());
        eb b2 = b(fbVar);
        if (b2 != null) {
            b2.a(this.h.a(b2));
            final long d2 = b2.c().e() != -1 ? fbVar.d() + ((long) b2.c().e()) : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            final eb ebVar = b2;
            final fb fbVar2 = fbVar;
            AnonymousClass1 r2 = new Runnable() {
                public void run() {
                    ebVar.a(fp.this.c, fp.this.e, fbVar2, d2);
                }
            };
            handler.postDelayed(r2, (long) (b2.c().d() * 1000));
            this.i.a(b2, fbVar.c());
        }
    }

    /* access modifiers changed from: 0000 */
    public Map<String, eb> a() {
        HashMap hashMap = new HashMap();
        Map all = this.g.getAll();
        if (!(all == null || all.size() == 0)) {
            Set<String> keySet = all.keySet();
            if (!(keySet == null || keySet.size() == 0)) {
                try {
                    for (String str : keySet) {
                        String string = this.g.getString(str, null);
                        if (Ng.d(string)) {
                            String str2 = b;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Received null or blank serialized triggered action string for action id ");
                            sb.append(str);
                            sb.append(" from shared preferences. Not parsing.");
                            Hg.e(str2, sb.toString());
                        } else {
                            eb b2 = fs.b(new JSONObject(string), this.d);
                            if (b2 != null) {
                                hashMap.put(b2.b(), b2);
                                String str3 = b;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Retrieving templated triggered action id ");
                                sb2.append(b2.b());
                                sb2.append(" from local storage.");
                                Hg.a(str3, sb2.toString());
                            }
                        }
                    }
                } catch (JSONException e2) {
                    Hg.b(b, "Encountered Json exception while parsing stored triggered actions.", e2);
                } catch (Exception e3) {
                    Hg.b(b, "Encountered unexpected exception while parsing stored triggered actions.", e3);
                }
            }
        }
        return hashMap;
    }
}
