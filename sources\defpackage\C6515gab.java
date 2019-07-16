package defpackage;

/* renamed from: gab reason: default package and case insensitive filesystem */
/* compiled from: KPackageImpl.kt */
final class C6515gab extends C7540vYa implements PXa<Class<?>> {
    final /* synthetic */ a a;

    C6515gab(a aVar) {
        this.a = aVar;
        super(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    public final Class<?> d() {
        String str;
        String str2;
        C7751ybb a2 = this.a.f();
        if (a2 != null) {
            Rkb a3 = a2.a();
            if (a3 != null) {
                str = a3.e();
                str2 = str;
                if (str2 != null) {
                    if (str2.length() > 0) {
                        return C6583hab.this.a().getClassLoader().loadClass(Cxb.a(str2, '/', '.', false, 4, (Object) null));
                    }
                }
                return C6583hab.this.a();
            }
        }
        str = null;
        str2 = str;
        if (str2 != null) {
        }
        return C6583hab.this.a();
    }
}
