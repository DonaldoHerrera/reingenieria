package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;

public class SwitchPreference extends TwoStatePreference {
    private final a T;
    private CharSequence U;
    private CharSequence V;

    private class a implements OnCheckedChangeListener {
        a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreference.this.a((Object) Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreference.this.d(z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.T = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J.SwitchPreference, i, i2);
        d((CharSequence) C0286Za.b(obtainStyledAttributes, J.SwitchPreference_summaryOn, J.SwitchPreference_android_summaryOn));
        c(C0286Za.b(obtainStyledAttributes, J.SwitchPreference_summaryOff, J.SwitchPreference_android_summaryOff));
        f(C0286Za.b(obtainStyledAttributes, J.SwitchPreference_switchTextOn, J.SwitchPreference_android_switchTextOn));
        e(C0286Za.b(obtainStyledAttributes, J.SwitchPreference_switchTextOff, J.SwitchPreference_android_switchTextOff));
        e(C0286Za.a(obtainStyledAttributes, J.SwitchPreference_disableDependentsState, J.SwitchPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    private void c(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Q);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.U);
            switchR.setTextOff(this.V);
            switchR.setOnCheckedChangeListener(this.T);
        }
    }

    private void d(View view) {
        if (((AccessibilityManager) b().getSystemService("accessibility")).isEnabled()) {
            c(view.findViewById(16908352));
            b(view.findViewById(16908304));
        }
    }

    public void a(C c) {
        super.a(c);
        c(c.a(16908352));
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

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0286Za.a(context, D.switchPreferenceStyle, 16843629));
    }
}
