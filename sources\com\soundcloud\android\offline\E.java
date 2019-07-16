package com.soundcloud.android.offline;

import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.List;

/* compiled from: lambda */
public final /* synthetic */ class E implements Predicate {
    private final /* synthetic */ List a;
    private final /* synthetic */ List b;
    private final /* synthetic */ Collection c;

    public /* synthetic */ E(List list, List list2, Collection collection) {
        this.a = list;
        this.b = list2;
        this.c = collection;
    }

    public final boolean apply(Object obj) {
        return C4175uc.a(this.a, this.b, this.c, (C3508cda) obj);
    }
}
