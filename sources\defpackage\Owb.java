package defpackage;

import java.util.Iterator;

/* renamed from: Owb reason: default package */
/* compiled from: Sequences.kt */
public final class Owb implements Iwb<T> {
    final /* synthetic */ Iterator a;

    public Owb(Iterator it) {
        this.a = it;
    }

    public Iterator<T> iterator() {
        return this.a;
    }
}
