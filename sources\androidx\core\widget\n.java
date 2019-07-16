package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;

/* compiled from: TintableImageSourceView */
public interface n {
    ColorStateList getSupportImageTintList();

    Mode getSupportImageTintMode();

    void setSupportImageTintList(ColorStateList colorStateList);

    void setSupportImageTintMode(Mode mode);
}
