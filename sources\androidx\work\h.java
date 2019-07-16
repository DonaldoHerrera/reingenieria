package androidx.work;

import java.util.List;

/* compiled from: InputMerger */
public abstract class h {
    private static final String a = i.a("InputMerger");

    public static h a(String str) {
        try {
            return (h) Class.forName(str).newInstance();
        } catch (Exception e) {
            i a2 = i.a();
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Trouble instantiating + ");
            sb.append(str);
            a2.b(str2, sb.toString(), e);
            return null;
        }
    }

    public abstract e a(List<e> list);
}
