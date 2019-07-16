package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public abstract class DialogPreference extends Preference {
    private CharSequence O;
    private CharSequence P;
    private Drawable Q;
    private CharSequence R;
    private CharSequence S;
    private int T;

    public interface a {
        Preference findPreference(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J.DialogPreference, i, i2);
        this.O = C0286Za.b(obtainStyledAttributes, J.DialogPreference_dialogTitle, J.DialogPreference_android_dialogTitle);
        if (this.O == null) {
            this.O = K();
        }
        this.P = C0286Za.b(obtainStyledAttributes, J.DialogPreference_dialogMessage, J.DialogPreference_android_dialogMessage);
        this.Q = C0286Za.a(obtainStyledAttributes, J.DialogPreference_dialogIcon, J.DialogPreference_android_dialogIcon);
        this.R = C0286Za.b(obtainStyledAttributes, J.DialogPreference_positiveButtonText, J.DialogPreference_android_positiveButtonText);
        this.S = C0286Za.b(obtainStyledAttributes, J.DialogPreference_negativeButtonText, J.DialogPreference_android_negativeButtonText);
        this.T = C0286Za.b(obtainStyledAttributes, J.DialogPreference_dialogLayout, J.DialogPreference_android_dialogLayout, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void U() {
        x().a((Preference) this);
    }

    public Drawable ca() {
        return this.Q;
    }

    public int da() {
        return this.T;
    }

    public CharSequence ea() {
        return this.P;
    }

    public CharSequence fa() {
        return this.O;
    }

    public CharSequence ga() {
        return this.S;
    }

    public CharSequence ha() {
        return this.R;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0286Za.a(context, D.dialogPreferenceStyle, 16842897));
    }
}
