package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.ia.l;
import java.util.HashMap;

@EVa(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 @2\u00020\u0001:\u0002@AB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u00020-H\u0002J&\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u00020-H\u0016J\u001a\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020;H\u0002J\u0012\u0010<\u001a\u00020-2\b\u0010=\u001a\u0004\u0018\u00010>H\u0002J\f\u0010?\u001a\u00020;*\u000205H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006B"}, d2 = {"Lcom/soundcloud/android/share/InstagramStoriesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "getAnalytics", "()Lcom/soundcloud/android/foundation/events/Analytics;", "setAnalytics", "(Lcom/soundcloud/android/foundation/events/Analytics;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "getErrorReporter", "()Lcom/soundcloud/android/error/reporting/ErrorReporter;", "setErrorReporter", "(Lcom/soundcloud/android/error/reporting/ErrorReporter;)V", "feedbackController", "Lcom/soundcloud/android/view/snackbar/FeedbackController;", "getFeedbackController", "()Lcom/soundcloud/android/view/snackbar/FeedbackController;", "setFeedbackController", "(Lcom/soundcloud/android/view/snackbar/FeedbackController;)V", "highPriorityScheduler", "Lio/reactivex/Scheduler;", "getHighPriorityScheduler", "()Lio/reactivex/Scheduler;", "setHighPriorityScheduler", "(Lio/reactivex/Scheduler;)V", "instagramStoriesApi", "Lcom/soundcloud/android/share/InstagramStoriesApi;", "getInstagramStoriesApi", "()Lcom/soundcloud/android/share/InstagramStoriesApi;", "setInstagramStoriesApi", "(Lcom/soundcloud/android/share/InstagramStoriesApi;)V", "mainThreadScheduler", "getMainThreadScheduler", "setMainThreadScheduler", "shareOperations", "Lcom/soundcloud/android/share/ShareOperations;", "getShareOperations", "()Lcom/soundcloud/android/share/ShareOperations;", "setShareOperations", "(Lcom/soundcloud/android/share/ShareOperations;)V", "dismiss", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "shareOnInstagram", "trackUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "trackInstagramShare", "options", "Lcom/soundcloud/android/foundation/actions/models/ShareOptions;", "getTrackUrnParam", "Companion", "Factory", "base_release"}, mv = {1, 1, 15})
/* renamed from: Ywa reason: default package and case insensitive filesystem */
/* compiled from: InstagramStoriesFragment.kt */
public final class C5486Ywa extends Fragment {
    public static final a a = new a(null);
    public C5052KJa b;
    public C5252Qwa c;
    public HPa d;
    public HPa e;
    public C6614hxa f;
    public C3700b g;
    public C3469VY h;
    private VPa i;
    private HashMap j;

    /* renamed from: Ywa$a */
    /* compiled from: InstagramStoriesFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: Ywa$b */
    /* compiled from: InstagramStoriesFragment.kt */
    public static class b {
        public C5486Ywa a(C3508cda cda) {
            C7471uYa.b(cda, "urn");
            C5486Ywa ywa = new C5486Ywa();
            Bundle bundle = new Bundle();
            C5526_Ha.b(bundle, "TRACK_URN", cda);
            ywa.setArguments(bundle);
            return ywa;
        }
    }

    public C5486Ywa() {
        SoundCloudApplication.f().a(this);
    }

    /* access modifiers changed from: private */
    public final void b(Mca mca) {
        if (mca == null) {
            C3469VY vy = this.h;
            if (vy != null) {
                defpackage.C3469VY.a.a(vy, new Exception("Share options parameter is null when tracking the Instagram share"), null, 2, null);
            } else {
                C7471uYa.b("errorReporter");
                throw null;
            }
        } else {
            C3700b bVar = this.g;
            if (bVar != null) {
                bVar.a((J) K.a.a(mca.a().f(), mca.b(), mca.d(), mca.a()));
            } else {
                C7471uYa.b("analytics");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void dismiss() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C0370l supportFragmentManager = activity.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                supportFragmentManager.g();
            }
        }
    }

    private final void f(C3508cda cda) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C5252Qwa qwa = this.c;
            if (qwa != null) {
                C7471uYa.a((Object) activity, "fragmentActivity");
                IPa a2 = qwa.a(activity, cda);
                HPa hPa = this.d;
                if (hPa != null) {
                    IPa b2 = a2.b(hPa);
                    HPa hPa2 = this.e;
                    if (hPa2 != null) {
                        this.i = b2.a(hPa2).a((C6776kQa<? super T>) new C5515Zwa<Object>(activity, this, cda), (C6776kQa<? super Throwable>) new C5544_wa<Object>(this, cda));
                    } else {
                        C7471uYa.b("mainThreadScheduler");
                        throw null;
                    }
                } else {
                    C7471uYa.b("highPriorityScheduler");
                    throw null;
                }
            } else {
                C7471uYa.b("instagramStoriesApi");
                throw null;
            }
        }
    }

    public void Qb() {
        HashMap hashMap = this.j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final C3469VY Rb() {
        C3469VY vy = this.h;
        if (vy != null) {
            return vy;
        }
        C7471uYa.b("errorReporter");
        throw null;
    }

    public final C5052KJa Sb() {
        C5052KJa kJa = this.b;
        if (kJa != null) {
            return kJa;
        }
        C7471uYa.b("feedbackController");
        throw null;
    }

    public final C6614hxa Tb() {
        C6614hxa hxa = this.f;
        if (hxa != null) {
            return hxa;
        }
        C7471uYa.b("shareOperations");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7471uYa.b(layoutInflater, "inflater");
        return layoutInflater.inflate(l.share_loading_view, viewGroup, false);
    }

    public void onDestroyView() {
        VPa vPa = this.i;
        if (vPa != null) {
            vPa.dispose();
        }
        super.onDestroyView();
        Qb();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            f(a(arguments));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final C3508cda a(Bundle bundle) {
        C3508cda b2 = C5526_Ha.b(bundle, "TRACK_URN");
        if (b2 != null) {
            return b2;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
