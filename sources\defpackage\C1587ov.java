package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.text.format.DateUtils;
import android.util.Log;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

/* renamed from: ov reason: default package and case insensitive filesystem */
public final class C1587ov {
    public static final long a = TimeUnit.HOURS.toSeconds(12);
    private static final int[] b = {2, 4, 8, 16, 32, 64, 128, 256};
    private static final Pattern c = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private final Context d;
    private final FirebaseInstanceId e;
    private final C2102JE f;
    private final String g;
    private final Executor h;
    private final Clock i;
    private final Random j;
    private final C1278ev k;
    private final C1736tu l;
    private final C1677rv m;
    private final String n;
    private final String o;

    public C1587ov(Context context, String str, FirebaseInstanceId firebaseInstanceId, C2102JE je, String str2, Executor executor, Clock clock, Random random, C1278ev evVar, C1736tu tuVar, C1677rv rvVar) {
        this.d = context;
        this.n = str;
        this.e = firebaseInstanceId;
        this.f = je;
        this.g = str2;
        this.h = executor;
        this.i = clock;
        this.j = random;
        this.k = evVar;
        this.l = tuVar;
        this.m = rvVar;
        Matcher matcher = c.matcher(str);
        this.o = matcher.matches() ? matcher.group(1) : null;
    }

    private final Bu b(Date date) throws FirebaseRemoteConfigException {
        try {
            C1886yu a2 = new C1766uu(new C1826wu(this.l)).a(this.o, this.g, a());
            C1830wy l2 = a2.l();
            l2.d(this.m.g());
            l2.a("X-Android-Package", (Object) this.d.getPackageName());
            l2.a("X-Android-Cert", (Object) a(this.d, this.d.getPackageName()));
            Bu bu = (Bu) a2.n();
            this.m.a(a2.m().n());
            this.m.a(0, C1677rv.b);
            return bu;
        } catch (C0292_s e2) {
            Log.e("FirebaseRemoteConfig", "Fetch failed! Server responded with an error.", e2);
            int a3 = e2.a();
            if (a3 == 429 || a3 == 503 || a3 == 504) {
                int a4 = this.m.h().a() + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = b;
                long millis = timeUnit.toMillis((long) iArr[Math.min(a4, iArr.length) - 1]);
                this.m.a(a4, new Date(date.getTime() + (millis / 2) + ((long) this.j.nextInt((int) millis))));
            }
            int a5 = e2.a();
            String str = a5 != 401 ? a5 != 403 ? a5 != 429 ? a5 != 500 ? (a5 == 503 || a5 == 504) ? "The server is unavailable. Please try again later." : "The server returned an unexpected error." : "There was an internal server error." : "You have reached the throttle limit for your project. Please wait before making more requests." : "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project." : "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            throw new FirebaseRemoteConfigServerException(a5, String.format("Fetch failed: %s", new Object[]{str}));
        } catch (IOException e3) {
            throw new FirebaseRemoteConfigClientException("Fetch failed due to an unexpected error! Check logs for details.", e3);
        }
    }

    public final Wy<C1618pv> a(boolean z) {
        return a(z, this.m.d());
    }

    public final Wy<C1618pv> a(boolean z, long j2) {
        return this.k.c().b(this.h, new C1556nv(this, z, j2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025 A[Catch:{ FirebaseRemoteConfigException -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c A[Catch:{ FirebaseRemoteConfigException -> 0x0038 }] */
    private final Wy<C1618pv> a(Date date) {
        boolean z;
        try {
            Bu b2 = b(date);
            if (b2.n() != null) {
                if (b2.n().equals("NO_CHANGE")) {
                    z = false;
                    if (z) {
                        return Zy.a(C1618pv.a(date));
                    }
                    return this.k.b(a(b2, date)).a(this.h, C1648qv.a);
                }
            }
            z = true;
            if (z) {
            }
        } catch (FirebaseRemoteConfigException e2) {
            return Zy.a((Exception) e2);
        }
    }

    private static String a(Context context, String str) {
        String str2 = "FirebaseRemoteConfig";
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, str);
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            String str3 = "Could not get fingerprint hash for package: ";
            String valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return null;
        } catch (NameNotFoundException e2) {
            String str4 = "No such package: ";
            String valueOf2 = String.valueOf(str);
            Log.e(str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), e2);
            return null;
        }
    }

    private static C1432jv a(Bu bu, Date date) throws FirebaseRemoteConfigClientException {
        try {
            C1494lv d2 = C1432jv.d();
            d2.a(date);
            Map m2 = bu.m();
            if (m2 != null) {
                d2.a(m2);
            }
            List o2 = bu.o();
            if (o2 != null) {
                d2.a(o2);
            }
            return d2.a();
        } catch (JSONException e2) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e2);
        }
    }

    private final Cu a() throws FirebaseRemoteConfigClientException {
        String a2 = this.e.a();
        if (a2 != null) {
            String c2 = this.e.c();
            Cu cu = new Cu();
            cu.b(a2);
            if (c2 != null) {
                cu.c(c2);
            }
            cu.a(this.n);
            Locale locale = this.d.getResources().getConfiguration().locale;
            cu.e(locale.getCountry());
            cu.f(locale.toString());
            cu.h(Integer.toString(VERSION.SDK_INT));
            cu.j(TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0);
                if (packageInfo != null) {
                    cu.d(packageInfo.versionName);
                }
            } catch (NameNotFoundException unused) {
            }
            cu.g(this.d.getPackageName());
            cu.i("17.0.0");
            HashMap hashMap = new HashMap();
            C2102JE je = this.f;
            if (je != null) {
                for (Entry entry : je.a(false).entrySet()) {
                    hashMap.put((String) entry.getKey(), entry.getValue().toString());
                }
            }
            cu.a((Map<String, String>) hashMap);
            return cu;
        }
        throw new FirebaseRemoteConfigClientException("Fetch request could not be created: Firebase instance id is null.");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003b  */
    public final /* synthetic */ Wy a(boolean z, long j2, Wy wy) throws Exception {
        boolean z2;
        Date date = new Date(this.i.currentTimeMillis());
        if (wy.e()) {
            if (!z) {
                Date f2 = this.m.f();
                if (!f2.equals(C1677rv.a)) {
                    z2 = date.before(new Date(f2.getTime() + TimeUnit.SECONDS.toMillis(j2)));
                    if (z2) {
                        return Zy.a(C1618pv.b(date));
                    }
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        Date b2 = this.m.h().b();
        if (!date.before(b2)) {
            b2 = null;
        }
        if (b2 == null) {
            return a(date);
        }
        return Zy.a((Exception) new FirebaseRemoteConfigFetchThrottledException(String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(b2.getTime() - date.getTime()))}), b2.getTime()));
    }
}
