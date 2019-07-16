package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Xvb reason: default package */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class Xvb extends Tvb implements Iib {
    private final Object[] c;

    public Xvb(C7694xnb xnb, Object[] objArr) {
        C7471uYa.b(objArr, "values");
        super(xnb);
        this.c = objArr;
    }

    public List<Tvb> getElements() {
        Object[] objArr = this.c;
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            a aVar = Tvb.a;
            if (obj != null) {
                arrayList.add(aVar.a(obj, null));
                i++;
            } else {
                C7471uYa.a();
                throw null;
            }
        }
        return arrayList;
    }
}
