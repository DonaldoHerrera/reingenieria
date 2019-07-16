package defpackage;

import java.util.List;

/* renamed from: JU reason: default package and case insensitive filesystem */
/* compiled from: ExperimentConfiguration.kt */
public enum C2118JU {
    COLLECTION_2_EXPERIMENT("android_listening", "collection_2_android", 403, C6918mWa.b((Object[]) r2)),
    b(r18, r19, 410, C6918mWa.b((Object[]) new C2213OU[]{new C2213OU(r10, 1280), new C2213OU(r12, 1281), new C2213OU("75mvideo_3", 1282)})),
    c(r6, r7, 448, C6918mWa.b((Object[]) new C2213OU[]{new C2213OU(r10, 1430), new C2213OU(r12, 1431), new C2213OU("downloads", 1432)}));
    
    private final String e;
    private final String f;
    private final int g;
    private final List<C2213OU> h;

    private C2118JU(String str, String str2, int i, List<C2213OU> list) {
        this.e = str;
        this.f = str2;
        this.g = i;
        this.h = list;
    }

    public int a() {
        return this.g;
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.e;
    }

    public List<C2213OU> d() {
        return this.h;
    }
}
