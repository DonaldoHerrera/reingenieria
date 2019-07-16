package defpackage;

import com.soundcloud.android.activities.w;
import com.soundcloud.android.stream.lb;

/* renamed from: Psa reason: default package and case insensitive filesystem */
/* compiled from: RemovePlaylistFromDatabaseCommand.kt */
public class C5218Psa extends C1286fT<C3508cda, C6431fLa> {
    /* access modifiers changed from: private */
    public final C4942Gta b;
    /* access modifiers changed from: private */
    public final C6332dsa c;
    /* access modifiers changed from: private */
    public final lb d;
    /* access modifiers changed from: private */
    public final w e;

    public C5218Psa(C5500ZKa zKa, C4942Gta gta, C6332dsa dsa, lb lbVar, w wVar) {
        C7471uYa.b(zKa, "propeller");
        C7471uYa.b(gta, "postsStorage");
        C7471uYa.b(dsa, "playlistStorage");
        C7471uYa.b(lbVar, "streamStorage");
        C7471uYa.b(wVar, "activitiesStorage");
        super(zKa);
        this.b = gta;
        this.c = dsa;
        this.d = lbVar;
        this.e = wVar;
    }

    /* access modifiers changed from: protected */
    public C6431fLa a(C5500ZKa zKa, C3508cda cda) {
        C7471uYa.b(zKa, "propeller");
        C7471uYa.b(cda, "playlistUrn");
        if (cda.u()) {
            C6431fLa a = zKa.a((a) new C5188Osa(this, cda));
            C7471uYa.a((Object) a, "propeller.runTransaction…\n            }\n        })");
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("urn argument: ");
        sb.append(cda);
        sb.append(" is not a playlist urn");
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
