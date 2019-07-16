package defpackage;

import com.google.common.base.Preconditions;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;

/* renamed from: WD reason: default package and case insensitive filesystem */
/* compiled from: RegularImmutableMap */
class C2346WD extends C3326wD<Entry<K, V>> {
    final /* synthetic */ a c;

    C2346WD(a aVar) {
        this.c = aVar;
    }

    public int size() {
        return this.c.f;
    }

    public Entry<K, V> get(int i) {
        Preconditions.checkElementIndex(i, this.c.f);
        int i2 = i * 2;
        return new SimpleImmutableEntry(this.c.d[this.c.e + i2], this.c.d[i2 + (this.c.e ^ 1)]);
    }
}
