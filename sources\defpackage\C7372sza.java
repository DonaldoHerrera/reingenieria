package defpackage;

import com.soundcloud.android.collections.data.ga;

/* renamed from: sza reason: default package and case insensitive filesystem */
/* compiled from: LikeCountWriter.kt */
final class C7372sza<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C7441tza a;
    final /* synthetic */ ga b;

    C7372sza(C7441tza tza, ga gaVar) {
        this.a = tza;
        this.b = gaVar;
    }

    /* renamed from: a */
    public final APa<Integer> apply(Integer num) {
        C7471uYa.b(num, "likeCount");
        return this.a.b(num.intValue(), this.b).h(new C7303rza(num));
    }
}
