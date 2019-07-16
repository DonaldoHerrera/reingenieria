package defpackage;

import com.soundcloud.android.collections.data.C2852h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: JS reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistOperations.kt */
final class C2116JS<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C1938AS a;
    final /* synthetic */ C3871sda b;

    C2116JS(C1938AS as, C3871sda sda) {
        this.a = as;
        this.b = sda;
    }

    /* renamed from: a */
    public final APa<List<C3863rda>> apply(Set<? extends C2852h> set) {
        C7471uYa.b(set, "postsAndLikes");
        C4785Bra a2 = this.a.e;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) set, 10));
        for (C2852h a3 : set) {
            arrayList.add(a3.a());
        }
        return a2.a((Collection<C3508cda>) arrayList, true).h(new C2097IS(this, set));
    }
}
