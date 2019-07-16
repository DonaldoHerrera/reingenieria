package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;

public class be implements bh {
    /* access modifiers changed from: private */
    public static final String b = Hg.a(be.class);
    /* access modifiers changed from: private */
    public static boolean j = false;
    final SharedPreferences a;
    /* access modifiers changed from: private */
    public final Context c;
    private final bi d;
    private final dc e;
    private final dj f;
    private final ab g;
    private String h;
    private String i;

    public be(Context context, Bf bf, String str, bi biVar, dc dcVar, dj djVar, ab abVar) {
        if (context != null) {
            this.c = context;
            this.d = biVar;
            this.e = dcVar;
            this.f = djVar;
            this.g = abVar;
            StringBuilder sb = new StringBuilder();
            sb.append("com.appboy.storage.device_ad_info");
            sb.append(Ng.a(context, str, bf.d().toString()));
            this.a = context.getSharedPreferences(sb.toString(), 0);
            dj djVar2 = this.f;
            if (djVar2 != null && djVar2.c()) {
                n();
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    public static boolean e() {
        return j;
    }

    private String h() {
        return String.valueOf(VERSION.SDK_INT);
    }

    private String i() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService("phone");
        int phoneType = telephonyManager.getPhoneType();
        if (phoneType != 0) {
            if (phoneType == 1 || phoneType == 2) {
                return telephonyManager.getNetworkOperatorName();
            }
            Hg.e(b, "Unknown phone type");
        }
        return null;
    }

    private String j() {
        return Build.MODEL;
    }

    private Locale k() {
        return Locale.getDefault();
    }

    private TimeZone l() {
        return TimeZone.getDefault();
    }

    private DisplayMetrics m() {
        WindowManager windowManager = (WindowManager) this.c.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    private void n() {
        new Thread(new Runnable() {
            public void run() {
                try {
                    be.j = be.this.a.getBoolean("ac", false);
                    Method a2 = dx.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
                    if (a2 != null) {
                        Object a3 = dx.a((Object) null, a2, be.this.c);
                        if (a3 instanceof Integer) {
                            if (((Integer) a3).intValue() == 0) {
                                Method a4 = dx.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class});
                                if (a4 != null) {
                                    Object a5 = dx.a((Object) null, a4, be.this.c);
                                    if (a5 != null) {
                                        Method a6 = dx.a(a5.getClass(), "getId", (Class<?>[]) new Class[0]);
                                        Method a7 = dx.a(a5.getClass(), "isLimitAdTrackingEnabled", (Class<?>[]) new Class[0]);
                                        if (a6 != null) {
                                            if (a7 != null) {
                                                if (((Boolean) dx.a(a5, a7, new Object[0])).booleanValue()) {
                                                    Hg.c(be.b, "Google Play Services limit ad tracking enabled. User is opted out of interest-based ads. Not requesting Advertising Id.");
                                                } else {
                                                    be.this.a((String) dx.a(a5, a6, new Object[0]));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    Hg.b(be.b, "Failed to get ad id.", e);
                }
            }
        }).start();
    }

    public by b() {
        this.e.a(a());
        return (by) this.e.b();
    }

    public String c() {
        String a2 = this.d.a();
        if (a2 == null) {
            Hg.b(b, "Error reading deviceId, received a null value.");
        }
        return a2;
    }

    public String d() {
        if (this.h == null) {
            this.h = this.a.getString("a", null);
        }
        return this.h;
    }

    public String f() {
        PackageInfo packageInfo;
        String str = this.i;
        if (str != null) {
            return str;
        }
        String packageName = this.c.getPackageName();
        try {
            packageInfo = this.c.getPackageManager().getPackageInfo(packageName, 0);
        } catch (NameNotFoundException e2) {
            String str2 = b;
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to inspect package [");
            sb.append(packageName);
            sb.append("]");
            Hg.b(str2, sb.toString(), e2);
            packageInfo = null;
        }
        if (packageInfo == null) {
            packageInfo = this.c.getPackageManager().getPackageArchiveInfo(this.c.getApplicationInfo().sourceDir, 0);
        }
        if (packageInfo != null) {
            this.i = packageInfo.versionName;
            return this.i;
        }
        Hg.a(b, "App version could not be read. Returning null");
        return null;
    }

    public by a() {
        by byVar = new by(h(), i(), j(), a(k()), l().getID(), d(), a(m()));
        return byVar;
    }

    static String a(Locale locale) {
        return locale.toString();
    }

    static String a(DisplayMetrics displayMetrics) {
        StringBuilder sb = new StringBuilder();
        sb.append(displayMetrics.widthPixels);
        sb.append("x");
        sb.append(displayMetrics.heightPixels);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        if (Ng.d(str)) {
            Hg.b(b, "Received null ad id, doing nothing.");
            return;
        }
        this.h = Ng.c(str);
        String str2 = "a";
        String string = this.a.getString(str2, "");
        if (!string.equals(this.h)) {
            Hg.c(b, "Advertising Id did not match stored Advertising Id.  Replacing stored Advertising Id and requesting new PlaceIQ Id.");
            this.g.a(ck.a, ck.class);
            Editor edit = this.a.edit();
            edit.putString(str2, this.h);
            if (!Ng.d(string)) {
                j = true;
                edit.putBoolean("ac", true);
            }
            edit.apply();
        } else {
            Hg.c(b, "Google Play Services Advertising Id matched stored Advertising Id.");
        }
    }
}
