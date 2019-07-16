package com.soundcloud.android.collection.playhistory;

import android.database.Cursor;

/* compiled from: PlayHistoryModel */
public interface V {

    /* compiled from: PlayHistoryModel */
    public interface a<T extends V> {
        T a(long j, long j2, Boolean bool);
    }

    /* compiled from: PlayHistoryModel */
    public static final class b extends C6908mMa {
        public b(Ud ud) {
            super("PlayHistory", ud.h("DELETE FROM PlayHistory WHERE track_id = ? AND timestamp = ?"));
        }

        public void a(long j, long j2) {
            a(1, j);
            a(2, j2);
        }
    }

    /* compiled from: PlayHistoryModel */
    public static final class c<T extends V> {
        public final a<T> a;

        /* compiled from: PlayHistoryModel */
        private final class a extends C6840lMa {
            private final Boolean c;

            a(Boolean bool) {
                super("SELECT track_id, timestamp\nFROM PlayHistory\nWHERE synced = ?1", new C7045oMa("PlayHistory"));
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

        /* compiled from: PlayHistoryModel */
        private final class b extends C6840lMa {
            private final long c;

            b(long j) {
                super("SELECT DISTINCT track_id\nFROM PlayHistory\nORDER BY timestamp DESC\nLIMIT ?1", new C7045oMa("PlayHistory"));
                this.c = j;
            }

            public void a(Wd wd) {
                wd.a(1, this.c);
            }
        }

        public c(a<T> aVar) {
            this.a = aVar;
        }

        public C6840lMa a() {
            return new C6840lMa("SELECT *\nFROM PlayHistory", new C7045oMa("PlayHistory"));
        }

        public C6840lMa b() {
            return new C6840lMa("SELECT DISTINCT track_id\nFROM PlayHistory\nORDER BY timestamp DESC", new C7045oMa("PlayHistory"));
        }

        public C6840lMa c() {
            return new C6840lMa("SELECT COUNT(track_id)\nFROM PlayHistory\nWHERE synced = 0", new C7045oMa("PlayHistory"));
        }

        public C6772kMa<Long> d() {
            return new Y(this);
        }

        public C6840lMa a(long j) {
            return new b(j);
        }

        public C6840lMa a(Boolean bool) {
            return new a(bool);
        }
    }

    /* compiled from: PlayHistoryModel */
    public static final class d extends C6908mMa {
        public d(Ud ud) {
            super("PlayHistory", ud.h("INSERT OR REPLACE INTO PlayHistory(track_id, timestamp, synced)\nVALUES (?, ?, ?)"));
        }

        public void a(long j, long j2, Boolean bool) {
            a(1, j);
            a(2, j2);
            if (bool == null) {
                c(3);
            } else {
                a(3, bool.booleanValue() ? 1 : 0);
            }
        }
    }

    /* compiled from: PlayHistoryModel */
    public static final class e<T extends V> implements C6772kMa<T> {
        private final c<T> a;

        public T a(Cursor cursor) {
            Boolean bool;
            a<T> aVar = this.a.a;
            boolean z = false;
            long j = cursor.getLong(0);
            long j2 = cursor.getLong(1);
            if (cursor.isNull(2)) {
                bool = null;
            } else {
                if (cursor.getInt(2) == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return aVar.a(j, j2, bool);
        }
    }

    /* compiled from: PlayHistoryModel */
    public interface f<T extends h> {
        T a(long j, long j2);
    }

    /* compiled from: PlayHistoryModel */
    public static final class g<T extends h> implements C6772kMa<T> {
        private final f<T> a;

        public T a(Cursor cursor) {
            return this.a.a(cursor.getLong(0), cursor.getLong(1));
        }
    }

    /* compiled from: PlayHistoryModel */
    public interface h {
    }

    /* compiled from: PlayHistoryModel */
    public static final class i extends C6908mMa {
        public i(Ud ud) {
            super("PlayHistory", ud.h("DELETE FROM PlayHistory WHERE timestamp <= COALESCE(\n(SELECT timestamp from PlayHistory\nORDER BY timestamp DESC\nLIMIT 1 OFFSET ?), 0)"));
        }

        public void a(long j) {
            a(1, j);
        }
    }

    /* compiled from: PlayHistoryModel */
    public static final class j extends C6908mMa {
        public j(Ud ud) {
            super("PlayHistory", ud.h("INSERT OR REPLACE INTO PlayHistory(track_id, timestamp, synced)\nVALUES (?1, ?2, COALESCE((SELECT synced from PlayHistory WHERE track_id = ?1 AND timestamp = ?2), 0) )"));
        }

        public void a(long j, long j2) {
            a(1, j);
            a(2, j2);
        }
    }

    long a();

    Boolean b();

    long c();
}
