package com.soundcloud.android.foundation.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B)\u0012\"\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\u0005¢\u0006\u0002\u0010\u0006J%\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\u0005HÆ\u0003J/\u0010\n\u001a\u00020\u00002$\b\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R-\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/foundation/ads/AdsReceived;", "", "ads", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "getAds", "()Ljava/util/HashMap;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "ads_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.foundation.ads.h reason: case insensitive filesystem */
/* compiled from: AdsReceived.kt */
public final class C3681h {
    public static final a a = new a(null);
    private final HashMap<String, Object> b;

    /* renamed from: com.soundcloud.android.foundation.ads.h$a */
    /* compiled from: AdsReceived.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final C3681h a(C3508cda cda, C3508cda cda2, C3508cda cda3, C3508cda cda4, C3508cda cda5) {
            C7471uYa.b(cda, "videoAdUrn");
            C7471uYa.b(cda2, "audioAdUrn");
            C7471uYa.b(cda3, "interstitialAdUrn");
            C7471uYa.b(cda4, "errorAudioAd");
            C7471uYa.b(cda5, "errorVideoAd");
            HashMap hashMap = new HashMap();
            if (cda.e()) {
                String a = com.soundcloud.android.foundation.ads.C3675b.a.VIDEO_AD.a();
                String b = cda.b();
                C7471uYa.a((Object) b, "videoAdUrn.content");
                hashMap.put(a, b);
            }
            if (cda2.e()) {
                String a2 = com.soundcloud.android.foundation.ads.C3675b.a.AUDIO_AD.a();
                String b2 = cda2.b();
                C7471uYa.a((Object) b2, "audioAdUrn.content");
                hashMap.put(a2, b2);
            }
            if (cda3.e()) {
                String a3 = com.soundcloud.android.foundation.ads.C3675b.a.INTERSTITIAL_AD.a();
                String b3 = cda3.b();
                C7471uYa.a((Object) b3, "interstitialAdUrn.content");
                hashMap.put(a3, b3);
            }
            if (cda4.e()) {
                String b4 = cda4.b();
                C7471uYa.a((Object) b4, "errorAudioAd.content");
                hashMap.put("error_audio", b4);
            }
            if (cda5.e()) {
                String b5 = cda5.b();
                C7471uYa.a((Object) b5, "errorVideoAd.content");
                hashMap.put("error_video", b5);
            }
            return new C3681h(hashMap);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        @NXa
        public final C3681h a(List<C3508cda> list, List<C3508cda> list2) {
            C7471uYa.b(list, "appInstalls");
            C7471uYa.b(list2, "videoAds");
            HashMap hashMap = new HashMap();
            if (!list.isEmpty()) {
                String a = com.soundcloud.android.foundation.ads.C3675b.a.APP_INSTALL_AD.a();
                ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
                for (C3508cda cda : list) {
                    arrayList.add(cda.toString());
                }
                hashMap.put(a, arrayList);
            }
            if (!list2.isEmpty()) {
                String a2 = com.soundcloud.android.foundation.ads.C3675b.a.VIDEO_AD.a();
                ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) list2, 10));
                for (C3508cda cda2 : list2) {
                    arrayList2.add(cda2.toString());
                }
                hashMap.put(a2, arrayList2);
            }
            return new C3681h(hashMap);
        }

        @NXa
        public final C3681h a(C3508cda cda, C3508cda cda2) {
            C7471uYa.b(cda, "displayUrn");
            C7471uYa.b(cda2, "sponsoredSessionUrn");
            HashMap hashMap = new HashMap();
            if (cda.e()) {
                String a = com.soundcloud.android.foundation.ads.C3675b.a.DISPLAY_AD.a();
                String b = cda.b();
                C7471uYa.a((Object) b, "displayUrn.content");
                hashMap.put(a, b);
            }
            if (cda2.e()) {
                String a2 = com.soundcloud.android.foundation.ads.C3675b.a.SPONSORED_SESSION_AD.a();
                String b2 = cda2.b();
                C7471uYa.a((Object) b2, "sponsoredSessionUrn.content");
                hashMap.put(a2, b2);
            }
            return new C3681h(hashMap);
        }

        @NXa
        public final C3681h a(C3508cda cda) {
            C7471uYa.b(cda, "interstitialAdUrn");
            HashMap hashMap = new HashMap();
            if (cda.e()) {
                String a = com.soundcloud.android.foundation.ads.C3675b.a.INTERSTITIAL_AD.a();
                String b = cda.b();
                C7471uYa.a((Object) b, "interstitialAdUrn.content");
                hashMap.put(a, b);
            }
            return new C3681h(hashMap);
        }
    }

    public C3681h(HashMap<String, Object> hashMap) {
        C7471uYa.b(hashMap, "ads");
        this.b = hashMap;
    }

    @NXa
    public static final C3681h a(C3508cda cda, C3508cda cda2) {
        return a.a(cda, cda2);
    }

    @NXa
    public static final C3681h a(List<C3508cda> list, List<C3508cda> list2) {
        return a.a(list, list2);
    }

    public final HashMap<String, Object> a() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((com.soundcloud.android.foundation.ads.C3681h) r2).b) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3681h) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        HashMap<String, Object> hashMap = this.b;
        if (hashMap != null) {
            return hashMap.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdsReceived(ads=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
