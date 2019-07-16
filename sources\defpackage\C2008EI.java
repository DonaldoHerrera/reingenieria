package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: EI reason: default package and case insensitive filesystem */
/* compiled from: OMAdSessionManager.kt */
final class C2008EI<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C1988DI a;
    final /* synthetic */ View b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;

    C2008EI(C1988DI di, View view, List list, List list2) {
        this.a = di;
        this.b = view;
        this.c = list;
        this.d = list2;
    }

    public final void a(String str) {
        C7471uYa.b(str, "result");
        this.a.b(str, this.b, this.c, this.d);
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        a((String) obj);
        return RVa.a;
    }
}
