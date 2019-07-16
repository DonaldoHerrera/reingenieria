package com.soundcloud.android.playback.ui;

import android.text.SpannableString;
import android.widget.ToggleButton;

/* renamed from: com.soundcloud.android.playback.ui.hb reason: case insensitive filesystem */
/* compiled from: MaterialLikeButtonPresenter */
public class C4457hb implements C4454gb {
    private final C5408WFa a;

    public C4457hb(C5408WFa wFa) {
        this.a = wFa;
    }

    public void a(ToggleButton toggleButton, int i, int i2, int i3) {
        toggleButton.setTextOn(a(toggleButton, i, i2));
        toggleButton.setTextOff(a(toggleButton, i, i3));
        toggleButton.setChecked(toggleButton.isChecked());
    }

    private SpannableString a(ToggleButton toggleButton, int i, int i2) {
        String str;
        C5525_Ga _ga = new C5525_Ga(toggleButton.getContext(), i2);
        if (i > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("X ");
            sb.append(this.a.a((long) i));
            str = sb.toString();
        } else {
            str = "X";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(_ga, 0, 1, 33);
        return spannableString;
    }
}
