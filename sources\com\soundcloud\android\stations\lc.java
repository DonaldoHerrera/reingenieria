package com.soundcloud.android.stations;

import android.net.Uri;
import com.google.common.base.Function;
import com.soundcloud.android.deeplinks.e;
import com.soundcloud.android.deeplinks.k;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: StationsUriResolver */
public class lc {
    private static final Pattern a = Pattern.compile("\\d+");
    private static final Pattern b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C3767fda.SOUNDCLOUD);
        sb.append(":(users|tracks|((artist|track)-stations)):(\\d+)");
        b = Pattern.compile(sb.toString());
    }

    private String b(Uri uri) {
        return uri.getPath();
    }

    private String c(Uri uri) {
        return uri.getPath().replaceFirst("/stations", "");
    }

    private C4928GKa<C3508cda> d(String str) throws IllegalArgumentException {
        String str2 = "/artist/";
        String str3 = "";
        if (str.startsWith(str2)) {
            return a(str.replaceFirst(str2, str3));
        }
        String str4 = "/track/";
        if (str.startsWith(str4)) {
            return c(str.replaceFirst(str4, str3));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid schema for stations deeplink with path: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public C4928GKa<C3508cda> a(Uri uri) throws k {
        String str;
        try {
            if (e.e(uri)) {
                str = c(uri);
            } else if (e.d(uri)) {
                str = b(uri);
            } else {
                throw new IllegalArgumentException("Invalid schema for stations deeplink");
            }
            return d(str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Station uri ");
            sb.append(uri);
            sb.append(" could not be resolved");
            throw new k(sb.toString(), e);
        }
    }

    private C4928GKa<Long> b(String str) {
        Matcher matcher = a.matcher(str);
        Matcher matcher2 = b.matcher(str);
        if (matcher.matches()) {
            return C4928GKa.c(Long.valueOf(Long.parseLong(str)));
        }
        if (matcher2.matches()) {
            return C4928GKa.c(Long.valueOf(Long.parseLong(matcher2.group(matcher2.groupCount()))));
        }
        return C4928GKa.a();
    }

    private C4928GKa<C3508cda> c(String str) {
        return b(str).b((Function<? super T, V>) C5996c.a);
    }

    private C4928GKa<C3508cda> a(String str) {
        return b(str).b((Function<? super T, V>) C6029n.a);
    }
}
