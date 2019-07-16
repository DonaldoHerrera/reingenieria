package com.evernote.android.job;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: JobStorage */
class u {
    /* access modifiers changed from: private */
    public static final Dj a = new Dj("JobStorage");
    private final SharedPreferences b;
    private final a c;
    private AtomicInteger d;
    /* access modifiers changed from: private */
    public final Set<String> e;
    private final b f;
    private SQLiteDatabase g;
    private final ReadWriteLock h;

    /* compiled from: JobStorage */
    private class a extends LruCache<Integer, s> {
        public a() {
            super(30);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public s create(Integer num) {
            return u.this.a(num.intValue(), true);
        }
    }

    /* compiled from: JobStorage */
    private static final class b extends SQLiteOpenHelper {
        /* synthetic */ b(Context context, String str, t tVar) {
            this(context, str);
        }

        private void a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("create table jobs (_id integer primary key, tag text not null, startMs integer, endMs integer, backoffMs integer, backoffPolicy text not null, intervalMs integer, requirementsEnforced integer, requiresCharging integer, requiresDeviceIdle integer, exact integer, networkType text not null, extras text, numFailures integer, scheduledAt integer, started integer, flexMs integer, flexSupport integer, lastRun integer, transient integer, requiresBatteryNotLow integer, requiresStorageNotLow integer);");
        }

        private void b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column isTransient integer;");
        }

        private void c(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column flexMs integer;");
            sQLiteDatabase.execSQL("alter table jobs add column flexSupport integer;");
            ContentValues contentValues = new ContentValues();
            contentValues.put("intervalMs", Long.valueOf(s.d));
            StringBuilder sb = new StringBuilder();
            sb.append("intervalMs>0 AND intervalMs<");
            sb.append(s.d);
            sQLiteDatabase.update("jobs", contentValues, sb.toString(), new String[0]);
            sQLiteDatabase.execSQL("update jobs set flexMs = intervalMs;");
        }

        private void d(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column lastRun integer;");
        }

        private void e(SQLiteDatabase sQLiteDatabase) {
            StringBuilder sb;
            String str;
            SQLiteDatabase sQLiteDatabase2;
            SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
            String str2 = "networkType";
            String str3 = "exact";
            String str4 = "requiresDeviceIdle";
            String str5 = "requiresCharging";
            String str6 = "requirementsEnforced";
            String str7 = "intervalMs";
            String str8 = "backoffPolicy";
            String str9 = "backoffMs";
            String str10 = "endMs";
            String str11 = "startMs";
            String str12 = "tag";
            String str13 = "_id";
            String str14 = " text not null, ";
            String str15 = " integer, ";
            String str16 = ",";
            try {
                sQLiteDatabase.beginTransaction();
                String str17 = str16;
                String str18 = "jobs_new";
                try {
                    sb = new StringBuilder();
                    String str19 = str2;
                    sb.append("create table ");
                    sb.append(str18);
                    sb.append(" (");
                    sb.append(str13);
                    sb.append(" integer primary key, ");
                    sb.append(str12);
                    sb.append(str14);
                    sb.append(str11);
                    sb.append(str15);
                    sb.append(str10);
                    sb.append(str15);
                    sb.append(str9);
                    sb.append(str15);
                    sb.append(str8);
                    sb.append(str14);
                    sb.append(str7);
                    sb.append(str15);
                    sb.append(str6);
                    sb.append(str15);
                    sb.append(str5);
                    sb.append(str15);
                    sb.append(str4);
                    sb.append(str15);
                    sb.append(str3);
                    sb.append(str15);
                    str = str19;
                    sb.append(str);
                    sb.append(str14);
                    sb.append("extras");
                    sb.append(" text, ");
                    sb.append("numFailures");
                    sb.append(str15);
                    sb.append("scheduledAt");
                    sb.append(str15);
                    sb.append("started");
                    sb.append(str15);
                    sb.append("flexMs");
                    sb.append(str15);
                    sb.append("flexSupport");
                    sb.append(str15);
                    sb.append("lastRun");
                    sb.append(" integer);");
                    sQLiteDatabase2 = sQLiteDatabase;
                } catch (Throwable th) {
                    th = th;
                    SQLiteDatabase sQLiteDatabase4 = sQLiteDatabase;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
                try {
                    sQLiteDatabase2.execSQL(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("INSERT INTO ");
                    sb2.append(str18);
                    sb2.append(" SELECT ");
                    sb2.append(str13);
                    String str20 = str17;
                    sb2.append(str20);
                    sb2.append(str12);
                    sb2.append(str20);
                    sb2.append(str11);
                    sb2.append(str20);
                    sb2.append(str10);
                    sb2.append(str20);
                    sb2.append(str9);
                    sb2.append(str20);
                    sb2.append(str8);
                    sb2.append(str20);
                    sb2.append(str7);
                    sb2.append(str20);
                    sb2.append(str6);
                    sb2.append(str20);
                    sb2.append(str5);
                    sb2.append(str20);
                    sb2.append(str4);
                    sb2.append(str20);
                    sb2.append(str3);
                    sb2.append(str20);
                    sb2.append(str);
                    sb2.append(str20);
                    sb2.append("extras");
                    sb2.append(str20);
                    sb2.append("numFailures");
                    sb2.append(str20);
                    sb2.append("scheduledAt");
                    sb2.append(str20);
                    sb2.append("isTransient");
                    sb2.append(str20);
                    sb2.append("flexMs");
                    sb2.append(str20);
                    sb2.append("flexSupport");
                    sb2.append(str20);
                    sb2.append("lastRun");
                    sb2.append(" FROM ");
                    sb2.append("jobs");
                    sQLiteDatabase2.execSQL(sb2.toString());
                    sQLiteDatabase2.execSQL("DROP TABLE jobs");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("ALTER TABLE ");
                    sb3.append(str18);
                    sb3.append(" RENAME TO ");
                    sb3.append("jobs");
                    sQLiteDatabase2.execSQL(sb3.toString());
                    sQLiteDatabase2.execSQL("alter table jobs add column transient integer;");
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                SQLiteDatabase sQLiteDatabase5 = sQLiteDatabase3;
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }

        private void f(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column requiresBatteryNotLow integer;");
            sQLiteDatabase.execSQL("alter table jobs add column requiresStorageNotLow integer;");
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            a(sQLiteDatabase);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            while (i < i2) {
                if (i == 1) {
                    b(sQLiteDatabase);
                } else if (i == 2) {
                    c(sQLiteDatabase);
                } else if (i == 3) {
                    d(sQLiteDatabase);
                } else if (i == 4) {
                    e(sQLiteDatabase);
                } else if (i == 5) {
                    f(sQLiteDatabase);
                } else {
                    throw new IllegalStateException("not implemented");
                }
                i++;
            }
        }

        private b(Context context, String str) {
            super(context, str, null, 6, new v());
        }
    }

    public u(Context context) {
        this(context, "evernote_jobs.db");
    }

    private void c(s sVar) {
        SQLiteDatabase sQLiteDatabase;
        ContentValues G = sVar.G();
        try {
            sQLiteDatabase = b();
            try {
                if (sQLiteDatabase.insertWithOnConflict("jobs", null, G, 5) >= 0) {
                    a(sQLiteDatabase);
                    return;
                }
                throw new SQLException("Couldn't insert job request into database");
            } catch (Throwable th) {
                th = th;
                a(sQLiteDatabase);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
            a(sQLiteDatabase);
            throw th;
        }
    }

    private void d(s sVar) {
        this.c.put(Integer.valueOf(sVar.k()), sVar);
    }

    private void e() {
        new t(this, "CleanupFinishedJobsThread").start();
    }

    public void b(s sVar) {
        a(sVar, sVar.k());
    }

    public u(Context context, String str) {
        this.b = context.getSharedPreferences("evernote_jobs", 0);
        this.h = new ReentrantReadWriteLock();
        this.c = new a();
        this.f = new b(context, str, null);
        this.e = this.b.getStringSet("FAILED_DELETE_IDS", new HashSet());
        if (!this.e.isEmpty()) {
            e();
        }
    }

    /* access modifiers changed from: 0000 */
    public SQLiteDatabase b() {
        SQLiteDatabase sQLiteDatabase = this.g;
        if (sQLiteDatabase != null) {
            return sQLiteDatabase;
        }
        try {
            return this.f.getWritableDatabase();
        } catch (SQLiteCantOpenDatabaseException e2) {
            a.a((Throwable) e2);
            new v().a("evernote_jobs.db");
            return this.f.getWritableDatabase();
        }
    }

    public synchronized int d() {
        int incrementAndGet;
        if (this.d == null) {
            this.d = new AtomicInteger(c());
        }
        incrementAndGet = this.d.incrementAndGet();
        int c2 = g.c();
        if (incrementAndGet < c2 || incrementAndGet >= 2147480000) {
            this.d.set(c2);
            incrementAndGet = this.d.incrementAndGet();
        }
        this.b.edit().putInt("JOB_ID_COUNTER_v2", incrementAndGet).apply();
        return incrementAndGet;
    }

    public void a(s sVar) {
        this.h.writeLock().lock();
        try {
            c(sVar);
            d(sVar);
        } finally {
            this.h.writeLock().unlock();
        }
    }

    private void b(int i) {
        synchronized (this.e) {
            this.e.add(String.valueOf(i));
            this.b.edit().putStringSet("FAILED_DELETE_IDS", this.e).apply();
        }
    }

    /* access modifiers changed from: 0000 */
    public int c() {
        SQLiteDatabase sQLiteDatabase;
        int i;
        try {
            sQLiteDatabase = b();
            try {
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT MAX(_id) FROM jobs", null);
                i = (rawQuery == null || !rawQuery.moveToFirst()) ? 0 : rawQuery.getInt(0);
                a(rawQuery);
                a(sQLiteDatabase);
            } catch (Exception e2) {
                e = e2;
                try {
                    a.a((Throwable) e);
                    a((Cursor) null);
                    a(sQLiteDatabase);
                    i = 0;
                    return Math.max(g.c(), Math.max(i, this.b.getInt("JOB_ID_COUNTER_v2", 0)));
                } catch (Throwable th) {
                    th = th;
                    a((Cursor) null);
                    a(sQLiteDatabase);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            sQLiteDatabase = null;
            a.a((Throwable) e);
            a((Cursor) null);
            a(sQLiteDatabase);
            i = 0;
            return Math.max(g.c(), Math.max(i, this.b.getInt("JOB_ID_COUNTER_v2", 0)));
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
            a((Cursor) null);
            a(sQLiteDatabase);
            throw th;
        }
        return Math.max(g.c(), Math.max(i, this.b.getInt("JOB_ID_COUNTER_v2", 0)));
    }

    public void a(s sVar, ContentValues contentValues) {
        this.h.writeLock().lock();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            d(sVar);
            sQLiteDatabase = b();
            sQLiteDatabase.update("jobs", contentValues, "_id=?", new String[]{String.valueOf(sVar.k())});
        } catch (Exception e2) {
            a.a(e2, "could not update %s", sVar);
        } catch (Throwable th) {
            a(sQLiteDatabase);
            this.h.writeLock().unlock();
            throw th;
        }
        a(sQLiteDatabase);
        this.h.writeLock().unlock();
    }

    public s a(int i) {
        this.h.readLock().lock();
        try {
            return (s) this.c.get(Integer.valueOf(i));
        } finally {
            this.h.readLock().unlock();
        }
    }

    private boolean c(int i) {
        boolean z;
        synchronized (this.e) {
            z = !this.e.isEmpty() && this.e.contains(String.valueOf(i));
        }
        return z;
    }

    public Set<s> a(String str, boolean z) {
        SQLiteDatabase sQLiteDatabase;
        Exception e2;
        String[] strArr;
        String str2;
        HashSet hashSet = new HashSet();
        this.h.readLock().lock();
        Cursor cursor = null;
        try {
            if (TextUtils.isEmpty(str)) {
                str2 = z ? null : "ifnull(started, 0)<=0";
                strArr = null;
            } else {
                String str3 = z ? "" : "ifnull(started, 0)<=0 AND ";
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append("tag=?");
                str2 = sb.toString();
                strArr = new String[]{str};
            }
            sQLiteDatabase = b();
            try {
                cursor = sQLiteDatabase.query("jobs", null, str2, strArr, null, null, null);
                HashMap hashMap = new HashMap(this.c.snapshot());
                while (cursor != null && cursor.moveToNext()) {
                    Integer valueOf = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("_id")));
                    if (!c(valueOf.intValue())) {
                        if (hashMap.containsKey(valueOf)) {
                            hashSet.add(hashMap.get(valueOf));
                        } else {
                            hashSet.add(s.a(cursor));
                        }
                    }
                }
            } catch (Exception e3) {
                e2 = e3;
                try {
                    a.a(e2, "could not load all jobs", new Object[0]);
                    a(cursor);
                    a(sQLiteDatabase);
                    this.h.readLock().unlock();
                    return hashSet;
                } catch (Throwable th) {
                    th = th;
                    a((Cursor) null);
                    a(sQLiteDatabase);
                    this.h.readLock().unlock();
                    throw th;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            sQLiteDatabase = null;
            a.a(e2, "could not load all jobs", new Object[0]);
            a(cursor);
            a(sQLiteDatabase);
            this.h.readLock().unlock();
            return hashSet;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
            a((Cursor) null);
            a(sQLiteDatabase);
            this.h.readLock().unlock();
            throw th;
        }
        a(cursor);
        a(sQLiteDatabase);
        this.h.readLock().unlock();
        return hashSet;
    }

    /* access modifiers changed from: private */
    public boolean a(s sVar, int i) {
        this.h.writeLock().lock();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            this.c.remove(Integer.valueOf(i));
            sQLiteDatabase = b();
            sQLiteDatabase.delete("jobs", "_id=?", new String[]{String.valueOf(i)});
            return true;
        } catch (Exception e2) {
            a.a(e2, "could not delete %d %s", Integer.valueOf(i), sVar);
            b(i);
            return false;
        } finally {
            a(sQLiteDatabase);
            this.h.writeLock().unlock();
        }
    }

    /* access modifiers changed from: private */
    public s a(int i, boolean z) {
        SQLiteDatabase sQLiteDatabase;
        Throwable e2;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        Cursor cursor2 = null;
        if (c(i)) {
            return null;
        }
        String str = "_id=?";
        if (!z) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" AND started<=0");
                str = sb.toString();
            } catch (Exception e3) {
                e2 = e3;
                cursor = null;
                sQLiteDatabase2 = null;
                try {
                    a.a(e2, "could not load id %d", Integer.valueOf(i));
                    a(cursor);
                    a(sQLiteDatabase2);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    sQLiteDatabase = sQLiteDatabase2;
                    a(cursor2);
                    a(sQLiteDatabase);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = null;
                a(cursor2);
                a(sQLiteDatabase);
                throw th;
            }
        }
        String str2 = str;
        sQLiteDatabase = b();
        try {
            cursor = sQLiteDatabase.query("jobs", null, str2, new String[]{String.valueOf(i)}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        s a2 = s.a(cursor);
                        a(cursor);
                        a(sQLiteDatabase);
                        return a2;
                    }
                } catch (Exception e4) {
                    Throwable th3 = e4;
                    sQLiteDatabase2 = sQLiteDatabase;
                    e2 = th3;
                    a.a(e2, "could not load id %d", Integer.valueOf(i));
                    a(cursor);
                    a(sQLiteDatabase2);
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    cursor2 = cursor;
                    a(cursor2);
                    a(sQLiteDatabase);
                    throw th;
                }
            }
            a(cursor);
            a(sQLiteDatabase);
        } catch (Exception e5) {
            sQLiteDatabase2 = sQLiteDatabase;
            e2 = e5;
            cursor = null;
            a.a(e2, "could not load id %d", Integer.valueOf(i));
            a(cursor);
            a(sQLiteDatabase2);
            return null;
        } catch (Throwable th5) {
            th = th5;
            a(cursor2);
            a(sQLiteDatabase);
            throw th;
        }
        return null;
    }

    private static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null && g.f()) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
            }
        }
    }
}
