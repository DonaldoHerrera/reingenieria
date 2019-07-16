package defpackage;

import com.soundcloud.android.collections.data.ga;

/* renamed from: pza reason: default package and case insensitive filesystem */
/* compiled from: LikeCountWriter.kt */
final class C7165pza<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C7441tza a;
    final /* synthetic */ ga b;

    C7165pza(C7441tza tza, ga gaVar) {
        this.a = tza;
        this.b = gaVar;
    }

    public final int a(C5631bLa bla) {
        C7471uYa.b(bla, "it");
        C7441tza tza = this.a;
        Integer a2 = tza.a(bla);
        C7471uYa.a((Object) a2, "parseLikesCount(it)");
        return tza.a(a2.intValue(), this.b);
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Integer.valueOf(a((C5631bLa) obj));
    }
}
