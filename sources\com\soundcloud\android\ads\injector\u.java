package com.soundcloud.android.ads.injector;

import com.facebook.stetho.server.http.HttpStatus;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.soundcloud.android.foundation.ads.AdVerificationResource;
import com.soundcloud.android.foundation.ads.C3682i;
import com.soundcloud.android.foundation.ads.C3683j;
import com.soundcloud.android.foundation.ads.Y;
import com.soundcloud.android.foundation.ads.r;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u000501234B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\f2\u0006\u0010 \u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020#J\u0006\u0010'\u001a\u00020%J.\u0010(\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020-J&\u0010.\u001a\u00020/2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/soundcloud/android/ads/injector/FakeAds;", "", "fileHelper", "Lcom/soundcloud/android/utilities/android/io/FileHelper;", "(Lcom/soundcloud/android/utilities/android/io/FileHelper;)V", "apiAudioAdTrackingWithMacros", "Lcom/soundcloud/android/foundation/ads/ApiAdTracking;", "getApiAudioAdTrackingWithMacros", "()Lcom/soundcloud/android/foundation/ads/ApiAdTracking;", "apiVideoAdTrackingWithMacros", "getApiVideoAdTrackingWithMacros", "verificationResources", "", "Lcom/soundcloud/android/foundation/ads/AdVerificationResource;", "buildCompanionHtml", "Lcom/soundcloud/android/foundation/ads/ApiBaseAdVisualCompanion$HtmlCompanion;", "companionHtml", "Lcom/soundcloud/android/ads/injector/FakeAds$CompanionHtmlKind;", "buildCompanionImage", "Lcom/soundcloud/android/foundation/ads/ApiBaseAdVisualCompanion$ImageCompanion;", "companionImage", "Lcom/soundcloud/android/ads/injector/FakeAds$CompanionImageKind;", "buildHtmlLeaveBehind", "Lcom/soundcloud/android/foundation/ads/HtmlLeaveBehindAd$ApiModel;", "leaveBehindHtml", "Lcom/soundcloud/android/ads/injector/FakeAds$LeaveBehindHtmlKind;", "buildImageLeaveBehind", "Lcom/soundcloud/android/foundation/ads/LeaveBehindAd$ApiModel;", "leaveBehindImage", "Lcom/soundcloud/android/ads/injector/FakeAds$LeaveBehindImageKind;", "buildVideoAdSource", "Lcom/soundcloud/android/foundation/ads/VideoAdSource$ApiModel;", "aspectRatio", "Lcom/soundcloud/android/ads/injector/FakeAds$VideoAspectRatio;", "getEmptyAudioAd", "Lcom/soundcloud/android/foundation/ads/ApiErrorAd$Audio;", "getEmptyVideoAd", "Lcom/soundcloud/android/foundation/ads/ApiErrorAd$Video;", "getErrorAudioAd", "getErrorVideoAd", "getFakeAudioAd", "Lcom/soundcloud/android/foundation/ads/AudioAd$ApiModel;", "skipOffset", "", "getFakeInterstitial", "Lcom/soundcloud/android/foundation/ads/InterstitialAd$ApiModel;", "getFakeVideoAd", "Lcom/soundcloud/android/foundation/ads/VideoAd$ApiModel;", "CompanionHtmlKind", "CompanionImageKind", "LeaveBehindHtmlKind", "LeaveBehindImageKind", "VideoAspectRatio", "base_release"}, mv = {1, 1, 15})
/* compiled from: FakeAds.kt */
public final class u {
    private final List<AdVerificationResource> a = C6850lWa.a(new AdVerificationResource("iabtechlab.com-omid", "https://storage.googleapis.com/android-dev-omid-scripts/omid-validation-verification-script-v1.js", "param1"));
    private final C6494gGa b;

    /* compiled from: FakeAds.kt */
    public enum a {
        NONE,
        RESPONSIVE,
        NON_RESPONSIVE
    }

    /* compiled from: FakeAds.kt */
    public enum b {
        NONE,
        FULL_BLEED_CAT,
        BUS
    }

    /* compiled from: FakeAds.kt */
    public enum c {
        NONE,
        TIAA
    }

    /* compiled from: FakeAds.kt */
    public enum d {
        NONE,
        CAT
    }

    /* compiled from: FakeAds.kt */
    public enum e {
        LETTERBOX_JEEP,
        FULLSCREEN_JEEP
    }

    public u(C6494gGa gga) {
        C7471uYa.b(gga, "fileHelper");
        this.b = gga;
    }

    private final C3683j f() {
        C3683j jVar = new C3683j(C6918mWa.a(), C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/audio_impression1"), new Y("https://www.google.com/audio_impression2_[PLAYERSTATE]")}), C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/audio_skip1"), new Y("https://www.google.com/audio_skip2_[PLAYERSTATE]")}), C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/audio_start_1"), new Y("https://www.google.com/audio_start_2_[PLAYERSTATE]")}), C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/audio_quartile1_1"), new Y("https://www.google.com/audio_quartile1_2_[PLAYERSTATE]")}), C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/audio_quartile2_1"), new Y("https://www.google.com/audio_quartile2_2_[PLAYERSTATE]")}), C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/audio_quartile3_1"), new Y("https://www.google.com/audio_quartile3_2_[PLAYERSTATE]")}), C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/audio_finish1"), new Y("https://www.google.com/audio_finish2_[PLAYERSTATE]")}), C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/audio_pause1"), new Y("https://www.google.com/audio_pause2_[PLAYERSTATE]")}), C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/audio_resume1"), new Y("https://www.google.com/audio_resume2_[PLAYERSTATE]")}), null, null, null, null, 15360, null);
        return jVar;
    }

    private final C3683j g() {
        List b2 = C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/video_click1"), new Y("https://www.google.com/video_click2_[PLAYERSTATE]")});
        List b3 = C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/video_impression1"), new Y("https://www.google.com/video_impression2_[PLAYERSTATE]")});
        List b4 = C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/video_skip1"), new Y("https://www.google.com/video_skip2_[PLAYERSTATE]")});
        List b5 = C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/video_start1"), new Y("https://www.google.com/video_start2_[PLAYERSTATE]")});
        List b6 = C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/video_quartile1_1"), new Y("https://www.google.com/video_quartile1_2_[PLAYERSTATE]")});
        List b7 = C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/video_quartile2_1"), new Y("https://www.google.com/video_quartile2_2_[PLAYERSTATE]")});
        List b8 = C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/video_quartile3_1"), new Y("https://www.google.com/video_quartile3_2_[PLAYERSTATE]")});
        List b9 = C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/video_finish1"), new Y("https://www.google.com/video_finish2_[PLAYERSTATE]")});
        List b10 = C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/video_pause1"), new Y("https://www.google.com/video_pause2_[PLAYERSTATE]")});
        List b11 = C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/video_resume1"), new Y("https://www.google.com/video_resume2_[PLAYERSTATE]")});
        List b12 = C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/video_mute1"), new Y("https://www.google.com/video_mute2_[PLAYERSTATE]")});
        List b13 = C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/video_unmute1"), new Y("https://www.google.com/video_unmute2_[PLAYERSTATE]")});
        List b14 = C6918mWa.b((Object[]) new Y[]{new Y("https://www.google.com/video_fullscreen1"), new Y("https://www.google.com/video_fullscreen2_[PLAYERSTATE]")});
        Y[] yArr = {new Y("https://www.google.com/video_exit_full1"), new Y("https://www.google.com/video_exit_full2_[PLAYERSTATE]")};
        C3683j jVar = new C3683j(b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, C6918mWa.b((Object[]) yArr));
        return jVar;
    }

    public final com.soundcloud.android.foundation.ads.C3693u.a a(b bVar, a aVar, d dVar, c cVar, int i) {
        a aVar2 = aVar;
        d dVar2 = dVar;
        c cVar2 = cVar;
        C7471uYa.b(bVar, "companionImage");
        C7471uYa.b(aVar2, "companionHtml");
        C7471uYa.b(dVar2, "leaveBehindImage");
        C7471uYa.b(cVar2, "leaveBehindHtml");
        C3508cda a2 = C3508cda.a("dfp", "210000002-22000000008");
        C7471uYa.a((Object) a2, "Urn.forAd(\"dfp\", \"210000002-22000000008\")");
        com.soundcloud.android.foundation.ads.C3693u.a aVar3 = new com.soundcloud.android.foundation.ads.C3693u.a(a2, true, Integer.valueOf(i), new com.soundcloud.android.foundation.ads.C3693u.c(a(bVar), a(aVar2), a(dVar2), a(cVar2)), C6918mWa.b((Object[]) new com.soundcloud.android.foundation.ads.C3694v.a[]{new com.soundcloud.android.foundation.ads.C3694v.a("audio/mpeg", "https://va.sndcdn.com/audio/sample-squarespace-test.mp3", false), new com.soundcloud.android.foundation.ads.C3694v.a("application/x-mpegurl", "https://api-mobile-staging.soundcloud.com/streams/to-hls?url=https%3A%2F%2Fva.sndcdn.com%2Faudio%2Fsample-squarespace-test.mp3&duration=30000", true)}), f(), C6918mWa.d(new C3682i(1000, C6850lWa.a(new Y(ImagesContract.URL)))), null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, C6850lWa.a(new Y("http://test.com?error=[ERRORCODE]")), C6918mWa.a());
        return aVar3;
    }

    public final com.soundcloud.android.foundation.ads.C3691s.b b() {
        C3508cda a2 = C3508cda.a("pandora", "error-audio");
        C7471uYa.a((Object) a2, "Urn.forAd(\"pandora\", \"error-audio\")");
        com.soundcloud.android.foundation.ads.C3691s.b bVar = new com.soundcloud.android.foundation.ads.C3691s.b(a2, C6918mWa.a(), null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, true, Integer.valueOf(0));
        return bVar;
    }

    public final com.soundcloud.android.foundation.ads.C3691s.a c() {
        C3508cda a2 = C3508cda.a("pandora", "error-audio");
        C7471uYa.a((Object) a2, "Urn.forAd(\"pandora\", \"error-audio\")");
        com.soundcloud.android.foundation.ads.C3691s.a aVar = new com.soundcloud.android.foundation.ads.C3691s.a(a2, C6918mWa.b((Object[]) new Y[]{new Y("http: //adserver.com/noad1.gif?error=303"), new Y("http://adserver.com/noad2.gif")}), null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, false, Integer.valueOf(0));
        return aVar;
    }

    public final com.soundcloud.android.foundation.ads.C3691s.b d() {
        C3508cda a2 = C3508cda.a("pandora", "error-audio");
        C7471uYa.a((Object) a2, "Urn.forAd(\"pandora\", \"error-audio\")");
        com.soundcloud.android.foundation.ads.C3691s.b bVar = new com.soundcloud.android.foundation.ads.C3691s.b(a2, C6918mWa.b((Object[]) new Y[]{new Y("http: //adserver.com/noad1.gif?error=303"), new Y("http://adserver.com/noad2.gif")}), null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, false, Integer.valueOf(0));
        return bVar;
    }

    public final com.soundcloud.android.foundation.ads.P.a e() {
        C3508cda a2 = C3508cda.a("dfp", "35");
        C7471uYa.a((Object) a2, "Urn.forAd(\"dfp\", \"35\")");
        String str = "http://127.0.0.1:8080/1024x1024.jpg";
        String str2 = "http://clickthrough.visualad.com";
        com.soundcloud.android.foundation.ads.P.a aVar = new com.soundcloud.android.foundation.ads.P.a(a2, str, str2, C6918mWa.b((Object[]) new Y[]{new Y("interstitial_impression1"), new Y("intersitial_impression2")}), C6918mWa.b((Object[]) new Y[]{new Y("interstitial_click1"), new Y("interstitial_click2")}), null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, C6918mWa.a(), C6850lWa.a(new AdVerificationResource("vendorKey", ImagesContract.URL, "params")));
        return aVar;
    }

    public final com.soundcloud.android.foundation.ads.aa.a a(e eVar, d dVar, c cVar, int i) {
        d dVar2 = dVar;
        c cVar2 = cVar;
        C7471uYa.b(eVar, "aspectRatio");
        C7471uYa.b(dVar2, "leaveBehindImage");
        C7471uYa.b(cVar2, "leaveBehindHtml");
        C3508cda a2 = C3508cda.a("dfp", "210000001-22000000002");
        C3508cda cda = a2;
        C7471uYa.a((Object) a2, "Urn.forAd(\"dfp\", \"210000001-22000000002\")");
        List a3 = a(eVar);
        C3683j g = g();
        List d2 = C6918mWa.d(new C3682i(1000, C6850lWa.a(new Y(ImagesContract.URL))));
        Integer valueOf = Integer.valueOf(i);
        List a4 = C6850lWa.a(new Y("http://test.com?error=[ERRORCODE]"));
        List<AdVerificationResource> list = this.a;
        com.soundcloud.android.foundation.ads.aa.c cVar3 = r4;
        com.soundcloud.android.foundation.ads.aa.c cVar4 = new com.soundcloud.android.foundation.ads.aa.c(a(dVar2), a(cVar2));
        com.soundcloud.android.foundation.ads.aa.a aVar = new com.soundcloud.android.foundation.ads.aa.a(cda, 60, 67000, null, null, "https://advertising.soundcloud.com/", null, a3, g, d2, true, valueOf, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, a4, list, cVar3);
        return aVar;
    }

    public final com.soundcloud.android.foundation.ads.C3691s.a a() {
        C3508cda a2 = C3508cda.a("pandora", "error-audio");
        C7471uYa.a((Object) a2, "Urn.forAd(\"pandora\", \"error-audio\")");
        com.soundcloud.android.foundation.ads.C3691s.a aVar = new com.soundcloud.android.foundation.ads.C3691s.a(a2, C6918mWa.a(), null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, true, Integer.valueOf(0));
        return aVar;
    }

    private final List<com.soundcloud.android.foundation.ads.ba.a> a(e eVar) {
        int i = v.a[eVar.ordinal()];
        String str = "video/mp4";
        if (i == 1) {
            return C6850lWa.a(com.soundcloud.android.foundation.ads.ba.a.a(str, "https://va.sndcdn.com/mv/vertical-919.mp4", 919, 608, 1080));
        }
        if (i == 2) {
            return C6918mWa.b((Object[]) new com.soundcloud.android.foundation.ads.ba.a[]{com.soundcloud.android.foundation.ads.ba.a.a(str, "https://va.sndcdn.com/mv/letterbox-549.mp4", 549, 640, 360), com.soundcloud.android.foundation.ads.ba.a.a(str, "https://va.sndcdn.com/mv/letterbox-1970.mp4", 1970, 1280, 720)});
        }
        throw new FVa();
    }

    private final com.soundcloud.android.foundation.ads.C3688o.b a(b bVar) {
        int i = v.b[bVar.ordinal()];
        String str = "comp_click2";
        String str2 = "comp_click1";
        String str3 = "comp_impression2";
        String str4 = "comp_impression1";
        String str5 = "Urn.forAd(\"dfp\", \"746\")";
        String str6 = "746";
        String str7 = "dfp";
        if (i == 1) {
            C3508cda a2 = C3508cda.a(str7, str6);
            C7471uYa.a((Object) a2, str5);
            List b2 = C6918mWa.b((Object[]) new Y[]{new Y(str4), new Y(str3)});
            List b3 = C6918mWa.b((Object[]) new Y[]{new Y(str2), new Y(str)});
            r rVar = new r("#ffffff", "#222222", "#ffffff", "#222222", "#ffffff", "#222222");
            com.soundcloud.android.foundation.ads.C3688o.b bVar2 = new com.soundcloud.android.foundation.ads.C3688o.b(a2, "https://www.splendidbeast.com/wp-content/uploads/2017/10/Regal-Cat-resized.jpg", "http://clickthrough.visualad.com", b2, b3, "Click me", rVar);
            return bVar2;
        } else if (i == 2) {
            C3508cda a3 = C3508cda.a(str7, str6);
            C7471uYa.a((Object) a3, str5);
            List b4 = C6918mWa.b((Object[]) new Y[]{new Y(str4), new Y(str3)});
            List b5 = C6918mWa.b((Object[]) new Y[]{new Y(str2), new Y(str)});
            r rVar2 = new r("#ffffff", "#222222", "#ffffff", "#222222", "#ffffff", "#222222");
            com.soundcloud.android.foundation.ads.C3688o.b bVar3 = new com.soundcloud.android.foundation.ads.C3688o.b(a3, "http://www.britishmodelbuses.com/Real_bus_pictures_Large_Images/Blackpool%20Brush%20Railcoach_Sea%20Life%20Centre_Large.jpg", "http://clickthrough.visualad.com", b4, b5, "Click me", rVar2);
            return bVar3;
        } else if (i == 3) {
            return null;
        } else {
            throw new FVa();
        }
    }

    private final com.soundcloud.android.foundation.ads.C3688o.a a(a aVar) {
        int i = v.c[aVar.ordinal()];
        String str = "http://www.mtv.com";
        String str2 = "http://www.yahoo.com";
        String str3 = "http://www.google.com";
        String str4 = "http://www.soundcloud.com";
        String str5 = "Urn.forAd(\"dfp\", \"123\")";
        String str6 = "123";
        String str7 = "dfp";
        if (i == 1) {
            C3508cda a2 = C3508cda.a(str7, str6);
            C7471uYa.a((Object) a2, str5);
            String str8 = "<html><head><style>\n    body {\n    background-color:#000;\n    margin:0;\n    height:100%;\n    width:100%;\n    }\n    .adContainer {\n    background-image: url(\"https://cdn.pixabay.com/photo/2015/10/01/21/39/background-image-967820_1280.jpg\");\n    background-size: 100%;\n    background-repeat: no-repeat;\n    margin: 0 auto;\n    padding: 0;\n    height:100%;\n    width:100%;\n    }\n    </style></head>\n    <body>\n        <a href=\"http://pandora.com/\" onClick=\"\">\n            <div class=\"adContainer\"></div>\n        </a>\n    </body>\n</html>";
            com.soundcloud.android.foundation.ads.C3688o.a aVar2 = new com.soundcloud.android.foundation.ads.C3688o.a(a2, HttpStatus.HTTP_INTERNAL_SERVER_ERROR, HttpStatus.HTTP_INTERNAL_SERVER_ERROR, str8, C6918mWa.b((Object[]) new Y[]{new Y(str4), new Y(str3)}), C6918mWa.b((Object[]) new Y[]{new Y(str2), new Y(str)}), true);
            return aVar2;
        } else if (i == 2) {
            C3508cda a3 = C3508cda.a(str7, str6);
            C7471uYa.a((Object) a3, str5);
            com.soundcloud.android.foundation.ads.C3688o.a aVar3 = new com.soundcloud.android.foundation.ads.C3688o.a(a3, 300, 250, this.b.a("dev/html_ad_companion.html"), C6918mWa.b((Object[]) new Y[]{new Y(str4), new Y(str3)}), C6918mWa.b((Object[]) new Y[]{new Y(str2), new Y(str)}), false);
            return aVar3;
        } else if (i == 3) {
            return null;
        } else {
            throw new FVa();
        }
    }

    private final com.soundcloud.android.foundation.ads.Q.a a(d dVar) {
        int i = v.d[dVar.ordinal()];
        if (i == 1) {
            C3508cda a2 = C3508cda.a("dfp", "35");
            C7471uYa.a((Object) a2, "Urn.forAd(\"dfp\", \"35\")");
            List b2 = C6918mWa.b((Object[]) new Y[]{new Y("leave_impression1"), new Y("leave_impression2")});
            Y[] yArr = {new Y("leave_click1"), new Y("leave_click2")};
            com.soundcloud.android.foundation.ads.Q.a aVar = new com.soundcloud.android.foundation.ads.Q.a(a2, "https://r.hswstatic.com/w_907/gif/tesla-cat.jpg", "http://clickthrough.visualad.com", b2, C6918mWa.b((Object[]) yArr));
            return aVar;
        } else if (i == 2) {
            return null;
        } else {
            throw new FVa();
        }
    }

    private final com.soundcloud.android.foundation.ads.M.a a(c cVar) {
        int i = v.e[cVar.ordinal()];
        if (i == 1) {
            C3508cda a2 = C3508cda.a("dfp", "123");
            C7471uYa.a((Object) a2, "Urn.forAd(\"dfp\", \"123\")");
            com.soundcloud.android.foundation.ads.M.a aVar = new com.soundcloud.android.foundation.ads.M.a(a2, 300, 250, this.b.a("dev/html_ad_companion.html"), C6918mWa.b((Object[]) new Y[]{new Y("http://www.soundcloud.com"), new Y("http://www.google.com")}), C6918mWa.b((Object[]) new Y[]{new Y("http://www.yahoo.com"), new Y("http://www.mtv.com")}));
            return aVar;
        } else if (i == 2) {
            return null;
        } else {
            throw new FVa();
        }
    }
}
