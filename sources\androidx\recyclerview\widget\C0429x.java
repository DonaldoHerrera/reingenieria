package androidx.recyclerview.widget;

import java.util.Comparator;

/* renamed from: androidx.recyclerview.widget.x reason: case insensitive filesystem */
/* compiled from: GapWorker */
class C0429x implements Comparator<b> {
    C0429x() {
    }

    /* renamed from: a */
    public int compare(b bVar, b bVar2) {
        int i = 1;
        if ((bVar.d == null) != (bVar2.d == null)) {
            if (bVar.d != null) {
                i = -1;
            }
            return i;
        }
        boolean z = bVar.a;
        if (z != bVar2.a) {
            if (z) {
                i = -1;
            }
            return i;
        }
        int i2 = bVar2.b - bVar.b;
        if (i2 != 0) {
            return i2;
        }
        int i3 = bVar.c - bVar2.c;
        if (i3 != 0) {
            return i3;
        }
        return 0;
    }
}
