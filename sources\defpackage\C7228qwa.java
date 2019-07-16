package defpackage;

import java.util.List;

/* renamed from: qwa reason: default package and case insensitive filesystem */
/* compiled from: SearchSuggestionFiltering */
public class C7228qwa {
    C7228qwa() {
    }

    static /* synthetic */ boolean b(C7780ywa ywa) {
        return ywa.f() == b.TrackItem;
    }

    static /* synthetic */ boolean c(C7780ywa ywa) {
        return ywa.f() == b.PlaylistItem;
    }

    /* access modifiers changed from: 0000 */
    public List<C7780ywa> a(List<C7780ywa> list) {
        return a(C2063HD.a(C1943BD.a(C1943BD.b(list, C6882lva.a), C1943BD.b(list, C6814kva.a), C1943BD.b(list, C6746jva.a))), 3);
    }

    static /* synthetic */ boolean a(C7780ywa ywa) {
        return ywa.f() == b.UserItem;
    }

    private List<C7780ywa> a(List<C7780ywa> list, int i) {
        return list.subList(0, Math.min(i, list.size()));
    }
}
