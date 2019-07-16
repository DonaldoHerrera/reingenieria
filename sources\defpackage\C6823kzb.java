package defpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: kzb reason: default package and case insensitive filesystem */
/* compiled from: HttpDate */
class C6823kzb extends ThreadLocal<DateFormat> {
    C6823kzb() {
    }

    /* access modifiers changed from: protected */
    public DateFormat initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(Kyb.i);
        return simpleDateFormat;
    }
}
