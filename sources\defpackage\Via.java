package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.soundcloud.android.stations.r;

/* renamed from: Via reason: default package */
/* compiled from: ApiResolvedResource */
class Via {
    private final C4928GKa<Yda> a;
    private final C4928GKa<C3927zda> b;
    private final C4928GKa<C3776gea> c;
    private final C4928GKa<r> d;

    @JsonCreator
    Via(@JsonProperty("track") Yda yda, @JsonProperty("playlist") C3927zda zda, @JsonProperty("user") C3776gea gea, @JsonProperty("station") r rVar) {
        this.a = C4928GKa.b(yda);
        this.b = C4928GKa.b(zda);
        this.c = C4928GKa.b(gea);
        this.d = C4928GKa.b(rVar);
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<C3927zda> a() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<r> b() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<Yda> c() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<C3776gea> d() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public C3508cda e() {
        if (this.a.c()) {
            return ((Yda) this.a.b()).w();
        }
        if (this.b.c()) {
            return ((C3927zda) this.b.b()).a();
        }
        if (this.c.c()) {
            return ((C3776gea) this.c.b()).l();
        }
        if (this.d.c()) {
            return ((r) this.d.b()).a();
        }
        return C3508cda.a;
    }
}
