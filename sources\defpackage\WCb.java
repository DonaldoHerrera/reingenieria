package defpackage;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: WCb reason: default package */
/* compiled from: DecimalStyle */
public final class WCb {
    public static final WCb a = new WCb('0', '+', '-', '.');
    private static final ConcurrentMap<Locale, WCb> b = new ConcurrentHashMap(16, 0.75f, 2);
    private final char c;
    private final char d;
    private final char e;
    private final char f;

    private WCb(char c2, char c3, char c4, char c5) {
        this.c = c2;
        this.d = c3;
        this.e = c4;
        this.f = c5;
    }

    public char a() {
        return this.f;
    }

    public char b() {
        return this.e;
    }

    public char c() {
        return this.d;
    }

    public char d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCb)) {
            return false;
        }
        WCb wCb = (WCb) obj;
        if (!(this.c == wCb.c && this.d == wCb.d && this.e == wCb.e && this.f == wCb.f)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.c + this.d + this.e + this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DecimalStyle[");
        sb.append(this.c);
        sb.append(this.d);
        sb.append(this.e);
        sb.append(this.f);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public int a(char c2) {
        int i = c2 - this.c;
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public String a(String str) {
        char c2 = this.c;
        if (c2 == '0') {
            return str;
        }
        int i = c2 - '0';
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] + i);
        }
        return new String(charArray);
    }
}
