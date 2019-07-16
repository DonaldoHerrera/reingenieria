package com.soundcloud.android.settings.privacy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ScrollView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.soul.components.cells.standard.CellStandardExtended;
import com.soundcloud.android.soul.components.cells.standard.CellStandardExtended.a;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import java.util.HashMap;

@EVa(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000f0\u000f0\u000eJ\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/soundcloud/android/settings/privacy/PrivacySettingsToggleLayout;", "Landroid/widget/ScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "privacySettingSwitchToggle", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "privacyPolicyButtonClick", "Lio/reactivex/Observable;", "", "render", "", "state", "Lcom/soundcloud/android/settings/privacy/PrivacySettingsToggleLayoutState;", "base_release"}, mv = {1, 1, 15})
/* compiled from: PrivacySettingsToggleLayout.kt */
public final class PrivacySettingsToggleLayout extends ScrollView {
    /* access modifiers changed from: private */
    public final C6781kVa<Boolean> a;
    private HashMap b;

    public PrivacySettingsToggleLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public PrivacySettingsToggleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PrivacySettingsToggleLayout(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public View a(int i) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        View view = (View) this.b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C6781kVa<Boolean> b() {
        return this.a;
    }

    public PrivacySettingsToggleLayout(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        C6781kVa<Boolean> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<Boolean>()");
        this.a = s;
        LayoutInflater.from(context).inflate(l.privacy_settings_toggle_content, this, true);
    }

    public final void a(O o) {
        C7471uYa.b(o, "state");
        ((CellStandardExtended) a(i.cellSwitch)).a(new a(o.b(), o.a(), o.c()));
        ((CellStandardExtended) a(i.cellSwitch)).setOnCheckedChangeListener(new N(this));
    }

    public final APa<Object> a() {
        APa<Object> a2 = C2257RH.a((CustomFontTextView) a(i.privacy_setting_privacy_policy_btn));
        C7471uYa.a((Object) a2, "RxView.clicks(privacy_setting_privacy_policy_btn)");
        return a2;
    }
}
