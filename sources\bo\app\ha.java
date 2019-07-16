package bo.app;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ha<E> extends AbstractQueue<E> implements gx<E>, Serializable {
    transient c<E> a;
    transient c<E> b;
    final ReentrantLock c;
    private transient int d;
    private final int e;
    private final Condition f;
    private final Condition g;

    abstract class a implements Iterator<E> {
        c<E> a;
        E b;
        private c<E> d;

        a() {
            ReentrantLock reentrantLock = ha.this.c;
            reentrantLock.lock();
            try {
                this.a = a();
                this.b = this.a == null ? null : this.a.a;
            } finally {
                reentrantLock.unlock();
            }
        }

        private c<E> b(c<E> cVar) {
            while (true) {
                c<E> a2 = a(cVar);
                if (a2 == null) {
                    return null;
                }
                if (a2.a != null) {
                    return a2;
                }
                if (a2 == cVar) {
                    return a();
                }
                cVar = a2;
            }
        }

        /* access modifiers changed from: 0000 */
        public abstract c<E> a();

        /* access modifiers changed from: 0000 */
        public abstract c<E> a(c<E> cVar);

        public boolean hasNext() {
            return this.a != null;
        }

        public E next() {
            c<E> cVar = this.a;
            if (cVar != null) {
                this.d = cVar;
                E e = this.b;
                b();
                return e;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            c<E> cVar = this.d;
            if (cVar != null) {
                this.d = null;
                ReentrantLock reentrantLock = ha.this.c;
                reentrantLock.lock();
                try {
                    if (cVar.a != null) {
                        ha.this.a(cVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                throw new IllegalStateException();
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            ReentrantLock reentrantLock = ha.this.c;
            reentrantLock.lock();
            try {
                this.a = b(this.a);
                this.b = this.a == null ? null : this.a.a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    class b extends a {
        private b() {
            super();
        }

        /* access modifiers changed from: 0000 */
        public c<E> a() {
            return ha.this.a;
        }

        /* access modifiers changed from: 0000 */
        public c<E> a(c<E> cVar) {
            return cVar.c;
        }
    }

    static final class c<E> {
        E a;
        c<E> b;
        c<E> c;

        c(E e) {
            this.a = e;
        }
    }

    public ha() {
        this(BaseClientBuilder.API_PRIORITY_OTHER);
    }

    private boolean b(c<E> cVar) {
        if (this.d >= this.e) {
            return false;
        }
        c<E> cVar2 = this.a;
        cVar.c = cVar2;
        this.a = cVar;
        if (this.b == null) {
            this.b = cVar;
        } else {
            cVar2.b = cVar;
        }
        this.d++;
        this.f.signal();
        return true;
    }

    private boolean c(c<E> cVar) {
        if (this.d >= this.e) {
            return false;
        }
        c<E> cVar2 = this.b;
        cVar.b = cVar2;
        this.b = cVar;
        if (this.a == null) {
            this.a = cVar;
        } else {
            cVar2.c = cVar;
        }
        this.d++;
        this.f.signal();
        return true;
    }

    private E f() {
        c<E> cVar = this.a;
        if (cVar == null) {
            return null;
        }
        c<E> cVar2 = cVar.c;
        E e2 = cVar.a;
        cVar.a = null;
        cVar.c = cVar;
        this.a = cVar2;
        if (cVar2 == null) {
            this.b = null;
        } else {
            cVar2.b = null;
        }
        this.d--;
        this.g.signal();
        return e2;
    }

    private E g() {
        c<E> cVar = this.b;
        if (cVar == null) {
            return null;
        }
        c<E> cVar2 = cVar.b;
        E e2 = cVar.a;
        cVar.a = null;
        cVar.b = cVar;
        this.b = cVar2;
        if (cVar2 == null) {
            this.a = null;
        } else {
            cVar2.c = null;
        }
        this.d--;
        this.g.signal();
        return e2;
    }

    /* access modifiers changed from: 0000 */
    public void a(c<E> cVar) {
        c<E> cVar2 = cVar.b;
        c<E> cVar3 = cVar.c;
        if (cVar2 == null) {
            f();
        } else if (cVar3 == null) {
            g();
        } else {
            cVar2.c = cVar3;
            cVar3.b = cVar2;
            cVar.a = null;
            this.d--;
            this.g.signal();
        }
    }

    public boolean add(E e2) {
        a(e2);
        return true;
    }

    public void clear() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            c<E> cVar = this.a;
            while (cVar != null) {
                cVar.a = null;
                c<E> cVar2 = cVar.c;
                cVar.b = null;
                cVar.c = null;
                cVar = cVar2;
            }
            this.b = null;
            this.a = null;
            this.d = 0;
            this.g.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            for (c<E> cVar = this.a; cVar != null; cVar = cVar.c) {
                if (obj.equals(cVar.a)) {
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void d(E e2) {
        if (e2 != null) {
            c cVar = new c(e2);
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            while (!c(cVar)) {
                try {
                    this.g.await();
                } finally {
                    reentrantLock.unlock();
                }
            }
            return;
        }
        throw new NullPointerException();
    }

    public int drainTo(Collection<? super E> collection) {
        return drainTo(collection, BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public E e() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            return this.a == null ? null : this.a.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E element() {
        return d();
    }

    public Iterator<E> iterator() {
        return new b();
    }

    public boolean offer(E e2) {
        return c(e2);
    }

    public E peek() {
        return e();
    }

    public E poll() {
        return b();
    }

    public void put(E e2) {
        d(e2);
    }

    public int remainingCapacity() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            return this.e - this.d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E remove() {
        return a();
    }

    public int size() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            return this.d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E take() {
        return c();
    }

    public Object[] toArray() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Object[] objArr = new Object[this.d];
            int i = 0;
            c<E> cVar = this.a;
            while (cVar != null) {
                int i2 = i + 1;
                objArr[i] = cVar.a;
                cVar = cVar.c;
                i = i2;
            }
            return objArr;
        } finally {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            c<E> cVar = this.a;
            if (cVar == null) {
                return "[]";
            }
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            while (true) {
                E e2 = cVar.a;
                if (e2 == this) {
                    e2 = "(this Collection)";
                }
                sb.append(e2);
                cVar = cVar.c;
                if (cVar == null) {
                    sb.append(']');
                    String sb2 = sb.toString();
                    reentrantLock.unlock();
                    return sb2;
                }
                sb.append(',');
                sb.append(' ');
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public ha(int i) {
        this.c = new ReentrantLock();
        this.f = this.c.newCondition();
        this.g = this.c.newCondition();
        if (i > 0) {
            this.e = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public int drainTo(Collection<? super E> collection, int i) {
        if (collection == null) {
            throw new NullPointerException();
        } else if (collection != this) {
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                int min = Math.min(i, this.d);
                for (int i2 = 0; i2 < min; i2++) {
                    collection.add(this.a.a);
                    f();
                }
                return min;
            } finally {
                reentrantLock.unlock();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean offer(E e2, long j, TimeUnit timeUnit) {
        return a(e2, j, timeUnit);
    }

    public E poll(long j, TimeUnit timeUnit) {
        return a(j, timeUnit);
    }

    public boolean remove(Object obj) {
        return e(obj);
    }

    public boolean e(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            for (c<E> cVar = this.a; cVar != null; cVar = cVar.c) {
                if (obj.equals(cVar.a)) {
                    a(cVar);
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E d() {
        E e2 = e();
        if (e2 != null) {
            return e2;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=T[], code=java.lang.Object[], for r6v0, types: [T[], java.lang.Object[], java.lang.Object] */
    public <T> T[] toArray(Object[] objArr) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (objArr.length < this.d) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.d);
            }
            int i = 0;
            c<E> cVar = this.a;
            while (cVar != null) {
                int i2 = i + 1;
                objArr[i] = cVar.a;
                cVar = cVar.c;
                i = i2;
            }
            if (objArr.length > i) {
                objArr[i] = null;
            }
            return objArr;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void a(E e2) {
        if (!c(e2)) {
            throw new IllegalStateException("Deque full");
        }
    }

    public boolean b(E e2) {
        if (e2 != null) {
            c cVar = new c(e2);
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                return b(cVar);
            } finally {
                reentrantLock.unlock();
            }
        } else {
            throw new NullPointerException();
        }
    }

    public boolean c(E e2) {
        if (e2 != null) {
            c cVar = new c(e2);
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                return c(cVar);
            } finally {
                reentrantLock.unlock();
            }
        } else {
            throw new NullPointerException();
        }
    }

    public boolean a(E e2, long j, TimeUnit timeUnit) {
        boolean z;
        if (e2 != null) {
            c cVar = new c(e2);
            long nanos = timeUnit.toNanos(j);
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lockInterruptibly();
            while (true) {
                try {
                    if (c(cVar)) {
                        z = true;
                        break;
                    } else if (nanos <= 0) {
                        z = false;
                        break;
                    } else {
                        nanos = this.g.awaitNanos(nanos);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            return z;
        }
        throw new NullPointerException();
    }

    public E b() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            return f();
        } finally {
            reentrantLock.unlock();
        }
    }

    public E c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        while (true) {
            try {
                E f2 = f();
                if (f2 != null) {
                    return f2;
                }
                this.f.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public E a() {
        E b2 = b();
        if (b2 != null) {
            return b2;
        }
        throw new NoSuchElementException();
    }

    public E a(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                E f2 = f();
                if (f2 != null) {
                    reentrantLock.unlock();
                    return f2;
                } else if (nanos <= 0) {
                    return null;
                } else {
                    nanos = this.f.awaitNanos(nanos);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
