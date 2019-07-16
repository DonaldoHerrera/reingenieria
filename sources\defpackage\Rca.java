package defpackage;

import com.google.common.base.Predicate;

/* renamed from: Rca reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class Rca implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ Rca(int i) {
        this.a = i;
    }

    public final boolean apply(Object obj) {
        return Yca.a(this.a, (Yca) obj);
    }
}
