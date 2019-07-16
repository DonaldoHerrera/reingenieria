package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY = new byte[0];
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0d;
    public static final long DEFAULT_VALUE_FOR_LONG = 0;
    public static final String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = -1;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC = 0;
    private final Executor executor;
    private final Context zzja;
    private final FirebaseApp zzjb;
    private final C2064HE zzjc;
    private final C1278ev zzjd;
    private final C1278ev zzje;
    private final C1278ev zzjf;
    private final C1587ov zzjg;
    private final C1707sv zzjh;
    private final C1677rv zzji;

    FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, C2064HE he, Executor executor2, C1278ev evVar, C1278ev evVar2, C1278ev evVar3, C1587ov ovVar, C1707sv svVar, C1677rv rvVar) {
        this.zzja = context;
        this.zzjb = firebaseApp;
        this.zzjc = he;
        this.executor = executor2;
        this.zzjd = evVar;
        this.zzje = evVar2;
        this.zzjf = evVar3;
        this.zzjg = ovVar;
        this.zzjh = svVar;
        this.zzji = rvVar;
    }

    public static FirebaseRemoteConfig getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final boolean zzc(Wy<C1432jv> wy) {
        if (!wy.e()) {
            return false;
        }
        this.zzjd.a();
        if (wy.b() != null) {
            zza(((C1432jv) wy.b()).c());
        } else {
            Log.e("FirebaseRemoteConfig", "Activated configs are null.");
        }
        return true;
    }

    private final void zzb(Map<String, String> map) {
        try {
            C1494lv d = C1432jv.d();
            d.a(map);
            this.zzjf.a(d.a());
        } catch (JSONException e) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e);
        }
    }

    private final Wy<Void> zzc(Map<String, String> map) {
        try {
            C1494lv d = C1432jv.d();
            d.a(map);
            return this.zzjf.a(d.a(), true).a(zze.zzjk);
        } catch (JSONException e) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e);
            return Zy.a(null);
        }
    }

    public Wy<Boolean> activate() {
        Wy c = this.zzjd.c();
        Wy c2 = this.zzje.c();
        return Zy.a((Wy<?>[]) new Wy[]{c, c2}).b(this.executor, new zzi(this, c, c2));
    }

    @Deprecated
    public boolean activateFetched() {
        C1432jv b = this.zzjd.b();
        if (b == null || !zza(b, this.zzje.b())) {
            return false;
        }
        this.zzje.a(b).a(this.executor, (Ty<? super TResult>) new zzf<Object>(this));
        return true;
    }

    public Wy<FirebaseRemoteConfigInfo> ensureInitialized() {
        Wy c = this.zzje.c();
        Wy c2 = this.zzjf.c();
        Wy c3 = this.zzjd.c();
        Wy a = Zy.a(this.executor, (Callable<TResult>) new zza<TResult>(this));
        return Zy.a((Wy<?>[]) new Wy[]{c, c2, c3, a}).a(this.executor, (Py<TResult, TContinuationResult>) new zzc<TResult,TContinuationResult>(a));
    }

    public Wy<Void> fetch() {
        Wy a = this.zzjg.a(this.zzji.e());
        a.a(this.executor, (Ry<TResult>) new zzh<TResult>(this));
        return a.a(zzk.zzjk);
    }

    public Wy<Boolean> fetchAndActivate() {
        return fetch().a(this.executor, (Vy<TResult, TContinuationResult>) new zzg<TResult,TContinuationResult>(this));
    }

    public Map<String, FirebaseRemoteConfigValue> getAll() {
        return this.zzjh.a();
    }

    public boolean getBoolean(String str) {
        return this.zzjh.a(str);
    }

    @Deprecated
    public byte[] getByteArray(String str) {
        return this.zzjh.b(str);
    }

    public double getDouble(String str) {
        return this.zzjh.c(str);
    }

    public FirebaseRemoteConfigInfo getInfo() {
        return this.zzji.c();
    }

    public Set<String> getKeysByPrefix(String str) {
        return this.zzjh.d(str);
    }

    public long getLong(String str) {
        return this.zzjh.e(str);
    }

    public String getString(String str) {
        return this.zzjh.f(str);
    }

    public FirebaseRemoteConfigValue getValue(String str) {
        return this.zzjh.g(str);
    }

    public Wy<Void> reset() {
        return Zy.a(this.executor, (Callable<TResult>) new zzb<TResult>(this));
    }

    @Deprecated
    public void setConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.zzji.b(firebaseRemoteConfigSettings);
        if (firebaseRemoteConfigSettings.isDeveloperModeEnabled()) {
            Logger.getLogger(C0473at.class.getName()).setLevel(Level.CONFIG);
        }
    }

    public Wy<Void> setConfigSettingsAsync(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return Zy.a(this.executor, (Callable<TResult>) new zzl<TResult>(this, firebaseRemoteConfigSettings));
    }

    public void setDefaults(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        zzb((Map<String, String>) hashMap);
    }

    public Wy<Void> setDefaultsAsync(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        return zzc((Map<String, String>) hashMap);
    }

    /* access modifiers changed from: 0000 */
    public final void zzcm() {
        this.zzje.c();
        this.zzjf.c();
        this.zzjd.c();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Void zzcn() throws Exception {
        this.zzje.a();
        this.zzjd.a();
        this.zzjf.a();
        this.zzji.a();
        return null;
    }

    public static FirebaseRemoteConfig getInstance(FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent) firebaseApp.a(RemoteConfigComponent.class)).get("firebase");
    }

    public Wy<Void> fetch(long j) {
        Wy a = this.zzjg.a(this.zzji.e(), j);
        a.a(this.executor, (Ry<TResult>) new zzj<TResult>(this));
        return a.a(zzm.zzjk);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zzb(Wy wy) {
        String str = "FirebaseRemoteConfig";
        if (wy.e()) {
            this.zzji.a(-1);
            C1432jv a = ((C1618pv) wy.b()).a();
            if (a != null) {
                this.zzji.a(a.b());
            }
            Log.i(str, "Fetch succeeded!");
            return;
        }
        Exception a2 = wy.a();
        if (a2 == null) {
            Log.e(str, "Fetch was cancelled... This should never covfefe");
        } else if (a2 instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.zzji.a(2);
            Log.w(str, "Fetch was throttled!", a2);
        } else {
            this.zzji.a(1);
            Log.e(str, "Fetch failed!", a2);
        }
    }

    public void setDefaults(int i) {
        zzb(C1857xv.a(this.zzja, i));
    }

    public Wy<Void> setDefaultsAsync(int i) {
        return zzc(C1857xv.a(this.zzja, i));
    }

    private final void zza(JSONArray jSONArray) {
        String str = "FirebaseRemoteConfig";
        if (this.zzjc != null) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    HashMap hashMap = new HashMap();
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    Iterator keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String str2 = (String) keys.next();
                        hashMap.put(str2, jSONObject.getString(str2));
                    }
                    arrayList.add(hashMap);
                }
                this.zzjc.a((List<Map<String, String>>) arrayList);
            } catch (JSONException e) {
                Log.e(str, "Could not parse ABT experiments from the JSON response.", e);
            } catch (C2044GE e2) {
                Log.w(str, "Could not update ABT experiments.", e2);
            }
        }
    }

    private static boolean zza(C1432jv jvVar, C1432jv jvVar2) {
        return jvVar2 == null || !jvVar.b().equals(jvVar2.b());
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Void zza(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) throws Exception {
        this.zzji.a(firebaseRemoteConfigSettings);
        if (firebaseRemoteConfigSettings.isDeveloperModeEnabled()) {
            Logger.getLogger(C0473at.class.getName()).setLevel(Level.CONFIG);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Wy zza(Wy wy, Wy wy2, Wy wy3) throws Exception {
        boolean e = wy.e();
        Boolean valueOf = Boolean.valueOf(false);
        if (!e || wy.b() == null) {
            return Zy.a(valueOf);
        }
        C1432jv jvVar = (C1432jv) wy.b();
        if (!wy2.e() || zza(jvVar, (C1432jv) wy2.b())) {
            return this.zzje.a(jvVar, true).a(this.executor, (Py<TResult, TContinuationResult>) new zzd<TResult,TContinuationResult>(this));
        }
        return Zy.a(valueOf);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zza(C1432jv jvVar) {
        this.zzjd.a();
        zza(jvVar.c());
    }
}
