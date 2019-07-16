package com.google.firebase.perf.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import androidx.annotation.Keep;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase-perf.B;
import com.google.android.gms.internal.firebase-perf.D;
import com.google.android.gms.internal.firebase-perf.Ec;
import com.google.android.gms.internal.firebase-perf.nd;
import com.google.android.gms.internal.firebase-perf.ud;
import com.google.android.gms.internal.firebase-perf.xd;
import com.google.android.gms.internal.firebase-perf.yd;
import com.google.firebase.FirebaseApp;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Keep
public class RemoteConfigManager {
    private static final RemoteConfigManager zzfb = new RemoteConfigManager();
    private static final long zzfc = TimeUnit.HOURS.toMillis(12);
    private final Executor executor;
    private FirebaseApp zzcp;
    private boolean zzfd;
    private long zzfe;
    private Ec<yd<String, Long>> zzff;
    private yd<String, Long> zzfg;
    private FirebaseRemoteConfig zzfh;

    private RemoteConfigManager() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this(threadPoolExecutor, null, null);
    }

    public static RemoteConfigManager zzbz() {
        return zzfb;
    }

    private final void zzca() {
        if (this.zzfd) {
            zzcb();
        } else {
            this.executor.execute(new x(this));
        }
    }

    private final void zzcb() {
        if (zzcc()) {
            if (System.currentTimeMillis() - this.zzfe > zzfc) {
                this.zzfe = System.currentTimeMillis();
                this.zzfh.fetchAndActivate().a(this.executor, (Sy) new w(this));
            }
        }
    }

    private final boolean zzcc() {
        return this.zzfh != null && ((Long) this.zzfg.getOrDefault(D.a("firebase_remote_config_enabled"), Long.valueOf(1))).longValue() == 1;
    }

    @VisibleForTesting
    private static int zzf(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException unused) {
            return 0;
        }
    }

    @VisibleForTesting
    private static String zzi(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance(Constants.SHA1).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte valueOf : digest) {
                sb.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final void zza(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.zzfh = firebaseRemoteConfig;
    }

    public final long zzc(String str, long j) {
        String str2 = " for key: ";
        String str3 = "FirebasePerformance";
        zzca();
        long longValue = ((Long) this.zzfg.getOrDefault(D.a(str), Long.valueOf(j))).longValue();
        if (!zzcc()) {
            return longValue;
        }
        String string = this.zzfh.getString(D.b(str));
        try {
            longValue = (long) (((float) Long.parseLong(string)) * 100.0f);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Fetched value: ");
            sb.append(longValue);
            sb.append(str2);
            sb.append(str);
            sb.append(" from firebase remote config.");
            Log.d(str3, sb.toString());
            return longValue;
        } catch (NumberFormatException unused) {
            if (string.isEmpty()) {
                return longValue;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 45 + String.valueOf(str).length());
            sb2.append("Could not parse value: ");
            sb2.append(string);
            sb2.append(str2);
            sb2.append(str);
            sb2.append(" into a long");
            Log.d(str3, sb2.toString());
            return longValue;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zzcd() {
        if (this.zzcp != null) {
            this.zzfg = (yd) this.zzff.get();
            this.zzfd = true;
            yd<String, Long> ydVar = this.zzfg;
        } else {
            yd.a();
        }
        zzcb();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ yd zzce() {
        return zzc(zza(this.zzcp.b(), this.zzcp.d().b()));
    }

    @VisibleForTesting
    private RemoteConfigManager(Executor executor2, FirebaseRemoteConfig firebaseRemoteConfig, FirebaseApp firebaseApp) {
        this.zzfd = false;
        this.zzfe = 0;
        this.zzff = nd.a(new v(this));
        this.zzfg = yd.a();
        this.executor = executor2;
        this.zzfh = null;
        this.zzcp = null;
    }

    public final void zza(FirebaseApp firebaseApp) {
        this.zzcp = firebaseApp;
    }

    public final float zza(String str, float f) {
        zzca();
        Long l = (Long) this.zzfg.get(D.a(str));
        if (l != null) {
            f = (float) l.longValue();
        }
        if (!zzcc()) {
            return f;
        }
        String string = this.zzfh.getString(D.b(str));
        try {
            return 100.0f * Float.parseFloat(string);
        } catch (NumberFormatException unused) {
            if (string.isEmpty()) {
                return f;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 46 + String.valueOf(str).length());
            sb.append("Could not parse value: ");
            sb.append(string);
            sb.append(" for key: ");
            sb.append(str);
            sb.append(" into a float");
            Log.d("FirebasePerformance", sb.toString());
            return f;
        }
    }

    private static yd<String, Long> zzc(List<String> list) {
        if (list == null) {
            return yd.a();
        }
        HashMap hashMap = new HashMap();
        for (String split : list) {
            for (String split2 : split.split(",")) {
                String[] split3 = split2.split(":");
                if (split3.length >= 2) {
                    String trim = split3[0].trim();
                    if (!trim.isEmpty() && !hashMap.containsKey(trim)) {
                        try {
                            long parseLong = Long.parseLong(split3[1].trim());
                            if (parseLong >= 0) {
                                hashMap.put(trim, Long.valueOf(parseLong));
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        return yd.a(hashMap);
    }

    private static ud<String> zza(Context context, String str) {
        xd h = ud.h();
        int zzf = zzf(context);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append(":");
        sb.append(zzf);
        String[] strArr = {sb.toString(), str, "1.0.0.249530108"};
        for (int i = 0; i < 3; i++) {
            String str2 = "_fireperf1:";
            String valueOf = String.valueOf(strArr[i]);
            String zzi = zzi(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzi).length() + 16);
            sb2.append("fireperf:");
            sb2.append(zzi);
            sb2.append("_limits");
            String str3 = null;
            try {
                str3 = B.a(context.getContentResolver(), sb2.toString(), (String) null);
            } catch (SecurityException e) {
                String str4 = "Failed to fetch Gservices flag. SecurityException: ";
                String valueOf2 = String.valueOf(e.getMessage());
                Log.w("FirebasePerformance", valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4));
            }
            if (str3 != null) {
                h.a(str3);
            }
        }
        return h.a();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zza(Exception exc) {
        this.zzfe = 0;
    }
}
