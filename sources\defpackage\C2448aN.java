package defpackage;

import com.soundcloud.android.foundation.events.G;
import com.soundcloud.android.foundation.events.G.a;
import com.soundcloud.android.foundation.events.G.d;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.tracks.C6185ma;

/* renamed from: aN reason: default package and case insensitive filesystem */
/* compiled from: AppboyEventHandler */
class C2448aN {
    private final C1956BQ a;
    private final C2486cN b;

    C2448aN(C1956BQ bq, C2486cN cNVar) {
        this.a = bq;
        this.b = cNVar;
    }

    private boolean b(C3924zaa zaa) {
        return zaa.u().c() && zaa.s().c();
    }

    private boolean c(C3924zaa zaa) {
        return zaa.j().c() && ((c) zaa.j().b()).equals(c.KIND_OFFLINE_STORAGE_LOCATION_CONFIRM_SD);
    }

    private boolean d(Waa waa) {
        return (g.UPSELL_IMPRESSION == waa.W() && a(waa, h.CONVERSION_PROMO)) || a(waa, h.CONVERSION_BUY);
    }

    /* access modifiers changed from: 0000 */
    public void a(K k) {
        switch (C2429_M.a[k.Z().ordinal()]) {
            case 1:
                a("like", c(k));
                return;
            case 2:
                a("follow", b(k));
                return;
            case 3:
                a("comment", c(k));
                return;
            case 4:
                a("share", c(k));
                return;
            case 5:
                a("repost", c(k));
                return;
            case 6:
                a("create_playlist", d(k));
                return;
            case 7:
                a("start_station");
                return;
            default:
                return;
        }
    }

    private boolean b(Waa waa) {
        return g.UPSELL_IMPRESSION == waa.W() && a(waa, h.CHOOSER_BUY_HIGH_TIER);
    }

    private boolean c(Waa waa) {
        return g.UPSELL_IMPRESSION == waa.W() && a(waa, h.CHOOSER_BUY_MID_TIER);
    }

    private boolean b(G g) {
        return g.h() != null && g.h() == a.SEARCH && g.l() != null && g.l().equals(Yca.SEARCH_EVERYTHING.a());
    }

    private C1782vg c(Faa faa) {
        C1782vg b2 = b(faa);
        String j = faa.j();
        if (C5206PKa.b(j)) {
            b2.a("monetization_model", j);
        }
        return b2;
    }

    private C1782vg d(K k) {
        C1782vg vgVar = new C1782vg();
        if (k.P() != null) {
            vgVar.a(C2410ZM.PLAYLIST_TITLE.a(), k.P());
        }
        if (k.R() != null) {
            vgVar.a(C2410ZM.PLAYLIST_URN.a(), k.R().toString());
        }
        return vgVar;
    }

    private C1782vg b(Faa faa) {
        C1782vg vgVar = new C1782vg();
        C6185ma j = faa.k().j();
        vgVar.a(C2410ZM.CREATOR_DISPLAY_NAME.a(), j.d());
        vgVar.a(C2410ZM.CREATOR_URN.a(), j.e().toString());
        vgVar.a(C2410ZM.PLAYABLE_TITLE.a(), j.B());
        vgVar.a(C2410ZM.PLAYABLE_URN.a(), j.a().toString());
        vgVar.a(C2410ZM.PLAYABLE_TYPE.a(), j.h());
        return vgVar;
    }

    private C1782vg c(K k) {
        C1782vg vgVar = new C1782vg();
        if (k.G() != null) {
            vgVar.a(C2410ZM.CREATOR_DISPLAY_NAME.a(), k.G());
        }
        if (k.H() != null) {
            vgVar.a(C2410ZM.CREATOR_URN.a(), k.H().toString());
        }
        if (k.P() != null) {
            vgVar.a(C2410ZM.PLAYABLE_TITLE.a(), k.P());
        }
        if (k.R() != null) {
            vgVar.a(C2410ZM.PLAYABLE_URN.a(), k.R().toString());
        }
        if (k.Q() != null) {
            vgVar.a(C2410ZM.PLAYABLE_TYPE.a(), k.Q());
        }
        return vgVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(C3908xaa xaa) {
        xaa.h().a((C7733yKa<? super T>) new C2300TM<Object>(this));
    }

    /* access modifiers changed from: 0000 */
    public void a(C3924zaa zaa) {
        if (b(zaa)) {
            a("offline_content", a(((d) zaa.u().b()).a(), ((Boolean) zaa.s().b()).booleanValue()));
        } else if (c(zaa)) {
            a("used_offline_sd_card");
        }
    }

    private C1782vg b(K k) {
        C1782vg vgVar = new C1782vg();
        if (k.G() != null) {
            vgVar.a(C2410ZM.CREATOR_DISPLAY_NAME.a(), k.G());
        }
        if (k.H() != null) {
            vgVar.a(C2410ZM.CREATOR_URN.a(), k.H().toString());
        }
        return vgVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(Waa waa) {
        if (d(waa)) {
            a("subscription_modal_view");
        } else if (c(waa)) {
            a("subscription_plan_picker_mid_tier");
        } else if (b(waa)) {
            a("subscription_plan_picker_high_tier");
        }
    }

    private boolean a(Waa waa, h hVar) {
        return waa.V().c() && hVar.a().equals(waa.V().b());
    }

    /* access modifiers changed from: 0000 */
    public void a(C3446NZ nz) {
        String str = "";
        this.a.a((String) nz.k().d(str), (String) nz.i().d(str), (String) nz.h().d(str), (String) nz.j().d(str));
    }

    /* access modifiers changed from: 0000 */
    public void a(G g) {
        if (g.d() != null && g.d() == d.SUBMIT && b(g)) {
            a("search");
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Faa faa) {
        if (!this.b.b() && faa.l()) {
            this.b.d();
            a("play", c(faa));
            this.a.a();
            this.a.b();
        }
    }

    private C1782vg a(String str, boolean z) {
        C1782vg vgVar = new C1782vg();
        vgVar.a("context", str);
        vgVar.a("enabled", z);
        return vgVar;
    }

    private void a(String str, C1782vg vgVar) {
        this.a.a(str, vgVar);
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        this.a.b(str);
    }
}
