package defpackage;

import androidx.fragment.app.FragmentActivity;

/* renamed from: Twa reason: default package and case insensitive filesystem */
/* compiled from: InstagramStoriesApi.kt */
final class C5341Twa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C5252Qwa a;
    final /* synthetic */ FragmentActivity b;

    C5341Twa(C5252Qwa qwa, FragmentActivity fragmentActivity) {
        this.a = qwa;
        this.b = fragmentActivity;
    }

    /* renamed from: a */
    public final IPa<d> apply(C3509cea cea) {
        C7471uYa.b(cea, "track");
        return this.a.c().a(this.b, cea.w(), cea.f()).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5312Swa<Object,Object>(this, cea));
    }
}
