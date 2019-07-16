package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: uMa reason: default package and case insensitive filesystem */
/* compiled from: DualCacheLock */
class C7459uMa {
    private final ConcurrentMap<String, Lock> a = new ConcurrentHashMap();
    private final ReadWriteLock b = new ReentrantReadWriteLock();

    C7459uMa() {
    }

    private Lock c(String str) {
        if (!this.a.containsKey(str)) {
            this.a.putIfAbsent(str, new ReentrantLock());
        }
        return (Lock) this.a.get(str);
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.b.readLock().lock();
        c(str).lock();
    }

    /* access modifiers changed from: 0000 */
    public void b(String str) {
        c(str).unlock();
        this.b.readLock().unlock();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.b.writeLock().lock();
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.b.writeLock().unlock();
    }
}
