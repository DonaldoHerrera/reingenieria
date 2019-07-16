package com.soundcloud.android.profile;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.view.customfontviews.CustomFontButton;
import com.soundcloud.android.view.customfontviews.CustomFontEditText;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

@EVa(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B'\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001f\u001a\u00020 H\u0002J\u001a\u0010!\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020 H\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006&"}, d2 = {"Lcom/soundcloud/android/profile/VerifyAgePresenter;", "Lcom/soundcloud/lightcycle/DefaultActivityLightCycle;", "Landroid/app/Activity;", "updateAgeCommand", "Lcom/soundcloud/android/profile/UpdateAgeCommand;", "followingOperations", "Lcom/soundcloud/android/associations/FollowingOperations;", "engagementsTracking", "Lcom/soundcloud/android/analytics/EngagementsTracking;", "screenProvider", "Lcom/soundcloud/android/foundation/events/ScreenProvider;", "(Lcom/soundcloud/android/profile/UpdateAgeCommand;Lcom/soundcloud/android/associations/FollowingOperations;Lcom/soundcloud/android/analytics/EngagementsTracking;Lcom/soundcloud/android/foundation/events/ScreenProvider;)V", "activity", "age", "", "getAge", "()I", "submitButton", "Landroid/widget/Button;", "getSubmitButton", "()Landroid/widget/Button;", "setSubmitButton", "(Landroid/widget/Button;)V", "userToFollowUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "yearInput", "Landroid/widget/EditText;", "getYearInput", "()Landroid/widget/EditText;", "setYearInput", "(Landroid/widget/EditText;)V", "maybeEnableSubmitButton", "", "onCreate", "bundle", "Landroid/os/Bundle;", "submitButtonListener", "UpdateResponseObserver", "base_release"}, mv = {1, 1, 15})
/* compiled from: VerifyAgePresenter.kt */
public final class ke extends DefaultActivityLightCycle<Activity> {
    public EditText a;
    public Button b;
    /* access modifiers changed from: private */
    public Activity c;
    /* access modifiers changed from: private */
    public C3508cda d;
    private final Ua e;
    /* access modifiers changed from: private */
    public final C3240rR f;
    /* access modifiers changed from: private */
    public final C2390YL g;
    /* access modifiers changed from: private */
    public final F h;

    /* compiled from: VerifyAgePresenter.kt */
    private final class a extends C5068Kua<Boolean> {
        public a() {
        }

        public void a(boolean z) {
            super.onSuccess(Boolean.valueOf(z));
            C3508cda e = ke.this.d;
            if (e != null) {
                ke.this.f.a(e, true).a((C7117pPa) new C4974Hua());
                C2390YL b = ke.this.g;
                String a = ke.this.h.b().a();
                v vVar = r8;
                v vVar2 = new v("single", 0);
                C3710l lVar = r4;
                C3710l lVar2 = new C3710l(null, a, vVar, false, null, null, null, null, null, null, null, null, null, null, 16377, null);
                b.a(e, true, lVar);
            }
            Activity a2 = ke.this.c;
            if (a2 != null) {
                a2.finish();
            }
        }

        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            a(((Boolean) obj).booleanValue());
        }
    }

    public ke(Ua ua, C3240rR rRVar, C2390YL yl, F f2) {
        C7471uYa.b(ua, "updateAgeCommand");
        C7471uYa.b(rRVar, "followingOperations");
        C7471uYa.b(yl, "engagementsTracking");
        C7471uYa.b(f2, "screenProvider");
        this.e = ua;
        this.f = rRVar;
        this.g = yl;
        this.h = f2;
    }

    private final int x() {
        EditText editText = this.a;
        if (editText != null) {
            return (int) C7315sGa.c(editText.getText().toString());
        }
        C7471uYa.b("yearInput");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void y() {
        Button button = this.b;
        if (button != null) {
            EditText editText = this.a;
            if (editText != null) {
                Editable text = editText.getText();
                C7471uYa.a((Object) text, "yearInput.text");
                button.setEnabled(text.length() > 0);
                return;
            }
            C7471uYa.b("yearInput");
            throw null;
        }
        C7471uYa.b("submitButton");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void z() {
        Button button = this.b;
        if (button != null) {
            button.setEnabled(false);
            this.e.a(C5815m.a(x()), new a());
            return;
        }
        C7471uYa.b("submitButton");
        throw null;
    }

    /* renamed from: a */
    public void onCreate(Activity activity, Bundle bundle) {
        C7471uYa.b(activity, "activity");
        this.c = activity;
        activity.setContentView(l.verify_age);
        this.d = C5526_Ha.a(activity.getIntent(), "userToFollowUrn");
        CustomFontEditText customFontEditText = (CustomFontEditText) activity.findViewById(i.verify_age_input);
        C7471uYa.a((Object) customFontEditText, "activity.verify_age_input");
        this.a = customFontEditText;
        CustomFontButton customFontButton = (CustomFontButton) activity.findViewById(i.verify_button);
        C7471uYa.a((Object) customFontButton, "activity.verify_button");
        this.b = customFontButton;
        Button button = this.b;
        String str = "submitButton";
        if (button != null) {
            button.setEnabled(false);
            EditText editText = this.a;
            String str2 = "yearInput";
            if (editText != null) {
                editText.requestFocus();
                EditText editText2 = this.a;
                if (editText2 != null) {
                    editText2.addTextChangedListener(new le(this));
                    Button button2 = this.b;
                    if (button2 != null) {
                        button2.setOnClickListener(new me(this));
                    } else {
                        C7471uYa.b(str);
                        throw null;
                    }
                } else {
                    C7471uYa.b(str2);
                    throw null;
                }
            } else {
                C7471uYa.b(str2);
                throw null;
            }
        } else {
            C7471uYa.b(str);
            throw null;
        }
    }
}
