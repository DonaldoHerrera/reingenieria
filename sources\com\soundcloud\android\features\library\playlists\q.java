package com.soundcloud.android.features.library.playlists;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.collection.Ja;
import com.soundcloud.android.features.library.aa.g;
import com.soundcloud.android.features.library.aa.i;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.features.library.playlists.C3635l.c;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.view.OverflowAnchorImageButton;

@EVa(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionItemRenderer;", "Lcom/soundcloud/android/uniflow/android/ViewHolderFactory;", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionItem$Playlist;", "imageOperations", "Lcom/soundcloud/android/image/ImageOperations;", "featureOperations", "Lcom/soundcloud/android/configuration/plans/FeatureOperations;", "playlistItemMenuPresenter", "Lcom/soundcloud/android/playlists/PlaylistItemMenuPresenter;", "playlistItemIndicatorsView", "Lcom/soundcloud/android/collection/PlaylistItemIndicatorsView;", "(Lcom/soundcloud/android/image/ImageOperations;Lcom/soundcloud/android/configuration/plans/FeatureOperations;Lcom/soundcloud/android/playlists/PlaylistItemMenuPresenter;Lcom/soundcloud/android/collection/PlaylistItemIndicatorsView;)V", "playlistClick", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lcom/soundcloud/android/foundation/domain/Urn;", "kotlin.jvm.PlatformType", "createViewHolder", "Lcom/soundcloud/android/uniflow/android/ScViewHolder;", "parent", "Landroid/view/ViewGroup;", "Lio/reactivex/Observable;", "Holder", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: PlaylistCollectionItemRenderer.kt */
public final class q implements C6289dFa<c> {
    /* access modifiers changed from: private */
    public final C2332VH<C3508cda> a;
    /* access modifiers changed from: private */
    public final N b;
    /* access modifiers changed from: private */
    public final C2436_U c;
    /* access modifiers changed from: private */
    public final C7287rra d;
    /* access modifiers changed from: private */
    public final Ja e;

    /* compiled from: PlaylistCollectionItemRenderer.kt */
    public final class a extends C5378VEa<c> {
        private final ImageView a;
        private final TextView b;
        private final TextView c;
        private final View d;
        private final OverflowAnchorImageButton e;
        private final Resources f;
        final /* synthetic */ q g;

        public a(q qVar, View view) {
            C7471uYa.b(view, "view");
            this.g = qVar;
            super(view);
            View findViewById = this.itemView.findViewById(i.artwork);
            C7471uYa.a((Object) findViewById, "itemView.findViewById(R.id.artwork)");
            this.a = (ImageView) findViewById;
            View findViewById2 = this.itemView.findViewById(i.title);
            C7471uYa.a((Object) findViewById2, "itemView.findViewById(R.id.title)");
            this.b = (TextView) findViewById2;
            View findViewById3 = this.itemView.findViewById(i.creator);
            C7471uYa.a((Object) findViewById3, "itemView.findViewById(R.id.creator)");
            this.c = (TextView) findViewById3;
            View findViewById4 = this.itemView.findViewById(i.collections_playlist_item);
            C7471uYa.a((Object) findViewById4, "itemView.findViewById(R.…ollections_playlist_item)");
            this.d = findViewById4;
            View findViewById5 = this.itemView.findViewById(i.overflow_button);
            C7471uYa.a((Object) findViewById5, "itemView.findViewById(R.id.overflow_button)");
            this.e = (OverflowAnchorImageButton) findViewById5;
            View view2 = this.itemView;
            C7471uYa.a((Object) view2, "itemView");
            Resources resources = view2.getResources();
            if (resources != null) {
                this.f = resources;
            } else {
                C7471uYa.a();
                throw null;
            }
        }

        private final void b(C3863rda rda) {
            N b2 = this.g.b;
            C3508cda a2 = rda.a();
            C7471uYa.a((Object) a2, "urn");
            C4928GKa b3 = rda.b();
            C7471uYa.a((Object) b3, "imageUrlTemplate");
            C3721b b4 = C3721b.b(this.f);
            C7471uYa.a((Object) b4, "ApiImageSize.getFullImageSize(resources)");
            b2.a(a2, b3, b4, this.a, false);
        }

        public void a(c cVar) {
            C7471uYa.b(cVar, "item");
            C3863rda d2 = cVar.d();
            this.d.setOnClickListener(new C3638o(d2, this));
            this.b.setText(d2.B());
            this.c.setText(d2.d());
            a(d2, this.e);
            b(d2);
            this.g.e.a(this.itemView, d2.m(), d2.o(), a(d2));
        }

        private final C3823mda a(C3863rda rda) {
            if (this.g.c.l()) {
                return rda.r();
            }
            return C3823mda.NOT_OFFLINE;
        }

        private final void a(C3863rda rda, OverflowAnchorImageButton overflowAnchorImageButton) {
            overflowAnchorImageButton.setOnClickListener(new C3639p(this, rda, overflowAnchorImageButton));
            C5173OHa.a(overflowAnchorImageButton, g.playlist_item_overflow_menu_padding);
        }
    }

    public q(N n, C2436_U _u, C7287rra rra, Ja ja) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(rra, "playlistItemMenuPresenter");
        C7471uYa.b(ja, "playlistItemIndicatorsView");
        this.b = n;
        this.c = _u;
        this.d = rra;
        this.e = ja;
        C2332VH<C3508cda> s = C2332VH.s();
        C7471uYa.a((Object) s, "PublishRelay.create<Urn>()");
        this.a = s;
    }

    public C5378VEa<c> a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.collection_playlist_item, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…list_item, parent, false)");
        return new a(this, inflate);
    }

    public final APa<C3508cda> a() {
        return this.a;
    }
}
