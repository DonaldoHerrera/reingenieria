package com.soundcloud.android.search.history;

import android.database.Cursor;

/* compiled from: SearchHistoryModel */
public interface t {

    /* compiled from: SearchHistoryModel */
    public interface a<T extends t> {
        T a(String str, long j);
    }

    /* compiled from: SearchHistoryModel */
    public static final class b<T extends t> {
        public final a<T> a;

        /* compiled from: SearchHistoryModel */
        private final class a extends C6840lMa {
            private final long c;

            a(long j) {
                super("SELECT search_term, timestamp FROM search_history\nORDER BY timestamp DESC\nLIMIT ?1", new C7045oMa("search_history"));
                this.c = j;
            }

            public void a(Wd wd) {
                wd.a(1, this.c);
            }
        }

        public b(a<T> aVar) {
            this.a = aVar;
        }

        public C6840lMa a(long j) {
            return new a(j);
        }
    }

    /* compiled from: SearchHistoryModel */
    public static final class c extends C6908mMa {
        public c(Ud ud) {
            super("search_history", ud.h("INSERT INTO search_history (search_term, timestamp)\nVALUES (?, ?)"));
        }

        public void a(String str, long j) {
            a(1, str);
            a(2, j);
        }
    }

    /* compiled from: SearchHistoryModel */
    public static final class d<T extends t> implements C6772kMa<T> {
        private final b<T> a;

        public T a(Cursor cursor) {
            return this.a.a.a(cursor.getString(0), cursor.getLong(1));
        }
    }

    /* compiled from: SearchHistoryModel */
    public interface e<T extends g> {
        T a(String str, long j);
    }

    /* compiled from: SearchHistoryModel */
    public static final class f<T extends g> implements C6772kMa<T> {
        private final e<T> a;

        public T a(Cursor cursor) {
            return this.a.a(cursor.getString(0), cursor.getLong(1));
        }
    }

    /* compiled from: SearchHistoryModel */
    public interface g {
    }

    /* compiled from: SearchHistoryModel */
    public static final class h extends C6908mMa {
        public h(Ud ud) {
            super("search_history", ud.h("DELETE FROM search_history\nWHERE timestamp <\n    (SELECT MIN(timestamp) FROM\n        (SELECT timestamp\n        FROM search_history\n        ORDER BY timestamp DESC LIMIT ?))"));
        }

        public void a(long j) {
            a(1, j);
        }
    }

    long a();

    String b();
}
