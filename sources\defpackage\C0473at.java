package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: at reason: default package and case insensitive filesystem */
public abstract class C0473at {
    static final Logger a = Logger.getLogger(C0473at.class.getName());
    private static final String[] b;

    static {
        String[] strArr = {"DELETE", "GET", "POST", "PUT"};
        b = strArr;
        Arrays.sort(strArr);
    }

    public final C0269Vs a(C0284Ys ys) {
        return new C0269Vs(this, ys);
    }

    /* access modifiers changed from: protected */
    public abstract C1245dt a(String str, String str2) throws IOException;

    public boolean a(String str) throws IOException {
        return Arrays.binarySearch(b, str) >= 0;
    }
}
