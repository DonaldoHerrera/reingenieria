package com.soundcloud.android.app;

import android.accounts.AccountManager;
import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.n;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.soundcloud.android.BugReporterTileService;
import com.soundcloud.android.C2931j;
import com.soundcloud.android.C2933l;
import com.soundcloud.android.C2934m;
import com.soundcloud.android.C2936o;
import com.soundcloud.android.C2937p;
import com.soundcloud.android.C2938q;
import com.soundcloud.android.C2939r;
import com.soundcloud.android.C2940s;
import com.soundcloud.android.C2941t;
import com.soundcloud.android.C2942u;
import com.soundcloud.android.C2943v;
import com.soundcloud.android.C2944w;
import com.soundcloud.android.C2945x;
import com.soundcloud.android.C2946y;
import com.soundcloud.android.C2947z;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.C2524e;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.accounts.C2527h;
import com.soundcloud.android.accounts.C2529j;
import com.soundcloud.android.accounts.LogoutFragment;
import com.soundcloud.android.activities.ActivitiesFragment;
import com.soundcloud.android.activities.C2540e;
import com.soundcloud.android.activities.C2542g;
import com.soundcloud.android.activities.w;
import com.soundcloud.android.activities.x;
import com.soundcloud.android.ads.Ab;
import com.soundcloud.android.ads.C2567eb;
import com.soundcloud.android.ads.C2568ec;
import com.soundcloud.android.ads.C2571fb;
import com.soundcloud.android.ads.C2575gb;
import com.soundcloud.android.ads.C2586ja;
import com.soundcloud.android.ads.C2587jb;
import com.soundcloud.android.ads.C2590ka;
import com.soundcloud.android.ads.C2591kb;
import com.soundcloud.android.ads.C2594la;
import com.soundcloud.android.ads.C2595lb;
import com.soundcloud.android.ads.C2599mb;
import com.soundcloud.android.ads.C2606oa;
import com.soundcloud.android.ads.C2610pa;
import com.soundcloud.android.ads.C2614qa;
import com.soundcloud.android.ads.C2618rb;
import com.soundcloud.android.ads.C2630ub;
import com.soundcloud.android.ads.C2633va;
import com.soundcloud.android.ads.C2634vb;
import com.soundcloud.android.ads.C2642xb;
import com.soundcloud.android.ads.C2646yb;
import com.soundcloud.android.ads.C2649za;
import com.soundcloud.android.ads.Cb;
import com.soundcloud.android.ads.Fb;
import com.soundcloud.android.ads.FullScreenVideoActivity;
import com.soundcloud.android.ads.Gc;
import com.soundcloud.android.ads.Hc;
import com.soundcloud.android.ads.Kb;
import com.soundcloud.android.ads.Oc;
import com.soundcloud.android.ads.PrestitialActivity;
import com.soundcloud.android.ads.PrestitialAdsController;
import com.soundcloud.android.ads.Qc;
import com.soundcloud.android.ads.Uc;
import com.soundcloud.android.ads.Wb;
import com.soundcloud.android.ads.Yb;
import com.soundcloud.android.ads._c;
import com.soundcloud.android.ads.ad;
import com.soundcloud.android.ads.cd;
import com.soundcloud.android.ads.data.VideoAdsDatabase;
import com.soundcloud.android.ads.data.v;
import com.soundcloud.android.ads.ed;
import com.soundcloud.android.ads.gd;
import com.soundcloud.android.ads.hd;
import com.soundcloud.android.ads.id;
import com.soundcloud.android.ads.jd;
import com.soundcloud.android.ads.nd;
import com.soundcloud.android.ads.od;
import com.soundcloud.android.ads.pd;
import com.soundcloud.android.cast.C2728b;
import com.soundcloud.android.cast.C2729c;
import com.soundcloud.android.cast.C2730d;
import com.soundcloud.android.cast.C2731e;
import com.soundcloud.android.cast.C2732f;
import com.soundcloud.android.cast.C2733g;
import com.soundcloud.android.cast.CastMediaIntentReceiver;
import com.soundcloud.android.cast.CastOptionsProvider;
import com.soundcloud.android.cast.activity.CastRedirectActivity;
import com.soundcloud.android.collection.C2744ea;
import com.soundcloud.android.collection.C2746fa;
import com.soundcloud.android.collection.C2750ha;
import com.soundcloud.android.collection.C2837s;
import com.soundcloud.android.collection.C2838t;
import com.soundcloud.android.collection.C2839u;
import com.soundcloud.android.collection.C2840v;
import com.soundcloud.android.collection.C2842x;
import com.soundcloud.android.collection.CollectionFragment;
import com.soundcloud.android.collection.playhistory.C2783k;
import com.soundcloud.android.collection.playhistory.C2784l;
import com.soundcloud.android.collection.playhistory.C2789q;
import com.soundcloud.android.collection.playhistory.C2792u;
import com.soundcloud.android.collection.playhistory.C2793v;
import com.soundcloud.android.collection.playhistory.C2794w;
import com.soundcloud.android.collection.playhistory.C2795x;
import com.soundcloud.android.collection.playhistory.PlayHistoryFragment;
import com.soundcloud.android.collection.playhistory.ka;
import com.soundcloud.android.collection.playhistory.va;
import com.soundcloud.android.collection.playhistory.xa;
import com.soundcloud.android.collection.recentlyplayed.C2802ba;
import com.soundcloud.android.collection.recentlyplayed.C2805d;
import com.soundcloud.android.collection.recentlyplayed.C2807e;
import com.soundcloud.android.collection.recentlyplayed.C2812ga;
import com.soundcloud.android.collection.recentlyplayed.C2815i;
import com.soundcloud.android.collection.recentlyplayed.C2816ia;
import com.soundcloud.android.collection.recentlyplayed.C2817j;
import com.soundcloud.android.collection.recentlyplayed.C2819k;
import com.soundcloud.android.collection.recentlyplayed.C2821l;
import com.soundcloud.android.collection.recentlyplayed.C2826o;
import com.soundcloud.android.collection.recentlyplayed.C2827p;
import com.soundcloud.android.collection.recentlyplayed.C2828q;
import com.soundcloud.android.collection.recentlyplayed.C2830t;
import com.soundcloud.android.collection.recentlyplayed.RecentlyPlayedFragment;
import com.soundcloud.android.collection.ua;
import com.soundcloud.android.collection.wa;
import com.soundcloud.android.collections.data.C2856l;
import com.soundcloud.android.collections.data.C2857m;
import com.soundcloud.android.collections.data.C2858n;
import com.soundcloud.android.collections.data.C2860p;
import com.soundcloud.android.collections.data.C2861q;
import com.soundcloud.android.collections.data.CollectionsDatabase;
import com.soundcloud.android.collections.data.aa;
import com.soundcloud.android.comments.C2876c;
import com.soundcloud.android.comments.C2878cb;
import com.soundcloud.android.comments.C2881db;
import com.soundcloud.android.comments.C2888h;
import com.soundcloud.android.comments.C2902o;
import com.soundcloud.android.comments.CommentsFragment;
import com.soundcloud.android.comments.PlayerCommentsFragment;
import com.soundcloud.android.comments.Q.a.C0060a;
import com.soundcloud.android.comments.S.a.C0061a;
import com.soundcloud.android.comments.Za;
import com.soundcloud.android.comments.gb;
import com.soundcloud.android.comments.mb;
import com.soundcloud.android.creators.record.RecordActivity;
import com.soundcloud.android.creators.record.RecordPermissionsActivity;
import com.soundcloud.android.creators.record.UploadActivity;
import com.soundcloud.android.creators.upload.MetadataFragment;
import com.soundcloud.android.creators.upload.MetadataPresenter;
import com.soundcloud.android.creators.upload.UploadMonitorFragment;
import com.soundcloud.android.creators.upload.UploadMonitorPresenter;
import com.soundcloud.android.creators.upload.UploadService;
import com.soundcloud.android.deeplinks.ResolveActivity;
import com.soundcloud.android.deeplinks.h;
import com.soundcloud.android.discovery.systemplaylist.C3521l;
import com.soundcloud.android.discovery.systemplaylist.C3530v;
import com.soundcloud.android.discovery.systemplaylist.SystemPlaylistFragment;
import com.soundcloud.android.downgrade.GoOffboardingActivity;
import com.soundcloud.android.downgrade.GoOffboardingFragment;
import com.soundcloud.android.downgrade.c;
import com.soundcloud.android.fcm.C3535a;
import com.soundcloud.android.fcm.C3536b;
import com.soundcloud.android.fcm.C3537c;
import com.soundcloud.android.fcm.C3538d;
import com.soundcloud.android.fcm.C3539e;
import com.soundcloud.android.fcm.C3540f;
import com.soundcloud.android.fcm.C3541g;
import com.soundcloud.android.fcm.C3542h;
import com.soundcloud.android.fcm.FcmRegistrationService;
import com.soundcloud.android.fcm.ScFirebaseMessagingService;
import com.soundcloud.android.fcm.i;
import com.soundcloud.android.fcm.k;
import com.soundcloud.android.fcm.m;
import com.soundcloud.android.fcm.p.a.C0077a;
import com.soundcloud.android.fcm.q;
import com.soundcloud.android.fcm.q.a.C0078a;
import com.soundcloud.android.fcm.z;
import com.soundcloud.android.features.discovery.C3543a;
import com.soundcloud.android.features.discovery.C3547e;
import com.soundcloud.android.features.discovery.C3549g;
import com.soundcloud.android.features.discovery.C3549g.a.C0080a;
import com.soundcloud.android.features.discovery.C3551i;
import com.soundcloud.android.features.discovery.DiscoveryFragment;
import com.soundcloud.android.features.library.C3580f;
import com.soundcloud.android.features.library.C3584j;
import com.soundcloud.android.features.library.C3584j.a.C0083a;
import com.soundcloud.android.features.library.C3585k;
import com.soundcloud.android.features.library.C3585k.a.C0084a;
import com.soundcloud.android.features.library.C3586l;
import com.soundcloud.android.features.library.C3586l.a.C0085a;
import com.soundcloud.android.features.library.C3620m;
import com.soundcloud.android.features.library.C3620m.a.C0086a;
import com.soundcloud.android.features.library.C3621n;
import com.soundcloud.android.features.library.C3621n.a.C0087a;
import com.soundcloud.android.features.library.C3622o;
import com.soundcloud.android.features.library.C3622o.a.C0088a;
import com.soundcloud.android.features.library.C3623p;
import com.soundcloud.android.features.library.C3647y;
import com.soundcloud.android.features.library.LibraryFragment;
import com.soundcloud.android.features.library.artists.ArtistsFragment;
import com.soundcloud.android.features.library.downloads.C3567a;
import com.soundcloud.android.features.library.downloads.C3577k;
import com.soundcloud.android.features.library.downloads.C3578l;
import com.soundcloud.android.features.library.downloads.DownloadsFragment;
import com.soundcloud.android.features.library.likes.C3588b;
import com.soundcloud.android.features.library.likes.C3603q;
import com.soundcloud.android.features.library.likes.TrackLikesFragment;
import com.soundcloud.android.features.library.likes.search.C3609e;
import com.soundcloud.android.features.library.likes.search.C3610f;
import com.soundcloud.android.features.library.likes.search.C3614j;
import com.soundcloud.android.features.library.likes.search.C3615k;
import com.soundcloud.android.features.library.likes.search.LikesSearchFragment;
import com.soundcloud.android.features.library.playlists.C3624a;
import com.soundcloud.android.features.library.playlists.C3626c;
import com.soundcloud.android.features.library.playlists.C3627d;
import com.soundcloud.android.features.library.playlists.C3634k;
import com.soundcloud.android.features.library.playlists.C3637n;
import com.soundcloud.android.features.library.playlists.PlaylistCollectionFragment;
import com.soundcloud.android.features.record.C3669v;
import com.soundcloud.android.features.record.RecordAppWidgetProvider;
import com.soundcloud.android.features.record.RecordFragment;
import com.soundcloud.android.features.record.SoundRecorderService;
import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3701c;
import com.soundcloud.android.image.C3724e;
import com.soundcloud.android.image.C3725f;
import com.soundcloud.android.image.C3730k;
import com.soundcloud.android.image.C3733n;
import com.soundcloud.android.image.C3734o;
import com.soundcloud.android.image.C3735p;
import com.soundcloud.android.image.C3737s;
import com.soundcloud.android.image.C3739u;
import com.soundcloud.android.image.C3740v;
import com.soundcloud.android.image.C3741w;
import com.soundcloud.android.image.C3742x;
import com.soundcloud.android.image.C3743y;
import com.soundcloud.android.image.C3744z;
import com.soundcloud.android.image.oa;
import com.soundcloud.android.image.qa;
import com.soundcloud.android.image.ra;
import com.soundcloud.android.image.ta;
import com.soundcloud.android.ja;
import com.soundcloud.android.likes.C3970aa;
import com.soundcloud.android.likes.C3971b;
import com.soundcloud.android.likes.C3973c;
import com.soundcloud.android.likes.C3975d;
import com.soundcloud.android.likes.C3977e;
import com.soundcloud.android.likes.C3983h;
import com.soundcloud.android.likes.C3985i;
import com.soundcloud.android.likes.C3989m;
import com.soundcloud.android.likes.C4000y;
import com.soundcloud.android.likes.C4001z;
import com.soundcloud.android.likes.LikeInNotificationBroadcastReceiver;
import com.soundcloud.android.likes.TrackLikesUniflowFragment;
import com.soundcloud.android.likes.ma;
import com.soundcloud.android.listeners.dev.C4003b;
import com.soundcloud.android.listeners.dev.DevDrawerFragment;
import com.soundcloud.android.listeners.dev.DevEventLoggerMonitorReceiver;
import com.soundcloud.android.listeners.dev.O.a.C0101a;
import com.soundcloud.android.listeners.dev.P.a.C0102a;
import com.soundcloud.android.listeners.dev.Q.a.C0103a;
import com.soundcloud.android.listeners.dev.S.a.C0104a;
import com.soundcloud.android.listeners.dev.eventlogger.DevEventLoggerMonitorActivity;
import com.soundcloud.android.main.ActivityEnterScreenDispatcher;
import com.soundcloud.android.main.C4027f;
import com.soundcloud.android.main.C4027f.a.C0105a;
import com.soundcloud.android.main.C4028g;
import com.soundcloud.android.main.C4028g.a.C0106a;
import com.soundcloud.android.main.C4029h;
import com.soundcloud.android.main.C4029h.a.C0107a;
import com.soundcloud.android.main.C4030i;
import com.soundcloud.android.main.C4030i.a.C0108a;
import com.soundcloud.android.main.C4031j;
import com.soundcloud.android.main.C4031j.a.C0109a;
import com.soundcloud.android.main.C4032k;
import com.soundcloud.android.main.C4032k.a.C0110a;
import com.soundcloud.android.main.C4033l;
import com.soundcloud.android.main.C4033l.a.C0111a;
import com.soundcloud.android.main.C4034m;
import com.soundcloud.android.main.C4034m.a.C0112a;
import com.soundcloud.android.main.C4035n;
import com.soundcloud.android.main.C4035n.a.C0113a;
import com.soundcloud.android.main.C4036o;
import com.soundcloud.android.main.C4036o.a.C0114a;
import com.soundcloud.android.main.C4037p;
import com.soundcloud.android.main.C4037p.a.C0115a;
import com.soundcloud.android.main.C4038q;
import com.soundcloud.android.main.C4038q.a.C0116a;
import com.soundcloud.android.main.C4039s;
import com.soundcloud.android.main.C4039s.a.C0118a;
import com.soundcloud.android.main.C4040t;
import com.soundcloud.android.main.C4040t.a.C0119a;
import com.soundcloud.android.main.C4041u;
import com.soundcloud.android.main.C4041u.a.C0120a;
import com.soundcloud.android.main.C4042v;
import com.soundcloud.android.main.C4042v.a.C0121a;
import com.soundcloud.android.main.C4043w;
import com.soundcloud.android.main.C4043w.a.C0122a;
import com.soundcloud.android.main.C4044x;
import com.soundcloud.android.main.C4044x.a.C0123a;
import com.soundcloud.android.main.C4045y;
import com.soundcloud.android.main.C4045y.a.C0124a;
import com.soundcloud.android.main.C4046z;
import com.soundcloud.android.main.C4046z.a.C0125a;
import com.soundcloud.android.main.ForegroundTracker;
import com.soundcloud.android.main.FragmentEnterScreenDispatcher;
import com.soundcloud.android.main.FragmentScreenStateProvider;
import com.soundcloud.android.main.LauncherActivity;
import com.soundcloud.android.main.LoggedInActivity;
import com.soundcloud.android.main.MainActivity;
import com.soundcloud.android.main.MainNavigationPresenter;
import com.soundcloud.android.main.MainNavigationView;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.main.RootActivity;
import com.soundcloud.android.main.WebViewActivity;
import com.soundcloud.android.main.ba;
import com.soundcloud.android.main.r.a.C0117a;
import com.soundcloud.android.more.BasicSettingsFragment;
import com.soundcloud.android.more.MoreFragment;
import com.soundcloud.android.na;
import com.soundcloud.android.offline.Ac;
import com.soundcloud.android.offline.Bd;
import com.soundcloud.android.offline.C4058ae;
import com.soundcloud.android.offline.C4064be;
import com.soundcloud.android.offline.C4070ce;
import com.soundcloud.android.offline.C4076de;
import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.C4094ge;
import com.soundcloud.android.offline.C4106ie;
import com.soundcloud.android.offline.C4112je;
import com.soundcloud.android.offline.C4124le;
import com.soundcloud.android.offline.C4128mc;
import com.soundcloud.android.offline.C4136ne;
import com.soundcloud.android.offline.C4140oc;
import com.soundcloud.android.offline.C4148pe;
import com.soundcloud.android.offline.C4154qe;
import com.soundcloud.android.offline.C4163sc;
import com.soundcloud.android.offline.C4165se;
import com.soundcloud.android.offline.C4168tb;
import com.soundcloud.android.offline.C4169tc;
import com.soundcloud.android.offline.C4171te;
import com.soundcloud.android.offline.C4174ub;
import com.soundcloud.android.offline.C4180vb;
import com.soundcloud.android.offline.C4181vc;
import com.soundcloud.android.offline.C4191xc;
import com.soundcloud.android.offline.C4196yc;
import com.soundcloud.android.offline.C4197yd;
import com.soundcloud.android.offline.C4201zc;
import com.soundcloud.android.offline.Cc;
import com.soundcloud.android.offline.Cd;
import com.soundcloud.android.offline.Dd;
import com.soundcloud.android.offline.De;
import com.soundcloud.android.offline.Ec;
import com.soundcloud.android.offline.Fc;
import com.soundcloud.android.offline.Ic;
import com.soundcloud.android.offline.Jc;
import com.soundcloud.android.offline.Jd;
import com.soundcloud.android.offline.Kc;
import com.soundcloud.android.offline.Kd;
import com.soundcloud.android.offline.Lb;
import com.soundcloud.android.offline.Mc;
import com.soundcloud.android.offline.Md;
import com.soundcloud.android.offline.MediaMountedReceiver;
import com.soundcloud.android.offline.Od;
import com.soundcloud.android.offline.OfflineContentService;
import com.soundcloud.android.offline.OfflineSettingsOnboardingActivity;
import com.soundcloud.android.offline.Pb;
import com.soundcloud.android.offline.Qd;
import com.soundcloud.android.offline.Qe;
import com.soundcloud.android.offline.Sd;
import com.soundcloud.android.offline.Se;
import com.soundcloud.android.offline.Te;
import com.soundcloud.android.offline.Ud;
import com.soundcloud.android.offline.Vb;
import com.soundcloud.android.offline.Vd;
import com.soundcloud.android.offline.Wd;
import com.soundcloud.android.offline.Yd;
import com.soundcloud.android.offline.Zd;
import com.soundcloud.android.offline._d;
import com.soundcloud.android.offline.ve;
import com.soundcloud.android.offline.we;
import com.soundcloud.android.offline.xe;
import com.soundcloud.android.onboarding.OnboardActivity;
import com.soundcloud.android.onboarding.auth.AlmostDoneLayout;
import com.soundcloud.android.onboarding.auth.AuthenticatorService;
import com.soundcloud.android.onboarding.auth.C4222u;
import com.soundcloud.android.onboarding.auth.RecoverActivity;
import com.soundcloud.android.onboarding.auth.RemoteSignInWebViewActivity;
import com.soundcloud.android.onboarding.auth.ea;
import com.soundcloud.android.onboarding.auth.fa;
import com.soundcloud.android.onboarding.auth.ia;
import com.soundcloud.android.onboarding.s;
import com.soundcloud.android.payments.C4229aa;
import com.soundcloud.android.payments.C4237ea;
import com.soundcloud.android.payments.C4241ga;
import com.soundcloud.android.payments.C4245ia;
import com.soundcloud.android.payments.C4245ia.a.C0127a;
import com.soundcloud.android.payments.C4247ja;
import com.soundcloud.android.payments.C4247ja.a.C0128a;
import com.soundcloud.android.payments.C4249ka;
import com.soundcloud.android.payments.C4249ka.a.C0129a;
import com.soundcloud.android.payments.C4251la;
import com.soundcloud.android.payments.C4251la.a.C0130a;
import com.soundcloud.android.payments.C4253ma;
import com.soundcloud.android.payments.C4255na;
import com.soundcloud.android.payments.C4257oa;
import com.soundcloud.android.payments.C4261qa;
import com.soundcloud.android.payments.C4266ta;
import com.soundcloud.android.payments.C4274xa;
import com.soundcloud.android.payments.C4276ya;
import com.soundcloud.android.payments.ConversionActivity;
import com.soundcloud.android.payments.NativeConversionActivity;
import com.soundcloud.android.payments.ProductChoiceActivity;
import com.soundcloud.android.payments.WebCheckoutActivity;
import com.soundcloud.android.payments._a;
import com.soundcloud.android.payments.ab;
import com.soundcloud.android.playback.C4281ab;
import com.soundcloud.android.playback.C4282ac;
import com.soundcloud.android.playback.C4283ad;
import com.soundcloud.android.playback.C4286bb;
import com.soundcloud.android.playback.C4288bd;
import com.soundcloud.android.playback.C4293cd;
import com.soundcloud.android.playback.C4298dd;
import com.soundcloud.android.playback.C4301eb;
import com.soundcloud.android.playback.C4302ec;
import com.soundcloud.android.playback.C4303ed;
import com.soundcloud.android.playback.C4306fb;
import com.soundcloud.android.playback.C4311gb;
import com.soundcloud.android.playback.C4315ha;
import com.soundcloud.android.playback.C4323id;
import com.soundcloud.android.playback.C4336lb;
import com.soundcloud.android.playback.C4341mb;
import com.soundcloud.android.playback.C4347nc;
import com.soundcloud.android.playback.C4350oa;
import com.soundcloud.android.playback.C4352oc;
import com.soundcloud.android.playback.C4355pa;
import com.soundcloud.android.playback.C4357pc;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.android.playback.C4413qc;
import com.soundcloud.android.playback.C4416rb;
import com.soundcloud.android.playback.C4417rc;
import com.soundcloud.android.playback.C4421sb;
import com.soundcloud.android.playback.C4422sc;
import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.playback.C4426tb;
import com.soundcloud.android.playback.C4430ua;
import com.soundcloud.android.playback.C4432uc;
import com.soundcloud.android.playback.C4514vc;
import com.soundcloud.android.playback.C4517wa;
import com.soundcloud.android.playback.C4523x;
import com.soundcloud.android.playback.C4524xa;
import com.soundcloud.android.playback.C4525xb;
import com.soundcloud.android.playback.C4526xc;
import com.soundcloud.android.playback.C4527xd;
import com.soundcloud.android.playback.C4528y;
import com.soundcloud.android.playback.C4530yb;
import com.soundcloud.android.playback.C4531yc;
import com.soundcloud.android.playback.C4534za;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.playback.Fd;
import com.soundcloud.android.playback.Gd;
import com.soundcloud.android.playback.Hd;
import com.soundcloud.android.playback.HomescreenWidgetBroadcastReceiver;
import com.soundcloud.android.playback.Jb;
import com.soundcloud.android.playback.Nc;
import com.soundcloud.android.playback.Pc;
import com.soundcloud.android.playback.Qb;
import com.soundcloud.android.playback.Rc;
import com.soundcloud.android.playback.Sc;
import com.soundcloud.android.playback.Ub;
import com.soundcloud.android.playback.Vc;
import com.soundcloud.android.playback.Ya;
import com.soundcloud.android.playback.Yc;
import com.soundcloud.android.playback.ee;
import com.soundcloud.android.playback.ge;
import com.soundcloud.android.playback.ie;
import com.soundcloud.android.playback.ke;
import com.soundcloud.android.playback.le;
import com.soundcloud.android.playback.players.MediaService;
import com.soundcloud.android.playback.players.t.b;
import com.soundcloud.android.playback.playqueue.ArtworkView;
import com.soundcloud.android.playback.playqueue.C4364ca;
import com.soundcloud.android.playback.playqueue.C4374ha;
import com.soundcloud.android.playback.playqueue.C4380ka;
import com.soundcloud.android.playback.playqueue.C4386na;
import com.soundcloud.android.playback.playqueue.C4392qa;
import com.soundcloud.android.playback.playqueue.C4393ra;
import com.soundcloud.android.playback.playqueue.C4395sa;
import com.soundcloud.android.playback.playqueue.C4399ua;
import com.soundcloud.android.playback.playqueue.C4403wa;
import com.soundcloud.android.playback.playqueue.PlayQueueFragment;
import com.soundcloud.android.playback.playqueue.PlayQueueView;
import com.soundcloud.android.playback.service.PlayerAppWidgetProvider;
import com.soundcloud.android.playback.ui.Bb;
import com.soundcloud.android.playback.ui.C4436ab;
import com.soundcloud.android.playback.ui.C4448eb;
import com.soundcloud.android.playback.ui.C4454gb;
import com.soundcloud.android.playback.ui.C4463jb;
import com.soundcloud.android.playback.ui.C4466kb;
import com.soundcloud.android.playback.ui.C4492tb;
import com.soundcloud.android.playback.ui.C4504xb;
import com.soundcloud.android.playback.ui.C4507yb;
import com.soundcloud.android.playback.ui.Gb;
import com.soundcloud.android.playback.ui.Mb;
import com.soundcloud.android.playback.ui.Ob;
import com.soundcloud.android.playback.ui.PlayerFragment;
import com.soundcloud.android.playback.ui.PlayerPagerPresenter;
import com.soundcloud.android.playback.ui.Sb;
import com.soundcloud.android.playback.ui.Sb.a.C0134a;
import com.soundcloud.android.playback.ui.ac;
import com.soundcloud.android.playback.ui.ec;
import com.soundcloud.android.playback.ui.hc;
import com.soundcloud.android.playback.ui.nc;
import com.soundcloud.android.playback.ui.sc;
import com.soundcloud.android.playback.ui.view.g;
import com.soundcloud.android.playback.widget.PlayerWidgetReceiver;
import com.soundcloud.android.playback.widget.k.a.C0135a;
import com.soundcloud.android.playlist.view.C5741l;
import com.soundcloud.android.playlist.view.C5745p;
import com.soundcloud.android.playlist.view.C5746q;
import com.soundcloud.android.playlist.view.C5750v;
import com.soundcloud.android.playlist.view.C5751w;
import com.soundcloud.android.playlist.view.C5753y;
import com.soundcloud.android.playlist.view.C5754z;
import com.soundcloud.android.playlist.view.PlaylistDetailFragment;
import com.soundcloud.android.profile.Bc;
import com.soundcloud.android.profile.C5762bb;
import com.soundcloud.android.profile.C5773dc;
import com.soundcloud.android.profile.C5777eb;
import com.soundcloud.android.profile.C5786ga;
import com.soundcloud.android.profile.C5787gb;
import com.soundcloud.android.profile.C5793hc;
import com.soundcloud.android.profile.C5800j;
import com.soundcloud.android.profile.C5801ja;
import com.soundcloud.android.profile.C5805k;
import com.soundcloud.android.profile.C5808kc;
import com.soundcloud.android.profile.C5812lb;
import com.soundcloud.android.profile.C5816ma;
import com.soundcloud.android.profile.C5820n;
import com.soundcloud.android.profile.C5830p;
import com.soundcloud.android.profile.C5840ra;
import com.soundcloud.android.profile.C5841rb;
import com.soundcloud.android.profile.C5845sa;
import com.soundcloud.android.profile.C5846sb;
import com.soundcloud.android.profile.C5854u;
import com.soundcloud.android.profile.C5856ub;
import com.soundcloud.android.profile.C5859v;
import com.soundcloud.android.profile.C5872xc;
import com.soundcloud.android.profile.C5875ya;
import com.soundcloud.android.profile.C5879z;
import com.soundcloud.android.profile.Id;
import com.soundcloud.android.profile.Lc;
import com.soundcloud.android.profile.Nb;
import com.soundcloud.android.profile.Nd;
import com.soundcloud.android.profile.Pd;
import com.soundcloud.android.profile.ProfileBucketsFragment;
import com.soundcloud.android.profile.ProfileFragment;
import com.soundcloud.android.profile.ProfilePresenter;
import com.soundcloud.android.profile.Td;
import com.soundcloud.android.profile.UserAlbumsFragment;
import com.soundcloud.android.profile.UserDetailsFragment;
import com.soundcloud.android.profile.UserFollowersFragment;
import com.soundcloud.android.profile.UserFollowingsFragment;
import com.soundcloud.android.profile.UserLikesFragment;
import com.soundcloud.android.profile.UserListFragment;
import com.soundcloud.android.profile.UserPlaylistsFragment;
import com.soundcloud.android.profile.UserRepostsFragment;
import com.soundcloud.android.profile.UserTopTracksFragment;
import com.soundcloud.android.profile.UserTracksFragment;
import com.soundcloud.android.profile.Vd.a.C0167a;
import com.soundcloud.android.profile.VerifyAgeActivity;
import com.soundcloud.android.profile.Xd;
import com.soundcloud.android.profile.ae;
import com.soundcloud.android.profile.he;
import com.soundcloud.android.profile.je;
import com.soundcloud.android.profile.ne;
import com.soundcloud.android.profile.pe;
import com.soundcloud.android.profile.re;
import com.soundcloud.android.profile.se;
import com.soundcloud.android.receiver.UnauthorisedRequestReceiver;
import com.soundcloud.android.search.C5903ha;
import com.soundcloud.android.search.C5915ia;
import com.soundcloud.android.search.C5918k;
import com.soundcloud.android.search.C5924n;
import com.soundcloud.android.search.C5927oa;
import com.soundcloud.android.search.C5933s;
import com.soundcloud.android.search.C5935t;
import com.soundcloud.android.search.C5943z;
import com.soundcloud.android.search.SearchFragment;
import com.soundcloud.android.search.SearchResultsFragment;
import com.soundcloud.android.search.history.C5906c;
import com.soundcloud.android.search.history.C5909f;
import com.soundcloud.android.search.history.C5911h;
import com.soundcloud.android.search.history.SearchHistoryFragment;
import com.soundcloud.android.search.history.l;
import com.soundcloud.android.search.history.y;
import com.soundcloud.android.search.suggestions.searchsuggestions.SearchSuggestionsUniflowFragment;
import com.soundcloud.android.search.suggestions.searchsuggestions.j;
import com.soundcloud.android.settings.C5946c;
import com.soundcloud.android.settings.C5947d;
import com.soundcloud.android.settings.C5954k;
import com.soundcloud.android.settings.C5955l;
import com.soundcloud.android.settings.C5956m;
import com.soundcloud.android.settings.C5957n;
import com.soundcloud.android.settings.C5958o;
import com.soundcloud.android.settings.C5969p;
import com.soundcloud.android.settings.C5985q;
import com.soundcloud.android.settings.C5986s;
import com.soundcloud.android.settings.C5988u;
import com.soundcloud.android.settings.C5989v;
import com.soundcloud.android.settings.ChangeStorageLocationActivity;
import com.soundcloud.android.settings.LegalActivity;
import com.soundcloud.android.settings.LicensesActivity;
import com.soundcloud.android.settings.SettingsFragment;
import com.soundcloud.android.settings.notifications.NotificationPreferencesActivity;
import com.soundcloud.android.settings.notifications.p;
import com.soundcloud.android.settings.offline.OfflineSettingsFragment;
import com.soundcloud.android.settings.privacy.AdvertisingSettingsFragment;
import com.soundcloud.android.settings.privacy.AnalyticsSettingsFragment;
import com.soundcloud.android.settings.privacy.C5974e;
import com.soundcloud.android.settings.privacy.C5979j;
import com.soundcloud.android.settings.privacy.C5980k;
import com.soundcloud.android.settings.privacy.CommunicationsSettingsFragment;
import com.soundcloud.android.settings.streamingquality.StreamingQualitySettingsFragment;
import com.soundcloud.android.settings.streamingquality.e;
import com.soundcloud.android.stations.C6018ja;
import com.soundcloud.android.stations.C6033oa;
import com.soundcloud.android.stations.C6034ob;
import com.soundcloud.android.stations.C6037pb;
import com.soundcloud.android.stations.C6045sb;
import com.soundcloud.android.stations.C6048tb;
import com.soundcloud.android.stations.C6057wb;
import com.soundcloud.android.stations.C6063yb;
import com.soundcloud.android.stations.C6065za;
import com.soundcloud.android.stations.C6066zb;
import com.soundcloud.android.stations.LikedStationsFragment;
import com.soundcloud.android.stations.Rb;
import com.soundcloud.android.stations.StationInfoFragment;
import com.soundcloud.android.stations.Xb;
import com.soundcloud.android.stations._b;
import com.soundcloud.android.stations.ic;
import com.soundcloud.android.stations.jc;
import com.soundcloud.android.stations.kc;
import com.soundcloud.android.stations.mc;
import com.soundcloud.android.stream.C6068aa;
import com.soundcloud.android.stream.C6070ba;
import com.soundcloud.android.stream.C6072ca;
import com.soundcloud.android.stream.C6074da.a;
import com.soundcloud.android.stream.C6076ea;
import com.soundcloud.android.stream.C6093n;
import com.soundcloud.android.stream.C6095o;
import com.soundcloud.android.stream.C6097p;
import com.soundcloud.android.stream.C6099q;
import com.soundcloud.android.stream.C6106u;
import com.soundcloud.android.stream.C6107ua;
import com.soundcloud.android.stream.C6108v;
import com.soundcloud.android.stream.C6110w;
import com.soundcloud.android.stream.C6112x;
import com.soundcloud.android.stream.C6114y;
import com.soundcloud.android.stream.C6115ya;
import com.soundcloud.android.stream.C6116z;
import com.soundcloud.android.stream.C6117za;
import com.soundcloud.android.stream.StreamFragment;
import com.soundcloud.android.stream.ib;
import com.soundcloud.android.stream.jb;
import com.soundcloud.android.stream.lb;
import com.soundcloud.android.stream.ob;
import com.soundcloud.android.stream.qb;
import com.soundcloud.android.sync.C6131n;
import com.soundcloud.android.sync.C6134q;
import com.soundcloud.android.sync.C6135s;
import com.soundcloud.android.sync.C6136t;
import com.soundcloud.android.sync.C6139w;
import com.soundcloud.android.sync.C6140x;
import com.soundcloud.android.sync.C6141y;
import com.soundcloud.android.sync.SyncAdapterService;
import com.soundcloud.android.sync.ca;
import com.soundcloud.android.sync.ga;
import com.soundcloud.android.sync.ha;
import com.soundcloud.android.sync.la;
import com.soundcloud.android.sync.pa;
import com.soundcloud.android.trackinfo.C6147e;
import com.soundcloud.android.trackinfo.o;
import com.soundcloud.android.trackinfo.o.a.C0174a;
import com.soundcloud.android.tracks.C6164fa;
import com.soundcloud.android.tracks.C6170ha;
import com.soundcloud.android.tracks.C6176ja;
import com.soundcloud.android.tracks.C6179ka;
import com.soundcloud.android.tracks.C6182la;
import com.soundcloud.android.tracks.C6184m;
import com.soundcloud.android.tracks.C6187n;
import com.soundcloud.android.tracks.C6188na;
import com.soundcloud.android.tracks.C6189o;
import com.soundcloud.android.tracks.C6190oa;
import com.soundcloud.android.tracks.C6191p;
import com.soundcloud.android.tracks.C6192pa;
import com.soundcloud.android.tracks.Eb;
import com.soundcloud.android.tracks.Hb;
import com.soundcloud.android.tracks.Ib;
import com.soundcloud.android.tracks.wb;
import com.soundcloud.android.tracks.xb;
import com.soundcloud.android.ui.visualplayer.VisualPlayerFragment;
import com.soundcloud.android.ui.visualplayer.p.a.C0177a;
import com.soundcloud.android.ui.visualplayer.u;
import com.soundcloud.android.upgrade.GoOnboardingActivity;
import com.soundcloud.android.upgrade.d;
import com.soundcloud.android.upgrade.f;
import com.soundcloud.android.utilities.android.t;
import com.soundcloud.android.view.C6229s;
import com.soundcloud.android.view.SmoothScrollLinearLayoutManager;
import com.soundcloud.android.view.UniflowBaseFragment;
import com.soundcloud.android.view.behavior.ContentBottomPaddingBehavior;
import com.soundcloud.android.view.behavior.LockableBottomSheetBehavior;
import com.soundcloud.android.view.behavior.ScrollingViewContentBottomPaddingBehavior;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.squareup.picasso.C6246k;
import java.io.File;
import java.util.Map;
import java.util.Set;
import javax.net.SocketFactory;

/* compiled from: DaggerRealApplicationComponent */
public final class da implements ja {
    private C7054oVa<C0123a> A;
    private C7054oVa<C3236rN> Aa;
    private C7054oVa<C5256RAa> Ab;
    private C7054oVa Ac;
    private C7054oVa Ad;
    private C7054oVa<C3240rR> Ae;
    private C7054oVa<Ic> Af;
    private C7054oVa<SharedPreferences> Ag;
    /* access modifiers changed from: private */
    public C7054oVa<C2732f> Ah;
    private C7054oVa<com.soundcloud.android.playback.Ha> Ai;
    private C7054oVa<C2243QM> Aj;
    private C7054oVa<com.soundcloud.android.stream.Z> Ak;
    private C7054oVa<com.soundcloud.android.main.Z> Al;
    private C7054oVa<C0119a> B;
    private C7054oVa<C2156LU> Ba;
    private C7054oVa<C6416fAa> Bb;
    private C7054oVa<C7516vCa> Bc;
    private C7054oVa<C3404zV> Bd;
    private C7054oVa<n> Be;
    private C7054oVa<C3507cca> Bf;
    private C7054oVa<p> Bg;
    private C7054oVa<Ya> Bh;
    private C7054oVa<com.soundcloud.android.playback.Fa> Bi;
    private C7054oVa<C2205OM> Bj;
    private C7054oVa<C6093n> Bk;
    private C7054oVa<Wha> Bl;
    private C7054oVa<C0124a> C;
    /* access modifiers changed from: private */
    public C7054oVa<C2289SU> Ca;
    private C7054oVa<C1409jT> Cb;
    private C7054oVa Cc;
    private C7054oVa<C3284tV> Cd;
    private C7054oVa<C5518Zza> Ce;
    private C7054oVa<com.soundcloud.android.stations.B> Cf;
    private C7054oVa<SharedPreferences> Cg;
    private C7054oVa<C4301eb> Ch;
    private C7054oVa<Vd> Ci;
    private C7054oVa<C3054iN> Cj;
    private C7054oVa<C4703wma> Ck;
    /* access modifiers changed from: private */
    public C7054oVa<Zha> Cl;
    private C7054oVa<C0125a> D;
    private C7054oVa<ConnectivityManager> Da;
    private C7054oVa<C6332dsa> Db;
    private C7054oVa<C7309sCa> Dc;
    private C7054oVa<C4165se> Dd;
    private C7054oVa<C1957BR> De;
    private C7054oVa<Xb> Df;
    private C7054oVa<i> Dg;
    private C7054oVa<com.soundcloud.android.playback.Pa> Dh;
    private C7054oVa<C4517wa> Di;
    private C7054oVa<C3035hN> Dj;
    private C7054oVa<C4685uma> Dk;
    private C7054oVa<SharedPreferences> Dl;
    private C7054oVa<C0078a> E;
    private C7054oVa<TelephonyManager> Ea;
    private C7054oVa<com.soundcloud.android.sync.T> Eb;
    private C7054oVa<C7654xCa> Ec;
    /* access modifiers changed from: private */
    public C7054oVa<C3814lca> Ed;
    private C7054oVa<com.soundcloud.android.accounts.H> Ee;
    private C7054oVa<com.soundcloud.android.stream.C> Ef;
    /* access modifiers changed from: private */
    public C7054oVa<C3856qea> Eg;
    private C7054oVa<Ab> Eh;
    private C7054oVa<C3781hba> Ei;
    private C7054oVa<C3296uN> Ej;
    private C7054oVa<C2649za> Ek;
    private C7054oVa<C2571fb> El;
    private C7054oVa<C0077a> F;
    private C7054oVa<C6766kGa> Fa;
    private C7054oVa<C4938Gpa> Fb;
    private C7054oVa<C6556hCa> Fc;
    /* access modifiers changed from: private */
    public C7054oVa<C2526g> Fd;
    private C7054oVa<C5618bBa> Fe;
    private C7054oVa<C2828q> Ff;
    private C7054oVa<C3302uT> Fg;
    private C7054oVa<Wb> Fh;
    private C7054oVa<C3789iba> Fi;
    private C7054oVa<C3256sN> Fj;
    /* access modifiers changed from: private */
    public C7054oVa Fk;
    /* access modifiers changed from: private */
    public C7054oVa<PrestitialAdsController> Fl;
    private C7054oVa<C0100a> G;
    /* access modifiers changed from: private */
    public C7054oVa<C6834lGa> Ga;
    private C7054oVa<C6960nAa> Gb;
    private C7054oVa Gc;
    private C7054oVa<C2961dP> Gd;
    private C7054oVa<C5686cBa> Ge;
    private C7054oVa<C2794w> Gf;
    private C7054oVa<SharedPreferences> Gg;
    private C7054oVa<t> Gh;
    private C7054oVa<C4527xd> Gi;
    private C7054oVa Gj;
    /* access modifiers changed from: private */
    public C7054oVa Gk;
    /* access modifiers changed from: private */
    public C7054oVa<C5235QJa> Gl;
    private C7054oVa<C0085a> H;
    /* access modifiers changed from: private */
    public C7054oVa<FirebaseRemoteConfig> Ha;
    private C7054oVa<C5256RAa> Hb;
    private C7054oVa<C7309sCa> Hc;
    private C7054oVa<Gd> Hd;
    private C7054oVa<C2839u> He;
    private C7054oVa<C6826lBa> Hf;
    private C7054oVa<C2878cb> Hg;
    private C7054oVa<com.soundcloud.android.ads.Na> Hh;
    private C7054oVa<Jb> Hi;
    private C7054oVa<C5500ZKa> Hj;
    private C7054oVa Hk;
    /* access modifiers changed from: private */
    public C7054oVa<com.soundcloud.android.ads.Ca> Hl;
    private C7054oVa<C0083a> I;
    private C7054oVa<SharedPreferences> Ia;
    private C7054oVa<C6824lAa> Ib;
    private C7054oVa<C7031oBa> Ic;
    private C7054oVa<C3730k> Id;
    private C7054oVa<va> Ie;
    private C7054oVa<C5612aya> If;
    private C7054oVa<Tea> Ig;
    private C7054oVa<ie> Ih;
    private C7054oVa<Ub> Ii;
    private C7054oVa Ij;
    private C7054oVa Ik;
    private C7054oVa<C3539e> Il;
    private C7054oVa<C0086a> J;
    /* access modifiers changed from: private */
    public C7054oVa<C6699jHa> Ja;
    private C7054oVa<C7305sAa> Jb;
    private C7054oVa<C5421Wpa> Jc;
    private C7054oVa<C3737s> Jd;
    private C7054oVa Je;
    private C7054oVa<C5680bya> Jf;
    private C7054oVa<com.soundcloud.android.deeplinks.i> Jg;
    private C7054oVa<com.soundcloud.android.ads.Ia> Jh;
    private C7054oVa<C5175OJa> Ji;
    private C7054oVa<C2185NL> Jj;
    /* access modifiers changed from: private */
    public C7054oVa<gd> Jk;
    /* access modifiers changed from: private */
    public C7054oVa<C3832nea> Jl;
    private C7054oVa<C0088a> K;
    private C7054oVa<C2114JQ> Ka;
    private C7054oVa<C5256RAa> Kb;
    private C7054oVa<CollectionsDatabase> Kc;
    private C7054oVa<C6246k> Kd;
    private C7054oVa<com.soundcloud.android.collection.playhistory.Fa> Ke;
    private C7054oVa<C6888lya> Kf;
    private C7054oVa<C6494gGa> Kg;
    private C7054oVa<C3844paa> Kh;
    /* access modifiers changed from: private */
    public C7054oVa<C5052KJa> Ki;
    private C7054oVa<C2318UL> Kj;
    private C7054oVa<a> Kk;
    /* access modifiers changed from: private */
    public C7054oVa<ba> Kl;
    private C7054oVa<C0087a> L;
    /* access modifiers changed from: private */
    public C7054oVa<com.soundcloud.android.properties.a> La;
    private C7054oVa<C5490ZAa> Lb;
    /* access modifiers changed from: private */
    public C7054oVa<aa> Lc;
    private C7054oVa<com.squareup.picasso.E> Ld;
    private C7054oVa Le;
    private C7054oVa<C2415ZR<C6888lya>> Lf;
    private C7054oVa<C5630bKa> Lg;
    private C7054oVa<Hc> Lh;
    private C7054oVa<Qb> Li;
    private C7054oVa<C2147LL> Lj;
    private C7054oVa<C6070ba> Lk;
    private C7054oVa<m> Ll;
    private C7054oVa<C0084a> M;
    private C7054oVa<C3758eca> Ma;
    private C7054oVa Mb;
    private C7054oVa<Jd> Mc;
    private C7054oVa<qa> Md;
    private C7054oVa<xa> Me;
    private C7054oVa<C2472bS<C6888lya>> Mf;
    private C7054oVa<C5222Pwa> Mg;
    private C7054oVa<C5495ZFa> Mh;
    private C7054oVa<com.soundcloud.android.playback.P> Mi;
    private C7054oVa<C1971CL> Mj;
    private C7054oVa<od> Mk;
    private C7054oVa<C3535a> Ml;
    private C7054oVa<C0127a> N;
    private C7054oVa<C3846pca> Na;
    /* access modifiers changed from: private */
    public C7054oVa<C4942Gta> Nb;
    private C7054oVa<De> Nc;
    private C7054oVa<C3724e> Nd;
    private C7054oVa<com.soundcloud.android.collection.recentlyplayed.Ga> Ne;
    private C7054oVa<Ec> Nf;
    private C7054oVa<C7575vxa> Ng;
    /* access modifiers changed from: private */
    public C7054oVa<Yaa> Nh;
    private C7054oVa<g> Ni;
    private C7054oVa<String> Nj;
    private C7054oVa<ib> Nk;
    private C7054oVa<k> Nl;
    private C7054oVa<C0128a> O;
    private C7054oVa<C6495gHa> Oa;
    private C7054oVa<lb> Ob;
    /* access modifiers changed from: private */
    public C7054oVa<C4106ie> Oc;
    private C7054oVa<oa> Od;
    private C7054oVa Oe;
    private C7054oVa<C4201zc> Of;
    private C7054oVa<C7230qxa> Og;
    private C7054oVa<Cb> Oh;
    private C7054oVa<C5956m> Oi;
    private C7054oVa<C2354WL> Oj;
    /* access modifiers changed from: private */
    public C7054oVa<C4001z> Ok;
    private C7054oVa<com.soundcloud.android.playback.K> Ol;
    private C7054oVa<C0129a> P;
    private C7054oVa<SQLiteDatabase> Pa;
    private C7054oVa<w> Pb;
    private C7054oVa Pc;
    private C7054oVa<com.soundcloud.android.image.X> Pd;
    private C7054oVa<C2817j> Pe;
    private C7054oVa<C2415ZR<C4201zc>> Pf;
    private C7054oVa<C5252Qwa> Pg;
    private C7054oVa<C2586ja> Ph;
    private C7054oVa<C3352xJ> Pi;
    private C7054oVa Pj;
    /* access modifiers changed from: private */
    public C7054oVa<C4070ce> Pk;
    private C7054oVa<C3537c> Pl;
    private C7054oVa<C0130a> Q;
    private C7054oVa<C5500ZKa> Qa;
    private C7054oVa<C5218Psa> Qb;
    private C7054oVa<com.soundcloud.android.tracks.Pa> Qc;
    /* access modifiers changed from: private */
    public C7054oVa<com.soundcloud.android.image.N> Qd;
    private C7054oVa<com.soundcloud.android.stations.T> Qe;
    private C7054oVa<C2472bS<C4201zc>> Qf;
    private C7054oVa<VideoAdsDatabase> Qg;
    private C7054oVa<C3193pJ> Qh;
    private C7054oVa<HPa> Qi;
    private C7054oVa<C2428_L> Qj;
    /* access modifiers changed from: private */
    public C7054oVa<C4425ta> Qk;
    private C7054oVa<C4581ija> Ql;
    private C7054oVa<C0144a> R;
    private C7054oVa<C0514cT> Ra;
    private C7054oVa<SharedPreferences> Rb;
    private C7054oVa Rc;
    private C7054oVa<C7440tyb> Rd;
    private C7054oVa Re;
    private C7054oVa<C3117lU> Rf;
    private C7054oVa<v> Rg;
    private C7054oVa<C2068HI> Rh;
    private C7054oVa<C2183NJ> Ri;
    private C7054oVa<C2130KN> Rj;
    private C7054oVa<ma> Rk;
    private C7054oVa<z> Rl;
    private C7054oVa<C0080a> S;
    private C7054oVa<C7440tyb> Sa;
    private C7054oVa<com.soundcloud.android.offline.Gd> Sb;
    private C7054oVa<SharedPreferences> Sc;
    private C7054oVa<C5470YJa> Sd;
    private C7054oVa<com.soundcloud.android.collection.recentlyplayed.Ia> Se;
    private C7054oVa<C2415ZR<C3117lU>> Sf;
    private C7054oVa<com.soundcloud.android.ads.data.t> Sg;
    private C7054oVa<C1988DI> Sh;
    private C7054oVa<C2251QU> Si;
    /* access modifiers changed from: private */
    public C7054oVa<C1953BN> Sj;
    /* access modifiers changed from: private */
    public C7054oVa<Od> Sk;
    private C7054oVa<com.soundcloud.android.fcm.D> Sl;
    private C7054oVa<C0061a> T;
    private C7054oVa<String> Ta;
    private C7054oVa<C5128Msa> Tb;
    /* access modifiers changed from: private */
    public C7054oVa<C4088fe> Tc;
    private C7054oVa<C5412WJa> Td;
    private C7054oVa<C3834oY> Te;
    private C7054oVa<C2472bS<C3117lU>> Tf;
    private C7054oVa Tg;
    private C7054oVa<C3050iJ> Th;
    private C7054oVa<Oc> Ti;
    private C7054oVa<C2013EN> Tj;
    private C7054oVa<com.soundcloud.android.settings.S> Tk;
    /* access modifiers changed from: private */
    public C7054oVa<C3541g> Tl;
    private C7054oVa<C0060a> U;
    private C7054oVa<String> Ua;
    private C7054oVa Ub;
    private C7054oVa<Kc> Uc;
    private C7054oVa<Nea> Ud;
    private C7054oVa<C3826nY> Ue;
    private C7054oVa<Cd> Uf;
    private C7054oVa<C4168tb> Ug;
    private C7054oVa<C3678e> Uh;
    /* access modifiers changed from: private */
    public C7054oVa<com.soundcloud.android.playback.S> Ui;
    private C7054oVa<C2112JO> Uj;
    private C7054oVa<com.soundcloud.android.settings.streamingquality.i> Uk;
    private C7054oVa<C3858rY> Ul;
    private C7054oVa<C0134a> V;
    private C7054oVa<AccountManager> Va;
    private C7054oVa<SharedPreferences> Vb;
    private C7054oVa<C6334dta> Vc;
    private C7054oVa<C5354UJa> Vd;
    private C7054oVa<SharedPreferences> Ve;
    private C7054oVa<C2415ZR<Cd>> Vf;
    private C7054oVa<com.facebook.login.D> Vg;
    private C7054oVa<C3331wI> Vh;
    private C7054oVa<C4336lb> Vi;
    private C7054oVa<C3356xN> Vj;
    private C7054oVa<C5988u> Vk;
    /* access modifiers changed from: private */
    public C7054oVa<C3609e> Vl;
    private C7054oVa<C0177a> W;
    private C7054oVa<com.soundcloud.android.accounts.J> Wa;
    private C7054oVa<C6135s> Wb;
    private C7054oVa<C5479Ypa> Wc;
    private C7054oVa<C7321sMa<C5325TJa>> Wd;
    private C7054oVa<_c> We;
    private C7054oVa<C2472bS<Cd>> Wf;
    private C7054oVa<C2642xb> Wg;
    private C7054oVa<C3678e> Wh;
    private C7054oVa<C3874tY> Wi;
    private C7054oVa<C2260RK> Wj;
    private C7054oVa<com.soundcloud.android.settings.offline.n> Wk;
    private C7054oVa<Fba> Wl;
    private C7054oVa<C0174a> X;
    private C7054oVa Xa;
    private C7054oVa<C5287SBa> Xb;
    private C7054oVa<SharedPreferences> Xc;
    private C7054oVa<C6838lKa> Xd;
    private C7054oVa<C3898wY> Xe;
    private C7054oVa<C6140x> Xf;
    private C7054oVa<String> Xg;
    private C7054oVa<Set<C3678e>> Xh;
    private C7054oVa<com.soundcloud.android.discovery.systemplaylist.E> Xi;
    private C7054oVa<C3394zL> Xj;
    private C7054oVa<com.soundcloud.android.settings.privacy.w> Xk;
    private C7054oVa<C5408WFa> Xl;
    private C7054oVa<C0103a> Y;
    private C7054oVa<SharedPreferences> Ya;
    private C7054oVa<ga> Yb;
    private C7054oVa<com.soundcloud.android.settings.streamingquality.t> Yc;
    private C7054oVa<C6970nGa> Yd;
    private C7054oVa Ye;
    private C7054oVa<SharedPreferences> Yf;
    private C7054oVa<C5018JHa> Yg;
    private C7054oVa<C3678e> Yh;
    private C7054oVa<C4302ec> Yi;
    private C7054oVa<C3274tL> Yj;
    private C7054oVa<C5979j> Yk;
    /* access modifiers changed from: private */
    public C7054oVa<C4454gb> Yl;
    private C7054oVa<C0104a> Z;
    private C7054oVa<C4421sb> Za;
    private C7054oVa<SharedPreferences> Zb;
    private C7054oVa<e> Zc;
    private C7054oVa<C4148pe> Zd;
    private C7054oVa<C3754eY> Ze;
    private C7054oVa<C7648wza<Boolean>> Zf;
    private C7054oVa Zg;
    private C7054oVa<Yb> Zh;
    private C7054oVa<C2486cN> Zi;
    private C7054oVa<a> Zj;
    private C7054oVa<com.soundcloud.android.settings.privacy.J> Zk;
    /* access modifiers changed from: private */
    public C7054oVa<C3551i> Zl;
    private C7054oVa<dfa> _a;
    private C7054oVa<la> _b;
    private C7054oVa<C4163sc> _c;
    private C7054oVa<Lb> _d;
    private C7054oVa<C4825DAa> _e;
    private C7054oVa<C7648wza<Boolean>> _f;
    private C7054oVa<C7636wta> _g;
    /* access modifiers changed from: private */
    public C7054oVa<com.soundcloud.android.comments.Ea> _h;
    private C7054oVa<C4298dd> _i;
    private C7054oVa<C2353WK> _j;
    private C7054oVa<C2014EO> _k;
    /* access modifiers changed from: private */
    public C7054oVa<com.soundcloud.android.comments.W> _l;
    private final Application a;
    private C7054oVa<C0102a> aa;
    /* access modifiers changed from: private */
    public C7054oVa<efa> ab;
    private C7054oVa<C3218qP> ac;
    private C7054oVa ad;
    private C7054oVa<C6830lDa> ae;
    private C7054oVa<C2860p> af;
    private C7054oVa<C7648wza<Boolean>> ag;
    private C7054oVa ah;
    private C7054oVa<C2587jb> ai;
    private C7054oVa<C3074jO> aj;
    private C7054oVa ak;
    private C7054oVa<C6065za> al;
    /* access modifiers changed from: private */
    public C7054oVa<com.soundcloud.android.comments.Z> am;
    private final C2264RO b;
    private C7054oVa<C0101a> ba;
    private C7054oVa<C5323THa> bb;
    private C7054oVa<HPa> bc;
    private C7054oVa<Yd> bd;
    private C7054oVa<com.soundcloud.android.tracks.Ja> be;
    private C7054oVa<C7581wAa> bf;
    private C7054oVa<C7648wza<String>> bg;
    private C7054oVa<C6946mta> bh;
    /* access modifiers changed from: private */
    public C7054oVa<C2630ub> bi;
    private C7054oVa<C3017gO> bj;
    private C7054oVa bk;
    private C7054oVa<C6034ob> bl;
    /* access modifiers changed from: private */
    public C7054oVa<C4989IJa> bm;
    /* access modifiers changed from: private */
    public final C2933l c;
    private C7054oVa<Application> ca;
    private C7054oVa<a> cb;
    private C7054oVa<com.soundcloud.android.sync.K> cc;
    private C7054oVa<C2248QR> cd;
    private C7054oVa<wb> ce;
    private C7054oVa<C7084ota> cf;
    private C7054oVa<C7648wza<Boolean>> cg;
    private C7054oVa ch;
    private C7054oVa<C2568ec> ci;
    /* access modifiers changed from: private */
    public C7054oVa<com.soundcloud.android.playback.E> cj;
    private C7054oVa<com.soundcloud.android.sync.D> ck;
    private C7054oVa<y> cl;
    /* access modifiers changed from: private */
    public C7054oVa<C4504xb> cm;
    private final C2165MK d;
    /* access modifiers changed from: private */
    public C7054oVa<Context> da;
    private C7054oVa<C3041hU> db;
    private C7054oVa<C2034FO> dc;
    private C7054oVa<ca> dd;
    private C7054oVa<Ib> de;
    private C7054oVa<C2415ZR<C7084ota>> df;
    private C7054oVa<C4596kia> dg;
    private C7054oVa dh;
    private C7054oVa<l> di;
    private C7054oVa<com.soundcloud.android.playback.Jd> dj;
    /* access modifiers changed from: private */
    public C7054oVa<C2350WH<Xaa>> dk;
    private C7054oVa<C5927oa> dl;
    /* access modifiers changed from: private */
    public C7054oVa dm;
    private C7054oVa<C0167a> e;
    private C7054oVa<Vxb> ea;
    private C7054oVa<SharedPreferences> eb;
    private C7054oVa<C7728yFa> ec;
    /* access modifiers changed from: private */
    public C7054oVa<com.soundcloud.android.collection.Aa> ed;
    private C7054oVa<Hb> ee;
    private C7054oVa<C2472bS<C7084ota>> ef;
    private C7054oVa<com.soundcloud.android.features.record.ba> eg;
    private C7054oVa<PowerManager> eh;
    private C7054oVa<com.soundcloud.android.search.history.A> ei;
    private C7054oVa<com.soundcloud.android.playback.A> ej;
    private C7054oVa<C3277tO> ek;
    private C7054oVa<C5933s> el;
    private C7054oVa<C0065a> f;
    /* access modifiers changed from: private */
    public C7054oVa<C5327TLa> fa;
    private C7054oVa<C3734o> fb;
    private C7054oVa fc;
    private C7054oVa<C4180vb> fd;
    private C7054oVa<com.soundcloud.android.tracks.Lb> fe;
    private C7054oVa<C2595lb> ff;
    private C7054oVa<SharedPreferences> fg;
    /* access modifiers changed from: private */
    public C7054oVa<C2280SL> fh;
    private C7054oVa<com.soundcloud.android.search.history.G> fi;
    private C7054oVa<C4525xb> fj;
    private C7054oVa<Bja> fk;
    private C7054oVa<C5903ha> fl;
    private C7054oVa<C0064a> g;
    private C7054oVa<SharedPreferences> ga;
    private C7054oVa<C4898FLa> gb;
    private C7054oVa gc;
    /* access modifiers changed from: private */
    public C7054oVa<C3815lda> gd;
    private C7054oVa<com.soundcloud.android.tracks.D> ge;
    private C7054oVa<C7730yHa> gf;
    private C7054oVa<com.soundcloud.android.la> gg;
    private C7054oVa<C6404eua> gh;
    private C7054oVa<Mc> gi;
    private C7054oVa<ee> gj;
    /* access modifiers changed from: private */
    public C7054oVa<Db> gk;
    private C7054oVa<a> gl;
    private C7054oVa<C0063a> h;
    private C7054oVa<C2380XU> ha;
    private C7054oVa<C0515cW> hb;
    private C7054oVa<C5138NCa> hc;
    private C7054oVa<com.soundcloud.android.collections.data.ca> hd;
    private C7054oVa<C3760eea> he;
    private C7054oVa<C2594la> hf;
    private C7054oVa<com.soundcloud.android.sync.G> hg;
    private C7054oVa<C6336dua> hh;
    private C7054oVa<com.soundcloud.android.cast.v> hi;
    private C7054oVa<com.soundcloud.android.playback.Ab> hj;
    private C7054oVa<s> hk;
    private C7054oVa<C6884lwa> hl;
    private C7054oVa<C0135a> i;
    private C7054oVa<C1960BU> ia;
    private C7054oVa<C1472lW> ib;
    private C7054oVa ic;
    /* access modifiers changed from: private */
    public C7054oVa<C3989m> id;
    private C7054oVa<C4735ADa> ie;

    /* renamed from: if reason: not valid java name */
    private C7054oVa<C2610pa> f1if;
    private C7054oVa<C4888FBa> ig;
    private C7054oVa<AppWidgetManager> ih;
    private C7054oVa<C5381VHa> ii;
    private C7054oVa<C4695vna> ij;
    private C7054oVa<com.soundcloud.android.onboarding.g> ik;
    private C7054oVa<C7504uwa> il;
    private C7054oVa<C0112a> j;
    /* access modifiers changed from: private */
    public C7054oVa<Resources> ja;
    private C7054oVa<HW> jb;
    private C7054oVa<SharedPreferences> jc;
    private C7054oVa<C3971b> jd;
    private C7054oVa<Vb> je;
    private C7054oVa<C2415ZR<C2610pa>> jf;
    private C7054oVa<com.soundcloud.android.tracks.K> jg;
    private C7054oVa jh;
    private C7054oVa ji;
    private C7054oVa<C3202pS> jj;
    private C7054oVa<ia> jk;
    private C7054oVa<j> jl;
    private C7054oVa<C0109a> k;
    private C7054oVa<ja> ka;
    /* access modifiers changed from: private */
    public C7054oVa<C2529j> kb;
    private C7054oVa<C5622bDa> kc;
    private C7054oVa kd;
    /* access modifiers changed from: private */
    public C7054oVa<C4197yd> ke;
    private C7054oVa<C2472bS<C2610pa>> kf;
    private C7054oVa<com.soundcloud.android.tracks.N> kg;
    private C7054oVa<C7441tza> kh;
    /* access modifiers changed from: private */
    public C7054oVa<ke> ki;
    private C7054oVa<C3183oS> kj;
    private C7054oVa<C4564gia> kk;
    private C7054oVa<com.soundcloud.android.discovery.systemplaylist.B> kl;
    private C7054oVa<C0120a> l;
    /* access modifiers changed from: private */
    public C7054oVa<com.soundcloud.android.properties.j> la;
    private C7054oVa<com.soundcloud.android.sync.oa> lb;
    private C7054oVa<a> lc;
    private C7054oVa<C2210OR> ld;
    private C7054oVa le;
    private C7054oVa<C2325UT> lf;
    private C7054oVa<com.soundcloud.android.tracks.M> lg;
    private C7054oVa<C3983h> lh;
    private C7054oVa<com.soundcloud.android.sync.I> li;
    private C7054oVa<C3281tS> lj;
    /* access modifiers changed from: private */
    public C7054oVa<C4655rja> lk;
    private C7054oVa<com.soundcloud.android.discovery.systemplaylist.T> ll;
    private C7054oVa<C0105a> m;
    private C7054oVa<C2350WH<com.soundcloud.android.foundation.events.J>> ma;
    private C7054oVa<com.soundcloud.android.sync.A> mb;
    private C7054oVa<C6110w> mc;
    private C7054oVa<C1937AR> md;
    private C7054oVa<C5363Upa> me;
    private C7054oVa<SharedPreferences> mf;
    private C7054oVa<C6184m> mg;
    private C7054oVa<C2390YL> mh;
    private C7054oVa<com.soundcloud.android.collection.playhistory.G> mi;
    private C7054oVa<com.soundcloud.android.cast.r> mj;
    /* access modifiers changed from: private */
    public C7054oVa<C5047KEa> mk;
    private C7054oVa<C2783k> ml;
    private C7054oVa<C0106a> n;
    private C7054oVa<SharedPreferences> na;
    private C7054oVa nb;
    private C7054oVa<C3382yT> nc;
    private C7054oVa<C5425Wta> nd;
    private C7054oVa ne;
    private C7054oVa<C2965dU> nf;
    private C7054oVa<C4526xc> ng;
    private C7054oVa<com.soundcloud.android.playback.widget.l> nh;
    private C7054oVa<C4863EHa> ni;
    private C7054oVa<Dma> nj;
    private C7054oVa<com.soundcloud.android.activities.l> nk;
    /* access modifiers changed from: private */
    public C7054oVa<com.soundcloud.android.collection.playhistory.Z> nl;
    private C7054oVa<C0108a> o;
    private C7054oVa<C3177oM> oa;
    private C7054oVa<C6620iAa> ob;
    private C7054oVa<C5255Qza> oc;
    private C7054oVa<C4785Bra> od;
    private C7054oVa<C7445uBa> oe;
    private C7054oVa<C3129mM> of;
    /* access modifiers changed from: private */
    public C7054oVa<C4350oa> og;
    private C7054oVa<com.soundcloud.android.foundation.playqueue.r> oh;
    private C7054oVa<C4432uc> oi;
    private C7054oVa<com.soundcloud.android.playback.players.l> oj;
    private C7054oVa<com.soundcloud.android.activities.t> ok;
    private C7054oVa<C2805d> ol;
    private C7054oVa<C0107a> p;
    private C7054oVa<C7319sKa> pa;
    private C7054oVa<C3800jea> pb;
    private C7054oVa pc;
    private C7054oVa<C1938AS> pd;
    private C7054oVa pe;
    /* access modifiers changed from: private */
    public C7054oVa<C2288ST> pf;
    /* access modifiers changed from: private */
    public C7054oVa<com.soundcloud.android.tracks.Ca> pg;
    private C7054oVa<com.soundcloud.android.playback.widget.s> ph;
    private C7054oVa<C6291dHa> pi;
    private C7054oVa<C3381yS> pj;
    private C7054oVa<C6614hxa> pk;
    private C7054oVa<com.soundcloud.android.collection.recentlyplayed.J> pl;
    private C7054oVa<C0110a> q;
    private C7054oVa<FirebaseAnalytics> qa;
    private C7054oVa<C1502mT> qb;
    private C7054oVa<SharedPreferences> qc;
    private C7054oVa<SharedPreferences> qd;
    private C7054oVa<C1349hW> qe;
    private C7054oVa<C2379XT> qf;
    private C7054oVa<ic> qg;
    private C7054oVa<C4675tla> qh;
    private C7054oVa<com.soundcloud.android.playback.Ec> qi;
    private C7054oVa<com.soundcloud.android.playback.players.r> qj;
    /* access modifiers changed from: private */
    public C7054oVa<C6189o> qk;
    /* access modifiers changed from: private */
    public C7054oVa<C2287SS> ql;
    private C7054oVa<C0111a> r;
    private C7054oVa<C2168MN> ra;
    private C7054oVa<com.soundcloud.android.tracks.Ya> rb;
    private C7054oVa<C5622bDa> rc;
    /* access modifiers changed from: private */
    public C7054oVa<Fea> rd;
    private C7054oVa<BW> re;
    private C7054oVa<C2415ZR<C2379XT>> rf;
    private C7054oVa<SharedPreferences> rg;
    private C7054oVa<C5305Spa> rh;
    private C7054oVa<String> ri;
    private C7054oVa<C4523x> rj;
    private C7054oVa<C5244Qoa> rk;
    /* access modifiers changed from: private */
    public C7054oVa<com.soundcloud.android.collection.H> rl;
    private C7054oVa<C0113a> s;
    /* access modifiers changed from: private */
    public C7054oVa<C3315vM> sa;
    private C7054oVa<com.soundcloud.android.tracks.W> sb;
    private C7054oVa<a> sc;
    private C7054oVa<Se> sd;
    private C7054oVa<LW> se;
    private C7054oVa<C2472bS<C2379XT>> sf;
    private C7054oVa<C2040FU> sg;
    private C7054oVa<C5362Uoa> sh;
    private C7054oVa<File> si;
    private C7054oVa<C3824mea> sj;
    private C7054oVa sk;
    /* access modifiers changed from: private */
    public C7054oVa<com.soundcloud.android.collection.E> sl;
    private C7054oVa<C0114a> t;
    /* access modifiers changed from: private */
    public C7054oVa<C2031FL> ta;
    private C7054oVa<C4797CDa> tb;
    private C7054oVa<com.soundcloud.android.activities.y> tc;
    private C7054oVa<C7440tyb> td;
    private C7054oVa<KW> te;
    private C7054oVa<C2171MQ> tf;
    private C7054oVa<Aca> tg;
    private C7054oVa<C5308Ssa> th;
    private C7054oVa<AudioManager> ti;
    private C7054oVa<C2242QL> tj;
    private C7054oVa<C5879z> tk;
    /* access modifiers changed from: private */
    public C7054oVa<com.soundcloud.android.stations.Ga> tl;
    private C7054oVa<C0115a> u;
    /* access modifiers changed from: private */
    public C7054oVa<C2436_U> ua;
    private C7054oVa<com.soundcloud.android.utilities.android.k> ub;
    private C7054oVa<com.soundcloud.android.stations.Vb> uc;
    private C7054oVa<com.soundcloud.android.offline.Qb> ud;
    private C7054oVa<WW> ue;
    private C7054oVa<C2415ZR<C2171MQ>> uf;
    /* access modifiers changed from: private */
    public C7054oVa<C2746fa> ug;
    private C7054oVa<C5245Qpa> uh;
    private C7054oVa<Ula> ui;
    private C7054oVa<SharedPreferences> uj;
    /* access modifiers changed from: private */
    public C7054oVa<C5604aua> uk;
    private C7054oVa<ua> ul;
    private C7054oVa<C0116a> v;
    private C7054oVa<SharedPreferences> va;
    private C7054oVa<C5014JDa> vb;
    private C7054oVa<com.soundcloud.android.stations.Ia> vc;
    private C7054oVa<we> vd;
    private C7054oVa<C3792iea> ve;
    private C7054oVa<C2472bS<C2171MQ>> vf;
    private C7054oVa<C6097p> vg;
    private C7054oVa<C4909Fra> vh;
    private C7054oVa<Yla> vi;
    private C7054oVa<C3214qL> vj;
    private C7054oVa<re> vk;
    private C7054oVa<ka> vl;
    private C7054oVa<C0118a> w;
    private C7054oVa<C2343VT> wa;
    private C7054oVa<Eb> wb;
    private C7054oVa<kc> wc;
    private C7054oVa<C2322UP> wd;
    private C7054oVa<C3869sba> we;
    private C7054oVa<C3973c> wf;
    private C7054oVa<SharedPreferences> wg;
    private C7054oVa<Yc> wh;
    private C7054oVa<com.soundcloud.android.playback.Xb> wi;
    private C7054oVa<String> wj;
    /* access modifiers changed from: private */
    public C7054oVa<Lc> wk;
    private C7054oVa<C2816ia> wl;
    private C7054oVa<C0117a> x;
    private C7054oVa<C3184oU> xa;
    private C7054oVa<com.soundcloud.android.tracks.T> xb;
    private C7054oVa xc;
    private C7054oVa<C3038hQ> xd;
    private C7054oVa<Cba> xe;
    private C7054oVa<C2542g> xf;
    private C7054oVa xg;
    private C7054oVa<C4283ad> xh;
    private C7054oVa<Fma> xi;
    /* access modifiers changed from: private */
    public C7054oVa<C1956BQ> xj;
    private C7054oVa<C5841rb> xk;
    private C7054oVa<gb> xl;
    private C7054oVa<C0121a> y;
    private C7054oVa<C3223qU> ya;
    private C7054oVa<C3768fea> yb;
    private C7054oVa<com.soundcloud.android.stations.Ba> yc;
    private C7054oVa<ve> yd;
    private C7054oVa<C3360xR> ye;
    private C7054oVa<C5854u> yf;
    private C7054oVa<com.soundcloud.android.upsell.a> yg;
    private C7054oVa<C4281ab> yh;
    private C7054oVa<C4413qc> yi;
    private C7054oVa yj;
    private C7054oVa<com.soundcloud.android.search.Ja> yk;
    /* access modifiers changed from: private */
    public C7054oVa<mb> yl;
    private C7054oVa<C0122a> z;
    private C7054oVa za;
    private C7054oVa<C7098pAa> zb;
    private C7054oVa<C6556hCa> zc;
    private C7054oVa<SharedPreferences> zd;
    private C7054oVa<C5141NFa> ze;
    private C7054oVa<C3845pba> zf;
    private C7054oVa<C6115ya> zg;
    private C7054oVa<C2733g> zh;
    private C7054oVa<com.soundcloud.android.playback.Wa> zi;
    private C7054oVa<C2373XM> zj;
    private C7054oVa<C6106u> zk;
    private C7054oVa<androidx.work.r> zl;

    /* compiled from: DaggerRealApplicationComponent */
    private final class A implements C4028g.a {
        /* synthetic */ A(da daVar, FullScreenVideoActivity fullScreenVideoActivity, C2714o oVar) {
            this(fullScreenVideoActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(m());
        }

        private C2416ZT f() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU g() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker h() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object i() {
            return com.soundcloud.android.ads.Ib.a(j(), da.this.j(), da.this.Fk.get(), (gd) da.this.Jk.get(), C2947z.b(), da.this.Gk.get(), (C5327TLa) da.this.fa.get(), da.this.ia(), (Yaa) da.this.Nh.get(), (C4655rja) da.this.lk.get());
        }

        private Object j() {
            return Kb.a((ke) da.this.ki.get(), da.this.Ce());
        }

        private Object k() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O l() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea m() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A n() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C2466bM o() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta p() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta q() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), p(), C2947z.b(), k(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private com.soundcloud.android.accounts.O r() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private A(FullScreenVideoActivity fullScreenVideoActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private FullScreenVideoActivity b(FullScreenVideoActivity fullScreenVideoActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) fullScreenVideoActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) fullScreenVideoActivity, f());
            com.soundcloud.android.main.ga.a((RootActivity) fullScreenVideoActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) fullScreenVideoActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) fullScreenVideoActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) fullScreenVideoActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) fullScreenVideoActivity, l());
            com.soundcloud.android.main.ga.a((RootActivity) fullScreenVideoActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) fullScreenVideoActivity, o());
            com.soundcloud.android.main.ga.b(fullScreenVideoActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) fullScreenVideoActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) fullScreenVideoActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) fullScreenVideoActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) fullScreenVideoActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) fullScreenVideoActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) fullScreenVideoActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) fullScreenVideoActivity, r());
            com.soundcloud.android.main.S.a((LoggedInActivity) fullScreenVideoActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) fullScreenVideoActivity, n());
            com.soundcloud.android.main.S.a((LoggedInActivity) fullScreenVideoActivity, q());
            com.soundcloud.android.main.S.a((LoggedInActivity) fullScreenVideoActivity, c());
            Fb.a(fullScreenVideoActivity, i());
            return fullScreenVideoActivity;
        }

        public void a(FullScreenVideoActivity fullScreenVideoActivity) {
            b(fullScreenVideoActivity);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Aa implements C0118a {
        private Aa() {
        }

        /* synthetic */ Aa(da daVar, C2714o oVar) {
            this();
        }

        public C4039s.a a(RecoverActivity recoverActivity) {
            C5023JMa.a(recoverActivity);
            return new Ba(da.this, recoverActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class B implements C0107a {
        private B() {
        }

        /* synthetic */ B(da daVar, C2714o oVar) {
            this();
        }

        public C4029h.a a(GoOffboardingActivity goOffboardingActivity) {
            C5023JMa.a(goOffboardingActivity);
            return new C(da.this, goOffboardingActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Ba implements C4039s.a {
        /* synthetic */ Ba(da daVar, RecoverActivity recoverActivity, C2714o oVar) {
            this(recoverActivity);
        }

        private C2416ZT b() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU c() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker d() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private com.soundcloud.android.image.O e() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private C2466bM f() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private fa g() {
            return new fa(da.this.r());
        }

        private Ba(RecoverActivity recoverActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private RecoverActivity b(RecoverActivity recoverActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) recoverActivity, d());
            com.soundcloud.android.main.ga.a((RootActivity) recoverActivity, b());
            com.soundcloud.android.main.ga.a((RootActivity) recoverActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) recoverActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) recoverActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) recoverActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) recoverActivity, e());
            com.soundcloud.android.main.ga.a((RootActivity) recoverActivity, c());
            com.soundcloud.android.main.ga.a((RootActivity) recoverActivity, f());
            com.soundcloud.android.main.ga.b(recoverActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) recoverActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) recoverActivity, (C3700b) da.this.ia());
            ea.a(recoverActivity, g());
            ea.a(recoverActivity, (C6699jHa) da.this.Ja.get());
            ea.a(recoverActivity, com.soundcloud.android.X.b());
            ea.a(recoverActivity, (C4655rja) da.this.lk.get());
            ea.a(recoverActivity, (C3469VY) da.this.ka());
            ea.b(recoverActivity, com.soundcloud.android.G.b());
            ea.a(recoverActivity, C2936o.b());
            return recoverActivity;
        }

        public void a(RecoverActivity recoverActivity) {
            b(recoverActivity);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class C implements C4029h.a {
        /* synthetic */ C(da daVar, GoOffboardingActivity goOffboardingActivity, C2714o oVar) {
            this(goOffboardingActivity);
        }

        private C2416ZT b() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU c() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker d() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private com.soundcloud.android.image.O e() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private C2466bM f() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C(GoOffboardingActivity goOffboardingActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private GoOffboardingActivity b(GoOffboardingActivity goOffboardingActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) goOffboardingActivity, d());
            com.soundcloud.android.main.ga.a((RootActivity) goOffboardingActivity, b());
            com.soundcloud.android.main.ga.a((RootActivity) goOffboardingActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) goOffboardingActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) goOffboardingActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) goOffboardingActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) goOffboardingActivity, e());
            com.soundcloud.android.main.ga.a((RootActivity) goOffboardingActivity, c());
            com.soundcloud.android.main.ga.a((RootActivity) goOffboardingActivity, f());
            com.soundcloud.android.main.ga.b(goOffboardingActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) goOffboardingActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) goOffboardingActivity, (C3700b) da.this.ia());
            c.a(goOffboardingActivity, da.this.g());
            return goOffboardingActivity;
        }

        public void a(GoOffboardingActivity goOffboardingActivity) {
            b(goOffboardingActivity);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Ca implements C0119a {
        private Ca() {
        }

        /* synthetic */ Ca(da daVar, C2714o oVar) {
            this();
        }

        public C4040t.a a(RemoteSignInWebViewActivity remoteSignInWebViewActivity) {
            C5023JMa.a(remoteSignInWebViewActivity);
            return new Da(da.this, remoteSignInWebViewActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class D implements C0108a {
        private D() {
        }

        /* synthetic */ D(da daVar, C2714o oVar) {
            this();
        }

        public C4030i.a a(GoOnboardingActivity goOnboardingActivity) {
            C5023JMa.a(goOnboardingActivity);
            return new E(da.this, goOnboardingActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Da implements C4040t.a {
        /* synthetic */ Da(da daVar, RemoteSignInWebViewActivity remoteSignInWebViewActivity, C2714o oVar) {
            this(remoteSignInWebViewActivity);
        }

        private C2416ZT b() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU c() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker d() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private com.soundcloud.android.image.O e() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private C2466bM f() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private Da(RemoteSignInWebViewActivity remoteSignInWebViewActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private RemoteSignInWebViewActivity b(RemoteSignInWebViewActivity remoteSignInWebViewActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) remoteSignInWebViewActivity, d());
            com.soundcloud.android.main.ga.a((RootActivity) remoteSignInWebViewActivity, b());
            com.soundcloud.android.main.ga.a((RootActivity) remoteSignInWebViewActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) remoteSignInWebViewActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) remoteSignInWebViewActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) remoteSignInWebViewActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) remoteSignInWebViewActivity, e());
            com.soundcloud.android.main.ga.a((RootActivity) remoteSignInWebViewActivity, c());
            com.soundcloud.android.main.ga.a((RootActivity) remoteSignInWebViewActivity, f());
            com.soundcloud.android.main.ga.b(remoteSignInWebViewActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) remoteSignInWebViewActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) remoteSignInWebViewActivity, (C3700b) da.this.ia());
            return remoteSignInWebViewActivity;
        }

        public void a(RemoteSignInWebViewActivity remoteSignInWebViewActivity) {
            b(remoteSignInWebViewActivity);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class E implements C4030i.a {
        /* synthetic */ E(da daVar, GoOnboardingActivity goOnboardingActivity, C2714o oVar) {
            this(goOnboardingActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(m());
        }

        private C2416ZT f() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU g() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker h() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object i() {
            return C5602ata.a(da.this.Ce());
        }

        private Object j() {
            return com.soundcloud.android.upgrade.i.a(da.this.hc(), da.this.Nc(), da.this.Vc(), k(), da.this.ia());
        }

        private Object k() {
            return com.soundcloud.android.upgrade.l.a(f.a());
        }

        private com.soundcloud.android.image.O l() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea m() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A n() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C2466bM o() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta p() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta q() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), p(), C2947z.b(), i(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private com.soundcloud.android.accounts.O r() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private E(GoOnboardingActivity goOnboardingActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private GoOnboardingActivity b(GoOnboardingActivity goOnboardingActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) goOnboardingActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) goOnboardingActivity, f());
            com.soundcloud.android.main.ga.a((RootActivity) goOnboardingActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) goOnboardingActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) goOnboardingActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) goOnboardingActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) goOnboardingActivity, l());
            com.soundcloud.android.main.ga.a((RootActivity) goOnboardingActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) goOnboardingActivity, o());
            com.soundcloud.android.main.ga.b(goOnboardingActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) goOnboardingActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) goOnboardingActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) goOnboardingActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) goOnboardingActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) goOnboardingActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) goOnboardingActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) goOnboardingActivity, r());
            com.soundcloud.android.main.S.a((LoggedInActivity) goOnboardingActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) goOnboardingActivity, n());
            com.soundcloud.android.main.S.a((LoggedInActivity) goOnboardingActivity, q());
            com.soundcloud.android.main.S.a((LoggedInActivity) goOnboardingActivity, c());
            d.a(goOnboardingActivity, j());
            return goOnboardingActivity;
        }

        public void a(GoOnboardingActivity goOnboardingActivity) {
            b(goOnboardingActivity);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Ea implements C0120a {
        private Ea() {
        }

        /* synthetic */ Ea(da daVar, C2714o oVar) {
            this();
        }

        public C4041u.a a(ResolveActivity resolveActivity) {
            C5023JMa.a(resolveActivity);
            return new Fa(da.this, resolveActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class F implements C0135a {
        private F() {
        }

        /* synthetic */ F(da daVar, C2714o oVar) {
            this();
        }

        public com.soundcloud.android.playback.widget.k.a a(HomescreenWidgetBroadcastReceiver homescreenWidgetBroadcastReceiver) {
            C5023JMa.a(homescreenWidgetBroadcastReceiver);
            return new G(da.this, homescreenWidgetBroadcastReceiver, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Fa implements C4041u.a {
        /* synthetic */ Fa(da daVar, ResolveActivity resolveActivity, C2714o oVar) {
            this(resolveActivity);
        }

        private C2416ZT b() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU c() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker d() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private com.soundcloud.android.image.O e() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private C2466bM f() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private Fa(ResolveActivity resolveActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private ResolveActivity b(ResolveActivity resolveActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) resolveActivity, d());
            com.soundcloud.android.main.ga.a((RootActivity) resolveActivity, b());
            com.soundcloud.android.main.ga.a((RootActivity) resolveActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) resolveActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) resolveActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) resolveActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) resolveActivity, e());
            com.soundcloud.android.main.ga.a((RootActivity) resolveActivity, c());
            com.soundcloud.android.main.ga.a((RootActivity) resolveActivity, f());
            com.soundcloud.android.main.ga.b(resolveActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) resolveActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) resolveActivity, (C3700b) da.this.ia());
            h.a(resolveActivity, com.soundcloud.android.deeplinks.g.b());
            h.a(resolveActivity, (C4655rja) da.this.lk.get());
            h.a(resolveActivity, da.this.n());
            return resolveActivity;
        }

        public void a(ResolveActivity resolveActivity) {
            b(resolveActivity);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class G implements com.soundcloud.android.playback.widget.k.a {
        /* synthetic */ G(da daVar, HomescreenWidgetBroadcastReceiver homescreenWidgetBroadcastReceiver, C2714o oVar) {
            this(homescreenWidgetBroadcastReceiver);
        }

        @CanIgnoreReturnValue
        private HomescreenWidgetBroadcastReceiver b(HomescreenWidgetBroadcastReceiver homescreenWidgetBroadcastReceiver) {
            C4534za.a(homescreenWidgetBroadcastReceiver, (C4412qb) da.this.Ui.get());
            C4534za.a(homescreenWidgetBroadcastReceiver, (C4416rb) da.this.og.get());
            C4534za.a(homescreenWidgetBroadcastReceiver, da.this.xd());
            return homescreenWidgetBroadcastReceiver;
        }

        private G(HomescreenWidgetBroadcastReceiver homescreenWidgetBroadcastReceiver) {
        }

        public void a(HomescreenWidgetBroadcastReceiver homescreenWidgetBroadcastReceiver) {
            b(homescreenWidgetBroadcastReceiver);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Ga implements C0078a {
        private Ga() {
        }

        /* synthetic */ Ga(da daVar, C2714o oVar) {
            this();
        }

        public q.a a(ScFirebaseMessagingService scFirebaseMessagingService) {
            C5023JMa.a(scFirebaseMessagingService);
            return new Ha(da.this, scFirebaseMessagingService, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class H implements C0109a {
        private H() {
        }

        /* synthetic */ H(da daVar, C2714o oVar) {
            this();
        }

        public C4031j.a a(LauncherActivity launcherActivity) {
            C5023JMa.a(launcherActivity);
            return new I(da.this, launcherActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Ha implements q.a {
        /* synthetic */ Ha(da daVar, ScFirebaseMessagingService scFirebaseMessagingService, C2714o oVar) {
            this(scFirebaseMessagingService);
        }

        @CanIgnoreReturnValue
        private ScFirebaseMessagingService b(ScFirebaseMessagingService scFirebaseMessagingService) {
            com.soundcloud.android.fcm.G.a(scFirebaseMessagingService, (C3541g) da.this.Tl.get());
            com.soundcloud.android.fcm.G.a(scFirebaseMessagingService, (C3856qea) da.this.Eg.get());
            com.soundcloud.android.fcm.G.a(scFirebaseMessagingService, a());
            return scFirebaseMessagingService;
        }

        private Ha(ScFirebaseMessagingService scFirebaseMessagingService) {
        }

        private com.soundcloud.android.fcm.r a() {
            com.soundcloud.android.fcm.r rVar = new com.soundcloud.android.fcm.r((C3856qea) da.this.Eg.get(), da.this.q(), new com.soundcloud.android.fcm.w(), da.this.xj, (Ica) da.this.kb.get(), da.this.le(), com.soundcloud.android.X.b(), com.soundcloud.android.G.b());
            return rVar;
        }

        public void a(ScFirebaseMessagingService scFirebaseMessagingService) {
            b(scFirebaseMessagingService);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class I implements C4031j.a {
        /* synthetic */ I(da daVar, LauncherActivity launcherActivity, C2714o oVar) {
            this(launcherActivity);
        }

        private C2416ZT b() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU c() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker d() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private com.soundcloud.android.image.O e() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private C2466bM f() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private I(LauncherActivity launcherActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private LauncherActivity b(LauncherActivity launcherActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) launcherActivity, d());
            com.soundcloud.android.main.ga.a((RootActivity) launcherActivity, b());
            com.soundcloud.android.main.ga.a((RootActivity) launcherActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) launcherActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) launcherActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) launcherActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) launcherActivity, e());
            com.soundcloud.android.main.ga.a((RootActivity) launcherActivity, c());
            com.soundcloud.android.main.ga.a((RootActivity) launcherActivity, f());
            com.soundcloud.android.main.ga.b(launcherActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) launcherActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) launcherActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.Q.a(launcherActivity, (Ica) da.this.kb.get());
            com.soundcloud.android.main.Q.a(launcherActivity, (C2526g) da.this.Fd.get());
            com.soundcloud.android.main.Q.a(launcherActivity, da.this.hc());
            com.soundcloud.android.main.Q.a(launcherActivity, com.soundcloud.android.G.b());
            return launcherActivity;
        }

        public void a(LauncherActivity launcherActivity) {
            b(launcherActivity);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Ia implements C0065a {
        private Ia() {
        }

        /* synthetic */ Ia(da daVar, C2714o oVar) {
            this();
        }

        public a a(SoundRecorderService soundRecorderService) {
            C5023JMa.a(soundRecorderService);
            return new Ja(da.this, soundRecorderService, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class J implements C0110a {
        private J() {
        }

        /* synthetic */ J(da daVar, C2714o oVar) {
            this();
        }

        public C4032k.a a(LegalActivity legalActivity) {
            C5023JMa.a(legalActivity);
            return new K(da.this, legalActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Ja implements a {
        /* synthetic */ Ja(da daVar, SoundRecorderService soundRecorderService, C2714o oVar) {
            this(soundRecorderService);
        }

        @CanIgnoreReturnValue
        private SoundRecorderService b(SoundRecorderService soundRecorderService) {
            com.soundcloud.android.features.record.ea.a(soundRecorderService, C3042hV.b());
            return soundRecorderService;
        }

        private Ja(SoundRecorderService soundRecorderService) {
        }

        public void a(SoundRecorderService soundRecorderService) {
            b(soundRecorderService);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class K implements C4032k.a {
        /* synthetic */ K(da daVar, LegalActivity legalActivity, C2714o oVar) {
            this(legalActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(k());
        }

        private C2416ZT f() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU g() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker h() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object i() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O j() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea k() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A l() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C2466bM m() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta n() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta o() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), n(), C2947z.b(), i(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private com.soundcloud.android.accounts.O p() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private K(LegalActivity legalActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private LegalActivity b(LegalActivity legalActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) legalActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) legalActivity, f());
            com.soundcloud.android.main.ga.a((RootActivity) legalActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) legalActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) legalActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) legalActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) legalActivity, j());
            com.soundcloud.android.main.ga.a((RootActivity) legalActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) legalActivity, m());
            com.soundcloud.android.main.ga.b(legalActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) legalActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) legalActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) legalActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) legalActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) legalActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) legalActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) legalActivity, p());
            com.soundcloud.android.main.S.a((LoggedInActivity) legalActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) legalActivity, l());
            com.soundcloud.android.main.S.a((LoggedInActivity) legalActivity, o());
            com.soundcloud.android.main.S.a((LoggedInActivity) legalActivity, c());
            C5958o.a(legalActivity, da.this.D());
            return legalActivity;
        }

        public void a(LegalActivity legalActivity) {
            b(legalActivity);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Ka implements C0086a {
        private Ka() {
        }

        /* synthetic */ Ka(da daVar, C2714o oVar) {
            this();
        }

        public C3620m.a a(TrackLikesFragment trackLikesFragment) {
            C5023JMa.a(trackLikesFragment);
            return new La(da.this, trackLikesFragment, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class L implements C0085a {
        private L() {
        }

        /* synthetic */ L(da daVar, C2714o oVar) {
            this();
        }

        public C3586l.a a(LibraryFragment libraryFragment) {
            C5023JMa.a(libraryFragment);
            return new M(da.this, libraryFragment, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class La implements C3620m.a {
        private C7054oVa<com.soundcloud.android.features.library.likes.z> a;

        /* synthetic */ La(da daVar, TrackLikesFragment trackLikesFragment, C2714o oVar) {
            this(trackLikesFragment);
        }

        private void b(TrackLikesFragment trackLikesFragment) {
            this.a = com.soundcloud.android.features.library.likes.S.a(da.this.Ok, da.this.ua, da.this.ke, da.this.fa, da.this.Oc, da.this.Pk, da.this.Ga, da.this.gk, da.this.Qk, da.this.lk, da.this.Tc, da.this.ta, da.this.gd, C2936o.a(), da.this.Vl);
        }

        @CanIgnoreReturnValue
        private TrackLikesFragment c(TrackLikesFragment trackLikesFragment) {
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) trackLikesFragment, (C5047KEa) da.this.mk.get());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) trackLikesFragment, da.this.Ia());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) trackLikesFragment, (C4655rja) da.this.lk.get());
            C3603q.a(trackLikesFragment, C4930GMa.a(this.a));
            C3603q.a(trackLikesFragment, a());
            C3603q.a(trackLikesFragment, da.this.Sk);
            return trackLikesFragment;
        }

        private La(TrackLikesFragment trackLikesFragment) {
            b(trackLikesFragment);
        }

        private C3588b a() {
            return new C3588b(new com.soundcloud.android.features.library.likes.w(), da.this.Wf());
        }

        public void a(TrackLikesFragment trackLikesFragment) {
            c(trackLikesFragment);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class M implements C3586l.a {
        private C7054oVa<com.soundcloud.android.features.library.T> a;

        /* synthetic */ M(da daVar, LibraryFragment libraryFragment, C2714o oVar) {
            this(libraryFragment);
        }

        private C3580f b() {
            C3580f fVar = new C3580f(new C3647y(), da.this.ig(), c(), new Cca(), da.this.pe(), da.this.Yc());
            return fVar;
        }

        private com.soundcloud.android.features.library.V c() {
            return new com.soundcloud.android.features.library.V(a());
        }

        private M(LibraryFragment libraryFragment) {
            b(libraryFragment);
        }

        private C2080HU a() {
            C2080HU hu = new C2080HU((C2137KU) da.this.Ca.get(), (com.soundcloud.android.properties.a) da.this.La.get(), da.this.Ja(), da.this.N(), da.this.ka());
            return hu;
        }

        private void b(LibraryFragment libraryFragment) {
            this.a = com.soundcloud.android.features.library.U.a(da.this.rl, da.this.sl, da.this.nl, da.this.ug, da.this.lk, da.this.tl, da.this.ta, com.soundcloud.android.X.a(), C2936o.a(), da.this.kb, da.this.ua);
        }

        @CanIgnoreReturnValue
        private LibraryFragment c(LibraryFragment libraryFragment) {
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) libraryFragment, (C5047KEa) da.this.mk.get());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) libraryFragment, da.this.Ia());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) libraryFragment, (C4655rja) da.this.lk.get());
            C3623p.a(libraryFragment, C4930GMa.a(this.a));
            C3623p.a(libraryFragment, b());
            C3623p.a(libraryFragment, da.this.N());
            C3623p.a(libraryFragment, da.this.Nf());
            return libraryFragment;
        }

        public void a(LibraryFragment libraryFragment) {
            c(libraryFragment);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Ma implements C0121a {
        private Ma() {
        }

        /* synthetic */ Ma(da daVar, C2714o oVar) {
            this();
        }

        public C4042v.a a(UploadActivity uploadActivity) {
            C5023JMa.a(uploadActivity);
            return new Na(da.this, uploadActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class N implements C0111a {
        private N() {
        }

        /* synthetic */ N(da daVar, C2714o oVar) {
            this();
        }

        public C4033l.a a(LicensesActivity licensesActivity) {
            C5023JMa.a(licensesActivity);
            return new O(da.this, licensesActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Na implements C4042v.a {
        /* synthetic */ Na(da daVar, UploadActivity uploadActivity, C2714o oVar) {
            this(uploadActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(k());
        }

        private C2416ZT f() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU g() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker h() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object i() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O j() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea k() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A l() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C2466bM m() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta n() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta o() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), n(), C2947z.b(), i(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private com.soundcloud.android.features.record.S p() {
            return com.soundcloud.android.features.record.T.a(q());
        }

        private com.soundcloud.android.features.record.U q() {
            return com.soundcloud.android.features.record.V.a((Ica) da.this.kb.get(), new C3669v());
        }

        private com.soundcloud.android.accounts.O r() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private Na(UploadActivity uploadActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private UploadActivity b(UploadActivity uploadActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) uploadActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) uploadActivity, f());
            com.soundcloud.android.main.ga.a((RootActivity) uploadActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) uploadActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) uploadActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) uploadActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) uploadActivity, j());
            com.soundcloud.android.main.ga.a((RootActivity) uploadActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) uploadActivity, m());
            com.soundcloud.android.main.ga.b(uploadActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) uploadActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) uploadActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) uploadActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) uploadActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) uploadActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) uploadActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) uploadActivity, r());
            com.soundcloud.android.main.S.a((LoggedInActivity) uploadActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) uploadActivity, l());
            com.soundcloud.android.main.S.a((LoggedInActivity) uploadActivity, o());
            com.soundcloud.android.main.S.a((LoggedInActivity) uploadActivity, c());
            com.soundcloud.android.creators.record.f.a(uploadActivity, da.this.D());
            com.soundcloud.android.creators.record.f.a(uploadActivity, p());
            com.soundcloud.android.creators.record.f.a(uploadActivity, (C4655rja) da.this.lk.get());
            return uploadActivity;
        }

        public void a(UploadActivity uploadActivity) {
            b(uploadActivity);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class O implements C4033l.a {
        /* synthetic */ O(da daVar, LicensesActivity licensesActivity, C2714o oVar) {
            this(licensesActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(k());
        }

        private C2416ZT f() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU g() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker h() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object i() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O j() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea k() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A l() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C2466bM m() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta n() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta o() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), n(), C2947z.b(), i(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private com.soundcloud.android.accounts.O p() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private O(LicensesActivity licensesActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private LicensesActivity b(LicensesActivity licensesActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) licensesActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) licensesActivity, f());
            com.soundcloud.android.main.ga.a((RootActivity) licensesActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) licensesActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) licensesActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) licensesActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) licensesActivity, j());
            com.soundcloud.android.main.ga.a((RootActivity) licensesActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) licensesActivity, m());
            com.soundcloud.android.main.ga.b(licensesActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) licensesActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) licensesActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) licensesActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) licensesActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) licensesActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) licensesActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) licensesActivity, p());
            com.soundcloud.android.main.S.a((LoggedInActivity) licensesActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) licensesActivity, l());
            com.soundcloud.android.main.S.a((LoggedInActivity) licensesActivity, o());
            com.soundcloud.android.main.S.a((LoggedInActivity) licensesActivity, c());
            com.soundcloud.android.settings.r.a(licensesActivity, da.this.D());
            return licensesActivity;
        }

        public void a(LicensesActivity licensesActivity) {
            b(licensesActivity);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Oa implements C0167a {
        private Oa() {
        }

        /* synthetic */ Oa(da daVar, C2714o oVar) {
            this();
        }

        public com.soundcloud.android.profile.Vd.a a(UserTopTracksFragment userTopTracksFragment) {
            C5023JMa.a(userTopTracksFragment);
            return new Pa(da.this, userTopTracksFragment, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class P implements C0088a {
        private P() {
        }

        /* synthetic */ P(da daVar, C2714o oVar) {
            this();
        }

        public C3622o.a a(LikesSearchFragment likesSearchFragment) {
            C5023JMa.a(likesSearchFragment);
            return new Q(da.this, likesSearchFragment, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Pa implements com.soundcloud.android.profile.Vd.a {
        /* synthetic */ Pa(da daVar, UserTopTracksFragment userTopTracksFragment, C2714o oVar) {
            this(userTopTracksFragment);
        }

        @CanIgnoreReturnValue
        private UserTopTracksFragment b(UserTopTracksFragment userTopTracksFragment) {
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userTopTracksFragment, (C5047KEa) da.this.mk.get());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userTopTracksFragment, da.this.Ia());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userTopTracksFragment, (C4655rja) da.this.lk.get());
            Td.a(userTopTracksFragment, a());
            Td.a(userTopTracksFragment, da.this.sg());
            return userTopTracksFragment;
        }

        private Pa(UserTopTracksFragment userTopTracksFragment) {
        }

        private Xd a() {
            Xd xd = new Xd(da.this.vg(), (Ica) da.this.kb.get(), da.this.ia(), da.this.pd(), C2936o.b());
            return xd;
        }

        public void a(UserTopTracksFragment userTopTracksFragment) {
            b(userTopTracksFragment);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Q implements C3622o.a {
        private C7054oVa<C3614j> a;
        private C7054oVa<com.soundcloud.android.features.library.likes.search.K> b;

        /* synthetic */ Q(da daVar, LikesSearchFragment likesSearchFragment, C2714o oVar) {
            this(likesSearchFragment);
        }

        private com.soundcloud.android.features.library.likes.search.z b() {
            return new com.soundcloud.android.features.library.likes.search.z(da.this.Uf());
        }

        @CanIgnoreReturnValue
        private LikesSearchFragment c(LikesSearchFragment likesSearchFragment) {
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) likesSearchFragment, (C5047KEa) da.this.mk.get());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) likesSearchFragment, da.this.Ia());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) likesSearchFragment, (C4655rja) da.this.lk.get());
            com.soundcloud.android.features.library.likes.search.t.a(likesSearchFragment, C4930GMa.a(this.b));
            com.soundcloud.android.features.library.likes.search.t.a(likesSearchFragment, a());
            com.soundcloud.android.features.library.likes.search.t.a(likesSearchFragment, da.this.kb());
            return likesSearchFragment;
        }

        private Q(LikesSearchFragment likesSearchFragment) {
            b(likesSearchFragment);
        }

        private com.soundcloud.android.features.library.likes.search.v a() {
            return new com.soundcloud.android.features.library.likes.search.v(b());
        }

        private void b(LikesSearchFragment likesSearchFragment) {
            this.a = C3615k.a(da.this.Vl, da.this.ed);
            this.b = com.soundcloud.android.features.library.likes.search.L.a(da.this.gk, da.this.Qk, da.this.ta, C2936o.a(), this.a);
        }

        public void a(LikesSearchFragment likesSearchFragment) {
            c(likesSearchFragment);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Qa implements C0122a {
        private Qa() {
        }

        /* synthetic */ Qa(da daVar, C2714o oVar) {
            this();
        }

        public C4043w.a a(VerifyAgeActivity verifyAgeActivity) {
            C5023JMa.a(verifyAgeActivity);
            return new Ra(da.this, verifyAgeActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Ra implements C4043w.a {
        /* synthetic */ Ra(da daVar, VerifyAgeActivity verifyAgeActivity, C2714o oVar) {
            this(verifyAgeActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(k());
        }

        private C2416ZT f() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU g() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker h() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object i() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O j() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea k() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A l() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C2466bM m() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta n() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta o() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), n(), C2947z.b(), i(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private Object p() {
            return com.soundcloud.android.profile.Va.a(da.this.q(), com.soundcloud.android.G.b());
        }

        private com.soundcloud.android.accounts.O q() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private com.soundcloud.android.profile.ke r() {
            return ne.a(p(), da.this.Sa(), da.this.Ca(), (com.soundcloud.android.foundation.events.F) da.this.fh.get());
        }

        private Ra(VerifyAgeActivity verifyAgeActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private VerifyAgeActivity b(VerifyAgeActivity verifyAgeActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) verifyAgeActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) verifyAgeActivity, f());
            com.soundcloud.android.main.ga.a((RootActivity) verifyAgeActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) verifyAgeActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) verifyAgeActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) verifyAgeActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) verifyAgeActivity, j());
            com.soundcloud.android.main.ga.a((RootActivity) verifyAgeActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) verifyAgeActivity, m());
            com.soundcloud.android.main.ga.b(verifyAgeActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) verifyAgeActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) verifyAgeActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) verifyAgeActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) verifyAgeActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) verifyAgeActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) verifyAgeActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) verifyAgeActivity, q());
            com.soundcloud.android.main.S.a((LoggedInActivity) verifyAgeActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) verifyAgeActivity, l());
            com.soundcloud.android.main.S.a((LoggedInActivity) verifyAgeActivity, o());
            com.soundcloud.android.main.S.a((LoggedInActivity) verifyAgeActivity, c());
            je.a(verifyAgeActivity, da.this.D());
            je.a(verifyAgeActivity, r());
            je.a(verifyAgeActivity, p());
            return verifyAgeActivity;
        }

        public void a(VerifyAgeActivity verifyAgeActivity) {
            b(verifyAgeActivity);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class S implements C0112a {
        private S() {
        }

        /* synthetic */ S(da daVar, C2714o oVar) {
            this();
        }

        public C4034m.a a(MainActivity mainActivity) {
            C5023JMa.a(mainActivity);
            return new T(da.this, mainActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Sa implements C0177a {
        private Sa() {
        }

        /* synthetic */ Sa(da daVar, C2714o oVar) {
            this();
        }

        public com.soundcloud.android.ui.visualplayer.p.a a(VisualPlayerFragment visualPlayerFragment) {
            C5023JMa.a(visualPlayerFragment);
            return new Ta(da.this, visualPlayerFragment, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class T implements C4034m.a {
        /* synthetic */ T(da daVar, MainActivity mainActivity, C2714o oVar) {
            this(mainActivity);
        }

        private C2633va b() {
            C2633va vaVar = new C2633va(da.this.m(), (C5327TLa) da.this.fa.get(), da.this.ia(), (Yaa) da.this.Nh.get(), (C6699jHa) da.this.Ja.get(), (C3814lca) da.this.Ed.get(), da.this.j(), da.this.md());
            return vaVar;
        }

        private C3194pK c() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK d() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), c(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b e() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i f() {
            return new com.soundcloud.android.cast.i(m());
        }

        private C2416ZT g() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU h() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker i() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object j() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O k() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private C4628oia l() {
            C4628oia oia = new C4628oia(da.this.x(), (C5052KJa) da.this.Ki.get(), (com.soundcloud.android.properties.a) da.this.La.get(), da.this.ia(), (C6699jHa) da.this.Ja.get(), da.this.gb(), da.this.le(), (FirebaseRemoteConfig) da.this.Ha.get());
            return oia;
        }

        private Iea m() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A n() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private MainNavigationPresenter o() {
            return com.soundcloud.android.main.V.a(da.this.D(), da.this.hc(), da.this.Re(), da.this.Ja(), da.this.Bb());
        }

        private C2466bM p() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private PlayerController q() {
            return new PlayerController(t(), (com.soundcloud.android.ads.Ca) da.this.Hl.get(), b(), (C5052KJa) da.this.Ki.get());
        }

        private C6810kta r() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta s() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), r(), C2947z.b(), j(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private ac t() {
            ac acVar = new ac((C3814lca) da.this.Ed.get(), (C5327TLa) da.this.fa.get(), da.this.md(), (C5235QJa) da.this.Gl.get(), new LockableBottomSheetBehavior.a(), da.this.yd(), da.this.ia());
            return acVar;
        }

        private com.soundcloud.android.accounts.O u() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private T(MainActivity mainActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private MainActivity b(MainActivity mainActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) mainActivity, i());
            com.soundcloud.android.main.ga.a((RootActivity) mainActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) mainActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) mainActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) mainActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) mainActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) mainActivity, k());
            com.soundcloud.android.main.ga.a((RootActivity) mainActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) mainActivity, p());
            com.soundcloud.android.main.ga.b(mainActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) mainActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) mainActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) mainActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) mainActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) mainActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) mainActivity, f());
            com.soundcloud.android.main.S.a((LoggedInActivity) mainActivity, u());
            com.soundcloud.android.main.S.a((LoggedInActivity) mainActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) mainActivity, n());
            com.soundcloud.android.main.S.a((LoggedInActivity) mainActivity, s());
            com.soundcloud.android.main.S.a((LoggedInActivity) mainActivity, d());
            com.soundcloud.android.main.T.a(mainActivity, da.this.Re());
            com.soundcloud.android.main.T.a(mainActivity, o());
            com.soundcloud.android.main.T.a(mainActivity, (PrestitialAdsController) da.this.Fl.get());
            com.soundcloud.android.main.T.a(mainActivity, q());
            com.soundcloud.android.main.T.a(mainActivity, (C5235QJa) da.this.Gl.get());
            com.soundcloud.android.main.T.a(mainActivity, l());
            com.soundcloud.android.main.T.a(mainActivity, (C3832nea) da.this.Jl.get());
            com.soundcloud.android.main.T.a(mainActivity, (ba) da.this.Kl.get());
            com.soundcloud.android.main.T.a(mainActivity, (C4412qb) da.this.Ui.get());
            com.soundcloud.android.main.T.a(mainActivity, (com.soundcloud.android.main.X) da.this.Cl.get());
            com.soundcloud.android.main.T.a(mainActivity, (C2526g) da.this.Fd.get());
            com.soundcloud.android.main.T.a(mainActivity, (C5052KJa) da.this.Ki.get());
            return mainActivity;
        }

        public void a(MainActivity mainActivity) {
            b(mainActivity);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Ta implements com.soundcloud.android.ui.visualplayer.p.a {
        private C7054oVa<com.soundcloud.android.ui.visualplayer.t> a;

        /* synthetic */ Ta(da daVar, VisualPlayerFragment visualPlayerFragment, C2714o oVar) {
            this(visualPlayerFragment);
        }

        private void b(VisualPlayerFragment visualPlayerFragment) {
            this.a = u.a(C2936o.a(), da.this.Ed, da.this.pg);
        }

        @CanIgnoreReturnValue
        private VisualPlayerFragment c(VisualPlayerFragment visualPlayerFragment) {
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) visualPlayerFragment, (C5047KEa) da.this.mk.get());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) visualPlayerFragment, da.this.Ia());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) visualPlayerFragment, (C4655rja) da.this.lk.get());
            com.soundcloud.android.ui.visualplayer.n.a(visualPlayerFragment, C4930GMa.a(this.a));
            com.soundcloud.android.ui.visualplayer.n.a(visualPlayerFragment, new com.soundcloud.android.ui.visualplayer.h());
            return visualPlayerFragment;
        }

        private Ta(VisualPlayerFragment visualPlayerFragment) {
            b(visualPlayerFragment);
        }

        public void a(VisualPlayerFragment visualPlayerFragment) {
            c(visualPlayerFragment);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class U implements C0100a {
        private U() {
        }

        /* synthetic */ U(da daVar, C2714o oVar) {
            this();
        }

        public a a(MediaService mediaService) {
            C5023JMa.a(mediaService);
            return new V(da.this, mediaService, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Ua implements C0130a {
        private Ua() {
        }

        /* synthetic */ Ua(da daVar, C2714o oVar) {
            this();
        }

        public C4251la.a a(WebCheckoutActivity webCheckoutActivity) {
            C5023JMa.a(webCheckoutActivity);
            return new Va(da.this, webCheckoutActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class V implements a {
        /* synthetic */ V(da daVar, MediaService mediaService, C2714o oVar) {
            this(mediaService);
        }

        private b b() {
            return new b(new b());
        }

        private V(MediaService mediaService) {
        }

        private b a() {
            return new b(da.this.X(), da.this.Ga(), (C6834lGa) da.this.Ga.get(), C2947z.b());
        }

        @CanIgnoreReturnValue
        private MediaService b(MediaService mediaService) {
            com.soundcloud.android.playback.players.j.a(mediaService, new Xma());
            com.soundcloud.android.playback.players.j.a(mediaService, a());
            com.soundcloud.android.playback.players.j.a(mediaService, b());
            com.soundcloud.android.playback.players.j.a(mediaService, da.this.Eb());
            com.soundcloud.android.playback.players.j.a(mediaService, da.this.ud());
            return mediaService;
        }

        public void a(MediaService mediaService) {
            b(mediaService);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Va implements C4251la.a {
        private C7054oVa<_a> a;

        /* synthetic */ Va(da daVar, WebCheckoutActivity webCheckoutActivity, C2714o oVar) {
            this(webCheckoutActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(k());
        }

        private C2416ZT f() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU g() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker h() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object i() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O j() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea k() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A l() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C2466bM m() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta n() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta o() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), n(), C2947z.b(), i(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private com.soundcloud.android.accounts.O p() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private Object q() {
            return com.soundcloud.android.payments.Ua.a(new com.soundcloud.android.payments.Va(), com.soundcloud.android.ca.a(da.this.c), (C2526g) da.this.Fd.get(), da.this.zb(), C4930GMa.a(this.a), da.this.Nc(), da.this.hc(), da.this.ia(), da.this.le());
        }

        private Va(WebCheckoutActivity webCheckoutActivity) {
            b(webCheckoutActivity);
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        private void b(WebCheckoutActivity webCheckoutActivity) {
            this.a = ab.a(da.this.ab, com.soundcloud.android.G.a());
        }

        @CanIgnoreReturnValue
        private WebCheckoutActivity c(WebCheckoutActivity webCheckoutActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) webCheckoutActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) webCheckoutActivity, f());
            com.soundcloud.android.main.ga.a((RootActivity) webCheckoutActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) webCheckoutActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) webCheckoutActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) webCheckoutActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) webCheckoutActivity, j());
            com.soundcloud.android.main.ga.a((RootActivity) webCheckoutActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) webCheckoutActivity, m());
            com.soundcloud.android.main.ga.b(webCheckoutActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) webCheckoutActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) webCheckoutActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) webCheckoutActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) webCheckoutActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) webCheckoutActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) webCheckoutActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) webCheckoutActivity, p());
            com.soundcloud.android.main.S.a((LoggedInActivity) webCheckoutActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) webCheckoutActivity, l());
            com.soundcloud.android.main.S.a((LoggedInActivity) webCheckoutActivity, o());
            com.soundcloud.android.main.S.a((LoggedInActivity) webCheckoutActivity, c());
            com.soundcloud.android.payments.Qa.a(webCheckoutActivity, da.this.D());
            com.soundcloud.android.payments.Qa.a(webCheckoutActivity, q());
            com.soundcloud.android.payments.Qa.a(webCheckoutActivity, (C3701c) da.this.ja());
            return webCheckoutActivity;
        }

        public void a(WebCheckoutActivity webCheckoutActivity) {
            c(webCheckoutActivity);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class W implements C0128a {
        private W() {
        }

        /* synthetic */ W(da daVar, C2714o oVar) {
            this();
        }

        public C4247ja.a a(NativeConversionActivity nativeConversionActivity) {
            C5023JMa.a(nativeConversionActivity);
            return new X(da.this, nativeConversionActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Wa implements C0123a {
        private Wa() {
        }

        /* synthetic */ Wa(da daVar, C2714o oVar) {
            this();
        }

        public C4044x.a a(WebViewActivity webViewActivity) {
            C5023JMa.a(webViewActivity);
            return new Xa(da.this, webViewActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class X implements C4247ja.a {
        /* synthetic */ X(da daVar, NativeConversionActivity nativeConversionActivity, C2714o oVar) {
            this(nativeConversionActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C4591jla d() {
            return C4615mla.a((C6699jHa) da.this.Ja.get(), e(), C4648qla.a(), da.this.ia());
        }

        private Object e() {
            return C4607lla.a(da.this.X());
        }

        private C2728b f() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i g() {
            return new com.soundcloud.android.cast.i(m());
        }

        private C2416ZT h() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU i() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker j() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object k() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O l() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea m() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private Object n() {
            return com.soundcloud.android.payments.T.a(da.this.Ce(), v());
        }

        private com.soundcloud.android.accounts.A o() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private Object p() {
            return com.soundcloud.android.payments.X.a(q(), s(), n(), da.this.hc(), da.this.ia());
        }

        private Object q() {
            return C4229aa.a(com.soundcloud.android.G.b(), da.this.r(), d(), w());
        }

        private C2466bM r() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private Object s() {
            return C4237ea.a(C4241ga.a(), da.this.ia());
        }

        private C6810kta t() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta u() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), t(), C2947z.b(), k(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private com.soundcloud.android.payments.Ba v() {
            return com.soundcloud.android.payments.Ca.a(da.this.Ce());
        }

        private Object w() {
            return com.soundcloud.android.payments.Na.a(da.this.Vb());
        }

        private com.soundcloud.android.accounts.O x() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private X(NativeConversionActivity nativeConversionActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private NativeConversionActivity b(NativeConversionActivity nativeConversionActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) nativeConversionActivity, j());
            com.soundcloud.android.main.ga.a((RootActivity) nativeConversionActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) nativeConversionActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) nativeConversionActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) nativeConversionActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) nativeConversionActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) nativeConversionActivity, l());
            com.soundcloud.android.main.ga.a((RootActivity) nativeConversionActivity, i());
            com.soundcloud.android.main.ga.a((RootActivity) nativeConversionActivity, r());
            com.soundcloud.android.main.ga.b(nativeConversionActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) nativeConversionActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) nativeConversionActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) nativeConversionActivity, f());
            com.soundcloud.android.main.S.a((LoggedInActivity) nativeConversionActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) nativeConversionActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) nativeConversionActivity, g());
            com.soundcloud.android.main.S.a((LoggedInActivity) nativeConversionActivity, x());
            com.soundcloud.android.main.S.a((LoggedInActivity) nativeConversionActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) nativeConversionActivity, o());
            com.soundcloud.android.main.S.a((LoggedInActivity) nativeConversionActivity, u());
            com.soundcloud.android.main.S.a((LoggedInActivity) nativeConversionActivity, c());
            com.soundcloud.android.payments.U.a(nativeConversionActivity, p());
            com.soundcloud.android.payments.U.a(nativeConversionActivity, da.this.D());
            return nativeConversionActivity;
        }

        public void a(NativeConversionActivity nativeConversionActivity) {
            b(nativeConversionActivity);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Xa implements C4044x.a {
        /* synthetic */ Xa(da daVar, WebViewActivity webViewActivity, C2714o oVar) {
            this(webViewActivity);
        }

        private C2416ZT b() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU c() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker d() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private com.soundcloud.android.image.O e() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private C2466bM f() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private Xa(WebViewActivity webViewActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private WebViewActivity b(WebViewActivity webViewActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) webViewActivity, d());
            com.soundcloud.android.main.ga.a((RootActivity) webViewActivity, b());
            com.soundcloud.android.main.ga.a((RootActivity) webViewActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) webViewActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) webViewActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) webViewActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) webViewActivity, e());
            com.soundcloud.android.main.ga.a((RootActivity) webViewActivity, c());
            com.soundcloud.android.main.ga.a((RootActivity) webViewActivity, f());
            com.soundcloud.android.main.ga.b(webViewActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) webViewActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) webViewActivity, (C3700b) da.this.ia());
            return webViewActivity;
        }

        public void a(WebViewActivity webViewActivity) {
            b(webViewActivity);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Y implements C0174a {
        private Y() {
        }

        /* synthetic */ Y(da daVar, C2714o oVar) {
            this();
        }

        public o.a a(com.soundcloud.android.trackinfo.f fVar) {
            C5023JMa.a(fVar);
            return new Z(da.this, fVar, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class Z implements o.a {
        /* synthetic */ Z(da daVar, com.soundcloud.android.trackinfo.f fVar, C2714o oVar) {
            this(fVar);
        }

        private com.soundcloud.android.trackinfo.u b() {
            return new com.soundcloud.android.trackinfo.u(da.this.S());
        }

        private Z(com.soundcloud.android.trackinfo.f fVar) {
        }

        private com.soundcloud.android.trackinfo.q a() {
            return new com.soundcloud.android.trackinfo.q(C2936o.b(), da.this.la(), b(), (Ica) da.this.kb.get());
        }

        @CanIgnoreReturnValue
        private com.soundcloud.android.trackinfo.f b(com.soundcloud.android.trackinfo.f fVar) {
            dagger.android.support.c.a(fVar, da.this.sa());
            com.soundcloud.android.trackinfo.j.a(fVar, (C3700b) da.this.ia());
            com.soundcloud.android.trackinfo.j.a(fVar, a());
            com.soundcloud.android.trackinfo.j.a(fVar, (C6147e) da.this.Rf());
            return fVar;
        }

        public void a(com.soundcloud.android.trackinfo.f fVar) {
            b(fVar);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$a reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2656a implements C0124a {
        private C2656a() {
        }

        /* synthetic */ C2656a(da daVar, C2714o oVar) {
            this();
        }

        public C4045y.a a(com.soundcloud.android.ads.injector.s sVar) {
            C5023JMa.a(sVar);
            return new C2658b(da.this, sVar, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$aa reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2657aa implements C0113a {
        private C2657aa() {
        }

        /* synthetic */ C2657aa(da daVar, C2714o oVar) {
            this();
        }

        public C4035n.a a(NotificationPreferencesActivity notificationPreferencesActivity) {
            C5023JMa.a(notificationPreferencesActivity);
            return new C2659ba(da.this, notificationPreferencesActivity, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$b reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2658b implements C4045y.a {
        /* synthetic */ C2658b(da daVar, com.soundcloud.android.ads.injector.s sVar, C2714o oVar) {
            this(sVar);
        }

        @CanIgnoreReturnValue
        private com.soundcloud.android.ads.injector.s b(com.soundcloud.android.ads.injector.s sVar) {
            com.soundcloud.android.ads.injector.t.a(sVar, a());
            com.soundcloud.android.ads.injector.t.a(sVar, (C3814lca) da.this.Ed.get());
            com.soundcloud.android.ads.injector.t.a(sVar, da.this.m());
            return sVar;
        }

        private C2658b(com.soundcloud.android.ads.injector.s sVar) {
        }

        private com.soundcloud.android.ads.injector.u a() {
            return new com.soundcloud.android.ads.injector.u(da.this.La());
        }

        public void a(com.soundcloud.android.ads.injector.s sVar) {
            b(sVar);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$ba reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2659ba implements C4035n.a {
        /* synthetic */ C2659ba(da daVar, NotificationPreferencesActivity notificationPreferencesActivity, C2714o oVar) {
            this(notificationPreferencesActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(k());
        }

        private C2416ZT f() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU g() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker h() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object i() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O j() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea k() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A l() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C2466bM m() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta n() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta o() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), n(), C2947z.b(), i(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private com.soundcloud.android.accounts.O p() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private C2659ba(NotificationPreferencesActivity notificationPreferencesActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private NotificationPreferencesActivity b(NotificationPreferencesActivity notificationPreferencesActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) notificationPreferencesActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) notificationPreferencesActivity, f());
            com.soundcloud.android.main.ga.a((RootActivity) notificationPreferencesActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) notificationPreferencesActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) notificationPreferencesActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) notificationPreferencesActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) notificationPreferencesActivity, j());
            com.soundcloud.android.main.ga.a((RootActivity) notificationPreferencesActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) notificationPreferencesActivity, m());
            com.soundcloud.android.main.ga.b(notificationPreferencesActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) notificationPreferencesActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) notificationPreferencesActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) notificationPreferencesActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) notificationPreferencesActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) notificationPreferencesActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) notificationPreferencesActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) notificationPreferencesActivity, p());
            com.soundcloud.android.main.S.a((LoggedInActivity) notificationPreferencesActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) notificationPreferencesActivity, l());
            com.soundcloud.android.main.S.a((LoggedInActivity) notificationPreferencesActivity, o());
            com.soundcloud.android.main.S.a((LoggedInActivity) notificationPreferencesActivity, c());
            com.soundcloud.android.settings.notifications.k.a(notificationPreferencesActivity, da.this.D());
            com.soundcloud.android.settings.notifications.k.a(notificationPreferencesActivity, da.this.oc());
            return notificationPreferencesActivity;
        }

        public void a(NotificationPreferencesActivity notificationPreferencesActivity) {
            b(notificationPreferencesActivity);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$c reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2660c implements C0125a {
        private C2660c() {
        }

        /* synthetic */ C2660c(da daVar, C2714o oVar) {
            this();
        }

        public C4046z.a a(com.soundcloud.android.properties.h hVar) {
            C5023JMa.a(hVar);
            return new C2662d(da.this, hVar, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$ca reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2661ca implements C0114a {
        private C2661ca() {
        }

        /* synthetic */ C2661ca(da daVar, C2714o oVar) {
            this();
        }

        public C4036o.a a(OfflineSettingsOnboardingActivity offlineSettingsOnboardingActivity) {
            C5023JMa.a(offlineSettingsOnboardingActivity);
            return new C0059da(da.this, offlineSettingsOnboardingActivity, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$d reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2662d implements C4046z.a {
        /* synthetic */ C2662d(da daVar, com.soundcloud.android.properties.h hVar, C2714o oVar) {
            this(hVar);
        }

        @CanIgnoreReturnValue
        private com.soundcloud.android.properties.h b(com.soundcloud.android.properties.h hVar) {
            com.soundcloud.android.properties.i.a(hVar, (FirebaseRemoteConfig) da.this.Ha.get());
            com.soundcloud.android.properties.i.a(hVar, da.this.v());
            com.soundcloud.android.properties.i.a(hVar, da.this.hc());
            com.soundcloud.android.properties.i.a(hVar, (com.soundcloud.android.properties.a) da.this.La.get());
            com.soundcloud.android.properties.i.a(hVar, (C6699jHa) da.this.Ja.get());
            return hVar;
        }

        private C2662d(com.soundcloud.android.properties.h hVar) {
        }

        public void a(com.soundcloud.android.properties.h hVar) {
            b(hVar);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$da reason: collision with other inner class name */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C0059da implements C4036o.a {
        /* synthetic */ C0059da(da daVar, OfflineSettingsOnboardingActivity offlineSettingsOnboardingActivity, C2714o oVar) {
            this(offlineSettingsOnboardingActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(k());
        }

        private C2416ZT f() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU g() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker h() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object i() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O j() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea k() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A l() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C4058ae m() {
            return C4064be.a((C4655rja) da.this.lk.get(), da.this.Fc());
        }

        private C2466bM n() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta o() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta p() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), o(), C2947z.b(), i(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private com.soundcloud.android.accounts.O q() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private C0059da(OfflineSettingsOnboardingActivity offlineSettingsOnboardingActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private OfflineSettingsOnboardingActivity b(OfflineSettingsOnboardingActivity offlineSettingsOnboardingActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) offlineSettingsOnboardingActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) offlineSettingsOnboardingActivity, f());
            com.soundcloud.android.main.ga.a((RootActivity) offlineSettingsOnboardingActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) offlineSettingsOnboardingActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) offlineSettingsOnboardingActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) offlineSettingsOnboardingActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) offlineSettingsOnboardingActivity, j());
            com.soundcloud.android.main.ga.a((RootActivity) offlineSettingsOnboardingActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) offlineSettingsOnboardingActivity, n());
            com.soundcloud.android.main.ga.b(offlineSettingsOnboardingActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) offlineSettingsOnboardingActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) offlineSettingsOnboardingActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) offlineSettingsOnboardingActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) offlineSettingsOnboardingActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) offlineSettingsOnboardingActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) offlineSettingsOnboardingActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) offlineSettingsOnboardingActivity, q());
            com.soundcloud.android.main.S.a((LoggedInActivity) offlineSettingsOnboardingActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) offlineSettingsOnboardingActivity, l());
            com.soundcloud.android.main.S.a((LoggedInActivity) offlineSettingsOnboardingActivity, p());
            com.soundcloud.android.main.S.a((LoggedInActivity) offlineSettingsOnboardingActivity, c());
            _d.a(offlineSettingsOnboardingActivity, m());
            return offlineSettingsOnboardingActivity;
        }

        public void a(OfflineSettingsOnboardingActivity offlineSettingsOnboardingActivity) {
            b(offlineSettingsOnboardingActivity);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$e reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2663e implements C0083a {
        private C2663e() {
        }

        /* synthetic */ C2663e(da daVar, C2714o oVar) {
            this();
        }

        public C3584j.a a(ArtistsFragment artistsFragment) {
            C5023JMa.a(artistsFragment);
            return new C2665f(da.this, artistsFragment, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$ea reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2664ea implements C0104a {
        private C2664ea() {
        }

        /* synthetic */ C2664ea(da daVar, C2714o oVar) {
            this();
        }

        public com.soundcloud.android.listeners.dev.S.a a(com.soundcloud.android.listeners.dev.playback.d dVar) {
            C5023JMa.a(dVar);
            return new C2666fa(da.this, dVar, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$f reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2665f implements C3584j.a {
        private C7054oVa<com.soundcloud.android.features.library.artists.o> a;

        /* synthetic */ C2665f(da daVar, ArtistsFragment artistsFragment, C2714o oVar) {
            this(artistsFragment);
        }

        private void b(ArtistsFragment artistsFragment) {
            this.a = com.soundcloud.android.features.library.artists.p.a(da.this.wk, da.this.ta, com.soundcloud.android.X.a(), C2936o.a());
        }

        @CanIgnoreReturnValue
        private ArtistsFragment c(ArtistsFragment artistsFragment) {
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) artistsFragment, (C5047KEa) da.this.mk.get());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) artistsFragment, da.this.Ia());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) artistsFragment, (C4655rja) da.this.lk.get());
            com.soundcloud.android.features.library.artists.h.a(artistsFragment, C4930GMa.a(this.a));
            com.soundcloud.android.features.library.artists.h.a(artistsFragment, da.this.pg());
            return artistsFragment;
        }

        private C2665f(ArtistsFragment artistsFragment) {
            b(artistsFragment);
        }

        public void a(ArtistsFragment artistsFragment) {
            c(artistsFragment);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$fa reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2666fa implements com.soundcloud.android.listeners.dev.S.a {
        /* synthetic */ C2666fa(da daVar, com.soundcloud.android.listeners.dev.playback.d dVar, C2714o oVar) {
            this(dVar);
        }

        @CanIgnoreReturnValue
        private com.soundcloud.android.listeners.dev.playback.d b(com.soundcloud.android.listeners.dev.playback.d dVar) {
            dagger.android.support.f.a(dVar, da.this.sa());
            com.soundcloud.android.listeners.dev.playback.e.a(dVar, (C5327TLa) da.this.fa.get());
            com.soundcloud.android.listeners.dev.playback.e.a(dVar, (com.soundcloud.android.playback.E) da.this.cj.get());
            com.soundcloud.android.listeners.dev.playback.e.a(dVar, (C7181qKa) da.this.le());
            return dVar;
        }

        private C2666fa(com.soundcloud.android.listeners.dev.playback.d dVar) {
        }

        public void a(com.soundcloud.android.listeners.dev.playback.d dVar) {
            b(dVar);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$g reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2667g implements C0105a {
        private C2667g() {
        }

        /* synthetic */ C2667g(da daVar, C2714o oVar) {
            this();
        }

        public C4027f.a a(ChangeStorageLocationActivity changeStorageLocationActivity) {
            C5023JMa.a(changeStorageLocationActivity);
            return new C2669h(da.this, changeStorageLocationActivity, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$ga reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2668ga implements C0061a {
        private C2668ga() {
        }

        /* synthetic */ C2668ga(da daVar, C2714o oVar) {
            this();
        }

        public com.soundcloud.android.comments.S.a a(PlayerCommentsFragment playerCommentsFragment) {
            C5023JMa.a(playerCommentsFragment);
            return new C2670ha(da.this, playerCommentsFragment, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$h reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2669h implements C4027f.a {
        /* synthetic */ C2669h(da daVar, ChangeStorageLocationActivity changeStorageLocationActivity, C2714o oVar) {
            this(changeStorageLocationActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(l());
        }

        private C5947d f() {
            return new C5947d(da.this.Fc(), da.this.xc(), da.this.ia());
        }

        private C2416ZT g() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU h() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker i() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object j() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O k() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea l() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A m() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C2466bM n() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta o() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta p() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), o(), C2947z.b(), j(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private com.soundcloud.android.accounts.O q() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private C2669h(ChangeStorageLocationActivity changeStorageLocationActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private ChangeStorageLocationActivity b(ChangeStorageLocationActivity changeStorageLocationActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) changeStorageLocationActivity, i());
            com.soundcloud.android.main.ga.a((RootActivity) changeStorageLocationActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) changeStorageLocationActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) changeStorageLocationActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) changeStorageLocationActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) changeStorageLocationActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) changeStorageLocationActivity, k());
            com.soundcloud.android.main.ga.a((RootActivity) changeStorageLocationActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) changeStorageLocationActivity, n());
            com.soundcloud.android.main.ga.b(changeStorageLocationActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) changeStorageLocationActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) changeStorageLocationActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) changeStorageLocationActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) changeStorageLocationActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) changeStorageLocationActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) changeStorageLocationActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) changeStorageLocationActivity, q());
            com.soundcloud.android.main.S.a((LoggedInActivity) changeStorageLocationActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) changeStorageLocationActivity, m());
            com.soundcloud.android.main.S.a((LoggedInActivity) changeStorageLocationActivity, p());
            com.soundcloud.android.main.S.a((LoggedInActivity) changeStorageLocationActivity, c());
            C5946c.a(changeStorageLocationActivity, da.this.D());
            C5946c.a(changeStorageLocationActivity, f());
            return changeStorageLocationActivity;
        }

        public void a(ChangeStorageLocationActivity changeStorageLocationActivity) {
            b(changeStorageLocationActivity);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$ha reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2670ha implements com.soundcloud.android.comments.S.a {
        private C7054oVa<Za> a;

        /* synthetic */ C2670ha(da daVar, PlayerCommentsFragment playerCommentsFragment, C2714o oVar) {
            this(playerCommentsFragment);
        }

        private com.soundcloud.android.comments.r.a b() {
            return new com.soundcloud.android.comments.r.a(da.this.Ce(), (com.soundcloud.android.image.N) da.this.Qd.get());
        }

        @CanIgnoreReturnValue
        private PlayerCommentsFragment c(PlayerCommentsFragment playerCommentsFragment) {
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) playerCommentsFragment, (C5047KEa) da.this.mk.get());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) playerCommentsFragment, da.this.Ia());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) playerCommentsFragment, (C4655rja) da.this.lk.get());
            com.soundcloud.android.comments.O.a((CommentsFragment) playerCommentsFragment, C4930GMa.a(da.this.am));
            com.soundcloud.android.comments.O.a((CommentsFragment) playerCommentsFragment, new com.soundcloud.android.comments.A.a());
            com.soundcloud.android.comments.O.a((CommentsFragment) playerCommentsFragment, b());
            com.soundcloud.android.comments.O.a((CommentsFragment) playerCommentsFragment, (C4989IJa) da.this.bm.get());
            com.soundcloud.android.comments.O.a((CommentsFragment) playerCommentsFragment, a());
            com.soundcloud.android.comments.O.a((CommentsFragment) playerCommentsFragment, new com.soundcloud.android.comments.Ga.b());
            com.soundcloud.android.comments.Xa.a(playerCommentsFragment, da.this.z());
            com.soundcloud.android.comments.Xa.a(playerCommentsFragment, C4930GMa.a(this.a));
            return playerCommentsFragment;
        }

        private C2670ha(PlayerCommentsFragment playerCommentsFragment) {
            b(playerCommentsFragment);
        }

        private C2902o a() {
            return new C2902o((com.soundcloud.android.image.N) da.this.Qd.get(), da.this.kb(), da.this.Ce());
        }

        private void b(PlayerCommentsFragment playerCommentsFragment) {
            this.a = com.soundcloud.android.comments._a.a(da.this.fa, da.this.ta, da.this.yl, da.this._l, da.this._h, com.soundcloud.android.X.a(), com.soundcloud.android.G.a(), C2936o.a());
        }

        public void a(PlayerCommentsFragment playerCommentsFragment) {
            c(playerCommentsFragment);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$i reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2671i implements C0060a {
        private C2671i() {
        }

        /* synthetic */ C2671i(da daVar, C2714o oVar) {
            this();
        }

        public com.soundcloud.android.comments.Q.a a(CommentsFragment commentsFragment) {
            C5023JMa.a(commentsFragment);
            return new C2673j(da.this, commentsFragment, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$ia reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2672ia implements C0134a {
        private C2672ia() {
        }

        /* synthetic */ C2672ia(da daVar, C2714o oVar) {
            this();
        }

        public Sb.a a(PlayerFragment playerFragment) {
            C5023JMa.a(playerFragment);
            return new C2674ja(da.this, playerFragment, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$j reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2673j implements com.soundcloud.android.comments.Q.a {
        /* synthetic */ C2673j(da daVar, CommentsFragment commentsFragment, C2714o oVar) {
            this(commentsFragment);
        }

        private com.soundcloud.android.comments.r.a b() {
            return new com.soundcloud.android.comments.r.a(da.this.Ce(), (com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private C2673j(CommentsFragment commentsFragment) {
        }

        private C2902o a() {
            return new C2902o((com.soundcloud.android.image.N) da.this.Qd.get(), da.this.kb(), da.this.Ce());
        }

        @CanIgnoreReturnValue
        private CommentsFragment b(CommentsFragment commentsFragment) {
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) commentsFragment, (C5047KEa) da.this.mk.get());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) commentsFragment, da.this.Ia());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) commentsFragment, (C4655rja) da.this.lk.get());
            com.soundcloud.android.comments.O.a(commentsFragment, C4930GMa.a(da.this.am));
            com.soundcloud.android.comments.O.a(commentsFragment, new com.soundcloud.android.comments.A.a());
            com.soundcloud.android.comments.O.a(commentsFragment, b());
            com.soundcloud.android.comments.O.a(commentsFragment, (C4989IJa) da.this.bm.get());
            com.soundcloud.android.comments.O.a(commentsFragment, a());
            com.soundcloud.android.comments.O.a(commentsFragment, new com.soundcloud.android.comments.Ga.b());
            return commentsFragment;
        }

        public void a(CommentsFragment commentsFragment) {
            b(commentsFragment);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$ja reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2674ja implements Sb.a {
        private C7054oVa<C4463jb> a;

        /* synthetic */ C2674ja(da daVar, PlayerFragment playerFragment, C2714o oVar) {
            this(playerFragment);
        }

        private com.soundcloud.android.playback.ui.Aa b() {
            com.soundcloud.android.playback.ui.Aa aa = new com.soundcloud.android.playback.ui.Aa((C4412qb) da.this.Ui.get(), (C3814lca) da.this.Ed.get(), (C5327TLa) da.this.fa.get(), da.this.m(), da.this.Hg(), (Yaa) da.this.Nh.get(), (C4655rja) da.this.lk.get(), da.this.xd(), da.this.i(), da.this.j(), da.this.ia());
            return aa;
        }

        private com.soundcloud.android.playback.ui.La c() {
            com.soundcloud.android.playback.ui.La la = new com.soundcloud.android.playback.ui.La((com.soundcloud.android.image.N) da.this.Qd.get(), da.this.Ce(), o(), b(), da.this.vd(), com.soundcloud.android.G.b(), da.this.oa(), da.this.m(), h(), (C2630ub) da.this.bi.get());
            return la;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.playback.ui.view.c e() {
            return new com.soundcloud.android.playback.ui.view.c(n(), da.this.zd());
        }

        private Object f() {
            return com.soundcloud.android.playback.ui._a.a(da.this.tl);
        }

        private com.soundcloud.android.ads.Lb.a g() {
            return new com.soundcloud.android.ads.Lb.a((C5327TLa) da.this.fa.get(), (C6699jHa) da.this.Ja.get());
        }

        private a h() {
            return new a((C6699jHa) da.this.Ja.get());
        }

        private a i() {
            return new a((C5327TLa) da.this.fa.get(), (com.soundcloud.android.image.N) da.this.Qd.get(), da.this.Ce(), com.soundcloud.android.X.b());
        }

        private Iea j() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private a k() {
            return new a((C5327TLa) da.this.fa.get(), (com.soundcloud.android.image.N) da.this.Qd.get(), com.soundcloud.android.X.b());
        }

        private C4492tb.a l() {
            return new C4492tb.a(da.this.ge(), da.this.cm);
        }

        private com.soundcloud.android.comments.Ua m() {
            return new com.soundcloud.android.comments.Ua(com.soundcloud.android.G.b(), (mb) da.this.yl.get(), da.this.pb());
        }

        private com.soundcloud.android.playback.ui.view.i n() {
            return new com.soundcloud.android.playback.ui.view.i((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private com.soundcloud.android.playback.ui.Ab.a o() {
            return Bb.a(this.a);
        }

        private com.soundcloud.android.playback.ui.Eb p() {
            return com.soundcloud.android.playback.ui.Fb.a(q(), da.this.ib(), (C2732f) da.this.Ah.get(), (C5327TLa) da.this.fa.get());
        }

        private Gb q() {
            return com.soundcloud.android.playback.ui.Hb.a(da.this.Wb());
        }

        private PlayerPagerPresenter r() {
            return com.soundcloud.android.playback.ui.Kb.a((C3814lca) da.this.Ed.get(), (C4416rb) da.this.og.get(), da.this.Vf(), da.this.kf(), x(), da.this.ib(), c(), y(), (C2732f) da.this.Ah.get(), da.this.m(), (ke) da.this.ki.get(), p(), (C5327TLa) da.this.fa.get(), da.this.xd(), m(), (com.soundcloud.android.comments.Ea) da.this._h.get(), da.this.md(), (C3989m) da.this.id.get(), da.this.zd(), (C6699jHa) da.this.Ja.get());
        }

        private com.soundcloud.android.playback.ui.Lb s() {
            return Mb.a((C3814lca) da.this.Ed.get(), da.this.od(), da.this.m());
        }

        private Object t() {
            return Ob.a(r(), (C5327TLa) da.this.fa.get(), da.this.ia(), (C3814lca) da.this.Ed.get(), (C4412qb) da.this.Ui.get(), s(), da.this.m(), new C4395sa(), da.this.md(), com.soundcloud.android.ba.a(da.this.c), (ba) da.this.Kl.get());
        }

        private c u() {
            return new c(new a());
        }

        private Object v() {
            return ec.a((C4412qb) da.this.Ui.get(), (C3814lca) da.this.Ed.get(), (C5327TLa) da.this.fa.get(), da.this.ob(), da.this.Ca(), da.this.xd(), (C4655rja) da.this.lk.get(), da.this.ia());
        }

        private Object w() {
            return hc.a((C3814lca) da.this.Ed.get(), da.this.Ae(), new a(), da.this.Zf(), (C5327TLa) da.this.fa.get(), (Lca) da.this.qk.get(), da.this.Oc(), (C4655rja) da.this.lk.get(), da.this.ia(), (com.soundcloud.android.properties.a) da.this.La.get());
        }

        private Object x() {
            C5630bKa Va = da.this.Fg();
            C2436_U Sb = da.this.Ja();
            Object v = v();
            C4454gb Wa = da.this.lb();
            Iea j = j();
            com.soundcloud.android.player.ui.waveform.h.b z = z();
            C4492tb.a l = l();
            com.soundcloud.android.playback.ui.Ab.a o = o();
            Object w = w();
            com.soundcloud.android.playback.ui.view.c e = e();
            b a2 = a();
            Object f = f();
            com.soundcloud.android.playback.ui.Va va = r1;
            com.soundcloud.android.playback.ui.Va va2 = new com.soundcloud.android.playback.ui.Va();
            return nc.a(Va, Sb, v, Wa, j, z, l, o, w, e, a2, f, va, (C2732f) da.this.Ah.get(), d(), da.this.Ce(), da.this.dm.get(), da.this.xd(), Vc.a(), da.this.bg(), (C2526g) da.this.Fd.get(), da.this.Cg(), (C4412qb) da.this.Ui.get(), (com.soundcloud.android.properties.a) da.this.La.get());
        }

        private Object y() {
            return sc.a((com.soundcloud.android.image.N) da.this.Qd.get(), b(), o(), (C6699jHa) da.this.Ja.get(), da.this.Ce(), da.this.oa());
        }

        private com.soundcloud.android.player.ui.waveform.h.b z() {
            return new com.soundcloud.android.player.ui.waveform.h.b(u(), da.this.ge(), com.soundcloud.android.X.b(), C2936o.b());
        }

        private C2674ja(PlayerFragment playerFragment) {
            b(playerFragment);
        }

        private b a() {
            b bVar = new b(da.this.X(), (C6699jHa) da.this.Ja.get(), (C5327TLa) da.this.fa.get(), da.this.ia(), (C3814lca) da.this.Ed.get(), (C2526g) da.this.Fd.get(), i(), k(), g(), da.this.j(), da.this.i(), (Yaa) da.this.Nh.get());
            return bVar;
        }

        private void b(PlayerFragment playerFragment) {
            this.a = C4466kb.a(da.this.ja);
        }

        @CanIgnoreReturnValue
        private PlayerFragment c(PlayerFragment playerFragment) {
            C4507yb.a(playerFragment, t());
            return playerFragment;
        }

        public void a(PlayerFragment playerFragment) {
            c(playerFragment);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$k reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2675k implements C0127a {
        private C2675k() {
        }

        /* synthetic */ C2675k(da daVar, C2714o oVar) {
            this();
        }

        public C4245ia.a a(ConversionActivity conversionActivity) {
            C5023JMa.a(conversionActivity);
            return new C2677l(da.this, conversionActivity, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$ka reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2676ka implements C0087a {
        private C2676ka() {
        }

        /* synthetic */ C2676ka(da daVar, C2714o oVar) {
            this();
        }

        public C3621n.a a(PlaylistCollectionFragment playlistCollectionFragment) {
            C5023JMa.a(playlistCollectionFragment);
            return new C2678la(da.this, playlistCollectionFragment, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$l reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2677l implements C4245ia.a {
        private C7054oVa<_a> a;
        private C7054oVa<com.soundcloud.android.payments.Ba> b;
        private C7054oVa c;
        private C7054oVa d;
        private C7054oVa<com.soundcloud.android.payments.H> e;
        private C7054oVa<com.soundcloud.android.payments.Ga> f;

        /* synthetic */ C2677l(da daVar, ConversionActivity conversionActivity, C2714o oVar) {
            this(conversionActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(k());
        }

        private C2416ZT f() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU g() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker h() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object i() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O j() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea k() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A l() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C2466bM m() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta n() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta o() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), n(), C2947z.b(), i(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private com.soundcloud.android.accounts.O p() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private C2677l(ConversionActivity conversionActivity) {
            b(conversionActivity);
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        private void b(ConversionActivity conversionActivity) {
            this.a = ab.a(da.this.ab, com.soundcloud.android.G.a());
            this.b = com.soundcloud.android.payments.Ca.a(da.this.ja);
            this.c = com.soundcloud.android.payments.T.a(da.this.ja, this.b);
            this.d = com.soundcloud.android.payments.Q.a(this.a, this.c, da.this.ta, da.this.ua);
            this.e = com.soundcloud.android.payments.N.a(da.this.ja, this.b);
            this.f = com.soundcloud.android.payments.Ka.a(this.a, this.e, da.this.ta, da.this.ua, da.this.lk, C2936o.a());
        }

        @CanIgnoreReturnValue
        private ConversionActivity c(ConversionActivity conversionActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) conversionActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) conversionActivity, f());
            com.soundcloud.android.main.ga.a((RootActivity) conversionActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) conversionActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) conversionActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) conversionActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) conversionActivity, j());
            com.soundcloud.android.main.ga.a((RootActivity) conversionActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) conversionActivity, m());
            com.soundcloud.android.main.ga.b(conversionActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) conversionActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) conversionActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) conversionActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) conversionActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) conversionActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) conversionActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) conversionActivity, p());
            com.soundcloud.android.main.S.a((LoggedInActivity) conversionActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) conversionActivity, l());
            com.soundcloud.android.main.S.a((LoggedInActivity) conversionActivity, o());
            com.soundcloud.android.main.S.a((LoggedInActivity) conversionActivity, c());
            com.soundcloud.android.payments.D.a(conversionActivity, C4930GMa.a(this.d));
            com.soundcloud.android.payments.D.b(conversionActivity, C4930GMa.a(this.f));
            com.soundcloud.android.payments.D.a(conversionActivity, (com.soundcloud.android.properties.a) da.this.La.get());
            com.soundcloud.android.payments.D.a(conversionActivity, (C3701c) da.this.ja());
            return conversionActivity;
        }

        public void a(ConversionActivity conversionActivity) {
            c(conversionActivity);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$la reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2678la implements C3621n.a {
        private C7054oVa<com.soundcloud.android.features.library.playlists.D> a;

        /* synthetic */ C2678la(da daVar, PlaylistCollectionFragment playlistCollectionFragment, C2714o oVar) {
            this(playlistCollectionFragment);
        }

        private com.soundcloud.android.features.library.playlists.q b() {
            return new com.soundcloud.android.features.library.playlists.q((com.soundcloud.android.image.N) da.this.Qd.get(), da.this.Ja(), da.this.Ed(), da.this.Dd());
        }

        private com.soundcloud.android.features.library.playlists.G c() {
            return new com.soundcloud.android.features.library.playlists.G(da.this.Ce());
        }

        private com.soundcloud.android.features.library.playlists.J d() {
            return new com.soundcloud.android.features.library.playlists.J(da.this.Ja(), da.this.N());
        }

        private C2678la(PlaylistCollectionFragment playlistCollectionFragment) {
            b(playlistCollectionFragment);
        }

        private C3626c a() {
            return C3627d.a(c(), com.soundcloud.android.features.library.playlists.P.a(), new C3624a(), b());
        }

        private void b(PlaylistCollectionFragment playlistCollectionFragment) {
            this.a = com.soundcloud.android.features.library.playlists.E.a(da.this.ql, da.this.ug, da.this.lk, da.this.ta, C3637n.a(), C2936o.a(), com.soundcloud.android.X.a());
        }

        @CanIgnoreReturnValue
        private PlaylistCollectionFragment c(PlaylistCollectionFragment playlistCollectionFragment) {
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) playlistCollectionFragment, (C5047KEa) da.this.mk.get());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) playlistCollectionFragment, da.this.Ia());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) playlistCollectionFragment, (C4655rja) da.this.lk.get());
            C3634k.a(playlistCollectionFragment, C4930GMa.a(this.a));
            C3634k.a(playlistCollectionFragment, a());
            C3634k.a(playlistCollectionFragment, d());
            return playlistCollectionFragment;
        }

        public void a(PlaylistCollectionFragment playlistCollectionFragment) {
            c(playlistCollectionFragment);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$m reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2679m implements C0103a {
        private C2679m() {
        }

        /* synthetic */ C2679m(da daVar, C2714o oVar) {
            this();
        }

        public com.soundcloud.android.listeners.dev.Q.a a(DevDrawerFragment devDrawerFragment) {
            C5023JMa.a(devDrawerFragment);
            return new C2681n(da.this, devDrawerFragment, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$ma reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2680ma implements C0144a {
        private C2680ma() {
        }

        /* synthetic */ C2680ma(da daVar, C2714o oVar) {
            this();
        }

        public a a(PlaylistDetailFragment playlistDetailFragment) {
            C5023JMa.a(playlistDetailFragment);
            return new C2682na(da.this, playlistDetailFragment, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$n reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2681n implements com.soundcloud.android.listeners.dev.Q.a {
        /* synthetic */ C2681n(da daVar, DevDrawerFragment devDrawerFragment, C2714o oVar) {
            this(devDrawerFragment);
        }

        private C4003b b() {
            return new C4003b(da.this.Ce(), (C2137KU) da.this.Ca.get());
        }

        private com.soundcloud.android.listeners.dev.eventlogger.h c() {
            return new com.soundcloud.android.listeners.dev.eventlogger.h(da.this.X(), da.this.nc(), da.this.Fa());
        }

        private C2681n(DevDrawerFragment devDrawerFragment) {
        }

        private C3194pK a() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        @CanIgnoreReturnValue
        private DevDrawerFragment b(DevDrawerFragment devDrawerFragment) {
            com.soundcloud.android.listeners.dev.M.a(devDrawerFragment, (C2526g) da.this.Fd.get());
            com.soundcloud.android.listeners.dev.M.a(devDrawerFragment, b());
            com.soundcloud.android.listeners.dev.M.a(devDrawerFragment, da.this.C());
            com.soundcloud.android.listeners.dev.M.a(devDrawerFragment, (C2288ST) da.this.pf.get());
            com.soundcloud.android.listeners.dev.M.a(devDrawerFragment, da.this.hc());
            com.soundcloud.android.listeners.dev.M.a(devDrawerFragment, (C4655rja) da.this.lk.get());
            com.soundcloud.android.listeners.dev.M.a(devDrawerFragment, da.this.R());
            com.soundcloud.android.listeners.dev.M.a(devDrawerFragment, da.this.I());
            com.soundcloud.android.listeners.dev.M.a(devDrawerFragment, (C5327TLa) da.this.fa.get());
            com.soundcloud.android.listeners.dev.M.a(devDrawerFragment, da.this.ib());
            com.soundcloud.android.listeners.dev.M.a(devDrawerFragment, c());
            com.soundcloud.android.listeners.dev.M.a(devDrawerFragment, a());
            com.soundcloud.android.listeners.dev.M.a(devDrawerFragment, (C7250rKa) da.this.me());
            return devDrawerFragment;
        }

        public void a(DevDrawerFragment devDrawerFragment) {
            b(devDrawerFragment);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$na reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2682na implements a {
        private C7054oVa<C5294SIa> a;
        private C7054oVa<C5745p> b;
        private C7054oVa<Iea> c;
        private C7054oVa d;

        /* synthetic */ C2682na(da daVar, PlaylistDetailFragment playlistDetailFragment, C2714o oVar) {
            this(playlistDetailFragment);
        }

        private C5753y b() {
            return C5754z.a(a());
        }

        private Object c() {
            return com.soundcloud.android.playlist.view.B.a(da.this.D());
        }

        private com.soundcloud.android.playlist.view.G d() {
            return new com.soundcloud.android.playlist.view.G(new com.soundcloud.android.playlist.view.I(), h(), i(), b());
        }

        private Object e() {
            return com.soundcloud.android.playlist.view.O.a(da.this.ja);
        }

        private com.soundcloud.android.playlist.view.Q f() {
            return new com.soundcloud.android.playlist.view.Q(this.b, this.d);
        }

        private Object g() {
            return com.soundcloud.android.playlist.view.W.a(da.this.da);
        }

        private com.soundcloud.android.playlist.view.aa h() {
            return com.soundcloud.android.playlist.view.ba.a(da.this.Uf());
        }

        private com.soundcloud.android.playlist.view.ca i() {
            return new com.soundcloud.android.playlist.view.ca(da.this.Ja());
        }

        private C2682na(PlaylistDetailFragment playlistDetailFragment) {
            b(playlistDetailFragment);
        }

        private C5741l a() {
            return new C5741l(this.a, da.this.fh, da.this.ta, da.this.lk);
        }

        private void b(PlaylistDetailFragment playlistDetailFragment) {
            this.a = C5353UIa.a(da.this.Qd);
            this.b = C5746q.a(da.this.Qd);
            this.c = Jea.a(da.this.rd, da.this.ja, da.this.ta);
            this.d = com.soundcloud.android.playlist.view.Z.a(da.this.da, C4803CJa.a(), da.this.Yl, this.c, da.this.Pk, da.this.Ga);
        }

        @CanIgnoreReturnValue
        private PlaylistDetailFragment c(PlaylistDetailFragment playlistDetailFragment) {
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) playlistDetailFragment, (C5047KEa) da.this.mk.get());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) playlistDetailFragment, da.this.Ia());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) playlistDetailFragment, (C4655rja) da.this.lk.get());
            C5750v.a(playlistDetailFragment, da.this.b());
            C5750v.c(playlistDetailFragment, g());
            C5750v.a(playlistDetailFragment, d());
            C5750v.a(playlistDetailFragment, (Lca) da.this.qk.get());
            C5750v.a(playlistDetailFragment, f());
            C5750v.a(playlistDetailFragment, e());
            C5750v.a(playlistDetailFragment, (C5052KJa) da.this.Ki.get());
            C5750v.a(playlistDetailFragment, (C4655rja) da.this.lk.get());
            C5750v.b(playlistDetailFragment, c());
            C5750v.a(playlistDetailFragment, new C5751w());
            C5750v.a(playlistDetailFragment, new C7592wHa());
            return playlistDetailFragment;
        }

        public void a(PlaylistDetailFragment playlistDetailFragment) {
            c(playlistDetailFragment);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$o reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2683o implements C0102a {
        private C2683o() {
        }

        /* synthetic */ C2683o(da daVar, C2714o oVar) {
            this();
        }

        public com.soundcloud.android.listeners.dev.P.a a(DevEventLoggerMonitorActivity devEventLoggerMonitorActivity) {
            C5023JMa.a(devEventLoggerMonitorActivity);
            return new C2685p(da.this, devEventLoggerMonitorActivity, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$oa reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2684oa implements C0115a {
        private C2684oa() {
        }

        /* synthetic */ C2684oa(da daVar, C2714o oVar) {
            this();
        }

        public C4037p.a a(PrestitialActivity prestitialActivity) {
            C5023JMa.a(prestitialActivity);
            return new C2686pa(da.this, prestitialActivity, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$p reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2685p implements com.soundcloud.android.listeners.dev.P.a {
        /* synthetic */ C2685p(da daVar, DevEventLoggerMonitorActivity devEventLoggerMonitorActivity, C2714o oVar) {
            this(devEventLoggerMonitorActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(l());
        }

        private C2416ZT f() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private Object g() {
            return com.soundcloud.android.listeners.dev.eventlogger.l.a(da.this.We(), (C1953BN) da.this.Sj.get(), com.soundcloud.android.listeners.dev.eventlogger.n.a(), C2936o.b());
        }

        private C3079jU h() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker i() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object j() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O k() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea l() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A m() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C2466bM n() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta o() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta p() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), o(), C2947z.b(), j(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private com.soundcloud.android.accounts.O q() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private C2685p(DevEventLoggerMonitorActivity devEventLoggerMonitorActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private DevEventLoggerMonitorActivity b(DevEventLoggerMonitorActivity devEventLoggerMonitorActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) devEventLoggerMonitorActivity, i());
            com.soundcloud.android.main.ga.a((RootActivity) devEventLoggerMonitorActivity, f());
            com.soundcloud.android.main.ga.a((RootActivity) devEventLoggerMonitorActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) devEventLoggerMonitorActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) devEventLoggerMonitorActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) devEventLoggerMonitorActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) devEventLoggerMonitorActivity, k());
            com.soundcloud.android.main.ga.a((RootActivity) devEventLoggerMonitorActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) devEventLoggerMonitorActivity, n());
            com.soundcloud.android.main.ga.b(devEventLoggerMonitorActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) devEventLoggerMonitorActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) devEventLoggerMonitorActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) devEventLoggerMonitorActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) devEventLoggerMonitorActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) devEventLoggerMonitorActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) devEventLoggerMonitorActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) devEventLoggerMonitorActivity, q());
            com.soundcloud.android.main.S.a((LoggedInActivity) devEventLoggerMonitorActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) devEventLoggerMonitorActivity, m());
            com.soundcloud.android.main.S.a((LoggedInActivity) devEventLoggerMonitorActivity, p());
            com.soundcloud.android.main.S.a((LoggedInActivity) devEventLoggerMonitorActivity, c());
            com.soundcloud.android.listeners.dev.eventlogger.d.a(devEventLoggerMonitorActivity, da.this.D());
            com.soundcloud.android.listeners.dev.eventlogger.d.a(devEventLoggerMonitorActivity, g());
            return devEventLoggerMonitorActivity;
        }

        public void a(DevEventLoggerMonitorActivity devEventLoggerMonitorActivity) {
            b(devEventLoggerMonitorActivity);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$pa reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2686pa implements C4037p.a {
        private C7054oVa a;
        private C7054oVa b;
        private C7054oVa c;

        /* synthetic */ C2686pa(da daVar, PrestitialActivity prestitialActivity, C2714o oVar) {
            this(prestitialActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(k());
        }

        private C2416ZT f() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU g() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker h() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object i() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O j() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea k() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A l() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C2466bM m() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta n() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta o() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), n(), C2947z.b(), i(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private Object p() {
            return Uc.a(this.a);
        }

        private Object q() {
            return com.soundcloud.android.ads.Yc.a((PrestitialAdsController) da.this.Fl.get(), da.this.j(), p(), C4930GMa.a(this.b), (Yaa) da.this.Nh.get(), C4930GMa.a(this.c), (ke) da.this.ki.get(), da.this.Hg(), da.this.Gk.get(), (C4655rja) da.this.lk.get(), (C5327TLa) da.this.fa.get(), da.this.ia());
        }

        private com.soundcloud.android.accounts.O r() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private C2686pa(PrestitialActivity prestitialActivity) {
            b(prestitialActivity);
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        private void b(PrestitialActivity prestitialActivity) {
            this.a = cd.a(da.this.Qd, da.this.ja);
            this.b = nd.a(da.this.Qd);
            this.c = ed.a(da.this.ja, da.this.Fk);
        }

        @CanIgnoreReturnValue
        private PrestitialActivity c(PrestitialActivity prestitialActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) prestitialActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) prestitialActivity, f());
            com.soundcloud.android.main.ga.a((RootActivity) prestitialActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) prestitialActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) prestitialActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) prestitialActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) prestitialActivity, j());
            com.soundcloud.android.main.ga.a((RootActivity) prestitialActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) prestitialActivity, m());
            com.soundcloud.android.main.ga.b(prestitialActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) prestitialActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) prestitialActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) prestitialActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) prestitialActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) prestitialActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) prestitialActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) prestitialActivity, r());
            com.soundcloud.android.main.S.a((LoggedInActivity) prestitialActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) prestitialActivity, l());
            com.soundcloud.android.main.S.a((LoggedInActivity) prestitialActivity, o());
            com.soundcloud.android.main.S.a((LoggedInActivity) prestitialActivity, c());
            Qc.a(prestitialActivity, q());
            return prestitialActivity;
        }

        public void a(PrestitialActivity prestitialActivity) {
            c(prestitialActivity);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$q reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2687q implements C0101a {
        private C2687q() {
        }

        /* synthetic */ C2687q(da daVar, C2714o oVar) {
            this();
        }

        public com.soundcloud.android.listeners.dev.O.a a(DevEventLoggerMonitorReceiver devEventLoggerMonitorReceiver) {
            C5023JMa.a(devEventLoggerMonitorReceiver);
            return new r(da.this, devEventLoggerMonitorReceiver, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$qa reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2688qa implements C0129a {
        private C2688qa() {
        }

        /* synthetic */ C2688qa(da daVar, C2714o oVar) {
            this();
        }

        public C4249ka.a a(ProductChoiceActivity productChoiceActivity) {
            C5023JMa.a(productChoiceActivity);
            return new C2689ra(da.this, productChoiceActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class r implements com.soundcloud.android.listeners.dev.O.a {
        /* synthetic */ r(da daVar, DevEventLoggerMonitorReceiver devEventLoggerMonitorReceiver, C2714o oVar) {
            this(devEventLoggerMonitorReceiver);
        }

        @CanIgnoreReturnValue
        private DevEventLoggerMonitorReceiver b(DevEventLoggerMonitorReceiver devEventLoggerMonitorReceiver) {
            com.soundcloud.android.listeners.dev.T.a(devEventLoggerMonitorReceiver, a());
            return devEventLoggerMonitorReceiver;
        }

        private r(DevEventLoggerMonitorReceiver devEventLoggerMonitorReceiver) {
        }

        private com.soundcloud.android.listeners.dev.eventlogger.h a() {
            return new com.soundcloud.android.listeners.dev.eventlogger.h(da.this.X(), da.this.nc(), da.this.Fa());
        }

        public void a(DevEventLoggerMonitorReceiver devEventLoggerMonitorReceiver) {
            b(devEventLoggerMonitorReceiver);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$ra reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2689ra implements C4249ka.a {
        private C7054oVa<com.soundcloud.android.payments.Ba> a;
        private C7054oVa<C4255na> b;
        private C7054oVa c;
        private C7054oVa<C4274xa> d;

        /* synthetic */ C2689ra(da daVar, ProductChoiceActivity productChoiceActivity, C2714o oVar) {
            this(productChoiceActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(k());
        }

        private C2416ZT f() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU g() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker h() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object i() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O j() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea k() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A l() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C2466bM m() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta n() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta o() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), n(), C2947z.b(), i(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private Object p() {
            return C4266ta.a(s(), (C4655rja) da.this.lk.get(), (C2526g) da.this.Fd.get(), C4930GMa.a(this.c), C4930GMa.a(this.d), q(), da.this.ia());
        }

        private com.soundcloud.android.payments.Ba q() {
            return com.soundcloud.android.payments.Ca.a(da.this.Ce());
        }

        private com.soundcloud.android.accounts.O r() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private _a s() {
            return new _a(da.this.r(), com.soundcloud.android.G.b());
        }

        private C2689ra(ProductChoiceActivity productChoiceActivity) {
            b(productChoiceActivity);
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        private void b(ProductChoiceActivity productChoiceActivity) {
            this.a = com.soundcloud.android.payments.Ca.a(da.this.ja);
            this.b = C4257oa.a(this.a);
            this.c = C4261qa.a(this.b, this.a);
            this.d = C4276ya.a(this.a);
        }

        @CanIgnoreReturnValue
        private ProductChoiceActivity c(ProductChoiceActivity productChoiceActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) productChoiceActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) productChoiceActivity, f());
            com.soundcloud.android.main.ga.a((RootActivity) productChoiceActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) productChoiceActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) productChoiceActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) productChoiceActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) productChoiceActivity, j());
            com.soundcloud.android.main.ga.a((RootActivity) productChoiceActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) productChoiceActivity, m());
            com.soundcloud.android.main.ga.b(productChoiceActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) productChoiceActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) productChoiceActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) productChoiceActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) productChoiceActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) productChoiceActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) productChoiceActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) productChoiceActivity, r());
            com.soundcloud.android.main.S.a((LoggedInActivity) productChoiceActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) productChoiceActivity, l());
            com.soundcloud.android.main.S.a((LoggedInActivity) productChoiceActivity, o());
            com.soundcloud.android.main.S.a((LoggedInActivity) productChoiceActivity, c());
            C4253ma.a(productChoiceActivity, p());
            C4253ma.a(productChoiceActivity, (C3701c) da.this.ja());
            return productChoiceActivity;
        }

        public void a(ProductChoiceActivity productChoiceActivity) {
            c(productChoiceActivity);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$s reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2690s implements C0080a {
        private C2690s() {
        }

        /* synthetic */ C2690s(da daVar, C2714o oVar) {
            this();
        }

        public C3549g.a a(DiscoveryFragment discoveryFragment) {
            C5023JMa.a(discoveryFragment);
            return new C2692t(da.this, discoveryFragment, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$sa reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2691sa implements C0116a {
        private C2691sa() {
        }

        /* synthetic */ C2691sa(da daVar, C2714o oVar) {
            this();
        }

        public C4038q.a a(RecordActivity recordActivity) {
            C5023JMa.a(recordActivity);
            return new C2693ta(da.this, recordActivity, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$t reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2692t implements C3549g.a {
        /* synthetic */ C2692t(da daVar, DiscoveryFragment discoveryFragment, C2714o oVar) {
            this(discoveryFragment);
        }

        private com.soundcloud.android.features.discovery.J b() {
            return new com.soundcloud.android.features.discovery.J(d());
        }

        private com.soundcloud.android.features.discovery.O c() {
            return new com.soundcloud.android.features.discovery.O((com.soundcloud.android.image.N) da.this.Qd.get(), da.this.Ce());
        }

        private a d() {
            return new a(e());
        }

        private a e() {
            return new a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private com.soundcloud.android.features.discovery.T f() {
            return new com.soundcloud.android.features.discovery.T((com.soundcloud.android.image.N) da.this.Qd.get(), da.this.Ce());
        }

        private C2692t(DiscoveryFragment discoveryFragment) {
        }

        private C3543a a() {
            C3543a aVar = new C3543a(f(), b(), c(), new Cca(), new C3914yY());
            return aVar;
        }

        @CanIgnoreReturnValue
        private DiscoveryFragment b(DiscoveryFragment discoveryFragment) {
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) discoveryFragment, (C5047KEa) da.this.mk.get());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) discoveryFragment, da.this.Ia());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) discoveryFragment, (C4655rja) da.this.lk.get());
            C3547e.a(discoveryFragment, C4930GMa.a(da.this.Zl));
            C3547e.a(discoveryFragment, a());
            C3547e.a(discoveryFragment, (C5052KJa) da.this.Ki.get());
            C3547e.a(discoveryFragment, ob.a());
            C3547e.a(discoveryFragment, (C4655rja) da.this.lk.get());
            C3547e.a(discoveryFragment, da.this.Nf());
            return discoveryFragment;
        }

        public void a(DiscoveryFragment discoveryFragment) {
            b(discoveryFragment);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$ta reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2693ta implements C4038q.a {
        /* synthetic */ C2693ta(da daVar, RecordActivity recordActivity, C2714o oVar) {
            this(recordActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(k());
        }

        private C2416ZT f() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU g() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker h() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object i() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O j() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea k() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A l() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C2466bM m() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta n() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta o() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), n(), C2947z.b(), i(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private com.soundcloud.android.accounts.O p() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private C2693ta(RecordActivity recordActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private RecordActivity b(RecordActivity recordActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) recordActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) recordActivity, f());
            com.soundcloud.android.main.ga.a((RootActivity) recordActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) recordActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) recordActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) recordActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) recordActivity, j());
            com.soundcloud.android.main.ga.a((RootActivity) recordActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) recordActivity, m());
            com.soundcloud.android.main.ga.b(recordActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) recordActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) recordActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordActivity, p());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordActivity, l());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordActivity, o());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordActivity, c());
            com.soundcloud.android.creators.record.c.a(recordActivity, new com.soundcloud.android.main.F());
            com.soundcloud.android.creators.record.c.a(recordActivity, da.this.D());
            com.soundcloud.android.creators.record.c.a(recordActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.creators.record.c.a(recordActivity, (C2350WH) da.this.dk.get());
            com.soundcloud.android.creators.record.c.a(recordActivity, da.this.Ye());
            com.soundcloud.android.creators.record.c.a(recordActivity, (C3700b) da.this.ia());
            com.soundcloud.android.creators.record.c.a(recordActivity, da.this.hc());
            com.soundcloud.android.creators.record.c.a(recordActivity, (com.soundcloud.android.properties.a) da.this.La.get());
            return recordActivity;
        }

        public void a(RecordActivity recordActivity) {
            b(recordActivity);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$u reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2694u implements C0084a {
        private C2694u() {
        }

        /* synthetic */ C2694u(da daVar, C2714o oVar) {
            this();
        }

        public C3585k.a a(DownloadsFragment downloadsFragment) {
            C5023JMa.a(downloadsFragment);
            return new C2696v(da.this, downloadsFragment, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$ua reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2695ua implements C0063a {
        private C2695ua() {
        }

        /* synthetic */ C2695ua(da daVar, C2714o oVar) {
            this();
        }

        public a a(RecordAppWidgetProvider recordAppWidgetProvider) {
            C5023JMa.a(recordAppWidgetProvider);
            return new C2697va(da.this, recordAppWidgetProvider, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$v reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2696v implements C3585k.a {
        private C7054oVa<C3577k> a;
        private C7054oVa<com.soundcloud.android.features.library.downloads.E> b;

        /* synthetic */ C2696v(da daVar, DownloadsFragment downloadsFragment, C2714o oVar) {
            this(downloadsFragment);
        }

        private com.soundcloud.android.features.library.downloads.w b() {
            return new com.soundcloud.android.features.library.downloads.w((com.soundcloud.android.image.N) da.this.Qd.get(), da.this.Ed(), da.this.Dc(), (C6834lGa) da.this.Ga.get());
        }

        private com.soundcloud.android.features.library.downloads.I c() {
            return new com.soundcloud.android.features.library.downloads.I(da.this.Tf(), new com.soundcloud.android.tracks.Ea.a(), da.this.Uf());
        }

        private C2696v(DownloadsFragment downloadsFragment) {
            b(downloadsFragment);
        }

        private C3567a a() {
            return new C3567a(b(), c());
        }

        private void b(DownloadsFragment downloadsFragment) {
            this.a = C3578l.a(da.this.Lc, da.this.Nb, da.this.ke, da.this.uk, com.soundcloud.android.G.a());
            this.b = com.soundcloud.android.features.library.downloads.F.a(this.a, C2936o.a(), da.this.lk, da.this.gk, da.this.ta);
        }

        @CanIgnoreReturnValue
        private DownloadsFragment c(DownloadsFragment downloadsFragment) {
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) downloadsFragment, (C5047KEa) da.this.mk.get());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) downloadsFragment, da.this.Ia());
            com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) downloadsFragment, (C4655rja) da.this.lk.get());
            com.soundcloud.android.features.library.downloads.r.a(downloadsFragment, a());
            com.soundcloud.android.features.library.downloads.r.a(downloadsFragment, C4930GMa.a(this.b));
            com.soundcloud.android.features.library.downloads.r.a(downloadsFragment, new com.soundcloud.android.features.library.downloads.n());
            return downloadsFragment;
        }

        public void a(DownloadsFragment downloadsFragment) {
            c(downloadsFragment);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$va reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2697va implements a {
        /* synthetic */ C2697va(da daVar, RecordAppWidgetProvider recordAppWidgetProvider, C2714o oVar) {
            this(recordAppWidgetProvider);
        }

        @CanIgnoreReturnValue
        private RecordAppWidgetProvider b(RecordAppWidgetProvider recordAppWidgetProvider) {
            com.soundcloud.android.features.record.H.a(recordAppWidgetProvider, C3042hV.b());
            return recordAppWidgetProvider;
        }

        private C2697va(RecordAppWidgetProvider recordAppWidgetProvider) {
        }

        public void a(RecordAppWidgetProvider recordAppWidgetProvider) {
            b(recordAppWidgetProvider);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$w reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private static final class C2698w implements ja.a {
        private C2698w() {
        }

        public ja a(Application application) {
            C5023JMa.a(application);
            da daVar = new da(new C2933l(), new com.soundcloud.android.accounts.v(), new C2264RO(), new C2016EQ(), new C3354xL(), new C2165MK(), new C3339wQ(), application, null);
            return daVar;
        }

        /* synthetic */ C2698w(C2714o oVar) {
            this();
        }
    }

    /* renamed from: com.soundcloud.android.app.da$wa reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2699wa implements C0064a {
        private C2699wa() {
        }

        /* synthetic */ C2699wa(da daVar, C2714o oVar) {
            this();
        }

        public a a(RecordFragment recordFragment) {
            C5023JMa.a(recordFragment);
            return new C2701xa(da.this, recordFragment, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$x reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2700x implements C0077a {
        private C2700x() {
        }

        /* synthetic */ C2700x(da daVar, C2714o oVar) {
            this();
        }

        public com.soundcloud.android.fcm.p.a a(FcmRegistrationService fcmRegistrationService) {
            C5023JMa.a(fcmRegistrationService);
            return new C2702y(da.this, fcmRegistrationService, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$xa reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2701xa implements a {
        /* synthetic */ C2701xa(da daVar, RecordFragment recordFragment, C2714o oVar) {
            this(recordFragment);
        }

        private com.soundcloud.android.features.record.S b() {
            return com.soundcloud.android.features.record.T.a(c());
        }

        private com.soundcloud.android.features.record.U c() {
            return com.soundcloud.android.features.record.V.a((Ica) da.this.kb.get(), new C3669v());
        }

        private C2701xa(RecordFragment recordFragment) {
        }

        private com.soundcloud.android.features.record.N a() {
            return com.soundcloud.android.features.record.O.a(b(), new com.soundcloud.android.utilities.android.q(), da.this.Ye(), C3042hV.b());
        }

        @CanIgnoreReturnValue
        private RecordFragment b(RecordFragment recordFragment) {
            com.soundcloud.android.features.record.I.a(recordFragment, a());
            return recordFragment;
        }

        public void a(RecordFragment recordFragment) {
            b(recordFragment);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$y reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2702y implements com.soundcloud.android.fcm.p.a {
        /* synthetic */ C2702y(da daVar, FcmRegistrationService fcmRegistrationService, C2714o oVar) {
            this(fcmRegistrationService);
        }

        @CanIgnoreReturnValue
        private FcmRegistrationService b(FcmRegistrationService fcmRegistrationService) {
            com.soundcloud.android.fcm.v.a(fcmRegistrationService, a());
            return fcmRegistrationService;
        }

        private C2702y(FcmRegistrationService fcmRegistrationService) {
        }

        private com.soundcloud.android.fcm.r a() {
            com.soundcloud.android.fcm.r rVar = new com.soundcloud.android.fcm.r((C3856qea) da.this.Eg.get(), da.this.q(), new com.soundcloud.android.fcm.w(), da.this.xj, (Ica) da.this.kb.get(), da.this.le(), com.soundcloud.android.X.b(), com.soundcloud.android.G.b());
            return rVar;
        }

        public void a(FcmRegistrationService fcmRegistrationService) {
            b(fcmRegistrationService);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class ya implements C0117a {
        private ya() {
        }

        /* synthetic */ ya(da daVar, C2714o oVar) {
            this();
        }

        public com.soundcloud.android.main.r.a a(RecordPermissionsActivity recordPermissionsActivity) {
            C5023JMa.a(recordPermissionsActivity);
            return new za(da.this, recordPermissionsActivity, null);
        }
    }

    /* renamed from: com.soundcloud.android.app.da$z reason: case insensitive filesystem */
    /* compiled from: DaggerRealApplicationComponent */
    private final class C2703z implements C0106a {
        private C2703z() {
        }

        /* synthetic */ C2703z(da daVar, C2714o oVar) {
            this();
        }

        public C4028g.a a(FullScreenVideoActivity fullScreenVideoActivity) {
            C5023JMa.a(fullScreenVideoActivity);
            return new A(da.this, fullScreenVideoActivity, null);
        }
    }

    /* compiled from: DaggerRealApplicationComponent */
    private final class za implements com.soundcloud.android.main.r.a {
        /* synthetic */ za(da daVar, RecordPermissionsActivity recordPermissionsActivity, C2714o oVar) {
            this(recordPermissionsActivity);
        }

        private C3194pK b() {
            C3194pK pKVar = new C3194pK((com.soundcloud.android.image.N) da.this.Qd.get(), C1950BK.a(), C3373yK.a(), com.soundcloud.android.G.b(), C2936o.b());
            return pKVar;
        }

        private C3233rK c() {
            C3233rK rKVar = new C3233rK(da.this.Ub(), da.this.Ja(), b(), (com.soundcloud.android.properties.j) da.this.la.get(), C2947z.b());
            return rKVar;
        }

        private C2728b d() {
            return C2729c.a(com.soundcloud.android.cast.y.a());
        }

        private com.soundcloud.android.cast.i e() {
            return new com.soundcloud.android.cast.i(k());
        }

        private C2416ZT f() {
            return C2435_T.a((C2288ST) da.this.pf.get(), da.this.Nc(), da.this.hc(), (C5327TLa) da.this.fa.get());
        }

        private C3079jU g() {
            return new C3079jU((C5327TLa) da.this.fa.get());
        }

        private ForegroundTracker h() {
            return com.soundcloud.android.main.L.a(da.this.ia());
        }

        private Object i() {
            return C5602ata.a(da.this.Ce());
        }

        private com.soundcloud.android.image.O j() {
            return com.soundcloud.android.image.P.a((com.soundcloud.android.image.N) da.this.Qd.get());
        }

        private Iea k() {
            return new Iea(da.this.ib(), da.this.Ce(), da.this.ia());
        }

        private com.soundcloud.android.accounts.A l() {
            com.soundcloud.android.accounts.A a2 = new com.soundcloud.android.accounts.A((Ica) da.this.kb.get(), (C2526g) da.this.Fd.get(), (C4412qb) da.this.Ui.get(), com.soundcloud.android.G.b(), C2936o.b());
            return a2;
        }

        private C2466bM m() {
            return new C2466bM((C6699jHa) da.this.Ja.get());
        }

        private C6810kta n() {
            return new C6810kta(da.this.Tb());
        }

        private C7222qta o() {
            return C7291rta.a(da.this.Ja(), da.this.xc(), da.this.Nd(), n(), C2947z.b(), i(), (C6834lGa) da.this.Ga.get(), da.this.va());
        }

        private com.soundcloud.android.accounts.O p() {
            return new com.soundcloud.android.accounts.O((C5327TLa) da.this.fa.get());
        }

        private za(RecordPermissionsActivity recordPermissionsActivity) {
        }

        private com.soundcloud.android.main.D a() {
            return new com.soundcloud.android.main.D((C5327TLa) da.this.fa.get());
        }

        @CanIgnoreReturnValue
        private RecordPermissionsActivity b(RecordPermissionsActivity recordPermissionsActivity) {
            com.soundcloud.android.main.ga.a((RootActivity) recordPermissionsActivity, h());
            com.soundcloud.android.main.ga.a((RootActivity) recordPermissionsActivity, f());
            com.soundcloud.android.main.ga.a((RootActivity) recordPermissionsActivity, (C4655rja) da.this.lk.get());
            com.soundcloud.android.main.ga.a((RootActivity) recordPermissionsActivity, da.this.ic());
            com.soundcloud.android.main.ga.a((RootActivity) recordPermissionsActivity, a());
            com.soundcloud.android.main.ga.a((RootActivity) recordPermissionsActivity, new com.soundcloud.android.main.B());
            com.soundcloud.android.main.ga.a((RootActivity) recordPermissionsActivity, j());
            com.soundcloud.android.main.ga.a((RootActivity) recordPermissionsActivity, g());
            com.soundcloud.android.main.ga.a((RootActivity) recordPermissionsActivity, m());
            com.soundcloud.android.main.ga.b(recordPermissionsActivity, (ActivityLightCycle) da.this.sa.get());
            com.soundcloud.android.main.ga.a((RootActivity) recordPermissionsActivity, (ActivityLightCycle<AppCompatActivity>) da.this.ja());
            com.soundcloud.android.main.ga.a((RootActivity) recordPermissionsActivity, (C3700b) da.this.ia());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordPermissionsActivity, d());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordPermissionsActivity, da.this.n());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordPermissionsActivity, (C2732f) da.this.Ah.get());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordPermissionsActivity, e());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordPermissionsActivity, p());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordPermissionsActivity, new UnauthorisedRequestReceiver.a());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordPermissionsActivity, l());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordPermissionsActivity, o());
            com.soundcloud.android.main.S.a((LoggedInActivity) recordPermissionsActivity, c());
            com.soundcloud.android.creators.record.d.a(recordPermissionsActivity, (C4655rja) da.this.lk.get());
            return recordPermissionsActivity;
        }

        public void a(RecordPermissionsActivity recordPermissionsActivity) {
            b(recordPermissionsActivity);
        }
    }

    /* synthetic */ da(C2933l lVar, com.soundcloud.android.accounts.v vVar, C2264RO ro, C2016EQ eq, C3354xL xLVar, C2165MK mk2, C3339wQ wQVar, Application application, C2714o oVar) {
        this(lVar, vVar, ro, eq, xLVar, mk2, wQVar, application);
    }

    private Vd Ac() {
        return new Vd(Ja(), Qf(), (Se) this.sd.get());
    }

    private SharedPreferences Ad() {
        return com.soundcloud.android.settings.I.a(X());
    }

    /* access modifiers changed from: private */
    public C1997DR Ae() {
        return C2017ER.a(Be(), r(), com.soundcloud.android.G.b(), (C5327TLa) this.fa.get());
    }

    private Gd Af() {
        return Hd.a((C2526g) this.Fd.get(), t());
    }

    private he Ag() {
        he heVar = new he(vg(), (Ica) this.kb.get(), ia(), pd(), C2936o.b());
        return heVar;
    }

    private C3815lda Bc() {
        return Sd.a((C4180vb) this.fd.get());
    }

    private C5440XIa Bd() {
        C5440XIa xIa = new C5440XIa(Ce(), (C4655rja) this.lk.get(), (com.soundcloud.android.image.N) this.Qd.get(), Ed(), H(), (com.soundcloud.android.foundation.events.F) this.fh.get());
        return xIa;
    }

    private Object Be() {
        return C2191NR.a(he(), ie(), C2947z.b());
    }

    private ve Bf() {
        return C3019gQ.a(Cf(), ya());
    }

    private id Bg() {
        return jd.a(Ce(), (C5327TLa) this.fa.get(), this.Fk.get(), C2947z.b());
    }

    private Yd Cc() {
        return new Yd(X());
    }

    private C6668iqa Cd() {
        return new C6668iqa(Ja());
    }

    /* access modifiers changed from: private */
    public Resources Ce() {
        return com.soundcloud.android.O.a(this.a);
    }

    private we Cf() {
        return new we(C4930GMa.a(this.td), va());
    }

    /* access modifiers changed from: private */
    public Ona Cg() {
        return new Ona(C2947z.b());
    }

    /* access modifiers changed from: private */
    public C4070ce Dc() {
        return new C4070ce(Fc());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.collection.Ja Dd() {
        return com.soundcloud.android.collection.Ka.a(Dc(), (C6834lGa) this.Ga.get());
    }

    private aa De() {
        return C2857m.a((CollectionsDatabase) this.Kc.get());
    }

    private C4852Dwa Df() {
        return C4883Ewa.a(new C7847zva(), eg(), yg(), Ld());
    }

    private C5412WJa Dg() {
        return new C5412WJa(Eg(), new C6634iKa());
    }

    private SharedPreferences Ec() {
        return C5614aza.a(X());
    }

    /* access modifiers changed from: private */
    public C7287rra Ed() {
        return C7356sra.a(X(), (Fda) this.Fb.get(), ob(), Ae(), (Lca) this.qk.get(), (com.soundcloud.android.foundation.events.F) this.fh.get(), Ja(), xc(), (C4655rja) this.lk.get(), gd(), ia(), Fd(), (C2526g) this.Fd.get(), Da(), Fc());
    }

    private com.soundcloud.android.collections.data.ca Ee() {
        return C2858n.a((CollectionsDatabase) this.Kc.get());
    }

    private ca Ef() {
        return new ca((com.soundcloud.android.sync.T) this.Eb.get(), Ff(), (com.soundcloud.android.sync.oa) this.lb.get());
    }

    private C5470YJa Eg() {
        return new C5470YJa(C4930GMa.a(this.Rd));
    }

    /* access modifiers changed from: private */
    public C4088fe Fc() {
        return new C4088fe(Ec(), X());
    }

    private Object Fd() {
        return C7563vra.a(C4803CJa.a(), this.Fd, this.fh, this.ta, this.ua);
    }

    private SQLiteDatabase Fe() {
        return C5072Kya.a(X(), (C3469VY) ka(), (com.soundcloud.android.properties.j) this.la.get());
    }

    private la Ff() {
        return new la(Yb(), C2947z.b());
    }

    /* access modifiers changed from: private */
    public C5630bKa Fg() {
        C5630bKa bka = new C5630bKa(Dg(), Gg(), new C6634iKa(), La(), ka(), com.soundcloud.android.G.b());
        return bka;
    }

    private C4106ie Gc() {
        return C4112je.a((com.soundcloud.android.collections.data.K) De(), yc(), Qf(), Kd(), vb(), com.soundcloud.android.G.b());
    }

    private C5498ZIa Gd() {
        C5498ZIa zIa = new C5498ZIa(Ce(), (com.soundcloud.android.image.N) this.Qd.get(), S(), Ed(), ia(), (com.soundcloud.android.foundation.events.F) this.fh.get(), (C4655rja) this.lk.get());
        return zIa;
    }

    private com.soundcloud.android.search.history.A Ge() {
        return new com.soundcloud.android.search.history.A((l) this.di.get());
    }

    private C2472bS<Cd> Gf() {
        return C2491cS.b(this.Vf);
    }

    private C6838lKa Gg() {
        return new C6838lKa((C7321sMa) this.Wd.get(), ka());
    }

    private Object Hc() {
        return C4124le.a((C5327TLa) this.fa.get(), Gc());
    }

    private C4785Bra Hd() {
        C4785Bra bra = new C4785Bra((Fda) this.Fb.get(), Da(), (C3989m) this.id.get(), (C2210OR) this.ld.get(), Bc());
        return bra;
    }

    private Object He() {
        return C5924n.a(this.lk, com.soundcloud.android.deeplinks.g.a(), this.yk);
    }

    private C2472bS<C3117lU> Hf() {
        return C2491cS.b(this.Sf);
    }

    /* access modifiers changed from: private */
    public od Hg() {
        return new od((C4655rja) this.lk.get(), Ja(), ia());
    }

    private C4136ne Ic() {
        return new C4136ne(X(), aa(), Fc(), com.soundcloud.android.G.b());
    }

    private C4909Fra Id() {
        C4909Fra fra = new C4909Fra(com.soundcloud.android.G.b(), (com.soundcloud.android.sync.T) this.Eb.get(), (Fda) this.Fb.get(), this.Jc, l(), ze(), Aa(), xc(), vb(), (C5327TLa) this.fa.get(), Qd(), com.soundcloud.android.X.b(), Bc(), (Ica) this.kb.get(), Nb(), (C2746fa) this.ug.get());
        return fra;
    }

    private C5943z Ie() {
        return new C5943z(Gd());
    }

    private C3521l If() {
        return new C3521l(Jf(), Kf());
    }

    private re Ig() {
        return se.a((C3768fea) this.yb.get(), (Hda) this.Fb.get(), (C3800jea) this.pb.get());
    }

    private C4148pe Jc() {
        C4148pe peVar = new C4148pe((com.soundcloud.android.image.N) this.Qd.get(), Ce(), Dg(), Gg(), jc(), ka(), va());
        return peVar;
    }

    private Object Jd() {
        return C5668bsa.a(Qd(), com.soundcloud.android.G.b(), (com.soundcloud.android.sync.T) this.Eb.get(), (C5327TLa) this.fa.get(), xe());
    }

    private com.soundcloud.android.search.C Je() {
        return com.soundcloud.android.search.D.a(He(), (com.soundcloud.android.search.Ja) this.yk.get(), Ce(), kb(), ia(), (com.soundcloud.android.foundation.events.F) this.fh.get(), Ge());
    }

    private C3530v Jf() {
        return new C3530v((com.soundcloud.android.image.N) this.Qd.get(), Ue(), Ce());
    }

    private s Kc() {
        return new s(ia());
    }

    private C6332dsa Kd() {
        C6332dsa dsa = new C6332dsa(he(), ie(), new C5537_pa(), lf(), C2947z.b());
        return dsa;
    }

    private com.soundcloud.android.search.G Ke() {
        return new com.soundcloud.android.search.G(S());
    }

    private com.soundcloud.android.discovery.systemplaylist.Y Kf() {
        return new com.soundcloud.android.discovery.systemplaylist.Y(Uf());
    }

    private C6140x Lc() {
        return new C6140x(Hf(), Gf());
    }

    private Object Ld() {
        return C7090owa.a((com.soundcloud.android.image.N) this.Qd.get());
    }

    private com.soundcloud.android.search.K Le() {
        return new com.soundcloud.android.search.K(Me(), Ie(), Ne(), Ke());
    }

    private TelephonyManager Lf() {
        return com.soundcloud.android.S.a(this.a);
    }

    private C7155pua Mc() {
        return new C7155pua(Z(), ia(), (com.soundcloud.android.foundation.events.F) this.fh.get());
    }

    private C4972Hsa Md() {
        return C5003Isa.a((C2526g) this.Fd.get(), (com.soundcloud.android.upsell.a) this.yg.get());
    }

    private com.soundcloud.android.search.Ga Me() {
        return new com.soundcloud.android.search.Ga(Uf());
    }

    private C4896FJa Mf() {
        return new C4896FJa(G());
    }

    /* access modifiers changed from: private */
    public C3184oU Nc() {
        return C3203pU.a((C2343VT) this.wa.get());
    }

    /* access modifiers changed from: private */
    public C6334dta Nd() {
        return C6742jta.a(M(), fg(), xb(), com.soundcloud.android.G.b(), Od(), (C3700b) ia());
    }

    private com.soundcloud.android.search.Qa Ne() {
        return new com.soundcloud.android.search.Qa(mg());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.upsell.i Nf() {
        com.soundcloud.android.upsell.i iVar = new com.soundcloud.android.upsell.i(ia(), Ja(), X(), (C4655rja) this.lk.get(), (Aca) this.tg.get());
        return iVar;
    }

    /* access modifiers changed from: private */
    public C2014EO Oc() {
        return C3147nL.a((com.soundcloud.android.properties.a) this.La.get(), C4930GMa.a(this.ek), C4930GMa.a(C1954BO.a()));
    }

    private C6946mta Od() {
        return new C6946mta(he());
    }

    private Set<C3678e> Oe() {
        return C3366yD.a(ke(), je());
    }

    private C7575vxa Of() {
        return new C7575vxa(C4930GMa.a(this.Sa), La(), X());
    }

    private C3200pQ Pc() {
        return new C3200pQ((androidx.work.r) this.zl.get(), (com.soundcloud.android.properties.a) this.La.get());
    }

    private C5854u Pd() {
        return new C5854u(he());
    }

    private Set<Jca> Pe() {
        return C3366yD.a(fb(), o());
    }

    private C5629bJa Pf() {
        return C5697cJa.a(S(), Tf(), H(), (com.soundcloud.android.image.N) this.Qd.get(), (C4655rja) this.lk.get(), Ce(), (com.soundcloud.android.foundation.events.F) this.fh.get(), bg());
    }

    private C4711xla Qc() {
        return new C4711xla((C5327TLa) this.fa.get(), this.qh, md());
    }

    private C4942Gta Qd() {
        return new C4942Gta(he(), ie(), C2947z.b());
    }

    private C7230qxa Qe() {
        return new C7230qxa(La(), X());
    }

    private De Qf() {
        return new De(C2947z.b(), (Jd) this.Mc.get());
    }

    private com.squareup.picasso.E Rc() {
        return C3742x.a(this.a, C4930GMa.a(this.Sa), (C6246k) this.Kd.get());
    }

    private PowerManager Rd() {
        return com.soundcloud.android.N.a(this.a);
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.deeplinks.i Re() {
        return new com.soundcloud.android.deeplinks.i(X());
    }

    /* access modifiers changed from: private */
    public C6164fa Rf() {
        return new C6164fa((C4655rja) this.lk.get());
    }

    private oa Sc() {
        return C3743y.a(db(), Rc(), Tc(), J(), (C3469VY) ka());
    }

    private C7522vGa Sd() {
        return new C7522vGa(Rd());
    }

    private ia Se() {
        ia iaVar = new ia(X(), q(), qc(), U(), Kc(), (C2526g) this.Fd.get(), zb(), B());
        return iaVar;
    }

    private C6179ka Sf() {
        return C6182la.a(Ce(), S(), bg());
    }

    private qa Tc() {
        return ra.a(Ce());
    }

    private C3129mM Td() {
        return new C3129mM(Ud(), com.soundcloud.android.G.b(), r(), C());
    }

    private com.soundcloud.android.onboarding.auth.ka Te() {
        com.soundcloud.android.onboarding.auth.ka kaVar = new com.soundcloud.android.onboarding.auth.ka(X(), q(), C4930GMa.a(this.Ud), new com.soundcloud.android.onboarding.auth.C(), qc(), U(), B());
        return kaVar;
    }

    /* access modifiers changed from: private */
    public C6188na Tf() {
        a aVar = r2;
        a aVar2 = new a();
        return C6190oa.a(aVar, Vf(), (C5327TLa) this.fa.get(), X(), ob(), Ae(), Id(), (com.soundcloud.android.foundation.events.F) this.fh.get(), (Lca) this.qk.get(), Ze(), (C2526g) this.Fd.get(), (C3814lca) this.Ed.get(), pd(), ia(), (C4655rja) this.lk.get(), Ia(), Zf());
    }

    private C3223qU Uc() {
        return C3243rU.a((C5327TLa) this.fa.get(), Ja(), Nc());
    }

    private C3177oM Ud() {
        return new C3177oM(Xb());
    }

    private ta Ue() {
        return new ta((com.soundcloud.android.image.N) this.Qd.get(), Ce(), com.soundcloud.android.G.b(), C2936o.b());
    }

    /* access modifiers changed from: private */
    public C6192pa Uf() {
        C6192pa paVar = new C6192pa((com.soundcloud.android.image.N) this.Qd.get(), S(), Tf(), ia(), (com.soundcloud.android.foundation.events.F) this.fh.get(), (C4655rja) this.lk.get(), Ja(), new com.soundcloud.android.tracks.Ea.a(), Dc(), (C6834lGa) this.Ga.get(), bg());
        return paVar;
    }

    /* access modifiers changed from: private */
    public C3363xU Vc() {
        C3363xU xUVar = new C3363xU(U(), Nc(), Nd(), (C4412qb) this.Ui.get(), xc(), (e) this.Zc.get(), Fb(), (C5327TLa) this.fa.get());
        return xUVar;
    }

    private C5879z Vd() {
        return new C5879z(r());
    }

    private IPa<efa> Ve() {
        return C2321UO.a(C4930GMa.a(this.ab), com.soundcloud.android.G.b());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.tracks.Ca Vf() {
        com.soundcloud.android.tracks.Ca ca2 = new com.soundcloud.android.tracks.Ca((C3760eea) this.he.get(), la(), Da(), (C3989m) this.id.get(), (C2210OR) this.ld.get(), (C4416rb) this.og.get(), Bc());
        return ca2;
    }

    private C1960BU Wc() {
        return new C1960BU((SharedPreferences) this.ga.get());
    }

    private com.soundcloud.android.profile.C Wd() {
        com.soundcloud.android.profile.C c2 = new com.soundcloud.android.profile.C(new C5820n(), new com.soundcloud.android.profile.r(), new pe(), ae(), be(), Yd(), Zd(), new C5830p());
        return c2;
    }

    /* access modifiers changed from: private */
    public SmoothScrollLinearLayoutManager We() {
        return new SmoothScrollLinearLayoutManager(X());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.likes.X Wf() {
        return new com.soundcloud.android.likes.X(Uf());
    }

    private com.soundcloud.android.collection.playhistory.r Xc() {
        return new com.soundcloud.android.collection.playhistory.r(_c(), bd(), new com.soundcloud.android.collection.playhistory.I());
    }

    private com.soundcloud.android.profile.I Xd() {
        com.soundcloud.android.profile.I i2 = new com.soundcloud.android.profile.I(com.soundcloud.android.G.b(), Vd(), pb(), nf(), (C5327TLa) this.fa.get(), (com.soundcloud.android.foundation.events.y) this.tj.get(), (com.soundcloud.android.properties.a) this.La.get());
        return i2;
    }

    private AuthenticatorService.a Xe() {
        return new AuthenticatorService.a(X(), (C2526g) this.Fd.get());
    }

    private C3970aa Xf() {
        return new C3970aa(new com.soundcloud.android.likes.P(), Wf());
    }

    /* access modifiers changed from: private */
    public C2792u Yc() {
        return C2793v.a(Xc(), hc(), Oc());
    }

    private com.soundcloud.android.profile.S Yd() {
        return new com.soundcloud.android.profile.S(Bd());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.features.record.ba Ye() {
        return com.soundcloud.android.Q.a(C3042hV.b(), this.a);
    }

    private com.soundcloud.android.tracks.Ja Yf() {
        return new com.soundcloud.android.tracks.Ja(r(), new TV(), com.soundcloud.android.G.b());
    }

    private C2794w Zc() {
        return new C2794w(ad());
    }

    private com.soundcloud.android.profile.V Zd() {
        return new com.soundcloud.android.profile.V(Gd());
    }

    private com.soundcloud.android.stations.Ga Ze() {
        return new com.soundcloud.android.stations.Ga((C4655rja) this.lk.get(), Oc());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.tracks.Na Zf() {
        return new com.soundcloud.android.tracks.Na((C2526g) this.Fd.get());
    }

    private com.soundcloud.android.collection.playhistory.O _c() {
        return new com.soundcloud.android.collection.playhistory.O(Ce(), new a());
    }

    private C5786ga _d() {
        C5786ga gaVar = new C5786ga(Xd(), pb(), (Ica) this.kb.get(), pd(), C2936o.b());
        return gaVar;
    }

    private com.soundcloud.android.stations.Ma.a _e() {
        return new com.soundcloud.android.stations.Ma.a(af(), bf());
    }

    private Object _f() {
        return com.soundcloud.android.playback.playqueue.gb.a((com.soundcloud.android.image.N) this.Qd.get(), Tf());
    }

    private va ad() {
        return new va((C2839u) this.He.get());
    }

    private C5801ja ae() {
        return new C5801ja(Pf());
    }

    private com.soundcloud.android.stations.Xa af() {
        return com.soundcloud.android.stations.Ya.a(Ue(), Ce(), (com.soundcloud.android.image.N) this.Qd.get());
    }

    private com.soundcloud.android.tracks.Pa ag() {
        return new com.soundcloud.android.tracks.Pa(ie());
    }

    private com.soundcloud.android.collection.playhistory.Ca bd() {
        return new com.soundcloud.android.collection.playhistory.Ca(Uf(), (com.soundcloud.android.foundation.events.F) this.fh.get());
    }

    private C5816ma be() {
        return new C5816ma(Uf(), new com.soundcloud.android.tracks.Ea.a());
    }

    private C6045sb bf() {
        return C6048tb.a(ff());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.tracks.Va bg() {
        return new com.soundcloud.android.tracks.Va((C2526g) this.Fd.get());
    }

    private com.soundcloud.android.playback.Ta cd() {
        return new com.soundcloud.android.playback.Ta((C5327TLa) this.fa.get(), C4930GMa.a(this.Dh));
    }

    private Object ce() {
        return C5840ra.a(Ce());
    }

    private C6063yb cf() {
        return C6066zb.a(X(), df(), kf());
    }

    private com.soundcloud.android.tracks.Ya cg() {
        return new com.soundcloud.android.tracks.Ya(ie(), of());
    }

    private C3507cca dd() {
        return new C3507cca(jd());
    }

    private C5875ya de() {
        C5875ya yaVar = new C5875ya((com.soundcloud.android.image.N) this.Qd.get(), S(), Sa(), Ca(), Ze(), (com.soundcloud.android.foundation.events.F) this.fh.get(), ee(), (C6614hxa) this.pk.get(), ia(), com.soundcloud.android.X.b());
        return yaVar;
    }

    private Object df() {
        return com.soundcloud.android.stations.Cb.a(C4803CJa.a());
    }

    private Eb dg() {
        Eb eb2 = new Eb(cg(), new WV(), new TV(), Hb(), com.soundcloud.android.G.b());
        return eb2;
    }

    private C4392qa ed() {
        return C4393ra.a(hd(), ld(), md());
    }

    private com.soundcloud.android.profile.Aa ee() {
        return new com.soundcloud.android.profile.Aa((com.soundcloud.android.image.N) this.Qd.get(), Tc(), Ce());
    }

    private com.soundcloud.android.stations.Gb ef() {
        return new com.soundcloud.android.stations.Gb((com.soundcloud.android.image.N) this.Qd.get(), Ce());
    }

    private Object eg() {
        return C4945Gwa.a((com.soundcloud.android.image.N) this.Qd.get());
    }

    private C4336lb fd() {
        return new C4336lb((C3814lca) this.Ed.get(), Nd());
    }

    private ProfilePresenter fe() {
        return com.soundcloud.android.profile.Pa.a(Pb(), C2936o.b(), ce(), de(), pb(), (C2526g) this.Fd.get(), ia(), Ua(), com.soundcloud.android.X.b());
    }

    private com.soundcloud.android.stations.Jb ff() {
        return com.soundcloud.android.stations.Kb.a((com.soundcloud.android.image.N) this.Qd.get(), Tf(), (C4655rja) this.lk.get());
    }

    private C7636wta fg() {
        return C7774yta.a(q(), mf(), Hb(), (a) this.cb.get());
    }

    private C4403wa gd() {
        C4403wa waVar = new C4403wa((C3814lca) this.Ed.get(), Id(), wb(), pd(), (com.soundcloud.android.foundation.events.F) this.fh.get(), Ia(), com.soundcloud.android.G.b());
        return waVar;
    }

    /* access modifiers changed from: private */
    public b ge() {
        return new b(C2947z.b(), Sd());
    }

    private Rb gf() {
        return new Rb(ef());
    }

    private UploadMonitorPresenter gg() {
        UploadMonitorPresenter uploadMonitorPresenter = new UploadMonitorPresenter((C2350WH) this.dk.get(), Tc(), (C2526g) this.Fd.get(), (C3792iea) this.ve.get(), new com.soundcloud.android.utilities.android.q());
        return uploadMonitorPresenter;
    }

    private com.soundcloud.android.playback.playqueue.Ma hd() {
        com.soundcloud.android.playback.playqueue.Ma ma2 = new com.soundcloud.android.playback.playqueue.Ma(com.soundcloud.android.G.b(), (C3814lca) this.Ed.get(), Vf(), (C3792iea) this.ve.get(), na(), (Fda) this.Fb.get(), (C3760eea) this.he.get());
        return ma2;
    }

    private C5500ZKa he() {
        return C6618hza.a(Fe());
    }

    private com.soundcloud.android.stations.Vb hf() {
        return new com.soundcloud.android.stations.Vb(r(), q());
    }

    private com.soundcloud.android.creators.upload.u hg() {
        return com.soundcloud.android.creators.upload.v.a(X(), Ce(), nc(), (C2526g) this.Fd.get());
    }

    private Object id() {
        return com.soundcloud.android.playback.playqueue.Qa.a((C3814lca) this.Ed.get(), (C4412qb) this.Ui.get(), ed(), (Yc) this.wh.get(), (C5327TLa) this.fa.get(), ia(), ld(), Oc(), com.soundcloud.android.G.b());
    }

    private C4898FLa ie() {
        return new C4898FLa(he());
    }

    /* renamed from: if reason: not valid java name */
    private Xb m0if() {
        return new Xb(F());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.collection.Na ig() {
        return com.soundcloud.android.collection.Oa.a(Ja());
    }

    private C3846pca jd() {
        return C3854qca.a((C3758eca) this.Ma.get());
    }

    private C3678e je() {
        return C2222PK.b(this.Vh);
    }

    private _b jf() {
        return com.soundcloud.android.stations.ac.a((C5327TLa) this.fa.get(), kf(), (com.soundcloud.android.sync.T) this.Eb.get(), md(), com.soundcloud.android.G.b());
    }

    private C5762bb jg() {
        C5762bb bbVar = new C5762bb(vg(), (Ica) this.kb.get(), ia(), pd(), C2936o.b());
        return bbVar;
    }

    private Object kd() {
        return com.soundcloud.android.playback.playqueue.Ta.a(this.da);
    }

    private C3678e ke() {
        return C2241QK.a(this.d, (com.soundcloud.android.properties.a) this.La.get(), this.Th);
    }

    /* access modifiers changed from: private */
    public ic kf() {
        return new ic(na(), com.soundcloud.android.G.b(), (C5327TLa) this.fa.get(), Vf());
    }

    private C5787gb.a kg() {
        return new C5787gb.a(new Nb.a(), lg(), new C5777eb(), new C5793hc());
    }

    private com.soundcloud.android.view.F lc() {
        return new com.soundcloud.android.view.F(X(), mc());
    }

    private Object ld() {
        return com.soundcloud.android.playback.playqueue.Ya.a(X(), (C3814lca) this.Ed.get(), Ce());
    }

    /* access modifiers changed from: private */
    public ja le() {
        return new ja(Ce());
    }

    private C1409jT lf() {
        return new C1409jT(he(), (C3800jea) this.pb.get());
    }

    private C5856ub.a lg() {
        return new C5856ub.a(S());
    }

    private com.soundcloud.android.view.G mc() {
        return com.soundcloud.android.view.H.a(X());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.foundation.playqueue.r md() {
        return com.soundcloud.android.M.a((C3814lca) this.Ed.get());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.la me() {
        return new com.soundcloud.android.la(Zb());
    }

    private Object mf() {
        return C7498uta.a(he(), C2947z.b());
    }

    private C6429fJa mg() {
        return new C6429fJa((com.soundcloud.android.image.N) this.Qd.get(), S());
    }

    /* access modifiers changed from: private */
    public n nc() {
        return com.soundcloud.android.K.a(this.a);
    }

    private PlayQueueView nd() {
        return com.soundcloud.android.playback.playqueue.ab.a(id(), kd(), (C5052KJa) this.Ki.get(), We(), Oc(), _f(), C4380ka.a(), Ab());
    }

    private C7648wza<String> ne() {
        return com.soundcloud.android.cast.p.a(pa());
    }

    private com.soundcloud.android.profile.Sa nf() {
        return com.soundcloud.android.profile.Ta.a(Ig());
    }

    private C5141NFa ng() {
        return new C5141NFa((C3792iea) this.ve.get(), (C3360xR) this.ye.get(), Da());
    }

    /* access modifiers changed from: private */
    public Object oc() {
        return com.soundcloud.android.settings.notifications.o.a(r(), com.soundcloud.android.G.b(), pc(), (C6834lGa) this.Ga.get());
    }

    /* access modifiers changed from: private */
    public g od() {
        return new g((C4416rb) this.og.get(), (C5052KJa) this.Ki.get());
    }

    private C2821l.a oe() {
        C2821l.a aVar = new C2821l.a(re(), se(), te(), ue(), new C2830t());
        return aVar;
    }

    private C1502mT of() {
        return new C1502mT(he(), (C3800jea) this.pb.get());
    }

    private com.soundcloud.android.profile.Kb og() {
        com.soundcloud.android.profile.Kb kb2 = new com.soundcloud.android.profile.Kb(vg(), ia(), pd(), (Ica) this.kb.get(), C2936o.b());
        return kb2;
    }

    private p pc() {
        return new p(Rb(), C2947z.b());
    }

    /* access modifiers changed from: private */
    public Db pd() {
        return new Db((C3814lca) this.Ed.get(), (C4412qb) this.Ui.get(), fd(), C2936o.b());
    }

    /* access modifiers changed from: private */
    public C2826o pe() {
        return C2827p.a(oe(), hc(), Oc());
    }

    private C6114y pf() {
        return C6116z.a(yf(), uf(), zf(), w(), new Cca(), Bg());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.profile.Rb pg() {
        return new com.soundcloud.android.profile.Rb(Qa());
    }

    private C2322UP qc() {
        return new C2322UP((C2526g) this.Fd.get(), new C2041FV());
    }

    private Jb qd() {
        return new Jb(wf(), (ie) this.Ih.get(), (ke) this.ki.get(), aa());
    }

    private C2828q qe() {
        return new C2828q(ve());
    }

    private Object qf() {
        return com.soundcloud.android.stream.B.a(ia(), (com.soundcloud.android.foundation.events.F) this.fh.get(), Ce(), (com.soundcloud.android.image.N) this.Qd.get(), (C4655rja) this.lk.get());
    }

    private C5231QFa qg() {
        return C5261RFa.a(rg(), Sa(), ng(), Ze(), Ca(), (C2526g) this.Fd.get());
    }

    private C3126mJ rc() {
        return new C3126mJ(ka());
    }

    private Ub rd() {
        return new Ub(qd());
    }

    private com.soundcloud.android.collection.recentlyplayed.C re() {
        return new com.soundcloud.android.collection.recentlyplayed.C(Ce(), new a());
    }

    private com.soundcloud.android.stream.C rf() {
        return new com.soundcloud.android.stream.C(he());
    }

    private Object rg() {
        return C5350UFa.a(C4803CJa.a());
    }

    private Cc sc() {
        return new Cc(xa());
    }

    private C4282ac sd() {
        C4282ac acVar = new C4282ac((com.soundcloud.android.playback.players.r) this.qj.get(), (C5327TLa) this.fa.get(), td(), (C4523x) this.rj.get(), (ke) this.ki.get(), (C4412qb) this.Ui.get(), (com.soundcloud.android.playback.E) this.cj.get());
        return acVar;
    }

    private C2812ga se() {
        return new C2812ga((com.soundcloud.android.image.N) this.Qd.get(), Ed(), Dd());
    }

    private File sf() {
        return C6822kza.a(X());
    }

    /* access modifiers changed from: private */
    public C5808kc sg() {
        return new C5808kc(zg(), tg());
    }

    private com.soundcloud.android.periodic.e tc() {
        return new com.soundcloud.android.periodic.e(uc());
    }

    private C4422sc td() {
        return new C4422sc((C5327TLa) this.fa.get(), ka(), (com.soundcloud.android.properties.a) this.La.get());
    }

    private com.soundcloud.android.collection.recentlyplayed.va te() {
        return new com.soundcloud.android.collection.recentlyplayed.va((com.soundcloud.android.image.N) this.Qd.get(), (com.soundcloud.android.foundation.events.F) this.fh.get(), qg());
    }

    private C4762Aza tf() {
        return C4793Bza.a(Oc());
    }

    private Bc tg() {
        return new Bc(Gd());
    }

    private Ec uc() {
        return new Ec(xa(), ka());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.playback.players.l ud() {
        return new com.soundcloud.android.playback.players.l(ma());
    }

    private com.soundcloud.android.collection.recentlyplayed.Aa ue() {
        return new com.soundcloud.android.collection.recentlyplayed.Aa((com.soundcloud.android.image.N) this.Qd.get(), cf());
    }

    private Object uf() {
        return com.soundcloud.android.stream.Ba.a(Ed(), qf(), H());
    }

    private com.soundcloud.android.profile.Ic ug() {
        com.soundcloud.android.profile.Ic ic2 = new com.soundcloud.android.profile.Ic(vg(), (Ica) this.kb.get(), ia(), pd(), C2936o.b());
        return ic2;
    }

    private Ic vc() {
        return new Ic(yc());
    }

    /* access modifiers changed from: private */
    public C4504xb vd() {
        return com.soundcloud.android.playback.Uc.a((com.soundcloud.android.image.N) this.Qd.get(), Ce(), com.soundcloud.android.G.b(), (C6699jHa) this.Ja.get());
    }

    private com.soundcloud.android.collection.recentlyplayed.Ga ve() {
        return new com.soundcloud.android.collection.recentlyplayed.Ga((C2839u) this.He.get());
    }

    private C4323id vf() {
        C4323id idVar = new C4323id(X(), (C5327TLa) this.fa.get(), (C3760eea) this.he.get(), (C3814lca) this.Ed.get(), (C2732f) this.Ah.get(), Ac(), (e) this.Zc.get(), Ib(), rd(), md(), (C6834lGa) this.Ga.get());
        return idVar;
    }

    /* access modifiers changed from: private */
    public Lc vg() {
        Lc lc2 = new Lc(Vd(), com.soundcloud.android.G.b(), (C3800jea) this.pb.get(), pb(), Ig(), (C5327TLa) this.fa.get());
        return lc2;
    }

    private Kc wc() {
        return new Kc(yc(), Fc());
    }

    private com.soundcloud.android.playback.Ec wd() {
        return new com.soundcloud.android.playback.Ec(Y());
    }

    private com.soundcloud.android.periodic.j we() {
        return new com.soundcloud.android.periodic.j((com.soundcloud.android.properties.a) this.La.get(), ia());
    }

    private C4527xd wf() {
        C4527xd xdVar = new C4527xd(Za(), Af(), (C4165se) this.Dd.get(), Fb(), (e) this.Zc.get(), Pa(), Ha(), (C6834lGa) this.Ga.get(), (Nea) this.Ud.get(), ka());
        return xdVar;
    }

    private com.soundcloud.android.ta wg() {
        return new com.soundcloud.android.ta(Ja(), ia(), le(), (C6699jHa) this.Ja.get());
    }

    /* access modifiers changed from: private */
    public C4197yd xc() {
        return Bd.a(Hc(), yb(), wc(), (C5327TLa) this.fa.get(), yc(), Nd(), rb(), tb(), Cc(), C(), Q(), (com.soundcloud.android.sync.T) this.Eb.get(), Qf(), Nb(), com.soundcloud.android.G.b(), ib(), Fc(), (Se) this.sd.get(), xa(), va());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.playback.Ic xd() {
        return new com.soundcloud.android.playback.Ic(ia());
    }

    private C5128Msa xe() {
        return new C5128Msa(ye(), yc());
    }

    private lb xf() {
        return new lb(he());
    }

    private Pd xg() {
        Pd pd2 = new Pd(vg(), (Ica) this.kb.get(), ia(), pd(), C2936o.b());
        return pd2;
    }

    private com.soundcloud.android.offline.Gd yc() {
        return new com.soundcloud.android.offline.Gd(cc(), com.soundcloud.android.G.b());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.main.ea yd() {
        return fa.a((com.soundcloud.android.properties.a) this.La.get());
    }

    private C5218Psa ye() {
        C5218Psa psa = new C5218Psa(he(), Qd(), Kd(), xf(), f());
        return psa;
    }

    private Object yf() {
        return qb.a(S(), Tf(), H(), qf(), bg());
    }

    private Object yg() {
        return C5007Iwa.a((com.soundcloud.android.image.N) this.Qd.get());
    }

    private Object zc() {
        return Ud.a(ia());
    }

    /* access modifiers changed from: private */
    public C5039Jwa zd() {
        return new C5039Jwa(Ad());
    }

    private C5308Ssa ze() {
        return C5337Tsa.a(he());
    }

    private com.soundcloud.android.upsell.e zf() {
        return new com.soundcloud.android.upsell.e(Ja());
    }

    private com.soundcloud.android.profile.ee zg() {
        return new com.soundcloud.android.profile.ee(Uf());
    }

    public void a(CastRedirectActivity castRedirectActivity) {
    }

    public void a(com.soundcloud.android.creators.upload.k kVar) {
    }

    public void a(com.soundcloud.android.onboarding.auth.S s2) {
    }

    public void a(C5986s sVar) {
    }

    private da(C2933l lVar, com.soundcloud.android.accounts.v vVar, C2264RO ro, C2016EQ eq, C3354xL xLVar, C2165MK mk2, C3339wQ wQVar, Application application) {
        this.a = application;
        this.b = ro;
        this.c = lVar;
        this.d = mk2;
        a(lVar, vVar, ro, eq, xLVar, mk2, wQVar, application);
        b(lVar, vVar, ro, eq, xLVar, mk2, wQVar, application);
        c(lVar, vVar, ro, eq, xLVar, mk2, wQVar, application);
        d(lVar, vVar, ro, eq, xLVar, mk2, wQVar, application);
        e(lVar, vVar, ro, eq, xLVar, mk2, wQVar, application);
        f(lVar, vVar, ro, eq, xLVar, mk2, wQVar, application);
        g(lVar, vVar, ro, eq, xLVar, mk2, wQVar, application);
        h(lVar, vVar, ro, eq, xLVar, mk2, wQVar, application);
    }

    private AudioManager A() {
        return C2938q.a(this.a);
    }

    private C5245Qpa Aa() {
        return C5275Rpa.a(he(), C2947z.b());
    }

    private Object Ab() {
        return C4386na.a((C3814lca) this.Ed.get());
    }

    private com.soundcloud.android.onboarding.g B() {
        return C2939r.a(new C2041FV());
    }

    private C3404zV Ba() {
        return new C3404zV(new C3244rV());
    }

    /* access modifiers changed from: private */
    public MainNavigationView Bb() {
        return C3963cia.a(g(), (com.soundcloud.android.main.Z) this.Al.get(), (Zha) this.Cl.get());
    }

    /* access modifiers changed from: private */
    public C2248QR C() {
        return com.soundcloud.android.sync.aa.a(this.a, (com.soundcloud.android.sync.oa) this.lb.get(), Lc());
    }

    /* access modifiers changed from: private */
    public C2390YL Ca() {
        return new C2390YL((C3760eea) this.he.get(), (C3792iea) this.ve.get(), ia());
    }

    private Map<Class<?>, C7054oVa<dagger.android.b.a<?>>> Cb() {
        a a2 = C3346xD.a(50);
        a2.a(UserTopTracksFragment.class, this.e);
        a2.a(SoundRecorderService.class, this.f);
        a2.a(RecordFragment.class, this.g);
        a2.a(RecordAppWidgetProvider.class, this.h);
        a2.a(HomescreenWidgetBroadcastReceiver.class, this.i);
        a2.a(MainActivity.class, this.j);
        a2.a(LauncherActivity.class, this.k);
        a2.a(ResolveActivity.class, this.l);
        a2.a(ChangeStorageLocationActivity.class, this.m);
        a2.a(FullScreenVideoActivity.class, this.n);
        a2.a(GoOnboardingActivity.class, this.o);
        a2.a(GoOffboardingActivity.class, this.p);
        a2.a(LegalActivity.class, this.q);
        a2.a(LicensesActivity.class, this.r);
        a2.a(NotificationPreferencesActivity.class, this.s);
        a2.a(OfflineSettingsOnboardingActivity.class, this.t);
        a2.a(PrestitialActivity.class, this.u);
        a2.a(RecordActivity.class, this.v);
        a2.a(RecoverActivity.class, this.w);
        a2.a(RecordPermissionsActivity.class, this.x);
        a2.a(UploadActivity.class, this.y);
        a2.a(VerifyAgeActivity.class, this.z);
        a2.a(WebViewActivity.class, this.A);
        a2.a(RemoteSignInWebViewActivity.class, this.B);
        a2.a(com.soundcloud.android.ads.injector.s.class, this.C);
        a2.a(com.soundcloud.android.properties.h.class, this.D);
        a2.a(ScFirebaseMessagingService.class, this.E);
        a2.a(FcmRegistrationService.class, this.F);
        a2.a(MediaService.class, this.G);
        a2.a(LibraryFragment.class, this.H);
        a2.a(ArtistsFragment.class, this.I);
        a2.a(TrackLikesFragment.class, this.J);
        a2.a(LikesSearchFragment.class, this.K);
        a2.a(PlaylistCollectionFragment.class, this.L);
        a2.a(DownloadsFragment.class, this.M);
        a2.a(ConversionActivity.class, this.N);
        a2.a(NativeConversionActivity.class, this.O);
        a2.a(ProductChoiceActivity.class, this.P);
        a2.a(WebCheckoutActivity.class, this.Q);
        a2.a(PlaylistDetailFragment.class, this.R);
        a2.a(DiscoveryFragment.class, this.S);
        a2.a(PlayerCommentsFragment.class, this.T);
        a2.a(CommentsFragment.class, this.U);
        a2.a(PlayerFragment.class, this.V);
        a2.a(VisualPlayerFragment.class, this.W);
        a2.a(com.soundcloud.android.trackinfo.f.class, this.X);
        a2.a(DevDrawerFragment.class, this.Y);
        a2.a(com.soundcloud.android.listeners.dev.playback.d.class, this.Z);
        a2.a(DevEventLoggerMonitorActivity.class, this.aa);
        a2.a(DevEventLoggerMonitorReceiver.class, this.ba);
        return a2.a();
    }

    /* access modifiers changed from: private */
    public C4834DJa D() {
        return C4865EJa.a(Mf());
    }

    private C5425Wta Da() {
        return new C5425Wta(Bc(), _a(), ab());
    }

    private com.soundcloud.android.accounts.F Db() {
        return new com.soundcloud.android.accounts.F(r(), com.soundcloud.android.G.b());
    }

    private C4374ha E() {
        return new C4374ha((com.soundcloud.android.image.N) this.Qd.get(), Ce(), com.soundcloud.android.G.b());
    }

    private C6135s Ea() {
        return new C6135s(Sb(), C2947z.b());
    }

    /* access modifiers changed from: private */
    public C4649qma Eb() {
        return ha.a(this.Wl, (com.soundcloud.android.properties.a) this.La.get());
    }

    private com.soundcloud.android.stations.B F() {
        return new com.soundcloud.android.stations.B((com.soundcloud.android.stations.Ia) this.vc.get(), C2947z.b());
    }

    /* access modifiers changed from: private */
    public C7648wza<Boolean> Fa() {
        return C3090kL.a(pa());
    }

    private C4735ADa Fb() {
        return new C4735ADa(Gb(), za(), (C3760eea) this.he.get(), com.soundcloud.android.G.b());
    }

    private C5322TGa G() {
        C5322TGa tGa = new C5322TGa((com.soundcloud.android.properties.j) this.la.get(), (C6699jHa) this.Ja.get(), (C3814lca) this.Ed.get(), Ce(), com.soundcloud.android.G.b(), ka(), (com.soundcloud.android.properties.a) this.La.get(), com.soundcloud.android.X.b());
        return tGa;
    }

    /* access modifiers changed from: private */
    public C3781hba Ga() {
        return com.soundcloud.android.playback.Lc.a((C7181qKa) le(), (C6699jHa) this.Ja.get());
    }

    private C4797CDa Gb() {
        return new C4797CDa((com.soundcloud.android.tracks.W) this.sb.get());
    }

    private C5204PIa H() {
        return C5234QIa.a(S(), ob(), Ae(), (C2526g) this.Fd.get(), ia(), bg());
    }

    private C3789iba Ha() {
        return com.soundcloud.android.playback.Mc.a(X(), Ga(), (C6834lGa) this.Ga.get(), C2947z.b(), (com.soundcloud.android.playback.core.d) new C4352oc());
    }

    private C5014JDa Hb() {
        return new C5014JDa(Gb(), (com.soundcloud.android.utilities.android.k) this.ub.get());
    }

    /* access modifiers changed from: private */
    public C2730d I() {
        return C2731e.a(X(), (com.soundcloud.android.properties.j) this.la.get(), ne());
    }

    /* access modifiers changed from: private */
    public C4425ta Ia() {
        return new C4425ta(od(), (C5327TLa) this.fa.get());
    }

    private Fma Ib() {
        return new Fma(Ce(), Vf(), (com.soundcloud.android.image.N) this.Qd.get(), com.soundcloud.android.G.b());
    }

    private C3724e J() {
        return C3725f.a(Ce());
    }

    /* access modifiers changed from: private */
    public C2436_U Ja() {
        return com.soundcloud.android.D.a(this.c, Ka(), Wc(), (com.soundcloud.android.properties.j) this.la.get(), (C3700b) ia());
    }

    private MetadataPresenter Jb() {
        return new MetadataPresenter(Ye(), Tc(), new com.soundcloud.android.utilities.android.q());
    }

    private C5612aya K() {
        return C4947Gya.a(mb(), e(), Pd(), Ra(), vc(), dd(), m0if(), rf(), qe(), Zc(), ra());
    }

    private C2380XU Ka() {
        return new C2380XU((SharedPreferences) this.ga.get());
    }

    private C5071Kxa Kb() {
        return C5133Mxa.a(Qb(), p(), sc(), new C4791Bxa(), L());
    }

    private C4946Gxa L() {
        return new C4946Gxa(Gb(), com.soundcloud.android.G.b(), ka());
    }

    /* access modifiers changed from: private */
    public C6494gGa La() {
        return new C6494gGa(X());
    }

    private com.soundcloud.android.more.B Lb() {
        return com.soundcloud.android.more.C.a(Mb(), (C3792iea) this.ve.get(), (C2526g) this.Fd.get(), (com.soundcloud.android.image.N) this.Qd.get(), Ce(), ia(), Ja(), xc(), (C4655rja) this.lk.get(), G(), (com.soundcloud.android.properties.j) this.la.get(), (com.soundcloud.android.properties.a) this.La.get(), U(), (C5052KJa) this.Ki.get(), Oc(), new C3137mV());
    }

    private C0514cT M() {
        return C1225dT.a(he());
    }

    private C2168MN Ma() {
        return new C2168MN((FirebaseAnalytics) this.qa.get());
    }

    private Object Mb() {
        return com.soundcloud.android.more.F.a(this.ka, this.La);
    }

    /* access modifiers changed from: private */
    public C2040FU N() {
        return new C2040FU((C2137KU) this.Ca.get(), (com.soundcloud.android.properties.a) this.La.get());
    }

    private String Na() {
        return Nc.a(aa());
    }

    private C1938AS Nb() {
        C1938AS as = new C1938AS(Q(), De(), Qd(), Hd(), com.soundcloud.android.G.b());
        return as;
    }

    private C2837s O() {
        return C2838t.a(com.soundcloud.android.collection.Ia.a(), ig(), P(), new Cca(), pe(), Yc());
    }

    private Ula Oa() {
        return com.soundcloud.android.playback.Oc.a(X(), wd(), Na(), sf(), A(), (com.soundcloud.android.properties.a) this.La.get());
    }

    private C2287SS Ob() {
        return new C2287SS((C5327TLa) this.fa.get(), (C3989m) this.id.get(), Nb());
    }

    private wa P() {
        return com.soundcloud.android.collection.xa.a(hc(), (C4655rja) this.lk.get(), Ce(), (com.soundcloud.android.image.N) this.Qd.get(), Oc());
    }

    private Yla Pa() {
        return Pc.a(Oa(), Rd(), (com.soundcloud.android.playback.core.d) new C4352oc());
    }

    private Object Pb() {
        return com.soundcloud.android.profile.Ma.a(ce(), C4930GMa.a(com.soundcloud.android.profile.Ra.a()), C4930GMa.a(this.sk));
    }

    private com.soundcloud.android.collection.Aa Q() {
        com.soundcloud.android.collection.Aa aa2 = new com.soundcloud.android.collection.Aa((com.soundcloud.android.properties.a) this.La.get(), Ef(), Ff(), (com.soundcloud.android.sync.T) this.Eb.get(), com.soundcloud.android.X.b(), (Ica) this.kb.get());
        return aa2;
    }

    private com.soundcloud.android.profile.Rb.a Qa() {
        return new com.soundcloud.android.profile.Rb.a(mg());
    }

    private SharedPreferences Qb() {
        return C5430Wya.a(X());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.playback.K R() {
        return com.soundcloud.android.playback.L.a((C4298dd) this._i.get(), (C4412qb) this.Ui.get(), (C4416rb) this.og.get(), (C2732f) this.Ah.get(), od());
    }

    private C3845pba Ra() {
        return new C3845pba(Ta());
    }

    private SharedPreferences Rb() {
        return C5517Zya.a(X());
    }

    /* access modifiers changed from: private */
    public C5408WFa S() {
        return com.soundcloud.android.L.a(this.a);
    }

    /* access modifiers changed from: private */
    public C3240rR Sa() {
        C3240rR rRVar = new C3240rR((C5327TLa) this.fa.get(), com.soundcloud.android.G.b(), (C3792iea) this.ve.get(), ng(), Ef(), Ta());
        return rRVar;
    }

    private SharedPreferences Sb() {
        return C5254Qya.a(X());
    }

    private C2250QT T() {
        return new C2250QT((Mc) this.gi.get(), Ja());
    }

    private Cba Ta() {
        return new Cba((C3869sba) this.we.get());
    }

    /* access modifiers changed from: private */
    public SharedPreferences Tb() {
        return C6414eza.a(X());
    }

    private C2325UT U() {
        return C2940s.a(this.c, q(), r(), (C2137KU) this.Ca.get(), Ja(), Nc(), (C2343VT) this.wa.get(), (a) this.cb.get(), com.soundcloud.android.G.b(), Uc(), (C3041hU) this.db.get(), cb(), Td());
    }

    private FragmentEnterScreenDispatcher Ua() {
        return new FragmentEnterScreenDispatcher(new FragmentScreenStateProvider(), C2947z.b());
    }

    /* access modifiers changed from: private */
    public SharedPreferences Ub() {
        return C4823Cya.a(X());
    }

    private ConnectivityManager V() {
        return C2943v.a(this.a);
    }

    private com.soundcloud.android.tracks.K Va() {
        return new com.soundcloud.android.tracks.K(cg());
    }

    /* access modifiers changed from: private */
    public SharedPreferences Vb() {
        return C5682bza.a(X());
    }

    private com.soundcloud.android.view.behavior.b W() {
        return new com.soundcloud.android.view.behavior.b(new com.soundcloud.android.view.behavior.f());
    }

    private com.soundcloud.android.tracks.M Wa() {
        return new com.soundcloud.android.tracks.M(Xa());
    }

    /* access modifiers changed from: private */
    public SharedPreferences Wb() {
        return C6346dza.a(X());
    }

    /* access modifiers changed from: private */
    public Context X() {
        return C2944w.a(this.a);
    }

    private com.soundcloud.android.tracks.N Xa() {
        com.soundcloud.android.tracks.N n2 = new com.soundcloud.android.tracks.N(Yf(), new com.soundcloud.android.tracks.G(), dg(), Va(), new WV(), new TV(), new YV(), new _V(), com.soundcloud.android.G.b());
        return n2;
    }

    private SharedPreferences Xb() {
        return C6482fza.a(X());
    }

    private C6291dHa Y() {
        return C2945x.a(C4930GMa.a(this.ii));
    }

    private Object Ya() {
        return com.soundcloud.android.downgrade.g.a(hc(), Nc(), Vc(), (C4655rja) this.lk.get(), com.soundcloud.android.downgrade.i.a(), ia());
    }

    private SharedPreferences Yb() {
        return C7027nza.a(X());
    }

    private C3236rN Z() {
        return C2946y.a((com.soundcloud.android.properties.j) this.la.get(), (C7319sKa) this.pa.get());
    }

    private C4517wa Za() {
        return new C4517wa((C2526g) this.Fd.get(), t());
    }

    private SharedPreferences Zb() {
        return C5488Yya.a(X());
    }

    private C3971b _a() {
        return com.soundcloud.android.W.a((C3989m) this.id.get());
    }

    private SharedPreferences _b() {
        return C5343Tya.a(X());
    }

    public static ja.a a() {
        return new C2698w(null);
    }

    private C3284tV aa() {
        return C3304uV.a(jb(), new C1961BV(), Ba(), com.soundcloud.android.G.b(), (C3469VY) ka());
    }

    private C1937AR ab() {
        return com.soundcloud.android.aa.a((C2210OR) this.ld.get());
    }

    private SharedPreferences ac() {
        return C3740v.a(this.a);
    }

    private void b(C2933l lVar, com.soundcloud.android.accounts.v vVar, C2264RO ro, C2016EQ eq, C3354xL xLVar, C2165MK mk2, C3339wQ wQVar, Application application) {
        this._a = new C4899FMa();
        this.ab = C2302TO.a(this._a);
        this.bb = C4930GMa.b(C5352UHa.a());
        this.cb = C4930GMa.b(C5468YHa.a(this.bb));
        this.db = C4930GMa.b(C3060iU.a(this.fa, C5496ZGa.a(), this.Ja, this.wa));
        this.eb = C3740v.a(this.ca);
        this.fb = C3735p.a(this.eb);
        this.gb = C4929GLa.a(this.Qa);
        this.hb = C1226dW.a(this.Qa);
        this.ib = JW.a(this.gb, this.hb);
        this.jb = IW.a(this.ib, XV.a(), UV.a(), com.soundcloud.android.G.a());
        this.kb = C4930GMa.b(com.soundcloud.android.accounts.u.a(this.Wa, com.soundcloud.android.G.a()));
        this.lb = new C4899FMa();
        this.mb = com.soundcloud.android.sync.B.a(this.fa);
        this.nb = C6139w.a(this.fa);
        this.ob = C6688jAa.a(this._a, com.soundcloud.android.G.a());
        this.pb = new C4899FMa();
        this.qb = C1533nT.a(this.Qa, this.pb);
        this.rb = com.soundcloud.android.tracks.Gb.a(this.gb, this.qb);
        this.sb = C4930GMa.b(C7439tya.a(this.da, (C7054oVa<com.soundcloud.android.tracks.X>) com.soundcloud.android.tracks.Z.a(), (C7054oVa<HPa>) com.soundcloud.android.G.a()));
        this.tb = C5077LDa.a(this.sb);
        this.ub = C5148NMa.a(com.soundcloud.android.utilities.android.l.a());
        this.vb = C5046KDa.a(this.tb, this.ub);
        this.wb = com.soundcloud.android.tracks.Fb.a(this.rb, XV.a(), UV.a(), this.vb, com.soundcloud.android.G.a());
        this.xb = com.soundcloud.android.tracks.U.a(this.vb, this.rb);
        this.yb = C5148NMa.a(IV.a(this.La, this.wb, this.xb));
        this.zb = C7167qAa.a(this.fa);
        this.Ab = C5374VAa.a(this.ob, this.yb, this.zb);
        this.Bb = C6484gAa.a(this._a, com.soundcloud.android.G.a());
        this.Cb = C1440kT.a(this.Qa, this.pb);
        this.Db = C4941Gsa.a(this.Qa, this.gb, C5596aqa.a(), this.Cb, C2947z.a());
        this.Eb = new C4899FMa();
        this.Fb = C4930GMa.b(C4969Hpa.a(this.Db, this.Eb, com.soundcloud.android.G.a()));
        this.Gb = C7029oAa.a(this.fa);
        this.Hb = C5345UAa.a(this.Bb, this.Fb, this.Gb);
        this.Ib = C6892mAa.a(this._a, com.soundcloud.android.G.a());
        this.Jb = C7374tAa.a(this.fa);
        this.Kb = C5403WAa.a(this.Ib, this.pb, this.Jb);
        this.Lb = C5519_Aa.a(this.Ab, this.Hb, this.Kb);
        this.Mb = C7307sBa.a(this.Qa);
        this.Nb = C4973Hta.a(this.Qa, this.gb, C2947z.a());
        this.Ob = com.soundcloud.android.stream.mb.a(this.Qa);
        this.Pb = x.a(this.gb, this.Qa);
        this.Qb = C5248Qsa.a(this.Qa, this.Nb, this.Db, this.Ob, this.Pb);
        this.Rb = C5546_ya.a(this.da);
        this.Sb = com.soundcloud.android.offline.Hd.a(this.Rb, com.soundcloud.android.G.a());
        this.Tb = C5158Nsa.a(this.Qb, this.Sb);
        this.Ub = C5106MBa.a(this.Qa);
        this.Vb = C5254Qya.a(this.da);
        this.Wb = C6136t.a(this.Vb, C2947z.a());
        C7054oVa ova = this.Mb;
        C7054oVa<dfa> ova2 = this._a;
        C7054oVa<C4938Gpa> ova3 = this.Fb;
        this.Xb = C5317TBa.a(ova, ova2, ova3, ova3, this.Tb, this.yb, this.Db, this.Ub, this.fa, this.Wb);
        this.Yb = ha.a(this.lb, this.mb, this.nb, this.Lb, this.Xb, this.fa);
        this.Zb = C7027nza.a(this.da);
        this._b = com.soundcloud.android.sync.ma.a(this.Zb, C2947z.a());
        this.ac = C4930GMa.b(C2469bP.a(this.da));
        this.bc = C4930GMa.b(com.soundcloud.android.sync.ka.a());
        this.cc = C4930GMa.b(com.soundcloud.android.sync.S.a(this.Yb, this._b, this.ac, com.soundcloud.android.G.a(), this.bc));
        C4899FMa.a(this.Eb, C4930GMa.b(com.soundcloud.android.sync.U.a(this.kb, this.cc, com.soundcloud.android.G.a())));
        this.dc = com.soundcloud.android.Z.a(this.La);
        this.ec = C4930GMa.b(C7797zFa.a(this.ib, this.Eb, com.soundcloud.android.G.a(), this.dc));
        C4899FMa.a(this.pb, C5148NMa.a(KV.a(this.La, this.jb, this.ec)));
        this.fc = C5076LCa.a(this.pb, this.yb, this.Db);
        this.gc = C5318TCa.a(this.Qa, this.fc);
        this.hc = C5168OCa.a(this.pb, this.yb, this.Db);
        this.ic = C4982ICa.a(this.Qa, this.hc);
        this.jc = C6958mza.a(this.da);
        this.kc = com.soundcloud.android.sync.ba.a(this.jc);
        this.lc = C5258RCa.a(this._a, this.gc, this.ic, this.kc);
        this.mc = C6112x.a(this.lc);
        this.nc = C3402zT.a(this.Qa, this.pb);
        this.oc = C5285Rza.a(this.Qa, this.pb, this.yb, this.Db, this.nc);
        this.pc = C5225Pza.a(this.Qa, this.pb, this.yb, this.Db, this.nc);
        this.qc = C4761Aya.a(this.da);
        this.rc = com.soundcloud.android.sync.Z.a(this.qc);
        this.sc = C4886Eza.a(this._a, this.oc, this.pc, this.rc);
        this.tc = com.soundcloud.android.activities.z.a(this.sc);
        this.uc = com.soundcloud.android.stations.Wb.a(this.ab, this._a);
        this.vc = C4930GMa.b(C7715xya.a(this.da, (C7054oVa<com.soundcloud.android.stations.Ja>) com.soundcloud.android.stations.La.a(), (C7054oVa<HPa>) com.soundcloud.android.G.a()));
        this.wc = C4930GMa.b(com.soundcloud.android.stations.Eb.a((C7054oVa<C5694cGa>) C2947z.a(), this.vc));
        this.xc = com.soundcloud.android.stations.Ea.a(this.uc, this.wc);
        this.yc = com.soundcloud.android.stations.Ca.a(this.xc, this.wc);
        this.zc = C7102pCa.a(this.Qa);
        this.Ac = C6964nCa.a(this._a);
        this.Bc = C7585wCa.a(this.Qa);
        this.Cc = C7447uCa.a(this.Qa);
        this.Dc = C7240rCa.a(this.zc, this.Ac, this.Bc, this.Cc, this.ob, this.yb, this.fa);
        this.Ec = C7723yCa.a(this.Dc);
        this.Fc = C7033oCa.a(this.Qa);
        this.Gc = C6896mCa.a(this._a);
        this.Hc = C7171qCa.a(this.Fc, this.Gc, this.Bc, this.Cc, this.Bb, this.Fb, this.fa);
        this.Ic = C7100pBa.a(this.Qa);
        this.Jc = C5450Xpa.a(this.Qa);
        this.Kc = C4930GMa.b(C2856l.a(this.da));
        this.Lc = C2857m.a(this.Kc);
        this.Mc = C4930GMa.b(C7508uya.a(this.da, (C7054oVa<Kd>) Md.a(), (C7054oVa<HPa>) com.soundcloud.android.G.a()));
        this.Nc = Qe.a(C2947z.a(), this.Mc);
        this.Oc = C4112je.a(this.Lc, this.Sb, this.Nc, this.Db, this.Jc, (C7054oVa<HPa>) com.soundcloud.android.G.a());
        this.Pc = C4124le.a(this.fa, this.Oc);
        this.Qc = com.soundcloud.android.tracks.Ua.a(this.gb);
        this.Rc = C4191xc.a(this.Lc, this.Qc, this.Jc, this.Sb);
    }

    private C3152nQ ba() {
        return new C3152nQ(tc(), ea(), we(), s());
    }

    private C3730k bb() {
        return new C3730k(C3744z.b(), C3739u.b());
    }

    private SharedPreferences bc() {
        return C4792Bya.a(X());
    }

    private void c(C2933l lVar, com.soundcloud.android.accounts.v vVar, C2264RO ro, C2016EQ eq, C3354xL xLVar, C2165MK mk2, C3339wQ wQVar, Application application) {
        this.Sc = C5614aza.a(this.da);
        this.Tc = C4094ge.a(this.Sc, this.da);
        this.Uc = com.soundcloud.android.offline.Lc.a(this.Sb, this.Tc);
        this.Vc = new C4899FMa();
        this.Wc = C5508Zpa.a(this.Qa);
        this.Xc = com.soundcloud.android.settings.J.a(this.da);
        this.Yc = com.soundcloud.android.settings.streamingquality.u.a(this.Xc);
        this.Zc = C4930GMa.b(com.soundcloud.android.settings.streamingquality.s.a(this.Yc));
        this._c = C4169tc.a(this.Lc, this.rb, this.Wc, this.Db, this.Sb, this.Zc);
        this.ad = C4181vc.a(this.Nc);
        this.bd = Zd.a(this.da);
        this.cd = new C4899FMa();
        this.dd = com.soundcloud.android.sync.da.a(this.Eb, this._b, this.lb);
        this.ed = com.soundcloud.android.collection.Ba.a(this.La, this.dd, this._b, this.Eb, com.soundcloud.android.X.a(), this.kb);
        this.fd = C4930GMa.b(com.soundcloud.android.offline.Kb.a(this.Nc, this.Oc, this.fa, com.soundcloud.android.G.a(), this.kb, this.Sb));
        this.gd = Sd.a(this.fd);
        this.hd = C2858n.a(this.Kc);
        this.id = C4930GMa.b(C4000y.a(this.Lc, this.hd, com.soundcloud.android.G.a(), C2936o.a()));
        this.jd = com.soundcloud.android.W.a(this.id);
        this.kd = C2191NR.a(this.Qa, this.gb, (C7054oVa<C5694cGa>) C2947z.a());
        this.ld = C4930GMa.b(C2229PR.a(this.kd, this.fa, com.soundcloud.android.G.a()));
        this.md = com.soundcloud.android.aa.a(this.ld);
        this.nd = C5454Xta.a(this.gd, this.jd, this.md);
        this.od = C4816Cra.a(this.Fb, this.nd, this.id, this.ld, this.gd);
        this.pd = C2154LS.a(this.ed, this.Lc, this.Nb, this.od, com.soundcloud.android.G.a());
        this.qd = C5372Uya.a(this.da);
        this.rd = Gea.a(this.qd, C2947z.a());
        this.sd = C4930GMa.b(Te.a(this.Nc, this.fa, com.soundcloud.android.G.a()));
        this.td = C4930GMa.b(C3000fQ.a(this.Sa, this.la));
        this.ud = com.soundcloud.android.offline.Rb.a(this.Oa);
        this.vd = xe.a(this.td, this.ud);
        this.wd = new C4899FMa();
        this.xd = C3057iQ.a(this.Ja, this.wd);
        this.yd = C3019gQ.a(this.vd, this.xd);
        this.zd = C5401Vya.a(this.da);
        this.Ad = C2021EV.a(this.zd);
        this.Bd = C1941AV.a(C3264sV.a());
        this.Cd = C3304uV.a(this.Ad, (C7054oVa<C1961BV>) C1981CV.a(), this.Bd, (C7054oVa<HPa>) com.soundcloud.android.G.a(), this.Oa);
        this.Dd = C4930GMa.b(C4171te.a(this.Cd, this.Tc, this.da, this.Oa));
        this.Ed = new C4899FMa();
        this.Fd = new C4899FMa();
        this.Gd = new C4899FMa();
        this.Hd = Hd.a(this.Fd, this.Gd);
        this.Id = C3733n.a(C3744z.a(), C3739u.a());
        this.Jd = com.soundcloud.android.ha.a(this.da, this.Ja, this.Id);
        this.Kd = C4930GMa.b(C3741w.a());
        this.Ld = C3742x.a(this.ca, this.Sa, this.Kd);
        this.Md = ra.a(this.ja);
        this.Nd = C3725f.a(this.ja);
        this.Od = C3743y.a(this.Jd, this.Ld, this.Md, this.Nd, this.Oa);
        this.Pd = com.soundcloud.android.image.Y.a(this.Gd);
        this.Qd = C4930GMa.b(com.soundcloud.android.image.Q.a(this.Od, this.Pd, this.Md, this.Ld));
        this.Rd = C5562aKa.a(this.Sa);
        this.Sd = C5499ZJa.a(this.Rd);
        this.Td = C5441XJa.a(this.Sd, C6702jKa.a());
        this.Ud = C4930GMa.b(C2488cP.a());
        this.Vd = C5383VJa.a(this.Ud, this.Oa);
        this.Wd = C4930GMa.b(C7096oza.a(this.da, this.Vd));
        this.Xd = C6906mKa.a(this.Wd, this.Oa);
        this.Yd = C7039oGa.a(this.Da, this.Ea);
        this.Zd = C4154qe.a(this.Qd, this.ja, this.Td, this.Xd, this.Yd, this.Oa, this.ud);
        this._d = com.soundcloud.android.offline.Mb.a(this.Ga, this.Tc);
        this.ae = C7311sDa.a(this.sb);
        this.be = com.soundcloud.android.tracks.La.a(this.ab, UV.a(), com.soundcloud.android.G.a());
        this.ce = xb.a(this.rb);
        this.de = com.soundcloud.android.tracks.Jb.a(this.be, com.soundcloud.android.tracks.Ha.a(), this.wb, this.ce, XV.a(), UV.a(), ZV.a(), C0299aW.a(), com.soundcloud.android.G.a());
        this.ee = com.soundcloud.android.tracks.Kb.a(this.de);
        this.fe = com.soundcloud.android.tracks.Mb.a(this.ee);
        this.ge = C4930GMa.b(com.soundcloud.android.tracks.E.a(this.rb, this.Eb, com.soundcloud.android.G.a()));
        this.he = C5148NMa.a(JV.a(this.La, this.fe, this.ge));
        this.ie = C4766BDa.a(this.tb, this.ae, this.he, com.soundcloud.android.G.a());
        this.je = C4128mc.a(this.yd, this.Dd, this.Ed, this.Hd, com.soundcloud.android.G.a(), this.Zd, this._d, this.Tc, this.Nc, this.ae, this.Zc, this.ie, com.soundcloud.android.X.a(), this.ud);
        this.ke = Bd.a(this.Pc, this.Rc, this.Uc, this.fa, this.Sb, this.Vc, this._c, this.ad, this.bd, this.cd, this.ed, this.Eb, this.Nc, this.pd, (C7054oVa<HPa>) com.soundcloud.android.G.a(), this.rd, this.Tc, this.sd, this.je, this.ud);
        this.le = C5012JBa.a(this.Qa, this.ke, this.pb, this.Db, this.Nb);
        this.me = C5392Vpa.a(this.Qa);
        this.ne = C7721yBa.a(this.Hc, this.Ic, this.Jc, this.le, this.me, this.Tb, this._a, this.Sb, this.Xb, this.Db, this.fa, this.ta, this.hd);
        this.oe = C7514vBa.a(this.ne, this.Db);
        this.pe = C5548aAa.a(this.da);
        this.qe = C1410jW.a(this.ab, UV.a(), com.soundcloud.android.G.a());
        this.re = CW.a(this.ib);
        this.se = MW.a(this.qe, C1287fW.a(), this.jb, this.re, XV.a(), UV.a(), ZV.a(), C0299aW.a(), com.soundcloud.android.G.a());
        this.te = NW.a(this.se);
        this.ue = XW.a(this.te, this.ib);
        this.ve = C5148NMa.a(LV.a(this.La, this.ue, this.ec));
        this.we = C4930GMa.b(C7370sya.a(this.da, (C7054oVa<C3877tba>) C3893vba.a(), (C7054oVa<HPa>) com.soundcloud.android.G.a()));
        this.xe = Dba.a(this.we);
        this.ye = C4930GMa.b(C3380yR.a(this.xe, this.fa, com.soundcloud.android.G.a(), this._b, this.Eb));
        this.ze = C5171OFa.a(this.ve, this.ye, this.nd);
        this.Ae = C3260sR.a(this.fa, com.soundcloud.android.G.a(), this.ve, this.ze, this.dd, this.xe);
        this.Be = com.soundcloud.android.K.a(this.ca);
        this.Ce = C5547_za.a(this.pe, this._a, this.Ae, this.Be, this.Ud, this.xe, this.ib);
        this.De = C1977CR.a(this.Ce, this.xe);
        this.Ee = com.soundcloud.android.accounts.I.a(this.pb);
        this.Fe = C6350eBa.a(this._a, this.fa, this.Ee);
        this.Ge = C6282dBa.a(this.Fe);
        this.He = C4930GMa.b(C7232qya.a(this.da, (C7054oVa<C2840v>) C2842x.a(), (C7054oVa<HPa>) com.soundcloud.android.G.a()));
        this.Ie = com.soundcloud.android.collection.playhistory.wa.a(this.He);
        this.Je = C2789q.a(this._a);
        this.Ke = com.soundcloud.android.collection.playhistory.Ga.a(this.Ie, this._a);
        this.Le = com.soundcloud.android.collection.playhistory.Aa.a(this.Ie, this.Je, this.Ke, this.ob, this.yb, this.fa);
    }

    private C5662bpa ca() {
        C5662bpa bpa = new C5662bpa(pb(), Hd(), Ea(), C2947z.b(), Id(), (C5327TLa) this.fa.get(), Ob(), vg(), (com.soundcloud.android.sync.T) this.Eb.get(), (Ica) this.kb.get());
        return bpa;
    }

    private C3734o cb() {
        return new C3734o(ac());
    }

    private SharedPreferences cc() {
        return C5546_ya.a(X());
    }

    private C2540e d() {
        return new C2540e(h());
    }

    private C5680bya da() {
        C5680bya bya = new C5680bya(he(), Gb(), (C5327TLa) this.fa.get(), ia(), K());
        return bya;
    }

    private C3737s db() {
        return com.soundcloud.android.ha.a(X(), (C6699jHa) this.Ja.get(), bb());
    }

    private SharedPreferences dc() {
        return C5372Uya.a(X());
    }

    private C2542g e() {
        return new C2542g(he());
    }

    private com.soundcloud.android.periodic.c ea() {
        return new com.soundcloud.android.periodic.c(da());
    }

    private C7648wza<Boolean> eb() {
        return com.soundcloud.android.playback.Qc.a(pa());
    }

    private String ec() {
        return C2450aP.a(this.b, Ce());
    }

    private w f() {
        return new w(ie(), he());
    }

    private Tea fa() {
        return C5103Lya.a(X(), (C3469VY) ka(), (com.soundcloud.android.properties.j) this.la.get());
    }

    private C4612mia fb() {
        return new C4612mia(gb());
    }

    private String fc() {
        return C2393YO.a(this.b, Ce());
    }

    /* access modifiers changed from: private */
    public ActivityEnterScreenDispatcher g() {
        return new ActivityEnterScreenDispatcher(new com.soundcloud.android.main.F(), C2947z.b());
    }

    private C6676iua ga() {
        return new C6676iua(ha(), (C3824mea) this.sj.get(), com.soundcloud.android.X.b(), com.soundcloud.android.G.b());
    }

    /* access modifiers changed from: private */
    public C4726zia gb() {
        return new C4726zia(_b());
    }

    private String gc() {
        return C2339VO.a(this.b, qc());
    }

    private com.soundcloud.android.activities.E h() {
        return com.soundcloud.android.activities.F.a(Ce(), (com.soundcloud.android.image.N) this.Qd.get());
    }

    private C6880lua ha() {
        return new C6880lua(he(), fa());
    }

    private C5252Qwa hb() {
        C5252Qwa qwa = new C5252Qwa(com.soundcloud.android.Y.b(this.c), new c(), ka(), (com.soundcloud.android.properties.a) this.La.get(), Of(), Qe(), (C3760eea) this.he.get(), com.soundcloud.android.G.b());
        return qwa;
    }

    /* access modifiers changed from: private */
    public C4581ija hc() {
        return new C4581ija((com.soundcloud.android.properties.a) this.La.get());
    }

    /* access modifiers changed from: private */
    public C2586ja i() {
        return new C2586ja(m(), ia(), (Yaa) this.Nh.get());
    }

    /* access modifiers changed from: private */
    public C2031FL ia() {
        return new C2031FL((C2350WH) this.ma.get(), Ma(), (C3315vM) this.sa.get());
    }

    /* access modifiers changed from: private */
    public Fea ib() {
        return new Fea(dc(), C2947z.b());
    }

    /* access modifiers changed from: private */
    public C4709xja ic() {
        return new C4709xja((C5052KJa) this.Ki.get(), Ia());
    }

    /* access modifiers changed from: private */
    public C3678e j() {
        return C2184NK.a(Oe());
    }

    /* access modifiers changed from: private */
    public C2051GL ja() {
        return new C2051GL((C1956BQ) this.xj.get(), (C2486cN) this.Zi.get(), (C2526g) this.Fd.get(), Ud());
    }

    private Object jb() {
        return C2021EV.a(qa());
    }

    private C6970nGa jc() {
        return new C6970nGa(V(), Lf());
    }

    private C4782Boa k() {
        return new C4782Boa(new C5062Koa(), new C5536_oa());
    }

    /* access modifiers changed from: private */
    public C6495gHa ka() {
        return new C6495gHa(new C7385tHa(), u());
    }

    /* access modifiers changed from: private */
    public C4801CHa kb() {
        return new C4801CHa(X());
    }

    private C7108pGa kc() {
        return new C7108pGa(X(), (C6834lGa) this.Ga.get(), (C6766kGa) this.Fa.get());
    }

    private C5362Uoa l() {
        return new C5362Uoa(he(), C2947z.b(), vb(), qb());
    }

    /* access modifiers changed from: private */
    public C6184m la() {
        return new C6184m(Wa());
    }

    /* access modifiers changed from: private */
    public C4454gb lb() {
        return com.soundcloud.android.H.a(S());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.ads.Na m() {
        com.soundcloud.android.ads.Na na2 = new com.soundcloud.android.ads.Na(com.soundcloud.android.G.b(), (C3814lca) this.Ed.get(), Ja(), r(), (C5327TLa) this.fa.get(), ia(), C4930GMa.a(this.Fh), C2947z.b(), (t) this.Gh.get(), (com.soundcloud.android.foundation.ads.J) this.Wg.get(), md(), (com.soundcloud.android.utilities.android.k) this.ub.get());
        return na2;
    }

    private Dma ma() {
        return new Dma((C3814lca) this.Ed.get());
    }

    private C3973c mb() {
        return new C3973c(De());
    }

    /* access modifiers changed from: private */
    public C2571fb n() {
        return new C2571fb(bc(), C2947z.b());
    }

    private com.soundcloud.android.stations.T na() {
        com.soundcloud.android.stations.T t2 = new com.soundcloud.android.stations.T((kc) this.wc.get(), com.soundcloud.android.G.b(), hf(), (C3768fea) this.yb.get(), Ff(), (com.soundcloud.android.sync.T) this.Eb.get(), Ef(), ka());
        return t2;
    }

    private C7441tza nb() {
        return new C7441tza(ie());
    }

    private C2317UK o() {
        C2317UK uk2 = new C2317UK((C2280SL) this.fh.get(), (C2242QL) this.tj.get(), (C2353WK) this._j.get(), (C2486cN) this.Zi.get(), new C3371yI(), rc(), X());
        return uk2;
    }

    /* access modifiers changed from: private */
    public C5956m oa() {
        return new C5956m(eb());
    }

    /* access modifiers changed from: private */
    public C3983h ob() {
        return new C3983h((com.soundcloud.android.sync.T) this.Eb.get(), com.soundcloud.android.G.b(), Ee(), nb());
    }

    private C3314vL p() {
        return new C3314vL(Qb(), Td());
    }

    private SharedPreferences pa() {
        return C5194Oya.a(X());
    }

    /* access modifiers changed from: private */
    public C5604aua pb() {
        return com.soundcloud.android.I.a(Vf(), Hd(), ng(), (Vda) na());
    }

    /* access modifiers changed from: private */
    public dfa q() {
        return C2283SO.a(C4930GMa.a(this.Sa), this.Gd, C4930GMa.a(this.Ud), (C6699jHa) this.Ja.get(), (C2594la) this.hf.get(), qc(), (C3218qP) this.ac.get(), (C2526g) this.Fd.get(), zb(), (C7181qKa) le(), (C2137KU) this.Ca.get(), (com.soundcloud.android.properties.a) this.La.get());
    }

    private SharedPreferences qa() {
        return C5401Vya.a(X());
    }

    private C5305Spa qb() {
        return new C5305Spa(he());
    }

    /* access modifiers changed from: private */
    public efa r() {
        return C2302TO.a(q());
    }

    private C6826lBa ra() {
        return new C6826lBa(ub(), sb());
    }

    private C4163sc rb() {
        return C4169tc.a((com.soundcloud.android.collections.data.K) De(), cg(), wb(), Kd(), yc(), (e) this.Zc.get());
    }

    private com.soundcloud.android.periodic.a s() {
        return new com.soundcloud.android.periodic.a((C2288ST) this.pf.get());
    }

    /* access modifiers changed from: private */
    public dagger.android.c<Object> sa() {
        return dagger.android.d.a(Cb(), C3346xD.d());
    }

    private C7031oBa sb() {
        return C7100pBa.a(he());
    }

    private C2961dP t() {
        return new C2961dP(ec(), fc(), gc());
    }

    private Lb ta() {
        return new Lb((C6834lGa) this.Ga.get(), Fc());
    }

    private Object tb() {
        return C4181vc.a(Qf());
    }

    private C6336dua u() {
        return com.soundcloud.android.V.a(Z(), C4930GMa.a(this.gh));
    }

    private Object ua() {
        return Pb.a(xa(), Qf(), (C4165se) this.Dd.get(), zc());
    }

    private C5363Upa ub() {
        return new C5363Upa(he());
    }

    /* access modifiers changed from: private */
    public SharedPreferences v() {
        return C2056GQ.a(X());
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.offline.Qb va() {
        return new com.soundcloud.android.offline.Qb(ka());
    }

    private C5421Wpa vb() {
        return new C5421Wpa(he());
    }

    private C2618rb w() {
        C2618rb rbVar = new C2618rb(Ce(), S(), (com.soundcloud.android.image.N) this.Qd.get(), C2947z.b(), (C5327TLa) this.fa.get());
        return rbVar;
    }

    private Object wa() {
        return com.soundcloud.android.offline.Ub.a(X(), nc(), Ce());
    }

    private C5479Ypa wb() {
        return new C5479Ypa(he());
    }

    /* access modifiers changed from: private */
    public C1315gA x() {
        return C4717yia.a(X());
    }

    private Vb xa() {
        Vb vb2 = new Vb(Bf(), (C4165se) this.Dd.get(), (C3814lca) this.Ed.get(), Af(), com.soundcloud.android.G.b(), Jc(), ta(), Fc(), Qf(), za(), (e) this.Zc.get(), Fb(), com.soundcloud.android.X.b(), va());
        return vb2;
    }

    private Object xb() {
        return C6266cta.a(he());
    }

    private C4364ca y() {
        C4364ca caVar = new C4364ca((C5327TLa) this.fa.get(), md(), (C3760eea) this.he.get(), Cg(), C2936o.b());
        return caVar;
    }

    private C3038hQ ya() {
        return new C3038hQ((C6699jHa) this.Ja.get(), qc());
    }

    private Object yb() {
        return C4191xc.a((com.soundcloud.android.collections.data.K) De(), ag(), vb(), yc());
    }

    /* access modifiers changed from: private */
    public ArtworkView z() {
        return new ArtworkView(y(), ge(), E());
    }

    private C6830lDa za() {
        return new C6830lDa((com.soundcloud.android.tracks.W) this.sb.get());
    }

    /* access modifiers changed from: private */
    public C5018JHa zb() {
        return new C5018JHa(C2357WO.b(), Ce());
    }

    private void a(C2933l lVar, com.soundcloud.android.accounts.v vVar, C2264RO ro, C2016EQ eq, C3354xL xLVar, C2165MK mk2, C3339wQ wQVar, Application application) {
        this.e = new C2714o(this);
        this.f = new C2724z(this);
        this.g = new K(this);
        this.h = new W(this);
        this.i = new Y(this);
        this.j = new Z(this);
        this.k = new aa(this);
        this.l = new ba(this);
        this.m = new ca(this);
        this.n = new C2704e(this);
        this.o = new C2705f(this);
        this.p = new C2706g(this);
        this.q = new C2707h(this);
        this.r = new C2708i(this);
        this.s = new C2709j(this);
        this.t = new C2710k(this);
        this.u = new C2711l(this);
        this.v = new C2712m(this);
        this.w = new C2713n(this);
        this.x = new C2715p(this);
        this.y = new C2716q(this);
        this.z = new r(this);
        this.A = new C2717s(this);
        this.B = new C2718t(this);
        this.C = new C2719u(this);
        this.D = new C2720v(this);
        this.E = new C2721w(this);
        this.F = new C2722x(this);
        this.G = new C2723y(this);
        this.H = new A(this);
        this.I = new B(this);
        this.J = new C(this);
        this.K = new D(this);
        this.L = new E(this);
        this.M = new F(this);
        this.N = new G(this);
        this.O = new H(this);
        this.P = new I(this);
        this.Q = new J(this);
        this.R = new L(this);
        this.S = new M(this);
        this.T = new N(this);
        this.U = new O(this);
        this.V = new P(this);
        this.W = new Q(this);
        this.X = new S(this);
        this.Y = new T(this);
        this.Z = new U(this);
        this.aa = new V(this);
        this.ba = new X(this);
        this.ca = C4992IMa.a(application);
        this.da = C2944w.a(this.ca);
        this.ea = C4930GMa.b(C2412ZO.a(this.da));
        this.fa = C4930GMa.b(com.soundcloud.android.A.a());
        this.ga = C4930GMa.b(C5284Rya.a(this.da, (C7054oVa<C2041FV>) C2061GV.a()));
        this.ha = C2398YU.a(this.ga);
        this.ia = C1980CU.a(this.ga);
        this.ja = com.soundcloud.android.O.a(this.ca);
        this.ka = com.soundcloud.android.ka.a(this.ja);
        this.la = C4930GMa.b(com.soundcloud.android.properties.k.a(this.ka));
        this.ma = C4930GMa.b(C3195pL.a());
        this.na = C6482fza.a(this.da);
        this.oa = C3196pM.a(this.na);
        this.pa = C4930GMa.b(C3176oL.a(this.oa));
        this.qa = C4930GMa.b(C3109lL.a(this.da, this.pa));
        this.ra = C2187NN.a(this.qa);
        this.sa = C4930GMa.b(C3355xM.a(this.ra, this.ma));
        this.ta = C2128KL.a(this.ma, this.ra, this.sa);
        this.ua = com.soundcloud.android.D.a(lVar, this.ha, this.ia, this.la, this.ta);
        this.va = C5009Iya.a(this.da);
        this.wa = C4930GMa.b(C2361WT.a(this.va));
        this.xa = C3203pU.a(this.wa);
        this.ya = C3243rU.a(this.fa, this.ua, this.xa);
        this.za = C3018gP.a(this.ya);
        this.Aa = C2946y.a(this.la, this.pa);
        this.Ba = C2194NU.a(this.da, C2175MU.a());
        this.Ca = C4930GMa.b(C2326UU.a(this.Ba));
        this.Da = C2943v.a(this.ca);
        this.Ea = com.soundcloud.android.S.a(this.ca);
        this.Fa = C4930GMa.b(C2941t.a(this.fa));
        this.Ga = C4930GMa.b(C2942u.a(lVar, this.Da, this.Ea, this.Fa));
        this.Ha = C5148NMa.a(C2282SN.a());
        this.Ia = C2056GQ.a(this.da);
        this.Ja = C4930GMa.b(C6835lHa.a(this.da, C5496ZGa.a(), this.ka));
        this.Ka = C4930GMa.b(C2133KQ.a(this.Ha, this.Ia, this.Ja));
        this.La = C4930GMa.b(C2036FQ.a(eq, this.Ka));
        this.Ma = C4930GMa.b(C7577vya.a(this.da, (C7054oVa<C3766fca>) C3782hca.a(), (C7054oVa<HPa>) com.soundcloud.android.G.a()));
        this.Na = C3854qca.a(this.Ma);
        this.Oa = new C4899FMa();
        this.Pa = C5072Kya.a(this.da, this.Oa, this.la);
        this.Qa = C6618hza.a(this.Pa);
        this.Ra = C1225dT.a(this.Qa);
        this.Sa = new C4899FMa();
        this.Ta = C2450aP.a(ro, this.ja);
        this.Ua = C2393YO.a(ro, this.ja);
        this.Va = C2934m.a(this.ca);
        this.Wa = com.soundcloud.android.accounts.K.a(this.Va, this.da);
        this.Xa = com.soundcloud.android.accounts.M.a(this.Va);
        this.Ya = C6278cza.a(this.da);
        this.Za = C4426tb.a(this.Ya);
    }

    private void d(C2933l lVar, com.soundcloud.android.accounts.v vVar, C2264RO ro, C2016EQ eq, C3354xL xLVar, C2165MK mk2, C3339wQ wQVar, Application application) {
        this.Me = com.soundcloud.android.collection.playhistory.ya.a(this.Le, this.Ie);
        this.Ne = com.soundcloud.android.collection.recentlyplayed.Ha.a(this.He);
        this.Oe = C2815i.a(this._a);
        this.Pe = C2819k.a(this.Ne, this._a);
        this.Qe = C6018ja.a(this.wc, com.soundcloud.android.G.a(), this.uc, this.yb, this._b, this.Eb, this.dd, this.Oa);
        this.Re = com.soundcloud.android.collection.recentlyplayed.La.a(this.Ne, this.Oe, this.Pe, this.Bb, this.Fb, this.Ib, this.pb, this.fa, this.Qe);
        this.Se = com.soundcloud.android.collection.recentlyplayed.Ja.a(this.Re, this.Ne);
        this.Te = C4930GMa.b(C3850qY.a(this._b));
        this.Ue = C4930GMa.b(C7301rya.a(this.da, this.Te, (C7054oVa<HPa>) com.soundcloud.android.G.a()));
        this.Ve = C6550gza.a(this.da);
        this.We = ad.a(this.Ve);
        this.Xe = C3906xY.a(this.Ue, this.We);
        this.Ye = C3786iY.a(this._a, this.Xe, this.yb, this.pb);
        this.Ze = C3762fY.a(this.Ye);
        this._e = C4856EAa.a(this._a, this.Lc, this.hd);
        this.af = C2861q.a(this.Lc);
        this.bf = C7650xAa.a(this._e, this.af);
        this.cf = C7153pta.a(this.Vc, this.fa);
        this.df = C2434_R.a(this.cf);
        this.ef = C2491cS.a(this.df);
        this.ff = C2599mb.a(this.da);
        this.gf = C4930GMa.b(com.soundcloud.android.E.a(lVar));
        this.hf = C4930GMa.b(C2606oa.a(this.da, this.ff, this.gf, this.pa, com.soundcloud.android.G.a()));
        this.f1if = C2614qa.a(this.hf);
        this.jf = C2434_R.a(this.f1if);
        this.kf = C2491cS.a(this.jf);
        this.lf = new C4899FMa();
        this.mf = C5224Pya.a(this.da);
        this.nf = C2984eU.a(this.mf);
        this.of = new C4899FMa();
        this.pf = C4930GMa.b(C2307TT.a(this.lf, this.Fd, this.nf, this.of));
        this.qf = C2397YT.a(this.pf, this.La);
        this.rf = C2434_R.a(this.qf);
        this.sf = C2491cS.a(this.rf);
        this.tf = C2190NQ.a(this.La);
        this.uf = C2434_R.a(this.tf);
        this.vf = C2491cS.a(this.uf);
        this.wf = C3975d.a(this.Lc);
        this.xf = com.soundcloud.android.activities.h.a(this.Qa);
        this.yf = C5859v.a(this.Qa);
        this.zf = C3853qba.a(this.xe);
        this.Af = Jc.a(this.Sb);
        this.Bf = C3750dca.a(this.Na);
        this.Cf = com.soundcloud.android.stations.Q.a(this.vc, C2947z.a());
        this.Df = com.soundcloud.android.stations.Yb.a(this.Cf);
        this.Ef = com.soundcloud.android.stream.D.a(this.Qa);
        this.Ff = com.soundcloud.android.collection.recentlyplayed.r.a(this.Ne);
        this.Gf = C2795x.a(this.Ie);
        this.Hf = C6894mBa.a(this.me, this.Ic);
        this.If = C4947Gya.a(this.wf, this.xf, this.yf, this.zf, this.Af, this.Bf, this.Df, this.Ef, this.Ff, this.Gf, this.Hf);
        this.Jf = C6820kya.a(this.Qa, this.tb, this.fa, this.ta, this.If);
        this.Kf = C6956mya.a(this.Jf, this.La);
        this.Lf = C2434_R.a(this.Kf);
        this.Mf = C2491cS.a(this.Lf);
        this.Nf = Fc.a(this.je, this.Oa);
        this.Of = Ac.a(this.Nf, this.La);
        this.Pf = C2434_R.a(this.Of);
        this.Qf = C2491cS.a(this.Pf);
        C4899FMa.a(this.lb, C5148NMa.a(pa.a(this.mc, this.tc, this.yc, this.Ec, this.oe, this.De, this.Ge, this.Me, this.Se, this.Ze, this.bf, this.ef, this.kf, this.sf, this.vf, this.Mf, this.Qf)));
        this.Rf = C3155nU.a(this.pf);
        this.Sf = C2434_R.a(this.Rf);
        this.Tf = C2491cS.a(this.Sf);
        this.Uf = Dd.a(this.da, C2947z.a(), this._d);
        this.Vf = C2434_R.a(this.Uf);
        this.Wf = C2491cS.a(this.Vf);
        this.Xf = C6141y.a(this.Tf, this.Wf);
        C4899FMa.a(this.cd, com.soundcloud.android.sync.aa.a(this.ca, this.lb, this.Xf));
        C4899FMa.a(this.of, C3148nM.a(this.oa, com.soundcloud.android.G.a(), this.ab, this.cd));
        C4899FMa.a(this.lf, C2940s.a(lVar, this._a, this.ab, this.Ca, this.ua, this.xa, this.wa, this.cb, (C7054oVa<HPa>) com.soundcloud.android.G.a(), this.ya, this.db, this.fb, this.of));
        this.Yf = C5194Oya.a(this.da);
        this.Zf = C3128mL.a(this.Yf);
        this._f = C3090kL.a(this.Yf);
        this.ag = C3071jL.a(this.Yf);
        this.bg = com.soundcloud.android.cast.p.a(this.Yf);
        this.cg = com.soundcloud.android.playback.Qc.a(this.Yf);
        this.dg = C4604lia.a(this.Yf, this.Zf, this._f, this.ag, this.bg, this.cg);
        this.eg = com.soundcloud.android.Q.a((C7054oVa<com.soundcloud.android.features.record.J>) C3042hV.a(), this.ca);
        this.fg = C5488Yya.a(this.da);
        this.gg = com.soundcloud.android.ma.a(this.fg);
        this.hg = com.soundcloud.android.sync.H.a(this._b, this.Wb, this.jc, this.qc);
        this.ig = C4919GBa.a(this.Qa);
        this.jg = com.soundcloud.android.tracks.L.a(this.rb);
        this.kg = com.soundcloud.android.tracks.O.a(this.be, com.soundcloud.android.tracks.H.a(), this.wb, this.jg, XV.a(), UV.a(), ZV.a(), C0299aW.a(), com.soundcloud.android.G.a());
        this.lg = com.soundcloud.android.tracks.P.a(this.kg);
        this.mg = C6187n.a(this.lg);
        this.ng = C4930GMa.b(C4531yc.a(this.he));
        this.og = C4930GMa.b(C4355pa.a(this.Za, this.ng, this.fa));
        this.pg = com.soundcloud.android.tracks.Da.a(this.he, this.mg, this.nd, this.id, this.ld, this.og, this.gd);
        this.qg = jc.a(this.Qe, com.soundcloud.android.G.a(), this.fa, this.pg);
        this.rg = C4978Hya.a(this.da);
        this.sg = C2060GU.a(this.Ca, this.La);
        this.tg = C5148NMa.a(Bca.a(this.La, this.ua));
        this.ug = C4930GMa.b(C2750ha.a(this.rg, this.sg, this.tg));
        this.vg = C6099q.a(this.Qa);
        this.wg = C6890lza.a(this.da);
        this.xg = com.soundcloud.android.upsell.d.a(this.wg, C2947z.a());
        this.yg = C4930GMa.b(com.soundcloud.android.upsell.b.a(this.xg, this.ua));
        this.zg = C6117za.a(com.soundcloud.android.G.a(), this.ta, this.vg, this.yg);
        this.Ag = C5517Zya.a(this.da);
        this.Bg = com.soundcloud.android.settings.notifications.q.a(this.Ag, C2947z.a());
    }

    private void e(C2933l lVar, com.soundcloud.android.accounts.v vVar, C2264RO ro, C2016EQ eq, C3354xL xLVar, C2165MK mk2, C3339wQ wQVar, Application application) {
        this.Cg = C5314Sya.a(this.da);
        this.Dg = com.soundcloud.android.fcm.j.a(this.Cg, this.ka);
        this.Eg = C4930GMa.b(this.Dg);
        this.Fg = C3322vT.a(this.Qa);
        this.Gg = C6754jza.a(this.da);
        this.Hg = C2881db.a(this.Gg);
        this.Ig = C5103Lya.a(this.da, this.Oa, this.la);
        this.Jg = com.soundcloud.android.deeplinks.j.a(this.da);
        this.Kg = C6562hGa.a(this.da);
        this.Lg = C6566hKa.a(this.Td, this.Xd, C6702jKa.a(), this.Kg, this.Oa, com.soundcloud.android.G.a());
        this.Mg = com.soundcloud.android.Y.a(lVar);
        this.Ng = C7644wxa.a(this.Sa, this.Kg, this.da);
        this.Og = C7368sxa.a(this.Kg, this.da);
        this.Pg = C5428Wwa.a(this.Mg, C5457Xwa.a(), this.Oa, this.La, this.Ng, this.Og, this.he, com.soundcloud.android.G.a());
        this.Qg = com.soundcloud.android.ads.data.y.a(this.da);
        this.Rg = com.soundcloud.android.ads.data.x.a(this.Qg);
        this.Sg = com.soundcloud.android.ads.data.u.a(this.Ja, this.Rg, this.ta, this.Oa);
        this.Tg = C2524e.a(this.xe, this.Nb, this.eg, this.ha, this.ac, this.Tc, this.Zc, this.Ca, this.oa, this.gg, this.hg, this.ia, this.ig, this.Ra, this.qg, this.ug, this.zg, this.lf, this.Bg, this.Ie, this.Ne, this.Eg, this.Fg, this.Hg, this.Ig, this.Jg, this.Dd, this.Xe, this.tb, this.ae, this.Lg, this.Ed, this.id, this.Pg, C2936o.a(), this.Sg, this.ua);
        this.Ug = C4174ub.a(this.je, this.Tc, this.sd, this.Sb, this.Nc);
        this.Vg = C4930GMa.b(com.soundcloud.android.accounts.x.a(vVar));
        this.Wg = C4930GMa.b(C2646yb.a(this.ua));
        C4899FMa.a(this.Fd, C4930GMa.b(C2527h.a(this.da, this.Wa, this.Xa, this.fa, this.Za, this.lf, this.dg, this.Tg, this.Ug, this.Vg, this.gf, com.soundcloud.android.G.a(), this.kb, this.Wg)));
        C4899FMa.a(this.wd, C2340VP.a(this.Fd, C2061GV.a()));
        this.Xg = C2339VO.a(ro, this.wd);
        C4899FMa.a(this.Gd, C2980eP.a(this.Ta, this.Ua, this.Xg));
        this.Yg = C5050KHa.a(C2357WO.a(), this.ja);
        C4899FMa.a(this._a, C2283SO.a(this.Sa, this.Gd, this.Ud, this.Ja, this.hf, this.wd, this.ac, this.Fd, this.Yg, this.ka, this.Ca, this.La));
        this.Zg = C7498uta.a(this.Qa, (C7054oVa<C5694cGa>) C2947z.a());
        this._g = C7774yta.a(this._a, this.Zg, this.vb, this.cb);
        this.ah = C6266cta.a(this.Qa);
        this.bh = C7015nta.a(this.Qa);
        C4899FMa.a(this.Vc, C6742jta.a(this.Ra, this._g, this.ah, (C7054oVa<HPa>) com.soundcloud.android.G.a(), this.bh, this.ta));
        this.ch = C3838oca.a(this.da, this.Na, this.Vc, com.soundcloud.android.G.a());
        this.dh = C3798jca.a(this.Ga, this.gd);
        C4899FMa.a(this.Ed, C4930GMa.b(C3822mca.a(this.ch, this.Oa, this.dh, C2936o.a(), com.soundcloud.android.G.a())));
        this.eh = com.soundcloud.android.N.a(this.ca);
        this.fh = C4930GMa.b(C2299TL.a(this.ma));
        this.gh = C6472fua.a(this.Ca, this.Ga, this.La, this.Ed, this.ka, this.eh, this.fh, this.da);
        this.hh = com.soundcloud.android.V.a(this.Aa, this.gh);
        C4899FMa.a(this.Oa, C6563hHa.a(C7523vHa.a(), this.hh));
        C4899FMa.a(this.Sa, C4930GMa.b(C2431_O.a(this.ea, this.za, this.la, this.Oa, (C7054oVa<SocketFactory>) C3114lQ.a())));
        this.ih = C2937p.a(this.da);
        this.jh = com.soundcloud.android.playback.widget.x.a(this.da, this.ih, this.Qd, com.soundcloud.android.G.a());
        this.kh = C7510uza.a(this.gb);
        this.lh = C3985i.a(this.Eb, com.soundcloud.android.G.a(), this.hd, this.kh);
        this.mh = C2409ZL.a(this.he, this.ve, this.ta);
        this.nh = C4930GMa.b(com.soundcloud.android.playback.widget.u.a(this.da, this.jh, this.og, this.Ed, this.pg, this.lh, this.mh));
        this.oh = com.soundcloud.android.M.a(this.Ed);
        this.ph = C4930GMa.b(com.soundcloud.android.playback.widget.t.a(this.fa, this.id, this.nh, this.oh));
        this.qh = C4729zla.a(this.da, this.he);
        this.rh = C5334Tpa.a(this.Qa);
        this.sh = C5391Voa.a(this.Qa, C2947z.a(), this.Jc, this.rh);
        this.th = C5337Tsa.a(this.Qa);
        this.uh = C5275Rpa.a(this.Qa, (C7054oVa<C5694cGa>) C2947z.a());
        this.vh = C5539_ra.a(com.soundcloud.android.G.a(), this.Eb, this.Fb, this.Jc, this.sh, this.th, this.uh, this.ke, this.fa, this.Nb, com.soundcloud.android.X.a(), this.gd, this.kb, this.pd, this.ug);
        this.wh = C4930GMa.b(C4293cd.a(this.vh, this.Ed));
        this.xh = C4930GMa.b(C4288bd.a(this.oh, this.wh));
        this.yh = C4286bb.a(this.ab, this.yb, com.soundcloud.android.G.a());
        this.zh = C4930GMa.b(com.soundcloud.android.cast.n.a(this.gf, this.da));
        this.Ah = C4930GMa.b(com.soundcloud.android.cast.m.a(this.da, this.zh, this.gf));
        this.Bh = C4930GMa.b(C4311gb.a(this.Ed, this.yh, this.qg, this.Ah));
        this.Ch = C4930GMa.b(C4306fb.a(this.oh, this.Bh));
        this.Dh = com.soundcloud.android.playback.Va.a(this.ja, this.Eg, C2947z.a(), com.soundcloud.android.G.a(), this.ab);
        this.Eh = C4930GMa.b(com.soundcloud.android.ads.Bb.a(this.da));
        this.Fh = C2203OK.a(this.pa, this.Eh);
        this.Gh = C4930GMa.b(com.soundcloud.android.utilities.android.u.a(this.da, com.soundcloud.android.utilities.android.o.a()));
        this.Hh = C2567eb.a(com.soundcloud.android.G.a(), this.Ed, this.ua, this.ab, this.fa, this.ta, this.Fh, C2947z.a(), this.Gh, this.Wg, this.oh, this.ub);
        this.Ih = C4930GMa.b(com.soundcloud.android.playback.je.a(this.Ja, com.soundcloud.android.playback.Ea.a(), this.Ga, this.la));
        this.Jh = C4930GMa.b(com.soundcloud.android.ads.La.a(C2947z.a(), this.Wg));
        this.Kh = C5148NMa.a(C3852qaa.a());
        this.Lh = C4930GMa.b(com.soundcloud.android.ads.Ic.a());
        this.Mh = C5148NMa.a(C5524_Fa.a(this.da));
        this.Nh = C5148NMa.a(Zaa.a(C2947z.a(), this.Kh, this.Lh, this.Mh, this.Oa));
        this.Oh = com.soundcloud.android.ads.Db.a(this.ta, this.Nh);
        this.Ph = C2590ka.a(this.Hh, this.ta, this.Nh);
        this.Qh = C4930GMa.b(C3232rJ.a(this.Kg));
        this.Rh = C2106JI.a(this.ka);
        this.Sh = C4930GMa.b(C2028FI.a(this.Qh, this.Rh, this.Oa, this.ta, com.soundcloud.android.G.a(), C2936o.a()));
        this.Th = C3088kJ.a(this.Sh, this.Rh, this.Oa, this.ta, C2936o.a());
        this.Uh = C2241QK.a(mk2, this.La, this.Th);
        this.Vh = C4930GMa.b(C3351xI.a(this.da, this.Ja));
        this.Wh = C2222PK.a(this.Vh);
        a a2 = C5117MMa.a(2, 0);
        a2.a(this.Uh);
        a2.a(this.Wh);
        this.Xh = a2.a();
        this.Yh = C2184NK.a(this.Xh);
        this.Zh = C4930GMa.b(Gc.a(this.ta, this.Fd, this.Hh, this.ua, this.Ih, this.Ed, this.he, this.Ah, this.Ga, this.Ja, this.Jh, this.Oh, this.Ph, this.Yh, this.Nh));
        this._h = C4930GMa.b(com.soundcloud.android.comments.Fa.a());
        this.ai = C4930GMa.b(C2591kb.a(com.soundcloud.android.G.a(), this.Jh, this.Zh));
        this.bi = C4930GMa.b(C2634vb.a());
        this.ci = C4930GMa.b(com.soundcloud.android.ads.Fc.a(this.fa, this.Zh, this.Lh, this._h, this.ai, this.oh, this.ma, this.bi));
        this.di = C4930GMa.b(C7646wya.a(this.da, (C7054oVa<com.soundcloud.android.search.history.m>) com.soundcloud.android.search.history.o.a(), (C7054oVa<HPa>) com.soundcloud.android.G.a()));
        this.ei = com.soundcloud.android.search.history.I.a(this.di);
        this.fi = C4930GMa.b(com.soundcloud.android.search.history.H.a(this.fa, this.ei, com.soundcloud.android.G.a()));
        this.gi = C4930GMa.b(com.soundcloud.android.offline.Nc.a(this.fa, this.Tc, this.bd, this.ke, this.id, this.ud));
        this.hi = C4930GMa.b(com.soundcloud.android.cast.w.a(this.zh, this.Ah));
        this.ii = C5410WHa.a(this.Ea);
        this.ji = com.soundcloud.android.playback.ne.a(this.Oa);
        this.ki = C4930GMa.b(le.a(this.ji, this.Yh));
        this.li = C4930GMa.b(com.soundcloud.android.sync.J.a());
        this.mi = C4930GMa.b(com.soundcloud.android.collection.playhistory.H.a(this.fa, this.Ie, this.Ne, this.Ke, this.Pe, this.oh, com.soundcloud.android.G.a()));
        this.ni = C4930GMa.b(C4894FHa.a(this.la));
    }

    private void f(C2933l lVar, com.soundcloud.android.accounts.v vVar, C2264RO ro, C2016EQ eq, C3354xL xLVar, C2165MK mk2, C3339wQ wQVar, Application application) {
        this.oi = C4514vc.a(this.La, this.Ha, this.Ja);
        this.pi = C2945x.a(this.ii);
        this.qi = com.soundcloud.android.playback.Fc.a(this.pi);
        this.ri = Nc.a(this.Cd);
        this.si = C6822kza.a(this.da);
        this.ti = C2938q.a(this.ca);
        this.ui = com.soundcloud.android.playback.Oc.a(this.da, this.qi, this.ri, this.si, this.ti, this.La);
        this.vi = Pc.a(this.ui, this.eh, (C7054oVa<com.soundcloud.android.playback.core.d>) C4357pc.a());
        this.wi = com.soundcloud.android.playback.Yb.a(this.vi, this.La);
        this.xi = Qma.a(this.ja, this.pg, this.Qd, com.soundcloud.android.G.a());
        this.yi = C4417rc.a(this.da, this.xi);
        this.zi = com.soundcloud.android.playback.Xa.a(this.Ed, this.Ga);
        this.Ai = com.soundcloud.android.playback.Ia.a(this.og, this.zi, this.Oa);
        this.Bi = C4930GMa.b(com.soundcloud.android.playback.Ja.a(this.Ai));
        this.Ci = Wd.a(this.ua, this.Nc, this.sd);
        this.Di = C4524xa.a(this.Fd, this.Gd);
        this.Ei = com.soundcloud.android.playback.Lc.a(this.ka, this.Ja);
        this.Fi = com.soundcloud.android.playback.Mc.a(this.da, this.Ei, this.Ga, (C7054oVa<C5694cGa>) C2947z.a(), (C7054oVa<com.soundcloud.android.playback.core.d>) C4357pc.a());
        this.Gi = Fd.a(this.Di, this.Hd, this.Dd, this.ie, this.Zc, this.vi, this.Fi, this.Ga, this.Ud, this.Oa);
        this.Hi = com.soundcloud.android.playback.Pb.a(this.Gi, this.Ih, this.ki, this.Cd);
        this.Ii = com.soundcloud.android.playback.Vb.a(this.Hi);
        this.Ji = C5205PJa.a(this.ja);
        this.Ki = C4930GMa.b(C5083LJa.a(this.Ji));
        this.Li = com.soundcloud.android.playback.Sb.a(this.he, this.Ci, this.Ii, this.Tc, this.Ki);
        this.Mi = C4930GMa.b(com.soundcloud.android.playback.Q.a(this.Ed));
        this.Ni = com.soundcloud.android.playback.ui.view.h.a(this.og, this.Ki);
        this.Oi = C5957n.a(this.cg);
        this.Pi = C1929AJ.a(this.ab, com.soundcloud.android.G.a(), this.Gh, this.Wg, this.ub);
        this.Qi = C4930GMa.b(C1969CJ.a());
        this.Ri = C2202OJ.a(this.Sg, this.Pi, this.Qi, com.soundcloud.android.G.a(), C2947z.a(), this.Ga, this.Ja, this.Oa, this.ta);
        this.Si = C2270RU.a(this.Ca, this.La);
        this.Ti = com.soundcloud.android.ads.Pc.a(this.ua, this.Jh, this.Ah, this.he, this.Ri, C2947z.a(), this.Si, this.Ed, com.soundcloud.android.G.a());
        this.Ui = C4930GMa.b(C4315ha.a(this.og, this.Bi, this.da, this.Li, this.Ed, this.Mi, this.ng, this.fa, this.ta, this.Zh, this.Hh, this.Ni, this.Oi, this.Yh, this.Ti, this.Nh, C2936o.a()));
        this.Vi = C4341mb.a(this.Ed, this.Vc);
        this.Wi = C3882uY.a(this.Ue, this.We);
        this.Xi = com.soundcloud.android.discovery.systemplaylist.F.a(this.ab, com.soundcloud.android.G.a(), this.Xe, this.Wi, this.he, this.yb);
        this.Yi = C4930GMa.b(C4347nc.a(this.oh, this.Ui, this.Ed, this.Vi, this.Li, this.xi, this.Zh, this.Mi, this.og, this.vh, this.Xi, C2936o.a()));
        this.Zi = C4930GMa.b(C2959dN.a(this.fa, this.Ed, this.Hh));
        this._i = C4930GMa.b(C4303ed.a(this.Ed));
        this.aj = C3112lO.a(C2947z.a());
        this.bj = C4930GMa.b(C3055iO.a(this.aj, this.ab, com.soundcloud.android.G.a(), this.La));
        this.cj = C4930GMa.b(com.soundcloud.android.playback.F.a(this.ti, C5496ZGa.a()));
        this.dj = C4930GMa.b(com.soundcloud.android.playback.Xd.a(this.fa, this.he, this.Ed, this.Zi, this._i, C5696cIa.a(), this.nd, this.bj, this.cj, this.ta));
        this.ej = com.soundcloud.android.playback.B.a(this.ta, this.Nh, this._i, this.Yh);
        this.fj = C4930GMa.b(C4530yb.a(this.dj, this.ej, this.Ed, this.Hh));
        this.gj = ge.a(this.Yh, this.ki, this.ta);
        this.hj = C4930GMa.b(com.soundcloud.android.playback.Bb.a(this.fj, this.gj, this.Zh, this.Za, C5696cIa.a()));
        this.ij = C4704wna.a(C4357pc.a());
        this.jj = C3221qS.a(this.Ud, C4357pc.a());
        this.kj = com.soundcloud.android.cast.o.a(this.Fd);
        this.lj = C4930GMa.b(C3301uS.a(this.jj, this.kj, com.soundcloud.android.X.a(), C4357pc.a()));
        this.mj = C4930GMa.b(com.soundcloud.android.cast.s.a());
        this.nj = Ema.a(this.Ed);
        this.oj = com.soundcloud.android.playback.players.n.a(this.nj);
        this.pj = C3401zS.a(this.da, this.ij, this.lj, this.Ed, this.og, this.mj, com.soundcloud.android.cast.u.a(), this.Hh, C4357pc.a(), this.fa, this.oj);
        this.qj = C4930GMa.b(com.soundcloud.android.P.a(this.oi, this.wi, this.yi, this.Yi, this.hj, (C7054oVa<C4352oc>) C4357pc.a(), this.pj));
        this.rj = C4930GMa.b(C4528y.a(this.fa, this.Ui, C2936o.a()));
        this.sj = C4930GMa.b(com.soundcloud.android.B.a());
        this.tj = C4930GMa.b(C2261RL.a(this.ma, this.fh));
        this.uj = C4854Dya.a(this.da);
        this.vj = C3234rL.a(this.ka);
        this.wj = C2931j.a(this.da);
        this.xj = C4930GMa.b(C3359xQ.a(wQVar, this.da, this.wj));
        this.yj = C2467bN.a(this.xj, this.Zi);
        this.zj = C2391YM.a(this.xj, this.yj, this.kb, this.da);
        this.Aj = C2262RM.a(this.ta, this.la, this.da);
        this.Bj = C2224PM.a(this.Aj);
        this.Cj = C5148NMa.a(C3073jN.a(this.da));
        this.Dj = C3052iL.a(this.Cj, this.ub, this.Mh, this.Oa);
        this.Ej = C4930GMa.b(C3336wN.a(this.da, this.Aa));
        this.Fj = C3276tN.a(this.la, this.Ej, this.sj);
        this.Gj = C2012EM.a(this.da);
        this.Hj = C3374yL.a(xLVar, this.Gj);
        this.Ij = C2148LM.a(this.Hj, this.Ga);
        this.Jj = C2204OL.a(this.Ja, this.la);
        this.Kj = C2336VL.a(this.Jj);
        this.Lj = C2166ML.a(this.Fd);
        this.Mj = C1991DL.a(this.Sa, this.Jj, this.Lj, this.Oa);
        this.Nj = C2375XO.a(ro, this.ja);
        this.Oj = C2372XL.a(this.Sa, this.Kj, this.Oa, this.Mj, this.Nj, C3033hL.a(), this.Zf);
        this.Pj = C2072HM.a(this.Ga, this.Ij, this.Oj, this.Oa);
        this.Qj = C4930GMa.b(C2447aM.a(this.Pj));
        this.Rj = C2149LN.a(this.ja, this.Ja, this.Ga, this.Fd, this.Ud, this.ua, this.Ca, C5696cIa.a());
        this.Sj = C4930GMa.b(C1973CN.a());
        this.Tj = C2033FN.a(this.Qj, this.Rj, this.Sj, this.Zf, this._f, this.ag);
        this.Uj = C2131KO.a(this.Qj);
        this.Vj = C3376yN.a(this.da, this.La);
        this.Wj = C2298TK.a(this.Qj, this.Vj);
        this.Xj = C1931AL.a(this.Tj, this.Uj, this.Wj);
        this.Yj = C3294uL.a(this.vj, this.zj, this.Bj, this.Dj, this.Fj, this.Xj, this.pa);
        this.Zj = C3014gL.a(this.uj, this.Yj, this.fa, this.ma);
        this._j = C4930GMa.b(C2976eL.a(this.Zj, C2936o.a(), this.Oa));
        this.ak = C6134q.a(this.Fd, this._b, this.lb, this.cc);
        this.bk = C6131n.a(this._b);
        this.ck = com.soundcloud.android.sync.F.a(this.da, this.ak, this.bk);
        this.dk = C4930GMa.b(C3061iV.a());
        this.ek = C4930GMa.b(C3317vO.a());
        this.fk = Cja.a(this.ab, com.soundcloud.android.G.a(), this.yb, this.Fb, this.pb, this.rb, this.Db, this.ib, this.wc);
        this.gk = com.soundcloud.android.playback.Ib.a(this.Ed, this.Ui, this.Vi, C2936o.a());
        this.hk = com.soundcloud.android.onboarding.t.a(this.ta);
    }

    private void g(C2933l lVar, com.soundcloud.android.accounts.v vVar, C2264RO ro, C2016EQ eq, C3354xL xLVar, C2165MK mk2, C3339wQ wQVar, Application application) {
        this.ik = C2939r.a((C7054oVa<C2041FV>) C2061GV.a());
        this.jk = com.soundcloud.android.onboarding.auth.ja.a(this.da, this._a, this.wd, this.lf, this.hk, this.Fd, this.Yg, this.ik);
        this.kk = C4930GMa.b(C4572hia.a(this.da, this.fk, C4573hja.a(), this.Fd, this.gk, this.Ed, this.ua, com.soundcloud.android.deeplinks.d.a(), this.jk, mc.a(), this.la, this.ta, this.Tc, this.kb, C3156nV.a(), C2936o.a()));
        this.lk = C4930GMa.b(C4727zja.a(this.kk));
        this.mk = C4930GMa.b(C5078LEa.a());
        this.nk = com.soundcloud.android.activities.m.a(this.Pb, this.Eb, com.soundcloud.android.G.a());
        this.ok = com.soundcloud.android.activities.u.a(C2936o.a(), this.nk);
        this.pk = C4930GMa.b(C6954mxa.a(this.ta, C6478fxa.a(), this.he, this.Fb, this.Mg, this.Ga));
        this.qk = C4930GMa.b(C6191p.a(this.pk, this.Ki));
        this.rk = C5274Roa.a(C2936o.a(), this.vh, this.ua, com.soundcloud.android.X.a());
        this.sk = C5800j.a(C6229s.a());
        this.tk = com.soundcloud.android.profile.A.a(this.ab);
        this.uk = com.soundcloud.android.I.a(this.pg, this.od, this.ze, this.Qe);
        this.vk = se.a(this.yb, this.Fb, this.pb);
        this.wk = Id.a(this.tk, com.soundcloud.android.G.a(), this.pb, this.uk, this.vk, this.fa);
        this.xk = C5846sb.a(this.wk, this.lk, this.fh, C2936o.a());
        this.yk = C4930GMa.b(com.soundcloud.android.search.Ka.a(this.ta));
        this.zk = C6108v.a(this.Qa, C2947z.a());
        this.Ak = C6068aa.a(this.Ob, this.dd, this.zk, com.soundcloud.android.G.a(), this.yg, this.tg, this.uk);
        this.Bk = C6095o.a(this.Qd);
        this.Ck = Sc.a(this.da, this.Ga, (C7054oVa<C5694cGa>) C2947z.a(), (C7054oVa<com.soundcloud.android.playback.core.d>) C4357pc.a());
        this.Dk = Rc.a(this.Ck);
        this.Ek = com.soundcloud.android.ads.Aa.a(this.ej);
        this.Fk = C4930GMa.b(com.soundcloud.android.ads.Ha.a());
        this.Gk = C4930GMa.b(com.soundcloud.android.ads.Ea.a(this.Dk, this.fa, this.Yh, this.Ek, this.Fk, this.Nh, this.Ui, C2947z.a(), this.Ii, this.ki, this.ta));
        this.Hk = com.soundcloud.android.ads.Ub.a(this.fa, this.ta, this.Nh, this.Gk);
        this.Ik = com.soundcloud.android.ads.Sb.a(C2947z.a(), this.fa);
        this.Jk = C4930GMa.b(hd.a(this.Hh, this.Yh, this.Hk, this.Ik, this.Fk, this.Gk, this.ua, C2947z.a(), this.fa, this.ta));
        this.Kk = C6076ea.a(this.fa, this.ta);
        this.Lk = C6072ca.a(this.Kk);
        this.Mk = pd.a(this.lk, this.ua, this.ta);
        this.Nk = jb.a(this.zg, this.Ak, this.Bk, this.Jk, this.Lk, this.lk, this.ta, this.Ae, this.Mk, this.ki, this.yg, this.Nh, this.gk, C2936o.a());
        this.Ok = com.soundcloud.android.likes.K.a(this.Lc, com.soundcloud.android.G.a(), this.pg, this.id, this.ed);
        this.Pk = C4076de.a(this.Tc);
        this.Qk = C4430ua.a(this.Ni, this.fa);
        this.Rk = com.soundcloud.android.likes.Ga.a(this.Ok, this.pg, this.ua, this.ke, this.Pk, this.Ga, this.gk, this.Qk, this.lk, this.Tc, this.ta, this.gd, C2936o.a());
        this.Sk = com.soundcloud.android.offline.Pd.a(this.ke, this.fh, this.ta);
        this.Tk = com.soundcloud.android.settings.T.a(this.lk, this.fa, this.ta, this.ua);
        this.Uk = com.soundcloud.android.settings.streamingquality.p.a(this.da, this.Zc, this.ua, this.Oa, this.lk, this.fa, this.ta, com.soundcloud.android.X.a(), C2936o.a());
        this.Vk = C5989v.a(this.Dd, this.Tc);
        this.Wk = com.soundcloud.android.settings.offline.G.a(this.da, this.Vk, this.Tc, this.ke, this.gd, com.soundcloud.android.X.a(), this.ua, this.Oa, this.la, this.ta, this.lk, this.Zc, C2936o.a());
        this.Xk = com.soundcloud.android.settings.privacy.x.a(this.lk, this.da, this.of);
        this.Yk = C5980k.a(this.lk, this.da, this.of);
        this.Zk = com.soundcloud.android.settings.privacy.K.a(this.lk, this.da, this.of);
        this._k = C3147nL.a(this.La, this.ek, (C7054oVa<C1934AO>) C1954BO.a());
        this.al = com.soundcloud.android.stations.Aa.a(this.qg, this.fa, this._k, this.Ed, this.ta, com.soundcloud.android.X.a(), C2936o.a());
        this.bl = C6037pb.a(this.qg, C6057wb.a(), this.gk, this._k, this.ta, this.tj, this.oh, C2936o.a());
        this.cl = com.soundcloud.android.search.history.z.a(this.ei, this.ta, this.fh, C2936o.a());
        this.dl = com.soundcloud.android.search.Ca.a(this.ab, com.soundcloud.android.G.a(), this.yb, this.pb, this.Db);
        this.el = C5935t.a(this.dl, this.pg, this.od, this.ze);
        this.fl = C5915ia.a(this.el, this.yk, this.fh, this.gk, this.mh, this.Ae, C2936o.a());
        this.gl = C5411WIa.a(this.gk, this.Qk, this.lk);
        this.hl = C6952mwa.a(this.Lc, this.Nb, this.he, this.Fb, this.xe, this.ve);
        this.il = C7573vwa.a(this.ab, com.soundcloud.android.G.a(), this.hl, this.Fd, C7297rwa.a());
        this.jl = com.soundcloud.android.search.suggestions.searchsuggestions.k.a(C2936o.a(), this.gl, this.ta, this.il);
        this.kl = com.soundcloud.android.discovery.systemplaylist.C.a(this.og, this.uk);
        this.ll = com.soundcloud.android.discovery.systemplaylist.U.a(this.Xi, this.kl, this.gk, this.ta, C2936o.a());
        this.ml = C2784l.a(this.Ie, this._a);
        this.nl = com.soundcloud.android.collection.playhistory.ja.a(this.gk, this.Ie, com.soundcloud.android.G.a(), this.dd, this.ml, this.he, this.pg, this.kb);
        this.ol = C2807e.a(this._a, this.Ne);
        this.pl = C2802ba.a(this.Ne, com.soundcloud.android.G.a(), this.dd, this.ol, this.ze, this.od, this.Qe, this.kb);
        this.ql = C2306TS.a(this.fa, this.id, this.pd);
        this.rl = C2744ea.a(this.fa, this.ed, this.Qe, this.nl, this.pl, this.ql, this.he, this.id, this.Lc, this.ug, com.soundcloud.android.G.a());
        this.sl = com.soundcloud.android.collection.F.a(this.ua, this.ug, this.pg);
        this.tl = com.soundcloud.android.stations.Ha.a(this.lk, this._k);
        this.ul = com.soundcloud.android.collection.va.a(this.rl, this.sl, this.nl, this.Qk, this.ug, this.lk, this.tl, this.ta, C2936o.a());
        this.vl = com.soundcloud.android.collection.playhistory.ta.a(this.nl, this._k, this.Qk, this.fa, this.ta, this.Ki, C2936o.a());
        this.wl = com.soundcloud.android.collection.recentlyplayed.ra.a(this.pl, this.fa, this.ta, this.fh, this.lk, this.tl, this.Ki, this._k, C2936o.a());
        this.xl = com.soundcloud.android.comments.lb.a(this.ab, com.soundcloud.android.G.a(), this.pb, this.he);
        this.yl = C4930GMa.b(com.soundcloud.android.comments.Cb.a(this.xl, this.Hg));
        this.zl = C4930GMa.b(C3299uQ.a());
        this.Al = C4930GMa.b(C3955bia.a(this.sg));
        this.Bl = Xha.a(this.sg);
        this.Cl = C4930GMa.b(_ha.a(this.Al, this.Bl, com.soundcloud.android.main.N.a()));
        this.Dl = C4792Bya.a(this.da);
        this.El = C2575gb.a(this.Dl, C2947z.a());
        this.Fl = C4930GMa.b(com.soundcloud.android.ads.Vc.a(this.Zh, this.Jk, this.Hh, this.og, this.lk, this.El, this.ta));
        this.Gl = C4930GMa.b(C5265RJa.a());
        this.Hl = C4930GMa.b(com.soundcloud.android.ads.Da.a(this.fa, this.Hh, this.Ui, this.oh));
        this.Il = C3540f.a(this.ka, this.Eg, this.gf);
        this.Jl = C4930GMa.b(this.Il);
        this.Kl = C4930GMa.b(C4540dia.a((C7054oVa<C4580iia>) C4588jia.a()));
        this.Ll = com.soundcloud.android.fcm.n.a(C3264sV.a());
        this.Ml = C3536b.a(this.Ud, this.hd);
        this.Nl = com.soundcloud.android.fcm.l.a(this.Ud, this.Eb, this.La, this.Oa);
        this.Ol = com.soundcloud.android.playback.L.a(this._i, this.Ui, this.og, this.Ah, this.Ni);
        this.Pl = C3538d.a(this.Ol, this.Eg, this.kb);
        this.Ql = C4589jja.a(this.La);
        this.Rl = com.soundcloud.android.fcm.C.a(this.Ki, this.da, this.Ql, this.La);
        this.Sl = com.soundcloud.android.fcm.F.a(this.Vc);
        this.Tl = C4930GMa.b(C3542h.a(this.Ll, this.Oa, this.Ml, this.Nl, this.Pl, this.Rl, this.Sl, this.ka));
        this.Ul = C3866sY.a(this.dd, this.Wi, this.Xe, this.he, this.ve, com.soundcloud.android.G.a(), this.tg);
        this.Vl = C3610f.a(this.Lc, this.pg, com.soundcloud.android.G.a(), this.ed);
        this.Wl = Oba.a(this.ja, this.Ul, this.nl, this.Vl, this.ug, this.pd, this.Pd, com.soundcloud.android.G.a(), C2936o.a());
        this.Xl = com.soundcloud.android.L.a(this.ca);
        this.Yl = com.soundcloud.android.H.a(this.Xl);
        this.Zl = com.soundcloud.android.features.discovery.G.a(this.Ul, this.ta, C3810lY.a(), this.gk, this.fa, C2936o.a());
        this._l = com.soundcloud.android.comments.X.a(this.ze, this.kb);
        this.am = com.soundcloud.android.comments.Ca.a(this.fa, this.ta, this.yl, this._l, this._h, com.soundcloud.android.X.a(), com.soundcloud.android.G.a(), C2936o.a());
        this.bm = C4930GMa.b(C5020JJa.a(this.Ji));
    }

    private void h(C2933l lVar, com.soundcloud.android.accounts.v vVar, C2264RO ro, C2016EQ eq, C3354xL xLVar, C2165MK mk2, C3339wQ wQVar, Application application) {
        this.cm = com.soundcloud.android.playback.Uc.a(this.Qd, this.ja, (C7054oVa<HPa>) com.soundcloud.android.G.a(), this.Ja);
        this.dm = C4930GMa.b(com.soundcloud.android.playback.ui.Ub.a(this.ta));
    }

    public C7080ora b() {
        C7080ora ora = new C7080ora(Md(), pd(), Id(), gd(), (C5327TLa) this.fa.get(), xc(), ia(), ob(), ca(), Ae(), Ja(), Fc(), Cd(), C2936o.b(), (com.soundcloud.android.sync.T) this.Eb.get());
        return ora;
    }

    public C5773dc c() {
        return new C5773dc(vg(), ia(), com.soundcloud.android.X.b(), C2936o.b());
    }

    @CanIgnoreReturnValue
    private SyncAdapterService b(SyncAdapterService syncAdapterService) {
        com.soundcloud.android.sync.E.a(syncAdapterService, this.ck);
        return syncAdapterService;
    }

    public void a(SyncAdapterService syncAdapterService) {
        b(syncAdapterService);
    }

    @CanIgnoreReturnValue
    private BugReporterTileService b(BugReporterTileService bugReporterTileService) {
        com.soundcloud.android.da.a(bugReporterTileService, G());
        return bugReporterTileService;
    }

    public void a(BugReporterTileService bugReporterTileService) {
        b(bugReporterTileService);
    }

    @CanIgnoreReturnValue
    private PlayerWidgetReceiver b(PlayerWidgetReceiver playerWidgetReceiver) {
        com.soundcloud.android.playback.widget.y.a(playerWidgetReceiver, (com.soundcloud.android.playback.widget.l) this.nh.get());
        return playerWidgetReceiver;
    }

    public void a(PlayerWidgetReceiver playerWidgetReceiver) {
        b(playerWidgetReceiver);
    }

    @CanIgnoreReturnValue
    private PlayerAppWidgetProvider b(PlayerAppWidgetProvider playerAppWidgetProvider) {
        com.soundcloud.android.playback.service.a.a(playerAppWidgetProvider, (com.soundcloud.android.playback.widget.l) this.nh.get());
        return playerAppWidgetProvider;
    }

    public void a(PlayerAppWidgetProvider playerAppWidgetProvider) {
        b(playerAppWidgetProvider);
    }

    @CanIgnoreReturnValue
    private UploadService b(UploadService uploadService) {
        com.soundcloud.android.creators.upload.x.a(uploadService, hg());
        com.soundcloud.android.creators.upload.x.a(uploadService, q());
        com.soundcloud.android.creators.upload.x.a(uploadService, (C2350WH) this.dk.get());
        com.soundcloud.android.creators.upload.x.a(uploadService, C3042hV.b());
        com.soundcloud.android.creators.upload.x.a(uploadService, (C3700b) ia());
        return uploadService;
    }

    public void a(UploadService uploadService) {
        b(uploadService);
    }

    public void a(AuthenticatorService authenticatorService) {
        b(authenticatorService);
    }

    public void a(LogoutFragment logoutFragment) {
        b(logoutFragment);
    }

    public void a(com.soundcloud.android.onboarding.auth.E e2) {
        b(e2);
    }

    public void a(OnboardActivity onboardActivity) {
        b(onboardActivity);
    }

    @CanIgnoreReturnValue
    private AuthenticatorService b(AuthenticatorService authenticatorService) {
        com.soundcloud.android.onboarding.auth.G.a(authenticatorService, Xe());
        return authenticatorService;
    }

    public void a(AlmostDoneLayout almostDoneLayout) {
        b(almostDoneLayout);
    }

    @CanIgnoreReturnValue
    private LogoutFragment b(LogoutFragment logoutFragment) {
        com.soundcloud.android.accounts.D.a(logoutFragment, (C5327TLa) this.fa.get());
        com.soundcloud.android.accounts.D.a(logoutFragment, (C2526g) this.Fd.get());
        com.soundcloud.android.accounts.D.a(logoutFragment, Ja());
        return logoutFragment;
    }

    public void a(ActivitiesFragment activitiesFragment) {
        b(activitiesFragment);
    }

    public void a(MetadataFragment metadataFragment) {
        b(metadataFragment);
    }

    public void a(com.soundcloud.android.view.C c2) {
        b(c2);
    }

    @CanIgnoreReturnValue
    private com.soundcloud.android.onboarding.auth.E b(com.soundcloud.android.onboarding.auth.E e2) {
        com.soundcloud.android.onboarding.auth.F.a(e2, (C6834lGa) this.Ga.get());
        com.soundcloud.android.onboarding.auth.F.a(e2, (C2526g) this.Fd.get());
        com.soundcloud.android.onboarding.auth.F.a(e2, q());
        com.soundcloud.android.onboarding.auth.F.a(e2, (com.soundcloud.android.sync.T) this.Eb.get());
        com.soundcloud.android.onboarding.auth.F.a(e2, Se());
        com.soundcloud.android.onboarding.auth.F.a(e2, Te());
        com.soundcloud.android.onboarding.auth.F.a(e2, (C3800jea) this.pb.get());
        com.soundcloud.android.onboarding.auth.F.a(e2, (com.soundcloud.android.properties.a) this.La.get());
        return e2;
    }

    public void a(C6274cxa cxa) {
        b(cxa);
    }

    public void a(C5486Ywa ywa) {
        b(ywa);
    }

    public void a(CastOptionsProvider castOptionsProvider) {
        b(castOptionsProvider);
    }

    public void a(CastMediaIntentReceiver castMediaIntentReceiver) {
        b(castMediaIntentReceiver);
    }

    public void a(LikeInNotificationBroadcastReceiver likeInNotificationBroadcastReceiver) {
        b(likeInNotificationBroadcastReceiver);
    }

    public void a(PlayQueueFragment playQueueFragment) {
        b(playQueueFragment);
    }

    public void a(C4875Eoa eoa) {
        b(eoa);
    }

    public void a(C5449Xoa xoa) {
        b(xoa);
    }

    @CanIgnoreReturnValue
    private OnboardActivity b(OnboardActivity onboardActivity) {
        com.soundcloud.android.onboarding.r.a(onboardActivity, com.soundcloud.android.C.a());
        com.soundcloud.android.onboarding.r.a(onboardActivity, com.soundcloud.android.accounts.w.a());
        com.soundcloud.android.onboarding.r.a(onboardActivity, (com.facebook.login.D) this.Vg.get());
        com.soundcloud.android.onboarding.r.a(onboardActivity, (C2288ST) this.pf.get());
        com.soundcloud.android.onboarding.r.a(onboardActivity, (com.soundcloud.android.properties.j) this.la.get());
        com.soundcloud.android.onboarding.r.a(onboardActivity, (C7181qKa) le());
        com.soundcloud.android.onboarding.r.a(onboardActivity, G());
        com.soundcloud.android.onboarding.r.a(onboardActivity, (C5327TLa) this.fa.get());
        com.soundcloud.android.onboarding.r.a(onboardActivity, hc());
        com.soundcloud.android.onboarding.r.a(onboardActivity, qc());
        com.soundcloud.android.onboarding.r.a(onboardActivity, Oc());
        com.soundcloud.android.onboarding.r.a(onboardActivity, (C7730yHa) this.gf.get());
        com.soundcloud.android.onboarding.r.a(onboardActivity, n());
        com.soundcloud.android.onboarding.r.a(onboardActivity, (C6699jHa) this.Ja.get());
        com.soundcloud.android.onboarding.r.a(onboardActivity, (com.soundcloud.android.properties.a) this.La.get());
        com.soundcloud.android.onboarding.r.a(onboardActivity, Kc());
        com.soundcloud.android.onboarding.r.a(onboardActivity, (C4655rja) this.lk.get());
        com.soundcloud.android.onboarding.r.a(onboardActivity, ic());
        com.soundcloud.android.onboarding.r.a(onboardActivity, (C3700b) ia());
        com.soundcloud.android.onboarding.r.a(onboardActivity, (ActivityLightCycle) this.sa.get());
        return onboardActivity;
    }

    public void a(C5000Ipa ipa) {
        b(ipa);
    }

    public void a(ProfileFragment profileFragment) {
        b(profileFragment);
    }

    public void a(ProfileBucketsFragment profileBucketsFragment) {
        b(profileBucketsFragment);
    }

    public void a(UserPlaylistsFragment userPlaylistsFragment) {
        b(userPlaylistsFragment);
    }

    public void a(UserLikesFragment userLikesFragment) {
        b(userLikesFragment);
    }

    public void a(UserTracksFragment userTracksFragment) {
        b(userTracksFragment);
    }

    public void a(UserDetailsFragment userDetailsFragment) {
        b(userDetailsFragment);
    }

    public void a(UserAlbumsFragment userAlbumsFragment) {
        b(userAlbumsFragment);
    }

    public void a(UserRepostsFragment userRepostsFragment) {
        b(userRepostsFragment);
    }

    public void a(UserFollowingsFragment userFollowingsFragment) {
        b(userFollowingsFragment);
    }

    public void a(UserFollowersFragment userFollowersFragment) {
        b(userFollowersFragment);
    }

    public void a(SearchFragment searchFragment) {
        b(searchFragment);
    }

    public void a(StreamFragment streamFragment) {
        b(streamFragment);
    }

    public void a(C6170ha haVar) {
        b(haVar);
    }

    public void a(com.soundcloud.android.comments.Ga ga2) {
        b(ga2);
    }

    public void a(OfflineContentService offlineContentService) {
        b(offlineContentService);
    }

    public void a(Od od2) {
        b(od2);
    }

    public void a(MediaMountedReceiver mediaMountedReceiver) {
        b(mediaMountedReceiver);
    }

    public void a(com.soundcloud.android.upgrade.n nVar) {
        b(nVar);
    }

    public void a(GoOffboardingFragment goOffboardingFragment) {
        b(goOffboardingFragment);
    }

    @CanIgnoreReturnValue
    private AlmostDoneLayout b(AlmostDoneLayout almostDoneLayout) {
        C4222u.a(almostDoneLayout, Sc());
        return almostDoneLayout;
    }

    public void a(UploadMonitorFragment uploadMonitorFragment) {
        b(uploadMonitorFragment);
    }

    @CanIgnoreReturnValue
    private ActivitiesFragment b(ActivitiesFragment activitiesFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) activitiesFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) activitiesFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) activitiesFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.activities.k.a(activitiesFragment, d());
        com.soundcloud.android.activities.k.a(activitiesFragment, C4930GMa.a(this.ok));
        com.soundcloud.android.activities.k.a(activitiesFragment, hc());
        return activitiesFragment;
    }

    public void a(com.soundcloud.android.creators.upload.p pVar) {
        b(pVar);
    }

    public void a(com.soundcloud.android.creators.upload.l lVar) {
        b(lVar);
    }

    public void a(TrackLikesUniflowFragment trackLikesUniflowFragment) {
        b(trackLikesUniflowFragment);
    }

    public void a(SettingsFragment settingsFragment) {
        b(settingsFragment);
    }

    public void a(C5954k kVar) {
        b(kVar);
    }

    public void a(C5969p pVar) {
        b(pVar);
    }

    @CanIgnoreReturnValue
    private MetadataFragment b(MetadataFragment metadataFragment) {
        com.soundcloud.android.creators.upload.n.a(metadataFragment, Jb());
        return metadataFragment;
    }

    public void a(BasicSettingsFragment basicSettingsFragment) {
        b(basicSettingsFragment);
    }

    @CanIgnoreReturnValue
    private com.soundcloud.android.view.C b(com.soundcloud.android.view.C c2) {
        com.soundcloud.android.view.D.a(c2, X());
        com.soundcloud.android.view.D.a(c2, (com.soundcloud.android.image.N) this.Qd.get());
        return c2;
    }

    public void a(StreamingQualitySettingsFragment streamingQualitySettingsFragment) {
        b(streamingQualitySettingsFragment);
    }

    public void a(OfflineSettingsFragment offlineSettingsFragment) {
        b(offlineSettingsFragment);
    }

    @CanIgnoreReturnValue
    private C6274cxa b(C6274cxa cxa) {
        C6546gxa.a(cxa, new b());
        C6546gxa.a(cxa, (C6614hxa) this.pk.get());
        C6546gxa.a(cxa, (C3700b) ia());
        C6546gxa.a(cxa, (C3469VY) ka());
        return cxa;
    }

    public void a(com.soundcloud.android.settings.notifications.l lVar) {
        b(lVar);
    }

    public void a(AnalyticsSettingsFragment analyticsSettingsFragment) {
        b(analyticsSettingsFragment);
    }

    public void a(AdvertisingSettingsFragment advertisingSettingsFragment) {
        b(advertisingSettingsFragment);
    }

    public void a(CommunicationsSettingsFragment communicationsSettingsFragment) {
        b(communicationsSettingsFragment);
    }

    @CanIgnoreReturnValue
    private C5486Ywa b(C5486Ywa ywa) {
        C5678bxa.a(ywa, (C5052KJa) this.Ki.get());
        C5678bxa.a(ywa, hb());
        C5678bxa.a(ywa, com.soundcloud.android.G.b());
        C5678bxa.b(ywa, C2936o.b());
        C5678bxa.a(ywa, (C6614hxa) this.pk.get());
        C5678bxa.a(ywa, (C3700b) ia());
        C5678bxa.a(ywa, (C3469VY) ka());
        return ywa;
    }

    public void a(LikedStationsFragment likedStationsFragment) {
        b(likedStationsFragment);
    }

    public void a(StationInfoFragment stationInfoFragment) {
        b(stationInfoFragment);
    }

    public void a(SearchHistoryFragment searchHistoryFragment) {
        b(searchHistoryFragment);
    }

    public void a(com.soundcloud.android.search.Ta ta2) {
        b(ta2);
    }

    public void a(SearchResultsFragment searchResultsFragment) {
        b(searchResultsFragment);
    }

    public void a(SearchSuggestionsUniflowFragment searchSuggestionsUniflowFragment) {
        b(searchSuggestionsUniflowFragment);
    }

    public void a(SystemPlaylistFragment systemPlaylistFragment) {
        b(systemPlaylistFragment);
    }

    @CanIgnoreReturnValue
    private CastOptionsProvider b(CastOptionsProvider castOptionsProvider) {
        com.soundcloud.android.cast.q.a(castOptionsProvider, I());
        return castOptionsProvider;
    }

    public void a(CollectionFragment collectionFragment) {
        b(collectionFragment);
    }

    @CanIgnoreReturnValue
    private CastMediaIntentReceiver b(CastMediaIntentReceiver castMediaIntentReceiver) {
        com.soundcloud.android.cast.k.a(castMediaIntentReceiver, (C4412qb) this.Ui.get());
        return castMediaIntentReceiver;
    }

    public void a(com.soundcloud.android.collection.Da da2) {
        b(da2);
    }

    @CanIgnoreReturnValue
    private LikeInNotificationBroadcastReceiver b(LikeInNotificationBroadcastReceiver likeInNotificationBroadcastReceiver) {
        C3977e.a(likeInNotificationBroadcastReceiver, (C3814lca) this.Ed.get());
        C3977e.a(likeInNotificationBroadcastReceiver, ob());
        C3977e.a(likeInNotificationBroadcastReceiver, Ca());
        return likeInNotificationBroadcastReceiver;
    }

    public void a(PlayHistoryFragment playHistoryFragment) {
        b(playHistoryFragment);
    }

    public void a(RecentlyPlayedFragment recentlyPlayedFragment) {
        b(recentlyPlayedFragment);
    }

    public void a(MoreFragment moreFragment) {
        b(moreFragment);
    }

    @CanIgnoreReturnValue
    private PlayQueueFragment b(PlayQueueFragment playQueueFragment) {
        C4399ua.a(playQueueFragment, z());
        C4399ua.a(playQueueFragment, nd());
        return playQueueFragment;
    }

    public void a(C4436ab abVar) {
        b(abVar);
    }

    public void a(ContentBottomPaddingBehavior contentBottomPaddingBehavior) {
        b(contentBottomPaddingBehavior);
    }

    @CanIgnoreReturnValue
    private C4875Eoa b(C4875Eoa eoa) {
        C4999Ioa.a(eoa, (C3700b) ia());
        C4999Ioa.a(eoa, com.soundcloud.android.X.b());
        C4999Ioa.a(eoa, k());
        C4999Ioa.a(eoa, C4930GMa.a(this.rk));
        return eoa;
    }

    public void a(ScrollingViewContentBottomPaddingBehavior scrollingViewContentBottomPaddingBehavior) {
        b(scrollingViewContentBottomPaddingBehavior);
    }

    public void a(C3149nN nNVar) {
        b(nNVar);
    }

    public void a(C2876c cVar) {
        b(cVar);
    }

    public void a(RealSoundCloudApplication realSoundCloudApplication) {
        b(realSoundCloudApplication);
    }

    @CanIgnoreReturnValue
    private C5449Xoa b(C5449Xoa xoa) {
        C5478Yoa.a(xoa, Id());
        C5478Yoa.a(xoa, xc());
        C5478Yoa.a(xoa, (C5327TLa) this.fa.get());
        C5478Yoa.a(xoa, (C3700b) ia());
        C5478Yoa.a(xoa, (com.soundcloud.android.properties.j) this.la.get());
        C5478Yoa.a(xoa, Ja());
        C5478Yoa.a(xoa, Fc());
        return xoa;
    }

    @CanIgnoreReturnValue
    private C5000Ipa b(C5000Ipa ipa) {
        C5032Jpa.a(ipa, Jd());
        C5032Jpa.a(ipa, (C4863EHa) this.ni.get());
        return ipa;
    }

    @CanIgnoreReturnValue
    private ProfileFragment b(ProfileFragment profileFragment) {
        C5845sa.a(profileFragment, ce());
        C5845sa.a(profileFragment, fe());
        C5845sa.a(profileFragment, D());
        return profileFragment;
    }

    @CanIgnoreReturnValue
    private ProfileBucketsFragment b(ProfileBucketsFragment profileBucketsFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) profileBucketsFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) profileBucketsFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) profileBucketsFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.profile.O.a(profileBucketsFragment, Wd());
        com.soundcloud.android.profile.O.a(profileBucketsFragment, _d());
        com.soundcloud.android.profile.O.a(profileBucketsFragment, new C5805k());
        return profileBucketsFragment;
    }

    @CanIgnoreReturnValue
    private UserPlaylistsFragment b(UserPlaylistsFragment userPlaylistsFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userPlaylistsFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userPlaylistsFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userPlaylistsFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.profile.Md.a(userPlaylistsFragment, sg());
        C5872xc.a(userPlaylistsFragment, ug());
        return userPlaylistsFragment;
    }

    @CanIgnoreReturnValue
    private UserLikesFragment b(UserLikesFragment userLikesFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userLikesFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userLikesFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userLikesFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.profile.Md.a(userLikesFragment, sg());
        com.soundcloud.android.profile.Ib.a(userLikesFragment, og());
        return userLikesFragment;
    }

    @CanIgnoreReturnValue
    private UserTracksFragment b(UserTracksFragment userTracksFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userTracksFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userTracksFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userTracksFragment, (C4655rja) this.lk.get());
        ae.a(userTracksFragment, Ag());
        ae.a(userTracksFragment, sg());
        return userTracksFragment;
    }

    @CanIgnoreReturnValue
    private UserDetailsFragment b(UserDetailsFragment userDetailsFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userDetailsFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userDetailsFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userDetailsFragment, (C4655rja) this.lk.get());
        C5812lb.a(userDetailsFragment, C4930GMa.a(this.xk));
        C5812lb.a(userDetailsFragment, kg());
        return userDetailsFragment;
    }

    @CanIgnoreReturnValue
    private UserAlbumsFragment b(UserAlbumsFragment userAlbumsFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userAlbumsFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userAlbumsFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userAlbumsFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.profile.Md.a(userAlbumsFragment, sg());
        com.soundcloud.android.profile.Wa.a(userAlbumsFragment, jg());
        return userAlbumsFragment;
    }

    @CanIgnoreReturnValue
    private UserRepostsFragment b(UserRepostsFragment userRepostsFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userRepostsFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userRepostsFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userRepostsFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.profile.Md.a(userRepostsFragment, sg());
        Nd.a(userRepostsFragment, xg());
        return userRepostsFragment;
    }

    @CanIgnoreReturnValue
    private UserFollowingsFragment b(UserFollowingsFragment userFollowingsFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userFollowingsFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userFollowingsFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userFollowingsFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.profile.Xb.a((UserListFragment<Presenter>) userFollowingsFragment, c());
        com.soundcloud.android.profile.Xb.a((UserListFragment<Presenter>) userFollowingsFragment, (C2526g) this.Fd.get());
        com.soundcloud.android.profile.Xb.a((UserListFragment<Presenter>) userFollowingsFragment, pg());
        return userFollowingsFragment;
    }

    @CanIgnoreReturnValue
    private UserFollowersFragment b(UserFollowersFragment userFollowersFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userFollowersFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userFollowersFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) userFollowersFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.profile.Xb.a((UserListFragment<Presenter>) userFollowersFragment, c());
        com.soundcloud.android.profile.Xb.a((UserListFragment<Presenter>) userFollowersFragment, (C2526g) this.Fd.get());
        com.soundcloud.android.profile.Xb.a((UserListFragment<Presenter>) userFollowersFragment, pg());
        return userFollowersFragment;
    }

    @CanIgnoreReturnValue
    private SearchFragment b(SearchFragment searchFragment) {
        C5918k.a(searchFragment, Je());
        return searchFragment;
    }

    @CanIgnoreReturnValue
    private StreamFragment b(StreamFragment streamFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) streamFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) streamFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) streamFragment, (C4655rja) this.lk.get());
        C6107ua.a(streamFragment, C4930GMa.a(this.Nk));
        C6107ua.a(streamFragment, pf());
        C6107ua.a(streamFragment, lc());
        C6107ua.a(streamFragment, (ke) this.ki.get());
        C6107ua.a(streamFragment, (gd) this.Jk.get());
        C6107ua.a(streamFragment, tf());
        C6107ua.a(streamFragment, Nf());
        return streamFragment;
    }

    @CanIgnoreReturnValue
    private C6170ha b(C6170ha haVar) {
        C6176ja.a(haVar, Vf());
        C6176ja.a(haVar, (C5327TLa) this.fa.get());
        C6176ja.a(haVar, (C3700b) ia());
        C6176ja.a(haVar, Sf());
        C6176ja.a(haVar, (C4655rja) this.lk.get());
        return haVar;
    }

    @CanIgnoreReturnValue
    private com.soundcloud.android.comments.Ga b(com.soundcloud.android.comments.Ga ga2) {
        com.soundcloud.android.comments.Ka.a(ga2, Db());
        com.soundcloud.android.comments.Ka.a(ga2, (C5052KJa) this.Ki.get());
        com.soundcloud.android.comments.Ka.a(ga2, (C5327TLa) this.fa.get());
        com.soundcloud.android.comments.Ka.a(ga2, (C3700b) ia());
        return ga2;
    }

    @CanIgnoreReturnValue
    private OfflineContentService b(OfflineContentService offlineContentService) {
        com.soundcloud.android.offline.Fd.a(offlineContentService, xa());
        com.soundcloud.android.offline.Fd.a(offlineContentService, xc());
        com.soundcloud.android.offline.Fd.b(offlineContentService, wa());
        com.soundcloud.android.offline.Fd.a(offlineContentService, C());
        com.soundcloud.android.offline.Fd.c(offlineContentService, Hc());
        com.soundcloud.android.offline.Fd.d(offlineContentService, C4140oc.a());
        com.soundcloud.android.offline.Fd.a(offlineContentService, ua());
        com.soundcloud.android.offline.Fd.a(offlineContentService, com.soundcloud.android.G.b());
        com.soundcloud.android.offline.Fd.a(offlineContentService, Oc());
        com.soundcloud.android.offline.Fd.a(offlineContentService, va());
        return offlineContentService;
    }

    @CanIgnoreReturnValue
    private Od b(Od od2) {
        Qd.a(od2, xc());
        Qd.a(od2, (com.soundcloud.android.foundation.events.F) this.fh.get());
        Qd.a(od2, (C3700b) ia());
        return od2;
    }

    @CanIgnoreReturnValue
    private MediaMountedReceiver b(MediaMountedReceiver mediaMountedReceiver) {
        C4196yc.a(mediaMountedReceiver, Ic());
        return mediaMountedReceiver;
    }

    @CanIgnoreReturnValue
    private com.soundcloud.android.upgrade.n b(com.soundcloud.android.upgrade.n nVar) {
        com.soundcloud.android.upgrade.o.a(nVar, hc());
        return nVar;
    }

    @CanIgnoreReturnValue
    private GoOffboardingFragment b(GoOffboardingFragment goOffboardingFragment) {
        com.soundcloud.android.downgrade.d.a(goOffboardingFragment, Ya());
        return goOffboardingFragment;
    }

    @CanIgnoreReturnValue
    private UploadMonitorFragment b(UploadMonitorFragment uploadMonitorFragment) {
        com.soundcloud.android.creators.upload.r.a(uploadMonitorFragment, gg());
        return uploadMonitorFragment;
    }

    @CanIgnoreReturnValue
    private com.soundcloud.android.creators.upload.p b(com.soundcloud.android.creators.upload.p pVar) {
        com.soundcloud.android.creators.upload.q.a(pVar, (C2350WH) this.dk.get());
        return pVar;
    }

    @CanIgnoreReturnValue
    private com.soundcloud.android.creators.upload.l b(com.soundcloud.android.creators.upload.l lVar) {
        com.soundcloud.android.creators.upload.m.a(lVar, (C2350WH) this.dk.get());
        return lVar;
    }

    @CanIgnoreReturnValue
    private TrackLikesUniflowFragment b(TrackLikesUniflowFragment trackLikesUniflowFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) trackLikesUniflowFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) trackLikesUniflowFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) trackLikesUniflowFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.likes.ka.a(trackLikesUniflowFragment, C4930GMa.a(this.Rk));
        com.soundcloud.android.likes.ka.a(trackLikesUniflowFragment, Xf());
        com.soundcloud.android.likes.ka.a(trackLikesUniflowFragment, this.Sk);
        return trackLikesUniflowFragment;
    }

    @CanIgnoreReturnValue
    private SettingsFragment b(SettingsFragment settingsFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) settingsFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) settingsFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) settingsFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.settings.G.a(settingsFragment, C4930GMa.a(this.Tk));
        return settingsFragment;
    }

    @CanIgnoreReturnValue
    private C5954k b(C5954k kVar) {
        C5955l.a(kVar, X());
        C5955l.a(kVar, (com.soundcloud.android.image.N) this.Qd.get());
        C5955l.a(kVar, Fg());
        C5955l.a(kVar, Oa());
        C5955l.a(kVar, com.soundcloud.android.G.b());
        return kVar;
    }

    @CanIgnoreReturnValue
    private C5969p b(C5969p pVar) {
        C5985q.a(pVar, Ja());
        C5985q.a(pVar, (C4655rja) this.lk.get());
        return pVar;
    }

    @CanIgnoreReturnValue
    private BasicSettingsFragment b(BasicSettingsFragment basicSettingsFragment) {
        com.soundcloud.android.more.w.a(basicSettingsFragment, zd());
        return basicSettingsFragment;
    }

    @CanIgnoreReturnValue
    private StreamingQualitySettingsFragment b(StreamingQualitySettingsFragment streamingQualitySettingsFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) streamingQualitySettingsFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) streamingQualitySettingsFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) streamingQualitySettingsFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.settings.streamingquality.h.a(streamingQualitySettingsFragment, C4930GMa.a(this.Uk));
        return streamingQualitySettingsFragment;
    }

    @CanIgnoreReturnValue
    private OfflineSettingsFragment b(OfflineSettingsFragment offlineSettingsFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) offlineSettingsFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) offlineSettingsFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) offlineSettingsFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.settings.offline.m.a(offlineSettingsFragment, C4930GMa.a(this.Wk));
        return offlineSettingsFragment;
    }

    @CanIgnoreReturnValue
    private com.soundcloud.android.settings.notifications.l b(com.soundcloud.android.settings.notifications.l lVar) {
        com.soundcloud.android.settings.notifications.m.a(lVar, oc());
        return lVar;
    }

    @CanIgnoreReturnValue
    private AnalyticsSettingsFragment b(AnalyticsSettingsFragment analyticsSettingsFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) analyticsSettingsFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) analyticsSettingsFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) analyticsSettingsFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.settings.privacy.r.a(analyticsSettingsFragment, C4930GMa.a(this.Xk));
        return analyticsSettingsFragment;
    }

    @CanIgnoreReturnValue
    private AdvertisingSettingsFragment b(AdvertisingSettingsFragment advertisingSettingsFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) advertisingSettingsFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) advertisingSettingsFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) advertisingSettingsFragment, (C4655rja) this.lk.get());
        C5974e.a(advertisingSettingsFragment, C4930GMa.a(this.Yk));
        return advertisingSettingsFragment;
    }

    @CanIgnoreReturnValue
    private CommunicationsSettingsFragment b(CommunicationsSettingsFragment communicationsSettingsFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) communicationsSettingsFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) communicationsSettingsFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) communicationsSettingsFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.settings.privacy.E.a(communicationsSettingsFragment, C4930GMa.a(this.Zk));
        return communicationsSettingsFragment;
    }

    @CanIgnoreReturnValue
    private LikedStationsFragment b(LikedStationsFragment likedStationsFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) likedStationsFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) likedStationsFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) likedStationsFragment, (C4655rja) this.lk.get());
        C6033oa.a(likedStationsFragment, C4930GMa.a(this.al));
        C6033oa.a(likedStationsFragment, gf());
        return likedStationsFragment;
    }

    @CanIgnoreReturnValue
    private StationInfoFragment b(StationInfoFragment stationInfoFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) stationInfoFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) stationInfoFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) stationInfoFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.stations.Va.a(stationInfoFragment, C4930GMa.a(this.bl));
        com.soundcloud.android.stations.Va.a(stationInfoFragment, _e());
        return stationInfoFragment;
    }

    @CanIgnoreReturnValue
    private SearchHistoryFragment b(SearchHistoryFragment searchHistoryFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) searchHistoryFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) searchHistoryFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) searchHistoryFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.search.history.r.a(searchHistoryFragment, new C5911h.a());
        com.soundcloud.android.search.history.r.a(searchHistoryFragment, new C5906c.a());
        com.soundcloud.android.search.history.r.a(searchHistoryFragment, new C5909f.b());
        com.soundcloud.android.search.history.r.a(searchHistoryFragment, C4930GMa.a(this.cl));
        return searchHistoryFragment;
    }

    @CanIgnoreReturnValue
    private com.soundcloud.android.search.Ta b(com.soundcloud.android.search.Ta ta2) {
        com.soundcloud.android.search.Ua.a(ta2, Ce());
        com.soundcloud.android.search.Ua.a(ta2, (com.soundcloud.android.search.Ja) this.yk.get());
        return ta2;
    }

    @CanIgnoreReturnValue
    private SearchResultsFragment b(SearchResultsFragment searchResultsFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) searchResultsFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) searchResultsFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) searchResultsFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.search.P.a(searchResultsFragment, C4930GMa.a(this.fl));
        com.soundcloud.android.search.P.a(searchResultsFragment, Le());
        com.soundcloud.android.search.P.a(searchResultsFragment, hc());
        return searchResultsFragment;
    }

    @CanIgnoreReturnValue
    private SearchSuggestionsUniflowFragment b(SearchSuggestionsUniflowFragment searchSuggestionsUniflowFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) searchSuggestionsUniflowFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) searchSuggestionsUniflowFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) searchSuggestionsUniflowFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.search.suggestions.searchsuggestions.e.a(searchSuggestionsUniflowFragment, Df());
        com.soundcloud.android.search.suggestions.searchsuggestions.e.a(searchSuggestionsUniflowFragment, C4930GMa.a(this.jl));
        return searchSuggestionsUniflowFragment;
    }

    @CanIgnoreReturnValue
    private SystemPlaylistFragment b(SystemPlaylistFragment systemPlaylistFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) systemPlaylistFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) systemPlaylistFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) systemPlaylistFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.discovery.systemplaylist.r.a(systemPlaylistFragment, C4930GMa.a(this.ll));
        com.soundcloud.android.discovery.systemplaylist.r.a(systemPlaylistFragment, If());
        return systemPlaylistFragment;
    }

    @CanIgnoreReturnValue
    private CollectionFragment b(CollectionFragment collectionFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) collectionFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) collectionFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) collectionFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.collection.A.a(collectionFragment, C4930GMa.a(this.ul));
        com.soundcloud.android.collection.A.a(collectionFragment, O());
        com.soundcloud.android.collection.A.a(collectionFragment, Nf());
        return collectionFragment;
    }

    @CanIgnoreReturnValue
    private com.soundcloud.android.collection.Da b(com.soundcloud.android.collection.Da da2) {
        com.soundcloud.android.collection.Ea.a(da2, xc());
        com.soundcloud.android.collection.Ea.a(da2, (com.soundcloud.android.foundation.events.F) this.fh.get());
        com.soundcloud.android.collection.Ea.a(da2, (C3700b) ia());
        return da2;
    }

    @CanIgnoreReturnValue
    private PlayHistoryFragment b(PlayHistoryFragment playHistoryFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) playHistoryFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) playHistoryFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) playHistoryFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.collection.playhistory.N.a(playHistoryFragment, Xc());
        com.soundcloud.android.collection.playhistory.N.a(playHistoryFragment, C4930GMa.a(this.vl));
        return playHistoryFragment;
    }

    @CanIgnoreReturnValue
    private RecentlyPlayedFragment b(RecentlyPlayedFragment recentlyPlayedFragment) {
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) recentlyPlayedFragment, (C5047KEa) this.mk.get());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) recentlyPlayedFragment, Ia());
        com.soundcloud.android.view.T.a((UniflowBaseFragment<T>) recentlyPlayedFragment, (C4655rja) this.lk.get());
        com.soundcloud.android.collection.recentlyplayed.A.a(recentlyPlayedFragment, C4930GMa.a(this.wl));
        com.soundcloud.android.collection.recentlyplayed.A.a(recentlyPlayedFragment, oe());
        return recentlyPlayedFragment;
    }

    @CanIgnoreReturnValue
    private MoreFragment b(MoreFragment moreFragment) {
        com.soundcloud.android.more.y.a(moreFragment, Lb());
        com.soundcloud.android.more.y.a(moreFragment, (C3700b) ia());
        return moreFragment;
    }

    @CanIgnoreReturnValue
    private C4436ab b(C4436ab abVar) {
        C4448eb.a(abVar, (com.soundcloud.android.foundation.ads.J) this.Wg.get());
        return abVar;
    }

    @CanIgnoreReturnValue
    private ContentBottomPaddingBehavior b(ContentBottomPaddingBehavior contentBottomPaddingBehavior) {
        com.soundcloud.android.view.behavior.a.a(contentBottomPaddingBehavior, W());
        return contentBottomPaddingBehavior;
    }

    @CanIgnoreReturnValue
    private ScrollingViewContentBottomPaddingBehavior b(ScrollingViewContentBottomPaddingBehavior scrollingViewContentBottomPaddingBehavior) {
        com.soundcloud.android.view.behavior.h.a(scrollingViewContentBottomPaddingBehavior, W());
        return scrollingViewContentBottomPaddingBehavior;
    }

    @CanIgnoreReturnValue
    private C3149nN b(C3149nN nNVar) {
        C3178oN.a(nNVar, Ve());
        return nNVar;
    }

    @CanIgnoreReturnValue
    private C2876c b(C2876c cVar) {
        C2888h.a(cVar, (com.soundcloud.android.properties.a) this.La.get());
        return cVar;
    }

    @CanIgnoreReturnValue
    private RealSoundCloudApplication b(RealSoundCloudApplication realSoundCloudApplication) {
        na.a((SoundCloudApplication) realSoundCloudApplication, sa());
        na.a((SoundCloudApplication) realSoundCloudApplication, Kb());
        na.a((SoundCloudApplication) realSoundCloudApplication, kc());
        na.a((SoundCloudApplication) realSoundCloudApplication, (C2529j) this.kb.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, (C2526g) this.Fd.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, (C3041hU) this.db.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, (com.soundcloud.android.playback.widget.s) this.ph.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, Qc());
        na.a((SoundCloudApplication) realSoundCloudApplication, (C4283ad) this.xh.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, (C4301eb) this.Ch.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, cd());
        na.a((SoundCloudApplication) realSoundCloudApplication, (C2568ec) this.ci.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, (com.soundcloud.android.search.history.G) this.fi.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, aa());
        na.a((SoundCloudApplication) realSoundCloudApplication, T());
        na.a((SoundCloudApplication) realSoundCloudApplication, (C2594la) this.hf.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, C4930GMa.a(this.hi));
        na.a((SoundCloudApplication) realSoundCloudApplication, jf());
        na.a((SoundCloudApplication) realSoundCloudApplication, vf());
        na.a((SoundCloudApplication) realSoundCloudApplication, (Se) this.sd.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, Bc());
        na.a((SoundCloudApplication) realSoundCloudApplication, (com.soundcloud.android.sync.I) this.li.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, C());
        na.a((SoundCloudApplication) realSoundCloudApplication, (com.soundcloud.android.collection.playhistory.G) this.mi.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, (com.soundcloud.android.sync.T) this.Eb.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, kf());
        na.a((SoundCloudApplication) realSoundCloudApplication, Q());
        na.a((SoundCloudApplication) realSoundCloudApplication, (C7730yHa) this.gf.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, (C3989m) this.id.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, (C2210OR) this.ld.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, (C3360xR) this.ye.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, Ic());
        na.a((SoundCloudApplication) realSoundCloudApplication, (C4863EHa) this.ni.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, sd());
        na.a((SoundCloudApplication) realSoundCloudApplication, Mc());
        na.a((SoundCloudApplication) realSoundCloudApplication, this.gh);
        na.a((SoundCloudApplication) realSoundCloudApplication, (com.soundcloud.android.playback.Fa) this.Bi.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, (com.soundcloud.android.properties.a) this.La.get());
        na.a((SoundCloudApplication) realSoundCloudApplication, (C7250rKa) me());
        na.a((SoundCloudApplication) realSoundCloudApplication, wg());
        na.a((SoundCloudApplication) realSoundCloudApplication, com.soundcloud.android.G.b());
        na.a((SoundCloudApplication) realSoundCloudApplication, ga());
        na.a((SoundCloudApplication) realSoundCloudApplication, (C3700b) ia());
        na.a((SoundCloudApplication) realSoundCloudApplication, Pe());
        ka.a(realSoundCloudApplication, ba());
        ka.a(realSoundCloudApplication, Pc());
        return realSoundCloudApplication;
    }
}
