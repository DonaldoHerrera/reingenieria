package defpackage;

import com.soundcloud.android.collections.data.C2852h;
import com.soundcloud.android.collections.data.C2862s;
import java.util.List;
import java.util.Set;

/* renamed from: HS reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistOperations.kt */
final class C2078HS<T1, T2, R> implements C6504gQa<List<? extends C7843zta>, List<? extends C2862s>, Set<? extends C2852h>> {
    public static final C2078HS a = new C2078HS();

    C2078HS() {
    }

    /* renamed from: a */
    public final Set<C2852h> apply(List<C7843zta> list, List<C2862s> list2) {
        C7471uYa.b(list, "postedPlaylists");
        C7471uYa.b(list2, "likedPlaylists");
        return C7676xWa.d((Iterable) list, (Iterable) list2);
    }
}
