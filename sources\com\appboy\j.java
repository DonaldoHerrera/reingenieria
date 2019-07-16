package com.appboy;

import bo.app.bb;
import bo.app.bj;
import bo.app.bo;
import bo.app.bx;
import bo.app.dj;
import bo.app.dl;

public class j {
    private static final String a = Hg.a(j.class);
    private final dl b;
    private final dj c;
    private final Object d = new Object();
    private final bj e;
    private volatile String f;
    private final bb g;

    j(dl dlVar, bb bbVar, String str, bj bjVar, dj djVar) {
        this.f = str;
        this.b = dlVar;
        this.e = bjVar;
        this.c = djVar;
        this.g = bbVar;
    }

    public boolean a(Jf jf) {
        try {
            this.b.a(jf);
            return true;
        } catch (Exception e2) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set gender to: ");
            sb.append(jf);
            Hg.d(str, sb.toString(), e2);
            return false;
        }
    }

    public boolean b(Mf mf) {
        try {
            this.b.b(mf);
            return true;
        } catch (Exception e2) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set push notification subscription to: ");
            sb.append(mf);
            Hg.d(str, sb.toString(), e2);
            return false;
        }
    }

    public boolean c(String str) {
        try {
            this.b.e(str);
            return true;
        } catch (Exception e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set country to: ");
            sb.append(str);
            Hg.d(str2, sb.toString(), e2);
            return false;
        }
    }

    public boolean d(String str) {
        try {
            return this.b.d(str);
        } catch (Exception e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set email to: ");
            sb.append(str);
            Hg.d(str2, sb.toString(), e2);
            return false;
        }
    }

    public boolean e(String str) {
        try {
            this.b.b(str);
            return true;
        } catch (Exception e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set first name to: ");
            sb.append(str);
            Hg.d(str2, sb.toString(), e2);
            return false;
        }
    }

    public boolean f(String str) {
        try {
            this.b.f(str);
            return true;
        } catch (Exception e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set home city to: ");
            sb.append(str);
            Hg.d(str2, sb.toString(), e2);
            return false;
        }
    }

    public boolean g(String str) {
        try {
            this.b.g(str);
            return true;
        } catch (Exception e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set language to: ");
            sb.append(str);
            Hg.d(str2, sb.toString(), e2);
            return false;
        }
    }

    public boolean h(String str) {
        try {
            this.b.c(str);
            return true;
        } catch (Exception e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set last name to: ");
            sb.append(str);
            Hg.d(str2, sb.toString(), e2);
            return false;
        }
    }

    public boolean i(String str) {
        try {
            return this.b.h(str);
        } catch (Exception e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set phone number to: ");
            sb.append(str);
            Hg.d(str2, sb.toString(), e2);
            return false;
        }
    }

    public boolean a(int i, Kf kf, int i2) {
        try {
            return this.b.a(i, kf, i2);
        } catch (Exception e2) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set date of birth to: ");
            sb.append(i);
            String str2 = "-";
            sb.append(str2);
            sb.append(kf.a());
            sb.append(str2);
            sb.append(i2);
            Hg.d(str, sb.toString(), e2);
            return false;
        }
    }

    public boolean b(String str, int i) {
        try {
            return this.b.a(str, (Object) Integer.valueOf(i));
        } catch (Exception e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set custom integer attribute ");
            sb.append(str);
            sb.append(".");
            Hg.d(str2, sb.toString(), e2);
            return false;
        }
    }

    public boolean c(String str, String str2) {
        try {
            return this.b.a(str, (Object) str2);
        } catch (Exception e2) {
            String str3 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set custom string attribute ");
            sb.append(str);
            sb.append(".");
            Hg.d(str3, sb.toString(), e2);
            return false;
        }
    }

    public boolean a(Mf mf) {
        try {
            this.b.a(mf);
            return true;
        } catch (Exception e2) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set email notification subscription to: ");
            sb.append(mf);
            Hg.d(str, sb.toString(), e2);
            return false;
        }
    }

    public boolean b(String str, String str2) {
        try {
            if (!Jg.a(str, this.c.n())) {
                Hg.e(a, "Custom attribute key cannot be null.");
                return false;
            } else if (!Jg.a(str2)) {
                return false;
            } else {
                return this.g.a((bo) bx.e(Og.a(str), Og.a(str2)));
            }
        } catch (Exception e2) {
            String str3 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to remove custom attribute with key '");
            sb.append(str);
            sb.append("'.");
            Hg.d(str3, sb.toString(), e2);
            return false;
        }
    }

    public boolean a(String str, boolean z) {
        try {
            return this.b.a(str, (Object) Boolean.valueOf(z));
        } catch (Exception e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set custom boolean attribute ");
            sb.append(str);
            sb.append(".");
            Hg.d(str2, sb.toString(), e2);
            return false;
        }
    }

    public boolean a(String str, float f2) {
        try {
            return this.b.a(str, (Object) Float.valueOf(f2));
        } catch (Exception e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set custom float attribute ");
            sb.append(str);
            sb.append(".");
            Hg.d(str2, sb.toString(), e2);
            return false;
        }
    }

    public boolean a(String str, String str2) {
        try {
            if (!Jg.a(str, this.c.n())) {
                Hg.e(a, "Custom attribute key cannot be null.");
                return false;
            } else if (!Jg.a(str2)) {
                return false;
            } else {
                return this.g.a((bo) bx.d(Og.a(str), Og.a(str2)));
            }
        } catch (Exception e2) {
            String str3 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to add custom attribute with key '");
            sb.append(str);
            sb.append("'.");
            Hg.d(str3, sb.toString(), e2);
            return false;
        }
    }

    public boolean b(String str) {
        return a(str, 1);
    }

    public boolean a(String str, String[] strArr) {
        try {
            if (!Jg.a(str, this.c.n())) {
                return false;
            }
            String a2 = Og.a(str);
            if (strArr != null) {
                Jg.a(strArr);
            }
            return this.g.a((bo) bx.a(a2, strArr));
        } catch (Exception unused) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set custom attribute array with key: '");
            sb.append(str);
            sb.append("'.");
            Hg.e(str2, sb.toString());
            return false;
        }
    }

    public boolean a(String str, int i) {
        try {
            if (!Jg.a(str, this.c.n())) {
                return false;
            }
            return this.g.a((bo) bx.a(Og.a(str), i));
        } catch (Exception e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to increment custom attribute ");
            sb.append(str);
            sb.append(" by ");
            sb.append(i);
            sb.append(".");
            Hg.d(str2, sb.toString(), e2);
            return false;
        }
    }

    public boolean a(C1812wg wgVar) {
        try {
            this.b.a(wgVar);
            return true;
        } catch (Exception e2) {
            Hg.d(a, "Failed to set attribution data.", e2);
            return false;
        }
    }

    public String a() {
        String str;
        synchronized (this.d) {
            str = this.f;
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        synchronized (this.d) {
            if (!this.f.equals("")) {
                if (!this.f.equals(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [");
                    sb.append(this.f);
                    sb.append("], tried to change to: [");
                    sb.append(str);
                    sb.append("]");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f = str;
            this.b.a(str);
        }
    }
}
