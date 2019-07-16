package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: Zi reason: default package */
/* compiled from: ManifestUnityVersionProvider */
class Zi implements C1755uj {
    private final Context a;
    private final String b;

    public Zi(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public String a() {
        try {
            Bundle bundle = this.a.getPackageManager().getApplicationInfo(this.b, 128).metaData;
            if (bundle != null) {
                return bundle.getString("io.fabric.unity.crashlytics.version");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
