package com.soundcloud.android.playback.playqueue;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.playback.ui.view.PlayerTrackArtworkView;
import com.soundcloud.android.playback.ui.view.PlayerTrackArtworkView.a;
import com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher;

@EVa(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\"\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0016R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/soundcloud/android/playback/playqueue/ArtworkView;", "Lcom/soundcloud/lightcycle/SupportFragmentLightCycleDispatcher;", "Landroidx/fragment/app/Fragment;", "Lcom/soundcloud/android/player/ui/PlayStateAware;", "Lcom/soundcloud/android/playback/ui/view/PlayerTrackArtworkView$OnWidthChangedListener;", "artworkPresenter", "Lcom/soundcloud/android/playback/playqueue/ArtworkPresenter;", "progressControllerFactory", "Lcom/soundcloud/android/player/ui/progress/ProgressController$Factory;", "playerArtworkLoader", "Lcom/soundcloud/android/playback/playqueue/BlurringPlayQueueArtworkLoader;", "(Lcom/soundcloud/android/playback/playqueue/ArtworkPresenter;Lcom/soundcloud/android/player/ui/progress/ProgressController$Factory;Lcom/soundcloud/android/playback/playqueue/BlurringPlayQueueArtworkLoader;)V", "artworkDisposable", "Lio/reactivex/disposables/Disposable;", "artworkView", "Lcom/soundcloud/android/playback/ui/view/PlayerTrackArtworkView;", "progressController", "Lcom/soundcloud/android/player/ui/progress/ProgressController;", "onArtworkSizeChanged", "", "onDestroyView", "fragment", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setImage", "imageResource", "Lcom/soundcloud/android/foundation/domain/ImageResource;", "setProgressControllerValues", "startX", "", "endX", "setState", "trackPageState", "Lcom/soundcloud/android/player/ui/ViewPlaybackState;", "base_release"}, mv = {1, 1, 15})
/* compiled from: ArtworkView.kt */
public class ArtworkView extends SupportFragmentLightCycleDispatcher<Fragment> implements Hna, a {
    private VPa a = C4881Eua.a();
    private PlayerTrackArtworkView b;
    private _na c;
    private final C4364ca d;
    private final b e;
    private final C4374ha f;

    public ArtworkView(C4364ca caVar, b bVar, C4374ha haVar) {
        C7471uYa.b(caVar, "artworkPresenter");
        C7471uYa.b(bVar, "progressControllerFactory");
        C7471uYa.b(haVar, "playerArtworkLoader");
        this.d = caVar;
        this.e = bVar;
        this.f = haVar;
    }

    /* renamed from: a */
    public void onViewCreated(Fragment fragment, View view, Bundle bundle) {
        C7471uYa.b(fragment, "fragment");
        C7471uYa.b(view, "view");
        super.onViewCreated(fragment, view, bundle);
        this.b = (PlayerTrackArtworkView) view.findViewById(i.artwork_view);
        PlayerTrackArtworkView playerTrackArtworkView = this.b;
        if (playerTrackArtworkView != null) {
            playerTrackArtworkView.setOnWidthChangedListener(this);
        }
        b bVar = this.e;
        PlayerTrackArtworkView playerTrackArtworkView2 = (PlayerTrackArtworkView) view.findViewById(i.artwork_view);
        C7471uYa.a((Object) playerTrackArtworkView2, "view.artwork_view");
        View artworkHolder = playerTrackArtworkView2.getArtworkHolder();
        C7471uYa.a((Object) artworkHolder, "view.artwork_view.artworkHolder");
        this.c = b.a(bVar, artworkHolder, false, false, 6, null);
        this.d.a(this);
    }

    public void setState(Nna nna) {
        C7471uYa.b(nna, "trackPageState");
        _na _na = this.c;
        if (_na != null) {
            _na.a(nna);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* renamed from: a */
    public void onDestroyView(Fragment fragment) {
        C7471uYa.b(fragment, "fragment");
        super.onDestroyView(fragment);
        this.b = null;
        this.d.a();
        this.a.dispose();
        this.c = null;
    }

    public void a(Vca vca) {
        C7471uYa.b(vca, "imageResource");
        PlayerTrackArtworkView playerTrackArtworkView = this.b;
        if (playerTrackArtworkView != null) {
            ImageView wrappedImageView = playerTrackArtworkView.getWrappedImageView();
            if (wrappedImageView != null) {
                C4374ha haVar = this.f;
                PlayerTrackArtworkView playerTrackArtworkView2 = this.b;
                IPa a2 = haVar.a(vca, wrappedImageView, playerTrackArtworkView2 != null ? playerTrackArtworkView2.getImageOverlay() : null, false);
                C5068Kua kua = new C5068Kua();
                a2.c(kua);
                C7471uYa.a((Object) kua, "playerArtworkLoader.load…(DefaultSingleObserver())");
                this.a = kua;
            }
        }
    }

    public void a(int i, int i2) {
        _na _na = this.c;
        if (_na != null) {
            _na.a((doa) new moa(i, i2));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void a() {
        PlayerTrackArtworkView playerTrackArtworkView = this.b;
        if (playerTrackArtworkView != null) {
            int width = playerTrackArtworkView.getWidth();
            ImageView wrappedImageView = playerTrackArtworkView.getWrappedImageView();
            C7471uYa.a((Object) wrappedImageView, "it.wrappedImageView");
            this.d.a(width, wrappedImageView.getMeasuredWidth());
        }
    }
}
