package defpackage;

import com.facebook.stetho.server.http.HttpStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: jya reason: default package and case insensitive filesystem */
/* compiled from: DatabaseCleanupController.kt */
public final class C6752jya extends a {
    final /* synthetic */ C5680bya b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;
    final /* synthetic */ List e;
    final /* synthetic */ List f;
    final /* synthetic */ List g;

    C6752jya(C5680bya bya, List list, List list2, List list3, List list4, List list5) {
        this.b = bya;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = list5;
    }

    public void b(C5500ZKa zKa) {
        C7471uYa.b(zKa, "propellerDatabase");
        List<List> b2 = C7676xWa.b((Iterable) this.c, (int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        ArrayList<List> arrayList = new ArrayList<>(C6986nWa.a((Iterable<? extends T>) b2, 10));
        for (List a : b2) {
            arrayList.add(this.b.d(a));
        }
        for (List list : arrayList) {
            a(zKa.a((C5116MLa) _ea.PlaylistTracks, C6907mLa.a().b("playlist_id", (Collection<?>) list)));
            a(zKa.a((C5116MLa) e.c, C6907mLa.a().a(e.e, (Object) Integer.valueOf(1)).a(e.d, (Collection<?>) list)));
        }
        List<List> b3 = C7676xWa.b((Iterable) this.d, (int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        ArrayList<List> arrayList2 = new ArrayList<>(C6986nWa.a((Iterable<? extends T>) b3, 10));
        for (List a2 : b3) {
            arrayList2.add(this.b.d(a2));
        }
        for (List a3 : arrayList2) {
            a(zKa.a((C5116MLa) e.c, C6907mLa.a().a(e.e, (Object) Integer.valueOf(0)).a(e.d, (Collection<?>) a3)));
        }
        List<List> b4 = C7676xWa.b((Iterable) this.e, (int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        ArrayList<List> arrayList3 = new ArrayList<>(C6986nWa.a((Iterable<? extends T>) b4, 10));
        for (List a4 : b4) {
            arrayList3.add(this.b.d(a4));
        }
        for (List a5 : arrayList3) {
            a(zKa.a((C5116MLa) f.c, C6907mLa.a().a(f.d, (Collection<?>) a5)));
        }
        this.b.c().a((Iterable<C3508cda>) this.f);
        List<List> b5 = C7676xWa.b((Iterable) this.g, (int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        ArrayList<List> arrayList4 = new ArrayList<>(C6986nWa.a((Iterable<? extends T>) b5, 10));
        for (List a6 : b5) {
            arrayList4.add(this.b.d(a6));
        }
        for (List a7 : arrayList4) {
            a(zKa.a((C5116MLa) h.c, C6907mLa.a().a(h.d, (Collection<?>) a7)));
        }
    }
}
