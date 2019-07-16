package defpackage;

import android.annotation.SuppressLint;
import com.soundcloud.android.foundation.events.E;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.y;
import com.soundcloud.android.foundation.playqueue.m;

/* renamed from: QL reason: default package and case insensitive filesystem */
/* compiled from: DefaultPlaySessionOriginScreenProvider */
public class C2242QL implements y {
    @a
    private C2350WH<J> a;
    private final F b;
    /* access modifiers changed from: private */
    public boolean c;
    /* access modifiers changed from: private */
    public C4928GKa<String> d = C4928GKa.a();
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa e = new UPa();

    /* renamed from: QL$a */
    /* compiled from: DefaultPlaySessionOriginScreenProvider */
    private class a extends C5037Jua<C3860raa> {
        private a() {
        }

        public void a(C3860raa raa) {
            if (!C2242QL.this.c || !C2242QL.this.a(raa)) {
                C2242QL.this.d = C4928GKa.a();
            } else {
                C2242QL.this.d = C4928GKa.c(raa.k());
            }
        }
    }

    /* renamed from: QL$b */
    /* compiled from: DefaultPlaySessionOriginScreenProvider */
    private class b extends C5037Jua<E> {
        private b() {
        }

        public void a(E e) {
            Yca a = Yca.a(e.k());
            if (!C2242QL.this.c || !C2242QL.this.a(a)) {
                C2242QL.this.c = a == Yca.COLLECTIONS;
                C2242QL.this.d = C4928GKa.a();
            }
        }
    }

    public C2242QL(@a C2350WH<J> wh, F f) {
        this.a = wh;
        this.b = f;
    }

    public void b() {
        this.e.a((VPa) this.a.b(E.class).c(new b()), (VPa) this.a.b(C3860raa.class).c(new a()));
    }

    public String a() {
        if (this.d.c()) {
            return (String) this.d.b();
        }
        return this.b.b().a();
    }

    /* access modifiers changed from: private */
    public boolean a(Yca yca) {
        return yca == Yca.PLAYLISTS || yca == Yca.STATIONS_INFO || yca == Yca.USERS_MAIN;
    }

    /* access modifiers changed from: private */
    public boolean a(C3860raa raa) {
        C4928GKa l = raa.l();
        return l.c() && m.a(((m) l.b()).a()) == m.RECENTLY_PLAYED;
    }
}
