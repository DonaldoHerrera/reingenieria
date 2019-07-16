package defpackage;

/* renamed from: yna reason: default package and case insensitive filesystem */
/* compiled from: FadeHelper.kt */
final class C4722yna<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Ana a;

    C4722yna(Ana ana) {
        this.a = ana;
    }

    public final float a(Long l) {
        C7471uYa.b(l, "step");
        float max = Math.max(0.0f, Math.min(1.0f, ((float) ((l.longValue() * 10) + Math.max(0, this.a.c()))) / ((float) this.a.a())));
        float d = this.a.d();
        float b = this.a.b();
        return (d >= b ? Ena.ACCELERATE : Ena.DECELERATE).a(max, d, b);
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Float.valueOf(a((Long) obj));
    }
}
