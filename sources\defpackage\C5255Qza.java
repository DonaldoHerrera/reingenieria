package defpackage;

import com.soundcloud.android.activities.G;
import java.util.HashSet;

/* renamed from: Qza reason: default package and case insensitive filesystem */
/* compiled from: StoreActivitiesCommand */
public class C5255Qza extends C1286fT<Iterable<C4948Gza>, C6431fLa> {
    /* access modifiers changed from: private */
    public final C3800jea b;
    /* access modifiers changed from: private */
    public final C3768fea c;
    /* access modifiers changed from: private */
    public final C6332dsa d;
    /* access modifiers changed from: private */
    public final C3382yT e;

    /* renamed from: Qza$a */
    /* compiled from: StoreActivitiesCommand */
    protected class a extends defpackage.C5500ZKa.a {
        private final Iterable<C4948Gza> b;

        a(Iterable<C4948Gza> iterable) {
            this.b = iterable;
        }

        private void a(C5500ZKa zKa, C4948Gza gza) {
            C5073Kza e = gza.e();
            if (e != null) {
                C3342wT a = e.a();
                a((C6499gLa) C5255Qza.this.e.a(a));
                String str = "comment_id";
                a(zKa, a(e, G.TRACK_COMMENT, a.h()).a(str, C5255Qza.this.e.d()));
            }
        }

        private void c(C5500ZKa zKa, C4948Gza gza) {
            C4979Hza a = gza.a();
            if (a != null) {
                C3508cda c2 = a.c();
                a(zKa, a(a, c2.x() ? G.TRACK_LIKE : G.PLAYLIST_LIKE, c2));
            }
        }

        private void d(C5500ZKa zKa, C4948Gza gza) {
            C4979Hza c2 = gza.c();
            if (c2 != null) {
                C3508cda c3 = c2.c();
                a(zKa, a(c2, c3.x() ? G.TRACK_REPOST : G.PLAYLIST_REPOST, c3));
            }
        }

        public void b(C5500ZKa zKa) {
            b();
            for (C4948Gza gza : this.b) {
                c(zKa, gza);
                d(zKa, gza);
                a(zKa, gza);
                b(zKa, gza);
            }
        }

        private void b(C5500ZKa zKa, C4948Gza gza) {
            C5165Nza g = gza.g();
            if (g != null) {
                a(zKa, a((C4917Fza) g, G.USER_FOLLOW));
            }
        }

        private C5296SKa a(C4917Fza fza, G g) {
            C5296SKa b2 = C5296SKa.b();
            b2.a(C1325gg.TYPE, g.a());
            b2.a("user_id", fza.e().c());
            b2.a("created_at", fza.b().getTime());
            return b2;
        }

        private void b() {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            for (C4948Gza gza : this.b) {
                if (gza.f() != null) {
                    hashSet.add(gza.f());
                }
                if (gza.d() != null) {
                    hashSet2.add(gza.d());
                }
                if (gza.b() != null) {
                    hashSet3.add(gza.b());
                }
            }
            if (!hashSet.isEmpty()) {
                C5255Qza.this.b.b(hashSet);
            }
            if (!hashSet2.isEmpty()) {
                C5255Qza.this.c.a(hashSet2);
            }
            if (!hashSet3.isEmpty()) {
                a(C5255Qza.this.d.b((Iterable<C3927zda>) hashSet3));
            }
        }

        private C5296SKa a(C4917Fza fza, G g, C3508cda cda) {
            return a(fza, g).a("sound_id", cda.c()).a("sound_type", cda.x() ^ true ? 1 : 0);
        }

        private void a(C5500ZKa zKa, C5296SKa sKa) {
            a(zKa.a((C5116MLa) _ea.Activities, sKa.a()));
        }
    }

    C5255Qza(C5500ZKa zKa, C3800jea jea, C3768fea fea, C6332dsa dsa, C3382yT yTVar) {
        super(zKa);
        this.b = jea;
        this.c = fea;
        this.d = dsa;
        this.e = yTVar;
    }

    /* access modifiers changed from: protected */
    public C6431fLa a(C5500ZKa zKa, Iterable<C4948Gza> iterable) {
        return zKa.a((defpackage.C5500ZKa.a) new a(iterable));
    }
}
