package defpackage;

import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.u;
import com.soundcloud.android.playback.Db.a;
import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: hqa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistDetailsMetadataBuilder.kt */
public final class C6600hqa {
    private final C2436_U a;
    private final String b;
    private final PromotedSourceInfo c;
    private final SearchQuerySourceInfo d;

    public C6600hqa(C2436_U _u, String str, PromotedSourceInfo promotedSourceInfo, SearchQuerySourceInfo searchQuerySourceInfo) {
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(str, "screen");
        this.a = _u;
        this.b = str;
        this.c = promotedSourceInfo;
        this.d = searchQuerySourceInfo;
    }

    public final C6532gqa a(C3863rda rda, List<? extends C6185ma> list, boolean z) {
        C3863rda rda2 = rda;
        List<? extends C6185ma> list2 = list;
        C7471uYa.b(rda2, "playlist");
        C7471uYa.b(list2, "trackItems");
        int a2 = a(list2, rda.L());
        long g = list.isEmpty() ? rda.g() : a(list2);
        PlaySessionSource a3 = a(a2, this.c, this.d, rda2);
        boolean z2 = list.size() > 1;
        boolean isEmpty = true ^ list.isEmpty();
        a a4 = a();
        PromotedSourceInfo promotedSourceInfo = this.c;
        SearchQuerySourceInfo searchQuerySourceInfo = this.d;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list2, 10));
        for (C6185ma a5 : list) {
            arrayList.add(u.a(a5.a()));
        }
        a aVar = new a(arrayList, 0, a3);
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) list2, 10));
        for (C6185ma a6 : list) {
            arrayList2.add(a6.a());
        }
        C6532gqa gqa = new C6532gqa(rda, z2, isEmpty, a2, z, a4, g, false, promotedSourceInfo, searchQuerySourceInfo, a3, aVar, new C5664bqa(arrayList2));
        return gqa;
    }

    public final C6532gqa a(C6532gqa gqa, List<? extends C6185ma> list) {
        List<? extends C6185ma> list2 = list;
        C7471uYa.b(gqa, "metadata");
        C7471uYa.b(list2, "trackItems");
        int size = list.size();
        long a2 = a(list2);
        boolean g = gqa.g();
        boolean z = !list.isEmpty();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list2, 10));
        for (C6185ma a3 : list) {
            arrayList.add(u.a(a3.a()));
        }
        a aVar = new a(arrayList, 0, a(list.size(), gqa.m(), gqa.n(), gqa.l()));
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) list2, 10));
        for (C6185ma a4 : list) {
            arrayList2.add(a4.a());
        }
        C5664bqa bqa = r1;
        C5664bqa bqa2 = new C5664bqa(arrayList2);
        return C6532gqa.a(gqa, null, g, z, size, false, null, a2, false, null, null, null, aVar, bqa, 1969, null);
    }

    private final PlaySessionSource a(int i, PromotedSourceInfo promotedSourceInfo, SearchQuerySourceInfo searchQuerySourceInfo, C3863rda rda) {
        PlaySessionSource a2 = PlaySessionSource.a(this.b, rda.a(), rda.e(), i);
        String str = "it";
        if (promotedSourceInfo != null) {
            C7471uYa.a((Object) a2, str);
            a2.a(promotedSourceInfo);
        } else if (searchQuerySourceInfo != null) {
            C7471uYa.a((Object) a2, str);
            a2.a(searchQuerySourceInfo);
        }
        C7471uYa.a((Object) a2, "PlaySessionSource.forPla…o\n            }\n        }");
        return a2;
    }

    private final a a() {
        if (this.a.l()) {
            return a.AVAILABLE;
        }
        if (this.a.b()) {
            return a.UPSELL;
        }
        return a.NONE;
    }

    public final int a(List<? extends C6185ma> list, int i) {
        C7471uYa.b(list, "trackItems");
        return list.isEmpty() ? i : list.size();
    }

    private final long a(List<? extends C6185ma> list) {
        long j = 0;
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                j += ((C6185ma) listIterator.previous()).g();
            }
        }
        return j;
    }
}
