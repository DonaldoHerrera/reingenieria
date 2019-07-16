package androidx.recyclerview.widget;

import java.util.Comparator;

/* renamed from: androidx.recyclerview.widget.s reason: case insensitive filesystem */
/* compiled from: DiffUtil */
class C0424s implements Comparator<f> {
    C0424s() {
    }

    /* renamed from: a */
    public int compare(f fVar, f fVar2) {
        int i = fVar.a - fVar2.a;
        return i == 0 ? fVar.b - fVar2.b : i;
    }
}
