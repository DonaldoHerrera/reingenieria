package defpackage;

/* renamed from: Fu reason: default package */
public abstract class Fu {
    protected Fu() {
    }

    public static Fu a(char c) {
        return new Hu(',');
    }

    /* access modifiers changed from: private */
    public static String d(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public abstract boolean b(char c);

    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        Pu.a(i, length, "index");
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
