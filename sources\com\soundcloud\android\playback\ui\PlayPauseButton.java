package com.soundcloud.android.playback.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageButton;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.p;

@EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0012J\b\u0010\u0013\u001a\u00020\u000eH\u0012R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/soundcloud/android/playback/ui/PlayPauseButton;", "Landroidx/appcompat/widget/AppCompatImageButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "playing", "", "title", "", "setEnabled", "", "enabled", "setPlayInfo", "setPlayState", "updateButtonImage", "updateContentDescription", "base_release"}, mv = {1, 1, 15})
/* compiled from: PlayPauseButton.kt */
public class PlayPauseButton extends AppCompatImageButton {
    private boolean c;
    private String d;

    public PlayPauseButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public PlayPauseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PlayPauseButton(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        this.d = "";
        setImageResource(h.btn_footer_play_toggle);
        setScaleType(ScaleType.CENTER);
        setBackground(null);
    }

    private void a() {
        if (!isEnabled() && !this.c) {
            setImageLevel(0);
        } else if (!isEnabled() && this.c) {
            setImageLevel(1);
        } else if (isEnabled() && !this.c) {
            setImageLevel(2);
        } else if (isEnabled() && this.c) {
            setImageLevel(3);
        }
    }

    private void b() {
        if (this.c) {
            C5172OGa.a((View) this, p.accessibility_pause);
            setContentDescription(getResources().getString(p.accessibility_pause));
            return;
        }
        String string = getResources().getString(p.accessibility_play_with_title, new Object[]{this.d});
        C7471uYa.a((Object) string, "resources.getString(R.st…y_play_with_title, title)");
        C5172OGa.a((View) this, string);
        setContentDescription(getResources().getString(p.accessibility_play));
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        a();
    }

    public void setPlayInfo(String str) {
        C7471uYa.b(str, "title");
        this.d = str;
        b();
    }

    public void setPlayState(boolean z) {
        this.c = z;
        b();
        a();
    }

    public /* synthetic */ PlayPauseButton(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
