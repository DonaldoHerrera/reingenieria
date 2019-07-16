package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropDownPreference extends ListPreference {
    private final Context Z;
    private final ArrayAdapter aa;
    private Spinner ba;
    private final OnItemSelectedListener ca;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D.dropdownPreferenceStyle);
    }

    private void na() {
        this.aa.clear();
        if (ia() != null) {
            for (CharSequence charSequence : ia()) {
                this.aa.add(charSequence.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void R() {
        super.R();
        this.aa.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void U() {
        this.ba.performClick();
    }

    public void a(CharSequence[] charSequenceArr) {
        super.a(charSequenceArr);
        na();
    }

    public int g(String str) {
        CharSequence[] ka = ka();
        if (!(str == null || ka == null)) {
            for (int length = ka.length - 1; length >= 0; length--) {
                if (ka[length].equals(str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public ArrayAdapter ma() {
        return new ArrayAdapter(this.Z, 17367049);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.ca = new C0395c(this);
        this.Z = context;
        this.aa = ma();
        na();
    }

    public void a(C c) {
        this.ba = (Spinner) c.itemView.findViewById(F.spinner);
        this.ba.setAdapter(this.aa);
        this.ba.setOnItemSelectedListener(this.ca);
        this.ba.setSelection(g(la()));
        super.a(c);
    }
}
