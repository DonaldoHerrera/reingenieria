package com.soundcloud.android.view.customfontviews;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.view.M.h;
import com.soundcloud.android.view.M.k;

/* compiled from: CustomFontViewBuilder */
public class b {
    private final Context a;
    private final View b;

    public b(Context context) {
        this.a = context;
        this.b = View.inflate(context, k.dialog_custom_message, null);
    }

    public b a(int i, int i2, int i3) {
        a(i);
        c(i2);
        b(i3);
        return this;
    }

    public b b(String str) {
        ((TextView) this.b.findViewById(h.custom_dialog_title)).setText(str);
        return this;
    }

    public b c(int i) {
        b(this.a.getString(i));
        return this;
    }

    public b b(int i) {
        a(this.a.getString(i));
        return this;
    }

    public b a(int i) {
        ImageView imageView = (ImageView) this.b.findViewById(h.custom_dialog_image);
        imageView.setImageResource(i);
        imageView.setVisibility(0);
        return this;
    }

    public b a(String str) {
        TextView textView = (TextView) this.b.findViewById(h.custom_dialog_body);
        textView.setText(str);
        textView.setVisibility(0);
        return this;
    }

    public View a() {
        return this.b;
    }
}
