package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: Oob reason: default package */
/* compiled from: DescriptorRenderer.kt */
public enum Oob {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true);
    
    public static final Set<Oob> n = null;
    public static final Set<Oob> o = null;
    public static final a p = null;
    private final boolean q;

    /* renamed from: Oob$a */
    /* compiled from: DescriptorRenderer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    static {
        int i;
        p = new a(null);
        Oob[] values = values();
        ArrayList arrayList = new ArrayList();
        for (Oob oob : values) {
            if (oob.q) {
                arrayList.add(oob);
            }
        }
        n = C7676xWa.t(arrayList);
        o = C6578hWa.l(values());
    }

    private Oob(boolean z) {
        this.q = z;
    }
}
