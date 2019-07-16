package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference.BaseSavedState;

public class EditTextPreference extends DialogPreference {
    private String U;

    private static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C0396d();
        String a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    public Parcelable X() {
        Parcelable X = super.X();
        if (O()) {
            return X;
        }
        SavedState savedState = new SavedState(X);
        savedState.a = ia();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public Object a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public boolean aa() {
        return TextUtils.isEmpty(this.U) || super.aa();
    }

    /* access modifiers changed from: protected */
    public void b(Object obj) {
        e(b((String) obj));
    }

    public void e(String str) {
        boolean aa = aa();
        this.U = str;
        c(str);
        boolean aa2 = aa();
        if (aa2 != aa) {
            b(aa2);
        }
    }

    public String ia() {
        return this.U;
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
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
        e(savedState.a);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0286Za.a(context, D.editTextPreferenceStyle, 16842898));
    }
}
