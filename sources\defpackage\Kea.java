package defpackage;

import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

@EVa(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0000H\u0016J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/soundcloud/android/json/ApiDateFormat;", "Lcom/fasterxml/jackson/databind/util/StdDateFormat;", "()V", "dateFormat", "Ljava/text/DateFormat;", "clone", "format", "Ljava/lang/StringBuffer;", "date", "Ljava/util/Date;", "toAppendTo", "fieldPosition", "Ljava/text/FieldPosition;", "parse", "dateStr", "", "pos", "Ljava/text/ParsePosition;", "unsafeParse", "Companion", "json_release"}, mv = {1, 1, 15})
/* renamed from: Kea reason: default package */
/* compiled from: ApiDateFormat.kt */
public final class Kea extends StdDateFormat {
    /* access modifiers changed from: private */
    public static final ThreadLocal<Kea> a = new ThreadLocal<>();
    public static final a b = new a(null);
    private final DateFormat c;

    /* renamed from: Kea$a */
    /* compiled from: ApiDateFormat.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        /* access modifiers changed from: private */
        public final Kea a() {
            Kea kea = (Kea) Kea.a.get();
            if (kea != null) {
                return kea;
            }
            Kea kea2 = new Kea();
            Kea.a.set(kea2);
            return kea2;
        }
    }

    public Kea() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss Z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.c = simpleDateFormat;
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        C7471uYa.b(date, "date");
        C7471uYa.b(stringBuffer, "toAppendTo");
        C7471uYa.b(fieldPosition, "fieldPosition");
        StringBuffer format = this.c.format(date, stringBuffer, fieldPosition);
        C7471uYa.a((Object) format, "dateFormat.format(date, toAppendTo, fieldPosition)");
        return format;
    }

    public Date parse(String str) throws ParseException {
        C7471uYa.b(str, "dateStr");
        Date parse = this.c.parse(str);
        if (parse != null) {
            return parse;
        }
        Date parse2 = super.parse(str);
        C7471uYa.a((Object) parse2, "super.parse(dateStr)");
        return parse2;
    }

    public Kea clone() {
        return b.a();
    }

    public Date parse(String str, ParsePosition parsePosition) {
        C7471uYa.b(str, "dateStr");
        C7471uYa.b(parsePosition, "pos");
        Date parse = this.c.parse(str, parsePosition);
        if (parse != null) {
            return parse;
        }
        Date parse2 = super.parse(str, parsePosition);
        C7471uYa.a((Object) parse2, "super.parse(dateStr, pos)");
        return parse2;
    }
}
