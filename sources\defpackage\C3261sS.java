package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;
import java.util.List;

/* renamed from: sS reason: default package and case insensitive filesystem */
/* compiled from: CastPlayQueue */
public abstract class C3261sS {

    /* renamed from: sS$a */
    /* compiled from: CastPlayQueue */
    static abstract class a {
        a() {
        }

        /* access modifiers changed from: 0000 */
        public abstract a a(int i);

        /* access modifiers changed from: 0000 */
        public abstract a a(long j);

        /* access modifiers changed from: 0000 */
        public abstract a a(C4928GKa<C3183oS> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a a(String str);

        /* access modifiers changed from: 0000 */
        public abstract a a(List<C3341wS> list);

        /* access modifiers changed from: 0000 */
        public a a(C3183oS oSVar) {
            return a(C4928GKa.c(oSVar));
        }

        /* access modifiers changed from: 0000 */
        public abstract C3261sS a();

        /* access modifiers changed from: 0000 */
        public abstract a b(C4928GKa<String> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a b(String str);
    }

    @JsonCreator
    public static C3261sS a(@JsonProperty("revision") String str, @JsonProperty("queue") List<C3341wS> list, @JsonProperty("current_index") int i, @JsonProperty("progress") long j, @JsonProperty("source") String str2, @JsonProperty("version") String str3, @JsonProperty("credentials") C3183oS oSVar) {
        a a2 = new a().b(C4928GKa.c(str)).a(list).a(i).a(j);
        if (str2 == null) {
            str2 = "";
        }
        return a2.a(str2).b(str3).a(C4928GKa.b(oSVar)).a();
    }

    @JsonProperty("credentials")
    public abstract C4928GKa<C3183oS> a();

    @JsonProperty("current_index")
    public abstract int b();

    @JsonIgnore
    public C3508cda c() {
        int b = b();
        return b >= 0 && b < g().size() ? ((C3341wS) g().get(b)).b() : C3508cda.a;
    }

    @JsonIgnore
    public List<C3508cda> d() {
        return C2063HD.a(g(), (Function<? super F, ? extends T>) C3059iS.a);
    }

    @JsonIgnore
    public boolean e() {
        return g().isEmpty();
    }

    @JsonProperty("progress")
    public abstract long f();

    @JsonProperty("queue")
    public abstract List<C3341wS> g();

    @JsonProperty("revision")
    public abstract C4928GKa<String> h();

    @JsonProperty("source")
    public abstract String i();

    public abstract a j();

    @JsonProperty("version")
    public abstract String k();

    private static a a(C3508cda cda, List<C3508cda> list) {
        return new a().b(C4928GKa.a()).a(C2063HD.a(list, (Function<? super F, ? extends T>) C3040hS.a)).a(list.indexOf(cda)).a(0).a("").b("1.0.0").a(C4928GKa.a());
    }

    public static C3261sS a(C4928GKa<String> gKa, C3508cda cda, List<C3508cda> list) {
        return a(cda, list).b(gKa).a();
    }

    public static C3261sS a(C3508cda cda, long j, C3261sS sSVar) {
        return sSVar.j().a(sSVar.d().indexOf(cda)).a(j).a();
    }

    public C3261sS a(C3183oS oSVar) {
        return j().a(oSVar).a();
    }

    @JsonIgnore
    public boolean a(C3508cda cda) {
        return d().contains(cda);
    }

    @JsonIgnore
    public boolean a(List<C3508cda> list) {
        return !e() && list != null && list.equals(d());
    }
}
