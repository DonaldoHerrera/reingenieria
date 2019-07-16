package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;

/* renamed from: lNa reason: default package and case insensitive filesystem */
/* compiled from: AdvertisingInfoProvider */
class C6841lNa {
    private final Context a;
    private final C5057KOa b;

    public C6841lNa(Context context) {
        this.a = context.getApplicationContext();
        this.b = new C5088LOa(context, "TwitterAdvertisingInfoPreferences");
    }

    private void b(C6705jNa jna) {
        new Thread(new C6773kNa(this, jna)).start();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public void c(C6705jNa jna) {
        String str = "limit_ad_tracking_enabled";
        String str2 = "advertising_id";
        if (a(jna)) {
            C5057KOa kOa = this.b;
            kOa.a(kOa.edit().putString(str2, jna.a).putBoolean(str, jna.b));
            return;
        }
        C5057KOa kOa2 = this.b;
        kOa2.a(kOa2.edit().remove(str2).remove(str));
    }

    /* access modifiers changed from: private */
    public C6705jNa e() {
        C6705jNa a2 = c().a();
        String str = "Fabric";
        if (!a(a2)) {
            a2 = d().a();
            if (!a(a2)) {
                C5328TMa.e().d(str, "AdvertisingInfo not present");
            } else {
                C5328TMa.e().d(str, "Using AdvertisingInfo from Service Provider");
            }
        } else {
            C5328TMa.e().d(str, "Using AdvertisingInfo from Reflection Provider");
        }
        return a2;
    }

    public C7115pNa d() {
        return new C7046oNa(this.a);
    }

    public C6705jNa a() {
        C6705jNa b2 = b();
        if (a(b2)) {
            C5328TMa.e().d("Fabric", "Using AdvertisingInfo from Preference Store");
            b(b2);
            return b2;
        }
        C6705jNa e = e();
        c(e);
        return e;
    }

    /* access modifiers changed from: protected */
    public C6705jNa b() {
        return new C6705jNa(this.b.get().getString("advertising_id", ""), this.b.get().getBoolean("limit_ad_tracking_enabled", false));
    }

    private boolean a(C6705jNa jna) {
        return jna != null && !TextUtils.isEmpty(jna.a);
    }

    public C7115pNa c() {
        return new C6909mNa(this.a);
    }
}
