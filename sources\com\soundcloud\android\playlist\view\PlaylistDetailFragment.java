package com.soundcloud.android.playlist.view;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.soundcloud.android.collection.Da;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.main.ha;
import com.soundcloud.android.settings.C5987t;
import com.soundcloud.android.view.CustomFontTitleToolbar;
import com.soundcloud.android.view.UniflowBaseFragment;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000Â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 Ä\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002Ä\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u001c\u0010[\u001a\u00020\\2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\u000b0^H\u0016J\u0010\u0010`\u001a\u00020\\2\u0006\u0010a\u001a\u00020BH\u0002J\u001c\u0010b\u001a\u00020\\2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\u000b0^H\u0002J\u001c\u0010d\u001a\u00020\\2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\u000b0^H\u0002J\u0010\u0010f\u001a\u00020\\2\u0006\u0010c\u001a\u00020_H\u0002J\u001a\u0010g\u001a\u00020\\2\u0006\u0010h\u001a\u00020i2\b\u0010j\u001a\u0004\u0018\u00010kH\u0016J\u001c\u0010g\u001a\u00020\\2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\u000b0^H\u0002J\b\u0010m\u001a\u00020\\H\u0016J\u0010\u0010n\u001a\u00020\\2\u0006\u0010<\u001a\u00020\u0002H\u0014J\b\u0010o\u001a\u00020\u0002H\u0014J\u0010\u0010p\u001a\u00020\\2\u0006\u0010<\u001a\u00020\u0002H\u0014J\u0016\u0010q\u001a\u00020\\2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020sJ\b\u0010u\u001a\u00020sH\u0016J\u0010\u0010v\u001a\u00020\\2\u0006\u0010w\u001a\u00020xH\u0016J\u0010\u0010y\u001a\u00020\\2\u0006\u0010z\u001a\u00020{H\u0016J\u0010\u0010|\u001a\u00020\\2\u0006\u0010z\u001a\u00020{H\u0016J\u0010\u0010}\u001a\u00020\\2\u0006\u0010z\u001a\u00020{H\u0016J\u0011\u0010~\u001a\u00020\\2\u0007\u0010\u001a\u00030\u0001H\u0016J\u0013\u0010\u0001\u001a\u00020\\2\b\u0010j\u001a\u0004\u0018\u00010kH\u0016J\u001d\u0010\u0001\u001a\u00020\\2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0010\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020{0\u0001H\u0016J\u0007\u0010\u0001\u001a\u00020\\J\u0007\u0010\u0001\u001a\u00020\\J\u0010\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020B0\u0001H\u0016J\u0011\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u0011\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u0013\u0010\u0001\u001a\u00020\\2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u001e\u0010\u0001\u001a\u0017\u0012\u0012\u0012\u0010\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020B0\u00010\u0001H\u0016J\u0011\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u0011\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u0011\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u0013\u0010\u0001\u001a\u00020B2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0011\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u0011\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u0011\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u0013\u0010\u0001\u001a\u00020\\2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0010\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\\0\u0001H\u0016J\t\u0010 \u0001\u001a\u00020\\H\u0016J\u0011\u0010¡\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u001e\u0010¢\u0001\u001a\u0017\u0012\u0012\u0012\u0010\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020B0\u00010\u0001H\u0016J\u0011\u0010£\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u0011\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u0011\u0010¥\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010\u0001H\u0016J\u0018\u0010§\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¦\u00010¨\u00010\u0001H\u0016J\u0011\u0010©\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u0011\u0010ª\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u0013\u0010ª\u0001\u001a\u00020\\2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0013\u0010«\u0001\u001a\u00020\\2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0013\u0010¬\u0001\u001a\u00020\\2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0010\u0010­\u0001\u001a\t\u0012\u0004\u0012\u00020\\0\u0001H\u0016J\n\u0010®\u0001\u001a\u00030¯\u0001H\u0002J\u0010\u0010°\u0001\u001a\t\u0012\u0004\u0012\u00020\\0\u0001H\u0016J\u0010\u0010±\u0001\u001a\u00020\\2\u0007\u0010²\u0001\u001a\u00020sJ\u0012\u0010³\u0001\u001a\u00020\\2\u0007\u0010´\u0001\u001a\u00020sH\u0002J\u0010\u0010µ\u0001\u001a\t\u0012\u0004\u0012\u00020\\0\u0001H\u0016J\t\u0010¶\u0001\u001a\u00020\\H\u0002J\u0013\u0010·\u0001\u001a\u00020\\2\b\u0010¸\u0001\u001a\u00030¹\u0001H\u0016J\u0013\u0010º\u0001\u001a\u00020\\2\b\u0010»\u0001\u001a\u00030\u0001H\u0016J\u0011\u0010¼\u0001\u001a\u00020\\2\u0006\u0010w\u001a\u00020xH\u0016J\u0011\u0010½\u0001\u001a\u00020\\2\u0006\u0010z\u001a\u00020{H\u0016J\u0013\u0010¾\u0001\u001a\u00020\\2\b\u0010¿\u0001\u001a\u00030À\u0001H\u0016J\u0011\u0010Á\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010¨\u0001H\u0002J\t\u0010Â\u0001\u001a\u00020\\H\u0016J\t\u0010Ã\u0001\u001a\u00020{H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX.¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u00020%8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020+8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00100\u001a\u0002018\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u0002078\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u000e\u0010<\u001a\u00020\u0002X.¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\u00020>8TX\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u000e\u0010A\u001a\u00020BX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010C\u001a\u00020D8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001e\u0010I\u001a\u00020J8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001e\u0010O\u001a\u00020P8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001e\u0010U\u001a\u00020V8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010Z¨\u0006Å\u0001"}, d2 = {"Lcom/soundcloud/android/playlist/view/PlaylistDetailFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/playlists/PlaylistDetailsPresenter;", "Lcom/soundcloud/android/playlist/view/PlaylistDetailsAdapter$PlaylistDetailView;", "Lcom/soundcloud/android/playlists/PlaylistDetailsPresenter$PlaylistDetailView;", "()V", "adapter", "Lcom/soundcloud/android/playlist/view/PlaylistDetailsAdapter;", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/playlists/PlaylistDetailItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "feedbackController", "Lcom/soundcloud/android/view/snackbar/FeedbackController;", "getFeedbackController$playlist_release", "()Lcom/soundcloud/android/view/snackbar/FeedbackController;", "setFeedbackController$playlist_release", "(Lcom/soundcloud/android/view/snackbar/FeedbackController;)V", "headerAnimator", "Lcom/soundcloud/android/playlist/view/PlaylistDetailsHeaderAnimator;", "headerAnimatorFactory", "Lcom/soundcloud/android/playlist/view/PlaylistDetailsHeaderAnimatorFactory;", "getHeaderAnimatorFactory$playlist_release", "()Lcom/soundcloud/android/playlist/view/PlaylistDetailsHeaderAnimatorFactory;", "setHeaderAnimatorFactory$playlist_release", "(Lcom/soundcloud/android/playlist/view/PlaylistDetailsHeaderAnimatorFactory;)V", "headerScrollHelper", "Lcom/soundcloud/android/playlist/view/PlaylistDetailHeaderScrollHelper;", "getHeaderScrollHelper$playlist_release", "()Lcom/soundcloud/android/playlist/view/PlaylistDetailHeaderScrollHelper;", "setHeaderScrollHelper$playlist_release", "(Lcom/soundcloud/android/playlist/view/PlaylistDetailHeaderScrollHelper;)V", "inputs", "Lcom/soundcloud/android/playlist/view/PlaylistDetailsInputs;", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "navigator", "Lcom/soundcloud/android/navigation/Navigator;", "getNavigator$playlist_release", "()Lcom/soundcloud/android/navigation/Navigator;", "setNavigator$playlist_release", "(Lcom/soundcloud/android/navigation/Navigator;)V", "newPlaylistDetailsAdapterFactory", "Lcom/soundcloud/android/playlist/view/PlaylistDetailsAdapterFactory;", "getNewPlaylistDetailsAdapterFactory$playlist_release", "()Lcom/soundcloud/android/playlist/view/PlaylistDetailsAdapterFactory;", "setNewPlaylistDetailsAdapterFactory$playlist_release", "(Lcom/soundcloud/android/playlist/view/PlaylistDetailsAdapterFactory;)V", "playlistDetailsHeaderRendererFactory", "Lcom/soundcloud/android/playlist/view/PlaylistDetailsHeaderRendererFactory;", "getPlaylistDetailsHeaderRendererFactory$playlist_release", "()Lcom/soundcloud/android/playlist/view/PlaylistDetailsHeaderRendererFactory;", "setPlaylistDetailsHeaderRendererFactory$playlist_release", "(Lcom/soundcloud/android/playlist/view/PlaylistDetailsHeaderRendererFactory;)V", "playlistPresenterFactory", "Lcom/soundcloud/android/playlists/PlaylistDetailsPresenterFactory;", "getPlaylistPresenterFactory$playlist_release", "()Lcom/soundcloud/android/playlists/PlaylistDetailsPresenterFactory;", "setPlaylistPresenterFactory$playlist_release", "(Lcom/soundcloud/android/playlists/PlaylistDetailsPresenterFactory;)V", "presenter", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "skipModelUpdates", "", "toolbarView", "Lcom/soundcloud/android/playlist/view/PlaylistDetailToolbarView;", "getToolbarView$playlist_release", "()Lcom/soundcloud/android/playlist/view/PlaylistDetailToolbarView;", "setToolbarView$playlist_release", "(Lcom/soundcloud/android/playlist/view/PlaylistDetailToolbarView;)V", "touchCallbackFactory", "Lcom/soundcloud/android/playlist/view/PlaylistEditionItemTouchCallbackFactory;", "getTouchCallbackFactory$playlist_release", "()Lcom/soundcloud/android/playlist/view/PlaylistEditionItemTouchCallbackFactory;", "setTouchCallbackFactory$playlist_release", "(Lcom/soundcloud/android/playlist/view/PlaylistEditionItemTouchCallbackFactory;)V", "trackEngagements", "Lcom/soundcloud/android/foundation/actions/TrackEngagements;", "getTrackEngagements$playlist_release", "()Lcom/soundcloud/android/foundation/actions/TrackEngagements;", "setTrackEngagements$playlist_release", "(Lcom/soundcloud/android/foundation/actions/TrackEngagements;)V", "visibilityEmitter", "Lcom/soundcloud/android/utils/FragmentLightCycleVisibilityEmitter;", "getVisibilityEmitter$playlist_release", "()Lcom/soundcloud/android/utils/FragmentLightCycleVisibilityEmitter;", "setVisibilityEmitter$playlist_release", "(Lcom/soundcloud/android/utils/FragmentLightCycleVisibilityEmitter;)V", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "Lcom/soundcloud/android/playlists/PlaylistDetailsViewModel;", "bindHeader", "isInEditMode", "bindItems", "data", "bindItemsGestures", "syncModel", "bindToolBar", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "playlistAsyncViewModel", "buildRenderers", "connectPresenter", "createPresenter", "disconnectPresenter", "dragItem", "fromPosition", "", "toPosition", "getResId", "goBack", "ignored", "", "goToContentUpsell", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "goToCreator", "goToOfflineUpsell", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDelete", "Lio/reactivex/Observable;", "onDragStarted", "onDragStopped", "onEditModeChanged", "onFirstTrackUpsellImpression", "Lcom/soundcloud/android/playlists/PlaylistDetailItem$PlaylistDetailUpsellItem;", "onGoToCreator", "Lcom/soundcloud/android/playlists/PlaylistDetailsMetadata;", "onHandleTouched", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onLike", "Lkotlin/Pair;", "onMakeAvailableOffline", "onMakeOfflineOverflowUpsell", "onMakeOfflineUpsell", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onOverflowUpsellImpression", "onPlayAll", "onPlayNext", "onPrepareOptionsMenu", "onRefresh", "onRefreshed", "onRemoveFromOffline", "onRepost", "onShare", "onShuffleClicked", "onTrackClicked", "Lcom/soundcloud/android/playlists/PlaylistDetailItem$PlaylistDetailTrackItem;", "onTracklistUpdated", "", "onUpsellDismissed", "onUpsellItemClicked", "onUpsellItemDismissed", "onUpsellItemPresented", "onVisible", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "refreshSignal", "removeItem", "position", "removeTrackAtPosition", "trackPosition", "requestContent", "saveUpdates", "sharePlaylist", "options", "Lcom/soundcloud/android/foundation/actions/models/ShareOptions;", "showDisableOfflineCollectionConfirmation", "params", "showOfflineStorageErrorDialog", "showPlaylistDetailConfirmation", "showRepostResult", "result", "Lcom/soundcloud/android/associations/RepostResult;", "trackItems", "unbindViews", "urnFromBundle", "Companion", "playlist_release"}, mv = {1, 1, 15})
/* compiled from: PlaylistDetailFragment.kt */
public final class PlaylistDetailFragment extends UniflowBaseFragment<C6804kqa> implements com.soundcloud.android.playlist.view.C.a, defpackage.C6804kqa.a {
    public static final a i = new a(null);
    private boolean A;
    private HashMap B;
    public C7080ora j;
    public V k;
    public G l;
    public Lca m;
    public Q n;
    public N o;
    public C5052KJa p;
    public C4655rja q;
    @LightCycle
    public A r;
    @LightCycle
    public C5751w s;
    @LightCycle
    public C7592wHa t;
    private C6804kqa u;
    private C v;
    private C6769kJa<C6260cqa, C6973nJa> w;
    /* access modifiers changed from: private */
    public final T x;
    private G y;
    private M z;

    public final class LightCycleBinder {
        public static void bind(PlaylistDetailFragment playlistDetailFragment) {
            playlistDetailFragment.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) playlistDetailFragment.r));
            playlistDetailFragment.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) playlistDetailFragment.s));
            playlistDetailFragment.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) playlistDetailFragment.t));
        }
    }

    /* compiled from: PlaylistDetailFragment.kt */
    public static final class a {
        private a() {
        }

        public final Fragment a(C3508cda cda, Yca yca, SearchQuerySourceInfo searchQuerySourceInfo, PromotedSourceInfo promotedSourceInfo, boolean z) {
            C7471uYa.b(cda, "playlistUrn");
            C7471uYa.b(yca, "screen");
            PlaylistDetailFragment playlistDetailFragment = new PlaylistDetailFragment();
            Bundle bundle = new Bundle();
            C5526_Ha.b(bundle, "urn", cda);
            bundle.putParcelable("query_source_info", searchQuerySourceInfo);
            bundle.putParcelable("promoted_source_info", promotedSourceInfo);
            bundle.putBoolean("autoplay", z);
            ha.a(yca, bundle);
            playlistDetailFragment.setArguments(bundle);
            return playlistDetailFragment;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public PlaylistDetailFragment() {
        T t2 = r0;
        T t3 = new T(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
        this.x = t2;
    }

    private final RecyclerView Zb() {
        View findViewById = requireActivity().findViewById(i.ak_recycler_view);
        C7471uYa.a((Object) findViewById, "requireActivity().findVi…Id(R.id.ak_recycler_view)");
        return (RecyclerView) findViewById;
    }

    private final void _b() {
        this.x.a(ac());
    }

    private final List<e> ac() {
        C c = this.v;
        if (c != null) {
            List<C6260cqa> h = c.h();
            ArrayList arrayList = new ArrayList(h.size());
            for (C6260cqa cqa : h) {
                if (cqa.d()) {
                    if (cqa != null) {
                        arrayList.add((e) cqa);
                    } else {
                        throw new OVa("null cannot be cast to non-null type com.soundcloud.android.playlists.PlaylistDetailItem.PlaylistDetailTrackItem");
                    }
                }
            }
            return arrayList;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    private final C3508cda bc() {
        C3508cda b = C5526_Ha.b(getArguments(), "urn");
        if (b != null) {
            C7471uYa.a((Object) b, "Urns.urnFromBundle(argum…ist URN may no be null.\")");
            return b;
        }
        throw new IllegalStateException("Playlist URN may no be null.");
    }

    public void Rb() {
        HashMap hashMap = this.B;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        G g = this.l;
        if (g != null) {
            Q q2 = this.n;
            if (q2 != null) {
                P a2 = q2.a(this.x);
                C7471uYa.a((Object) a2, "playlistDetailsHeaderRen…rerFactory.create(inputs)");
                this.v = g.a(this, a2);
                C c = this.v;
                if (c != null) {
                    C6769kJa kja = new C6769kJa(c, C5747s.a, C5748t.a, new C6396eqa(), false, true, false, false, false, false, 64, null);
                    this.w = kja;
                    return;
                }
                C7471uYa.b("adapter");
                throw null;
            }
            C7471uYa.b("playlistDetailsHeaderRendererFactory");
            throw null;
        }
        C7471uYa.b("newPlaylistDetailsAdapterFactory");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return "playlistDetailsPresenter";
    }

    public int Vb() {
        return l.new_playlist_details_fragment;
    }

    public APa<C6532gqa> Wa() {
        return this.x.n();
    }

    public void Wb() {
        C6769kJa<C6260cqa, C6973nJa> kja = this.w;
        if (kja != null) {
            kja.b();
            M m2 = this.z;
            if (m2 != null) {
                RecyclerView Zb = Zb();
                C c = this.v;
                if (c != null) {
                    m2.b(Zb, (androidx.recyclerview.widget.RecyclerView.a) c);
                    this.z = null;
                    this.y = null;
                    return;
                }
                C7471uYa.b("adapter");
                throw null;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<f> Xa() {
        return this.x.k();
    }

    public final void Xb() {
        this.A = true;
    }

    public final void Yb() {
        this.A = false;
        _b();
    }

    public APa<HVa<C6532gqa, Boolean>> Za() {
        return this.x.p();
    }

    public APa<C3508cda> _a() {
        return this.x.a();
    }

    public APa<C6532gqa> ab() {
        return this.x.f();
    }

    public void b() {
    }

    public APa<RVa> c() {
        APa<RVa> c = APa.c(RVa.a);
        C7471uYa.a((Object) c, "Observable.just(Unit)");
        return c;
    }

    public APa<C6532gqa> cb() {
        return this.x.i();
    }

    public APa<RVa> d() {
        C7592wHa wha = this.t;
        if (wha != null) {
            return wha.g();
        }
        C7471uYa.b("visibilityEmitter");
        throw null;
    }

    public APa<List<e>> db() {
        return this.x.r();
    }

    public APa<RVa> e() {
        return C0182a.a(this);
    }

    public APa<HVa<C6532gqa, Boolean>> eb() {
        return this.x.e();
    }

    public APa<RVa> f() {
        C6769kJa<C6260cqa, C6973nJa> kja = this.w;
        if (kja != null) {
            return kja.g();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<C6532gqa> fb() {
        return this.x.h();
    }

    public APa<f> hb() {
        return this.x.l();
    }

    public APa<Boolean> ib() {
        return this.x.b();
    }

    public APa<C6532gqa> jb() {
        return this.x.j();
    }

    public APa<C6532gqa> kb() {
        return this.x.d();
    }

    public APa<C6532gqa> lb() {
        return this.x.m();
    }

    public APa<C6532gqa> mb() {
        return this.x.q();
    }

    public APa<e> n() {
        C c = this.v;
        if (c != null) {
            return c.j();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<f> nb() {
        return this.x.c();
    }

    public APa<C6532gqa> ob() {
        return this.x.g();
    }

    public void onAttach(Context context) {
        C7471uYa.b(context, "context");
        dagger.android.support.a.a(this);
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            C7080ora ora = this.j;
            if (ora != null) {
                C3508cda bc = bc();
                String a2 = ha.a(arguments).a();
                C7471uYa.a((Object) a2, "ScreenHelper.fromBundle(arguments).get()");
                this.u = ora.a(bc, a2, (SearchQuerySourceInfo) arguments.getParcelable("query_source_info"), (PromotedSourceInfo) arguments.getParcelable("promoted_source_info"));
                setHasOptionsMenu(true);
                return;
            }
            C7471uYa.b("playlistPresenterFactory");
            throw null;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C7471uYa.b(menu, "menu");
        C7471uYa.b(menuInflater, "inflater");
        menuInflater.inflate(m.playlist_details_edit_actions, menu);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C7471uYa.b(menuItem, "item");
        if (menuItem.getItemId() != i.edit_validate) {
            return false;
        }
        this.x.t();
        return true;
    }

    public void onPrepareOptionsMenu(Menu menu) {
        C7471uYa.b(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        A a2 = this.r;
        if (a2 != null) {
            a2.a(menu, getResources());
        } else {
            C7471uYa.b("toolbarView");
            throw null;
        }
    }

    public APa<C6532gqa> pb() {
        return this.x.o();
    }

    private final void f(boolean z2) {
        C5751w wVar = this.s;
        if (wVar != null) {
            wVar.a(z2);
            M m2 = this.z;
            if (m2 != null) {
                m2.a(z2, Zb());
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        C7471uYa.b("headerScrollHelper");
        throw null;
    }

    /* access modifiers changed from: protected */
    public C6804kqa Tb() {
        C7080ora ora = this.j;
        if (ora != null) {
            C3508cda bc = bc();
            String a2 = ha.a(getArguments()).a();
            C7471uYa.a((Object) a2, "ScreenHelper.fromBundle(arguments).get()");
            Bundle arguments = getArguments();
            String str = "Required value was null.";
            if (arguments != null) {
                SearchQuerySourceInfo searchQuerySourceInfo = (SearchQuerySourceInfo) arguments.getParcelable("query_source_info");
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    return ora.a(bc, a2, searchQuerySourceInfo, (PromotedSourceInfo) arguments2.getParcelable("promoted_source_info"));
                }
                throw new IllegalArgumentException(str);
            }
            throw new IllegalArgumentException(str);
        }
        C7471uYa.b("playlistPresenterFactory");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void b(C6804kqa kqa) {
        C7471uYa.b(kqa, "presenter");
        kqa.a();
    }

    public void c(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        C4655rja rja = this.q;
        if (rja != null) {
            C4621nja c = C4621nja.c(cda);
            C7471uYa.a((Object) c, "NavigationTarget.forProfile(urn)");
            rja.a(c);
            return;
        }
        C7471uYa.b("navigator");
        throw null;
    }

    public void d(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        C5000Ipa.a(getFragmentManager(), cda);
    }

    public void e(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        C4655rja rja = this.q;
        if (rja != null) {
            C4621nja a2 = C4621nja.a(C3920yea.OFFLINE);
            C7471uYa.a((Object) a2, "NavigationTarget.forUpgrade(UpsellContext.OFFLINE)");
            rja.a(a2);
            return;
        }
        C7471uYa.b("navigator");
        throw null;
    }

    private final void c(C6832lEa<C7218qra, C6973nJa> lea) {
        C7218qra qra = (C7218qra) lea.b();
        G g = this.y;
        if (g == null) {
            throw new IllegalArgumentException("Required value was null.");
        } else if (qra == null || !qra.c().q()) {
            g.a((RecyclerView) null);
        } else {
            g.a(Zb());
        }
    }

    private final void d(C6832lEa<C7218qra, C6973nJa> lea) {
        C7218qra qra = (C7218qra) lea.b();
        if (qra != null) {
            a(qra);
            f(qra.c().q());
        }
    }

    /* access modifiers changed from: protected */
    public void a(C6804kqa kqa) {
        C7471uYa.b(kqa, "presenter");
        kqa.a((defpackage.C6804kqa.a) this);
    }

    public void b(Object obj) {
        C7471uYa.b(obj, "ignored");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void a(C6832lEa<C7218qra, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        d(lea);
        b(lea);
    }

    public void b(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        C4655rja rja = this.q;
        if (rja != null) {
            C4621nja a2 = C4621nja.a(C3920yea.PREMIUM_CONTENT);
            C7471uYa.a((Object) a2, "NavigationTarget.forUpgr…lContext.PREMIUM_CONTENT)");
            rja.a(a2);
            return;
        }
        C7471uYa.b("navigator");
        throw null;
    }

    private final void b(C6832lEa<C7218qra, C6973nJa> lea) {
        C6769kJa<C6260cqa, C6973nJa> kja = this.w;
        if (kja != null) {
            kja.a(ea.a.a(true, lea));
            c(lea);
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    private final void d(int i2) {
        List ac = ac();
        C c = this.v;
        String str = "adapter";
        if (c != null) {
            c.h().remove(i2);
            C c2 = this.v;
            if (c2 != null) {
                c2.e(i2);
                this.x.a(ac());
                C5052KJa kJa = this.p;
                if (kJa != null) {
                    Fca fca = new Fca(p.track_removed, 0, p.undo, new C5749u(this, ac), null, null, 48, null);
                    kJa.a(fca);
                    return;
                }
                C7471uYa.b("feedbackController");
                throw null;
            }
            C7471uYa.b(str);
            throw null;
        }
        C7471uYa.b(str);
        throw null;
    }

    public void a(C2037FR fr) {
        C7471uYa.b(fr, "result");
        Toast.makeText(getContext(), fr.a(), 0).show();
    }

    public void a(C6532gqa gqa) {
        C7471uYa.b(gqa, "params");
        Da.a(getFragmentManager(), gqa.l().a(), gqa.m());
    }

    public void a(Object obj) {
        C7471uYa.b(obj, "ignored");
        FragmentActivity requireActivity = requireActivity();
        C7471uYa.a((Object) requireActivity, "requireActivity()");
        C5987t.a(requireActivity.getSupportFragmentManager());
    }

    public void b(f fVar) {
        C7471uYa.b(fVar, "item");
        this.x.c(fVar);
    }

    public void a(Mca mca) {
        C7471uYa.b(mca, "options");
        Lca lca = this.m;
        if (lca != null) {
            Context requireContext = requireContext();
            C7471uYa.a((Object) requireContext, "requireContext()");
            lca.a(requireContext, mca);
            return;
        }
        C7471uYa.b("trackEngagements");
        throw null;
    }

    public void c(f fVar) {
        C7471uYa.b(fVar, "item");
        this.x.b(fVar);
        C c = this.v;
        String str = "adapter";
        if (c != null) {
            int indexOf = c.h().indexOf(fVar);
            C c2 = this.v;
            if (c2 != null) {
                c2.h(indexOf);
                C c3 = this.v;
                if (c3 != null) {
                    c3.e(indexOf);
                } else {
                    C7471uYa.b(str);
                    throw null;
                }
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else {
            C7471uYa.b(str);
            throw null;
        }
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        N n2 = this.o;
        if (n2 != null) {
            M a2 = n2.a((CustomFontTitleToolbar) view.findViewById(i.toolbar_id), view.findViewById(i.top_gradient), view.findViewById(i.system_bars_holder));
            RecyclerView Zb = Zb();
            C c = this.v;
            if (c != null) {
                a2.a(Zb, (androidx.recyclerview.widget.RecyclerView.a) c);
                this.z = a2;
                V v2 = this.k;
                if (v2 != null) {
                    this.y = new G(v2.a(this));
                    C6769kJa<C6260cqa, C6973nJa> kja = this.w;
                    if (kja != null) {
                        C6769kJa.a(kja, view, false, new r(view), 0, 8, null);
                        return;
                    }
                    C7471uYa.b("collectionRenderer");
                    throw null;
                }
                C7471uYa.b("touchCallbackFactory");
                throw null;
            }
            C7471uYa.b("adapter");
            throw null;
        }
        C7471uYa.b("headerAnimatorFactory");
        throw null;
    }

    public final void c(int i2) {
        d(i2);
    }

    private final void a(C7218qra qra) {
        A a2 = this.r;
        if (a2 != null) {
            a2.a(qra.c(), getResources());
        } else {
            C7471uYa.b("toolbarView");
            throw null;
        }
    }

    public void a(ViewHolder viewHolder) {
        C7471uYa.b(viewHolder, "holder");
        G g = this.y;
        if (g != null) {
            g.b(viewHolder);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void a(f fVar) {
        C7471uYa.b(fVar, "item");
        this.x.a(fVar);
    }

    public final void a(int i2, int i3) {
        C c = this.v;
        String str = "adapter";
        if (c != null) {
            Collections.swap(c.h(), i2, i3);
            C c2 = this.v;
            if (c2 != null) {
                c2.a(i2, i3);
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else {
            C7471uYa.b(str);
            throw null;
        }
    }
}
