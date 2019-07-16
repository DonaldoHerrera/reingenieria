package com.soundcloud.android.comments;

import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PlayerCommentOperations.kt */
final class Sa extends C7540vYa implements C6376eYa<Map<C3508cda, ? extends C6185ma>, Map<C3508cda, ? extends C4954HFa>, Map<C3508cda, ? extends C3863rda>, Set<? extends C3799jda>> {
    final /* synthetic */ Collection a;

    Sa(Collection collection) {
        this.a = collection;
        super(3);
    }

    public final Set<C3799jda> a(Map<C3508cda, ? extends C6185ma> map, Map<C3508cda, C4954HFa> map2, Map<C3508cda, ? extends C3863rda> map3) {
        C3799jda jda;
        C7471uYa.b(map, "<anonymous parameter 0>");
        C7471uYa.b(map2, "users");
        C7471uYa.b(map3, "<anonymous parameter 2>");
        Collection<C3791ida> collection = this.a;
        C7471uYa.a((Object) collection, "it");
        ArrayList arrayList = new ArrayList();
        for (C3791ida ida : collection) {
            C4954HFa hFa = (C4954HFa) map2.get(ida.b());
            if (hFa != null) {
                C7471uYa.a((Object) ida, "comment");
                jda = new C3799jda(ida, hFa.d);
            } else {
                jda = null;
            }
            if (jda != null) {
                arrayList.add(jda);
            }
        }
        return C7676xWa.t(arrayList);
    }
}
