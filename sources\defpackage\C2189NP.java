package defpackage;

import com.google.common.base.Function;

/* renamed from: NP reason: default package and case insensitive filesystem */
/* compiled from: PagedRemoteCollection */
public class C2189NP<T> extends C2170MP<T> {
    public C2189NP(Pca<T> pca) {
        super(pca);
    }

    public <S> C2189NP<S> a(Function<T, S> function) {
        return new C2189NP<>(this.a.a(function));
    }
}
