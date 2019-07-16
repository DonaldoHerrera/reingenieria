package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.OnKeyListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import androidx.preference.Preference.BaseSavedState;

public class SeekBarPreference extends Preference {
    int O;
    int P;
    private int Q;
    private int R;
    boolean S;
    SeekBar T;
    private TextView U;
    boolean V;
    private boolean W;
    private OnSeekBarChangeListener X;
    private OnKeyListener Y;

    private static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new M();
        int a;
        int b;
        int c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.X = new K(this);
        this.Y = new L(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J.SeekBarPreference, i, i2);
        this.P = obtainStyledAttributes.getInt(J.SeekBarPreference_min, 0);
        g(obtainStyledAttributes.getInt(J.SeekBarPreference_android_max, 100));
        h(obtainStyledAttributes.getInt(J.SeekBarPreference_seekBarIncrement, 0));
        this.V = obtainStyledAttributes.getBoolean(J.SeekBarPreference_adjustable, true);
        this.W = obtainStyledAttributes.getBoolean(J.SeekBarPreference_showSeekBarValue, true);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public Parcelable X() {
        Parcelable X2 = super.X();
        if (O()) {
            return X2;
        }
        SavedState savedState = new SavedState(X2);
        savedState.a = this.O;
        savedState.b = this.P;
        savedState.c = this.Q;
        return savedState;
    }

    public void a(C c) {
        super.a(c);
        c.itemView.setOnKeyListener(this.Y);
        this.T = (SeekBar) c.a(F.seekbar);
        this.U = (TextView) c.a(F.seekbar_value);
        if (this.W) {
            this.U.setVisibility(0);
        } else {
            this.U.setVisibility(8);
            this.U = null;
        }
        SeekBar seekBar = this.T;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.X);
        this.T.setMax(this.Q - this.P);
        int i = this.R;
        if (i != 0) {
            this.T.setKeyProgressIncrement(i);
        } else {
            this.R = this.T.getKeyProgressIncrement();
        }
        this.T.setProgress(this.O - this.P);
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(String.valueOf(this.O));
        }
        this.T.setEnabled(N());
    }

    /* access modifiers changed from: protected */
    public void b(Object obj) {
        if (obj == null) {
            obj = Integer.valueOf(0);
        }
        i(a(((Integer) obj).intValue()));
    }

    public final void g(int i) {
        int i2 = this.P;
        if (i < i2) {
            i = i2;
        }
        if (i != this.Q) {
            this.Q = i;
            R();
        }
    }

    public final void h(int i) {
        if (i != this.R) {
            this.R = Math.min(this.Q - this.P, Math.abs(i));
            R();
        }
    }

    public void i(int i) {
        a(i, true);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D.seekBarPreferenceStyle);
    }

    /* access modifiers changed from: protected */
    public Object a(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    private void a(int i, boolean z) {
        int i2 = this.P;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.Q;
        if (i > i3) {
            i = i3;
        }
        if (i != this.O) {
            this.O = i;
            TextView textView = this.U;
            if (textView != null) {
                textView.setText(String.valueOf(this.O));
            }
            b(i);
            if (z) {
                R();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(SeekBar seekBar) {
        int progress = this.P + seekBar.getProgress();
        if (progress == this.O) {
            return;
        }
        if (a((Object) Integer.valueOf(progress))) {
            a(progress, false);
        } else {
            seekBar.setProgress(this.O - this.P);
        }
    }

    /* access modifiers changed from: protected */
    public void a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.a(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.a(savedState.getSuperState());
        this.O = savedState.a;
        this.P = savedState.b;
        this.Q = savedState.c;
        R();
    }
}
