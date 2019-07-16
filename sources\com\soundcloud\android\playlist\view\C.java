package com.soundcloud.android.playlist.view;

import android.annotation.SuppressLint;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

@EVa(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u001e\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0018H\u0017J\u0016\u0010\u001f\u001a\u00020\u001b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0017J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/soundcloud/android/playlist/view/PlaylistDetailsAdapter;", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "Lcom/soundcloud/android/playlists/PlaylistDetailItem;", "playlistDetailView", "Lcom/soundcloud/android/playlist/view/PlaylistDetailsAdapter$PlaylistDetailView;", "playlistDetailsHeaderRenderer", "Lcom/soundcloud/android/playlist/view/PlaylistDetailsHeaderRenderer;", "emptyItemRenderer", "Lcom/soundcloud/android/playlist/view/PlaylistDetailsEmptyItemRenderer;", "playlistDetailTrackViewRenderer", "Lcom/soundcloud/android/playlist/view/PlaylistTrackItemRenderer;", "upsellItemRenderer", "Lcom/soundcloud/android/playlist/view/PlaylistUpsellItemRenderer;", "recommendationsItemRenderer", "Lcom/soundcloud/android/playlist/view/PlaylistDetailOtherPlaylistsItemRenderer;", "(Lcom/soundcloud/android/playlist/view/PlaylistDetailsAdapter$PlaylistDetailView;Lcom/soundcloud/android/playlist/view/PlaylistDetailsHeaderRenderer;Lcom/soundcloud/android/playlist/view/PlaylistDetailsEmptyItemRenderer;Lcom/soundcloud/android/playlist/view/PlaylistTrackItemRenderer;Lcom/soundcloud/android/playlist/view/PlaylistUpsellItemRenderer;Lcom/soundcloud/android/playlist/view/PlaylistDetailOtherPlaylistsItemRenderer;)V", "trackItemClick", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/playlists/PlaylistDetailItem$PlaylistDetailTrackItem;", "createDragListener", "Landroid/view/View$OnTouchListener;", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getBasicItemViewType", "", "i", "onItemBound", "", "scViewHolder", "Lcom/soundcloud/android/uniflow/android/ScViewHolder;", "position", "onViewRecycled", "upsellClickListener", "Lcom/soundcloud/android/upsell/UpsellItemRenderer$Listener;", "Lcom/soundcloud/android/playlists/PlaylistDetailItem$PlaylistDetailUpsellItem;", "PlaylistDetailView", "playlist_release"}, mv = {1, 1, 15})
/* compiled from: PlaylistDetailsAdapter.kt */
public final class C extends C5407WEa<C6260cqa> {
    private final APa<e> g;
    /* access modifiers changed from: private */
    public final a h;

    /* compiled from: PlaylistDetailsAdapter.kt */
    public interface a {
        void a(ViewHolder viewHolder);

        void a(f fVar);

        void b(f fVar);

        void c(f fVar);
    }

    public C(a aVar, P p, I i, aa aaVar, ca caVar, C5753y yVar) {
        C7471uYa.b(aVar, "playlistDetailView");
        C7471uYa.b(p, "playlistDetailsHeaderRenderer");
        C7471uYa.b(i, "emptyItemRenderer");
        C7471uYa.b(aaVar, "playlistDetailTrackViewRenderer");
        C7471uYa.b(caVar, "upsellItemRenderer");
        C7471uYa.b(yVar, "recommendationsItemRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(b.HeaderItem.ordinal(), p), new C5693cFa(b.TrackItem.ordinal(), aaVar), new C5693cFa(b.UpsellItem.ordinal(), caVar), new C5693cFa(b.OtherPlaylists.ordinal(), yVar), new C5693cFa(b.EmptyItem.ordinal(), i)});
        this.h = aVar;
        APa<e> a2 = aaVar.a();
        C7471uYa.a((Object) a2, "playlistDetailTrackViewRenderer.trackItemClick()");
        this.g = a2;
        caVar.a(a(this.h));
    }

    private final OnTouchListener e(ViewHolder viewHolder) {
        return new D(this, viewHolder);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void b(C5378VEa<C6260cqa> vEa, int i) {
        C7471uYa.b(vEa, "scViewHolder");
        super.b(vEa, i);
        ImageView a2 = a.a(vEa.itemView);
        if (a2 != null) {
            a2.setOnTouchListener(e(vEa));
        }
    }

    public int f(int i) {
        return ((C6260cqa) g(i)).c().ordinal();
    }

    public final APa<e> j() {
        APa<e> a2 = this.g.a((C7256rQa<? super T>) E.a);
        C7471uYa.a((Object) a2, "trackItemClick.filter { !it.isInEditMode }");
        return a2;
    }

    private final com.soundcloud.android.upsell.m.a<f> a(a aVar) {
        return new F(aVar);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: a */
    public void d(C5378VEa<C6260cqa> vEa) {
        C7471uYa.b(vEa, "holder");
        super.d(vEa);
        ImageView a2 = a.a(vEa.itemView);
        if (a2 != null) {
            a2.setOnTouchListener(null);
        }
    }
}
