package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.A;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.soul.components.menu.MenuBottomSheet;
import com.soundcloud.android.view.C6230t;
import java.util.HashMap;

@EVa(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 .2\u00020\u0001:\u0002./B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0016H\u0016J\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0002J\u0012\u0010'\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\f\u0010*\u001a\u00020+*\u00020,H\u0002J\f\u0010-\u001a\u00020&*\u00020,H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lcom/soundcloud/android/share/ShareBottomSheetFragment;", "Lcom/soundcloud/android/view/CustomBottomSheetDialogFragment;", "()V", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "getAnalytics", "()Lcom/soundcloud/android/foundation/events/Analytics;", "setAnalytics", "(Lcom/soundcloud/android/foundation/events/Analytics;)V", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "getErrorReporter", "()Lcom/soundcloud/android/error/reporting/ErrorReporter;", "setErrorReporter", "(Lcom/soundcloud/android/error/reporting/ErrorReporter;)V", "instagramStoriesFragmentFactory", "Lcom/soundcloud/android/share/InstagramStoriesFragment$Factory;", "getInstagramStoriesFragmentFactory", "()Lcom/soundcloud/android/share/InstagramStoriesFragment$Factory;", "setInstagramStoriesFragmentFactory", "(Lcom/soundcloud/android/share/InstagramStoriesFragment$Factory;)V", "layoutId", "", "getLayoutId", "()I", "shareOperations", "Lcom/soundcloud/android/share/ShareOperations;", "getShareOperations", "()Lcom/soundcloud/android/share/ShareOperations;", "setShareOperations", "(Lcom/soundcloud/android/share/ShareOperations;)V", "setupDialog", "", "dialog", "Landroid/app/Dialog;", "style", "shareOnInstagram", "trackUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "trackStandardShare", "options", "Lcom/soundcloud/android/foundation/actions/models/ShareOptions;", "getShareIntentParam", "Landroid/content/Intent;", "Landroid/os/Bundle;", "getTrackUrnParam", "Companion", "Factory", "base_release"}, mv = {1, 1, 15})
/* renamed from: cxa reason: default package and case insensitive filesystem */
/* compiled from: ShareBottomSheetFragment.kt */
public class C6274cxa extends C6230t {
    public static final a a = new a(null);
    public defpackage.C5486Ywa.b b;
    public C6614hxa c;
    public C3700b d;
    public C3469VY e;
    private final int f = l.share_action_sheet_view;
    private HashMap g;

    /* renamed from: cxa$a */
    /* compiled from: ShareBottomSheetFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: cxa$b */
    /* compiled from: ShareBottomSheetFragment.kt */
    public static class b {
        public C6274cxa a(C3508cda cda, Intent intent) {
            C7471uYa.b(cda, "urn");
            C7471uYa.b(intent, "standardShareIntent");
            C6274cxa cxa = new C6274cxa();
            Bundle bundle = new Bundle();
            C5526_Ha.b(bundle, "TRACK_URN", cda);
            bundle.putParcelable("STANDARD_SHARE_INTENT", intent);
            cxa.setArguments(bundle);
            return cxa;
        }
    }

    public C6274cxa() {
        SoundCloudApplication.f().a(this);
    }

    /* access modifiers changed from: private */
    public final void f(C3508cda cda) {
        FragmentActivity activity = getActivity();
        C0370l supportFragmentManager = activity != null ? activity.getSupportFragmentManager() : null;
        if (supportFragmentManager != null && !supportFragmentManager.f()) {
            A a2 = supportFragmentManager.a();
            int i = i.player_pager_holder;
            defpackage.C5486Ywa.b bVar = this.b;
            if (bVar != null) {
                a2.a(i, bVar.a(cda), "SHARE_LOADING_FRAGMENT_TAG");
                a2.a((String) null);
                a2.a();
                return;
            }
            C7471uYa.b("instagramStoriesFragmentFactory");
            throw null;
        }
    }

    public int Qb() {
        return this.f;
    }

    public void Rb() {
        HashMap hashMap = this.g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final C6614hxa Sb() {
        C6614hxa hxa = this.c;
        if (hxa != null) {
            return hxa;
        }
        C7471uYa.b("shareOperations");
        throw null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public void setupDialog(Dialog dialog, int i) {
        C7471uYa.b(dialog, "dialog");
        super.setupDialog(dialog, i);
        MenuBottomSheet menuBottomSheet = (MenuBottomSheet) dialog.findViewById(i.shareInstagram);
        String string = getString(p.share_sheet_share_to_instagram, getString(p.instagram_stories));
        C7471uYa.a((Object) string, "getString(R.string.share…tring.instagram_stories))");
        menuBottomSheet.a(new com.soundcloud.android.soul.components.menu.MenuBottomSheet.a(string, h.ic_24_instagram));
        ((MenuBottomSheet) dialog.findViewById(i.shareInstagram)).setOnClickListener(new C6342dxa(this, dialog));
        ((MenuBottomSheet) dialog.findViewById(i.shareOther)).setOnClickListener(new C6410exa(this, dialog));
    }

    /* access modifiers changed from: private */
    public final void b(Mca mca) {
        if (mca == null) {
            C3469VY vy = this.e;
            if (vy != null) {
                defpackage.C3469VY.a.a(vy, new Exception("Share options parameter is null when tracking the standard share"), null, 2, null);
            } else {
                C7471uYa.b("errorReporter");
                throw null;
            }
        } else {
            C3700b bVar = this.d;
            if (bVar != null) {
                bVar.a((J) K.a.b(mca.a().f(), mca.b(), mca.d(), mca.a()));
            } else {
                C7471uYa.b("analytics");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final Intent a(Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("STANDARD_SHARE_INTENT");
        C7471uYa.a((Object) parcelable, "getParcelable(STANDARD_SHARE_INTENT_KEY)");
        if (parcelable instanceof Intent) {
            return (Intent) parcelable;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(parcelable);
        sb.append(" not of type ");
        sb.append(Intent.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: private */
    public final C3508cda b(Bundle bundle) {
        C3508cda b2 = C5526_Ha.b(bundle, "TRACK_URN");
        if (b2 != null) {
            return b2;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
