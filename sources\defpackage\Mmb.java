package defpackage;

import java.util.List;

/* renamed from: Mmb reason: default package */
/* compiled from: VersionRequirement.kt */
public final class Mmb {
    /* access modifiers changed from: private */
    public static final Mmb a = new Mmb(C6918mWa.a());
    public static final a b = new a(null);
    private final List<C7210qmb> c;

    /* renamed from: Mmb$a */
    /* compiled from: VersionRequirement.kt */
    public static final class a {
        private a() {
        }

        public final Mmb a() {
            return Mmb.a;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        public final Mmb a(C7555vmb vmb) {
            C7471uYa.b(vmb, "table");
            if (vmb.j() == 0) {
                return a();
            }
            List k = vmb.k();
            C7471uYa.a((Object) k, "table.requirementList");
            return new Mmb(k, null);
        }
    }

    private Mmb(List<C7210qmb> list) {
        this.c = list;
    }

    public /* synthetic */ Mmb(List list, C7264rYa rya) {
        this(list);
    }

    public final C7210qmb a(int i) {
        return (C7210qmb) C7676xWa.d((List) this.c, i);
    }
}
