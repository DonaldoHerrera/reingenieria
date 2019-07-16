package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;

@EVa(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\bH\u0012J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\bH\u0016R$\u0010\n\u001a\u00020\u000b8\u0016@\u0016X.¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00138\u0016@\u0016X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/soundcloud/android/view/SendButton;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button", "Landroid/widget/ImageButton;", "button$annotations", "()V", "getButton", "()Landroid/widget/ImageButton;", "setButton", "(Landroid/widget/ImageButton;)V", "progressBar", "Lcom/soundcloud/android/view/CircularProgressBar;", "progressBar$annotations", "getProgressBar", "()Lcom/soundcloud/android/view/CircularProgressBar;", "setProgressBar", "(Lcom/soundcloud/android/view/CircularProgressBar;)V", "init", "", "i", "setInProgress", "setOnClickListener", "listener", "Landroid/view/View$OnClickListener;", "setVisibility", "visibility", "base_release"}, mv = {1, 1, 15})
/* compiled from: SendButton.kt */
public class SendButton extends FrameLayout {
    public ImageButton a;
    public CircularProgressBar b;

    public SendButton(Context context, AttributeSet attributeSet) {
        C7471uYa.b(context, "context");
        C7471uYa.b(attributeSet, "attrs");
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        View inflate = LayoutInflater.from(context).inflate(l.send_button, this);
        C7471uYa.a((Object) inflate, "view");
        ImageButton imageButton = (ImageButton) inflate.findViewById(i.sendBtn);
        C7471uYa.a((Object) imageButton, "view.sendBtn");
        setButton(imageButton);
        CircularProgressBar circularProgressBar = (CircularProgressBar) inflate.findViewById(i.sendProgress);
        C7471uYa.a((Object) circularProgressBar, "view.sendProgress");
        setProgressBar(circularProgressBar);
        setClickable(true);
    }

    public ImageButton getButton() {
        ImageButton imageButton = this.a;
        if (imageButton != null) {
            return imageButton;
        }
        C7471uYa.b("button");
        throw null;
    }

    public CircularProgressBar getProgressBar() {
        CircularProgressBar circularProgressBar = this.b;
        if (circularProgressBar != null) {
            return circularProgressBar;
        }
        C7471uYa.b("progressBar");
        throw null;
    }

    public void setButton(ImageButton imageButton) {
        C7471uYa.b(imageButton, "<set-?>");
        this.a = imageButton;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        getButton().setOnClickListener(onClickListener);
    }

    public void setProgressBar(CircularProgressBar circularProgressBar) {
        C7471uYa.b(circularProgressBar, "<set-?>");
        this.b = circularProgressBar;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        getButton().setVisibility(i);
        getProgressBar().setVisibility(8);
    }

    public SendButton(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        C7471uYa.b(attributeSet, "attrs");
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }

    public void a() {
        getButton().setVisibility(8);
        getProgressBar().setVisibility(0);
    }
}
