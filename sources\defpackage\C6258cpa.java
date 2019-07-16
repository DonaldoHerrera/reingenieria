package defpackage;

import java.util.List;

/* renamed from: cpa reason: default package and case insensitive filesystem */
/* compiled from: DataSourceProvider.kt */
final class C6258cpa<T1, T2, T3, R> implements C6844lQa<C3863rda, c, List<? extends C3863rda>, C6464fqa> {
    final /* synthetic */ boolean a;

    C6258cpa(boolean z) {
        this.a = z;
    }

    public final C6464fqa a(C3863rda rda, c cVar, List<? extends C3863rda> list) {
        C7471uYa.b(rda, "playlist");
        C7471uYa.b(cVar, "tracksResponse");
        C7471uYa.b(list, "otherPlaylists");
        List b = cVar.b();
        boolean z = this.a;
        List<? extends C3863rda> list2 = cVar.b().isEmpty() ? null : list;
        Exception a2 = cVar.a();
        C6464fqa fqa = new C6464fqa(rda, b, z, list2, a2 != null ? C7594wJa.a(a2) : null);
        return fqa;
    }
}
