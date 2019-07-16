package defpackage;

import java.util.Map;

/* renamed from: kbb reason: default package and case insensitive filesystem */
/* compiled from: AnnotationConstructorCaller.kt */
final class C6788kbb extends C7540vYa implements PXa<String> {
    final /* synthetic */ Class a;
    final /* synthetic */ Map b;

    C6788kbb(Class cls, Map map) {
        this.a = cls;
        this.b = map;
        super(0);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append(this.a.getCanonicalName());
        StringBuilder sb2 = sb;
        C7676xWa.a(this.b.entrySet(), sb2, ", ", "(", ")", 0, null, C6720jbb.a, 48, null);
        String sb3 = sb.toString();
        C7471uYa.a((Object) sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
