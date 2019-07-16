package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class ErrorView extends ScrollView {
    private ImageView a;
    private TextView b;
    private TextView c;
    private TextView d;

    public ErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a() {
        this.a.setImageResource(h.ak_emptyview_error_connectivity);
        this.b.setVisibility(8);
        this.c.setVisibility(0);
        this.d.setVisibility(0);
    }

    public void b() {
        this.a.setImageResource(h.ak_emptyview_error_server);
        this.b.setVisibility(0);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(i.ak_emptyview_error_image);
        this.b = (TextView) findViewById(i.ak_emptyview_error_message1);
        this.c = (TextView) findViewById(i.ak_emptyview_error_message2);
        this.d = (TextView) findViewById(i.ak_emptyview_error_message3);
    }
}
