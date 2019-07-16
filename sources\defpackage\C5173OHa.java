package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import androidx.core.content.a;
import com.soundcloud.android.ia.d;
import com.soundcloud.android.view.OverflowAnchorImageButton;

/* renamed from: OHa reason: default package and case insensitive filesystem */
/* compiled from: OverflowButtonBackground */
public final class C5173OHa {
    private C5173OHa() {
    }

    public static void a(OverflowAnchorImageButton overflowAnchorImageButton, int i) {
        Context context = overflowAnchorImageButton.getContext();
        overflowAnchorImageButton.setBackground(new InsetDrawable(a(context), context.getResources().getDimensionPixelSize(i)));
    }

    private static Drawable a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(d.selectableItemBackground, typedValue, true);
        return a.c(context, typedValue.resourceId);
    }
}
