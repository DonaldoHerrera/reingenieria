package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: hi reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1358hi extends HashMap<String, Object> {
    final /* synthetic */ C1388ii a;

    C1358hi(C1388ii iiVar) {
        this.a = iiVar;
        put("app_identifier", this.a.a);
        put("api_key", this.a.f.p.a);
        put("version_code", this.a.b);
        put("version_name", this.a.c);
        put("install_uuid", this.a.d);
        put("delivery_mechanism", Integer.valueOf(this.a.e));
        put("unity_version", TextUtils.isEmpty(this.a.f.w) ? "" : this.a.f.w);
    }
}
