package com.soundcloud.android.view.customfontviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.soundcloud.android.view.M.l;
import com.soundcloud.android.view.M.n;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: CustomFontLoader.kt */
public final class a {
    private static final Map<String, Typeface> a = new LinkedHashMap();
    public static final a b = new a();

    private a() {
    }

    @NXa
    public static final void a(TextView textView, AttributeSet attributeSet) {
        C7471uYa.b(textView, "$this$applyCustomFont");
        C7471uYa.b(attributeSet, "attrs");
        TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, n.CustomFontTextView);
        String string = obtainStyledAttributes.getString(n.CustomFontTextView_custom_font);
        if (string == null) {
            string = textView.getContext().getString(l.interstate_light);
        }
        a aVar = b;
        Context context = textView.getContext();
        C7471uYa.a((Object) context, "context");
        C7471uYa.a((Object) string, "path");
        aVar.a(textView, a(context, string));
        obtainStyledAttributes.recycle();
    }

    @NXa
    public static final void a(TextView textView, String str) {
        C7471uYa.b(textView, "$this$applyCustomFont");
        C7471uYa.b(str, "path");
        a aVar = b;
        Context context = textView.getContext();
        C7471uYa.a((Object) context, "context");
        aVar.a(textView, a(context, str));
    }

    private final void a(TextView textView, Typeface typeface) {
        textView.setTypeface(typeface);
        textView.setPaintFlags(textView.getPaintFlags() | 128);
    }

    @NXa
    public static final Typeface a(Context context, String str) {
        Typeface typeface;
        C7471uYa.b(context, "context");
        C7471uYa.b(str, "path");
        synchronized (a) {
            typeface = (Typeface) a.get(str);
            if (typeface == null) {
                typeface = Typeface.createFromAsset(context.getAssets(), str);
                Map<String, Typeface> map = a;
                C7471uYa.a((Object) typeface, "typeface");
                map.put(str, typeface);
            }
        }
        return typeface;
    }
}
