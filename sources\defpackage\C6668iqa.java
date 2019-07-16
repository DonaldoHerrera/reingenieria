package defpackage;

import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;

/* renamed from: iqa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistDetailsMetadataBuilder.kt */
public final class C6668iqa {
    private final C2436_U a;

    public C6668iqa(C2436_U _u) {
        C7471uYa.b(_u, "featureOperations");
        this.a = _u;
    }

    public final C6600hqa a(String str, PromotedSourceInfo promotedSourceInfo, SearchQuerySourceInfo searchQuerySourceInfo) {
        C7471uYa.b(str, "screen");
        return new C6600hqa(this.a, str, promotedSourceInfo, searchQuerySourceInfo);
    }
}
