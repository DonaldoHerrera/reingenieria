package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference.BaseSavedState;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class PreferenceGroup extends Preference {
    private List<Preference> O;
    private boolean P;
    private int Q;
    private boolean R;
    private int S;
    private a T;
    final C0485ba<String, Long> U;
    private final Handler V;
    private final Runnable W;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new u();
        int a;

        SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.a = i;
        }
    }

    public interface a {
        void a();
    }

    public interface b {
        int a(Preference preference);

        int a(String str);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.P = true;
        this.Q = 0;
        this.R = false;
        this.S = BaseClientBuilder.API_PRIORITY_OTHER;
        this.T = null;
        this.U = new C0485ba<>();
        this.V = new Handler();
        this.W = new t(this);
        this.O = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J.PreferenceGroup, i, i2);
        int i3 = J.PreferenceGroup_orderingFromXml;
        this.P = C0286Za.a(obtainStyledAttributes, i3, i3, true);
        if (obtainStyledAttributes.hasValue(J.PreferenceGroup_initialExpandedChildrenCount)) {
            int i4 = J.PreferenceGroup_initialExpandedChildrenCount;
            h(C0286Za.a(obtainStyledAttributes, i4, i4, (int) BaseClientBuilder.API_PRIORITY_OTHER));
        }
        obtainStyledAttributes.recycle();
    }

    private boolean e(Preference preference) {
        boolean remove;
        synchronized (this) {
            preference.W();
            if (preference.getParent() == this) {
                preference.a((PreferenceGroup) null);
            }
            remove = this.O.remove(preference);
            if (remove) {
                String g = preference.g();
                if (g != null) {
                    this.U.put(g, Long.valueOf(preference.getId()));
                    this.V.removeCallbacks(this.W);
                    this.V.post(this.W);
                }
                if (this.R) {
                    preference.V();
                }
            }
        }
        return remove;
    }

    public void T() {
        super.T();
        this.R = true;
        int ea = ea();
        for (int i = 0; i < ea; i++) {
            g(i).T();
        }
    }

    public void V() {
        super.V();
        this.R = false;
        int ea = ea();
        for (int i = 0; i < ea; i++) {
            g(i).V();
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable X() {
        return new SavedState(super.X(), this.S);
    }

    /* access modifiers changed from: protected */
    public void a(Bundle bundle) {
        super.a(bundle);
        int ea = ea();
        for (int i = 0; i < ea; i++) {
            g(i).a(bundle);
        }
    }

    public void b(Preference preference) {
        c(preference);
    }

    public boolean c(Preference preference) {
        long j;
        if (this.O.contains(preference)) {
            return true;
        }
        if (preference.g() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.getParent() != null) {
                preferenceGroup = preferenceGroup.getParent();
            }
            String g = preference.g();
            if (preferenceGroup.c((CharSequence) g) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Found duplicated key: \"");
                sb.append(g);
                sb.append("\". This can cause unintended behaviour,");
                sb.append(" please use unique keys for every preference.");
                Log.e("PreferenceGroup", sb.toString());
            }
        }
        if (preference.v() == Integer.MAX_VALUE) {
            if (this.P) {
                int i = this.Q;
                this.Q = i + 1;
                preference.e(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).d(this.P);
            }
        }
        int binarySearch = Collections.binarySearch(this.O, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * -1) - 1;
        }
        if (!d(preference)) {
            return false;
        }
        synchronized (this) {
            this.O.add(binarySearch, preference);
        }
        z x = x();
        String g2 = preference.g();
        if (g2 == null || !this.U.containsKey(g2)) {
            j = x.b();
        } else {
            j = ((Long) this.U.get(g2)).longValue();
            this.U.remove(g2);
        }
        preference.a(x, j);
        preference.a(this);
        if (this.R) {
            preference.T();
        }
        S();
        return true;
    }

    public int ca() {
        return this.S;
    }

    public void d(boolean z) {
        this.P = z;
    }

    public a da() {
        return this.T;
    }

    public int ea() {
        return this.O.size();
    }

    /* access modifiers changed from: protected */
    public boolean fa() {
        return true;
    }

    public Preference g(int i) {
        return (Preference) this.O.get(i);
    }

    public void ga() {
        synchronized (this) {
            List<Preference> list = this.O;
            for (int size = list.size() - 1; size >= 0; size--) {
                e((Preference) list.get(0));
            }
        }
        S();
    }

    public void h(int i) {
        if (i != Integer.MAX_VALUE && !M()) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" should have a key defined if it contains an expandable preference");
            Log.e("PreferenceGroup", sb.toString());
        }
        this.S = i;
    }

    /* access modifiers changed from: 0000 */
    public void ha() {
        synchronized (this) {
            Collections.sort(this.O);
        }
    }

    public void b(boolean z) {
        super.b(z);
        int ea = ea();
        for (int i = 0; i < ea; i++) {
            g(i).b(this, z);
        }
    }

    /* access modifiers changed from: protected */
    public boolean d(Preference preference) {
        preference.b(this, aa());
        return true;
    }

    /* access modifiers changed from: protected */
    public void a(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.a(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.S = savedState.a;
        super.a(savedState.getSuperState());
    }

    /* access modifiers changed from: protected */
    public void b(Bundle bundle) {
        super.b(bundle);
        int ea = ea();
        for (int i = 0; i < ea; i++) {
            g(i).b(bundle);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Preference c(CharSequence charSequence) {
        if (TextUtils.equals(g(), charSequence)) {
            return this;
        }
        int ea = ea();
        for (int i = 0; i < ea; i++) {
            Preference g = g(i);
            String g2 = g.g();
            if (g2 != null && g2.equals(charSequence)) {
                return g;
            }
            if (g instanceof PreferenceGroup) {
                Preference c = ((PreferenceGroup) g).c(charSequence);
                if (c != null) {
                    return c;
                }
            }
        }
        return null;
    }
}
