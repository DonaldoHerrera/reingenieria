package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;

/* renamed from: Av reason: default package */
public final class Av {
    private static final Charset a = Charset.forName("UTF-8");
    private static final ThreadLocal<DateFormat> b = new Dv();
    private final Context c;
    private final String d;
    private final SharedPreferences e;

    public Av(Context context, String str) {
        this.c = context;
        this.d = str;
        this.e = context.getSharedPreferences("com.google.firebase.remoteconfig_legacy_settings", 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0031 A[SYNTHETIC, Splitter:B:24:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0043 A[Catch:{ all -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004a A[SYNTHETIC, Splitter:B:37:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0056 A[SYNTHETIC, Splitter:B:44:0x0056] */
    private final C0220Jv b() {
        FileInputStream fileInputStream;
        String str = "Failed to close persisted config file.";
        String str2 = "FirebaseRemoteConfig";
        Context context = this.c;
        if (context == null) {
            return null;
        }
        try {
            fileInputStream = context.openFileInput("persisted_config");
            try {
                C0220Jv a2 = C0220Jv.a(fileInputStream);
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        Log.e(str2, str, e2);
                    }
                }
                return a2;
            } catch (FileNotFoundException e3) {
                e = e3;
                if (Log.isLoggable(str2, 3)) {
                }
                if (fileInputStream != null) {
                }
                return null;
            } catch (IOException e4) {
                e = e4;
                try {
                    Log.e(str2, "Cannot initialize from persisted config.", e);
                    if (fileInputStream != null) {
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e5) {
                            Log.e(str2, str, e5);
                        }
                    }
                    throw th;
                }
            }
        } catch (FileNotFoundException e6) {
            e = e6;
            fileInputStream = null;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Persisted config file was not found.", e);
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e7) {
                    Log.e(str2, str, e7);
                }
            }
            return null;
        } catch (IOException e8) {
            e = e8;
            fileInputStream = null;
            Log.e(str2, "Cannot initialize from persisted config.", e);
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e9) {
                    Log.e(str2, str, e9);
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            if (fileInputStream != null) {
            }
            throw th;
        }
    }

    public final boolean a() {
        String str = "save_legacy_configs";
        if (!this.e.getBoolean(str, true)) {
            return false;
        }
        C0220Jv b2 = b();
        HashMap hashMap = new HashMap();
        if (b2 != null) {
            Map a2 = a(b2.j());
            Map a3 = a(b2.g());
            Map a4 = a(b2.k());
            HashSet<String> hashSet = new HashSet<>();
            hashSet.addAll(a2.keySet());
            hashSet.addAll(a3.keySet());
            hashSet.addAll(a4.keySet());
            for (String str2 : hashSet) {
                Cv cv = new Cv(null);
                if (a2.containsKey(str2)) {
                    cv.b((C1432jv) a2.get(str2));
                }
                if (a3.containsKey(str2)) {
                    cv.a((C1432jv) a3.get(str2));
                }
                if (a4.containsKey(str2)) {
                    cv.c((C1432jv) a4.get(str2));
                }
                hashMap.put(str2, cv);
            }
        }
        for (Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            Cv cv2 = (Cv) entry.getValue();
            C1278ev a5 = a(str3, "fetch");
            C1278ev a6 = a(str3, "activate");
            C1278ev a7 = a(str3, "defaults");
            if (cv2.a() != null) {
                a5.b(cv2.a());
            }
            if (cv2.b() != null) {
                a6.b(cv2.b());
            }
            if (cv2.c() != null) {
                a7.b(cv2.c());
            }
        }
        this.e.edit().putBoolean(str, false).commit();
        return true;
    }

    private final Map<String, C1432jv> a(Fv fv) {
        HashMap hashMap = new HashMap();
        Date date = new Date(fv.g());
        List<C0289Zv> k = fv.k();
        ArrayList arrayList = new ArrayList();
        for (C0289Zv a2 : k) {
            C1435jy a3 = a(a2);
            if (a3 != null) {
                C1916zu zuVar = new C1916zu();
                zuVar.a(a3.g());
                zuVar.d(a3.j());
                zuVar.b(((DateFormat) b.get()).format(new Date(a3.k())));
                zuVar.c(a3.l());
                zuVar.b(Long.valueOf(a3.m()));
                zuVar.a(Long.valueOf(a3.n()));
                arrayList.add(zuVar);
            }
        }
        for (C0216Iv iv : fv.j()) {
            String g = iv.g();
            if (g.startsWith("configns:")) {
                g = g.substring(9);
            }
            C1494lv d2 = C1432jv.d();
            List<Gv> j = iv.j();
            HashMap hashMap2 = new HashMap();
            for (Gv gv : j) {
                hashMap2.put(gv.g(), gv.j().a(a));
            }
            d2.a((Map<String, String>) hashMap2);
            d2.a(date);
            if (g.equals("firebase")) {
                d2.a((List<C1916zu>) arrayList);
            }
            try {
                hashMap.put(g, d2.a());
            } catch (JSONException unused) {
                Log.i("FirebaseRemoteConfig", "A set of legacy configs could not be converted.");
            }
        }
        return hashMap;
    }

    private static C1435jy a(C0289Zv zv) {
        try {
            C1341gw gwVar = (C1341gw) zv.iterator();
            byte[] bArr = new byte[zv.size()];
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = ((Byte) gwVar.next()).byteValue();
            }
            return C1435jy.a(bArr);
        } catch (C0225Kw e2) {
            Log.i("FirebaseRemoteConfig", "Payload was not defined or could not be deserialized.", e2);
            return null;
        }
    }

    private final C1278ev a(String str, String str2) {
        return RemoteConfigComponent.zza(this.c, this.d, str, str2);
    }
}
