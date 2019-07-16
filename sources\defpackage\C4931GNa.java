package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* renamed from: GNa reason: default package and case insensitive filesystem */
/* compiled from: IdManager */
public class C4931GNa {
    private static final Pattern a = Pattern.compile("[^\\p{Alnum}]");
    private static final String b = Pattern.quote("/");
    private final ReentrantLock c = new ReentrantLock();
    private final C4993INa d;
    private final boolean e;
    private final boolean f;
    private final Context g;
    private final String h;
    private final String i;
    private final Collection<C5531_Ma> j;
    C6841lNa k;
    C6705jNa l;
    boolean m;
    C4900FNa n;

    /* renamed from: GNa$a */
    /* compiled from: IdManager */
    public enum a {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        
        public final int i;

        private a(int i2) {
            this.i = i2;
        }
    }

    public C4931GNa(Context context, String str, String str2, Collection<C5531_Ma> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.g = context;
            this.h = str;
            this.i = str2;
            this.j = collection;
            this.d = new C4993INa();
            this.k = new C6841lNa(context);
            this.n = new C4900FNa();
            this.e = C7391tNa.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            String str3 = "Fabric";
            if (!this.e) {
                C5701cNa e2 = C5328TMa.e();
                StringBuilder sb = new StringBuilder();
                sb.append("Device ID collection disabled for ");
                sb.append(context.getPackageName());
                e2.d(str3, sb.toString());
            }
            this.f = C7391tNa.a(context, "com.crashlytics.CollectUserIdentifiers", true);
            if (!this.f) {
                C5701cNa e3 = C5328TMa.e();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("User information collection disabled for ");
                sb2.append(context.getPackageName());
                e3.d(str3, sb2.toString());
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }

    private String b(String str) {
        return str.replaceAll(b, "");
    }

    private Boolean m() {
        C6705jNa b2 = b();
        if (b2 != null) {
            return Boolean.valueOf(b2.b);
        }
        return null;
    }

    public boolean a() {
        return this.f;
    }

    public String c() {
        return this.h;
    }

    public String d() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        SharedPreferences i2 = C7391tNa.i(this.g);
        a(i2);
        String string = i2.getString("crashlytics.installation.id", null);
        return string == null ? b(i2) : string;
    }

    public Map<a, String> e() {
        HashMap hashMap = new HashMap();
        for (C5531_Ma _ma : this.j) {
            if (_ma instanceof C7736yNa) {
                for (Entry entry : ((C7736yNa) _ma).a().entrySet()) {
                    a(hashMap, (a) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public String f() {
        return this.d.a(this.g);
    }

    public String g() {
        return String.format(Locale.US, "%s/%s", new Object[]{b(Build.MANUFACTURER), b(Build.MODEL)});
    }

    public String h() {
        return b(VERSION.INCREMENTAL);
    }

    public String i() {
        return b(VERSION.RELEASE);
    }

    public String j() {
        StringBuilder sb = new StringBuilder();
        sb.append(i());
        sb.append("/");
        sb.append(h());
        return sb.toString();
    }

    public Boolean k() {
        if (l()) {
            return m();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        return this.e && !this.n.e(this.g);
    }

    private String a(String str) {
        if (str == null) {
            return null;
        }
        return a.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    @SuppressLint({"CommitPrefEdits"})
    private String b(SharedPreferences sharedPreferences) {
        String str = "crashlytics.installation.id";
        this.c.lock();
        try {
            String string = sharedPreferences.getString(str, null);
            if (string == null) {
                string = a(UUID.randomUUID().toString());
                sharedPreferences.edit().putString(str, string).commit();
            }
            return string;
        } finally {
            this.c.unlock();
        }
    }

    private void a(SharedPreferences sharedPreferences) {
        C6705jNa b2 = b();
        if (b2 != null) {
            a(sharedPreferences, b2.a);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    private void a(SharedPreferences sharedPreferences, String str) {
        String str2 = "crashlytics.advertising.id";
        this.c.lock();
        try {
            if (!TextUtils.isEmpty(str)) {
                String string = sharedPreferences.getString(str2, null);
                if (TextUtils.isEmpty(string)) {
                    sharedPreferences.edit().putString(str2, str).commit();
                } else if (!string.equals(str)) {
                    sharedPreferences.edit().remove("crashlytics.installation.id").putString(str2, str).commit();
                }
                this.c.unlock();
            }
        } finally {
            this.c.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized C6705jNa b() {
        if (!this.m) {
            this.l = this.k.a();
            this.m = true;
        }
        return this.l;
    }

    private void a(Map<a, String> map, a aVar, String str) {
        if (str != null) {
            map.put(aVar, str);
        }
    }
}
