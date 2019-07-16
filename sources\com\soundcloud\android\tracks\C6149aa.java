package com.soundcloud.android.tracks;

import android.database.Cursor;

/* renamed from: com.soundcloud.android.tracks.aa reason: case insensitive filesystem */
/* compiled from: MediaStreamsModel */
public interface C6149aa {

    /* renamed from: com.soundcloud.android.tracks.aa$a */
    /* compiled from: MediaStreamsModel */
    public interface a<T extends C6149aa> {
        T a(C3508cda cda, String str);
    }

    /* renamed from: com.soundcloud.android.tracks.aa$b */
    /* compiled from: MediaStreamsModel */
    public static final class b extends C6908mMa {
    }

    /* renamed from: com.soundcloud.android.tracks.aa$c */
    /* compiled from: MediaStreamsModel */
    public static final class c extends C6908mMa {
        private final d<? extends C6149aa> c;

        public c(Ud ud, d<? extends C6149aa> dVar) {
            super("MediaStreams", ud.h("DELETE FROM MediaStreams\nWHERE urn = ?"));
            this.c = dVar;
        }

        public void a(C3508cda cda) {
            a(1, (String) this.c.b.encode(cda));
        }
    }

    /* renamed from: com.soundcloud.android.tracks.aa$d */
    /* compiled from: MediaStreamsModel */
    public static final class d<T extends C6149aa> {
        public final a<T> a;
        public final C6704jMa<C3508cda, String> b;

        /* renamed from: com.soundcloud.android.tracks.aa$d$a */
        /* compiled from: MediaStreamsModel */
        private final class a extends C6840lMa {
            private final C3508cda c;

            a(C3508cda cda) {
                super("SELECT *\nFROM MediaStreams\nWHERE urn = ?1", new C7045oMa("MediaStreams"));
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

        public C6840lMa b() {
            return new C6840lMa("SELECT urn\nFROM MediaStreams", new C7045oMa("MediaStreams"));
        }

        public C6772kMa<C3508cda> c() {
            return new C6152ba(this);
        }

        public f<T> a() {
            return new f<>(this);
        }
    }

    /* renamed from: com.soundcloud.android.tracks.aa$e */
    /* compiled from: MediaStreamsModel */
    public static final class e extends C6908mMa {
        private final d<? extends C6149aa> c;

        public e(Ud ud, d<? extends C6149aa> dVar) {
            super("MediaStreams", ud.h("INSERT INTO MediaStreams(urn, payload)\nVALUES (?, ?)"));
            this.c = dVar;
        }

        public void a(C3508cda cda, String str) {
            a(1, (String) this.c.b.encode(cda));
            a(2, str);
        }
    }

    /* renamed from: com.soundcloud.android.tracks.aa$f */
    /* compiled from: MediaStreamsModel */
    public static final class f<T extends C6149aa> implements C6772kMa<T> {
        private final d<T> a;

        public f(d<T> dVar) {
            this.a = dVar;
        }

        public T a(Cursor cursor) {
            d<T> dVar = this.a;
            return dVar.a.a((C3508cda) dVar.b.decode(cursor.getString(0)), cursor.getString(1));
        }
    }

    String a();

    C3508cda c();
}
