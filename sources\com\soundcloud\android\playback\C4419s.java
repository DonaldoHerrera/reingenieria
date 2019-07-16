package com.soundcloud.android.playback;

import android.view.TextureView;
import com.google.common.base.Predicate;

/* renamed from: com.soundcloud.android.playback.s reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4419s implements Predicate {
    private final /* synthetic */ TextureView a;
    private final /* synthetic */ String b;

    public /* synthetic */ C4419s(TextureView textureView, String str) {
        this.a = textureView;
        this.b = str;
    }

    public final boolean apply(Object obj) {
        return ke.a(this.a, this.b, (me) obj);
    }
}
