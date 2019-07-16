package com.soundcloud.android.comments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.A;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.soundcloud.android.comments.C2872ab.g;
import com.soundcloud.android.comments.C2872ab.i;
import com.soundcloud.android.comments.C2872ab.l;
import com.soundcloud.android.comments.C2872ab.p;
import com.soundcloud.android.view.SmoothScrollLinearLayoutManager;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0016\u0018\u0000  \u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0006\u0001\u0001 \u0001B\u0005¢\u0006\u0002\u0010\u0005J\u001c\u0010b\u001a\u00020\u00182\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020\u001d0dH\u0016J\u001a\u0010f\u001a\u00020\u00182\u0006\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010jH\u0016J\b\u0010k\u001a\u00020\u0018H\u0016J\b\u0010l\u001a\u00020\u0018H\u0016J\u0010\u0010m\u001a\u00020\u00182\u0006\u0010n\u001a\u00020\u0002H\u0014J\b\u0010o\u001a\u00020\u0002H\u0014J\u0010\u0010p\u001a\u00020\u00182\u0006\u0010q\u001a\u00020\u001fH\u0016J\u0010\u0010r\u001a\u00020\u00182\u0006\u0010n\u001a\u00020\u0002H\u0014J\u0010\u0010s\u001a\u00020\u00182\u0006\u0010t\u001a\u00020uH\u0016J\u0012\u0010v\u001a\u00020\u00182\b\u0010w\u001a\u0004\u0018\u00010xH\u0016J\b\u0010y\u001a\u00020^H\u0002J\b\u0010z\u001a\u000204H\u0016J\u0010\u0010{\u001a\u00020\u00182\u0006\u0010|\u001a\u00020}H\u0002J\u0010\u0010~\u001a\u00020\u00182\u0006\u0010|\u001a\u00020}H\u0002J\u000f\u0010\u001a\t\u0012\u0004\u0012\u00020\u00180\u0001H\u0016J\u0011\u0010\u0001\u001a\u00020\u00182\u0006\u0010|\u001a\u00020}H\u0016J\u0013\u0010\u0001\u001a\u00020\u00182\b\u0010\u0001\u001a\u00030\u0001H\u0016J\t\u0010\u0001\u001a\u00020\u0018H\u0016J\u0011\u0010\u0001\u001a\u00020\u00182\u0006\u0010|\u001a\u00020}H\u0016J\t\u0010\u0001\u001a\u00020\u0018H\u0016J\u0012\u0010\u0001\u001a\u00020\u00182\u0007\u0010\u0001\u001a\u00020%H\u0016J\u0012\u0010\u0001\u001a\u00020\u00182\u0007\u0010\u0001\u001a\u00020\u001dH\u0016J\u0010\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020^0\u0001H\u0016J\u0012\u0010\u0001\u001a\u00020\u00182\u0007\u0010\u0001\u001a\u00020\"H\u0016J\u0010\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020^0\u0001H\u0016J\u0012\u0010\u0001\u001a\u00020\u00182\u0007\u0010\u0001\u001a\u00020\u001dH\u0016J\u0012\u0010\u0001\u001a\u00020\u00182\u0007\u0010\u0001\u001a\u000204H\u0016J\u0012\u0010\u0001\u001a\u00020\u00182\u0007\u0010\u0001\u001a\u000201H\u0014J\u0012\u0010\u0001\u001a\u00020\u00182\u0007\u0010\u0001\u001a\u000208H\u0016J\t\u0010\u0001\u001a\u00020\u0018H\u0002J\u0014\u0010\u0001\u001a\u00020\u00182\t\b\u0001\u0010\u0001\u001a\u000204H\u0002J\u0014\u0010\u0001\u001a\u00020\u00182\t\b\u0001\u0010\u0001\u001a\u000204H\u0002J\u0012\u0010\u0001\u001a\u00020\u00182\u0007\u0010\u0001\u001a\u000204H\u0016J\t\u0010\u0001\u001a\u000204H\u0014J\t\u0010\u0001\u001a\u00020\u0018H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bX.¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0016R\u001e\u0010*\u001a\u00020+8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0016R\u0014\u00103\u001a\u000204X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002080\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0016R\u001e\u0010:\u001a\u00020;8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020AX\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0010\u0010D\u001a\u00020E8\u0002X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010F\u001a\u00020G8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001e\u0010L\u001a\u00020M8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010\u0016R\u0014\u0010T\u001a\u000201XD¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR$\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00020X8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020^0\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010\u0016R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020%0\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010\u0016¨\u0006¡\u0001"}, d2 = {"Lcom/soundcloud/android/comments/CommentsFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/comments/CommentsPresenter;", "Lcom/soundcloud/android/comments/CommentsView;", "Lcom/soundcloud/android/comments/CommentActionsSheetFragment$CommentActionListener;", "()V", "adapter", "Lcom/soundcloud/android/comments/CommentsAdapter;", "getAdapter", "()Lcom/soundcloud/android/comments/CommentsAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "adapterFactory", "Lcom/soundcloud/android/comments/CommentsAdapter$Factory;", "getAdapterFactory$track_comments_release", "()Lcom/soundcloud/android/comments/CommentsAdapter$Factory;", "setAdapterFactory$track_comments_release", "(Lcom/soundcloud/android/comments/CommentsAdapter$Factory;)V", "addComment", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/comments/NewCommentParams;", "getAddComment", "()Lio/reactivex/subjects/PublishSubject;", "close", "", "getClose", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/comments/CommentViewModel;", "Lcom/soundcloud/android/view/collection/LegacyError;", "commentActionSheetDeleteClick", "Lcom/soundcloud/android/comments/DeleteCommentParams;", "getCommentActionSheetDeleteClick", "commentActionSheetReportClick", "Lcom/soundcloud/android/comments/ReportCommentParams;", "getCommentActionSheetReportClick", "commentActionSheetUserClick", "Lcom/soundcloud/android/comments/CommentAvatarParams;", "getCommentActionSheetUserClick", "commentClick", "Lcom/soundcloud/android/comments/SelectedCommentParams;", "getCommentClick", "commentInputRenderer", "Lcom/soundcloud/android/comments/CommentInputRenderer;", "getCommentInputRenderer$track_comments_release", "()Lcom/soundcloud/android/comments/CommentInputRenderer;", "setCommentInputRenderer$track_comments_release", "(Lcom/soundcloud/android/comments/CommentInputRenderer;)V", "commentInputTextChanged", "", "getCommentInputTextChanged", "commentLayout", "", "getCommentLayout", "()I", "commentLongClick", "Lcom/soundcloud/android/comments/CommentActionsSheetParams;", "getCommentLongClick", "commentRendererFactory", "Lcom/soundcloud/android/comments/CommentRenderer$Factory;", "getCommentRendererFactory$track_comments_release", "()Lcom/soundcloud/android/comments/CommentRenderer$Factory;", "setCommentRendererFactory$track_comments_release", "(Lcom/soundcloud/android/comments/CommentRenderer$Factory;)V", "commentsEmptyStateProvider", "Lcom/soundcloud/android/view/collection/EmptyStateProvider;", "getCommentsEmptyStateProvider", "()Lcom/soundcloud/android/view/collection/EmptyStateProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "dialogFragmentFactory", "Lcom/soundcloud/android/comments/ConfirmPrimaryEmailDialogFragment$Factory;", "getDialogFragmentFactory$track_comments_release", "()Lcom/soundcloud/android/comments/ConfirmPrimaryEmailDialogFragment$Factory;", "setDialogFragmentFactory$track_comments_release", "(Lcom/soundcloud/android/comments/ConfirmPrimaryEmailDialogFragment$Factory;)V", "feedbackController", "Lcom/soundcloud/android/view/snackbar/CommentsFeedbackController;", "getFeedbackController$track_comments_release", "()Lcom/soundcloud/android/view/snackbar/CommentsFeedbackController;", "setFeedbackController$track_comments_release", "(Lcom/soundcloud/android/view/snackbar/CommentsFeedbackController;)V", "nextPageRetryClick", "getNextPageRetryClick", "presenterKey", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy$track_comments_release", "()Ldagger/Lazy;", "setPresenterLazy$track_comments_release", "(Ldagger/Lazy;)V", "retry", "Lcom/soundcloud/android/comments/CommentsParams;", "getRetry", "userImageClick", "getUserImageClick", "accept", "commentsPage", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "Lcom/soundcloud/android/comments/CommentsPage;", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "clearCommentInputFocus", "connectPresenter", "presenter", "createPresenter", "deleteCommentClicked", "deleteCommentParams", "disconnectPresenter", "enableSendComment", "enabled", "", "focusCommentInput", "comment", "Lcom/soundcloud/android/comments/CommentViewModel$CommentItem;", "getCommentsParamsFromBundle", "getResId", "handleAddCommentError", "throwable", "", "handleViewError", "nextPageSignal", "Lio/reactivex/Observable;", "onAddCommentError", "onAttach", "context", "Landroid/content/Context;", "onCommentAdded", "onDeleteOrReportCommentError", "onDestroy", "openProfileClicked", "commentAvatarParams", "refreshErrorConsumer", "error", "refreshSignal", "reportCommentClicked", "reportCommentParams", "requestContent", "requestContentErrorConsumer", "scrollToAndHighlight", "position", "setTitleIfApplicable", "title", "showCommentActionsSheet", "commentParams", "showConfirmEmailDialog", "showInfiniteSnackbarWithRetry", "message", "showSnackbar", "smoothScrollToPosition", "titleResId", "unbindViews", "CommentsEmptyStateProvider", "CommentsFragmentFactory", "Companion", "track-comments_release"}, mv = {1, 1, 15})
/* compiled from: CommentsFragment.kt */
public class CommentsFragment extends UniflowBaseFragment<Z> implements Da, com.soundcloud.android.comments.C2876c.a {
    static final /* synthetic */ DZa[] i = {HYa.a((DYa) new EYa(HYa.a(CommentsFragment.class), "adapter", "getAdapter()Lcom/soundcloud/android/comments/CommentsAdapter;"))};
    public static final c j = new c(null);
    private final C6781kVa<eb> A;
    private final C6781kVa<RVa> B;
    private final C6781kVa<String> C;
    private final C6781kVa<C2892j> D;
    private final C6781kVa<C2875bb> E;
    private final C6781kVa<Ma> F;
    private final C6781kVa<C2890i> G;
    private HashMap H;
    private final String k = "CommentsPresenter";
    public C4806CMa<Z> l;
    public com.soundcloud.android.comments.A.a m;
    public com.soundcloud.android.comments.r.a n;
    public C4989IJa o;
    public C2902o p;
    public com.soundcloud.android.comments.Ga.b q;
    private C6769kJa<C2921y, C6973nJa> r;
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa s = new UPa();
    private final C7744yVa t = BVa.a(new D(this));
    private final int u = l.standalone_comment;
    private final C6837lJa v = new a();
    private final C6781kVa<RVa> w;
    private final C6781kVa<Y> x;
    private final C6781kVa<Pa> y;
    private final C6781kVa<C2892j> z;

    /* compiled from: CommentsFragment.kt */
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
            return l.standalone_emptyview_comments_connection_error;
        }

        public int b() {
            return l.standalone_emptyview_no_comments;
        }

        public void a(View view) {
            C7471uYa.b(view, "view");
            defpackage.C6837lJa.a.a((C6837lJa) this, view);
        }

        public int a() {
            return defpackage.C6837lJa.a.b(this);
        }

        public int a(C6973nJa nja) {
            C7471uYa.b(nja, "legacyError");
            if (nja.b() instanceof Na) {
                return l.standalone_emptyview_comments_disabled;
            }
            return defpackage.C6837lJa.a.a((C6837lJa) this, nja);
        }
    }

    /* compiled from: CommentsFragment.kt */
    public static class b {
        public CommentsFragment a(Y y) {
            C7471uYa.b(y, "commentsParams");
            CommentsFragment commentsFragment = new CommentsFragment();
            commentsFragment.setArguments(y.e());
            return commentsFragment;
        }
    }

    /* compiled from: CommentsFragment.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C7264rYa rya) {
            this();
        }
    }

    public CommentsFragment() {
        C6781kVa<RVa> s2 = C6781kVa.s();
        String str = "PublishSubject.create()";
        C7471uYa.a((Object) s2, str);
        this.w = s2;
        C6781kVa<Y> s3 = C6781kVa.s();
        C7471uYa.a((Object) s3, str);
        this.x = s3;
        C6781kVa<Pa> s4 = C6781kVa.s();
        C7471uYa.a((Object) s4, str);
        this.y = s4;
        C6781kVa<C2892j> s5 = C6781kVa.s();
        C7471uYa.a((Object) s5, str);
        this.z = s5;
        C6781kVa<eb> s6 = C6781kVa.s();
        C7471uYa.a((Object) s6, str);
        this.A = s6;
        C6781kVa<RVa> s7 = C6781kVa.s();
        C7471uYa.a((Object) s7, str);
        this.B = s7;
        C6781kVa<String> s8 = C6781kVa.s();
        C7471uYa.a((Object) s8, str);
        this.C = s8;
        C6781kVa<C2892j> s9 = C6781kVa.s();
        C7471uYa.a((Object) s9, str);
        this.D = s9;
        C6781kVa<C2875bb> s10 = C6781kVa.s();
        C7471uYa.a((Object) s10, str);
        this.E = s10;
        C6781kVa<Ma> s11 = C6781kVa.s();
        C7471uYa.a((Object) s11, str);
        this.F = s11;
        C6781kVa<C2890i> s12 = C6781kVa.s();
        C7471uYa.a((Object) s12, str);
        this.G = s12;
    }

    private final A ac() {
        C7744yVa yva = this.t;
        DZa dZa = i[0];
        return (A) yva.getValue();
    }

    /* access modifiers changed from: private */
    public final Y bc() {
        com.soundcloud.android.comments.Y.a aVar = Y.a;
        Bundle arguments = getArguments();
        if (arguments != null) {
            return aVar.a(arguments);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void cc() {
        com.soundcloud.android.comments.Ga.b bVar = this.q;
        C0370l lVar = null;
        if (bVar != null) {
            Ga a2 = bVar.a(bc().d());
            FragmentActivity activity = getActivity();
            if (activity != null) {
                lVar = activity.getSupportFragmentManager();
            }
            C5262RGa.a(a2, lVar, "confirm_primary_email_dialog");
            return;
        }
        C7471uYa.b("dialogFragmentFactory");
        throw null;
    }

    private final void d(Throwable th) {
        if (C6972nIa.f(th)) {
            c(p.snackbar_message_comments_connection_error);
        } else {
            c(p.snackbar_message_comments_server_error);
        }
    }

    public C6781kVa<Ma> N() {
        return this.F;
    }

    public void Rb() {
        HashMap hashMap = this.H;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C6769kJa kja = new C6769kJa(ac(), F.a, null, _b(), false, false, false, false, false, true, 484, null);
        this.r = kja;
        UPa uPa = this.s;
        VPa[] vPaArr = new VPa[5];
        vPaArr[0] = ac().m().f((C6776kQa<? super T>) new M<Object>(new G(L())));
        vPaArr[1] = ac().j().f((C6776kQa<? super T>) new M<Object>(new H(ba())));
        vPaArr[2] = ac().l().f((C6776kQa<? super T>) new M<Object>(new I(fa())));
        C2902o oVar = this.p;
        String str = "commentInputRenderer";
        if (oVar != null) {
            vPaArr[3] = oVar.e().f((C6776kQa<? super T>) new J<Object>(this));
            C2902o oVar2 = this.p;
            if (oVar2 != null) {
                vPaArr[4] = oVar2.d().f((C6776kQa<? super T>) new K<Object>(this));
                uPa.a(vPaArr);
                return;
            }
            C7471uYa.b(str);
            throw null;
        }
        C7471uYa.b(str);
        throw null;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.k;
    }

    public C6781kVa<C2892j> V() {
        return this.D;
    }

    public int Vb() {
        return l.standalone_comments;
    }

    public void Wb() {
        C6769kJa<C2921y, C6973nJa> kja = this.r;
        if (kja != null) {
            kja.b();
            C4989IJa iJa = this.o;
            if (iJa != null) {
                iJa.a();
                C2902o oVar = this.p;
                if (oVar != null) {
                    oVar.b();
                } else {
                    C7471uYa.b("commentInputRenderer");
                    throw null;
                }
            } else {
                C7471uYa.b("feedbackController");
                throw null;
            }
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public final com.soundcloud.android.comments.A.a Xb() {
        com.soundcloud.android.comments.A.a aVar = this.m;
        if (aVar != null) {
            return aVar;
        }
        C7471uYa.b("adapterFactory");
        throw null;
    }

    /* access modifiers changed from: protected */
    public int Yb() {
        return this.u;
    }

    public final com.soundcloud.android.comments.r.a Zb() {
        com.soundcloud.android.comments.r.a aVar = this.n;
        if (aVar != null) {
            return aVar;
        }
        C7471uYa.b("commentRendererFactory");
        throw null;
    }

    /* access modifiers changed from: protected */
    public C6837lJa _b() {
        return this.v;
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
        C7471uYa.b(str, "title");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setTitle(getResources().getString(p.title_comments_populated, new Object[]{str}));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public APa<RVa> e() {
        C6769kJa<C2921y, C6973nJa> kja = this.r;
        if (kja != null) {
            return kja.f();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<Y> f() {
        C6769kJa<C2921y, C6973nJa> kja = this.r;
        if (kja != null) {
            APa<Y> h = kja.g().h(new L(this));
            C7471uYa.a((Object) h, "collectionRenderer.onRef…mentsParamsFromBundle() }");
            return h;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public C6781kVa<eb> fa() {
        return this.A;
    }

    public void ja() {
        C2902o oVar = this.p;
        if (oVar != null) {
            oVar.g();
        } else {
            C7471uYa.b("commentInputRenderer");
            throw null;
        }
    }

    public void ka() {
        C2902o oVar = this.p;
        String str = "commentInputRenderer";
        if (oVar != null) {
            oVar.a();
            C2902o oVar2 = this.p;
            if (oVar2 != null) {
                oVar2.g();
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else {
            C7471uYa.b(str);
            throw null;
        }
    }

    public C6781kVa<C2875bb> na() {
        return this.E;
    }

    public void onAttach(Context context) {
        C7471uYa.b(context, "context");
        dagger.android.support.a.a(this);
        super.onAttach(context);
    }

    public void onDestroy() {
        super.onDestroy();
        this.s.b();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public C6781kVa<C2892j> L() {
        return this.z;
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.title_comments_placeholder;
    }

    public C6781kVa<RVa> R() {
        return this.B;
    }

    public C6781kVa<Y> T() {
        return this.x;
    }

    /* access modifiers changed from: protected */
    public Z Tb() {
        C4806CMa<Z> cMa = this.l;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (Z) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void b() {
        com.soundcloud.android.comments.Da.a.a(this);
    }

    public C6781kVa<C2890i> ba() {
        return this.G;
    }

    public APa<Y> c() {
        APa<Y> c2 = APa.c(bc());
        C7471uYa.a((Object) c2, "Observable.just(getCommentsParamsFromBundle())");
        return c2;
    }

    public C6781kVa<String> ga() {
        return this.C;
    }

    public C6781kVa<RVa> ha() {
        return this.w;
    }

    public C6781kVa<Pa> ma() {
        return this.y;
    }

    private final void c(Throwable th) {
        if (C6972nIa.g(th)) {
            cc();
        } else if (C6972nIa.f(th)) {
            d(p.snackbar_message_connection_error);
        } else if (C6972nIa.i(th)) {
            d(p.snackbar_message_add_comment_rate_limited);
        } else {
            d(p.snackbar_message_server_error);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    public void a(C2890i iVar) {
        A a2;
        C7471uYa.b(iVar, "commentParams");
        C2876c a3 = C2876c.a.a(iVar);
        a3.setTargetFragment(this, 0);
        C0370l fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            a2 = fragmentManager.a();
            if (a2 != null) {
                a2.a((String) null);
                if (a2 == null) {
                    a3.show(a2, a3.getTag());
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        a2 = null;
        if (a2 == null) {
        }
    }

    /* access modifiers changed from: protected */
    public void b(Z z2) {
        C7471uYa.b(z2, "presenter");
        z2.a();
    }

    private final void d(int i2) {
        C4989IJa iJa = this.o;
        if (iJa != null) {
            Fca fca = new Fca(i2, 1, 0, null, null, null, 60, null);
            iJa.a(fca);
            return;
        }
        C7471uYa.b("feedbackController");
        throw null;
    }

    public void b(C6973nJa nja) {
        C7471uYa.b(nja, "error");
        C2902o oVar = this.p;
        if (oVar != null) {
            oVar.f();
            d((Throwable) nja.b());
            return;
        }
        C7471uYa.b("commentInputRenderer");
        throw null;
    }

    private final void c(int i2) {
        Fca fca = new Fca(i2, 2, p.snackbar_action_comments_connection_error, new N(this), null, null, 48, null);
        C4989IJa iJa = this.o;
        if (iJa != null) {
            iJa.a(fca);
        } else {
            C7471uYa.b("feedbackController");
            throw null;
        }
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<C2921y, C6973nJa> kja = this.r;
        if (kja != null) {
            View view2 = view;
            C6769kJa.a(kja, view2, false, new E(this), l.emptyview_container_transparent_bg, 2, null);
            C4989IJa iJa = this.o;
            if (iJa != null) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    View findViewById = activity.findViewById(i.comments_snackbar_anchor);
                    C7471uYa.a((Object) findViewById, "checkNotNull(activity).f…comments_snackbar_anchor)");
                    iJa.a(findViewById);
                    C2902o oVar = this.p;
                    if (oVar != null) {
                        oVar.a(getActivity(), view);
                        C1778vc.a(view, (float) getResources().getDimensionPixelSize(g.player_elevation));
                        return;
                    }
                    C7471uYa.b("commentInputRenderer");
                    throw null;
                }
                throw new IllegalStateException("Required value was null.");
            }
            C7471uYa.b("feedbackController");
            throw null;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public void b(int i2) {
        C6769kJa<C2921y, C6973nJa> kja = this.r;
        RecyclerView.i iVar = null;
        if (kja != null) {
            RecyclerView c2 = kja.c();
            if (c2 != null) {
                iVar = c2.getLayoutManager();
            }
            if (iVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            } else if (iVar instanceof SmoothScrollLinearLayoutManager) {
                ((SmoothScrollLinearLayoutManager) iVar).l(i2);
                ac().i(i2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Input ");
                sb.append(iVar);
                sb.append(" not of type ");
                sb.append(SmoothScrollLinearLayoutManager.class.getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void a(Z z2) {
        C7471uYa.b(z2, "presenter");
        z2.a((Da) this);
    }

    public void b(Throwable th) {
        C7471uYa.b(th, "throwable");
        if (C6972nIa.f(th)) {
            d(p.snackbar_message_connection_error);
        } else {
            d(p.snackbar_message_server_error);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 != null) goto L_0x002a;
     */
    public void a(C6832lEa<T, C6973nJa> lea) {
        List list;
        C7471uYa.b(lea, "commentsPage");
        C6832lEa<T, C6973nJa> a2 = lea.a().e() ? C6832lEa.a.a() : lea;
        T t2 = (T) lea.b();
        if (t2 != null) {
            list = t2.a();
        }
        list = C6918mWa.a();
        C2902o oVar = this.p;
        if (oVar != null) {
            oVar.accept((T) lea.b());
            T t3 = (T) lea.b();
            String str = "collectionRenderer";
            if (t3 == null || t3.b()) {
                C6769kJa<C2921y, C6973nJa> kja = this.r;
                if (kja != null) {
                    kja.a(new C4736AEa<>(a2.a(), list));
                } else {
                    C7471uYa.b(str);
                    throw null;
                }
            } else {
                C6769kJa<C2921y, C6973nJa> kja2 = this.r;
                if (kja2 != null) {
                    C6900mEa mea = new C6900mEa(false, false, new C6973nJa(Na.a), null, false, 27, null);
                    kja2.a(new C4736AEa<>(mea, C6918mWa.a()));
                } else {
                    C7471uYa.b(str);
                    throw null;
                }
            }
            T t4 = (T) lea.b();
            if (t4 != null) {
                String e = t4.e();
                if (e != null) {
                    c(e);
                    return;
                }
                return;
            }
            return;
        }
        C7471uYa.b("commentInputRenderer");
        throw null;
    }

    public void a(C6973nJa nja) {
        C7471uYa.b(nja, "error");
        C2902o oVar = this.p;
        if (oVar != null) {
            oVar.f();
            d((Throwable) nja.b());
            return;
        }
        C7471uYa.b("commentInputRenderer");
        throw null;
    }

    public void a(boolean z2) {
        C2902o oVar = this.p;
        if (oVar != null) {
            oVar.a(z2);
        } else {
            C7471uYa.b("commentInputRenderer");
            throw null;
        }
    }

    public void a(com.soundcloud.android.comments.C2921y.a aVar) {
        C2902o oVar = this.p;
        String str = "commentInputRenderer";
        if (oVar != null) {
            oVar.c();
            if (aVar != null) {
                C2902o oVar2 = this.p;
                if (oVar2 != null) {
                    oVar2.a(aVar);
                } else {
                    C7471uYa.b(str);
                    throw null;
                }
            }
        } else {
            C7471uYa.b(str);
            throw null;
        }
    }

    public void a(int i2) {
        C6769kJa<C2921y, C6973nJa> kja = this.r;
        if (kja != null) {
            kja.a(i2);
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public void a(Throwable th) {
        C7471uYa.b(th, "throwable");
        C2902o oVar = this.p;
        if (oVar != null) {
            oVar.h();
            c(th);
            return;
        }
        C7471uYa.b("commentInputRenderer");
        throw null;
    }

    public void a(C2892j jVar) {
        C7471uYa.b(jVar, "commentAvatarParams");
        V().a(jVar);
    }

    public void a(C2875bb bbVar) {
        C7471uYa.b(bbVar, "reportCommentParams");
        na().a(bbVar);
    }

    public void a(Ma ma) {
        C7471uYa.b(ma, "deleteCommentParams");
        N().a(ma);
    }
}
