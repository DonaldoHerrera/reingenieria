package defpackage;

import android.util.Pair;
import com.soundcloud.android.offline.C4197yd;

/* renamed from: IBa reason: default package and case insensitive filesystem */
/* compiled from: ReplacePlaylistPostCommand */
class C4981IBa extends C1317gT<Pair<C3508cda, C3927zda>, C6499gLa, C4981IBa> {
    private final C5500ZKa b;
    /* access modifiers changed from: private */
    public final C4197yd c;
    /* access modifiers changed from: private */
    public final C3800jea d;
    /* access modifiers changed from: private */
    public final C6332dsa e;
    /* access modifiers changed from: private */
    public final C4942Gta f;

    C4981IBa(C5500ZKa zKa, C4197yd ydVar, C3800jea jea, C6332dsa dsa, C4942Gta gta) {
        this.b = zKa;
        this.c = ydVar;
        this.d = jea;
        this.e = dsa;
        this.f = gta;
    }

    public C6499gLa call() throws Exception {
        I i = this.a;
        return this.b.a((a) new C4950HBa(this, (C3508cda) ((Pair) i).first, (C3927zda) ((Pair) i).second));
    }
}
