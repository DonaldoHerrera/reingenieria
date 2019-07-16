package com.soundcloud.android.comments;

import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0325l;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.F;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import java.util.HashMap;

@EVa(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0012R\u001e\u0010\u0003\u001a\u00020\u00048\u0010@\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0010@\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0010@\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0010@\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/soundcloud/android/comments/ConfirmPrimaryEmailDialogFragment;", "Lcom/soundcloud/android/dialog/LoggingDialogFragment;", "()V", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "getAnalytics$base_release", "()Lcom/soundcloud/android/foundation/events/Analytics;", "setAnalytics$base_release", "(Lcom/soundcloud/android/foundation/events/Analytics;)V", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "getEventBus$base_release", "()Lcom/soundcloud/rx/eventbus/EventBus;", "setEventBus$base_release", "(Lcom/soundcloud/rx/eventbus/EventBus;)V", "feedbackController", "Lcom/soundcloud/android/view/snackbar/FeedbackController;", "getFeedbackController$base_release", "()Lcom/soundcloud/android/view/snackbar/FeedbackController;", "setFeedbackController$base_release", "(Lcom/soundcloud/android/view/snackbar/FeedbackController;)V", "meOperations", "Lcom/soundcloud/android/accounts/MeOperations;", "getMeOperations$base_release", "()Lcom/soundcloud/android/accounts/MeOperations;", "setMeOperations$base_release", "(Lcom/soundcloud/android/accounts/MeOperations;)V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onResendEmailButtonClicked", "", "Companion", "Factory", "base_release"}, mv = {1, 1, 15})
/* compiled from: ConfirmPrimaryEmailDialogFragment.kt */
public class Ga extends C2418ZW {
    public static final a b = new a(null);
    public F c;
    public C5052KJa d;
    public C5327TLa e;
    public C3700b f;
    private HashMap g;

    /* compiled from: ConfirmPrimaryEmailDialogFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: ConfirmPrimaryEmailDialogFragment.kt */
    public static class b {
        public Ga a(C3508cda cda) {
            C7471uYa.b(cda, "trackUrn");
            Ga ga = new Ga();
            Bundle bundle = new Bundle();
            C6836lIa.a(bundle, "track_urn", cda);
            ga.setArguments(bundle);
            return ga;
        }
    }

    public Ga() {
        SoundCloudApplication.f().a(this);
    }

    /* access modifiers changed from: private */
    public void Ub() {
        Tb().a().c(new Ia(this));
    }

    public void Qb() {
        HashMap hashMap = this.g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public C3700b Rb() {
        C3700b bVar = this.f;
        if (bVar != null) {
            return bVar;
        }
        C7471uYa.b("analytics");
        throw null;
    }

    public C5052KJa Sb() {
        C5052KJa kJa = this.d;
        if (kJa != null) {
            return kJa;
        }
        C7471uYa.b("feedbackController");
        throw null;
    }

    public F Tb() {
        F f2 = this.c;
        if (f2 != null) {
            return f2;
        }
        C7471uYa.b("meOperations");
        throw null;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                View inflate = View.inflate(activity, l.confirm_primary_email_dialog, null);
                C3508cda b2 = C5526_Ha.b(arguments, "track_urn");
                if (b2 != null) {
                    C3700b Rb = Rb();
                    defpackage.Vaa.a aVar = Vaa.a;
                    C7471uYa.a((Object) b2, "it");
                    Rb.a((J) aVar.a(b2));
                }
                androidx.appcompat.app.C0325l.a aVar2 = new androidx.appcompat.app.C0325l.a(activity);
                aVar2.b(inflate);
                aVar2.c(p.btn_resend_email_confirmation, (OnClickListener) new Ha(this));
                aVar2.a(p.btn_cancel, (OnClickListener) null);
                C0325l a2 = aVar2.a();
                C7471uYa.a((Object) a2, "AlertDialog.Builder(cont…ll)\n            .create()");
                return a2;
            }
            throw new IllegalArgumentException("Null activity when trying to create ConfirmEmailDialog");
        }
        throw new IllegalArgumentException("Missing arguments for ConfirmEmailDialog");
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Qb();
    }
}
