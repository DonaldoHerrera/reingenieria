package defpackage;

/* renamed from: Abb reason: default package and case insensitive filesystem */
/* compiled from: ReflectKotlinClassFinder.kt */
public final class C4748Abb {
    /* access modifiers changed from: private */
    public static final String b(C7280rnb rnb) {
        String a = rnb.e().a();
        C7471uYa.a((Object) a, "relativeClassName.asString()");
        String a2 = Cxb.a(a, '.', '$', false, 4, (Object) null);
        C7349snb d = rnb.d();
        C7471uYa.a((Object) d, "packageFqName");
        if (d.b()) {
            return a2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(rnb.d());
        sb.append('.');
        sb.append(a2);
        return sb.toString();
    }
}
