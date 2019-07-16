package defpackage;

import android.widget.EditText;
import com.soundcloud.android.view.customfontviews.CustomFontButton;

/* renamed from: qHa reason: default package and case insensitive filesystem */
/* compiled from: EditTextUtils.kt */
public final class C7178qHa {
    public static /* synthetic */ void a(EditText editText, CustomFontButton customFontButton, PXa pXa, int i, Object obj) {
        if ((i & 2) != 0) {
            pXa = null;
        }
        a(editText, customFontButton, pXa);
    }

    public static final void a(EditText editText, CustomFontButton customFontButton, PXa<RVa> pXa) {
        C7471uYa.b(editText, "$this$onEnterClickButton");
        C7471uYa.b(customFontButton, "button");
        editText.setOnEditorActionListener(new C7109pHa(customFontButton, pXa));
    }
}
