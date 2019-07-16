package defpackage;

/* renamed from: YN reason: default package and case insensitive filesystem */
/* compiled from: MobilePlaySessionAnalyticsProvider.kt */
final class C2392YN<T> implements C6776kQa<jfa> {
    public static final C2392YN a = new C2392YN();

    C2392YN() {
    }

    /* renamed from: a */
    public final void accept(jfa jfa) {
        b a2 = SDb.a("MobilePlay");
        StringBuilder sb = new StringBuilder();
        sb.append("Successfully reported MobilePlay (");
        C7471uYa.a((Object) jfa, "it");
        sb.append(jfa.d());
        sb.append(')');
        a2.d(sb.toString(), new Object[0]);
    }
}
