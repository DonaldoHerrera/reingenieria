package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import androidx.preference.Preference.BaseSavedState;
import androidx.preference.internal.AbstractMultiSelectListPreference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference extends AbstractMultiSelectListPreference {
    private CharSequence[] U;
    private CharSequence[] V;
    private Set<String> W;

    private static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C0401i();
        Set<String> a;

        SavedState(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.a = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.a, strArr);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a.size());
            Set<String> set = this.a;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.W = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J.MultiSelectListPreference, i, i2);
        this.U = C0286Za.d(obtainStyledAttributes, J.MultiSelectListPreference_entries, J.MultiSelectListPreference_android_entries);
        this.V = C0286Za.d(obtainStyledAttributes, J.MultiSelectListPreference_entryValues, J.MultiSelectListPreference_android_entryValues);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public Parcelable X() {
        Parcelable X = super.X();
        if (O()) {
            return X;
        }
        SavedState savedState = new SavedState(X);
        savedState.a = ka();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public Object a(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public void b(Object obj) {
        c(a((Set) obj));
    }

    public void c(Set<String> set) {
        this.W.clear();
        this.W.addAll(set);
        b(set);
    }

    public CharSequence[] ia() {
        return this.U;
    }

    public CharSequence[] ja() {
        return this.V;
    }

    public Set<String> ka() {
        return this.W;
    }

    /* access modifiers changed from: protected */
    public void a(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.a(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.a(savedState.getSuperState());
        c(savedState.a);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0286Za.a(context, D.dialogPreferenceStyle, 16842897));
    }
}
