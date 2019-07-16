package defpackage;

/* renamed from: nqb reason: default package and case insensitive filesystem */
/* compiled from: DescriptorUtils.kt */
public final class C7010nqb extends a<C4935Gcb, C4935Gcb> {
    final /* synthetic */ GYa a;
    final /* synthetic */ _Xa b;

    C7010nqb(GYa gYa, _Xa _xa) {
        this.a = gYa;
        this.b = _xa;
    }

    public boolean b(C4935Gcb gcb) {
        C7471uYa.b(gcb, "current");
        return ((C4935Gcb) this.a.a) == null;
    }

    public void a(C4935Gcb gcb) {
        C7471uYa.b(gcb, "current");
        if (((C4935Gcb) this.a.a) == null && ((Boolean) this.b.invoke(gcb)).booleanValue()) {
            this.a.a = gcb;
        }
    }

    public C4935Gcb a() {
        return (C4935Gcb) this.a.a;
    }
}
