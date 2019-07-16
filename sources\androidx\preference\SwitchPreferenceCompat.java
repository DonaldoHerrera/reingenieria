package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;

public class SwitchPreferenceCompat extends TwoStatePreference {
    private final a T;
    private CharSequence U;
    private CharSequence V;

    private class a implements OnCheckedChangeListener {
        a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreferenceCompat.this.a((Object) Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreferenceCompat.this.d(z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.T = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J.SwitchPreferenceCompat, i, i2);
        d((CharSequence) C0286Za.b(obtainStyledAttributes, J.SwitchPreferenceCompat_summaryOn, J.SwitchPreferenceCompat_android_summaryOn));
        c(C0286Za.b(obtainStyledAttributes, J.SwitchPreferenceCompat_summaryOff, J.SwitchPreferenceCompat_android_summaryOff));
        f(C0286Za.b(obtainStyledAttributes, J.SwitchPreferenceCompat_switchTextOn, J.SwitchPreferenceCompat_android_switchTextOn));
        e(C0286Za.b(obtainStyledAttributes, J.SwitchPreferenceCompat_switchTextOff, J.SwitchPreferenceCompat_android_switchTextOff));
        e(C0286Za.a(obtainStyledAttributes, J.SwitchPreferenceCompat_disableDependentsState, J.SwitchPreferenceCompat_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    private void c(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Q);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.U);
            switchCompat.setTextOff(this.V);
            switchCompat.setOnCheckedChangeListener(this.T);
        }
    }

    private void d(View view) {
        if (((AccessibilityManager) b().getSystemService("accessibility")).isEnabled()) {
            c(view.findViewById(F.switchWidget));
            b(view.findViewById(16908304));
        }
    }

    public void a(C c) {
        super.a(c);
        c(c.a(F.switchWidget));
        b(c);
    }

    public void e(CharSequence charSequence) {
        this.V = charSequence;
        R();
    }

    public void f(CharSequence charSequence) {
        this.U = charSequence;
        R();
    }

    /* access modifiers changed from: protected */
    public void a(View view) {
        super.a(view);
        d(view);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D.switchPreferenceCompatStyle);
    }
}
