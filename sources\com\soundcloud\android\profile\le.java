package com.soundcloud.android.profile;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: VerifyAgePresenter.kt */
public final class le implements TextWatcher {
    final /* synthetic */ ke a;

    le(ke keVar) {
        this.a = keVar;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.y();
    }
}
