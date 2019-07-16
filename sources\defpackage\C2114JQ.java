package defpackage;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.m;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: JQ reason: default package and case insensitive filesystem */
/* compiled from: AppFeaturesProvider.kt */
public class C2114JQ implements a {
    private final String a = "android_";
    private final String b = "api_";
    private final long c = TimeUnit.HOURS.toSeconds(4);
    private String d;
    private final DateFormat e;
    /* access modifiers changed from: private */
    public final FirebaseRemoteConfig f;
    private final SharedPreferences g;
    private final C6699jHa h;

    public C2114JQ(FirebaseRemoteConfig firebaseRemoteConfig, @a SharedPreferences sharedPreferences, C6699jHa jha) {
        C7471uYa.b(firebaseRemoteConfig, "firebaseRemoteConfig");
        C7471uYa.b(sharedPreferences, "appFeaturesPrefs");
        C7471uYa.b(jha, "deviceHelper");
        this.f = firebaseRemoteConfig;
        this.g = sharedPreferences;
        this.h = jha;
        DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
        dateTimeInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.e = dateTimeInstance;
        List<a> a2 = m.c.a();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a2, 10));
        for (a aVar : a2) {
            arrayList.add(NVa.a(aVar.e(), aVar.a()));
        }
        Map a3 = LWa.a((Iterable) arrayList);
        List<c> b2 = m.c.b();
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) b2, 10));
        for (c cVar : b2) {
            arrayList2.add(NVa.a(cVar.e(), ((Enum) cVar.a()).name()));
        }
        this.f.setDefaults(LWa.a(a3, LWa.a((Iterable) arrayList2)));
    }

    public Map<String, String> b() {
        Set<String> keysByPrefix = this.f.getKeysByPrefix(this.b);
        C7471uYa.a((Object) keysByPrefix, "firebaseRemoteConfig.get…fix(keyApiFeaturesPrefix)");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) keysByPrefix, 10));
        for (String str : keysByPrefix) {
            arrayList.add(NVa.a(str, this.f.getString(str)));
        }
        return LWa.a((Iterable) arrayList);
    }

    public void c() {
        StringBuilder sb = new StringBuilder();
        sb.append("Active Remote Config : ");
        FirebaseRemoteConfigInfo info = this.f.getInfo();
        C7471uYa.a((Object) info, "firebaseRemoteConfig.info");
        sb.append(a(info));
        this.d = sb.toString();
        SDb.c("Firebase active remote config: %s", this.d);
        Set<String> keysByPrefix = this.f.getKeysByPrefix(this.a);
        C7471uYa.a((Object) keysByPrefix, "firebaseRemoteConfig.getKeysByPrefix(keyPrefix)");
        for (String str : keysByPrefix) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Remote config [ ");
            sb2.append(str);
            sb2.append(" : ");
            sb2.append(this.f.getString(str));
            sb2.append(" ]");
            SDb.a(sb2.toString(), new Object[0]);
        }
    }

    public String d() {
        String str = this.d;
        return str != null ? str : "nothing activated yet";
    }

    public IPa<IVa<RVa>> e() {
        return a(this.c);
    }

    public void f() {
        String str;
        SDb.a("*** Current Configuration ***", new Object[0]);
        Iterator it = m.c.b().iterator();
        while (true) {
            str = " : ";
            if (!it.hasNext()) {
                break;
            }
            c cVar = (c) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append("Variant ");
            sb.append(cVar.c());
            sb.append(str);
            sb.append(cVar.a(this.f, this.g, this.h));
            SDb.a(sb.toString(), new Object[0]);
        }
        for (a aVar : m.c.a()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Flag ");
            sb2.append(aVar.c());
            sb2.append(str);
            sb2.append(aVar.a(this.f, this.g, this.h).booleanValue());
            SDb.a(sb2.toString(), new Object[0]);
        }
    }

    private String a(FirebaseRemoteConfigInfo firebaseRemoteConfigInfo) {
        int lastFetchStatus = firebaseRemoteConfigInfo.getLastFetchStatus();
        if (lastFetchStatus == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("last fetch success at ");
            sb.append(this.e.format(Long.valueOf(firebaseRemoteConfigInfo.getFetchTimeMillis())));
            return sb.toString();
        } else if (lastFetchStatus == 0) {
            return "not fetched yet";
        } else {
            if (lastFetchStatus == 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("last fetch failed, last success at ");
                sb2.append(this.e.format(Long.valueOf(firebaseRemoteConfigInfo.getFetchTimeMillis())));
                return sb2.toString();
            } else if (lastFetchStatus != 2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("last fetch unknown, last success at ");
                sb3.append(this.e.format(Long.valueOf(firebaseRemoteConfigInfo.getFetchTimeMillis())));
                return sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("last fetch throttled, last success at ");
                sb4.append(this.e.format(Long.valueOf(firebaseRemoteConfigInfo.getFetchTimeMillis())));
                return sb4.toString();
            }
        }
    }

    private <T> T b(C3821mba<T> mba) {
        try {
            return mba.a(this.f, this.g, this.h);
        } catch (Exception e2) {
            SDb.a(e2, "Unable to extract value from flag", new Object[0]);
            return mba.a();
        }
    }

    public IPa<IVa<RVa>> a() {
        return a(0);
    }

    public IPa<IVa<RVa>> a(long j) {
        IPa<IVa<RVa>> a2 = IPa.a((LPa<T>) new C2095IQ<T>(this, j));
        C7471uYa.a((Object) a2, "Single.create { emitter …              }\n        }");
        return a2;
    }

    public <T> T a(C3821mba<T> mba) {
        C7471uYa.b(mba, "feature");
        return b(mba);
    }

    public boolean a(a aVar) {
        C7471uYa.b(aVar, "feature");
        return ((Boolean) a((C3821mba<T>) aVar)).booleanValue();
    }
}
