package defpackage;

import android.database.Cursor;
import java.util.List;

/* renamed from: dY reason: default package and case insensitive filesystem */
/* compiled from: DiscoveryCardModel */
public interface C3746dY {

    /* renamed from: dY$a */
    /* compiled from: DiscoveryCardModel */
    public interface a<T extends C3746dY> {
        T a(long j, Long l, Long l2);
    }

    /* renamed from: dY$b */
    /* compiled from: DiscoveryCardModel */
    public static final class b extends C6908mMa {
        public b(Ud ud) {
            super("discovery_card", ud.h("DELETE FROM discovery_card"));
        }
    }

    /* renamed from: dY$c */
    /* compiled from: DiscoveryCardModel */
    public static final class c<T extends C3746dY> {
        public final a<T> a;

        public c(a<T> aVar) {
            this.a = aVar;
        }

        public C6840lMa a() {
            return new C6840lMa("SELECT single_content_selection_card.*, multiple_content_selection_card.*\nFROM discovery_card\nLEFT JOIN single_content_selection_card ON discovery_card.single_selection_card_id == single_content_selection_card._id\nLEFT JOIN multiple_content_selection_card ON discovery_card.multiple_selection_card_id == multiple_content_selection_card._id", new C7045oMa("discovery_card", "single_content_selection_card", "multiple_content_selection_card"));
        }

        public <T1 extends C3448OY, T2 extends C3406AY, R extends h<T1, T2>> g<T1, T2, R> a(f<T1, T2, R> fVar, defpackage.C3448OY.c<T1> cVar, defpackage.C3406AY.c<T2> cVar2) {
            return new g<>(fVar, cVar, cVar2);
        }
    }

    /* renamed from: dY$d */
    /* compiled from: DiscoveryCardModel */
    public static final class d extends C6908mMa {
        public d(Ud ud) {
            super("discovery_card", ud.h("INSERT INTO discovery_card(single_selection_card_id, multiple_selection_card_id)\nVALUES (?, ?)"));
        }

        public void a(Long l, Long l2) {
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
        }
    }

    /* renamed from: dY$e */
    /* compiled from: DiscoveryCardModel */
    public static final class e<T extends C3746dY> implements C6772kMa<T> {
        private final c<T> a;

        public T a(Cursor cursor) {
            a<T> aVar = this.a.a;
            long j = cursor.getLong(0);
            Long l = null;
            Long valueOf = cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1));
            if (!cursor.isNull(2)) {
                l = Long.valueOf(cursor.getLong(2));
            }
            return aVar.a(j, valueOf, l);
        }
    }

    /* renamed from: dY$f */
    /* compiled from: DiscoveryCardModel */
    public interface f<T1 extends C3448OY, T2 extends C3406AY, T extends h<T1, T2>> {
        T a(T1 t1, T2 t2);
    }

    /* renamed from: dY$g */
    /* compiled from: DiscoveryCardModel */
    public static final class g<T1 extends C3448OY, T2 extends C3406AY, T extends h<T1, T2>> implements C6772kMa<T> {
        private final f<T1, T2, T> a;
        private final defpackage.C3448OY.c<T1> b;
        private final defpackage.C3406AY.c<T2> c;

        public g(f<T1, T2, T> fVar, defpackage.C3448OY.c<T1> cVar, defpackage.C3406AY.c<T2> cVar2) {
            this.a = fVar;
            this.b = cVar;
            this.c = cVar2;
        }

        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v1, types: [AY] */
        /* JADX WARNING: type inference failed for: r5v2 */
        /* JADX WARNING: type inference failed for: r16v0, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r5v3, types: [AY] */
        /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r5v5 */
        /* JADX WARNING: type inference failed for: r5v6 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.String, AY]
  uses: [AY, ?[OBJECT, ARRAY]]
  mth insns count: 119
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        public T a(Cursor cursor) {
            C3448OY oy;
            Cursor cursor2 = cursor;
            f<T1, T2, T> fVar = this.a;
            ? r5 = 0;
            if (cursor2.isNull(0)) {
                oy = null;
            } else {
                oy = this.b.a.a(cursor2.getLong(0), (C3508cda) this.b.b.decode(cursor2.getString(1)), cursor2.isNull(2) ? null : (C3508cda) this.b.c.decode(cursor2.getString(2)), cursor2.isNull(3) ? null : (C3508cda) this.b.d.decode(cursor2.getString(3)), cursor2.isNull(4) ? null : cursor2.getString(4), cursor2.isNull(5) ? null : cursor2.getString(5), cursor2.isNull(6) ? null : cursor2.getString(6), cursor2.isNull(7) ? null : cursor2.getString(7), cursor2.isNull(8) ? null : cursor2.getString(8), (List) this.b.e.decode(cursor2.getString(9)));
            }
            if (!cursor2.isNull(10)) {
                defpackage.C3406AY.a<T> aVar = this.c.a;
                long j = cursor2.getLong(10);
                C3508cda cda = (C3508cda) this.c.b.decode(cursor2.getString(11));
                C3508cda cda2 = cursor2.isNull(12) ? null : (C3508cda) this.c.c.decode(cursor2.getString(12));
                C3508cda cda3 = cursor2.isNull(13) ? null : (C3508cda) this.c.d.decode(cursor2.getString(13));
                String string = cursor2.isNull(14) ? null : cursor2.getString(14);
                String string2 = cursor2.isNull(15) ? null : cursor2.getString(15);
                String string3 = cursor2.isNull(16) ? null : cursor2.getString(16);
                if (!cursor2.isNull(17)) {
                    r5 = cursor2.getString(17);
                }
                r5 = aVar.a(j, cda, cda2, cda3, string, string2, string3, r5);
            }
            return fVar.a(oy, r5);
        }
    }

    /* renamed from: dY$h */
    /* compiled from: DiscoveryCardModel */
    public interface h<T1 extends C3448OY, T2 extends C3406AY> {
        T1 a();

        T2 b();
    }

    long a();

    Long b();

    Long c();
}
