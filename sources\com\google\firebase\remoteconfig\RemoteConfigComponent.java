package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@KeepForSdk
public class RemoteConfigComponent {
    private static final ExecutorService zzju = Executors.newCachedThreadPool();
    private static final Clock zzjv = DefaultClock.getInstance();
    private static final Random zzjw = new Random();
    private final String appId;
    private String zzg;
    private final Context zzja;
    private final FirebaseApp zzjb;
    private final C2064HE zzjc;
    private final Map<String, FirebaseRemoteConfig> zzjx;
    private final FirebaseInstanceId zzjy;
    private final C2102JE zzjz;
    private Map<String, String> zzka;

    RemoteConfigComponent(Context context, FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, C2064HE he, C2102JE je) {
        this(context, zzju, firebaseApp, firebaseInstanceId, he, je, new Av(context, firebaseApp.d().b()));
    }

    private final synchronized FirebaseRemoteConfig zza(FirebaseApp firebaseApp, String str, C2064HE he, Executor executor, C1278ev evVar, C1278ev evVar2, C1278ev evVar3, C1587ov ovVar, C1707sv svVar, C1677rv rvVar) {
        FirebaseRemoteConfig firebaseRemoteConfig;
        String str2 = str;
        synchronized (this) {
            if (!this.zzjx.containsKey(str2)) {
                FirebaseRemoteConfig firebaseRemoteConfig2 = new FirebaseRemoteConfig(this.zzja, firebaseApp, str2.equals("firebase") ? he : null, executor, evVar, evVar2, evVar3, ovVar, svVar, rvVar);
                firebaseRemoteConfig2.zzcm();
                this.zzjx.put(str2, firebaseRemoteConfig2);
            }
            firebaseRemoteConfig = (FirebaseRemoteConfig) this.zzjx.get(str2);
        }
        return firebaseRemoteConfig;
    }

    private final C1278ev zzd(String str, String str2) {
        return zza(this.zzja, this.appId, str, str2);
    }

    @KeepForSdk
    public synchronized FirebaseRemoteConfig get(String str) {
        FirebaseRemoteConfig zza;
        String str2 = str;
        synchronized (this) {
            C1278ev zzd = zzd(str2, "fetch");
            C1278ev zzd2 = zzd(str2, "activate");
            C1278ev zzd3 = zzd(str2, "defaults");
            C1677rv rvVar = new C1677rv(this.zzja.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", this.appId, str2, "settings"}), 0));
            FirebaseApp firebaseApp = this.zzjb;
            C2064HE he = this.zzjc;
            ExecutorService executorService = zzju;
            Context context = this.zzja;
            String b = this.zzjb.d().b();
            FirebaseInstanceId firebaseInstanceId = this.zzjy;
            C1587ov ovVar = new C1587ov(context, b, firebaseInstanceId, this.zzjz, str, zzju, zzjv, zzjw, zzd, zza(this.zzjb.d().a(), rvVar), rvVar);
            zza = zza(firebaseApp, str, he, executorService, zzd, zzd2, zzd3, ovVar, new C1707sv(zzd2, zzd3), rvVar);
        }
        return zza;
    }

    private RemoteConfigComponent(Context context, Executor executor, FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, C2064HE he, C2102JE je, Av av) {
        this.zzjx = new HashMap();
        this.zzka = new HashMap();
        this.zzg = "https://firebaseremoteconfig.googleapis.com/";
        this.zzja = context;
        this.zzjb = firebaseApp;
        this.zzjy = firebaseInstanceId;
        this.zzjc = he;
        this.zzjz = je;
        this.appId = firebaseApp.d().b();
        Zy.a(executor, (Callable<TResult>) new zzo<TResult>(this));
        av.getClass();
        Zy.a(executor, zzq.zza(av));
    }

    public static C1278ev zza(Context context, String str, String str2, String str3) {
        return C1278ev.a(zzju, C1737tv.a(context, String.format("%s_%s_%s_%s.json", new Object[]{"frc", str, str2, str3})));
    }

    private final C1736tu zza(String str, C1677rv rvVar) {
        C1736tu a;
        Au au = new Au(str);
        synchronized (this) {
            a = ((C1706su) new C1706su(new C1523mt(), At.a(), new zzp(this, rvVar)).a(this.zzg)).a(au).a();
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zza(C1677rv rvVar, C0274Ws ws) throws IOException {
        ws.a((int) TimeUnit.SECONDS.toMillis(rvVar.b()));
        ws.b((int) TimeUnit.SECONDS.toMillis(5));
        synchronized (this) {
            for (Entry entry : this.zzka.entrySet()) {
                ws.j().a((String) entry.getKey(), entry.getValue());
            }
        }
    }
}
