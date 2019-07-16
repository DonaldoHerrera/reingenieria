package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: jeb reason: default package and case insensitive filesystem */
/* compiled from: Annotations.kt */
public interface C6723jeb extends Iterable<C6315deb>, MYa {
    public static final a c = a.b;

    /* renamed from: jeb$a */
    /* compiled from: Annotations.kt */
    public static final class a {
        private static final C6723jeb a = new C6655ieb();
        static final /* synthetic */ a b = new a();

        private a() {
        }

        public final C6723jeb a() {
            return a;
        }

        public final C6723jeb a(List<? extends C6315deb> list) {
            C7471uYa.b(list, "annotations");
            return list.isEmpty() ? a : new C6791keb(list);
        }
    }

    /* renamed from: jeb$b */
    /* compiled from: Annotations.kt */
    public static final class b {
        public static C6315deb a(C6723jeb jeb, C7349snb snb) {
            Object obj;
            C7471uYa.b(snb, "fqName");
            Iterator it = jeb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C7471uYa.a((Object) ((C6315deb) obj).q(), (Object) snb)) {
                    break;
                }
            }
            return (C6315deb) obj;
        }

        public static boolean b(C6723jeb jeb, C7349snb snb) {
            C7471uYa.b(snb, "fqName");
            return jeb.a(snb) != null;
        }
    }

    C6315deb a(C7349snb snb);

    boolean b(C7349snb snb);

    boolean isEmpty();
}
