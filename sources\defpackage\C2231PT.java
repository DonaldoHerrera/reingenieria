package defpackage;

/* renamed from: PT reason: default package and case insensitive filesystem */
/* compiled from: ConfigurationFeatureController.kt */
final class C2231PT<T> implements C6776kQa<Boolean> {
    final /* synthetic */ C2250QT a;

    C2231PT(C2250QT qt) {
        this.a = qt;
    }

    /* renamed from: a */
    public final void accept(Boolean bool) {
        C7471uYa.a((Object) bool, "enabled");
        if (bool.booleanValue()) {
            this.a.b.f();
        } else {
            this.a.b.a();
        }
    }
}
