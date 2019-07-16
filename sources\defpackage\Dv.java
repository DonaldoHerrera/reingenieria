package defpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: Dv reason: default package */
final class Dv extends ThreadLocal<DateFormat> {
    Dv() {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    }
}
