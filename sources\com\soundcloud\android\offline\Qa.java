package com.soundcloud.android.offline;

import com.google.common.base.Function;
import java.util.Collection;
import java.util.List;

/* compiled from: lambda */
public final /* synthetic */ class Qa implements C7118pQa {
    private final /* synthetic */ Collection a;

    public /* synthetic */ Qa(Collection collection) {
        this.a = collection;
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(C2063HD.a((List) obj, (Function<? super F, ? extends T>) C4067cb.a).containsAll(this.a));
    }
}
