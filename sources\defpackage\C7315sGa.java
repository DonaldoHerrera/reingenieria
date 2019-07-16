package defpackage;

import android.content.res.Resources;
import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import java.io.IOException;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

@EVa(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002DEB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fH\u0007J\"\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u0007H\u0002J \u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007J\u0018\u0010\"\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0002J\"\u0010%\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010&\u001a\u00020\u0007H\u0002J\u0016\u0010'\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001fJ \u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010+\u001a\u00020\u000fH\u0007J\u0018\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001fH\u0007J \u0010,\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u000fH\u0007J\u0018\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0013J\u0010\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u0013H\u0007J\u0018\u00104\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u0007H\u0007J\u0012\u00106\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u000107H\u0007J\u0016\u00108\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u0007J\u0012\u0010;\u001a\u00020\u001f2\b\u0010<\u001a\u0004\u0018\u00010\u0013H\u0007J\u000e\u0010=\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\u0013J\u0010\u0010?\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u0013H\u0002J\u0018\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020$H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/soundcloud/android/utilities/android/text/ScTextUtils;", "", "()V", "EMAIL_ADDRESS_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "MINUTES_IN_ONE_HOUR", "", "SECONDS_IN_ONE_DAY", "SECONDS_IN_ONE_HOUR", "SECONDS_IN_ONE_MINUTE", "SECONDS_IN_ONE_THIRTY_DAY_MONTH", "SECONDS_IN_ONE_WEEK", "SECONDS_IN_ONE_YEAR", "clickify", "", "view", "Landroid/widget/TextView;", "link", "", "listener", "Lkotlin/Function0;", "", "underline", "highlight", "formatLongTimeElapsed", "time", "resources", "Landroid/content/res/Resources;", "pluralsRes", "formatSecondsOrMinutes", "", "unit", "Ljava/util/concurrent/TimeUnit;", "formatShortTimeElapsed", "elapsedSeconds", "", "formatShortTimeElapsedHelper", "stringRes", "formatShortTimeElapsedSince", "timestamp", "formatTimeElapsed", "r", "longerText", "formatTimeElapsedSince", "formatTimestamp", "duration", "fromHtml", "Landroid/text/Spanned;", "source", "fromSnakeCaseToCamelCase", "string", "getClippedString", "maxLength", "isEmail", "", "prettyPrintJson", "json", "indentSpaces", "safeParseLong", "longString", "sanitizeForAscii", "subjectString", "toTitleCase", "word", "usesSameTimeElapsedString", "elapsedSeconds1", "elapsedSeconds2", "ClickSpan", "TextValidator", "android-utils_release"}, mv = {1, 1, 15})
/* renamed from: sGa reason: default package and case insensitive filesystem */
/* compiled from: ScTextUtils.kt */
public final class C7315sGa {
    private static final Pattern a = Pattern.compile("\\A([a-z0-9_\\-][a-z0-9_\\-+.]{0,62})?[a-z0-9_\\-]@(([a-z0-9]|[a-z0-9][a-z0-9\\-]*[a-z0-9])\\.)+[a-z]{2,}\\Z");
    public static final C7315sGa b = new C7315sGa();

    /* renamed from: sGa$a */
    /* compiled from: ScTextUtils.kt */
    public static final class a extends ClickableSpan {
        private final OnClickListener a;
        private final boolean b;

        public a(OnClickListener onClickListener, boolean z) {
            C7471uYa.b(onClickListener, CastExtraArgs.LISTENER);
            this.a = onClickListener;
            this.b = z;
        }

        public void onClick(View view) {
            C7471uYa.b(view, "widget");
            this.a.onClick(view);
        }

        public void updateDrawState(TextPaint textPaint) {
            C7471uYa.b(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(this.b);
        }
    }

    /* renamed from: sGa$b */
    /* compiled from: ScTextUtils.kt */
    public static abstract class b implements TextWatcher {
        private final TextView a;

        public b(TextView textView) {
            C7471uYa.b(textView, "textView");
            this.a = textView;
        }

        public abstract void a(TextView textView, String str);

        public void afterTextChanged(Editable editable) {
            C7471uYa.b(editable, "s");
            TextView textView = this.a;
            a(textView, textView.getText().toString());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7471uYa.b(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7471uYa.b(charSequence, "s");
        }
    }

    private C7315sGa() {
    }

    @NXa
    public static final boolean a(double d, double d2) {
        double d3 = (double) 60;
        if (d >= d3) {
            double d4 = (double) 3600;
            if (d >= d4) {
                double d5 = (double) 86400;
                if (d >= d5) {
                    double d6 = (double) 2592000;
                    if (d >= d6) {
                        double d7 = (double) 31536000;
                        if (d < d7) {
                            if (((int) (d / d6)) == ((int) (d2 / d6))) {
                                return true;
                            }
                        } else if (((int) (d / d7)) == ((int) (d2 / d7))) {
                            return true;
                        }
                    } else if (((int) (d / d5)) == ((int) (d2 / d5))) {
                        return true;
                    }
                } else if (((int) (d / d4)) == ((int) (d2 / d4))) {
                    return true;
                }
            } else if (((int) (d / d3)) == ((int) (d2 / d3))) {
                return true;
            }
        } else if (((int) d) == ((int) d2)) {
            return true;
        }
        return false;
    }

    private final String b(int i, Resources resources, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(resources.getString(i2));
        return sb.toString();
    }

    @NXa
    public static final long c(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final String e(String str) {
        StringBuilder sb = new StringBuilder();
        String str2 = "null cannot be cast to non-null type java.lang.String";
        if (str != null) {
            String substring = str.substring(0, 1);
            C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            Locale locale = Locale.US;
            String str3 = "Locale.US";
            C7471uYa.a((Object) locale, str3);
            if (substring != null) {
                String upperCase = substring.toUpperCase(locale);
                C7471uYa.a((Object) upperCase, "(this as java.lang.String).toUpperCase(locale)");
                sb.append(upperCase);
                if (str != null) {
                    String substring2 = str.substring(1);
                    C7471uYa.a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                    Locale locale2 = Locale.US;
                    C7471uYa.a((Object) locale2, str3);
                    if (substring2 != null) {
                        String lowerCase = substring2.toLowerCase(locale2);
                        C7471uYa.a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        sb.append(lowerCase);
                        return sb.toString();
                    }
                    throw new OVa(str2);
                }
                throw new OVa(str2);
            }
            throw new OVa(str2);
        }
        throw new OVa(str2);
    }

    public final Spanned a(String str) {
        Spanned spanned;
        C7471uYa.b(str, "source");
        if (str.length() == 0) {
            return new SpannedString("");
        }
        String property = System.getProperty("line.separator");
        C7471uYa.a((Object) property, "System.getProperty(\"line.separator\")");
        String a2 = Cxb.a(str, property, "<br/>", false, 4, (Object) null);
        try {
            spanned = Html.fromHtml(a2);
            C7471uYa.a((Object) spanned, "Html.fromHtml(src)");
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                int length = a2.length() / 2;
                if (a2 != null) {
                    String substring = a2.substring(0, length);
                    C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    spanned = a(substring);
                } else {
                    throw new OVa("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw e;
            }
        }
        return spanned;
    }

    public final String d(String str) {
        C7471uYa.b(str, "subjectString");
        String normalize = Normalizer.normalize(str, Form.NFD);
        C7471uYa.a((Object) normalize, "Normalizer.normalize(sub…ing, Normalizer.Form.NFD)");
        return new C7162pxb("[^\\x00-\\x7F]").a((CharSequence) normalize, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    @NXa
    public static final String b(String str) {
        List list;
        boolean z;
        C7471uYa.b(str, "string");
        List a2 = new C7162pxb("_").a((CharSequence) str, 0);
        if (!a2.isEmpty()) {
            ListIterator listIterator = a2.listIterator(a2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (((String) listIterator.previous()).length() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    list = C7676xWa.d((Iterable<? extends T>) a2, listIterator.nextIndex() + 1);
                    break;
                }
            }
            if (list == null) {
                Object[] array = list.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    StringBuilder sb = new StringBuilder();
                    for (String e : strArr) {
                        sb.append(b.e(e));
                    }
                    String sb2 = sb.toString();
                    C7471uYa.a((Object) sb2, "stringBuilder.toString()");
                    return sb2;
                }
                throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new OVa("null cannot be cast to non-null type java.util.Collection<T>");
        }
        list = C6918mWa.a();
        if (list == null) {
        }
    }

    @NXa
    public static /* synthetic */ boolean a(TextView textView, String str, PXa pXa, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        return a(textView, str, pXa, z, z2);
    }

    @NXa
    public static final boolean a(TextView textView, String str, PXa<RVa> pXa, boolean z, boolean z2) {
        int i;
        int i2;
        C7471uYa.b(textView, "view");
        C7471uYa.b(pXa, CastExtraArgs.LISTENER);
        CharSequence text = textView.getText();
        String obj = text.toString();
        a aVar = new a(new C7384tGa(pXa), z);
        int length = obj.length();
        if (str != null) {
            i = Hxb.a((CharSequence) obj, str, 0, false, 6, (Object) null);
            i2 = str.length() + i;
            if (i == -1) {
                return false;
            }
        } else {
            i2 = length;
            i = 0;
        }
        if (text instanceof Spannable) {
            ((Spannable) text).setSpan(aVar, i, i2, 33);
        } else {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (valueOf != null) {
                valueOf.setSpan(aVar, i, i2, 33);
                textView.setText(valueOf);
            }
        }
        if (!(textView.getMovementMethod() instanceof LinkMovementMethod)) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (!z2) {
            textView.setHighlightColor(0);
        }
        return true;
    }

    public final String b(String str, int i) {
        C7471uYa.b(str, "json");
        try {
            String jSONObject = new JSONObject(str).toString(i);
            C7471uYa.a((Object) jSONObject, "JSONObject(json).toString(indentSpaces)");
            return jSONObject;
        } catch (JSONException unused) {
            return str;
        }
    }

    @NXa
    public static final String a(String str, int i) {
        C7471uYa.b(str, "string");
        if (!Cxb.a(str)) {
            String substring = str.substring(0, C7265rZa.b(str.length(), i));
            C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException("String must be non null/not empty");
    }

    @NXa
    public static final String a(long j, TimeUnit timeUnit) {
        C7471uYa.b(timeUnit, "unit");
        StringBuilder sb = new StringBuilder();
        long hours = timeUnit.toHours(j);
        int i = (hours > 0 ? 1 : (hours == 0 ? 0 : -1));
        if (i > 0) {
            sb.append(hours);
            sb.append(':');
        }
        long j2 = (long) 60;
        long minutes = timeUnit.toMinutes(j) % j2;
        if (i > 0 && minutes < ((long) 10)) {
            sb.append('0');
        }
        sb.append(minutes);
        sb.append(':');
        long seconds = timeUnit.toSeconds(j) % j2;
        if (seconds < ((long) 10)) {
            sb.append('0');
        }
        sb.append(seconds);
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "builder.append(seconds).toString()");
        return sb2;
    }

    @NXa
    public static final String a(Resources resources, long j, TimeUnit timeUnit) {
        C7471uYa.b(resources, "resources");
        C7471uYa.b(timeUnit, "unit");
        int seconds = (int) timeUnit.toSeconds(j);
        String str = "java.lang.String.format(format, *args)";
        if (seconds < 60) {
            KYa kYa = KYa.a;
            String string = resources.getString(i.format_abbreviated_seconds);
            C7471uYa.a((Object) string, "resources.getString(R.st…rmat_abbreviated_seconds)");
            Object[] objArr = {Integer.valueOf(seconds)};
            String format = String.format(string, Arrays.copyOf(objArr, objArr.length));
            C7471uYa.a((Object) format, str);
            return format;
        }
        KYa kYa2 = KYa.a;
        String string2 = resources.getString(i.format_abbreviated_minutes);
        C7471uYa.a((Object) string2, "resources.getString(R.st…rmat_abbreviated_minutes)");
        Object[] objArr2 = {Long.valueOf(timeUnit.toMinutes(j))};
        String format2 = String.format(string2, Arrays.copyOf(objArr2, objArr2.length));
        C7471uYa.a((Object) format2, str);
        return format2;
    }

    @NXa
    public static final String a(Resources resources, double d, boolean z) {
        C7471uYa.b(resources, "r");
        double d2 = (double) 60;
        if (d < d2) {
            return b.a((int) d, resources, z ? h.elapsed_seconds_ago : h.elapsed_seconds);
        }
        double d3 = (double) 3600;
        if (d < d3) {
            return b.a((int) (d / d2), resources, z ? h.elapsed_minutes_ago : h.elapsed_minutes);
        }
        double d4 = (double) 86400;
        if (d < d4) {
            return b.a((int) (d / d3), resources, z ? h.elapsed_hours_ago : h.elapsed_hours);
        }
        double d5 = (double) 2592000;
        if (d < d5) {
            return b.a((int) (d / d4), resources, z ? h.elapsed_days_ago : h.elapsed_days);
        }
        double d6 = (double) 31536000;
        if (d < d6) {
            return b.a((int) (d / d5), resources, z ? h.elapsed_months_ago : h.elapsed_months);
        }
        return b.a((int) (d / d6), resources, z ? h.elapsed_years_ago : h.elapsed_years);
    }

    @NXa
    public static final String a(Resources resources, long j, boolean z) {
        C7471uYa.b(resources, "r");
        return a(resources, (double) Math.max(0, (System.currentTimeMillis() - j) / ((long) 1000)), z);
    }

    public final String a(Resources resources, long j) {
        C7471uYa.b(resources, "resources");
        return a(resources, (double) Math.max(0, (System.currentTimeMillis() - j) / ((long) 1000)));
    }

    @NXa
    public static final boolean a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            Pattern pattern = a;
            String valueOf = String.valueOf(charSequence);
            Locale locale = Locale.US;
            C7471uYa.a((Object) locale, "Locale.US");
            if (valueOf != null) {
                String lowerCase = valueOf.toLowerCase(locale);
                C7471uYa.a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (pattern.matcher(lowerCase).matches()) {
                    return true;
                }
            } else {
                throw new OVa("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }

    private final String a(Resources resources, double d) {
        double d2 = (double) 60;
        if (d < d2) {
            return b(C7265rZa.a((int) d, 1), resources, i.short_elapsed_seconds);
        }
        double d3 = (double) 3600;
        if (d < d3) {
            return b((int) (d / d2), resources, i.short_elapsed_minutes);
        }
        double d4 = (double) 86400;
        if (d < d4) {
            return b((int) (d / d3), resources, i.short_elapsed_hours);
        }
        double d5 = (double) 604800;
        if (d < d5) {
            return b((int) (d / d4), resources, i.short_elapsed_days);
        }
        double d6 = (double) 31536000;
        if (d < d6) {
            return b((int) (d / d5), resources, i.short_elapsed_weeks);
        }
        return b((int) (d / d6), resources, i.short_elapsed_years);
    }

    private final String a(int i, Resources resources, int i2) {
        String quantityString = resources.getQuantityString(i2, i, new Object[]{Integer.valueOf(i)});
        C7471uYa.a((Object) quantityString, "resources.getQuantityStr…g(pluralsRes, time, time)");
        return quantityString;
    }
}
