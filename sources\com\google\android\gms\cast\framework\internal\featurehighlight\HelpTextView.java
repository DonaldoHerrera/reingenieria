package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.google.android.gms.cast.framework.C0645m;
import com.google.android.gms.internal.cast.Fa;

@Keep
public class HelpTextView extends LinearLayout implements a {
    private TextView zzla;
    private TextView zzlb;

    @Keep
    public HelpTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void zza(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Keep
    public View asView() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(C0645m.cast_featurehighlight_help_text_header_view);
        Fa.a(textView);
        this.zzla = textView;
        TextView textView2 = (TextView) findViewById(C0645m.cast_featurehighlight_help_text_body_view);
        Fa.a(textView2);
        this.zzlb = textView2;
    }

    @Keep
    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        zza(this.zzla, charSequence);
        zza(this.zzlb, charSequence2);
    }
}
