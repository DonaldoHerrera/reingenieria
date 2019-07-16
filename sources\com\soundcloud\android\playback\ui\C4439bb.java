package com.soundcloud.android.playback.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.soundcloud.flippernative.BuildConfig;

/* renamed from: com.soundcloud.android.playback.ui.bb reason: case insensitive filesystem */
/* compiled from: ForceAdTestingDialogFragment.kt */
public final class C4439bb implements TextWatcher {
    final /* synthetic */ EditText a;

    C4439bb(EditText editText) {
        this.a = editText;
    }

    public void afterTextChanged(Editable editable) {
        C7471uYa.b(editable, "s");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C7471uYa.b(charSequence, "s");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C7471uYa.b(charSequence, "newCreativeId");
        if (!Cxb.a(charSequence)) {
            EditText editText = this.a;
            C7471uYa.a((Object) editText, "lineIdInput");
            Editable text = editText.getText();
            C7471uYa.a((Object) text, "lineIdInput.text");
            if (Cxb.a(text)) {
                this.a.setText(BuildConfig.VERSION_NAME);
            }
        }
    }
}
