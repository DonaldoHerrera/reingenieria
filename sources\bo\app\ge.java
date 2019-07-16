package bo.app;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class ge implements gd {
    private final gd a;
    private final Comparator<String> b;

    public ge(gd gdVar, Comparator<String> comparator) {
        this.a = gdVar;
        this.b = comparator;
    }

    public boolean a(String str, Bitmap bitmap) {
        synchronized (this.a) {
            String str2 = null;
            Iterator it = this.a.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (this.b.compare(str, str3) == 0) {
                    str2 = str3;
                    break;
                }
            }
            if (str2 != null) {
                this.a.b(str2);
            }
        }
        return this.a.a(str, bitmap);
    }

    public Bitmap b(String str) {
        return this.a.b(str);
    }

    public Bitmap a(String str) {
        return this.a.a(str);
    }

    public Collection<String> a() {
        return this.a.a();
    }
}
