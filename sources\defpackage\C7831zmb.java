package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: zmb reason: default package and case insensitive filesystem */
/* compiled from: BuiltInsBinaryVersion.kt */
public final class C7831zmb extends Bmb {
    public static final C7831zmb g = new C7831zmb(1, 0, 7);
    public static final C7831zmb h = new C7831zmb(new int[0]);
    public static final a i = new a(null);

    /* renamed from: zmb$a */
    /* compiled from: BuiltInsBinaryVersion.kt */
    public static final class a {
        private a() {
        }

        public final C7831zmb a(InputStream inputStream) {
            C7471uYa.b(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            C6785kZa kza = new C6785kZa(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) kza, 10));
            Iterator it = kza.iterator();
            while (it.hasNext()) {
                ((FWa) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] b = C7676xWa.b(arrayList);
            return new C7831zmb(Arrays.copyOf(b, b.length));
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C7831zmb(int... iArr) {
        C7471uYa.b(iArr, "numbers");
        super(Arrays.copyOf(iArr, iArr.length));
    }

    public boolean d() {
        return b(g);
    }
}
