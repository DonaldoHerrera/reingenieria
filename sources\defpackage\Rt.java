package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: Rt reason: default package */
public final class Rt implements Serializable {
    private static final TimeZone a = TimeZone.getTimeZone("GMT");
    private static final Pattern b = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    private final long c;
    private final boolean d;
    private final int e;

    public Rt(long j) {
        this(false, 0, null);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(a);
        gregorianCalendar.setTimeInMillis(this.c + (((long) this.e) * 60000));
        a(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        a(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        a(sb, gregorianCalendar.get(5), 2);
        if (!this.d) {
            sb.append('T');
            a(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            a(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            a(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                a(sb, gregorianCalendar.get(14), 3);
            }
            int i = this.e;
            if (i == 0) {
                sb.append('Z');
            } else {
                if (i > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i = -i;
                }
                int i2 = i / 60;
                int i3 = i % 60;
                a(sb, i2, 2);
                sb.append(':');
                a(sb, i3, 2);
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Rt)) {
            return false;
        }
        Rt rt = (Rt) obj;
        return this.d == rt.d && this.c == rt.c && this.e == rt.e;
    }

    public final int hashCode() {
        long[] jArr = new long[3];
        jArr[0] = this.c;
        jArr[1] = this.d ? 1 : 0;
        jArr[2] = (long) this.e;
        return Arrays.hashCode(jArr);
    }

    public final String toString() {
        return a();
    }

    private Rt(boolean z, long j, Integer num) {
        this.d = z;
        this.c = j;
        int i = z ? 0 : num == null ? TimeZone.getDefault().getOffset(j) / 60000 : num.intValue();
        this.e = i;
    }

    public static Rt a(String str) throws NumberFormatException {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            String str2 = "Invalid date/time format: ";
            String valueOf = String.valueOf(str);
            throw new NumberFormatException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        int parseInt2 = Integer.parseInt(matcher.group(2)) - 1;
        int parseInt3 = Integer.parseInt(matcher.group(3));
        boolean z2 = matcher.group(4) != null;
        String group = matcher.group(9);
        boolean z3 = group != null;
        Integer num = null;
        if (!z3 || z2) {
            if (z2) {
                int parseInt4 = Integer.parseInt(matcher.group(5));
                int parseInt5 = Integer.parseInt(matcher.group(6));
                int parseInt6 = Integer.parseInt(matcher.group(7));
                if (matcher.group(8) != null) {
                    z = z2;
                    i = (int) (((double) ((float) Integer.parseInt(matcher.group(8).substring(1)))) / Math.pow(10.0d, (double) (matcher.group(8).substring(1).length() - 3)));
                    i3 = parseInt5;
                    i2 = parseInt6;
                } else {
                    z = z2;
                    i3 = parseInt5;
                    i2 = parseInt6;
                    i = 0;
                }
                i4 = parseInt4;
            } else {
                z = z2;
                i4 = 0;
                i3 = 0;
                i2 = 0;
                i = 0;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(a);
            gregorianCalendar.set(parseInt, parseInt2, parseInt3, i4, i3, i2);
            gregorianCalendar.set(14, i);
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (z && z3) {
                if (Character.toUpperCase(group.charAt(0)) == 'Z') {
                    i5 = 0;
                } else {
                    int parseInt7 = (Integer.parseInt(matcher.group(11)) * 60) + Integer.parseInt(matcher.group(12));
                    int i6 = matcher.group(10).charAt(0) == '-' ? -parseInt7 : parseInt7;
                    timeInMillis -= ((long) i6) * 60000;
                    i5 = i6;
                }
                num = Integer.valueOf(i5);
            }
            return new Rt(!z, timeInMillis, num);
        }
        String str3 = "Invalid date/time format, cannot specify time zone shift without specifying time: ";
        String valueOf2 = String.valueOf(str);
        throw new NumberFormatException(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
    }

    private static void a(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i2;
        int i4 = i;
        while (i4 > 0) {
            i4 /= 10;
            i3--;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }
}
