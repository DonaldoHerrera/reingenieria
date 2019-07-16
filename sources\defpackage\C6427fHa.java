package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: fHa reason: default package and case insensitive filesystem */
/* compiled from: DateUtils */
public class C6427fHa {
    public static int a(String str, String str2) throws ParseException {
        Date parse = new SimpleDateFormat(str2, Locale.US).parse(str);
        Calendar instance = Calendar.getInstance();
        instance.setTime(parse);
        return instance.get(1);
    }
}
