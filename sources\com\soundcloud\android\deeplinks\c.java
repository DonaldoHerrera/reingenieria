package com.soundcloud.android.deeplinks;

import android.net.Uri;

/* compiled from: ChartsUriResolver */
public class c {
    c() {
    }

    private b b(Uri uri) {
        String replace = uri.toString().replace("soundcloud://charts", "");
        String str = ":";
        String str2 = "all-music";
        if (replace.startsWith(str)) {
            String[] split = replace.substring(1).split(str);
            C2151LP lp = C2151LP.TRENDING;
            if (split.length == 1) {
                String str3 = split[0];
                if ("audio".equals(str3)) {
                    return b.a(C2151LP.TOP, C3508cda.a("all-audio"));
                }
                if ("music".equals(str3)) {
                    return b.a(C2151LP.TOP, C3508cda.a(str2));
                }
                lp = a(str3);
            } else if (split.length == 2) {
                lp = a(split[0]);
                String str4 = split[1];
                if (str4 != null && !str4.equals("all")) {
                    str2 = str4;
                }
            }
            return b.a(lp, C3508cda.a(str2));
        } else if (replace.startsWith("/")) {
            return c(uri);
        } else {
            return b.a(C2151LP.TRENDING, C3508cda.a(str2));
        }
    }

    private b c(Uri uri) {
        C2151LP a = a(uri.getPath().replace("/charts/", ""));
        String queryParameter = uri.getQueryParameter("genre");
        if (queryParameter == null || queryParameter.equals("all")) {
            queryParameter = "all-music";
        }
        return b.a(a, C3508cda.a(queryParameter));
    }

    public b a(Uri uri) throws k {
        try {
            if (e.e(uri)) {
                return c(uri);
            }
            if (e.d(uri)) {
                return b(uri);
            }
            throw new IllegalArgumentException("Invalid schema for charts deeplink");
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Charts Uri ");
            sb.append(uri);
            sb.append(" could not be resolved");
            throw new k(sb.toString(), e);
        }
    }

    private static C2151LP a(String str) {
        String str2 = "/";
        if (str.startsWith(str2)) {
            str = str.replaceFirst(str2, "");
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 108960) {
            if (hashCode == 115029 && str.equals("top")) {
                c = 1;
            }
        } else if (str.equals("new")) {
            c = 0;
        }
        if (c == 0) {
            return C2151LP.TRENDING;
        }
        if (c != 1) {
            return C2151LP.NONE;
        }
        return C2151LP.TOP;
    }
}
