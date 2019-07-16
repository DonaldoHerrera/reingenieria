package com.soundcloud.android.tracks;

import android.database.Cursor;

/* compiled from: DownloadedMediaStreamsModel */
public interface F {

    /* compiled from: DownloadedMediaStreamsModel */
    public interface a<T extends F> {
        T a(C3508cda cda, String str, String str2, String str3);
    }

    /* compiled from: DownloadedMediaStreamsModel */
    public static final class b extends C6908mMa {
    }

    /* compiled from: DownloadedMediaStreamsModel */
    public static final class c extends C6908mMa {
        private final d<? extends F> c;

        public c(Ud ud, d<? extends F> dVar) {
            super("DownloadedMediaStreams", ud.h("DELETE FROM DownloadedMediaStreams\nWHERE urn = ?"));
            this.c = dVar;
        }

        public void a(C3508cda cda) {
            a(1, (String) this.c.b.encode(cda));
        }
    }

    /* compiled from: DownloadedMediaStreamsModel */
    public static final class d<T extends F> {
        public final a<T> a;
        public final C6704jMa<C3508cda, String> b;

        /* compiled from: DownloadedMediaStreamsModel */
        private final class a extends C6840lMa {
            private final C3508cda c;

            a(C3508cda cda) {
                super("SELECT *\nFROM DownloadedMediaStreams\nWHERE urn = ?1", new C7045oMa("DownloadedMediaStreams"));
                this.c = cda;
            }

            public void a(Wd wd) {
                wd.a(1, (String) d.this.b.encode(this.c));
            }
        }

        public d(a<T> aVar, C6704jMa<C3508cda, String> jma) {
            this.a = aVar;
            this.b = jma;
        }

        public C6840lMa a(C3508cda cda) {
            return new a(cda);
        }

        public f<T> a() {
            return new f<>(this);
        }
    }

    /* compiled from: DownloadedMediaStreamsModel */
    public static final class e extends C6908mMa {
        private final d<? extends F> c;

        public e(Ud ud, d<? extends F> dVar) {
            super("DownloadedMediaStreams", ud.h("INSERT INTO DownloadedMediaStreams(urn, preset, quality, mime_type)\nVALUES (?, ?, ?, ?)"));
            this.c = dVar;
        }

        public void a(C3508cda cda, String str, String str2, String str3) {
            a(1, (String) this.c.b.encode(cda));
            a(2, str);
            a(3, str2);
            a(4, str3);
        }
    }

    /* compiled from: DownloadedMediaStreamsModel */
    public static final class f<T extends F> implements C6772kMa<T> {
        private final d<T> a;

        public f(d<T> dVar) {
            this.a = dVar;
        }

        public T a(Cursor cursor) {
            d<T> dVar = this.a;
            return dVar.a.a((C3508cda) dVar.b.decode(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3));
        }
    }

    String a();

    String b();

    C3508cda c();

    String d();
}
