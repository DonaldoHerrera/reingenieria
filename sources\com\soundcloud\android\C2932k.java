package com.soundcloud.android;

import com.soundcloud.android.accounts.LogoutFragment;
import com.soundcloud.android.activities.ActivitiesFragment;
import com.soundcloud.android.cast.CastMediaIntentReceiver;
import com.soundcloud.android.cast.CastOptionsProvider;
import com.soundcloud.android.cast.activity.CastRedirectActivity;
import com.soundcloud.android.collection.CollectionFragment;
import com.soundcloud.android.collection.Da;
import com.soundcloud.android.collection.playhistory.PlayHistoryFragment;
import com.soundcloud.android.collection.recentlyplayed.RecentlyPlayedFragment;
import com.soundcloud.android.comments.C2876c;
import com.soundcloud.android.comments.Ga;
import com.soundcloud.android.creators.upload.MetadataFragment;
import com.soundcloud.android.creators.upload.UploadMonitorFragment;
import com.soundcloud.android.creators.upload.UploadService;
import com.soundcloud.android.creators.upload.k;
import com.soundcloud.android.creators.upload.l;
import com.soundcloud.android.creators.upload.p;
import com.soundcloud.android.discovery.systemplaylist.SystemPlaylistFragment;
import com.soundcloud.android.downgrade.GoOffboardingFragment;
import com.soundcloud.android.likes.LikeInNotificationBroadcastReceiver;
import com.soundcloud.android.likes.TrackLikesUniflowFragment;
import com.soundcloud.android.more.BasicSettingsFragment;
import com.soundcloud.android.more.MoreFragment;
import com.soundcloud.android.offline.MediaMountedReceiver;
import com.soundcloud.android.offline.Od;
import com.soundcloud.android.offline.OfflineContentService;
import com.soundcloud.android.onboarding.OnboardActivity;
import com.soundcloud.android.onboarding.auth.AlmostDoneLayout;
import com.soundcloud.android.onboarding.auth.AuthenticatorService;
import com.soundcloud.android.onboarding.auth.E;
import com.soundcloud.android.onboarding.auth.S;
import com.soundcloud.android.playback.playqueue.PlayQueueFragment;
import com.soundcloud.android.playback.service.PlayerAppWidgetProvider;
import com.soundcloud.android.playback.ui.C4436ab;
import com.soundcloud.android.playback.widget.PlayerWidgetReceiver;
import com.soundcloud.android.profile.ProfileBucketsFragment;
import com.soundcloud.android.profile.ProfileFragment;
import com.soundcloud.android.profile.UserAlbumsFragment;
import com.soundcloud.android.profile.UserDetailsFragment;
import com.soundcloud.android.profile.UserFollowersFragment;
import com.soundcloud.android.profile.UserFollowingsFragment;
import com.soundcloud.android.profile.UserLikesFragment;
import com.soundcloud.android.profile.UserPlaylistsFragment;
import com.soundcloud.android.profile.UserRepostsFragment;
import com.soundcloud.android.profile.UserTracksFragment;
import com.soundcloud.android.search.SearchFragment;
import com.soundcloud.android.search.SearchResultsFragment;
import com.soundcloud.android.search.Ta;
import com.soundcloud.android.search.history.SearchHistoryFragment;
import com.soundcloud.android.search.suggestions.searchsuggestions.SearchSuggestionsUniflowFragment;
import com.soundcloud.android.settings.C5954k;
import com.soundcloud.android.settings.C5969p;
import com.soundcloud.android.settings.C5986s;
import com.soundcloud.android.settings.SettingsFragment;
import com.soundcloud.android.settings.offline.OfflineSettingsFragment;
import com.soundcloud.android.settings.privacy.AdvertisingSettingsFragment;
import com.soundcloud.android.settings.privacy.AnalyticsSettingsFragment;
import com.soundcloud.android.settings.privacy.CommunicationsSettingsFragment;
import com.soundcloud.android.settings.streamingquality.StreamingQualitySettingsFragment;
import com.soundcloud.android.stations.LikedStationsFragment;
import com.soundcloud.android.stations.StationInfoFragment;
import com.soundcloud.android.stream.StreamFragment;
import com.soundcloud.android.sync.SyncAdapterService;
import com.soundcloud.android.tracks.C6170ha;
import com.soundcloud.android.upgrade.n;
import com.soundcloud.android.view.C;
import com.soundcloud.android.view.behavior.ContentBottomPaddingBehavior;
import com.soundcloud.android.view.behavior.ScrollingViewContentBottomPaddingBehavior;

/* renamed from: com.soundcloud.android.k reason: case insensitive filesystem */
/* compiled from: ApplicationComponent */
public interface C2932k {
    void a(C4875Eoa eoa);

    void a(C5000Ipa ipa);

    void a(C5449Xoa xoa);

    void a(C5486Ywa ywa);

    void a(BugReporterTileService bugReporterTileService);

    void a(LogoutFragment logoutFragment);

    void a(ActivitiesFragment activitiesFragment);

    void a(CastMediaIntentReceiver castMediaIntentReceiver);

    void a(CastOptionsProvider castOptionsProvider);

    void a(CastRedirectActivity castRedirectActivity);

    void a(CollectionFragment collectionFragment);

    void a(Da da);

    void a(PlayHistoryFragment playHistoryFragment);

    void a(RecentlyPlayedFragment recentlyPlayedFragment);

    void a(Ga ga);

    void a(C2876c cVar);

    void a(MetadataFragment metadataFragment);

    void a(UploadMonitorFragment uploadMonitorFragment);

    void a(UploadService uploadService);

    void a(k kVar);

    void a(l lVar);

    void a(p pVar);

    void a(SystemPlaylistFragment systemPlaylistFragment);

    void a(GoOffboardingFragment goOffboardingFragment);

    void a(LikeInNotificationBroadcastReceiver likeInNotificationBroadcastReceiver);

    void a(TrackLikesUniflowFragment trackLikesUniflowFragment);

    void a(BasicSettingsFragment basicSettingsFragment);

    void a(MoreFragment moreFragment);

    void a(MediaMountedReceiver mediaMountedReceiver);

    void a(Od od);

    void a(OfflineContentService offlineContentService);

    void a(OnboardActivity onboardActivity);

    void a(AlmostDoneLayout almostDoneLayout);

    void a(AuthenticatorService authenticatorService);

    void a(E e);

    void a(S s);

    void a(PlayQueueFragment playQueueFragment);

    void a(PlayerAppWidgetProvider playerAppWidgetProvider);

    void a(C4436ab abVar);

    void a(PlayerWidgetReceiver playerWidgetReceiver);

    void a(ProfileBucketsFragment profileBucketsFragment);

    void a(ProfileFragment profileFragment);

    void a(UserAlbumsFragment userAlbumsFragment);

    void a(UserDetailsFragment userDetailsFragment);

    void a(UserFollowersFragment userFollowersFragment);

    void a(UserFollowingsFragment userFollowingsFragment);

    void a(UserLikesFragment userLikesFragment);

    void a(UserPlaylistsFragment userPlaylistsFragment);

    void a(UserRepostsFragment userRepostsFragment);

    void a(UserTracksFragment userTracksFragment);

    void a(SearchFragment searchFragment);

    void a(SearchResultsFragment searchResultsFragment);

    void a(Ta ta);

    void a(SearchHistoryFragment searchHistoryFragment);

    void a(SearchSuggestionsUniflowFragment searchSuggestionsUniflowFragment);

    void a(SettingsFragment settingsFragment);

    void a(C5954k kVar);

    void a(com.soundcloud.android.settings.notifications.l lVar);

    void a(OfflineSettingsFragment offlineSettingsFragment);

    void a(C5969p pVar);

    void a(AdvertisingSettingsFragment advertisingSettingsFragment);

    void a(AnalyticsSettingsFragment analyticsSettingsFragment);

    void a(CommunicationsSettingsFragment communicationsSettingsFragment);

    void a(C5986s sVar);

    void a(StreamingQualitySettingsFragment streamingQualitySettingsFragment);

    void a(LikedStationsFragment likedStationsFragment);

    void a(StationInfoFragment stationInfoFragment);

    void a(StreamFragment streamFragment);

    void a(SyncAdapterService syncAdapterService);

    void a(C6170ha haVar);

    void a(n nVar);

    void a(C c);

    void a(ContentBottomPaddingBehavior contentBottomPaddingBehavior);

    void a(ScrollingViewContentBottomPaddingBehavior scrollingViewContentBottomPaddingBehavior);

    void a(C6274cxa cxa);

    void a(C3149nN nNVar);
}
