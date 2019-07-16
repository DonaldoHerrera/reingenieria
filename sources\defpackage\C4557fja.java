package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.soundcloud.android.C2929h;
import com.soundcloud.android.ads.FullScreenVideoActivity;
import com.soundcloud.android.ads.PrestitialActivity;
import com.soundcloud.android.comments.Y;
import com.soundcloud.android.creators.record.RecordActivity;
import com.soundcloud.android.creators.record.RecordPermissionsActivity;
import com.soundcloud.android.deeplinks.ResolveActivity;
import com.soundcloud.android.deeplinks.b;
import com.soundcloud.android.features.record.Recording;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.foundation.playqueue.m;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.LauncherActivity;
import com.soundcloud.android.main.MainActivity;
import com.soundcloud.android.main.WebViewActivity;
import com.soundcloud.android.main.ha;
import com.soundcloud.android.offline.OfflineSettingsOnboardingActivity;
import com.soundcloud.android.onboarding.OnboardActivity;
import com.soundcloud.android.onboarding.auth.RemoteSignInWebViewActivity;
import com.soundcloud.android.settings.ChangeStorageLocationActivity;
import com.soundcloud.android.settings.LegalActivity;
import com.soundcloud.android.settings.LicensesActivity;
import com.soundcloud.android.settings.notifications.NotificationPreferencesActivity;

/* renamed from: fja reason: default package and case insensitive filesystem */
/* compiled from: IntentFactory */
public final class C4557fja {
    public static Intent A(Context context) {
        Intent j = j(context);
        j.setAction("SETTINGS");
        return j;
    }

    public static Intent B(Context context) {
        Intent j = j(context);
        j.setAction("STREAMING_QUALITY_SETTINGS");
        return j;
    }

    public static Intent C(Context context) {
        Intent D = D(context);
        D.putExtra("auto_play", true);
        C3235rM.LAUNCHER_SHORTCUT.a(D);
        ha.a(Yca.LIKES, D);
        return D;
    }

    public static Intent D(Context context) {
        Intent j = j(context);
        j.setAction("TRACK_LIKES");
        return j;
    }

    public static Intent E(Context context) {
        Intent j = j(context);
        j.setAction("TRACK_LIKES_SEARCH");
        return j;
    }

    public static Intent a(Yca yca) {
        Intent flags = new Intent(C2929h.f).setFlags(335593472);
        ha.a(yca, flags);
        return flags;
    }

    public static Intent b(Context context, Uri uri) {
        Intent intent = new Intent(context, ResolveActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.setFlags(335593472);
        return intent;
    }

    public static Intent c(Context context, C3508cda cda, Yca yca, C4928GKa<SearchQuerySourceInfo> gKa) {
        Intent j = j(context);
        j.setAction("USER_PLAYLISTS");
        j.putExtra("searchQuerySourceInfo", (Parcelable) gKa.d());
        C5526_Ha.b(j, "userUrn", cda);
        ha.a(yca, j);
        return j;
    }

    public static Intent d(Context context, C3508cda cda, Yca yca, C4928GKa<SearchQuerySourceInfo> gKa) {
        Intent j = j(context);
        j.setAction("USER_REPOSTS");
        j.putExtra("searchQuerySourceInfo", (Parcelable) gKa.d());
        C5526_Ha.b(j, "userUrn", cda);
        ha.a(yca, j);
        return j;
    }

    public static Intent e(Context context, C3508cda cda, Yca yca, C4928GKa<SearchQuerySourceInfo> gKa) {
        Intent j = j(context);
        j.setAction("USER_TOP_TRACKS");
        j.putExtra("searchQuerySourceInfo", (Parcelable) gKa.d());
        C5526_Ha.b(j, "userUrn", cda);
        ha.a(yca, j);
        return j;
    }

    public static Intent f(Context context, C3508cda cda, Yca yca, C4928GKa<SearchQuerySourceInfo> gKa) {
        Intent j = j(context);
        j.setAction("USER_TRACKS");
        j.putExtra("searchQuerySourceInfo", (Parcelable) gKa.d());
        C5526_Ha.b(j, "userUrn", cda);
        ha.a(yca, j);
        return j;
    }

    public static Intent g(Context context) {
        Intent j = j(context);
        j.setAction("DOWNLOADS");
        return j;
    }

    public static Intent h(Context context) {
        return new Intent(context, ChangeStorageLocationActivity.class);
    }

    public static Intent i(Context context) {
        return b(Uri.parse(context.getString(p.url_support)));
    }

    public static Intent j(Context context) {
        return new Intent(context, MainActivity.class).addFlags(67108864);
    }

    public static Intent k(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.putExtra("expand_player", true);
        intent.addFlags(67108864);
        return intent;
    }

    public static Intent l(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.putExtra("expand_player", true);
        ha.a(Yca.NOTIFICATION, intent);
        C3235rM.PLAYBACK_NOTIFICATION.a(intent);
        return intent;
    }

    public static Intent m(Context context) {
        Intent a = a(new Intent(context, LauncherActivity.class));
        a.addCategory("android.intent.category.DEFAULT");
        a.addCategory("android.intent.category.LAUNCHER");
        return a;
    }

    public static Intent n(Context context) {
        return new Intent(context, LauncherActivity.class);
    }

    public static Intent o(Context context) {
        return new Intent(context, LegalActivity.class);
    }

    public static Intent p(Context context) {
        return new Intent(context, LicensesActivity.class);
    }

    public static Intent q(Context context) {
        Intent j = j(context);
        j.setAction("LIKED_STATIONS");
        return j;
    }

    public static Intent r(Context context) {
        return s(context).setFlags(131072);
    }

    public static Intent s(Context context) {
        return new Intent(context, NotificationPreferencesActivity.class);
    }

    public static Intent t(Context context) {
        Intent j = j(context);
        j.setAction("OFFLINE_LISTENING_SETTINGS");
        return j;
    }

    public static Intent u(Context context) {
        return new Intent(context, OfflineSettingsOnboardingActivity.class);
    }

    public static Intent v(Context context) {
        Intent j = j(context);
        j.setAction("PLAY_HISTORY");
        return j;
    }

    public static Intent w(Context context) {
        Intent j = j(context);
        j.setAction("PLAYLISTS_AND_ALBUMS");
        return j;
    }

    public static Intent x(Context context) {
        return new Intent(context, PrestitialActivity.class);
    }

    public static Intent y(Context context) {
        Intent j = j(context);
        j.setAction("RECENTLY_PLAYED");
        return j;
    }

    public static Intent z(Context context) {
        return j(context);
    }

    public static Intent a(Context context, Yca yca) {
        Intent j = j(context);
        ha.a(yca, j);
        j.putExtra("expand_player", true);
        return j;
    }

    public static Intent b(Yca yca) {
        Intent flags = new Intent(C2929h.d).setFlags(335593472);
        ha.a(yca, flags);
        return flags;
    }

    public static Intent a(Context context, C3508cda cda, C4928GKa<Yca> gKa, C4928GKa<SearchQuerySourceInfo> gKa2, C4928GKa<C3235rM> gKa3) {
        Intent j = j(context);
        j.setAction("PROFILE");
        j.putExtra("searchQuerySourceInfo", (Parcelable) gKa2.d());
        C5526_Ha.b(j, "userUrn", cda);
        gKa.a((C7733yKa<? super T>) new Hia<Object>(j));
        gKa3.a((C7733yKa<? super T>) new Gia<Object>(j));
        return j;
    }

    public static Intent c(Context context, Uri uri) {
        return new Intent(context, WebViewActivity.class).setData(uri);
    }

    public static Intent d(Context context) {
        Intent j = j(context);
        j.setAction("BASIC_SETTINGS");
        return j;
    }

    public static Intent e(Context context) {
        Intent c = c(context, "CLOSE_COMMENTS");
        c.putExtra("fragment_tag", "comments");
        return c;
    }

    public static Intent f(Context context) {
        Intent j = j(context);
        j.setAction("COMMUNICATIONS_SETTINGS");
        return j;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        return Intent.createChooser(intent, context.getString(p.share));
    }

    public static Intent c(Context context) {
        Intent j = j(context);
        j.setAction("ANALYTICS_SETTINGS");
        return j;
    }

    public static Intent c(Context context, C3508cda cda) {
        return a(context, C3508cda.b(cda.d()), Yca.DEEPLINK);
    }

    private static Intent c(Context context, String str) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setAction(str);
        return intent;
    }

    public static Intent b(Context context, C3508cda cda, Yca yca, C4928GKa<SearchQuerySourceInfo> gKa) {
        Intent j = j(context);
        j.setAction("USER_LIKES");
        j.putExtra("searchQuerySourceInfo", (Parcelable) gKa.d());
        C5526_Ha.b(j, "userUrn", cda);
        ha.a(yca, j);
        return j;
    }

    public static Intent a(Context context, boolean z) {
        Intent putExtra = new Intent(context, MainActivity.class).setAction("android.intent.action.MAIN").addFlags(67108864).putExtra("expand_player", z);
        ha.a(Yca.WIDGET, putExtra);
        C3235rM.PLAYBACK_WIDGET.a(putExtra);
        return putExtra;
    }

    public static Intent b(Context context, C4928GKa<Recording> gKa, Yca yca) {
        Intent flags = new Intent(context, RecordPermissionsActivity.class).setFlags(67239936);
        gKa.a((C7733yKa<? super T>) new Jia<Object>(flags));
        ha.a(yca, flags);
        return flags;
    }

    public static Intent a(Context context, C3508cda cda, Yca yca, C4928GKa<SearchQuerySourceInfo> gKa) {
        Intent j = j(context);
        j.setAction("USER_ALBUMS");
        j.putExtra("searchQuerySourceInfo", (Parcelable) gKa.d());
        C5526_Ha.b(j, "userUrn", cda);
        ha.a(yca, j);
        return j;
    }

    public static Intent b() {
        return new Intent(C2929h.l);
    }

    public static Intent b(Context context, C3508cda cda) {
        return C5526_Ha.b(new Intent(context, FullScreenVideoActivity.class), "EXTRA_AD_URN", cda);
    }

    public static Intent b(Uri uri) {
        return new Intent("android.intent.action.VIEW", uri);
    }

    public static Intent b(Context context, C3508cda cda, C4928GKa<SearchQuerySourceInfo> gKa) {
        Intent j = j(context);
        j.setAction("FOLLOWINGS");
        j.putExtra("searchQuerySourceInfo", (Parcelable) gKa.d());
        return C5526_Ha.b(j, "userUrn", cda);
    }

    public static Intent a(Context context, C3508cda cda, Yca yca) {
        Intent j = j(context);
        j.setAction("SYSTEM_PLAYLIST");
        C5526_Ha.b(j, "extra_urn", cda);
        ha.a(yca, j);
        return j;
    }

    public static Intent b(Context context) {
        Intent j = j(context);
        j.setAction("ADVERTISING_SETTINGS");
        return j;
    }

    public static Intent a(Context context, String str, Yca yca) {
        Intent j = j(context);
        j.setAction("SYSTEM_PLAYLIST");
        j.putExtra("extra_permalink", str);
        ha.a(yca, j);
        return j;
    }

    public static Intent b(Context context, Y y) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setAction("TRACK_COMMENTS");
        y.a(intent);
        return intent;
    }

    public static Intent a(Context context, C4928GKa<Recording> gKa, Yca yca) {
        Intent flags = new Intent(context, RecordActivity.class).setFlags(67239936);
        gKa.a((C7733yKa<? super T>) new Kia<Object>(flags));
        ha.a(yca, flags);
        return flags;
    }

    public static Intent a(Context context, Yca yca, Uri uri) {
        Intent flags = new Intent(context, OnboardActivity.class).putExtra("EXTRA_DEEP_LINK_URI", uri).setFlags(335593472);
        ha.a(yca, flags);
        return flags;
    }

    public static Intent a(Intent intent) {
        return intent.addFlags(32768);
    }

    public static Intent a(Uri uri) {
        return new Intent("android.intent.action.VIEW", uri).setFlags(268435456);
    }

    public static Intent a(Context context, Uri uri, Yca yca) {
        Intent z = z(context);
        z.setAction("android.intent.action.VIEW");
        z.setData(uri);
        ha.a(yca, z);
        Intent j = j(context);
        j.setAction(C2929h.g);
        j.putExtra("search_intent", z);
        return j;
    }

    public static Intent a(Activity activity) {
        Intent z = z(activity);
        C3235rM.LAUNCHER_SHORTCUT.a(z);
        ha.a(Yca.SEARCH_MAIN, z);
        return z;
    }

    public static Intent a(String str) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        return intent;
    }

    public static Intent a(Context context) {
        Intent j = j(context);
        j.setAction("ACTIVITIES");
        return j;
    }

    public static Intent a(Context context, C3508cda cda, C4928GKa<SearchQuerySourceInfo> gKa) {
        Intent j = j(context);
        j.setAction("FOLLOWERS");
        j.putExtra("searchQuerySourceInfo", (Parcelable) gKa.d());
        return C5526_Ha.b(j, "userUrn", cda);
    }

    public static Intent a(Context context, String str) {
        if (C5203PHa.b(context, str)) {
            Intent a = C5203PHa.a(context, str);
            if (a != null) {
                return a;
            }
        }
        if (C5203PHa.a(context)) {
            return b(Uri.parse("market://details?id=com.soundcloud.creators"));
        }
        return b(Uri.parse("https://play.google.com/store/apps/details?id=com.soundcloud.creators"));
    }

    public static Intent a() {
        return a(b().setFlags(335593472));
    }

    public static Intent a(Context context, Uri uri) {
        return new Intent(context, RemoteSignInWebViewActivity.class).setData(uri);
    }

    public static Intent a(Context context, b bVar) {
        return a(context, C3508cda.b(bVar.b().a(), bVar.a().d()), Yca.DEEPLINK);
    }

    public static Intent a(Context context, C3508cda cda, C4928GKa<C3508cda> gKa, C4928GKa<m> gKa2) {
        Intent j = j(context);
        j.setAction("STATION_INFO");
        C5526_Ha.b(j, "urn", cda);
        gKa2.a((C7733yKa<? super T>) new Iia<Object>(j));
        C5526_Ha.a(j, "seed_urn", gKa);
        return j;
    }

    public static Intent a(Context context, C3508cda cda) {
        Intent j = j(context);
        j.setAction("ARTISTS");
        return C5526_Ha.b(j, "userUrn", cda);
    }

    public static Intent a(Context context, Y y) {
        return y.a(c(context, "OPEN_COMMENTS"));
    }
}
