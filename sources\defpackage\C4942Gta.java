package defpackage;

import android.content.ContentValues;
import java.util.List;

/* renamed from: Gta reason: default package and case insensitive filesystem */
/* compiled from: PostsStorage.kt */
public class C4942Gta {
    private final C5500ZKa a;
    private final C4898FLa b;
    /* access modifiers changed from: private */
    public final C5694cGa c;

    public C4942Gta(C5500ZKa zKa, C4898FLa fLa, C5694cGa cga) {
        C7471uYa.b(zKa, "propellerDatabase");
        C7471uYa.b(fLa, "propellerRx");
        C7471uYa.b(cga, "dateProvider");
        this.a = zKa;
        this.b = fLa;
        this.c = cga;
    }

    public IPa<List<C7843zta>> b() {
        IPa<List<C7843zta>> p = this.b.a(c()).h(C4880Eta.a).p();
        C7471uYa.a((Object) p, "propellerRx\n            …         .singleOrError()");
        return p;
    }

    public C5266RKa c(C3508cda cda) {
        C7471uYa.b(cda, "playListUrn");
        C5266RKa a2 = this.a.a((C5116MLa) d.c, C6907mLa.a().a(d.e, (Object) Integer.valueOf(1)).a(d.f, (Object) Long.valueOf(cda.c())));
        C7471uYa.a((Object) a2, "propellerDatabase.delete…tUrn.numericId)\n        )");
        return a2;
    }

    public IPa<List<C7843zta>> a(Integer num, long j) {
        IPa<List<C7843zta>> p = this.b.a(b(num, j)).h(C4818Cta.a).p();
        C7471uYa.a((Object) p, "propellerRx\n            …         .singleOrError()");
        return p;
    }

    public IPa<C6431fLa> b(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        if (cda.u()) {
            IPa<C6431fLa> p = this.b.a((a) new C4911Fta(this, cda)).p();
            C7471uYa.a((Object) p, "propellerRx.runTransacti…       }).singleOrError()");
            return p;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("urn argument: ");
        sb.append(cda);
        sb.append(" is not a playlist urn");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ IPa a(C4942Gta gta, Integer num, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                num = null;
            }
            return gta.a(num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadPostedPlaylists");
    }

    private C6975nLa c() {
        C6975nLa a2 = ((C6975nLa) ((C6975nLa) C6975nLa.a(d.c).a(d.f, d.g).a(d.d, (Object) "post")).a(d.e, (Object) Integer.valueOf(0))).a(d.g.e(), b.DESC);
        C7471uYa.a((Object) a2, "Query.from(Tables.Posts.…Name(), Query.Order.DESC)");
        return a2;
    }

    public IPa<List<C7843zta>> a(Integer num) {
        return a(num, Long.MAX_VALUE);
    }

    private C6975nLa b(Integer num, long j) {
        C6975nLa a2 = ((C6975nLa) ((C6975nLa) ((C6975nLa) ((C6975nLa) C6975nLa.a(d.c).a(d.f, d.g).a(d.i)).a(d.d, (Object) "post")).a(d.e, (Object) Integer.valueOf(1))).b(d.g, (Object) Long.valueOf(j))).a(d.g, b.DESC);
        if (num != null) {
            C6975nLa a3 = a2.a(num.intValue());
            if (a3 != null) {
                return a3;
            }
        }
        C7471uYa.a((Object) a2, "query");
        return a2;
    }

    public IPa<C3508cda> a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        IPa<C3508cda> e = this.b.a((C5116MLa) d.c, a(cda, this.c.a())).p().e(new C4756Ata(cda));
        C7471uYa.a((Object) e, "propellerRx.insert(Table…ngleOrError().map { urn }");
        return e;
    }

    private ContentValues a(C3508cda cda, long j) {
        ContentValues a2 = C5296SKa.b().a(d.f, cda.c()).a(d.e, 1).a(d.g, j).a(d.d, "post").a();
        C7471uYa.a((Object) a2, "ContentValuesBuilder.val…_POST)\n            .get()");
        return a2;
    }

    public void a() {
        this.a.a((C5116MLa) d.c);
    }

    public C5266RKa a(C3508cda cda, C3927zda zda) {
        C7471uYa.b(cda, "localPlaylistUrn");
        C7471uYa.b(zda, "newPlaylist");
        C5296SKa a2 = C5296SKa.a(2);
        a2.a(d.f, zda.a().c());
        a2.a(d.g, zda.g().getTime());
        C5266RKa a3 = this.a.a((C5116MLa) d.c, a2.a(), C6907mLa.a().a(d.f, (Object) Long.valueOf(cda.c())).a(d.e, (Object) Integer.valueOf(1)));
        C7471uYa.a((Object) a3, "propellerDatabase.update….TYPE_PLAYLIST)\n        )");
        return a3;
    }
}
