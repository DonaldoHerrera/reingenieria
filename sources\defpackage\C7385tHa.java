package defpackage;

import com.crashlytics.android.a;
import com.soundcloud.android.SoundCloudApplication;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: tHa reason: default package and case insensitive filesystem */
/* compiled from: FabricLogger.kt */
public class C7385tHa {
    public void a(Throwable th, Map<String, String> map) {
        C7471uYa.b(th, "t");
        C7471uYa.b(map, "contextValuePairs");
        SDb.a(SoundCloudApplication.a).a(th, "Handling silent exception: ", new Object[0]);
        if (C5328TMa.h()) {
            for (Entry entry : map.entrySet()) {
                a.a((String) entry.getKey(), (String) entry.getValue());
            }
            a.a(th);
        }
    }
}
