package defpackage;

import android.content.ContentValues;
import com.google.common.base.Function;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: Qpa reason: default package and case insensitive filesystem */
/* compiled from: EditPlaylistCommand */
public class C5245Qpa extends C1595pT<a, C6499gLa, Integer> {
    /* access modifiers changed from: private */
    public int b;
    private final C5694cGa c;

    /* renamed from: Qpa$a */
    /* compiled from: EditPlaylistCommand */
    static final class a {
        final C3508cda a;
        final C4928GKa<String> b = C4928GKa.a();
        final C4928GKa<Boolean> c = C4928GKa.a();
        final List<C3508cda> d;

        a(C3508cda cda, List<C3508cda> list) {
            this.a = cda;
            this.d = list;
        }
    }

    protected C5245Qpa(C5500ZKa zKa, C5694cGa cga) {
        super(zKa);
        this.c = cga;
    }

    /* access modifiers changed from: private */
    public ContentValues d() {
        return C5296SKa.b().a("removed_at", this.c.a()).a("position", -1).a();
    }

    /* access modifiers changed from: private */
    public Set<C3508cda> b(C5500ZKa zKa, a aVar) {
        String str = "track_id";
        C5631bLa a2 = zKa.a(String.valueOf(((C6975nLa) C6975nLa.a(_ea.PlaylistTracks).a(str).d("playlist_id", (Object) Long.valueOf(aVar.a.c()))).b(str, (Collection<?>) C2063HD.a(aVar.d, (Function<? super F, ? extends T>) C7350soa.a))), new Object[0]);
        HashSet hashSet = new HashSet(a2.f());
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            hashSet.add(C3508cda.d(((C5326TKa) it.next()).d(str)));
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public C6499gLa a(C5500ZKa zKa, a aVar) {
        return zKa.a((defpackage.C5500ZKa.a) new C5215Ppa(this, aVar));
    }

    /* access modifiers changed from: private */
    public ContentValues a(a aVar) {
        C5296SKa a2 = C5296SKa.b().a(e.M, this.c.a()).a(e.K, aVar.d.size());
        if (aVar.b.c()) {
            a2.a(e.p, (String) aVar.b.b());
        }
        if (aVar.c.c()) {
            a2.a(e.y, (((Boolean) aVar.c.b()).booleanValue() ? C3492ada.PRIVATE : C3492ada.PUBLIC).b());
        }
        return a2.a();
    }

    /* access modifiers changed from: private */
    public ContentValues a(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("position", Integer.valueOf(i));
        contentValues.putNull("removed_at");
        return contentValues;
    }

    /* access modifiers changed from: private */
    public ContentValues a(long j, long j2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("playlist_id", Long.valueOf(j));
        contentValues.put("track_id", Long.valueOf(j2));
        contentValues.put("position", Integer.valueOf(i));
        contentValues.put("added_at", Long.valueOf(this.c.a()));
        return contentValues;
    }

    /* access modifiers changed from: protected */
    public Integer a(C6499gLa gla) {
        return Integer.valueOf(this.b);
    }
}
