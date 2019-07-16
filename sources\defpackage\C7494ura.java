package defpackage;

import android.view.View;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.F;

/* renamed from: ura reason: default package and case insensitive filesystem */
/* compiled from: PlaylistItemMenuRendererFactory */
class C7494ura {
    private final C7054oVa<a> a;
    private final C7054oVa<C2526g> b;
    private final C7054oVa<F> c;
    private final C7054oVa<C3700b> d;
    private final C7054oVa<C2436_U> e;

    C7494ura(C7054oVa<a> ova, C7054oVa<C2526g> ova2, C7054oVa<F> ova3, C7054oVa<C3700b> ova4, C7054oVa<C2436_U> ova5) {
        a((T) ova, 1);
        this.a = ova;
        a((T) ova2, 2);
        this.b = ova2;
        a((T) ova3, 3);
        this.c = ova3;
        a((T) ova4, 4);
        this.d = ova4;
        a((T) ova5, 5);
        this.e = ova5;
    }

    /* access modifiers changed from: 0000 */
    public C7425tra a(a aVar, View view) {
        a((T) aVar, 1);
        a aVar2 = aVar;
        a((T) view, 2);
        View view2 = view;
        Object obj = this.a.get();
        a((T) obj, 3);
        a aVar3 = (a) obj;
        Object obj2 = this.b.get();
        a((T) obj2, 4);
        C2526g gVar = (C2526g) obj2;
        Object obj3 = this.c.get();
        a((T) obj3, 5);
        F f = (F) obj3;
        Object obj4 = this.d.get();
        a((T) obj4, 6);
        C3700b bVar = (C3700b) obj4;
        Object obj5 = this.e.get();
        a((T) obj5, 7);
        C7425tra tra = new C7425tra(aVar2, view2, aVar3, gVar, f, bVar, (C2436_U) obj5);
        return tra;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
