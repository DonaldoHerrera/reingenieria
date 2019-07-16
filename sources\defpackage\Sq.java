package defpackage;

import java.util.Collections;
import java.util.PriorityQueue;

/* renamed from: Sq reason: default package */
/* compiled from: PriorityTaskManager */
public final class Sq {
    private final Object a = new Object();
    private final PriorityQueue<Integer> b = new PriorityQueue<>(10, Collections.reverseOrder());
    private int c = Integer.MIN_VALUE;

    public void a(int i) {
        synchronized (this.a) {
            this.b.add(Integer.valueOf(i));
            this.c = Math.max(this.c, i);
        }
    }

    public void b(int i) {
        int i2;
        synchronized (this.a) {
            this.b.remove(Integer.valueOf(i));
            if (this.b.isEmpty()) {
                i2 = Integer.MIN_VALUE;
            } else {
                Object peek = this.b.peek();
                C0471ar.a(peek);
                i2 = ((Integer) peek).intValue();
            }
            this.c = i2;
            this.a.notifyAll();
        }
    }
}
