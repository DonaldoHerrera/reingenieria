package defpackage;

import java.util.Locale;
import java.util.Map;

/* renamed from: Ug reason: default package */
/* compiled from: AnswersEventValidator */
class Ug {
    final int a;
    final int b;
    boolean c;

    public Ug(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public String a(String str) {
        int length = str.length();
        int i = this.b;
        if (length <= i) {
            return str;
        }
        a((RuntimeException) new IllegalArgumentException(String.format(Locale.US, "String is too long, truncating to %d characters", new Object[]{Integer.valueOf(i)})));
        return str.substring(0, this.b);
    }

    public boolean a(Object obj, String str) {
        if (obj != null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        a((RuntimeException) new NullPointerException(sb.toString()));
        return true;
    }

    public boolean a(Map<String, Object> map, String str) {
        if (map.size() < this.a || map.containsKey(str)) {
            return false;
        }
        a((RuntimeException) new IllegalArgumentException(String.format(Locale.US, "Limit of %d attributes reached, skipping attribute", new Object[]{Integer.valueOf(this.a)})));
        return true;
    }

    private void a(RuntimeException runtimeException) {
        if (!this.c) {
            C5328TMa.e().e("Answers", "Invalid user input detected", runtimeException);
            return;
        }
        throw runtimeException;
    }
}
