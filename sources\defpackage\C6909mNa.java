package defpackage;

import android.content.Context;

/* renamed from: mNa reason: default package and case insensitive filesystem */
/* compiled from: AdvertisingInfoReflectionStrategy */
class C6909mNa implements C7115pNa {
    private final Context a;

    public C6909mNa(Context context) {
        this.a = context.getApplicationContext();
    }

    private String b() {
        try {
            return (String) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(c(), new Object[0]);
        } catch (Exception unused) {
            C5328TMa.e().w("Fabric", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return null;
        }
    }

    private Object c() {
        try {
            return Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(null, new Object[]{this.a});
        } catch (Exception unused) {
            C5328TMa.e().w("Fabric", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return null;
        }
    }

    private boolean d() {
        try {
            return ((Boolean) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(c(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            C5328TMa.e().w("Fabric", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Context context) {
        try {
            if (((Integer) Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke(null, new Object[]{context})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public C6705jNa a() {
        if (a(this.a)) {
            return new C6705jNa(b(), d());
        }
        return null;
    }
}
