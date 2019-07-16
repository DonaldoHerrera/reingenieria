package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: gfa reason: default package */
/* compiled from: ApiObjectContentRequest */
public class gfa extends hfa {
    private final Object h;

    gfa(Uri uri, String str, Boolean bool, C2215PD<String, String> pd, Map<String, String> map, Object obj, boolean z, a aVar) {
        super(uri, str, bool.booleanValue(), pd, map, z, aVar);
        this.h = obj;
    }

    public Object h() {
        return this.h;
    }

    public String i() {
        return b();
    }
}
