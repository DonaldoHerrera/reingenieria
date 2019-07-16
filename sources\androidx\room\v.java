package androidx.room;

import android.database.Cursor;
import java.util.List;

/* compiled from: RoomOpenHelper */
public class v extends defpackage.Vd.a {
    private C0432a b;
    private final a c;
    private final String d;
    private final String e;

    /* compiled from: RoomOpenHelper */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        /* access modifiers changed from: protected */
        public abstract void a(Ud ud);

        /* access modifiers changed from: protected */
        public abstract void b(Ud ud);

        /* access modifiers changed from: protected */
        public abstract void c(Ud ud);

        /* access modifiers changed from: protected */
        public abstract void d(Ud ud);

        /* access modifiers changed from: protected */
        public abstract void e(Ud ud);

        /* access modifiers changed from: protected */
        public abstract void f(Ud ud);

        /* access modifiers changed from: protected */
        public abstract void g(Ud ud);
    }

    public v(C0432a aVar, a aVar2, String str, String str2) {
        super(aVar2.a);
        this.b = aVar;
        this.c = aVar2;
        this.d = str;
        this.e = str2;
    }

    private void e(Ud ud) {
        Object obj = null;
        if (g(ud)) {
            Cursor a2 = ud.a((Xd) new Td("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (a2.moveToFirst()) {
                    obj = a2.getString(0);
                }
            } finally {
                a2.close();
            }
        }
        if (!this.d.equals(obj) && !this.e.equals(obj)) {
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
        }
    }

    private void f(Ud ud) {
        ud.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean g(Ud ud) {
        Cursor i = ud.i("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (i.moveToFirst() && i.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            i.close();
        }
    }

    private void h(Ud ud) {
        f(ud);
        ud.g(u.a(this.d));
    }

    public void a(Ud ud) {
        super.a(ud);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    public void b(Ud ud, int i, int i2) {
        boolean z;
        C0432a aVar = this.b;
        if (aVar != null) {
            List<Kd> a2 = aVar.d.a(i, i2);
            if (a2 != null) {
                this.c.f(ud);
                for (Kd a3 : a2) {
                    a3.a(ud);
                }
                this.c.g(ud);
                this.c.e(ud);
                h(ud);
                z = true;
                if (z) {
                    C0432a aVar2 = this.b;
                    if (aVar2 == null || aVar2.a(i, i2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("A migration from ");
                        sb.append(i);
                        sb.append(" to ");
                        sb.append(i2);
                        sb.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.c.b(ud);
                    this.c.a(ud);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
        }
    }

    public void c(Ud ud) {
        h(ud);
        this.c.a(ud);
        this.c.c(ud);
    }

    public void d(Ud ud) {
        super.d(ud);
        e(ud);
        this.c.d(ud);
        this.b = null;
    }

    public void a(Ud ud, int i, int i2) {
        b(ud, i, i2);
    }
}
