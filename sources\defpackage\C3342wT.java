package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: wT reason: default package and case insensitive filesystem */
/* compiled from: LegacyApiComment */
public abstract class C3342wT implements C3282tT {

    /* renamed from: wT$a */
    /* compiled from: LegacyApiComment */
    public static abstract class a {
        public abstract a a(C4928GKa<Long> gKa);

        public abstract a a(C3508cda cda);

        public abstract a a(C3776gea gea);

        public abstract a a(String str);

        public abstract a a(Date date);

        public abstract C3342wT a();

        public abstract a b(C3508cda cda);
    }

    @JsonCreator
    public static C3342wT a(@JsonProperty("urn") String str, @JsonProperty("track_urn") String str2, @JsonProperty("track_time") C4928GKa<Long> gKa, @JsonProperty("body") String str3, @JsonProperty("created_at") Date date, @JsonProperty("commenter") C3776gea gea) {
        return c().b(new C3508cda(str)).a(new C3508cda(str2)).a(gKa).a(str3).a(date).a(gea).a();
    }

    public static a c() {
        return new a();
    }

    public abstract C3508cda a();

    public abstract Date b();

    public abstract C3776gea d();

    public abstract String f();

    public abstract C4928GKa<Long> g();

    public abstract C3508cda h();
}
