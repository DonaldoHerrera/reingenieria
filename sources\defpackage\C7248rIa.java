package defpackage;

import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;

/* renamed from: rIa reason: default package and case insensitive filesystem */
/* compiled from: ModelExtensions.kt */
public final class C7248rIa {
    public static final int a(SearchQuerySourceInfo searchQuerySourceInfo, C3508cda cda) {
        C7471uYa.b(searchQuerySourceInfo, "$this$getUpdatedResultPosition");
        C7471uYa.b(cda, "currentTrack");
        return (!searchQuerySourceInfo.b().x() || !(searchQuerySourceInfo.c().isEmpty() ^ true)) ? searchQuerySourceInfo.a() : searchQuerySourceInfo.c().indexOf(cda);
    }
}
