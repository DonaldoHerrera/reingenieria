package defpackage;

import android.os.Build.VERSION;
import java.util.HashMap;

/* renamed from: ki reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1450ki extends HashMap<String, Object> {
    final /* synthetic */ C1481li a;

    C1450ki(C1481li liVar) {
        this.a = liVar;
        put("version", VERSION.RELEASE);
        put("build_version", VERSION.CODENAME);
        put("is_rooted", Boolean.valueOf(this.a.a));
    }
}
