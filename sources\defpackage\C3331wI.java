package defpackage;

import android.content.Context;
import android.view.View;
import com.moat.analytics.mobile.scl.MoatAdEvent;
import com.moat.analytics.mobile.scl.MoatAdEventType;
import com.moat.analytics.mobile.scl.MoatFactory;
import com.moat.analytics.mobile.scl.NativeDisplayTracker;
import com.moat.analytics.mobile.scl.ReactiveVideoTracker;
import com.moat.analytics.mobile.scl.ReactiveVideoTrackerPlugin;
import com.soundcloud.android.foundation.ads.C3676c.a;
import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.ads.P;
import com.soundcloud.android.foundation.ads.VideoAdTracking;
import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.ads.ea;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: wI reason: default package and case insensitive filesystem */
/* compiled from: MoatViewabilityController.kt */
public final class C3331wI implements C3678e {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C3331wI.class), "moatFactory", "getMoatFactory()Lcom/moat/analytics/mobile/scl/MoatFactory;"))};
    private final ReactiveVideoTrackerPlugin b;
    private final C7744yVa c = BVa.a(C3311vI.a);
    private NativeDisplayTracker d;
    private final Map<String, ReactiveVideoTracker> e = new LinkedHashMap();
    private final C6699jHa f;

    public C3331wI(Context context, C6699jHa jha) {
        C7471uYa.b(context, "context");
        C7471uYa.b(jha, "deviceHelper");
        this.f = jha;
        this.b = new ReactiveVideoTrackerPlugin(context.getString(k.moat_video_partner_id));
    }

    private final MoatFactory f() {
        C7744yVa yva = this.c;
        DZa dZa = a[0];
        return (MoatFactory) yva.getValue();
    }

    public void a() {
    }

    public void a(C3508cda cda, long j, View view, List<? extends View> list, VideoAdTracking videoAdTracking) {
        C7471uYa.b(cda, "adUrn");
        C7471uYa.b(view, "viewabilityLayer");
        C7471uYa.b(list, "adObstructionViews");
        C7471uYa.b(videoAdTracking, "videoAdTracking");
        ReactiveVideoTracker a2 = C3291uI.a(f(), this.b);
        a2.trackVideoAd(a(cda, videoAdTracking.c()), Integer.valueOf((int) j), view);
        Map<String, ReactiveVideoTracker> map = this.e;
        String e2 = videoAdTracking.e();
        C7471uYa.a((Object) a2, "tracker");
        map.put(e2, a2);
    }

    public void a(VideoAdTracking videoAdTracking) {
        C7471uYa.b(videoAdTracking, "videoAdTracking");
    }

    public void b() {
    }

    public void b(String str, long j) {
        C7471uYa.b(str, "uuid");
        a(str, MoatAdEventType.AD_EVT_PLAYING, j);
    }

    public void c() {
    }

    public void c(String str, long j) {
        C7471uYa.b(str, "uuid");
        a(str, MoatAdEventType.AD_EVT_FIRST_QUARTILE, j);
    }

    public void d() {
    }

    public void d(String str) {
        C7471uYa.b(str, "uuid");
        a(str);
    }

    public void e(String str, long j) {
        C7471uYa.b(str, "uuid");
        a(str, MoatAdEventType.AD_EVT_ENTER_FULLSCREEN, j);
    }

    public void f(String str, long j) {
        C7471uYa.b(str, "uuid");
        a(str, MoatAdEventType.AD_EVT_MID_POINT, j);
    }

    public void g(String str, long j) {
        C7471uYa.b(str, "uuid");
        a(str, MoatAdEventType.AD_EVT_THIRD_QUARTILE, j);
    }

    public void h(String str, long j) {
        C7471uYa.b(str, "uuid");
        a(str, MoatAdEventType.AD_EVT_PAUSED, j);
    }

    private final ReactiveVideoTracker f(String str) {
        return (ReactiveVideoTracker) this.e.get(str);
    }

    public void b(String str) {
        C7471uYa.b(str, "uuid");
        ReactiveVideoTracker f2 = f(str);
        if (f2 != null) {
            f2.setPlayerVolume(MoatAdEvent.VOLUME_UNMUTED);
        }
    }

    public void c(String str) {
        C7471uYa.b(str, "uuid");
        ReactiveVideoTracker f2 = f(str);
        if (f2 != null) {
            f2.setPlayerVolume(MoatAdEvent.VOLUME_MUTED);
        }
    }

    public void d(String str, long j) {
        C7471uYa.b(str, "uuid");
        a(str, MoatAdEventType.AD_EVT_EXIT_FULLSCREEN, j);
    }

    public void e() {
        NativeDisplayTracker nativeDisplayTracker = this.d;
        if (nativeDisplayTracker != null) {
            nativeDisplayTracker.stopTracking();
            this.d = null;
        }
    }

    private final Map<String, String> b(String str, String str2, String str3, String str4) {
        return LWa.b(NVa.a("level1", str), NVa.a("level2", str2), NVa.a("slicer1", str3), NVa.a("slicer2", str4));
    }

    public void a(String str) {
        C7471uYa.b(str, "uuid");
        ReactiveVideoTracker f2 = f(str);
        if (f2 != null) {
            f2.stopTracking();
        }
        this.e.remove(str);
    }

    private final String e(String str) {
        if (C7471uYa.a((Object) str, (Object) a.VIDEO.a())) {
            return "video";
        }
        if (C7471uYa.a((Object) str, (Object) a.INLAY.a())) {
            return "video-inlay";
        }
        if (C7471uYa.a((Object) str, (Object) a.PRESTITIAL.a())) {
            return "prestitial";
        }
        return C7471uYa.a((Object) str, (Object) a.SPONSORED_SESSION.a()) ? "sponsored_session" : "interstitial";
    }

    public void a(String str, View view) {
        C7471uYa.b(str, "uuid");
        C7471uYa.b(view, "view");
        ReactiveVideoTracker f2 = f(str);
        if (f2 != null) {
            f2.changeTargetView(view);
        }
    }

    public void a(String str, long j, float f2) {
        C7471uYa.b(str, "uuid");
        a(str, MoatAdEventType.AD_EVT_START, j);
    }

    public void a(String str, long j) {
        C7471uYa.b(str, "uuid");
        a(str, MoatAdEventType.AD_EVT_COMPLETE, j);
        a(str);
    }

    public void a(String str, boolean z) {
        C7471uYa.b(str, "uuid");
        if (z) {
            c(str);
        } else {
            b(str);
        }
    }

    private final void a(String str, MoatAdEventType moatAdEventType, long j) {
        ReactiveVideoTracker f2 = f(str);
        if (f2 != null) {
            f2.dispatchEvent(new MoatAdEvent(moatAdEventType, Integer.valueOf((int) j)));
        }
    }

    public void a(View view, ca caVar) {
        C7471uYa.b(view, "imageView");
        C7471uYa.b(caVar, "adData");
        if ((caVar instanceof P) || (caVar instanceof ea)) {
            NativeDisplayTracker createNativeDisplayTracker = f().createNativeDisplayTracker(view, a(caVar.f(), caVar.k().a()));
            this.d = createNativeDisplayTracker;
            createNativeDisplayTracker.startTracking();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    private final Map<String, String> a(C3508cda cda, String str) {
        List list;
        Map<String, String> map;
        boolean z;
        String d2 = cda.d();
        C7471uYa.a((Object) d2, "adUrn.stringId");
        List a2 = new C7162pxb("-").a((CharSequence) d2, 0);
        if (!a2.isEmpty()) {
            ListIterator listIterator = a2.listIterator(a2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (((String) listIterator.previous()).length() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    list = C7676xWa.d((Iterable) a2, listIterator.nextIndex() + 1);
                    break;
                }
            }
            if (list == null) {
                Object[] array = list.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    StringBuilder sb = new StringBuilder();
                    sb.append("android-");
                    sb.append(String.valueOf(this.f.b()));
                    String sb2 = sb.toString();
                    if (strArr.length != 2) {
                        return LWa.a();
                    }
                    String e2 = e(str);
                    if (C7471uYa.a((Object) str, (Object) a.INTERSTITIAL.a())) {
                        map = a(strArr[0], strArr[1], sb2, e2);
                    } else {
                        map = b(strArr[0], strArr[1], sb2, e2);
                    }
                    return map;
                }
                throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new OVa("null cannot be cast to non-null type java.util.Collection<T>");
        }
        list = C6918mWa.a();
        if (list == null) {
        }
    }

    private final Map<String, String> a(String str, String str2, String str3, String str4) {
        return LWa.b(NVa.a("moatClientLevel1", str), NVa.a("moatClientLevel2", str2), NVa.a("moatClientSlicer1", str3), NVa.a("moatClientSlicer2", str4));
    }
}
