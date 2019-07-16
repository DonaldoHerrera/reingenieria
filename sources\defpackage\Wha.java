package defpackage;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.activities.ActivitiesFragment;
import com.soundcloud.android.collection.playhistory.PlayHistoryFragment;
import com.soundcloud.android.collection.recentlyplayed.RecentlyPlayedFragment;
import com.soundcloud.android.comments.CommentsFragment.b;
import com.soundcloud.android.comments.Y;
import com.soundcloud.android.discovery.systemplaylist.G;
import com.soundcloud.android.discovery.systemplaylist.SystemPlaylistFragment;
import com.soundcloud.android.features.library.artists.ArtistsFragment;
import com.soundcloud.android.features.library.downloads.DownloadsFragment;
import com.soundcloud.android.features.library.likes.TrackLikesFragment;
import com.soundcloud.android.features.library.likes.search.LikesSearchFragment;
import com.soundcloud.android.features.library.playlists.PlaylistCollectionFragment;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.likes.TrackLikesUniflowFragment;
import com.soundcloud.android.main.ha;
import com.soundcloud.android.more.BasicSettingsFragment;
import com.soundcloud.android.playlist.view.PlaylistDetailFragment;
import com.soundcloud.android.profile.ProfileFragment;
import com.soundcloud.android.profile.UserAlbumsFragment;
import com.soundcloud.android.profile.UserFollowersFragment;
import com.soundcloud.android.profile.UserFollowingsFragment;
import com.soundcloud.android.profile.UserFollowingsFragment.a;
import com.soundcloud.android.profile.UserLikesFragment;
import com.soundcloud.android.profile.UserPlaylistsFragment;
import com.soundcloud.android.profile.UserRepostsFragment;
import com.soundcloud.android.profile.UserTopTracksFragment;
import com.soundcloud.android.profile.UserTracksFragment;
import com.soundcloud.android.settings.SettingsFragment;
import com.soundcloud.android.settings.offline.OfflineSettingsFragment;
import com.soundcloud.android.settings.privacy.AdvertisingSettingsFragment;
import com.soundcloud.android.settings.privacy.AnalyticsSettingsFragment;
import com.soundcloud.android.settings.privacy.CommunicationsSettingsFragment;
import com.soundcloud.android.settings.streamingquality.StreamingQualitySettingsFragment;
import com.soundcloud.android.stations.LikedStationsFragment;
import com.soundcloud.android.stations.StationFragmentArgs;
import com.soundcloud.android.stations.StationInfoFragment;

/* renamed from: Wha reason: default package */
/* compiled from: BottomNavigationIntentFactory.kt */
public class Wha {
    private final C2040FU a;

    public Wha(C2040FU fu) {
        C7471uYa.b(fu, "collection2Experiment");
        this.a = fu;
    }

    private Fragment b(Intent intent) {
        String str = "auto_play";
        if (a().c()) {
            return TrackLikesFragment.j.a(intent.getBooleanExtra(str, false));
        }
        return TrackLikesUniflowFragment.j.a(intent.getBooleanExtra(str, false));
    }

    public C2040FU a() {
        return this.a;
    }

    public Fragment a(Intent intent) {
        C7471uYa.b(intent, "intent");
        String action = intent.getAction();
        Yca a2 = ha.a(intent);
        C3508cda a3 = C5526_Ha.a(intent, "userUrn");
        SearchQuerySourceInfo searchQuerySourceInfo = (SearchQuerySourceInfo) intent.getParcelableExtra("searchQuerySourceInfo");
        String str = null;
        if (action == null) {
            return null;
        }
        String str2 = "urn";
        String str3 = "screen";
        String str4 = "Required value was null.";
        switch (action.hashCode()) {
            case -2089380615:
                if (!action.equals("STATION_INFO")) {
                    return null;
                }
                C3508cda a4 = C5526_Ha.a(intent, str2);
                C3508cda a5 = C5526_Ha.a(intent, "seed_urn");
                String stringExtra = intent.getStringExtra("source");
                StationInfoFragment stationInfoFragment = new StationInfoFragment();
                String valueOf = String.valueOf(a4);
                if (a5 != null) {
                    str = a5.toString();
                }
                stationInfoFragment.setArguments(new StationFragmentArgs(valueOf, str, stringExtra).d());
                return stationInfoFragment;
            case -2077709277:
                if (action.equals("SETTINGS")) {
                    return new SettingsFragment();
                }
                return null;
            case -1965517058:
                if (action.equals("ADVERTISING_SETTINGS")) {
                    return new AdvertisingSettingsFragment();
                }
                return null;
            case -1761269779:
                if (action.equals("ACTIVITIES")) {
                    return new ActivitiesFragment();
                }
                return null;
            case -1541321726:
                if (!action.equals("FOLLOWINGS")) {
                    return null;
                }
                a aVar = UserFollowingsFragment.o;
                if (a3 != null) {
                    return aVar.a(a3);
                }
                throw new IllegalStateException(str4);
            case -1495841850:
                if (!action.equals("USER_TOP_TRACKS")) {
                    return null;
                }
                UserTopTracksFragment.a aVar2 = UserTopTracksFragment.i;
                if (a3 != null) {
                    C7471uYa.a((Object) a2, str3);
                    return aVar2.a(a3, a2, searchQuerySourceInfo);
                }
                throw new IllegalArgumentException(str4);
            case -1363992096:
                if (action.equals("STREAMING_QUALITY_SETTINGS")) {
                    return new StreamingQualitySettingsFragment();
                }
                return null;
            case -1026506270:
                if (!action.equals("SYSTEM_PLAYLIST")) {
                    return null;
                }
                return SystemPlaylistFragment.i.a(new G(C5526_Ha.a(intent, "extra_urn"), intent.getStringExtra("extra_permalink")));
            case -965718488:
                if (!action.equals("USER_LIKES")) {
                    return null;
                }
                UserLikesFragment.a aVar3 = UserLikesFragment.l;
                if (a3 != null) {
                    C7471uYa.a((Object) a2, str3);
                    return aVar3.a(a3, a2, searchQuerySourceInfo);
                }
                throw new IllegalArgumentException(str4);
            case -742460427:
                if (!action.equals("FOLLOWERS")) {
                    return null;
                }
                UserFollowersFragment.a aVar4 = UserFollowersFragment.o;
                if (a3 != null) {
                    return aVar4.a(a3);
                }
                throw new IllegalStateException(str4);
            case -637162959:
                if (action.equals("LIKED_STATIONS")) {
                    return LikedStationsFragment.i.a();
                }
                return null;
            case -195667765:
                if (action.equals("DOWNLOADS")) {
                    return new DownloadsFragment();
                }
                return null;
            case -184905000:
                if (!action.equals("USER_ALBUMS")) {
                    return null;
                }
                UserAlbumsFragment.a aVar5 = UserAlbumsFragment.l;
                if (a3 != null) {
                    C7471uYa.a((Object) a2, str3);
                    return aVar5.a(a3, a2, searchQuerySourceInfo);
                }
                throw new IllegalArgumentException(str4);
            case -177953459:
                if (!action.equals("USER_PLAYLISTS")) {
                    return null;
                }
                UserPlaylistsFragment.a aVar6 = UserPlaylistsFragment.l;
                if (a3 != null) {
                    C7471uYa.a((Object) a2, str3);
                    return aVar6.a(a3, a2, searchQuerySourceInfo);
                }
                throw new IllegalArgumentException(str4);
            case -163581377:
                if (action.equals("TRACK_LIKES_SEARCH")) {
                    return new LikesSearchFragment();
                }
                return null;
            case -100547773:
                if (action.equals("OFFLINE_LISTENING_SETTINGS")) {
                    return new OfflineSettingsFragment();
                }
                return null;
            case -35760694:
                if (action.equals("RECENTLY_PLAYED")) {
                    return new RecentlyPlayedFragment();
                }
                return null;
            case -14379540:
                if (!action.equals("ARTISTS")) {
                    return null;
                }
                ArtistsFragment.a aVar7 = ArtistsFragment.j;
                if (a3 != null) {
                    return aVar7.a(a3);
                }
                throw new IllegalStateException(str4);
            case 122209989:
                if (action.equals("COMMUNICATIONS_SETTINGS")) {
                    return new CommunicationsSettingsFragment();
                }
                return null;
            case 274409096:
                if (action.equals("TRACK_COMMENTS")) {
                    return new b().a(Y.a.a(intent));
                }
                return null;
            case 364542844:
                if (!action.equals("USER_TRACKS")) {
                    return null;
                }
                UserTracksFragment.a aVar8 = UserTracksFragment.i;
                if (a3 != null) {
                    C7471uYa.a((Object) a2, str3);
                    return aVar8.a(a3, a2, searchQuerySourceInfo);
                }
                throw new IllegalArgumentException(str4);
            case 364960648:
                if (action.equals("TRACK_LIKES")) {
                    return b(intent);
                }
                return null;
            case 408556937:
                if (action.equals("PROFILE")) {
                    return ProfileFragment.a(a3, searchQuerySourceInfo);
                }
                return null;
            case 427159978:
                if (action.equals("PLAYLISTS_AND_ALBUMS")) {
                    return PlaylistCollectionFragment.i.a();
                }
                return null;
            case 477374057:
                if (action.equals("PLAY_HISTORY")) {
                    return new PlayHistoryFragment();
                }
                return null;
            case 535995612:
                if (action.equals("ANALYTICS_SETTINGS")) {
                    return new AnalyticsSettingsFragment();
                }
                return null;
            case 577925356:
                if (!action.equals("USER_REPOSTS")) {
                    return null;
                }
                UserRepostsFragment.a aVar9 = UserRepostsFragment.l;
                if (a3 != null) {
                    C7471uYa.a((Object) a2, str3);
                    return aVar9.a(a3, a2, searchQuerySourceInfo);
                }
                throw new IllegalArgumentException(str4);
            case 923316532:
                if (action.equals("BASIC_SETTINGS")) {
                    return new BasicSettingsFragment();
                }
                return null;
            case 2093369182:
                if (!action.equals("PLAYLIST_DETAIL")) {
                    return null;
                }
                C3508cda a6 = C5526_Ha.a(intent, str2);
                if (a6 != null) {
                    SearchQuerySourceInfo searchQuerySourceInfo2 = (SearchQuerySourceInfo) intent.getParcelableExtra("query_source_info");
                    PromotedSourceInfo promotedSourceInfo = (PromotedSourceInfo) intent.getParcelableExtra("promoted_source_info");
                    boolean booleanExtra = intent.getBooleanExtra("autoplay", false);
                    PlaylistDetailFragment.a aVar10 = PlaylistDetailFragment.i;
                    C7471uYa.a((Object) a2, str3);
                    return aVar10.a(a6, a2, searchQuerySourceInfo2, promotedSourceInfo, booleanExtra);
                }
                throw new IllegalArgumentException(str4);
            default:
                return null;
        }
    }
}
