package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class CheckBoxPreference extends TwoStatePreference {
    private final a T;

    private class a implements OnCheckedChangeListener {
        a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!CheckBoxPreference.this.a((Object) Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                CheckBoxPreference.this.d(z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    private void c(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Q);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.T);
        }
    }

    private void d(View view) {
        if (((AccessibilityManager) b().getSystemService("accessibility")).isEnabled()) {
            c(view.findViewById(16908289));
            b(view.findViewById(16908304));
        }
    }

    public void a(C c) {
        super.a(c);
        c(c.a(16908289));
        b(c);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.T = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J.CheckBoxPreference, i, i2);
        d((CharSequence) C0286Za.b(obtainStyledAttributes, J.CheckBoxPreference_summaryOn, J.CheckBoxPreference_android_summaryOn));
        c(C0286Za.b(obtainStyledAttributes, J.CheckBoxPreference_summaryOff, J.CheckBoxPreference_android_summaryOff));
        e(C0286Za.a(obtainStyledAttributes, J.CheckBoxPreference_disableDependentsState, J.CheckBoxPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void a(View view) {
        super.a(view);
        d(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0286Za.a(context, D.checkBoxPreferenceStyle, 16842895));
    }

    public CheckBoxPreference(Context context) {
        this(context, null);
    }
}
