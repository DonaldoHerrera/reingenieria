package com.soundcloud.android.playback.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import com.soundcloud.android.foundation.ads.J;

/* renamed from: com.soundcloud.android.playback.ui.cb reason: case insensitive filesystem */
/* compiled from: ForceAdTestingDialogFragment.kt */
final class C4442cb implements OnClickListener {
    final /* synthetic */ C4436ab a;
    final /* synthetic */ EditText b;
    final /* synthetic */ EditText c;
    final /* synthetic */ CheckBox d;

    C4442cb(C4436ab abVar, EditText editText, EditText editText2, CheckBox checkBox) {
        this.a = abVar;
        this.b = editText;
        this.c = editText2;
        this.d = checkBox;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        J Rb = this.a.Rb();
        EditText editText = this.b;
        C7471uYa.a((Object) editText, "lineIdInput");
        Rb.b(editText.getText().toString());
        J Rb2 = this.a.Rb();
        EditText editText2 = this.c;
        C7471uYa.a((Object) editText2, "creativeIdInput");
        Rb2.a(editText2.getText().toString());
        J Rb3 = this.a.Rb();
        CheckBox checkBox = this.d;
        C7471uYa.a((Object) checkBox, "adTimerEnabled");
        Rb3.a(Boolean.valueOf(checkBox.isChecked()));
    }
}
