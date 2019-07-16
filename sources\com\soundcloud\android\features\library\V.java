package com.soundcloud.android.features.library;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.collection.B;
import com.soundcloud.android.features.library.aa.l;

@EVa(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001cJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001cJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001cJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001cJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001f\u0010\u000e\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u001f\u0010\u0012\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b¨\u0006\""}, d2 = {"Lcom/soundcloud/android/features/library/LibraryPreviewRenderer;", "Lcom/soundcloud/android/uniflow/android/ViewHolderFactory;", "Lcom/soundcloud/android/collection/CollectionItem;", "downloadsInLibraryExperiment", "Lcom/soundcloud/android/configuration/experiments/DownloadsInLibraryExperiment;", "(Lcom/soundcloud/android/configuration/experiments/DownloadsInLibraryExperiment;)V", "downloadsRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", "getDownloadsRelay", "()Lcom/jakewharton/rxrelay2/PublishRelay;", "followingRelay", "getFollowingRelay", "likeRelay", "getLikeRelay", "playlistsRelay", "getPlaylistsRelay", "stationsRelay", "getStationsRelay", "buildLegacyViewHolder", "Lcom/soundcloud/android/features/library/LibraryPreviewRenderer$Holder;", "parent", "Landroid/view/ViewGroup;", "buildViewHolder", "createViewHolder", "Lcom/soundcloud/android/uniflow/android/ScViewHolder;", "downloadsClick", "Lio/reactivex/Observable;", "followingClick", "likesClick", "playlistsClick", "stationsClick", "Holder", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: LibraryPreviewRenderer.kt */
public final class V implements C6289dFa<B> {
    private final C2332VH<RVa> a;
    private final C2332VH<RVa> b;
    private final C2332VH<RVa> c;
    private final C2332VH<RVa> d;
    private final C2332VH<RVa> e;
    private final C2080HU f;

    /* compiled from: LibraryPreviewRenderer.kt */
    private static final class a extends C5378VEa<B> {
        public a(View view) {
            C7471uYa.b(view, "view");
            super(view);
        }

        public void a(B b) {
            C7471uYa.b(b, "item");
        }
    }

    public V(C2080HU hu) {
        C7471uYa.b(hu, "downloadsInLibraryExperiment");
        this.f = hu;
        C2332VH<RVa> s = C2332VH.s();
        String str = "PublishRelay.create<Unit>()";
        C7471uYa.a((Object) s, str);
        this.a = s;
        C2332VH<RVa> s2 = C2332VH.s();
        C7471uYa.a((Object) s2, str);
        this.b = s2;
        C2332VH<RVa> s3 = C2332VH.s();
        C7471uYa.a((Object) s3, str);
        this.c = s3;
        C2332VH<RVa> s4 = C2332VH.s();
        C7471uYa.a((Object) s4, str);
        this.d = s4;
        C2332VH<RVa> s5 = C2332VH.s();
        C7471uYa.a((Object) s5, str);
        this.e = s5;
    }

    public C5378VEa<B> a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        if (this.f.a()) {
            return c(viewGroup);
        }
        return b(viewGroup);
    }

    public final APa<RVa> b() {
        APa<RVa> h = this.c.h();
        C7471uYa.a((Object) h, "followingRelay.hide()");
        return h;
    }

    public final C2332VH<RVa> c() {
        return this.e;
    }

    public final C2332VH<RVa> d() {
        return this.c;
    }

    public final C2332VH<RVa> e() {
        return this.a;
    }

    public final C2332VH<RVa> f() {
        return this.b;
    }

    public final C2332VH<RVa> g() {
        return this.d;
    }

    public final APa<RVa> h() {
        APa<RVa> h = this.a.h();
        C7471uYa.a((Object) h, "likeRelay.hide()");
        return h;
    }

    public final APa<RVa> i() {
        APa<RVa> h = this.b.h();
        C7471uYa.a((Object) h, "playlistsRelay.hide()");
        return h;
    }

    public final APa<RVa> j() {
        APa<RVa> h = this.d.h();
        C7471uYa.a((Object) h, "stationsRelay.hide()");
        return h;
    }

    private final a b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.legacy_library_header_item, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…ader_item, parent, false)");
        if (inflate instanceof LegacyLibraryHeaderItem) {
            LegacyLibraryHeaderItem legacyLibraryHeaderItem = (LegacyLibraryHeaderItem) inflate;
            legacyLibraryHeaderItem.setOnClickListeners(new W(this));
            return new a(legacyLibraryHeaderItem);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(inflate);
        sb.append(" not of type ");
        sb.append(LegacyLibraryHeaderItem.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }

    private final a c(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.library_header_item, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…ader_item, parent, false)");
        if (inflate instanceof LibraryHeaderItem) {
            LibraryHeaderItem libraryHeaderItem = (LibraryHeaderItem) inflate;
            libraryHeaderItem.setOnClickListeners(new X(this));
            return new a(libraryHeaderItem);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(inflate);
        sb.append(" not of type ");
        sb.append(LibraryHeaderItem.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }

    public final APa<RVa> a() {
        APa<RVa> h = this.e.h();
        C7471uYa.a((Object) h, "downloadsRelay.hide()");
        return h;
    }
}
