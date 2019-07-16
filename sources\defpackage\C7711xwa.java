package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.a;
import com.soundcloud.android.ia.f;
import java.util.Locale;

/* renamed from: xwa reason: default package and case insensitive filesystem */
/* compiled from: SuggestionHighlighter */
public final class C7711xwa {
    C7711xwa() {
    }

    public static C7642wwa a(String str, String str2) {
        Locale locale = Locale.getDefault();
        int indexOf = str2.toLowerCase(locale).indexOf(str.toLowerCase(locale));
        return new C7642wwa(indexOf, str.length() + indexOf);
    }

    public static void a(Context context, SpannableString spannableString, C7642wwa wwa) {
        spannableString.setSpan(new ForegroundColorSpan(a.a(context, f.ash)), 0, spannableString.length(), 18);
        int b = wwa.b();
        int a = wwa.a();
        if (b >= 0 && b < a && a > 0 && a <= spannableString.length()) {
            spannableString.setSpan(new ForegroundColorSpan(a.a(context, f.raven)), b, a, 18);
        }
    }
}
