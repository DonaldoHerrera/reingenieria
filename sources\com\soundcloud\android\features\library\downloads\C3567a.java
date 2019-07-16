package com.soundcloud.android.features.library.downloads;

import com.soundcloud.android.features.library.downloads.s.a;
import com.soundcloud.android.features.library.downloads.s.b;
import java.util.List;

@EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u001e\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u000f0\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/features/library/downloads/DownloadsAdapter;", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "Lcom/soundcloud/android/features/library/downloads/DownloadsLibraryItem;", "downloadsPlaylistRenderer", "Lcom/soundcloud/android/features/library/downloads/DownloadsPlaylistRenderer;", "downloadsTrackRenderer", "Lcom/soundcloud/android/features/library/downloads/DownloadsTrackRenderer;", "(Lcom/soundcloud/android/features/library/downloads/DownloadsPlaylistRenderer;Lcom/soundcloud/android/features/library/downloads/DownloadsTrackRenderer;)V", "getBasicItemViewType", "", "i", "playlistClicks", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/features/library/downloads/DownloadsLibraryItem$Playlist;", "trackClick", "Lkotlin/Pair;", "", "Companion", "collections-ui_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.features.library.downloads.a reason: case insensitive filesystem */
/* compiled from: DownloadsAdapter.kt */
public final class C3567a extends C5407WEa<s> {
    public static final C0082a g = new C0082a(null);
    private final w h;
    private final I i;

    /* renamed from: com.soundcloud.android.features.library.downloads.a$a reason: collision with other inner class name */
    /* compiled from: DownloadsAdapter.kt */
    public static final class C0082a {
        private C0082a() {
        }

        public /* synthetic */ C0082a(C7264rYa rya) {
            this();
        }
    }

    public C3567a(w wVar, I i2) {
        C7471uYa.b(wVar, "downloadsPlaylistRenderer");
        C7471uYa.b(i2, "downloadsTrackRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(1, wVar), new C5693cFa(2, i2)});
        this.h = wVar;
        this.i = i2;
    }

    public int f(int i2) {
        s sVar = (s) g(i2);
        if (sVar instanceof a) {
            return 1;
        }
        if (sVar instanceof b) {
            return 2;
        }
        throw new FVa();
    }

    public final APa<a> j() {
        return this.h.a();
    }

    public final APa<HVa<s, List<s>>> k() {
        APa<HVa<s, List<s>>> h2 = this.i.a().h(new C3568b(this));
        C7471uYa.a((Object) h2, "downloadsTrackRenderer.t… { getItem(it) to items }");
        return h2;
    }
}
