package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

public class dj {
    private static final String a = Hg.a(dj.class);
    private final ab b;
    private final SharedPreferences c;
    /* access modifiers changed from: private */
    public final Object d = new Object();
    private AtomicBoolean e = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public bu f;

    class a extends AsyncTask<Void, Void, Void> {
        private a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            bu buVar = new bu();
            buVar.b(dj.this.n());
            buVar.a(dj.this.m());
            buVar.c(dj.this.o());
            buVar.a(dj.this.l());
            buVar.c(dj.this.j());
            buVar.a(dj.this.c());
            buVar.b(dj.this.e());
            buVar.c(dj.this.d());
            buVar.b(dj.this.i());
            buVar.a(dj.this.k());
            buVar.a(dj.this.f());
            buVar.b(dj.this.g());
            buVar.c(dj.this.h());
            buVar.d(dj.this.b());
            buVar.e(dj.this.a());
            synchronized (dj.this.d) {
                dj.this.f = buVar;
            }
            return null;
        }
    }

    public dj(Context context, String str, ab abVar) {
        String str2;
        if (str == null) {
            Hg.b(a, "ServerConfigStorageProvider received null api key.");
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(".");
            sb.append(str);
            str2 = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.appboy.storage.serverconfigstorageprovider");
        sb2.append(str2);
        this.c = context.getSharedPreferences(sb2.toString(), 0);
        this.b = abVar;
        new a().execute(new Void[0]);
    }

    public boolean b() {
        synchronized (this.d) {
            if (this.f != null) {
                boolean n = this.f.n();
                return n;
            }
            boolean z = this.c.getBoolean("geofences_enabled", false);
            return z;
        }
    }

    public boolean c() {
        synchronized (this.d) {
            if (this.f != null) {
                boolean a2 = this.f.a();
                return a2;
            }
            boolean z = this.c.getBoolean("piq_enabled", false);
            return z;
        }
    }

    public boolean d() {
        synchronized (this.d) {
            if (this.f != null) {
                boolean g = this.f.g();
                return g;
            }
            boolean z = this.c.getBoolean("location_enabled_set", false);
            return z;
        }
    }

    public boolean e() {
        synchronized (this.d) {
            if (this.f != null) {
                boolean g = this.f.g();
                return g;
            }
            boolean z = this.c.getBoolean("location_enabled", false);
            return z;
        }
    }

    public int f() {
        synchronized (this.d) {
            if (this.f != null) {
                int k = this.f.k();
                return k;
            }
            int i = this.c.getInt("geofences_min_time_since_last_request", -1);
            return i;
        }
    }

    public int g() {
        synchronized (this.d) {
            if (this.f != null) {
                int l = this.f.l();
                return l;
            }
            int i = this.c.getInt("geofences_min_time_since_last_report", -1);
            return i;
        }
    }

    public int h() {
        synchronized (this.d) {
            if (this.f != null) {
                int m = this.f.m();
                return m;
            }
            int i = this.c.getInt("geofences_max_num_to_register", -1);
            return i;
        }
    }

    public long i() {
        synchronized (this.d) {
            if (this.f != null) {
                long i = this.f.i();
                return i;
            }
            long j = this.c.getLong("location_time", -1);
            return j;
        }
    }

    public long j() {
        synchronized (this.d) {
            if (this.f != null) {
                long f2 = this.f.f();
                return f2;
            }
            long j = this.c.getLong("messaging_session_timeout", -1);
            return j;
        }
    }

    public float k() {
        synchronized (this.d) {
            if (this.f != null) {
                float j = this.f.j();
                return j;
            }
            float f2 = this.c.getFloat("location_distance", -1.0f);
            return f2;
        }
    }

    public long l() {
        synchronized (this.d) {
            if (this.f != null) {
                long b2 = this.f.b();
                return b2;
            }
            long j = this.c.getLong("config_time", 0);
            return j;
        }
    }

    public Set<String> m() {
        Set<String> set;
        synchronized (this.d) {
            if (this.f != null) {
                set = this.f.c();
            } else {
                set = a("blacklisted_events");
            }
            if (set != null) {
                return set;
            }
            HashSet hashSet = new HashSet();
            return hashSet;
        }
    }

    public Set<String> n() {
        Set<String> set;
        synchronized (this.d) {
            if (this.f != null) {
                set = this.f.d();
            } else {
                set = a("blacklisted_attributes");
            }
            if (set != null) {
                return set;
            }
            HashSet hashSet = new HashSet();
            return hashSet;
        }
    }

    public Set<String> o() {
        Set<String> set;
        synchronized (this.d) {
            if (this.f != null) {
                set = this.f.e();
            } else {
                set = a("blacklisted_purchases");
            }
            if (set != null) {
                return set;
            }
            HashSet hashSet = new HashSet();
            return hashSet;
        }
    }

    public boolean p() {
        return this.e.get();
    }

    public void a(bu buVar) {
        synchronized (this.d) {
            if (buVar.a() && !c()) {
                this.b.a(ck.a, ck.class);
            }
            this.f = buVar;
        }
        try {
            Editor edit = this.c.edit();
            if (buVar.c() != null) {
                edit.putString("blacklisted_events", new JSONArray(buVar.c()).toString());
            }
            if (buVar.d() != null) {
                edit.putString("blacklisted_attributes", new JSONArray(buVar.d()).toString());
            }
            if (buVar.e() != null) {
                edit.putString("blacklisted_purchases", new JSONArray(buVar.e()).toString());
            }
            edit.putLong("config_time", buVar.b());
            edit.putBoolean("location_enabled", buVar.g());
            edit.putBoolean("location_enabled_set", buVar.h());
            edit.putLong("location_time", buVar.i());
            edit.putFloat("location_distance", buVar.j());
            edit.putBoolean("piq_enabled", buVar.a());
            edit.putInt("geofences_min_time_since_last_request", buVar.k());
            edit.putInt("geofences_min_time_since_last_report", buVar.l());
            edit.putInt("geofences_max_num_to_register", buVar.m());
            edit.putBoolean("geofences_enabled", buVar.n());
            edit.putBoolean("geofences_enabled_set", buVar.o());
            edit.putLong("messaging_session_timeout", buVar.f());
            edit.apply();
        } catch (Exception e2) {
            Hg.d(a, "Could not persist server config to shared preferences.", e2);
        }
    }

    public boolean a() {
        synchronized (this.d) {
            if (this.f != null) {
                boolean o = this.f.o();
                return o;
            }
            boolean z = this.c.getBoolean("geofences_enabled_set", false);
            return z;
        }
    }

    public void a(boolean z) {
        this.e.set(z);
    }

    private Set<String> a(String str) {
        try {
            String string = this.c.getString(str, "");
            if (Ng.d(string)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(string);
            HashSet hashSet = new HashSet();
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getString(i));
            }
            return hashSet;
        } catch (Exception e2) {
            Hg.d(a, "Experienced exception retrieving blacklisted strings from local storage. Returning null.", e2);
            return null;
        }
    }
}
