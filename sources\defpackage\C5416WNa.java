package defpackage;

import defpackage.C5387VNa;
import defpackage.C5702cOa;
import defpackage.C6434fOa;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: WNa reason: default package and case insensitive filesystem */
/* compiled from: DependencyPriorityBlockingQueue */
public class C5416WNa<E extends C5387VNa & C6434fOa & C5702cOa> extends PriorityBlockingQueue<E> {
    final Queue<E> a = new LinkedList();
    private final ReentrantLock b = new ReentrantLock();

    /* access modifiers changed from: 0000 */
    public boolean a(int i, E e) {
        try {
            this.b.lock();
            if (i == 1) {
                super.remove(e);
            }
            boolean offer = this.a.offer(e);
            return offer;
        } finally {
            this.b.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    public E b(int i, Long l, TimeUnit timeUnit) throws InterruptedException {
        E e;
        if (i == 0) {
            e = (C5387VNa) super.take();
        } else if (i == 1) {
            e = (C5387VNa) super.peek();
        } else if (i == 2) {
            e = (C5387VNa) super.poll();
        } else if (i != 3) {
            return null;
        } else {
            e = (C5387VNa) super.poll(l.longValue(), timeUnit);
        }
        return e;
    }

    public void c() {
        try {
            this.b.lock();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                C5387VNa vNa = (C5387VNa) it.next();
                if (a(vNa)) {
                    super.offer(vNa);
                    it.remove();
                }
            }
        } finally {
            this.b.unlock();
        }
    }

    public void clear() {
        try {
            this.b.lock();
            this.a.clear();
            super.clear();
        } finally {
            this.b.unlock();
        }
    }

    public boolean contains(Object obj) {
        try {
            this.b.lock();
            return super.contains(obj) || this.a.contains(obj);
        } finally {
            this.b.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection) {
        try {
            this.b.lock();
            int drainTo = super.drainTo(collection) + this.a.size();
            while (!this.a.isEmpty()) {
                collection.add(this.a.poll());
            }
            return drainTo;
        } finally {
            this.b.unlock();
        }
    }

    public boolean remove(Object obj) {
        try {
            this.b.lock();
            return super.remove(obj) || this.a.remove(obj);
        } finally {
            this.b.unlock();
        }
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            this.b.lock();
            return this.a.removeAll(collection) | super.removeAll(collection);
        } finally {
            this.b.unlock();
        }
    }

    public int size() {
        try {
            this.b.lock();
            return this.a.size() + super.size();
        } finally {
            this.b.unlock();
        }
    }

    public <T> T[] toArray(T[] tArr) {
        try {
            this.b.lock();
            return a((T[]) super.toArray(tArr), (T[]) this.a.toArray(tArr));
        } finally {
            this.b.unlock();
        }
    }

    public E peek() {
        try {
            return a(1, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public E take() throws InterruptedException {
        return a(0, null, null);
    }

    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return a(3, Long.valueOf(j), timeUnit);
    }

    public E poll() {
        try {
            return a(2, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public Object[] toArray() {
        try {
            this.b.lock();
            return a((T[]) super.toArray(), (T[]) this.a.toArray());
        } finally {
            this.b.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    public E a(int i, Long l, TimeUnit timeUnit) throws InterruptedException {
        E b2;
        while (true) {
            b2 = b(i, l, timeUnit);
            if (b2 == null || a(b2)) {
                return b2;
            }
            a(i, b2);
        }
        return b2;
    }

    public int drainTo(Collection<? super E> collection, int i) {
        try {
            this.b.lock();
            int drainTo = super.drainTo(collection, i);
            while (!this.a.isEmpty() && drainTo <= i) {
                collection.add(this.a.poll());
                drainTo++;
            }
            return drainTo;
        } finally {
            this.b.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(E e) {
        return e.b();
    }

    /* access modifiers changed from: 0000 */
    public <T> T[] a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2);
        System.arraycopy(tArr, 0, tArr3, 0, length);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }
}
