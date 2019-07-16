package com.soundcloud.android.stations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;
import java.util.List;

/* compiled from: ApiStation */
public final class r implements Sda {
    private final Function<Yda, Tda> a = new C6038q(this);
    private final C6043s b;
    private final List<Yda> c;
    /* access modifiers changed from: private */
    public final C3508cda d;

    @JsonCreator
    public r(@JsonProperty("station") C6043s sVar, @JsonProperty("tracks") Pca<Yda> pca) {
        this.b = sVar;
        this.c = pca.f();
        this.d = (C3508cda) pca.j().d(C3508cda.a);
    }

    public C4928GKa<String> b() {
        return this.b.a();
    }

    public int c() {
        return -1;
    }

    public String d() {
        return this.b.b();
    }

    public List<Tda> e() {
        return C2063HD.a(this.c, this.a);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (!C4804CKa.a(this.b, rVar.b) || !C4804CKa.a(this.c, rVar.c)) {
            z = false;
        }
        return z;
    }

    public List<Yda> f() {
        return this.c;
    }

    public String getTitle() {
        return this.b.c();
    }

    public String getType() {
        return this.b.d();
    }

    public int hashCode() {
        return C4804CKa.a(this.b, this.c);
    }

    public C3508cda a() {
        return this.b.e();
    }
}
