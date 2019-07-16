package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference.BaseSavedState;

public class ListPreference extends DialogPreference {
    private CharSequence[] U;
    private CharSequence[] V;
    private String W;
    private String X;
    private boolean Y;

    private static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C0398f();
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

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J.ListPreference, i, i2);
        this.U = C0286Za.d(obtainStyledAttributes, J.ListPreference_entries, J.ListPreference_android_entries);
        this.V = C0286Za.d(obtainStyledAttributes, J.ListPreference_entryValues, J.ListPreference_android_entryValues);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, J.Preference, i, i2);
        this.X = C0286Za.b(obtainStyledAttributes2, J.Preference_summary, J.Preference_android_summary);
        obtainStyledAttributes2.recycle();
    }

    private int ma() {
        return e(this.W);
    }

    public CharSequence J() {
        Object ja = ja();
        String str = this.X;
        if (str == null) {
            return super.J();
        }
        Object[] objArr = new Object[1];
        if (ja == null) {
            ja = "";
        }
        objArr[0] = ja;
        return String.format(str, objArr);
    }

    /* access modifiers changed from: protected */
    public Parcelable X() {
        Parcelable X2 = super.X();
        if (O()) {
            return X2;
        }
        SavedState savedState = new SavedState(X2);
        savedState.a = la();
        return savedState;
    }

    public void a(CharSequence[] charSequenceArr) {
        this.U = charSequenceArr;
    }

    public void b(CharSequence[] charSequenceArr) {
        this.V = charSequenceArr;
    }

    public int e(String str) {
        if (str != null) {
            CharSequence[] charSequenceArr = this.V;
            if (charSequenceArr != null) {
                for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                    if (this.V[length].equals(str)) {
                        return length;
                    }
                }
            }
        }
        return -1;
    }

    public void f(String str) {
        boolean z = !TextUtils.equals(this.W, str);
        if (z || !this.Y) {
            this.W = str;
            this.Y = true;
            c(str);
            if (z) {
                R();
            }
        }
    }

    public CharSequence[] ia() {
        return this.U;
    }

    public CharSequence ja() {
        int ma = ma();
        if (ma >= 0) {
            CharSequence[] charSequenceArr = this.U;
            if (charSequenceArr != null) {
                return charSequenceArr[ma];
            }
        }
        return null;
    }

    public CharSequence[] ka() {
        return this.V;
    }

    public String la() {
        return this.W;
    }

    public void a(CharSequence charSequence) {
        super.a(charSequence);
        if (charSequence == null && this.X != null) {
            this.X = null;
        } else if (charSequence != null && !charSequence.equals(this.X)) {
            this.X = charSequence.toString();
        }
    }

    /* access modifiers changed from: protected */
    public void b(Object obj) {
        f(b((String) obj));
    }

    /* access modifiers changed from: protected */
    public Object a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* access modifiers changed from: protected */
    public void a(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.a(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.a(savedState.getSuperState());
        f(savedState.a);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0286Za.a(context, D.dialogPreferenceStyle, 16842897));
    }

    public ListPreference(Context context) {
        this(context, null);
    }
}
