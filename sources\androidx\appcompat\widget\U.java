package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: SearchView */
class U implements TextWatcher {
    final /* synthetic */ SearchView a;

    U(SearchView searchView) {
        this.a = searchView;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.b(charSequence);
    }
}
