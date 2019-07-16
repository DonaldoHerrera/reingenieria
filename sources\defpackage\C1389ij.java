package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ij reason: default package and case insensitive filesystem */
/* compiled from: ProcMapEntryParser */
final class C1389ij {
    private static final Pattern a = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    public static C1359hj a(String str) {
        Matcher matcher = a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            long longValue = Long.valueOf(matcher.group(1), 16).longValue();
            C1359hj hjVar = new C1359hj(longValue, Long.valueOf(matcher.group(2), 16).longValue() - longValue, matcher.group(3), matcher.group(4));
            return hjVar;
        } catch (Exception unused) {
            C5701cNa e = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not parse map entry: ");
            sb.append(str);
            e.d("CrashlyticsCore", sb.toString());
            return null;
        }
    }
}
