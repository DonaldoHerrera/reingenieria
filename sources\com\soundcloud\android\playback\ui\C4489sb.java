package com.soundcloud.android.playback.ui;

import android.content.res.Resources;
import com.soundcloud.android.foundation.ads.U;
import com.soundcloud.android.ia.p;

/* renamed from: com.soundcloud.android.playback.ui.sb reason: case insensitive filesystem */
/* compiled from: PlayerAd.kt */
public abstract class C4489sb extends C4510zb {
    static final /* synthetic */ DZa[] b = {HYa.a((DYa) new EYa(HYa.a(C4489sb.class), "defaultTextColor", "getDefaultTextColor()I")), HYa.a((DYa) new EYa(HYa.a(C4489sb.class), "defaultBackgroundColor", "getDefaultBackgroundColor()I")), HYa.a((DYa) new EYa(HYa.a(C4489sb.class), "pressedTextColor", "getPressedTextColor()I")), HYa.a((DYa) new EYa(HYa.a(C4489sb.class), "pressedBackgroundColor", "getPressedBackgroundColor()I")), HYa.a((DYa) new EYa(HYa.a(C4489sb.class), "focusedTextColor", "getFocusedTextColor()I")), HYa.a((DYa) new EYa(HYa.a(C4489sb.class), "focusedBackgroundColor", "getFocusedBackgroundColor()I"))};
    private final C7744yVa c = BVa.a(new C4475nb(this));
    private final C7744yVa d = BVa.a(new C4472mb(this));
    private final C7744yVa e = BVa.a(new C4486rb(this));
    private final C7744yVa f = BVa.a(new C4484qb(this));
    private final C7744yVa g = BVa.a(new C4481pb(this));
    private final C7744yVa h = BVa.a(new C4478ob(this));
    private final U i;

    public C4489sb(U u) {
        C7471uYa.b(u, "adData");
        this.i = u;
    }

    public final String a(Resources resources) {
        C7471uYa.b(resources, "resources");
        String m = this.i.m();
        if (m != null) {
            return m;
        }
        String string = resources.getString(p.ads_call_to_action);
        C7471uYa.a((Object) string, "resources.getString(R.string.ads_call_to_action)");
        return string;
    }

    public final String b(Resources resources) {
        C7471uYa.b(resources, "resources");
        if (!this.i.l()) {
            return "";
        }
        String h2 = this.i.h();
        String g2 = this.i.g();
        String string = resources.getString(p.ads_next_up_tracktitle_creatorname, new Object[]{h2, g2});
        C7471uYa.a((Object) string, "resources.getString(R.st…kTitle, nextTrackCreator)");
        return string;
    }

    public final U g() {
        return this.i;
    }

    public final C3508cda h() {
        return this.i.f();
    }

    public final int i() {
        C7744yVa yva = this.d;
        DZa dZa = b[1];
        return ((Number) yva.getValue()).intValue();
    }

    public final int j() {
        C7744yVa yva = this.c;
        DZa dZa = b[0];
        return ((Number) yva.getValue()).intValue();
    }

    public final int k() {
        C7744yVa yva = this.h;
        DZa dZa = b[5];
        return ((Number) yva.getValue()).intValue();
    }

    public final int l() {
        C7744yVa yva = this.g;
        DZa dZa = b[4];
        return ((Number) yva.getValue()).intValue();
    }

    public final C3508cda m() {
        return this.i.i();
    }

    public final int n() {
        C7744yVa yva = this.f;
        DZa dZa = b[3];
        return ((Number) yva.getValue()).intValue();
    }

    public final int o() {
        C7744yVa yva = this.e;
        DZa dZa = b[2];
        return ((Number) yva.getValue()).intValue();
    }

    public final boolean p() {
        return this.i.n() != null;
    }
}
