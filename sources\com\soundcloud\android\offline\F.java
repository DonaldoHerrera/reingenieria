package com.soundcloud.android.offline;

import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.List;

/* compiled from: lambda */
public final /* synthetic */ class F implements Predicate {
    private final /* synthetic */ List a;
    private final /* synthetic */ Collection b;

    public /* synthetic */ F(List list, Collection collection) {
        this.a = list;
        this.b = collection;
    }

    public final boolean apply(Object obj) {
        return C4175uc.a(this.a, this.b, (C4146pc) obj);
    }
}
