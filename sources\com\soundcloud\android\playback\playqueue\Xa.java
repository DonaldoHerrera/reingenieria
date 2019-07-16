package com.soundcloud.android.playback.playqueue;

import android.content.Context;
import android.content.res.Resources;
import com.soundcloud.android.foundation.playqueue.F;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.foundation.playqueue.t;
import com.soundcloud.android.foundation.playqueue.v;
import com.soundcloud.android.ia.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PlayQueueUIItemMapper */
class Xa implements C6504gQa<List<eb>, Map<C3508cda, String>, List<Va>> {
    /* access modifiers changed from: private */
    public final Context a;
    /* access modifiers changed from: private */
    public final C3814lca b;
    /* access modifiers changed from: private */
    public final Resources c;

    /* compiled from: PlayQueueUIItemMapper */
    private class a {
        private final List<Va> a = new ArrayList();
        private final b b;
        private final q c;
        private final Map<C3508cda, String> d;
        private final boolean e;
        private final boolean f;
        private final boolean g;
        boolean h = false;
        C4928GKa<v> i = C4928GKa.a();

        a(Map<C3508cda, String> map) {
            this.d = map;
            this.b = Xa.this.b.q();
            this.e = Xa.this.b.y();
            this.f = Xa.this.b.w();
            this.g = Xa.this.b.e().v();
            this.c = Xa.this.b.h();
        }

        private C4928GKa<String> b(t tVar) {
            C4928GKa d2 = tVar.l().d();
            return d2.c() ? C4928GKa.b(this.d.get(d2.b())) : C4928GKa.a();
        }

        private boolean c(t tVar) {
            return tVar.equals(this.c) || tVar.u();
        }

        public List<Va> a(List<eb> list) {
            for (eb ebVar : list) {
                F f2 = ebVar.b;
                if (c(f2)) {
                    a((t) f2);
                    a(ebVar);
                }
                a((q) f2);
            }
            a();
            return this.a;
        }

        private void a() {
            if (!this.g && !this.a.isEmpty()) {
                this.a.add(new C4388oa(bb.COMING_UP, this.b));
            }
        }

        private void a(t tVar) {
            v l = tVar.l();
            if ((!this.h || !this.e) && a(l)) {
                this.i = C4928GKa.c(l);
                long identityHashCode = (long) System.identityHashCode(l);
                List<Va> list = this.a;
                String str = "";
                C4382la laVar = new C4382la(bb.COMING_UP, this.b, false, identityHashCode, a(l.a(), (String) l.c().d(str), (String) b(tVar).d(str)));
                list.add(laVar);
            }
        }

        private void a(eb ebVar) {
            this.a.add(hb.a(ebVar.b, ebVar.a, Xa.this.a, b(ebVar.b), this.b));
        }

        private void a(q qVar) {
            if (qVar.equals(this.c)) {
                this.h = true;
            }
        }

        private boolean a(v vVar) {
            return !this.i.c() || !vVar.equals(this.i.b());
        }

        private String a(com.soundcloud.android.foundation.playqueue.v.a aVar, String str, String str2) {
            switch (Wa.a[aVar.ordinal()]) {
                case 1:
                    return Xa.this.c.getString(p.play_queue_header_search, new Object[]{str});
                case 2:
                    return Xa.this.c.getString(p.play_queue_header_stream);
                case 3:
                    return Xa.this.c.getString(p.play_queue_header_link);
                case 4:
                    return Xa.this.c.getString(p.play_queue_header_profile, new Object[]{str2});
                case 5:
                    return Xa.this.c.getString(p.play_queue_header_playlist, new Object[]{str2});
                case 6:
                case 7:
                    return Xa.this.c.getString(p.play_queue_header_track_station, new Object[]{str2});
                case 8:
                    return Xa.this.c.getString(p.play_queue_header_artist_station, new Object[]{str2});
                case 9:
                    return Xa.this.c.getString(p.play_queue_header_likes);
                case 10:
                    return Xa.this.c.getString(p.play_queue_header_listening_history);
                case 11:
                    return Xa.this.c.getString(p.play_queue_header_explicit);
                case 12:
                    return Xa.this.c.getString(p.play_queue_header_cast);
                case 13:
                    return Xa.this.c.getString(p.play_queue_header_other);
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("can't render header of type: ");
                    sb.append(aVar.name());
                    throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    Xa(Context context, C3814lca lca, Resources resources) {
        this.a = context;
        this.b = lca;
        this.c = resources;
    }

    /* renamed from: a */
    public List<Va> apply(List<eb> list, Map<C3508cda, String> map) {
        return new a(map).a(list);
    }
}
