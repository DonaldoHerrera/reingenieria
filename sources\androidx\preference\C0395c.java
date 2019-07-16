package androidx.preference;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: androidx.preference.c reason: case insensitive filesystem */
/* compiled from: DropDownPreference */
class C0395c implements OnItemSelectedListener {
    final /* synthetic */ DropDownPreference a;

    C0395c(DropDownPreference dropDownPreference) {
        this.a = dropDownPreference;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i >= 0) {
            String charSequence = this.a.ka()[i].toString();
            if (!charSequence.equals(this.a.la()) && this.a.a((Object) charSequence)) {
                this.a.f(charSequence);
            }
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
