package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: Pca reason: default package */
/* compiled from: ModelCollection */
public class Pca<T> implements Iterable<T> {
    protected final List<T> a;
    protected final Map<String, Oca> b;
    protected C3508cda c;

    public Pca() {
        this(Collections.emptyList());
    }

    public <O> Pca<O> a(List<O> list) {
        return new Pca<>(list, g(), this.c);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Pca)) {
            return false;
        }
        Pca pca = (Pca) obj;
        if (!C4804CKa.a(this.a, pca.a) || !C4804CKa.a(this.b, pca.b) || !C4804CKa.a(this.c, pca.c)) {
            z = false;
        }
        return z;
    }

    @JsonProperty("collection")
    public List<T> f() {
        return this.a;
    }

    @JsonProperty("links")
    public Map<String, Oca> g() {
        return this.b;
    }

    @JsonIgnore
    public C4928GKa<Oca> h() {
        return C4928GKa.b(this.b.get("next"));
    }

    public final int hashCode() {
        return C4804CKa.a(this.a, this.b, this.c);
    }

    public Iterator<T> iterator() {
        return this.a.iterator();
    }

    @JsonIgnore
    public C4928GKa<C3508cda> j() {
        return C4928GKa.b(this.c);
    }

    public Pca(List<T> list) {
        this.a = list;
        this.b = Collections.emptyMap();
    }

    public <S> Pca<S> a(Function<T, S> function) {
        return new Pca<>((List<T>) C2063HD.a(C1943BD.a((Iterable<F>) this.a, function)), this.b, this.c);
    }

    public Pca(List<T> list, Map<String, Oca> map) {
        this.a = list;
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.b = map;
    }

    @JsonCreator
    public Pca(@JsonProperty("collection") List<T> list, @JsonProperty("_links") Map<String, Oca> map, @JsonProperty("query_urn") String str) {
        this(list, map);
        if (str != null) {
            this.c = new C3508cda(str);
        }
    }

    public Pca(List<T> list, Map<String, Oca> map, C3508cda cda) {
        this(list, map);
        if (cda != null) {
            this.c = cda;
        }
    }
}
