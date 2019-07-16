package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: dja reason: default package and case insensitive filesystem */
/* compiled from: DeeplinkProgressHelper.kt */
public final class C4541dja {
    private Pattern a = Pattern.compile("[^ ]*#t=((\\d+):)?(\\d+):(\\d+)");
    private final Matcher b = this.a.matcher(this.d);
    public final boolean c = this.b.matches();
    private final String d;

    public C4541dja(String str) {
        C7471uYa.b(str, "target");
        this.d = str;
    }

    public final long a() {
        TimeUnit timeUnit = TimeUnit.HOURS;
        String group = this.b.group(2);
        long j = 0;
        long millis = timeUnit.toMillis(group != null ? Long.parseLong(group) : 0);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        String group2 = this.b.group(3);
        long millis2 = millis + timeUnit2.toMillis(group2 != null ? Long.parseLong(group2) : 0);
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        String group3 = this.b.group(4);
        if (group3 != null) {
            j = Long.parseLong(group3);
        }
        return millis2 + timeUnit3.toMillis(j);
    }
}
