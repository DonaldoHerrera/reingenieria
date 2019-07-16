package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference.BaseSavedState;

public abstract class TwoStatePreference extends Preference {
    private CharSequence O;
    private CharSequence P;
    protected boolean Q;
    private boolean R;
    private boolean S;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new N();
        boolean a;

        public SavedState(Parcel parcel) {
            super(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.a = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    public void U() {
        super.U();
        boolean z = !ca();
        if (a((Object) Boolean.valueOf(z))) {
            d(z);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable X() {
        Parcelable X = super.X();
        if (O()) {
            return X;
        }
        SavedState savedState = new SavedState(X);
        savedState.a = ca();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public Object a(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    public boolean aa() {
        boolean z = this.S ? this.Q : !this.Q;
        if (z || super.aa()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void b(Object obj) {
        if (obj == null) {
            obj = Boolean.valueOf(false);
        }
        d(a(((Boolean) obj).booleanValue()));
    }

    public void c(CharSequence charSequence) {
        this.P = charSequence;
        if (!ca()) {
            R();
        }
    }

    public boolean ca() {
        return this.Q;
    }

    public void d(boolean z) {
        boolean z2 = this.Q != z;
        if (z2 || !this.R) {
            this.Q = z;
            this.R = true;
            c(z);
            if (z2) {
                b(aa());
                R();
            }
        }
    }

    public void e(boolean z) {
        this.S = z;
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* access modifiers changed from: protected */
    public void a(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.a(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.a(savedState.getSuperState());
        d(savedState.a);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void b(C c) {
        b(c.a(16908304));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    public void b(View view) {
        int i;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            boolean z = true;
            if (!this.Q || TextUtils.isEmpty(this.O)) {
                if (!this.Q && !TextUtils.isEmpty(this.P)) {
                    textView.setText(this.P);
                }
                if (z) {
                    CharSequence J = J();
                    if (!TextUtils.isEmpty(J)) {
                        textView.setText(J);
                        z = false;
                    }
                }
                i = 8;
                if (!z) {
                    i = 0;
                }
                if (i != textView.getVisibility()) {
                    textView.setVisibility(i);
                }
            }
            textView.setText(this.O);
            z = false;
            if (z) {
            }
            i = 8;
            if (!z) {
            }
            if (i != textView.getVisibility()) {
            }
        }
    }

    public void d(CharSequence charSequence) {
        this.O = charSequence;
        if (ca()) {
            R();
        }
    }
}
