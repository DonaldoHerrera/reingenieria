package com.soundcloud.android.view;

import android.text.Editable;
import android.text.TextWatcher;
import com.soundcloud.android.view.CustomFontAuthEditText.a;

/* renamed from: com.soundcloud.android.view.x reason: case insensitive filesystem */
/* compiled from: EditTextChangeWatcher.kt */
public final class C6234x implements TextWatcher {
    private final a a;

    public C6234x() {
        this(null, 1, null);
    }

    public C6234x(a aVar) {
        this.a = aVar;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public /* synthetic */ C6234x(a aVar, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        this(aVar);
    }
}
