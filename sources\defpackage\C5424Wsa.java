package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: Wsa reason: default package and case insensitive filesystem */
/* compiled from: UpdateTrackListIntent.kt */
final class C5424Wsa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C4909Fra a;
    final /* synthetic */ C3508cda b;
    final /* synthetic */ C6600hqa c;

    C5424Wsa(C4909Fra fra, C3508cda cda, C6600hqa hqa) {
        this.a = fra;
        this.b = cda;
        this.c = hqa;
    }

    /* renamed from: a */
    public final IPa<a> apply(List<e> list) {
        C7471uYa.b(list, "tracks");
        C4909Fra fra = this.a;
        C3508cda cda = this.b;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (e a2 : list) {
            arrayList.add(a2.a());
        }
        return fra.b(cda, arrayList).b((Callable<? extends T>) new C5395Vsa<Object>(this, list));
    }
}
