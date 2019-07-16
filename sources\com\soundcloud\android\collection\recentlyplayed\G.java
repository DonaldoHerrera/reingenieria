package com.soundcloud.android.collection.recentlyplayed;

import android.database.Cursor;

/* compiled from: RecentlyPlayedModel */
public interface G {

    /* compiled from: RecentlyPlayedModel */
    public interface a<T extends G> {
        T a(long j, long j2, long j3, Boolean bool);
    }

    /* compiled from: RecentlyPlayedModel */
    public static final class b extends C6908mMa {
        public b(Ud ud) {
            super("RecentlyPlayed", ud.h("DELETE FROM RecentlyPlayed WHERE context_id = ? AND context_type = ? AND timestamp = ?"));
        }

        public void a(long j, long j2, long j3) {
            a(1, j);
            a(2, j2);
            a(3, j3);
        }
    }

    /* compiled from: RecentlyPlayedModel */
    public static final class c<T extends G> {
        public final a<T> a;

        /* compiled from: RecentlyPlayedModel */
        private final class a extends C6840lMa {
            private final long c;

            a(long j) {
                super("SELECT DISTINCT context_id FROM RecentlyPlayed WHERE context_type = ?1", new C7045oMa("RecentlyPlayed"));
                this.c = j;
            }

            public void a(Wd wd) {
                wd.a(1, this.c);
            }
        }

        /* compiled from: RecentlyPlayedModel */
        private final class b extends C6840lMa {
            private final Boolean c;

            b(Boolean bool) {
                super("SELECT context_id, context_type, timestamp\nFROM RecentlyPlayed\nWHERE synced = ?1", new C7045oMa("RecentlyPlayed"));
                this.c = bool;
            }

            public void a(Wd wd) {
                Boolean bool = this.c;
                if (bool != null) {
                    wd.a(1, bool.booleanValue() ? 1 : 0);
                } else {
                    wd.c(1);
                }
            }
        }

        public c(a<T> aVar) {
            this.a = aVar;
        }

        public C6840lMa a(long j) {
            return new a(j);
        }

        public C6840lMa b() {
            return new C6840lMa("SELECT context_id, context_type, max(timestamp) AS timestamp\nFROM RecentlyPlayed\nGROUP BY context_type, context_id\nORDER BY 2 DESC", new C7045oMa("RecentlyPlayed"));
        }

        public C6840lMa c() {
            return new C6840lMa("SELECT COUNT(context_id)\nFROM RecentlyPlayed\nWHERE synced = 0", new C7045oMa("RecentlyPlayed"));
        }

        public C6772kMa<Long> d() {
            return new I(this);
        }

        public C6840lMa a(Boolean bool) {
            return new b(bool);
        }

        public C6772kMa<Long> a() {
            return new H(this);
        }
    }

    /* compiled from: RecentlyPlayedModel */
    public static final class d extends C6908mMa {
        public d(Ud ud) {
            super("RecentlyPlayed", ud.h("INSERT OR REPLACE INTO RecentlyPlayed (context_id, context_type, timestamp, synced)\nVALUES (?, ?, ?, ?)"));
        }

        public void a(long j, long j2, long j3, Boolean bool) {
            a(1, j);
            a(2, j2);
            a(3, j3);
            if (bool == null) {
                c(4);
            } else {
                a(4, bool.booleanValue() ? 1 : 0);
            }
        }
    }

    /* compiled from: RecentlyPlayedModel */
    public static final class e<T extends G> implements C6772kMa<T> {
        private final c<T> a;

        public T a(Cursor cursor) {
            Boolean bool;
            a<T> aVar = this.a.a;
            boolean z = false;
            long j = cursor.getLong(0);
            long j2 = cursor.getLong(1);
            long j3 = cursor.getLong(2);
            if (cursor.isNull(3)) {
                bool = null;
            } else {
                if (cursor.getInt(3) == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return aVar.a(j, j2, j3, bool);
        }
    }

    /* compiled from: RecentlyPlayedModel */
    public interface f<T extends h> {
        T a(long j, long j2, long j3);
    }

    /* compiled from: RecentlyPlayedModel */
    public static final class g<T extends h> implements C6772kMa<T> {
        private final f<T> a;

        public T a(Cursor cursor) {
            return this.a.a(cursor.getLong(0), cursor.getLong(1), cursor.getLong(2));
        }
    }

    /* compiled from: RecentlyPlayedModel */
    public interface h {
    }

    /* compiled from: RecentlyPlayedModel */
    public interface i<T extends k> {
        T a(long j, long j2, long j3);
    }

    /* compiled from: RecentlyPlayedModel */
    public static final class j<T extends k> implements C6772kMa<T> {
        private final i<T> a;

        public T a(Cursor cursor) {
            return this.a.a(cursor.getLong(0), cursor.getLong(1), cursor.getLong(2));
        }
    }

    /* compiled from: RecentlyPlayedModel */
    public interface k {
    }

    /* compiled from: RecentlyPlayedModel */
    public static final class l extends C6908mMa {
        public l(Ud ud) {
            super("RecentlyPlayed", ud.h("DELETE FROM RecentlyPlayed WHERE timestamp <= COALESCE(\n(SELECT timestamp from RecentlyPlayed\nORDER BY timestamp DESC\nLIMIT 1 OFFSET ?), 0)"));
        }

        public void a(long j) {
            a(1, j);
        }
    }

    /* compiled from: RecentlyPlayedModel */
    public static final class m extends C6908mMa {
        public m(Ud ud) {
            super("RecentlyPlayed", ud.h("INSERT OR REPLACE INTO RecentlyPlayed (context_id, context_type, timestamp, synced)\nVALUES (?1, ?2, ?3, COALESCE((SELECT synced from RecentlyPlayed WHERE context_id = ?1 AND context_type = ?2 AND timestamp = ?3), 0) )"));
        }

        public void a(long j, long j2, long j3) {
            a(1, j);
            a(2, j2);
            a(3, j3);
        }
    }

    long a();

    Boolean b();

    long c();

    long d();
}
