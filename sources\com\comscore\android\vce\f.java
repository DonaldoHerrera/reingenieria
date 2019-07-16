package com.comscore.android.vce;

class f {
    static final String a = "CookieNation";
    final p b;
    final j c;
    final e d;

    f(p pVar, e eVar, j jVar) {
        this.b = pVar;
        this.d = eVar;
        this.c = jVar;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        d();
        a("afx", "1");
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.d.deleteCookie("https://sb.voicefive.com/rs/sdk/b.html", str);
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2) {
        this.d.setCookie("https://sb.voicefive.com/rs/sdk/b.html", str, str2);
    }

    /* access modifiers changed from: 0000 */
    public Runnable b() {
        return new Runnable() {
            public void run() {
                try {
                    if (f.this.c.g()) {
                        f.this.e();
                    }
                } catch (Exception unused) {
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|(2:18|19)|20|21|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0053 */
    public void b(String str, String str2) {
        z a2 = this.c.a(str);
        if (a2 == null) {
            return;
        }
        if (str2.startsWith("-1")) {
            if (a2.e()) {
                a2.q();
            }
        } else if (!str2.startsWith("-2") && !a2.e()) {
            try {
                int parseInt = Integer.parseInt(str2.substring(0, 1));
                int i = 50;
                if (str2.length() > 2 && str2.charAt(1) == '-') {
                    i = Math.round(Float.valueOf(str2.substring(2)).floatValue());
                }
                a2.a(i);
                a2.d(parseInt);
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean b(String str) {
        String cookie = this.d.getCookie("https://sb.voicefive.com/rs/sdk/b.html");
        if (cookie != null && cookie.length() > 0) {
            String[] split = cookie.split(";");
            if (split.length > 0) {
                for (String trim : split) {
                    if (trim.trim().startsWith(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        a("afx");
    }

    /* access modifiers changed from: 0000 */
    public void c(String str) {
        try {
            a("meta", ad.b(str.replace("'", "\\'")));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        String str = "https://sb.voicefive.com/rs/sdk/b.html";
        String cookie = this.d.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                String trim = split2[0].trim();
                if (trim.length() > 0 && (trim.startsWith("cs_") || trim.equals("afx") || trim.equals("meta"))) {
                    this.d.deleteCookie(str, split2[0]);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        String[] split = this.d.getCookie("https://sb.voicefive.com/rs/sdk/b.html").split(";");
        if (split.length > 0) {
            for (String str : split) {
                int indexOf = str.indexOf("=");
                if (indexOf > 0 && indexOf < str.length() - 1) {
                    String trim = str.substring(0, indexOf).trim();
                    String substring = str.substring(indexOf + 1, str.length());
                    if (trim.regionMatches(0, "cs_", 0, 3)) {
                        b(trim, substring);
                    }
                }
            }
        }
    }
}
