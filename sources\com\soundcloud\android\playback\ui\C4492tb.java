package com.soundcloud.android.playback.ui;

import android.view.View;
import android.widget.ImageView;
import com.soundcloud.android.playback.ui.view.PlayerTrackArtworkView;

@EVa(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001aB\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/soundcloud/android/playback/ui/PlayerArtworkController;", "Lcom/soundcloud/android/player/ui/PlayStateAware;", "Lcom/soundcloud/android/playback/ui/view/PlayerTrackArtworkView$OnWidthChangedListener;", "artworkView", "Lcom/soundcloud/android/playback/ui/view/PlayerTrackArtworkView;", "progressController", "Lcom/soundcloud/android/player/ui/progress/ProgressController;", "playerArtworkLoader", "Lcom/soundcloud/android/playback/ui/PlayerArtworkLoader;", "(Lcom/soundcloud/android/playback/ui/view/PlayerTrackArtworkView;Lcom/soundcloud/android/player/ui/progress/ProgressController;Lcom/soundcloud/android/playback/ui/PlayerArtworkLoader;)V", "helper", "Lcom/soundcloud/android/player/ui/progress/TranslateXHelper;", "clear", "", "loadArtwork", "Lio/reactivex/Single;", "Lcom/soundcloud/java/optional/Optional;", "Landroidx/palette/graphics/Palette;", "imageResource", "Lcom/soundcloud/android/foundation/domain/ImageResource;", "isHighPriority", "", "onArtworkSizeChanged", "setState", "trackPageState", "Lcom/soundcloud/android/player/ui/ViewPlaybackState;", "Factory", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.playback.ui.tb reason: case insensitive filesystem */
/* compiled from: PlayerArtworkController.kt */
public class C4492tb implements Hna, com.soundcloud.android.playback.ui.view.PlayerTrackArtworkView.a {
    private moa a;
    private final PlayerTrackArtworkView b;
    private final _na c;
    private final C4504xb d;

    /* renamed from: com.soundcloud.android.playback.ui.tb$a */
    /* compiled from: PlayerArtworkController.kt */
    public static class a {
        private final b a;
        private final C7054oVa<C4504xb> b;

        public a(b bVar, C7054oVa<C4504xb> ova) {
            C7471uYa.b(bVar, "animationControllerFactory");
            C7471uYa.b(ova, "playerArtworkLoaderProvider");
            this.a = bVar;
            this.b = ova;
        }

        public C4492tb a(PlayerTrackArtworkView playerTrackArtworkView) {
            C7471uYa.b(playerTrackArtworkView, "artworkView");
            b bVar = this.a;
            View artworkHolder = playerTrackArtworkView.getArtworkHolder();
            C7471uYa.a((Object) artworkHolder, "artworkView.artworkHolder");
            _na a2 = b.a(bVar, artworkHolder, false, true, 2, null);
            Object obj = this.b.get();
            C7471uYa.a(obj, "playerArtworkLoaderProvider.get()");
            return new C4492tb(playerTrackArtworkView, a2, (C4504xb) obj, null);
        }
    }

    public /* synthetic */ C4492tb(PlayerTrackArtworkView playerTrackArtworkView, _na _na, C4504xb xbVar, C7264rYa rya) {
        this(playerTrackArtworkView, _na, xbVar);
    }

    public void a() {
        int width = this.b.getWidth();
        ImageView wrappedImageView = this.b.getWrappedImageView();
        C7471uYa.a((Object) wrappedImageView, "artworkView.wrappedImageView");
        int measuredWidth = wrappedImageView.getMeasuredWidth();
        if (width > 0 && measuredWidth > 0) {
            moa moa = new moa(0, Math.min(0, -(measuredWidth - width)));
            this.c.a((doa) moa);
            this.a = moa;
        }
    }

    public void setState(Nna nna) {
        C7471uYa.b(nna, "trackPageState");
        this.c.a(nna);
        this.b.setArtworkActive(nna.d());
    }

    private C4492tb(PlayerTrackArtworkView playerTrackArtworkView, _na _na, C4504xb xbVar) {
        this.b = playerTrackArtworkView;
        this.c = _na;
        this.d = xbVar;
        this.b.setOnWidthChangedListener(this);
    }

    public IPa<C4928GKa<Fd>> a(Vca vca, boolean z) {
        C7471uYa.b(vca, "imageResource");
        C4504xb xbVar = this.d;
        ImageView wrappedImageView = this.b.getWrappedImageView();
        C7471uYa.a((Object) wrappedImageView, "artworkView.wrappedImageView");
        return xbVar.a(vca, wrappedImageView, this.b.getImageOverlay(), z);
    }
}
