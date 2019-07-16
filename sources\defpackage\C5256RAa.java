package defpackage;

import com.soundcloud.android.sync.W;
import com.soundcloud.android.sync.na;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: RAa reason: default package and case insensitive filesystem */
/* compiled from: EntitySyncJob */
public class C5256RAa<T> extends W {
    private final _S<T, T> a;
    private final C6776kQa<Collection<T>> b;
    private final C1255eT<Collection<T>, Boolean> c;
    private List<C3508cda> d = Collections.emptyList();
    private Set<C3508cda> e = Collections.emptySet();
    private Collection<T> f = Collections.emptyList();
    private Exception g;

    public C5256RAa(_S<T, T> _s, C6776kQa<Collection<T>> kqa, C7236rAa raa) {
        this.a = _s;
        this.b = kqa;
        this.c = raa;
    }

    public void a(List<C3508cda> list) {
        this.d = list;
        this.e = new HashSet(list);
    }

    public C4928GKa<na> b() {
        return C4928GKa.a();
    }

    public void c() {
    }

    public boolean d() {
        return this.g == null;
    }

    public boolean e() {
        return this.g == null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5256RAa.class != obj.getClass()) {
            return false;
        }
        return this.e.equals(((C5256RAa) obj).e);
    }

    public void f() {
        this.c.b(this.f);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public void run() {
        try {
            if (!this.d.isEmpty()) {
                this.f = ((_S) this.a.a(this.d)).call();
                this.b.accept(this.f);
            }
        } catch (Exception e2) {
            C7316sHa.b((Throwable) e2, C5256RAa.class);
            this.g = e2;
        }
    }

    public Exception a() {
        return this.g;
    }
}
