package defpackage;

import android.database.Cursor;
import com.soundcloud.android.foundation.playqueue.o;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.foundation.playqueue.t;
import com.soundcloud.android.foundation.playqueue.v;
import com.soundcloud.android.playback.C4346nb.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: pca reason: default package and case insensitive filesystem */
/* compiled from: PlayQueueStorage */
public class C3846pca {
    private final C3758eca a;

    /* renamed from: pca$a */
    /* compiled from: PlayQueueStorage */
    private class a implements C6772kMa<t> {
        private Set<C3508cda> a;

        a(Set<C3508cda> set) {
            this.a = set;
        }

        private com.soundcloud.android.foundation.playqueue.v.a b(Cursor cursor) {
            String string = cursor.getString(cursor.getColumnIndex("context_type"));
            if (string != null) {
                C4928GKa a2 = com.soundcloud.android.foundation.playqueue.v.a.a(string);
                if (a2.c()) {
                    return (com.soundcloud.android.foundation.playqueue.v.a) a2.b();
                }
                b a3 = SDb.a("PlayQueueStorage");
                StringBuilder sb = new StringBuilder();
                sb.append("Loading unknown playback context from database: ");
                sb.append(string);
                a3.a(4, sb.toString(), new Object[0]);
            }
            return com.soundcloud.android.foundation.playqueue.v.a.OTHER;
        }

        private C4928GKa<String> c(Cursor cursor) {
            String string = cursor.getString(cursor.getColumnIndex("context_query"));
            return string == null ? C4928GKa.a() : C4928GKa.c(string);
        }

        private C4928GKa<C3508cda> d(Cursor cursor) {
            String string = cursor.getString(cursor.getColumnIndex("context_urn"));
            return string == null ? C4928GKa.a() : C4928GKa.c(new C3508cda(string));
        }

        private C3508cda e(Cursor cursor) {
            String string = cursor.getString(cursor.getColumnIndex("query_urn"));
            return string == null ? C3508cda.a : new C3508cda(string);
        }

        private C3508cda f(Cursor cursor) {
            String string = cursor.getString(cursor.getColumnIndex("related_entity"));
            return string == null ? C3508cda.a : new C3508cda(string);
        }

        private C3508cda g(Cursor cursor) {
            int i = cursor.getInt(cursor.getColumnIndex("reposter_id"));
            return i > 0 ? C3508cda.f((long) i) : C3508cda.a;
        }

        private C3508cda h(Cursor cursor) {
            String string = cursor.getString(cursor.getColumnIndex("source_urn"));
            return string == null ? C3508cda.a : new C3508cda(string);
        }

        public t a(Cursor cursor) {
            C3508cda f = f(cursor);
            C3508cda g = g(cursor);
            C3508cda e = e(cursor);
            C3508cda h = h(cursor);
            String string = cursor.getString(cursor.getColumnIndex("source"));
            String string2 = cursor.getString(cursor.getColumnIndex("source_version"));
            boolean z = cursor.getInt(cursor.getColumnIndex("played")) != 0;
            double d = (double) cursor.getInt(cursor.getColumnIndex("entity_type"));
            long j = cursor.getLong(cursor.getColumnIndex("entity_id"));
            v a2 = v.b().a(b(cursor)).b(d(cursor)).a(c(cursor)).a();
            if (d == 1.0d) {
                return ((com.soundcloud.android.foundation.playqueue.w.a) ((com.soundcloud.android.foundation.playqueue.w.a) ((com.soundcloud.android.foundation.playqueue.w.a) ((com.soundcloud.android.foundation.playqueue.w.a) new com.soundcloud.android.foundation.playqueue.w.a(C3508cda.c(j)).a(f)).a(string, string2, h, e)).a(a2)).b(z)).c();
            }
            C3508cda d2 = C3508cda.d(j);
            return ((com.soundcloud.android.foundation.playqueue.F.a) ((com.soundcloud.android.foundation.playqueue.F.a) ((com.soundcloud.android.foundation.playqueue.F.a) ((com.soundcloud.android.foundation.playqueue.F.a) ((com.soundcloud.android.foundation.playqueue.F.a) new com.soundcloud.android.foundation.playqueue.F.a(d2, g).a(f)).a(this.a.contains(d2))).a(a2)).a(string, string2, h, e)).b(z)).c();
        }
    }

    C3846pca(C3758eca eca) {
        this.a = eca;
    }

    static /* synthetic */ C3508cda a(Cursor cursor) {
        return new C3508cda(cursor.getString(0));
    }

    /* access modifiers changed from: 0000 */
    public List<C3508cda> b() {
        return this.a.c((Xd) a.a.b(), (C6772kMa<T>) Wba.a);
    }

    public /* synthetic */ void c() throws Exception {
        this.a.a("play_queue");
    }

    /* access modifiers changed from: 0000 */
    public IPa<List<t>> d() {
        return this.a.a((Xd) a.a.a(), (C6772kMa<T>) new a<T>(Collections.emptySet()));
    }

    /* access modifiers changed from: 0000 */
    public C6979nPa a() {
        return C6979nPa.b((C6368eQa) new Zba(this));
    }

    /* access modifiers changed from: 0000 */
    public void b(o oVar) {
        this.a.a("play_queue");
        this.a.a((Runnable) new Yba(this, oVar));
    }

    public /* synthetic */ void a(o oVar) {
        c cVar = new c(this.a.a());
        Iterator it = oVar.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (qVar.h()) {
                a(cVar, (t) qVar);
                this.a.a("play_queue", (Yd) cVar);
            }
        }
    }

    private void a(c cVar, t tVar) {
        v l = tVar.l();
        cVar.a(Long.valueOf(tVar.c().c()), Long.valueOf(tVar.c().x() ? 0 : 1), Long.valueOf(tVar.o().J() ? tVar.o().c() : -1), tVar.n().equals(C3508cda.a) ? null : tVar.n().toString(), tVar.p(), tVar.r(), tVar.q().equals(C3508cda.a) ? null : tVar.q().toString(), tVar.m().equals(C3508cda.a) ? null : tVar.m().toString(), l.a().toString(), l.d().c() ? ((C3508cda) l.d().b()).toString() : null, l.c().c() ? (String) l.c().b() : null, Boolean.valueOf(tVar.t()));
    }

    public /* synthetic */ q a(Set set, Cursor cursor) {
        return new a(set).a(cursor);
    }

    /* access modifiers changed from: 0000 */
    public IPa<List<q>> a(Set<C3508cda> set) {
        return this.a.a((Xd) a.a.a(), (C6772kMa<T>) new Xba<T>(this, set));
    }
}
