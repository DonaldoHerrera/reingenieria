package defpackage;

import android.content.Context;

/* renamed from: Mg reason: default package */
public class Mg {
    private static final String a = Hg.a(Mg.class);

    public static boolean a(Context context, String str) {
        boolean z = false;
        try {
            if (context.checkCallingOrSelfPermission(str) == 0) {
                z = true;
            }
            return z;
        } catch (Throwable th) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failure checking permission ");
            sb.append(str);
            Hg.b(str2, sb.toString(), th);
            return false;
        }
    }
}
