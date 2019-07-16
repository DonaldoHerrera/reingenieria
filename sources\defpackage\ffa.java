package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: ffa reason: default package */
/* compiled from: ApiMultipartRequest */
public class ffa extends hfa {
    private final List<lfa> h;
    private final d i;

    ffa(Uri uri, String str, Boolean bool, C2215PD<String, String> pd, Map<String, String> map, List<lfa> list, d dVar, boolean z, a aVar) {
        super(uri, str, bool.booleanValue(), pd, map, z, aVar);
        this.h = list;
        this.i = dVar;
    }

    public List<lfa> h() {
        return this.h;
    }

    public d i() {
        return this.i;
    }

    public boolean j() {
        return this.i != null;
    }
}
