package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements OnTabChangeListener {
    private final ArrayList<a> a = new ArrayList<>();
    private Context b;
    private C0370l c;
    private int d;
    private OnTabChangeListener e;
    private a f;
    private boolean g;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new z();
        String a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            sb.append(this.a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }
    }

    static final class a {
        final String a;
        final Class<?> b;
        final Bundle c;
        Fragment d;
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.d = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.a.size();
        A a2 = null;
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.a.get(i);
            aVar.d = this.c.a(aVar.a);
            Fragment fragment = aVar.d;
            if (fragment != null && !fragment.isDetached()) {
                if (aVar.a.equals(currentTabTag)) {
                    this.f = aVar;
                } else {
                    if (a2 == null) {
                        a2 = this.c.a();
                    }
                    a2.b(aVar.d);
                }
            }
        }
        this.g = true;
        A a3 = a(currentTabTag, a2);
        if (a3 != null) {
            a3.a();
            this.c.b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g = false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.a);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = getCurrentTabTag();
        return savedState;
    }

    public void onTabChanged(String str) {
        if (this.g) {
            A a2 = a(str, (A) null);
            if (a2 != null) {
                a2.a();
            }
        }
        OnTabChangeListener onTabChangeListener = this.e;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.e = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    private A a(String str, A a2) {
        a a3 = a(str);
        if (this.f != a3) {
            if (a2 == null) {
                a2 = this.c.a();
            }
            a aVar = this.f;
            if (aVar != null) {
                Fragment fragment = aVar.d;
                if (fragment != null) {
                    a2.b(fragment);
                }
            }
            if (a3 != null) {
                Fragment fragment2 = a3.d;
                if (fragment2 == null) {
                    a3.d = this.c.d().a(this.b.getClassLoader(), a3.b.getName(), a3.c);
                    a3.d.setArguments(a3.c);
                    a2.a(this.d, a3.d, a3.a);
                } else {
                    a2.a(fragment2);
                }
            }
            this.f = a3;
        }
        return a2;
    }

    private a a(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.a.get(i);
            if (aVar.a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }
}
