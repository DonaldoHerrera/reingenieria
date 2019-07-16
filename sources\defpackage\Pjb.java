package defpackage;

import java.util.List;

/* renamed from: Pjb reason: default package */
/* compiled from: predefinedEnhancementInfo.kt */
public final class Pjb {
    private final C6457fkb a;
    private final List<C6457fkb> b;

    public Pjb() {
        this(null, null, 3, null);
    }

    public Pjb(C6457fkb fkb, List<C6457fkb> list) {
        C7471uYa.b(list, "parametersInfo");
        this.a = fkb;
        this.b = list;
    }

    public final List<C6457fkb> a() {
        return this.b;
    }

    public final C6457fkb b() {
        return this.a;
    }

    public /* synthetic */ Pjb(C6457fkb fkb, List list, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            fkb = null;
        }
        if ((i & 2) != 0) {
            list = C6918mWa.a();
        }
        this(fkb, list);
    }
}
