package defpackage;

import com.google.common.base.Function;
import java.util.Iterator;

/* renamed from: MP reason: default package and case insensitive filesystem */
/* compiled from: PagedCollection */
public abstract class C2170MP<T> implements Iterable<T> {
    final Pca<T> a;

    protected C2170MP(Pca<T> pca) {
        this.a = pca;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2170MP mp = (C2170MP) obj;
        Pca<T> pca = this.a;
        if (pca != null) {
            z = pca.equals(mp.a);
        } else if (mp.a != null) {
            z = false;
        }
        return z;
    }

    public Pca<T> f() {
        return this.a;
    }

    public C4928GKa<Oca> g() {
        return this.a.h();
    }

    public C4928GKa<String> h() {
        return g().b((Function<? super T, V>) C3278tP.a);
    }

    public int hashCode() {
        Pca<T> pca = this.a;
        if (pca != null) {
            return pca.hashCode();
        }
        return 0;
    }

    public Iterator<T> iterator() {
        return this.a.iterator();
    }
}
