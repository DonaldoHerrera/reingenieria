package com.soundcloud.android.foundation.playqueue;

import com.google.common.base.Function;
import java.util.Map;

/* renamed from: com.soundcloud.android.foundation.playqueue.a reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C3714a implements Function {
    private final /* synthetic */ PlaySessionSource a;
    private final /* synthetic */ Map b;

    public /* synthetic */ C3714a(PlaySessionSource playSessionSource, Map map) {
        this.a = playSessionSource;
        this.b = map;
    }

    public final Object apply(Object obj) {
        return o.a(this.a, this.b, (C3508cda) obj);
    }
}
