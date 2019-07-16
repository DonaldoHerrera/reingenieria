package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;

/* renamed from: OT reason: default package and case insensitive filesystem */
/* compiled from: Configuration */
public abstract class C2212OT {

    /* renamed from: OT$a */
    /* compiled from: Configuration */
    public static abstract class a {
        public abstract a a(C2020EU eu);

        public abstract a a(C2155LT lt);

        public abstract a a(C2492cU cUVar);

        public abstract a a(C2966dV dVVar);

        public abstract a a(List<String> list);

        public abstract a a(boolean z);

        public abstract C2212OT a();
    }

    @JsonCreator
    public static C2212OT a(@JsonProperty("features") List<C2417ZU> list, @JsonProperty("plan") C2966dV dVVar, @JsonProperty("experiments") List<C2232PU> list2, @JsonProperty("device_management") C2492cU cUVar, @JsonProperty("self_destruct") boolean z, @JsonProperty("image_size_specs") List<String> list3, @JsonProperty("privacy_settings") C2155LT lt) {
        return new a().b(Collections.unmodifiableList(list)).a(dVVar).a(list2 == null ? C2020EU.a() : new C2020EU(list2)).a(cUVar).a(z).a(list3).a(lt).a();
    }

    public abstract C2020EU a();

    public abstract C2492cU b();

    public abstract List<C2417ZU> c();

    public abstract List<String> d();

    public abstract C2155LT e();

    public abstract C2966dV f();

    public abstract boolean g();
}
