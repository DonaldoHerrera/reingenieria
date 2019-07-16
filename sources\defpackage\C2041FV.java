package defpackage;

import android.util.Base64;

/* renamed from: FV reason: default package and case insensitive filesystem */
/* compiled from: Obfuscator */
public class C2041FV {
    public String a(boolean z) {
        return c(String.valueOf(z));
    }

    public String b(String str) {
        return a(new String(Base64.decode(str.getBytes(C5053KKa.c), 0)), "VkIjYfvMq2U4v0IdSD1vtjuncSVbXnhZtOloUMiR773TMhx1yeYhN8YLnkrx");
    }

    public String c(String str) {
        return Base64.encodeToString(a(str, "VkIjYfvMq2U4v0IdSD1vtjuncSVbXnhZtOloUMiR773TMhx1yeYhN8YLnkrx").getBytes(C5053KKa.c), 0).trim();
    }

    public boolean a(String str) {
        return Boolean.parseBoolean(b(str));
    }

    private String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length() && i < str2.length()) {
            sb.append((char) (str.charAt(i) ^ str2.charAt(i)));
            i++;
        }
        return sb.toString();
    }
}
