package com.soundcloud.android.profile;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.va;
import com.soundcloud.android.stations.Ga;
import com.soundcloud.android.view.CircularBorderImageView;
import com.soundcloud.android.view.ProfileToggleButton;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

@EVa(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 ]2\u00020\u0001:\u0001]BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0018\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020*H\u0016J\"\u0010C\u001a\u00020?2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010I\u001a\u00020?2\u0006\u0010B\u001a\u00020*H\u0012J \u0010J\u001a\u00020K2\u0006\u0010D\u001a\u00020L2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0012J\b\u0010M\u001a\u00020?H\u0016J\b\u0010N\u001a\u00020OH\u0012J\u0010\u0010P\u001a\u00020G2\u0006\u0010D\u001a\u00020EH\u0012J\u0010\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020TH\u0012J\u0010\u0010U\u001a\u00020?2\u0006\u0010D\u001a\u00020EH\u0012J\u0010\u0010'\u001a\u00020?2\u0006\u0010D\u001a\u00020EH\u0012J\u0010\u0010V\u001a\u00020?2\u0006\u0010S\u001a\u00020TH\u0012J\u0010\u00104\u001a\u00020?2\u0006\u0010D\u001a\u00020EH\u0012J\u0010\u0010W\u001a\u00020?2\u0006\u0010D\u001a\u00020EH\u0012J\u0010\u0010X\u001a\u00020?2\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010[\u001a\u00020?2\u0006\u0010D\u001a\u00020EH\u0012J\b\u0010\\\u001a\u00020?H\u0012R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020*X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u0018X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u00020\u0018X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u00020\u001eX.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010 \"\u0004\b7\u0010\"R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u001a\u00108\u001a\u00020\u001eX.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010;\u001a\u00020$X.¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010&\"\u0004\b=\u0010(¨\u0006^"}, d2 = {"Lcom/soundcloud/android/profile/ProfileHeaderPresenter;", "", "imageOperations", "Lcom/soundcloud/android/image/ImageOperations;", "numberFormatter", "Lcom/soundcloud/android/util/CondensedNumberFormatter;", "followingOperations", "Lcom/soundcloud/android/associations/FollowingOperations;", "engagementsTracking", "Lcom/soundcloud/android/analytics/EngagementsTracking;", "stationHandler", "Lcom/soundcloud/android/stations/StartStationHandler;", "screenProvider", "Lcom/soundcloud/android/foundation/events/ScreenProvider;", "profileImageHelper", "Lcom/soundcloud/android/profile/ProfileImageHelper;", "shareOperations", "Lcom/soundcloud/android/share/ShareOperations;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "observerFactory", "Lcom/soundcloud/android/rx/observers/ObserverFactory;", "(Lcom/soundcloud/android/image/ImageOperations;Lcom/soundcloud/android/util/CondensedNumberFormatter;Lcom/soundcloud/android/associations/FollowingOperations;Lcom/soundcloud/android/analytics/EngagementsTracking;Lcom/soundcloud/android/stations/StartStationHandler;Lcom/soundcloud/android/foundation/events/ScreenProvider;Lcom/soundcloud/android/profile/ProfileImageHelper;Lcom/soundcloud/android/share/ShareOperations;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/rx/observers/ObserverFactory;)V", "banner", "Landroid/widget/ImageView;", "getBanner", "()Landroid/widget/ImageView;", "setBanner", "(Landroid/widget/ImageView;)V", "followButton", "Lcom/soundcloud/android/view/ProfileToggleButton;", "getFollowButton", "()Lcom/soundcloud/android/view/ProfileToggleButton;", "setFollowButton", "(Lcom/soundcloud/android/view/ProfileToggleButton;)V", "followerCount", "Landroid/widget/TextView;", "getFollowerCount", "()Landroid/widget/TextView;", "setFollowerCount", "(Landroid/widget/TextView;)V", "headerInfoLayout", "Landroid/view/View;", "getHeaderInfoLayout", "()Landroid/view/View;", "setHeaderInfoLayout", "(Landroid/view/View;)V", "image", "getImage", "setImage", "proBadge", "getProBadge", "setProBadge", "shareButton", "getShareButton", "setShareButton", "stationButton", "getStationButton", "setStationButton", "username", "getUsername", "setUsername", "attach", "", "fragment", "Landroidx/fragment/app/Fragment;", "view", "bindImage", "user", "Lcom/soundcloud/android/foundation/domain/users/User;", "imageResource", "Lcom/soundcloud/android/foundation/domain/ImageResource;", "imageView", "bindViews", "createOnClickListener", "Landroid/view/View$OnClickListener;", "Lcom/soundcloud/android/foundation/domain/Urn;", "detach", "getEventContextMetadata", "Lcom/soundcloud/android/foundation/events/EventContextMetadata;", "getImageResource", "isStationButtonAvailable", "", "userItem", "Lcom/soundcloud/android/users/UserItem;", "setArtistStation", "setFollowingButton", "setShareProfileButton", "setUserDetails", "profileItem", "Lcom/soundcloud/android/profile/ProfileItem;", "setUserImage", "updateStationButton", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.profile.ta reason: case insensitive filesystem */
/* compiled from: ProfileHeaderPresenter.kt */
public class C5850ta {
    public static final a a = new a(null);
    public View b;
    public TextView c;
    public ImageView d;
    public TextView e;
    public ProfileToggleButton f;
    public ProfileToggleButton g;
    public ProfileToggleButton h;
    public ImageView i;
    private ImageView j;
    private final N k;
    private final C5408WFa l;
    private final C3240rR m;
    private final C2390YL n;
    /* access modifiers changed from: private */
    public final Ga o;
    private final F p;
    private final Aa q;
    /* access modifiers changed from: private */
    public final C6614hxa r;
    /* access modifiers changed from: private */
    public final C3700b s;
    /* access modifiers changed from: private */
    public final C5606ava t;

    /* renamed from: com.soundcloud.android.profile.ta$a */
    /* compiled from: ProfileHeaderPresenter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C5850ta(N n2, C5408WFa wFa, C3240rR rRVar, C2390YL yl, Ga ga, F f2, Aa aa, C6614hxa hxa, C3700b bVar, C5606ava ava) {
        C7471uYa.b(n2, "imageOperations");
        C7471uYa.b(wFa, "numberFormatter");
        C7471uYa.b(rRVar, "followingOperations");
        C7471uYa.b(yl, "engagementsTracking");
        C7471uYa.b(ga, "stationHandler");
        C7471uYa.b(f2, "screenProvider");
        C7471uYa.b(aa, "profileImageHelper");
        C7471uYa.b(hxa, "shareOperations");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(ava, "observerFactory");
        this.k = n2;
        this.l = wFa;
        this.m = rRVar;
        this.n = yl;
        this.o = ga;
        this.p = f2;
        this.q = aa;
        this.r = hxa;
        this.s = bVar;
        this.t = ava;
    }

    /* access modifiers changed from: private */
    public C3710l j() {
        String a2 = this.p.a();
        v vVar = r1;
        v vVar2 = new v("single", 0);
        C3710l lVar = new C3710l(null, a2, vVar, false, null, null, null, null, null, null, null, null, null, null, 16377, null);
        return lVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if ((c().getVisibility() == 0) != false) goto L_0x0026;
     */
    public void k() {
        boolean z = true;
        boolean z2 = !c().isChecked();
        ProfileToggleButton h2 = h();
        if (z2) {
        }
        z = false;
        h2.setChecked(z);
    }

    public ProfileToggleButton g() {
        ProfileToggleButton profileToggleButton = this.g;
        if (profileToggleButton != null) {
            return profileToggleButton;
        }
        C7471uYa.b("shareButton");
        throw null;
    }

    public ProfileToggleButton h() {
        ProfileToggleButton profileToggleButton = this.h;
        if (profileToggleButton != null) {
            return profileToggleButton;
        }
        C7471uYa.b("stationButton");
        throw null;
    }

    public TextView i() {
        TextView textView = this.c;
        if (textView != null) {
            return textView;
        }
        C7471uYa.b("username");
        throw null;
    }

    public void a(View view) {
        C7471uYa.b(view, "<set-?>");
        this.b = view;
    }

    public void b(TextView textView) {
        C7471uYa.b(textView, "<set-?>");
        this.c = textView;
    }

    public ProfileToggleButton c() {
        ProfileToggleButton profileToggleButton = this.f;
        if (profileToggleButton != null) {
            return profileToggleButton;
        }
        C7471uYa.b("followButton");
        throw null;
    }

    public TextView d() {
        TextView textView = this.e;
        if (textView != null) {
            return textView;
        }
        C7471uYa.b("followerCount");
        throw null;
    }

    public ImageView e() {
        ImageView imageView = this.d;
        if (imageView != null) {
            return imageView;
        }
        C7471uYa.b("image");
        throw null;
    }

    public ImageView f() {
        ImageView imageView = this.i;
        if (imageView != null) {
            return imageView;
        }
        C7471uYa.b("proBadge");
        throw null;
    }

    private void d(C3784hea hea) {
        f().setVisibility(hea.g() ? 0 : 8);
    }

    private void e(C3784hea hea) {
        g().setOnClickListener(new C5865wa(this, hea));
    }

    private void f(C3784hea hea) {
        Vca a2 = a(hea);
        a(hea, a2, b());
        e().setOnClickListener(new C5870xa(a2));
    }

    public void a(TextView textView) {
        C7471uYa.b(textView, "<set-?>");
        this.e = textView;
    }

    public void b(ImageView imageView) {
        C7471uYa.b(imageView, "<set-?>");
        this.d = imageView;
    }

    public void c(ProfileToggleButton profileToggleButton) {
        C7471uYa.b(profileToggleButton, "<set-?>");
        this.h = profileToggleButton;
    }

    public void a(ProfileToggleButton profileToggleButton) {
        C7471uYa.b(profileToggleButton, "<set-?>");
        this.f = profileToggleButton;
    }

    public void b(ProfileToggleButton profileToggleButton) {
        C7471uYa.b(profileToggleButton, "<set-?>");
        this.g = profileToggleButton;
    }

    public void c(ImageView imageView) {
        C7471uYa.b(imageView, "<set-?>");
        this.i = imageView;
    }

    private void c(C3784hea hea) {
        TextView d2 = d();
        long j2 = (long) -1;
        int i2 = 0;
        if (hea.c() == j2) {
            i2 = 4;
        }
        d2.setVisibility(i2);
        if (hea.c() != j2) {
            d().setText(this.l.a(hea.c()));
        }
    }

    public void a(ImageView imageView) {
        this.j = imageView;
    }

    public ImageView b() {
        return this.j;
    }

    private void b(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i.header_info_layout);
        C7471uYa.a((Object) relativeLayout, "view.header_info_layout");
        a((View) relativeLayout);
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.username);
        C7471uYa.a((Object) customFontTextView, "view.username");
        b((TextView) customFontTextView);
        CircularBorderImageView circularBorderImageView = (CircularBorderImageView) view.findViewById(i.image);
        C7471uYa.a((Object) circularBorderImageView, "view.image");
        b((ImageView) circularBorderImageView);
        CustomFontTextView customFontTextView2 = (CustomFontTextView) view.findViewById(i.followers_count);
        C7471uYa.a((Object) customFontTextView2, "view.followers_count");
        a((TextView) customFontTextView2);
        ProfileToggleButton profileToggleButton = (ProfileToggleButton) view.findViewById(i.toggle_btn_follow);
        C7471uYa.a((Object) profileToggleButton, "view.toggle_btn_follow");
        a(profileToggleButton);
        ProfileToggleButton profileToggleButton2 = (ProfileToggleButton) view.findViewById(i.toggle_btn_share);
        C7471uYa.a((Object) profileToggleButton2, "view.toggle_btn_share");
        b(profileToggleButton2);
        ProfileToggleButton profileToggleButton3 = (ProfileToggleButton) view.findViewById(i.btn_station);
        C7471uYa.a((Object) profileToggleButton3, "view.btn_station");
        c(profileToggleButton3);
        ImageView imageView = (ImageView) view.findViewById(i.pro_badge);
        C7471uYa.a((Object) imageView, "view.pro_badge");
        c(imageView);
        a((ImageView) view.findViewById(i.profile_banner));
    }

    public void a(Fragment fragment, View view) {
        C7471uYa.b(fragment, "fragment");
        C7471uYa.b(view, "view");
        b(view);
        h().setVisibility(4);
        c().setVisibility(8);
    }

    public void a() {
        this.q.a();
    }

    private OnClickListener a(C3508cda cda, C3240rR rRVar, C2390YL yl) {
        return new C5855ua(this, rRVar, cda, yl);
    }

    public void a(Ka ka) {
        C7471uYa.b(ka, "profileItem");
        C3784hea hea = ka.a().d;
        i().setText(hea.c);
        i().setVisibility(0);
        f(hea);
        c(hea);
        d(hea);
        e(hea);
        if (ka.b()) {
            c().setVisibility(8);
        } else {
            b(ka.a());
        }
        b(hea);
    }

    private void b(C4954HFa hFa) {
        if (hFa.e) {
            if (c().a() || !a(hFa)) {
                c().setTextOn(p.btn_following);
            } else {
                c().setTextOn(-1);
            }
        }
        c().setVisibility(0);
        c().setChecked(hFa.e);
        c().setOnClickListener(a(hFa.a(), this.m, this.n));
    }

    public void a(C3784hea hea, Vca vca, ImageView imageView) {
        C7471uYa.b(hea, "user");
        C7471uYa.b(vca, "imageResource");
        if (imageView != null) {
            this.q.a(new Ja(hea), imageView, e());
            return;
        }
        N n2 = this.k;
        C3508cda a2 = vca.a();
        C4928GKa b2 = vca.b();
        C3721b b3 = C3721b.b(e().getResources());
        C7471uYa.a((Object) b3, "ApiImageSize.getFullImageSize(image.resources)");
        N.a(n2, a2, b2, b3, e(), null, 16, null);
    }

    private void b(C3784hea hea) {
        C3508cda a2 = hea.a();
        if (a2 != null) {
            h().setOnClickListener(new C5860va(a2, this));
            h().setVisibility(0);
            k();
            return;
        }
        h().setVisibility(8);
    }

    private Vca a(C3784hea hea) {
        va a2 = va.a(hea.a, C4928GKa.b(hea.l));
        C7471uYa.a((Object) a2, "SimpleImageResource.crea…Nullable(user.avatarUrl))");
        return a2;
    }

    private boolean a(C4954HFa hFa) {
        if (hFa.d.a() == null) {
            if (!(h().getVisibility() == 0)) {
                return false;
            }
        }
        return true;
    }
}
