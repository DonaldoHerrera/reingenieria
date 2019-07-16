package com.soundcloud.android.features.library.downloads;

import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.features.library.downloads.s.b;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.C6188na;
import com.soundcloud.android.tracks.C6192pa;

@EVa(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/soundcloud/android/features/library/downloads/DownloadsTrackRenderer;", "Lcom/soundcloud/android/uniflow/android/ViewHolderFactory;", "Lcom/soundcloud/android/features/library/downloads/DownloadsLibraryItem$Track;", "menuPresenter", "Lcom/soundcloud/android/tracks/TrackItemMenuPresenter;", "trackItemViewFactory", "Lcom/soundcloud/android/tracks/TrackItemView$Factory;", "trackItemRenderer", "Lcom/soundcloud/android/tracks/TrackItemRenderer;", "(Lcom/soundcloud/android/tracks/TrackItemMenuPresenter;Lcom/soundcloud/android/tracks/TrackItemView$Factory;Lcom/soundcloud/android/tracks/TrackItemRenderer;)V", "trackClick", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", "createViewHolder", "Lcom/soundcloud/android/uniflow/android/ScViewHolder;", "parent", "Landroid/view/ViewGroup;", "Lio/reactivex/Observable;", "DownloadsTrackViewHolder", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: DownloadsTrackRenderer.kt */
public final class I implements C6289dFa<b> {
    /* access modifiers changed from: private */
    public final C2332VH<Integer> a;
    /* access modifiers changed from: private */
    public final C6188na b;
    private final com.soundcloud.android.tracks.Ea.a c;
    /* access modifiers changed from: private */
    public final C6192pa d;

    /* compiled from: DownloadsTrackRenderer.kt */
    public final class a extends C5378VEa<b> {
        /* access modifiers changed from: private */
        public final View a;
        final /* synthetic */ I b;

        public a(I i, View view) {
            C7471uYa.b(view, "view");
            this.b = i;
            super(view);
            View findViewById = this.itemView.findViewById(i.overflow_button);
            C7471uYa.a((Object) findViewById, "itemView.findViewById(ba…esources.overflow_button)");
            this.a = findViewById;
        }

        public void a(b bVar) {
            C7471uYa.b(bVar, "item");
            C6185ma c = bVar.c();
            this.itemView.setOnClickListener(new G(this, bVar));
            this.a.setOnClickListener(new H(this, bVar));
            C6192pa c2 = this.b.d;
            View view = this.itemView;
            C7471uYa.a((Object) view, "itemView");
            C6192pa.a(c2, c, view, (com.soundcloud.android.foundation.events.I) null, 4, (Object) null);
        }
    }

    public I(C6188na naVar, com.soundcloud.android.tracks.Ea.a aVar, C6192pa paVar) {
        C7471uYa.b(naVar, "menuPresenter");
        C7471uYa.b(aVar, "trackItemViewFactory");
        C7471uYa.b(paVar, "trackItemRenderer");
        this.b = naVar;
        this.c = aVar;
        this.d = paVar;
        C2332VH<Integer> s = C2332VH.s();
        C7471uYa.a((Object) s, "PublishRelay.create<Int>()");
        this.a = s;
    }

    public C5378VEa<b> a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View a2 = this.c.a(viewGroup, l.tracklist_item);
        C7471uYa.a((Object) a2, "trackItemViewFactory.cre…es.layout.tracklist_item)");
        return new a(this, a2);
    }

    public final APa<Integer> a() {
        return this.a;
    }
}
