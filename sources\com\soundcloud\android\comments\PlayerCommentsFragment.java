package com.soundcloud.android.comments;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.comments.C2872ab.i;
import com.soundcloud.android.comments.C2872ab.l;
import com.soundcloud.android.playback.playqueue.ArtworkView;
import java.util.HashMap;

@EVa(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0002&'B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\nH\u0016J\u0012\u0010!\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020\u0019H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0010@\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0010@\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Lcom/soundcloud/android/comments/PlayerCommentsFragment;", "Lcom/soundcloud/android/comments/CommentsFragment;", "()V", "artworkView", "Lcom/soundcloud/android/playback/playqueue/ArtworkView;", "getArtworkView$track_comments_release", "()Lcom/soundcloud/android/playback/playqueue/ArtworkView;", "setArtworkView$track_comments_release", "(Lcom/soundcloud/android/playback/playqueue/ArtworkView;)V", "commentLayout", "", "getCommentLayout", "()I", "commentsEmptyStateProvider", "Lcom/soundcloud/android/comments/PlayerCommentsFragment$PlayerCommentsEmptyStateProvider;", "getCommentsEmptyStateProvider", "()Lcom/soundcloud/android/comments/PlayerCommentsFragment$PlayerCommentsEmptyStateProvider;", "playerPresenterLazy", "Ldagger/Lazy;", "Lcom/soundcloud/android/comments/PlayerCommentsPresenter;", "getPlayerPresenterLazy$track_comments_release", "()Ldagger/Lazy;", "setPlayerPresenterLazy$track_comments_release", "(Ldagger/Lazy;)V", "bindViews", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "createPresenter", "Lcom/soundcloud/android/comments/CommentsPresenter;", "getResId", "onCreate", "setTitleIfApplicable", "title", "", "unbindViews", "PlayerCommentsEmptyStateProvider", "PlayerCommentsFragmentFactory", "track-comments_release"}, mv = {1, 1, 15})
/* compiled from: PlayerCommentsFragment.kt */
public class PlayerCommentsFragment extends CommentsFragment {
    public ArtworkView I;
    public C4806CMa<Za> J;
    private final int K = l.comment;
    private final a L = new a();
    private HashMap M;

    /* compiled from: PlayerCommentsFragment.kt */
    public static final class a implements C6837lJa {
        public void a(View view, C6973nJa nja) {
            C7471uYa.b(view, "view");
            C7471uYa.b(nja, "errorType");
            defpackage.C6837lJa.a.a(this, view, nja);
        }

        public void b(View view) {
            C7471uYa.b(view, "view");
            defpackage.C6837lJa.a.b(this, view);
        }

        public int c() {
            return defpackage.C6837lJa.a.c(this);
        }

        public int d() {
            return l.emptyview_comments_connection_error;
        }

        public int b() {
            return l.emptyview_no_comments;
        }

        public void a(View view) {
            C7471uYa.b(view, "view");
            defpackage.C6837lJa.a.a((C6837lJa) this, view);
        }

        public int a() {
            return l.emptyview_comments_server_error;
        }

        public int a(C6973nJa nja) {
            C7471uYa.b(nja, "legacyError");
            if (nja.b() instanceof Na) {
                return l.emptyview_comments_disabled;
            }
            return defpackage.C6837lJa.a.a((C6837lJa) this, nja);
        }
    }

    /* compiled from: PlayerCommentsFragment.kt */
    public static class b {
        public PlayerCommentsFragment a(Y y) {
            C7471uYa.b(y, "commentsParams");
            PlayerCommentsFragment playerCommentsFragment = new PlayerCommentsFragment();
            playerCommentsFragment.setArguments(y.e());
            return playerCommentsFragment;
        }
    }

    public void Rb() {
        HashMap hashMap = this.M;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public int Vb() {
        return l.player_comments;
    }

    public void Wb() {
        ac().onDestroyView((Fragment) this);
        super.Wb();
    }

    /* access modifiers changed from: protected */
    public int Yb() {
        return this.K;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        super.a(view, bundle);
        ((ImageButton) view.findViewById(i.close_comments)).setOnClickListener(new Wa(this));
        ac().onViewCreated(this, view, bundle);
    }

    public ArtworkView ac() {
        ArtworkView artworkView = this.I;
        if (artworkView != null) {
            return artworkView;
        }
        C7471uYa.b("artworkView");
        throw null;
    }

    public C4806CMa<Za> bc() {
        C4806CMa<Za> cMa = this.J;
        if (cMa != null) {
            return cMa;
        }
        C7471uYa.b("playerPresenterLazy");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
        C7471uYa.b(str, "title");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ac().onCreate(this, bundle);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    /* access modifiers changed from: protected */
    public Z Tb() {
        Object obj = bc().get();
        C7471uYa.a(obj, "playerPresenterLazy.get()");
        return (Z) obj;
    }

    /* access modifiers changed from: protected */
    public a _b() {
        return this.L;
    }
}
