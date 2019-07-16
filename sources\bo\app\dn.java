package bo.app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public final class dn {
    private static final String a = Hg.a(dn.class);
    private static final TimeZone b = TimeZone.getTimeZone("UTC");
    private static final EnumSet<s> c = EnumSet.of(s.SHORT, s.LONG);

    public static long a() {
        return System.currentTimeMillis() / 1000;
    }

    public static double b() {
        return ((double) System.currentTimeMillis()) / 1000.0d;
    }

    public static long c() {
        return System.currentTimeMillis();
    }

    public static Date a(String str, s sVar) {
        if (Ng.d(str)) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Null or blank date string received: ");
            sb.append(str);
            Hg.e(str2, sb.toString());
            return null;
        } else if (!c.contains(sVar)) {
            String str3 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unsupported date format. Returning null. Got date format: ");
            sb2.append(sVar);
            Hg.e(str3, sb2.toString());
            return null;
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sVar.a(), Locale.US);
            simpleDateFormat.setTimeZone(b);
            try {
                return simpleDateFormat.parse(str);
            } catch (Exception e) {
                String str4 = a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Exception parsing date ");
                sb3.append(str);
                sb3.append(". Returning null");
                Hg.b(str4, sb3.toString(), e);
                return null;
            }
        }
    }

    public static String a(Date date, s sVar) {
        if (!c.contains(sVar)) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported date format: ");
            sb.append(sVar);
            sb.append(". Defaulting to ");
            sb.append(s.LONG);
            Hg.e(str, sb.toString());
            sVar = s.LONG;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sVar.a(), Locale.US);
        simpleDateFormat.setTimeZone(b);
        return simpleDateFormat.format(date);
    }

    public static Date a(int i, int i2, int i3) {
        return a(i, i2, i3, 0, 0, 0);
    }

    public static Date a(int i, int i2, int i3, int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
        gregorianCalendar.setTimeZone(b);
        return gregorianCalendar.getTime();
    }

    public static Date a(long j) {
        return new Date(j * 1000);
    }

    public static long a(Date date) {
        return date.getTime() / 1000;
    }
}
