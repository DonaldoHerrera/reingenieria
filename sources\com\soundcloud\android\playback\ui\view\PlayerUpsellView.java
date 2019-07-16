package com.soundcloud.android.playback.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;

public class PlayerUpsellView extends RelativeLayout {
    private final TextView a = ((TextView) findViewById(i.upsell_text));
    private final Button b = ((Button) findViewById(i.upsell_button));
    private final int c = getResources().getDimensionPixelSize(g.player_upsell_height);
    private final int d = 0;

    public PlayerUpsellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(l.player_upsell, this, true);
    }

    private void b() {
        getLayoutParams().height = this.c;
        this.b.setTranslationY(0.0f);
        this.a.setTranslationY(0.0f);
        requestLayout();
    }

    public void a(int i, boolean z) {
        this.b.setText(i);
        if (z) {
            a();
        } else {
            b();
        }
        setVisibility(0);
    }

    public Button getUpsellButton() {
        return this.b;
    }

    private void a() {
        getLayoutParams().height = this.d;
        requestLayout();
    }
}
