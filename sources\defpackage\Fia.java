package defpackage;

import android.os.Bundle;
import com.soundcloud.android.deeplinks.e;
import com.soundcloud.android.features.record.Recording;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.foundation.playqueue.m;
import java.util.Date;

/* renamed from: Fia reason: default package */
/* compiled from: $AutoValue_NavigationTarget */
abstract class Fia extends C4621nja {
    private final Date a;
    private final C4928GKa<e> b;
    private final C4928GKa<c> c;
    private final C4928GKa<String> d;
    private final Yca e;
    private final C4928GKa<String> f;
    private final C4928GKa<C3508cda> g;
    private final C4928GKa<C3508cda> h;
    private final C4928GKa<m> i;
    private final C4928GKa<f> j;
    private final C4928GKa<SearchQuerySourceInfo> k;
    private final C4928GKa<PromotedSourceInfo> l;
    private final C4928GKa<b> m;
    private final C4928GKa<d> n;
    private final C4928GKa<K> o;
    private final C4928GKa<Recording> p;
    private final C4928GKa<e> q;
    private final C4928GKa<C3920yea> r;
    private final C4928GKa<Bundle> s;
    private final C4928GKa<String> t;
    private final C4928GKa<Long> u;
    private final C4928GKa<Boolean> v;

    /* renamed from: Fia$a */
    /* compiled from: $AutoValue_NavigationTarget */
    static final class a extends a {
        private Date a;
        private C4928GKa<e> b;
        private C4928GKa<c> c;
        private C4928GKa<String> d;
        private Yca e;
        private C4928GKa<String> f;
        private C4928GKa<C3508cda> g;
        private C4928GKa<C3508cda> h;
        private C4928GKa<m> i;
        private C4928GKa<f> j;
        private C4928GKa<SearchQuerySourceInfo> k;
        private C4928GKa<PromotedSourceInfo> l;
        private C4928GKa<b> m;
        private C4928GKa<d> n;
        private C4928GKa<K> o;
        private C4928GKa<Recording> p;
        private C4928GKa<e> q;
        private C4928GKa<C3920yea> r;
        private C4928GKa<Bundle> s;
        private C4928GKa<String> t;
        private C4928GKa<Long> u;
        private C4928GKa<Boolean> v;

        /* access modifiers changed from: 0000 */
        public a a(Date date) {
            if (date != null) {
                this.a = date;
                return this;
            }
            throw new NullPointerException("Null creationDate");
        }

        /* access modifiers changed from: 0000 */
        public a b(C4928GKa<e> gKa) {
            if (gKa != null) {
                this.b = gKa;
                return this;
            }
            throw new NullPointerException("Null deeplink");
        }

        /* access modifiers changed from: 0000 */
        public a c(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.d = gKa;
                return this;
            }
            throw new NullPointerException("Null deeplinkTarget");
        }

        /* access modifiers changed from: 0000 */
        public a d(C4928GKa<m> gKa) {
            if (gKa != null) {
                this.i = gKa;
                return this;
            }
            throw new NullPointerException("Null discoverySource");
        }

        /* access modifiers changed from: 0000 */
        public a e(C4928GKa<Boolean> gKa) {
            if (gKa != null) {
                this.v = gKa;
                return this;
            }
            throw new NullPointerException("Null fromOverflowMenu");
        }

        /* access modifiers changed from: 0000 */
        public a f(C4928GKa<Bundle> gKa) {
            if (gKa != null) {
                this.s = gKa;
                return this;
            }
            throw new NullPointerException("Null intentExtra");
        }

        /* access modifiers changed from: 0000 */
        public a g(C4928GKa<c> gKa) {
            if (gKa != null) {
                this.c = gKa;
                return this;
            }
            throw new NullPointerException("Null linkNavigationParameters");
        }

        /* access modifiers changed from: 0000 */
        public a h(C4928GKa<d> gKa) {
            if (gKa != null) {
                this.n = gKa;
                return this;
            }
            throw new NullPointerException("Null notificationPreferencesMetaData");
        }

        /* access modifiers changed from: 0000 */
        public a i(C4928GKa<e> gKa) {
            if (gKa != null) {
                this.q = gKa;
                return this;
            }
            throw new NullPointerException("Null offlineSettingsMetaData");
        }

        /* access modifiers changed from: 0000 */
        public a j(C4928GKa<PromotedSourceInfo> gKa) {
            if (gKa != null) {
                this.l = gKa;
                return this;
            }
            throw new NullPointerException("Null promotedSourceInfo");
        }

        /* access modifiers changed from: 0000 */
        public a k(C4928GKa<C3508cda> gKa) {
            if (gKa != null) {
                this.g = gKa;
                return this;
            }
            throw new NullPointerException("Null queryUrn");
        }

        /* access modifiers changed from: 0000 */
        public a l(C4928GKa<Recording> gKa) {
            if (gKa != null) {
                this.p = gKa;
                return this;
            }
            throw new NullPointerException("Null recording");
        }

        /* access modifiers changed from: 0000 */
        public a m(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.f = gKa;
                return this;
            }
            throw new NullPointerException("Null referrer");
        }

        /* access modifiers changed from: 0000 */
        public a n(C4928GKa<SearchQuerySourceInfo> gKa) {
            if (gKa != null) {
                this.k = gKa;
                return this;
            }
            throw new NullPointerException("Null searchQuerySourceInfo");
        }

        /* access modifiers changed from: 0000 */
        public a o(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.t = gKa;
                return this;
            }
            throw new NullPointerException("Null secretToken");
        }

        /* access modifiers changed from: 0000 */
        public a p(C4928GKa<f> gKa) {
            if (gKa != null) {
                this.j = gKa;
                return this;
            }
            throw new NullPointerException("Null stationsInfoMetaData");
        }

        /* access modifiers changed from: 0000 */
        public a q(C4928GKa<C3508cda> gKa) {
            if (gKa != null) {
                this.h = gKa;
                return this;
            }
            throw new NullPointerException("Null targetUrn");
        }

        /* access modifiers changed from: 0000 */
        public a r(C4928GKa<Long> gKa) {
            if (gKa != null) {
                this.u = gKa;
                return this;
            }
            throw new NullPointerException("Null timestamp");
        }

        /* access modifiers changed from: 0000 */
        public a s(C4928GKa<K> gKa) {
            if (gKa != null) {
                this.o = gKa;
                return this;
            }
            throw new NullPointerException("Null uiEvent");
        }

        /* access modifiers changed from: 0000 */
        public a t(C4928GKa<C3920yea> gKa) {
            if (gKa != null) {
                this.r = gKa;
                return this;
            }
            throw new NullPointerException("Null upsellContext");
        }

        a() {
        }

        private a(C4621nja nja) {
            this.a = nja.b();
            this.b = nja.c();
            this.c = nja.z();
            this.d = nja.d();
            this.e = nja.I();
            this.f = nja.H();
            this.g = nja.F();
            this.h = nja.M();
            this.i = nja.e();
            this.j = nja.L();
            this.k = nja.J();
            this.l = nja.E();
            this.m = nja.a();
            this.n = nja.C();
            this.o = nja.P();
            this.p = nja.G();
            this.q = nja.D();
            this.r = nja.Q();
            this.s = nja.y();
            this.t = nja.K();
            this.u = nja.N();
            this.v = nja.x();
        }

        /* access modifiers changed from: 0000 */
        public a a(Yca yca) {
            if (yca != null) {
                this.e = yca;
                return this;
            }
            throw new NullPointerException("Null screen");
        }

        /* access modifiers changed from: 0000 */
        public a a(C4928GKa<b> gKa) {
            if (gKa != null) {
                this.m = gKa;
                return this;
            }
            throw new NullPointerException("Null chartsMetaData");
        }

        /* access modifiers changed from: 0000 */
        public C4621nja a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" creationDate");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" deeplink");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" linkNavigationParameters");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" deeplinkTarget");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" screen");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" referrer");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" queryUrn");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" targetUrn");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" discoverySource");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" stationsInfoMetaData");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" searchQuerySourceInfo");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" promotedSourceInfo");
                str = sb12.toString();
            }
            if (this.m == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" chartsMetaData");
                str = sb13.toString();
            }
            if (this.n == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" notificationPreferencesMetaData");
                str = sb14.toString();
            }
            if (this.o == null) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append(" uiEvent");
                str = sb15.toString();
            }
            if (this.p == null) {
                StringBuilder sb16 = new StringBuilder();
                sb16.append(str);
                sb16.append(" recording");
                str = sb16.toString();
            }
            if (this.q == null) {
                StringBuilder sb17 = new StringBuilder();
                sb17.append(str);
                sb17.append(" offlineSettingsMetaData");
                str = sb17.toString();
            }
            if (this.r == null) {
                StringBuilder sb18 = new StringBuilder();
                sb18.append(str);
                sb18.append(" upsellContext");
                str = sb18.toString();
            }
            if (this.s == null) {
                StringBuilder sb19 = new StringBuilder();
                sb19.append(str);
                sb19.append(" intentExtra");
                str = sb19.toString();
            }
            if (this.t == null) {
                StringBuilder sb20 = new StringBuilder();
                sb20.append(str);
                sb20.append(" secretToken");
                str = sb20.toString();
            }
            if (this.u == null) {
                StringBuilder sb21 = new StringBuilder();
                sb21.append(str);
                sb21.append(" timestamp");
                str = sb21.toString();
            }
            if (this.v == null) {
                StringBuilder sb22 = new StringBuilder();
                sb22.append(str);
                sb22.append(" fromOverflowMenu");
                str = sb22.toString();
            }
            if (str.isEmpty()) {
                Wia wia = new Wia(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v);
                return wia;
            }
            StringBuilder sb23 = new StringBuilder();
            sb23.append("Missing required properties:");
            sb23.append(str);
            throw new IllegalStateException(sb23.toString());
        }
    }

    Fia(Date date, C4928GKa<e> gKa, C4928GKa<c> gKa2, C4928GKa<String> gKa3, Yca yca, C4928GKa<String> gKa4, C4928GKa<C3508cda> gKa5, C4928GKa<C3508cda> gKa6, C4928GKa<m> gKa7, C4928GKa<f> gKa8, C4928GKa<SearchQuerySourceInfo> gKa9, C4928GKa<PromotedSourceInfo> gKa10, C4928GKa<b> gKa11, C4928GKa<d> gKa12, C4928GKa<K> gKa13, C4928GKa<Recording> gKa14, C4928GKa<e> gKa15, C4928GKa<C3920yea> gKa16, C4928GKa<Bundle> gKa17, C4928GKa<String> gKa18, C4928GKa<Long> gKa19, C4928GKa<Boolean> gKa20) {
        Date date2 = date;
        C4928GKa<e> gKa21 = gKa;
        C4928GKa<c> gKa22 = gKa2;
        C4928GKa<String> gKa23 = gKa3;
        Yca yca2 = yca;
        C4928GKa<String> gKa24 = gKa4;
        C4928GKa<C3508cda> gKa25 = gKa5;
        C4928GKa<C3508cda> gKa26 = gKa6;
        C4928GKa<m> gKa27 = gKa7;
        C4928GKa<f> gKa28 = gKa8;
        C4928GKa<SearchQuerySourceInfo> gKa29 = gKa9;
        C4928GKa<PromotedSourceInfo> gKa30 = gKa10;
        C4928GKa<b> gKa31 = gKa11;
        C4928GKa<d> gKa32 = gKa12;
        C4928GKa<K> gKa33 = gKa13;
        if (date2 != null) {
            this.a = date2;
            if (gKa21 != null) {
                this.b = gKa21;
                if (gKa22 != null) {
                    this.c = gKa22;
                    if (gKa23 != null) {
                        this.d = gKa23;
                        if (yca2 != null) {
                            this.e = yca2;
                            if (gKa24 != null) {
                                this.f = gKa24;
                                if (gKa25 != null) {
                                    this.g = gKa25;
                                    if (gKa26 != null) {
                                        this.h = gKa26;
                                        if (gKa27 != null) {
                                            this.i = gKa27;
                                            if (gKa28 != null) {
                                                this.j = gKa28;
                                                if (gKa29 != null) {
                                                    this.k = gKa29;
                                                    if (gKa30 != null) {
                                                        this.l = gKa30;
                                                        if (gKa31 != null) {
                                                            this.m = gKa31;
                                                            if (gKa32 != null) {
                                                                this.n = gKa32;
                                                                if (gKa33 != null) {
                                                                    this.o = gKa33;
                                                                    C4928GKa<Recording> gKa34 = gKa14;
                                                                    if (gKa34 != null) {
                                                                        this.p = gKa34;
                                                                        C4928GKa<e> gKa35 = gKa15;
                                                                        if (gKa35 != null) {
                                                                            this.q = gKa35;
                                                                            C4928GKa<C3920yea> gKa36 = gKa16;
                                                                            if (gKa36 != null) {
                                                                                this.r = gKa36;
                                                                                C4928GKa<Bundle> gKa37 = gKa17;
                                                                                if (gKa37 != null) {
                                                                                    this.s = gKa37;
                                                                                    C4928GKa<String> gKa38 = gKa18;
                                                                                    if (gKa38 != null) {
                                                                                        this.t = gKa38;
                                                                                        C4928GKa<Long> gKa39 = gKa19;
                                                                                        if (gKa39 != null) {
                                                                                            this.u = gKa39;
                                                                                            C4928GKa<Boolean> gKa40 = gKa20;
                                                                                            if (gKa40 != null) {
                                                                                                this.v = gKa40;
                                                                                                return;
                                                                                            }
                                                                                            throw new NullPointerException("Null fromOverflowMenu");
                                                                                        }
                                                                                        throw new NullPointerException("Null timestamp");
                                                                                    }
                                                                                    throw new NullPointerException("Null secretToken");
                                                                                }
                                                                                throw new NullPointerException("Null intentExtra");
                                                                            }
                                                                            throw new NullPointerException("Null upsellContext");
                                                                        }
                                                                        throw new NullPointerException("Null offlineSettingsMetaData");
                                                                    }
                                                                    throw new NullPointerException("Null recording");
                                                                }
                                                                throw new NullPointerException("Null uiEvent");
                                                            }
                                                            throw new NullPointerException("Null notificationPreferencesMetaData");
                                                        }
                                                        throw new NullPointerException("Null chartsMetaData");
                                                    }
                                                    throw new NullPointerException("Null promotedSourceInfo");
                                                }
                                                throw new NullPointerException("Null searchQuerySourceInfo");
                                            }
                                            throw new NullPointerException("Null stationsInfoMetaData");
                                        }
                                        throw new NullPointerException("Null discoverySource");
                                    }
                                    throw new NullPointerException("Null targetUrn");
                                }
                                throw new NullPointerException("Null queryUrn");
                            }
                            throw new NullPointerException("Null referrer");
                        }
                        throw new NullPointerException("Null screen");
                    }
                    throw new NullPointerException("Null deeplinkTarget");
                }
                throw new NullPointerException("Null linkNavigationParameters");
            }
            throw new NullPointerException("Null deeplink");
        }
        throw new NullPointerException("Null creationDate");
    }

    public C4928GKa<d> C() {
        return this.n;
    }

    public C4928GKa<e> D() {
        return this.q;
    }

    public C4928GKa<PromotedSourceInfo> E() {
        return this.l;
    }

    public C4928GKa<C3508cda> F() {
        return this.g;
    }

    public C4928GKa<Recording> G() {
        return this.p;
    }

    public C4928GKa<String> H() {
        return this.f;
    }

    public Yca I() {
        return this.e;
    }

    public C4928GKa<SearchQuerySourceInfo> J() {
        return this.k;
    }

    public C4928GKa<String> K() {
        return this.t;
    }

    public C4928GKa<f> L() {
        return this.j;
    }

    public C4928GKa<C3508cda> M() {
        return this.h;
    }

    public C4928GKa<Long> N() {
        return this.u;
    }

    public a O() {
        return new a(this);
    }

    public C4928GKa<K> P() {
        return this.o;
    }

    public C4928GKa<C3920yea> Q() {
        return this.r;
    }

    public C4928GKa<b> a() {
        return this.m;
    }

    @C3783hda
    public Date b() {
        return this.a;
    }

    public C4928GKa<e> c() {
        return this.b;
    }

    public C4928GKa<String> d() {
        return this.d;
    }

    public C4928GKa<m> e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4621nja)) {
            return false;
        }
        C4621nja nja = (C4621nja) obj;
        if (!this.a.equals(nja.b()) || !this.b.equals(nja.c()) || !this.c.equals(nja.z()) || !this.d.equals(nja.d()) || !this.e.equals(nja.I()) || !this.f.equals(nja.H()) || !this.g.equals(nja.F()) || !this.h.equals(nja.M()) || !this.i.equals(nja.e()) || !this.j.equals(nja.L()) || !this.k.equals(nja.J()) || !this.l.equals(nja.E()) || !this.m.equals(nja.a()) || !this.n.equals(nja.C()) || !this.o.equals(nja.P()) || !this.p.equals(nja.G()) || !this.q.equals(nja.D()) || !this.r.equals(nja.Q()) || !this.s.equals(nja.y()) || !this.t.equals(nja.K()) || !this.u.equals(nja.N()) || !this.v.equals(nja.x())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode()) * 1000003) ^ this.v.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavigationTarget{creationDate=");
        sb.append(this.a);
        sb.append(", deeplink=");
        sb.append(this.b);
        sb.append(", linkNavigationParameters=");
        sb.append(this.c);
        sb.append(", deeplinkTarget=");
        sb.append(this.d);
        sb.append(", screen=");
        sb.append(this.e);
        sb.append(", referrer=");
        sb.append(this.f);
        sb.append(", queryUrn=");
        sb.append(this.g);
        sb.append(", targetUrn=");
        sb.append(this.h);
        sb.append(", discoverySource=");
        sb.append(this.i);
        sb.append(", stationsInfoMetaData=");
        sb.append(this.j);
        sb.append(", searchQuerySourceInfo=");
        sb.append(this.k);
        sb.append(", promotedSourceInfo=");
        sb.append(this.l);
        sb.append(", chartsMetaData=");
        sb.append(this.m);
        sb.append(", notificationPreferencesMetaData=");
        sb.append(this.n);
        sb.append(", uiEvent=");
        sb.append(this.o);
        sb.append(", recording=");
        sb.append(this.p);
        sb.append(", offlineSettingsMetaData=");
        sb.append(this.q);
        sb.append(", upsellContext=");
        sb.append(this.r);
        sb.append(", intentExtra=");
        sb.append(this.s);
        sb.append(", secretToken=");
        sb.append(this.t);
        sb.append(", timestamp=");
        sb.append(this.u);
        sb.append(", fromOverflowMenu=");
        sb.append(this.v);
        sb.append("}");
        return sb.toString();
    }

    public C4928GKa<Boolean> x() {
        return this.v;
    }

    public C4928GKa<Bundle> y() {
        return this.s;
    }

    public C4928GKa<c> z() {
        return this.c;
    }
}
