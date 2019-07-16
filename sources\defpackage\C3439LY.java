package defpackage;

import com.google.common.base.Predicate;

/* renamed from: LY reason: default package and case insensitive filesystem */
/* compiled from: TrackingInfo.kt */
final class C3439LY<T> implements Predicate<T> {
    final /* synthetic */ C3508cda a;
    final /* synthetic */ b b;
    final /* synthetic */ int c;

    C3439LY(C3508cda cda, b bVar, int i) {
        this.a = cda;
        this.b = bVar;
        this.c = i;
    }

    /* renamed from: a */
    public final boolean apply(C3418EY ey) {
        return (ey != null ? ey.h() : null) != null && C7471uYa.a((Object) this.a, (Object) ey.h());
    }
}
