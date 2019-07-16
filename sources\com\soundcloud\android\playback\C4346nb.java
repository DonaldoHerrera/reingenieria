package com.soundcloud.android.playback;

import android.database.Cursor;

/* renamed from: com.soundcloud.android.playback.nb reason: case insensitive filesystem */
/* compiled from: PlayQueueModel */
public interface C4346nb {

    /* renamed from: com.soundcloud.android.playback.nb$a */
    /* compiled from: PlayQueueModel */
    public interface a<T extends C4346nb> {
        T a(Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool);
    }

    /* renamed from: com.soundcloud.android.playback.nb$b */
    /* compiled from: PlayQueueModel */
    public static final class b<T extends C4346nb> {
        public final a<T> a;

        public b(a<T> aVar) {
            this.a = aVar;
        }

        public C6840lMa a() {
            return new C6840lMa("SELECT * FROM play_queue", new C7045oMa("play_queue"));
        }

        public C6840lMa b() {
            return new C6840lMa("SELECT DISTINCT context_urn\nFROM play_queue\nWHERE context_urn IS NOT NULL", new C7045oMa("play_queue"));
        }
    }

    /* renamed from: com.soundcloud.android.playback.nb$c */
    /* compiled from: PlayQueueModel */
    public static final class c extends C6908mMa {
        public c(Ud ud) {
            super("play_queue", ud.h("INSERT OR REPLACE INTO play_queue(entity_id, entity_type, reposter_id, related_entity, source, source_version, source_urn, query_urn, context_type, context_urn, context_query, played)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
        }

        public void a(Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool) {
            if (l == null) {
                c(1);
            } else {
                a(1, l.longValue());
            }
            if (l2 == null) {
                c(2);
            } else {
                a(2, l2.longValue());
            }
            if (l3 == null) {
                c(3);
            } else {
                a(3, l3.longValue());
            }
            if (str == null) {
                c(4);
            } else {
                a(4, str);
            }
            if (str2 == null) {
                c(5);
            } else {
                a(5, str2);
            }
            if (str3 == null) {
                c(6);
            } else {
                a(6, str3);
            }
            if (str4 == null) {
                c(7);
            } else {
                a(7, str4);
            }
            if (str5 == null) {
                c(8);
            } else {
                a(8, str5);
            }
            if (str6 == null) {
                c(9);
            } else {
                a(9, str6);
            }
            if (str7 == null) {
                c(10);
            } else {
                a(10, str7);
            }
            if (str8 == null) {
                c(11);
            } else {
                a(11, str8);
            }
            if (bool == null) {
                c(12);
            } else {
                a(12, bool.booleanValue() ? 1 : 0);
            }
        }
    }

    /* renamed from: com.soundcloud.android.playback.nb$d */
    /* compiled from: PlayQueueModel */
    public static final class d<T extends C4346nb> implements C6772kMa<T> {
        private final b<T> a;

        public T a(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            a<T> aVar = this.a.a;
            Long valueOf = cursor2.isNull(0) ? null : Long.valueOf(cursor2.getLong(0));
            Long valueOf2 = cursor2.isNull(1) ? null : Long.valueOf(cursor2.getLong(1));
            Long valueOf3 = cursor2.isNull(2) ? null : Long.valueOf(cursor2.getLong(2));
            Long valueOf4 = cursor2.isNull(3) ? null : Long.valueOf(cursor2.getLong(3));
            String string = cursor2.isNull(4) ? null : cursor2.getString(4);
            String string2 = cursor2.isNull(5) ? null : cursor2.getString(5);
            String string3 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string4 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string5 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string6 = cursor2.isNull(9) ? null : cursor2.getString(9);
            String string7 = cursor2.isNull(10) ? null : cursor2.getString(10);
            String string8 = cursor2.isNull(11) ? null : cursor2.getString(11);
            if (cursor2.isNull(12)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(12) == 1);
            }
            return aVar.a(valueOf, valueOf2, valueOf3, valueOf4, string, string2, string3, string4, string5, string6, string7, string8, bool);
        }
    }

    Long a();

    String b();

    String c();

    String d();

    String e();

    Long f();

    Boolean g();

    String h();

    Long i();

    String j();

    String k();

    String l();

    Long m();
}
