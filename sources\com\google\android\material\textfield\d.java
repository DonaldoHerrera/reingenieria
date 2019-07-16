package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: TextInputLayout */
class d implements TextWatcher {
    final /* synthetic */ TextInputLayout a;

    d(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    public void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.a;
        textInputLayout.b(!textInputLayout.fa);
        TextInputLayout textInputLayout2 = this.a;
        if (textInputLayout2.e) {
            textInputLayout2.a(editable.length());
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
