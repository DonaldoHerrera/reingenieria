package defpackage;

import java.util.List;

/* renamed from: VFa reason: default package and case insensitive filesystem */
/* compiled from: UserProfileInfo.kt */
public final class C5379VFa {
    private final List<C4892FFa> a;
    private final String b;
    private final C3784hea c;

    public C5379VFa(List<? extends C4892FFa> list, String str, C3784hea hea) {
        C7471uYa.b(list, "socialMediaLinks");
        C7471uYa.b(hea, "user");
        this.a = list;
        this.b = str;
        this.c = hea;
    }

    public final String a() {
        return this.b;
    }

    public final List<C4892FFa> b() {
        return this.a;
    }

    public final C3784hea c() {
        return this.c;
    }
}
