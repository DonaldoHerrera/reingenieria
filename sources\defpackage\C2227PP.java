package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;

/* renamed from: PP reason: default package and case insensitive filesystem */
/* compiled from: ApiStreamItem */
public class C2227PP {
    private C3378yP a;
    private C2208OP b;
    private C2284SP c;
    private C2303TP d;
    private C2246QP e;
    private C2265RP f;

    @JsonCreator
    public C2227PP(@JsonProperty("promoted_track") C3378yP yPVar, @JsonProperty("promoted_playlist") C2208OP op, @JsonProperty("track_post") C2284SP sp, @JsonProperty("track_repost") C2303TP tp, @JsonProperty("playlist_post") C2246QP qp, @JsonProperty("playlist_repost") C2265RP rp) {
        this.a = yPVar;
        this.b = op;
        this.c = sp;
        this.d = tp;
        this.e = qp;
        this.f = rp;
    }

    public C4928GKa<String> a() {
        C3378yP yPVar = this.a;
        if (yPVar != null) {
            return C4928GKa.c(yPVar.a());
        }
        C2208OP op = this.b;
        if (op != null) {
            return C4928GKa.c(op.a());
        }
        return C4928GKa.a();
    }

    public long b() {
        C2284SP sp = this.c;
        if (sp != null) {
            return sp.b();
        }
        C2303TP tp = this.d;
        if (tp != null) {
            return tp.b();
        }
        C2246QP qp = this.e;
        if (qp != null) {
            return qp.b();
        }
        C2265RP rp = this.f;
        if (rp != null) {
            return rp.b();
        }
        if (this.a != null || this.b != null) {
            return Long.MAX_VALUE;
        }
        throw new IllegalArgumentException("Unknown stream item type when fetching creation date");
    }

    public C4928GKa<C3927zda> c() {
        C2246QP qp = this.e;
        if (qp != null) {
            return C4928GKa.c(qp.a());
        }
        C2265RP rp = this.f;
        if (rp != null) {
            return C4928GKa.c(rp.a());
        }
        C2208OP op = this.b;
        if (op != null) {
            return C4928GKa.c(op.b());
        }
        return C4928GKa.a();
    }

    public C4928GKa<C3776gea> d() {
        C3378yP yPVar = this.a;
        if (yPVar != null) {
            return C4928GKa.b(yPVar.d());
        }
        C2208OP op = this.b;
        if (op != null) {
            return C4928GKa.b(op.c());
        }
        return C4928GKa.a();
    }

    public C4928GKa<C3776gea> e() {
        C2303TP tp = this.d;
        if (tp != null) {
            return C4928GKa.c(tp.c());
        }
        C2265RP rp = this.f;
        if (rp != null) {
            return C4928GKa.c(rp.c());
        }
        return C4928GKa.a();
    }

    public C4928GKa<Yda> f() {
        C2284SP sp = this.c;
        if (sp != null) {
            return C4928GKa.c(sp.a());
        }
        C2303TP tp = this.d;
        if (tp != null) {
            return C4928GKa.c(tp.a());
        }
        C3378yP yPVar = this.a;
        if (yPVar != null) {
            return C4928GKa.c(yPVar.b());
        }
        return C4928GKa.a();
    }

    public List<String> g() {
        C3378yP yPVar = this.a;
        if (yPVar != null) {
            return yPVar.g();
        }
        C2208OP op = this.b;
        if (op != null) {
            return op.d();
        }
        return Collections.emptyList();
    }

    public List<String> h() {
        C3378yP yPVar = this.a;
        if (yPVar != null) {
            return yPVar.h();
        }
        C2208OP op = this.b;
        if (op != null) {
            return op.e();
        }
        return Collections.emptyList();
    }

    public List<String> i() {
        C3378yP yPVar = this.a;
        if (yPVar != null) {
            return yPVar.e();
        }
        C2208OP op = this.b;
        if (op != null) {
            return op.f();
        }
        return Collections.emptyList();
    }

    public List<String> j() {
        C3378yP yPVar = this.a;
        if (yPVar != null) {
            return yPVar.f();
        }
        C2208OP op = this.b;
        if (op != null) {
            return op.g();
        }
        return Collections.emptyList();
    }

    public List<String> k() {
        C3378yP yPVar = this.a;
        if (yPVar != null) {
            return yPVar.i();
        }
        C2208OP op = this.b;
        if (op != null) {
            return op.h();
        }
        return Collections.emptyList();
    }

    public boolean l() {
        return (this.a == null && this.b == null) ? false : true;
    }
}
