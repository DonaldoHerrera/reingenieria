package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: JYa reason: default package */
/* compiled from: SpreadBuilder */
public class JYa {
    private final ArrayList<Object> a;

    public JYa(int i) {
        this.a = new ArrayList<>(i);
    }

    public int a() {
        return this.a.size();
    }

    public void b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.a.add(it.next());
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Don't know how to spread ");
                sb.append(obj.getClass());
                throw new UnsupportedOperationException(sb.toString());
            }
        }
    }

    public void a(Object obj) {
        this.a.add(obj);
    }

    public Object[] a(Object[] objArr) {
        return this.a.toArray(objArr);
    }
}
