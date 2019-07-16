package defpackage;

import android.content.ContentValues;
import java.util.List;

/* renamed from: Ssa reason: default package and case insensitive filesystem */
/* compiled from: RemoveTrackFromPlaylistCommand */
public class C5308Ssa extends C1595pT<b, C6499gLa, Integer> {
    private int b;

    /* renamed from: Ssa$a */
    /* compiled from: RemoveTrackFromPlaylistCommand */
    private static final class a extends C4991ILa<C3508cda> {
        private a() {
        }

        /* synthetic */ a(C5278Rsa rsa) {
            this();
        }

        public C3508cda a(C5326TKa tKa) {
            return C3508cda.d(tKa.d("track_id"));
        }
    }

    /* renamed from: Ssa$b */
    /* compiled from: RemoveTrackFromPlaylistCommand */
    static final class b {
        final C3508cda a;
        final C3508cda b;

        b(C3508cda cda, C3508cda cda2) {
            this.a = cda;
            this.b = cda2;
        }
    }

    C5308Ssa(C5500ZKa zKa) {
        super(zKa);
    }

    /* access modifiers changed from: protected */
    public C6499gLa a(C5500ZKa zKa, b bVar) {
        List b2 = zKa.a(a(bVar.a)).b(new a(null));
        b2.remove(bVar.b);
        this.b = b2.size();
        return zKa.a((defpackage.C5500ZKa.a) new C5278Rsa(this, bVar, b2));
    }

    /* access modifiers changed from: private */
    public ContentValues a(C3508cda cda, C3508cda cda2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("playlist_id", Long.valueOf(cda.c()));
        contentValues.put("track_id", Long.valueOf(cda2.c()));
        contentValues.put("position", Integer.valueOf(i));
        return contentValues;
    }

    /* access modifiers changed from: private */
    public ContentValues a(C3508cda cda, C3508cda cda2) {
        C5296SKa a2 = C5296SKa.b().a("playlist_id", cda.c());
        long c = cda2.c();
        return a2.a("track_id", c).a("removed_at", System.currentTimeMillis()).a();
    }

    private C6975nLa a(C3508cda cda) {
        return ((C6975nLa) ((C6975nLa) C6975nLa.a(_ea.PlaylistTracks.name()).a("track_id").d(_ea.PlaylistTracks.a("playlist_id"), (Object) Long.valueOf(cda.c()))).a(_ea.PlaylistTracks.a("removed_at"))).a(_ea.PlaylistTracks.a("position"), defpackage.C6975nLa.b.ASC);
    }

    /* access modifiers changed from: protected */
    public Integer a(C6499gLa gla) {
        return Integer.valueOf(this.b);
    }
}
