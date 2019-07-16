package com.soundcloud.android.features.library.playlists;

import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.features.library.playlists.C3635l.c;
import com.soundcloud.android.features.library.playlists.C3635l.d;

@EVa(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u001d\u001eB'\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0000¢\u0006\u0002\b\u001bJ\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionAdapter;", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionItem;", "Lcom/soundcloud/android/features/library/playlists/PlaylistHeaderRenderer$OnSettingsClickListener;", "Lcom/soundcloud/android/features/library/playlists/PlaylistRemoveFilterRenderer$OnRemoveFilterListener;", "headerRenderer", "Lcom/soundcloud/android/features/library/playlists/PlaylistHeaderRenderer;", "removeFilterRenderer", "Lcom/soundcloud/android/features/library/playlists/PlaylistRemoveFilterRenderer;", "emptyPlaylistsRenderer", "Lcom/soundcloud/android/features/library/playlists/EmptyPlaylistsRenderer;", "playlistRenderer", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionItemRenderer;", "(Lcom/soundcloud/android/features/library/playlists/PlaylistHeaderRenderer;Lcom/soundcloud/android/features/library/playlists/PlaylistRemoveFilterRenderer;Lcom/soundcloud/android/features/library/playlists/EmptyPlaylistsRenderer;Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionItemRenderer;)V", "listener", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionAdapter$Listener;", "getBasicItemViewType", "", "position", "onRemoveFilter", "", "onSettingsClicked", "view", "Landroid/view/View;", "playlistClick", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/foundation/domain/Urn;", "playlistClick$collections_ui_release", "setListener", "Companion", "Listener", "collections-ui_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.features.library.playlists.c reason: case insensitive filesystem */
/* compiled from: PlaylistCollectionAdapter.kt */
public final class C3626c extends C5407WEa<C3635l> implements com.soundcloud.android.features.library.playlists.G.a, a {
    public static final a g = new a(null);
    private b h;
    private final q i;

    /* renamed from: com.soundcloud.android.features.library.playlists.c$a */
    /* compiled from: PlaylistCollectionAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: com.soundcloud.android.features.library.playlists.c$b */
    /* compiled from: PlaylistCollectionAdapter.kt */
    public interface b {
        void a();

        void a(View view);
    }

    public C3626c(G g2, O o, C3624a aVar, q qVar) {
        C7471uYa.b(g2, "headerRenderer");
        C7471uYa.b(o, "removeFilterRenderer");
        C7471uYa.b(aVar, "emptyPlaylistsRenderer");
        C7471uYa.b(qVar, "playlistRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(1, g2), new C5693cFa(3, o), new C5693cFa(4, aVar), new C5693cFa(2, qVar)});
        this.i = qVar;
        g2.a(this);
        o.a((a) this);
    }

    public void a(View view) {
        C7471uYa.b(view, "view");
        b bVar = this.h;
        if (bVar != null) {
            bVar.a(view);
        }
    }

    public int f(int i2) {
        C3635l lVar = (C3635l) g(i2);
        if (lVar instanceof com.soundcloud.android.features.library.playlists.C3635l.b) {
            return 1;
        }
        if (lVar instanceof c) {
            return 2;
        }
        if (C7471uYa.a((Object) lVar, (Object) d.d)) {
            return 3;
        }
        if (C7471uYa.a((Object) lVar, (Object) com.soundcloud.android.features.library.playlists.C3635l.a.d)) {
            return 4;
        }
        throw new FVa();
    }

    public final APa<C3508cda> j() {
        return this.i.a();
    }

    public void a() {
        b bVar = this.h;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void a(b bVar) {
        C7471uYa.b(bVar, CastExtraArgs.LISTENER);
        this.h = bVar;
    }
}
