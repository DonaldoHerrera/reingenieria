package com.soundcloud.android.trackinfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.trackinfo.x.i;
import com.soundcloud.android.trackinfo.x.l;
import com.soundcloud.android.trackinfo.x.o;
import dagger.android.support.b;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001@B\u0005¢\u0006\u0002\u0010\u0005J\u001c\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#H\u0016J\b\u0010&\u001a\u00020'H\u0002J\u0012\u0010(\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00100\u001a\u00020!2\b\u00101\u001a\u0004\u0018\u000102H\u0016J&\u00103\u001a\u0004\u0018\u00010*2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00108\u001a\u00020!H\u0016J\b\u00109\u001a\u00020!H\u0016J\b\u0010:\u001a\u00020!H\u0016J\u001a\u0010;\u001a\u00020!2\u0006\u0010<\u001a\u00020*2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020'0>H\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020'0>H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006A"}, d2 = {"Lcom/soundcloud/android/trackinfo/NewTrackInfoFragment;", "Ldagger/android/support/DaggerAppCompatDialogFragment;", "Lcom/soundcloud/android/trackinfo/TrackInfoView;", "Landroid/view/View$OnClickListener;", "Lcom/soundcloud/android/trackinfo/OnCommentDialogClickLister;", "()V", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "getAnalytics$trackinfo_release", "()Lcom/soundcloud/android/foundation/events/Analytics;", "setAnalytics$trackinfo_release", "(Lcom/soundcloud/android/foundation/events/Analytics;)V", "commentPosition", "", "getCommentPosition", "()J", "setCommentPosition", "(J)V", "newTrackInfoCollectionRenderer", "Lcom/soundcloud/android/trackinfo/NewTrackInfoCollectionRenderer;", "newTrackInfoPresenter", "Lcom/soundcloud/android/trackinfo/NewTrackInfoPresenter;", "getNewTrackInfoPresenter$trackinfo_release", "()Lcom/soundcloud/android/trackinfo/NewTrackInfoPresenter;", "setNewTrackInfoPresenter$trackinfo_release", "(Lcom/soundcloud/android/trackinfo/NewTrackInfoPresenter;)V", "trackInfoCommentClickListener", "Lcom/soundcloud/android/trackinfo/NewTrackInfoCommentClickListener;", "getTrackInfoCommentClickListener$trackinfo_release", "()Lcom/soundcloud/android/trackinfo/NewTrackInfoCommentClickListener;", "setTrackInfoCommentClickListener$trackinfo_release", "(Lcom/soundcloud/android/trackinfo/NewTrackInfoCommentClickListener;)V", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "Lcom/soundcloud/android/trackinfo/TrackInfoViewModel;", "Lcom/soundcloud/android/trackinfo/TrackInfoError;", "getTrackInfoParamsFromBundle", "Lcom/soundcloud/android/trackinfo/TrackInfoParams;", "onClick", "v", "Landroid/view/View;", "onCommentsClicked", "trackUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "secretToken", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onRefreshed", "onResume", "onViewCreated", "view", "refreshSignal", "Lio/reactivex/Observable;", "requestContent", "Companion", "trackinfo_release"}, mv = {1, 1, 15})
/* compiled from: NewTrackInfoFragment.kt */
public final class f extends b implements A, OnClickListener, w {
    public static final a b = new a(null);
    public C3700b c;
    public q d;
    public C6147e e;
    private C6146d f;
    private long g;
    private HashMap h;

    /* compiled from: NewTrackInfoFragment.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final f a(C3508cda cda, Long l) {
            C7471uYa.b(cda, "trackUrn");
            Bundle a = C1687sb.a(NVa.a("Urn", cda.b()), NVa.a("COMMENT_POSITION", l));
            f fVar = new f();
            fVar.setArguments(a);
            return fVar;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public f() {
        setRetainInstance(true);
    }

    /* access modifiers changed from: private */
    public final z Rb() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String str = "Urn";
            String str2 = "Missing required URN parameter";
            if (arguments.containsKey(str)) {
                String string = arguments.getString(str);
                if (string != null) {
                    C3508cda cda = new C3508cda(string);
                    String str3 = "COMMENT_POSITION";
                    if (arguments.containsKey(str3)) {
                        this.g = arguments.getLong(str3, 0);
                    }
                    return new z(cda, Long.valueOf(this.g));
                }
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalArgumentException("Missing required arguments");
    }

    @NXa
    public static final f a(C3508cda cda, Long l) {
        return b.a(cda, l);
    }

    public void Qb() {
        HashMap hashMap = this.h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void b() {
    }

    public APa<z> c() {
        APa<z> c2 = APa.c(Rb());
        C7471uYa.a((Object) c2, "Observable.just(getTrackInfoParamsFromBundle())");
        return c2;
    }

    public APa<RVa> e() {
        return com.soundcloud.android.trackinfo.A.a.a(this);
    }

    public APa<z> f() {
        C6146d dVar = this.f;
        if (dVar != null) {
            APa<z> h2 = dVar.g().h(new h(this));
            C7471uYa.a((Object) h2, "newTrackInfoCollectionRe…kInfoParamsFromBundle() }");
            return h2;
        }
        C7471uYa.b("newTrackInfoCollectionRenderer");
        throw null;
    }

    public void onClick(View view) {
        dismiss();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, o.Theme_TrackInfoDialog);
        this.f = new C6146d(new C6144b(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7471uYa.b(layoutInflater, "inflater");
        return layoutInflater.inflate(l.new_track_info_recyclerview_with_refresh_no_empty, viewGroup, false);
    }

    public void onDestroyView() {
        q qVar = this.d;
        if (qVar != null) {
            qVar.a();
            qVar.destroy();
            C6146d dVar = this.f;
            if (dVar != null) {
                dVar.b();
                super.onDestroyView();
                Qb();
                return;
            }
            C7471uYa.b("newTrackInfoCollectionRenderer");
            throw null;
        }
        C7471uYa.b("newTrackInfoPresenter");
        throw null;
    }

    public void onResume() {
        super.onResume();
        C3700b bVar = this.c;
        if (bVar != null) {
            bVar.a(Yca.PLAYER_INFO);
        } else {
            C7471uYa.b("analytics");
            throw null;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        super.onViewCreated(view, bundle);
        q qVar = this.d;
        if (qVar != null) {
            qVar.a(this);
            C6146d dVar = this.f;
            if (dVar != null) {
                int i = i.ak_recycler_view;
                View view2 = view;
                C5494ZEa.a(dVar, view2, false, new g(this), l.emptyview_container, i, i.str_layout, 2, null);
                view.setOnClickListener(this);
                return;
            }
            C7471uYa.b("newTrackInfoCollectionRenderer");
            throw null;
        }
        C7471uYa.b("newTrackInfoPresenter");
        throw null;
    }

    public void a(C3508cda cda, String str) {
        C7471uYa.b(cda, "trackUrn");
        C6147e eVar = this.e;
        if (eVar != null) {
            eVar.a(cda, this.g, str);
            dismiss();
            return;
        }
        C7471uYa.b("trackInfoCommentClickListener");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r4 != null) goto L_0x0020;
     */
    public void a(C6832lEa<B, y> lea) {
        List list;
        C7471uYa.b(lea, "viewModel");
        C6146d dVar = this.f;
        if (dVar != null) {
            C6900mEa a2 = lea.a();
            B b2 = (B) lea.b();
            if (b2 != null) {
                list = C6850lWa.a(b2);
            }
            list = C6918mWa.a();
            dVar.a(new C4736AEa<>(a2, list));
            return;
        }
        C7471uYa.b("newTrackInfoCollectionRenderer");
        throw null;
    }
}
