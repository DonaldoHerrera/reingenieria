package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* compiled from: InvalidationTracker */
class g implements Runnable {
    final /* synthetic */ h a;

    g(h hVar) {
        this.a = hVar;
    }

    /* JADX INFO: finally extract failed */
    private Set<Integer> a() {
        V v = new V();
        Cursor a2 = this.a.e.a((Xd) new Td("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (a2.moveToNext()) {
            try {
                v.add(Integer.valueOf(a2.getInt(0)));
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        }
        a2.close();
        if (!v.isEmpty()) {
            this.a.h.v();
        }
        return v;
    }

    public void run() {
        Ud b;
        Lock f = this.a.e.f();
        Set set = null;
        try {
            f.lock();
            if (!this.a.a()) {
                f.unlock();
            } else if (!this.a.f.compareAndSet(true, false)) {
                f.unlock();
            } else if (this.a.e.k()) {
                f.unlock();
            } else {
                if (this.a.e.g) {
                    b = this.a.e.h().b();
                    b.z();
                    set = a();
                    b.B();
                    b.C();
                } else {
                    set = a();
                }
                f.unlock();
                if (set != null && !set.isEmpty()) {
                    synchronized (this.a.k) {
                        Iterator it = this.a.k.iterator();
                        while (it.hasNext()) {
                            ((c) ((Entry) it.next()).getValue()).a(set);
                        }
                    }
                }
            }
        } catch (SQLiteException | IllegalStateException e) {
            try {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            } catch (Throwable th) {
                f.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            b.C();
            throw th2;
        }
    }
}
