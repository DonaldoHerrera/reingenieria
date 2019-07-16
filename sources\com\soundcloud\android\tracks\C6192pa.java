package com.soundcloud.android.tracks;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.foundation.events.B;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3704f;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.offline.C4070ce;
import com.soundcloud.android.view.L;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001LB_\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0002H\u0002J\"\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001fH\u0002J \u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0002H\u0016J\"\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020)2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.JH\u0010/\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u00010.2\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001012\u0006\u00105\u001a\u000206H\u0002J:\u00107\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020)2\u0006\u0010'\u001a\u00020(2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010\u001a\u001a\u00020\u001bJ \u00108\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020)2\b\u00104\u001a\u0004\u0018\u000101J*\u00109\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020)2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u00010.JR\u0010:\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u00102\u001a\u0004\u0018\u0001032\b\u00100\u001a\u0004\u0018\u0001012\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u00104\u001a\u0004\u0018\u0001012\u0006\u00105\u001a\u000206H\u0002J2\u0010:\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u00102\u001a\u0004\u0018\u0001032\u0006\u00105\u001a\u000206J\u0010\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020=H\u0016J8\u0010>\u001a\u00020?2\u0006\u0010*\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u0001032\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u00010.2\b\u00104\u001a\u0004\u0018\u000101H\u0002J\u0010\u0010@\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010D\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u0002H\u0002J\u0010\u0010E\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020CH\u0002J\u0018\u0010F\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010B\u001a\u00020CH\u0002JH\u0010G\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020)2\u0006\u0010 \u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u00010.2\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001012\u0006\u00105\u001a\u000206H\u0002J\u0014\u0010I\u001a\u00020\u001d*\u00020\u001f2\u0006\u0010,\u001a\u00020\u0002H\u0002J\u0014\u0010J\u001a\u00020\u001d*\u00020\u001f2\u0006\u0010,\u001a\u00020\u0002H\u0002J\u0014\u0010K\u001a\u00020\u001d*\u00020\u001f2\u0006\u0010 \u001a\u00020\u0002H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/soundcloud/android/tracks/TrackItemRenderer;", "Lcom/soundcloud/android/presentation/LegacyCellRenderer;", "Lcom/soundcloud/android/tracks/TrackItem;", "imageOperations", "Lcom/soundcloud/android/image/ImageOperations;", "numberFormatter", "Lcom/soundcloud/android/util/CondensedNumberFormatter;", "trackItemMenuPresenter", "Lcom/soundcloud/android/tracks/TrackItemMenuPresenter;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "screenProvider", "Lcom/soundcloud/android/foundation/events/ScreenProvider;", "navigator", "Lcom/soundcloud/android/navigation/Navigator;", "featureOperations", "Lcom/soundcloud/android/configuration/plans/FeatureOperations;", "trackItemViewFactory", "Lcom/soundcloud/android/tracks/TrackItemView$Factory;", "offlineSettingsOperations", "Lcom/soundcloud/android/offline/OfflineSettingsOperations;", "connectionHelper", "Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;", "trackStatsDisplayPolicy", "Lcom/soundcloud/android/tracks/TrackStatsDisplayPolicy;", "(Lcom/soundcloud/android/image/ImageOperations;Lcom/soundcloud/android/util/CondensedNumberFormatter;Lcom/soundcloud/android/tracks/TrackItemMenuPresenter;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/foundation/events/ScreenProvider;Lcom/soundcloud/android/navigation/Navigator;Lcom/soundcloud/android/configuration/plans/FeatureOperations;Lcom/soundcloud/android/tracks/TrackItemView$Factory;Lcom/soundcloud/android/offline/OfflineSettingsOperations;Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;Lcom/soundcloud/android/tracks/TrackStatsDisplayPolicy;)V", "canShowOfflineState", "", "bindArtwork", "", "itemView", "Lcom/soundcloud/android/tracks/TrackItemView;", "track", "bindExtraInfoBottom", "activeFooter", "Lcom/soundcloud/android/tracks/TrackItemRenderer$ActiveFooter;", "bindExtraInfoRight", "trackItemView", "bindItemView", "position", "", "Landroid/view/View;", "item", "bindOfflineTrackView", "trackItem", "trackSourceInfo", "Lcom/soundcloud/android/foundation/events/TrackSourceInfo;", "bindOverFlow", "pageUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "module", "Lcom/soundcloud/android/foundation/events/Module;", "queryUrn", "itemMenuOptions", "Lcom/soundcloud/android/presentation/ItemMenuOptions;", "bindPlaylistTrackView", "bindSearchTrackView", "bindSystemPlaylistTrackView", "bindTrackView", "createItemView", "parent", "Landroid/view/ViewGroup;", "getEventContextMetaData", "Lcom/soundcloud/android/foundation/events/EventContextMetadata;", "handleRequestedOfflineState", "isActiveOfflineState", "offlineState", "Lcom/soundcloud/android/foundation/domain/offline/OfflineState;", "shouldDisplayPlayCount", "shouldShowOfflineState", "showOfflineState", "showTrackItemMenu", "button", "showPlayCount", "showPlaysAndPostedTime", "showPromoted", "ActiveFooter", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.tracks.pa reason: case insensitive filesystem */
/* compiled from: TrackItemRenderer.kt */
public class C6192pa extends C5541_ta<C6185ma> {
    private boolean a = true;
    private final N b;
    private final C5408WFa c;
    private final C6188na d;
    private final C3700b e;
    private final F f;
    private final C4655rja g;
    private final C2436_U h;
    public final com.soundcloud.android.tracks.Ea.a i;
    private final C4070ce j;
    private final C6834lGa k;
    private final Va l;

    /* renamed from: com.soundcloud.android.tracks.pa$a */
    /* compiled from: TrackItemRenderer.kt */
    private enum a {
        POSTED,
        PLAYS_AND_POSTED,
        OFFLINE_STATE
    }

    public C6192pa(N n, C5408WFa wFa, C6188na naVar, C3700b bVar, F f2, C4655rja rja, C2436_U _u, com.soundcloud.android.tracks.Ea.a aVar, C4070ce ceVar, C6834lGa lga, Va va) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(wFa, "numberFormatter");
        C7471uYa.b(naVar, "trackItemMenuPresenter");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(f2, "screenProvider");
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(aVar, "trackItemViewFactory");
        C7471uYa.b(ceVar, "offlineSettingsOperations");
        C7471uYa.b(lga, "connectionHelper");
        C7471uYa.b(va, "trackStatsDisplayPolicy");
        this.b = n;
        this.c = wFa;
        this.d = naVar;
        this.e = bVar;
        this.f = f2;
        this.g = rja;
        this.h = _u;
        this.i = aVar;
        this.j = ceVar;
        this.k = lga;
        this.l = va;
    }

    private final void c(Ea ea, C6185ma maVar) {
        Date D = maVar.D();
        if (a(maVar)) {
            ea.a(this.c.a((long) maVar.S()), D);
        } else {
            ea.a(D);
        }
    }

    private final void d(Ea ea, C6185ma maVar) {
        if (!maVar.n() || !maVar.k()) {
            ea.c(ea.a().getString(p.promoted));
            return;
        }
        ea.c(ea.a().getString(p.promoted_by_promotorname, new Object[]{maVar.u()}));
        ea.a((OnClickListener) new L(maVar, this.e, this.f, this.g));
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View a2 = this.i.a(viewGroup);
        C7471uYa.a((Object) a2, "trackItemViewFactory.createItemView(parent)");
        return a2;
    }

    private final boolean b(C3823mda mda) {
        return this.a && this.h.l() && a(mda);
    }

    private final void b(Ea ea, C6185ma maVar) {
        if (a(maVar)) {
            ea.b(this.c.a((long) maVar.S()));
        }
    }

    public void a(int i2, View view, C6185ma maVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(maVar, "item");
        a(maVar, view, (I) null, (v) null, (C3508cda) null, (a) null, (C3508cda) null, C5512Zta.a.a());
    }

    public final void a(C6185ma maVar, View view, I i2, v vVar, C5512Zta zta) {
        C7471uYa.b(maVar, "track");
        C7471uYa.b(view, "itemView");
        C7471uYa.b(zta, "itemMenuOptions");
        a(maVar, view, i2, vVar, (C3508cda) null, (a) null, (C3508cda) null, zta);
    }

    public final void a(C6185ma maVar, View view, C3508cda cda) {
        C7471uYa.b(maVar, "track");
        C7471uYa.b(view, "itemView");
        a(maVar, view, (I) null, (v) null, (C3508cda) null, (a) null, cda, C5512Zta.a.a());
    }

    public final void a(C6185ma maVar, View view, int i2, C3508cda cda, I i3, boolean z) {
        C7471uYa.b(maVar, "track");
        C7471uYa.b(view, "itemView");
        this.a = z;
        if (maVar.K()) {
            view.setOnClickListener(null);
        }
        a(maVar, view, i3, new v("playlist", i2), cda, a.OFFLINE_STATE, (C3508cda) null, C5512Zta.a.a());
    }

    public final void a(C6185ma maVar, View view, C3508cda cda, I i2) {
        C7471uYa.b(maVar, "track");
        C7471uYa.b(view, "itemView");
        a(maVar, view, i2, (v) null, cda, a.PLAYS_AND_POSTED, (C3508cda) null, C5512Zta.a.a());
    }

    public static /* synthetic */ void a(C6192pa paVar, C6185ma maVar, View view, I i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                i2 = null;
            }
            paVar.a(maVar, view, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindOfflineTrackView");
    }

    public final void a(C6185ma maVar, View view, I i2) {
        C7471uYa.b(maVar, "trackItem");
        C7471uYa.b(view, "itemView");
        a(maVar, view, i2, (v) null, (C3508cda) null, a.OFFLINE_STATE, (C3508cda) null, C5512Zta.a.a());
    }

    private final void a(C6185ma maVar, View view, I i2, v vVar, C3508cda cda, a aVar, C3508cda cda2, C5512Zta zta) {
        C6185ma maVar2 = maVar;
        Object tag = view.getTag();
        C7471uYa.a(tag, "itemView.tag");
        if (tag instanceof Ea) {
            Ea ea = (Ea) tag;
            ea.a((CharSequence) maVar.d());
            ea.a(maVar.B(), maVar.K() ? this.i.a() : this.i.b());
            View view2 = view;
            view.setClickable(!maVar.K());
            a(maVar, ea);
            a aVar2 = aVar;
            a(ea, maVar, aVar);
            a(ea, maVar);
            a(ea, maVar, cda, i2, vVar, cda2, zta);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(tag);
        sb.append(" not of type ");
        sb.append(Ea.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }

    private final void a(C6185ma maVar, Ea ea) {
        ea.g();
        if (C6158da.b(maVar)) {
            ea.q();
            return;
        }
        if (maVar.m()) {
            ea.r();
        }
        ea.a(C7315sGa.a(maVar.g(), TimeUnit.MILLISECONDS));
    }

    private final void a(Ea ea, C6185ma maVar, C3508cda cda, I i2, v vVar, C3508cda cda2, C5512Zta zta) {
        C6195ra raVar = new C6195ra(this, maVar, cda, i2, vVar, cda2, zta);
        Ea ea2 = ea;
        ea.a((b) raVar);
    }

    /* access modifiers changed from: private */
    public final void a(View view, C6185ma maVar, C3508cda cda, I i2, v vVar, C3508cda cda2, C5512Zta zta) {
        C6188na naVar = this.d;
        FragmentActivity c2 = C6768kIa.c(view);
        PromotedSourceInfo promotedSourceInfo = null;
        C3508cda a2 = i2 != null ? i2.a() : null;
        C3508cda d2 = i2 != null ? i2.d() : null;
        if (i2 != null) {
            promotedSourceInfo = i2.f();
        }
        naVar.a(c2, view, maVar, a2, d2, promotedSourceInfo, a(maVar, vVar, cda, i2, cda2), zta);
    }

    private final C3710l a(C6185ma maVar, v vVar, C3508cda cda, I i2, C3508cda cda2) {
        C3508cda cda3;
        C3508cda cda4;
        C3508cda cda5;
        String a2 = this.f.a();
        C3704f a3 = C5672bua.a(maVar);
        if (cda != null) {
            cda3 = cda;
        } else {
            C3508cda cda6 = C3508cda.a;
            C7471uYa.a((Object) cda6, "Urn.NOT_SET");
            cda3 = cda6;
        }
        if (cda2 != null) {
            cda4 = cda2;
        } else {
            if (i2 != null) {
                B g2 = i2.g();
                if (g2 != null) {
                    cda5 = g2.b();
                    cda4 = cda5;
                }
            }
            cda5 = null;
            cda4 = cda5;
        }
        C3710l lVar = new C3710l(null, a2, vVar, false, cda3, null, a3, i2, cda4, null, null, null, null, null, 15913, null);
        return lVar;
    }

    private final void a(Ea ea, C6185ma maVar) {
        N n = this.b;
        C3508cda a2 = maVar.a();
        C7471uYa.a((Object) a2, "track.urn");
        C4928GKa b2 = maVar.b();
        C7471uYa.a((Object) b2, "track.imageUrlTemplate");
        C3721b c2 = C3721b.c(ea.d());
        C7471uYa.a((Object) c2, "ApiImageSize.getListItem…eSize(itemView.resources)");
        ImageView c3 = ea.c();
        C7471uYa.a((Object) c3, "itemView.image");
        n.a(a2, b2, c2, c3, false);
        if (C6158da.a(maVar) || C6158da.b(maVar)) {
            ea.l();
        }
    }

    private final void a(Ea ea, C6185ma maVar, a aVar) {
        ea.h();
        if (maVar.n()) {
            d(ea, maVar);
        } else if (maVar.K()) {
            ea.k();
        } else if (maVar.M()) {
            ea.p();
        } else if (this.h.l() && maVar.Q()) {
            ea.o();
        } else if (a.OFFLINE_STATE == aVar && b(maVar.r())) {
            a(ea, maVar.r());
        } else if (a.POSTED == aVar) {
            ea.a(maVar.D());
        } else if (a.PLAYS_AND_POSTED == aVar) {
            c(ea, maVar);
        } else {
            b(ea, maVar);
        }
    }

    private final boolean a(C3823mda mda) {
        return C3823mda.REQUESTED == mda || C3823mda.DOWNLOADING == mda || C3823mda.DOWNLOADED == mda;
    }

    private final void a(Ea ea, C3823mda mda) {
        int i2 = C6194qa.a[mda.ordinal()];
        if (i2 == 1) {
            a(ea);
        } else if (i2 == 2) {
            ea.j();
        } else if (i2 == 3) {
            ea.i();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't show offline state ");
            sb.append(mda);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private final void a(Ea ea) {
        if (this.j.a() && !this.k.a()) {
            ea.n();
        } else if (!this.k.d()) {
            ea.m();
        } else {
            ea.s();
        }
    }

    private final boolean a(C6185ma maVar) {
        return this.l.b(maVar);
    }
}
