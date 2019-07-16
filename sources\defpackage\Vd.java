package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: Vd reason: default package */
/* compiled from: SupportSQLiteOpenHelper */
public interface Vd {

    /* renamed from: Vd$a */
    /* compiled from: SupportSQLiteOpenHelper */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public void a(Ud ud) {
        }

        public void a(Ud ud, int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't downgrade database from version ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            throw new SQLiteException(sb.toString());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r0 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r3.hasNext() != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            a((java.lang.String) ((android.util.Pair) r3.next()).second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
            a(r3.getPath());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ExcHandler: all (r1v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
  PHI: (r0v10 java.util.List) = (r0v3 java.util.List), (r0v4 java.util.List), (r0v4 java.util.List) binds: [B:5:0x0029, B:8:0x0030, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
        public void b(Ud ud) {
            StringBuilder sb = new StringBuilder();
            sb.append("Corruption reported by sqlite on database: ");
            sb.append(ud.getPath());
            Log.e("SupportSQLite", sb.toString());
            if (!ud.isOpen()) {
                a(ud.getPath());
                return;
            }
            List<Pair> list = null;
            try {
                list = ud.A();
                ud.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
            }
            if (list == null) {
                for (Pair pair : list) {
                    a((String) pair.second);
                }
            } else {
                a(ud.getPath());
            }
        }

        public abstract void b(Ud ud, int i, int i2);

        public abstract void c(Ud ud);

        public void d(Ud ud) {
        }

        private void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("deleting the database file: ");
                sb.append(str);
                String str2 = "SupportSQLite";
                Log.w(str2, sb.toString());
                try {
                    if (VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                        return;
                    }
                    try {
                        if (!new File(str).delete()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Could not delete the database file ");
                            sb2.append(str);
                            Log.e(str2, sb2.toString());
                        }
                    } catch (Exception e) {
                        Log.e(str2, "error while deleting corrupted database file", e);
                    }
                } catch (Exception e2) {
                    Log.w(str2, "delete failed: ", e2);
                }
            }
        }
    }

    /* renamed from: Vd$b */
    /* compiled from: SupportSQLiteOpenHelper */
    public static class b {
        public final Context a;
        public final String b;
        public final a c;

        /* renamed from: Vd$b$a */
        /* compiled from: SupportSQLiteOpenHelper */
        public static class a {
            Context a;
            String b;
            a c;

            a(Context context) {
                this.a = context;
            }

            public b a() {
                a aVar = this.c;
                if (aVar != null) {
                    Context context = this.a;
                    if (context != null) {
                        return new b(context, this.b, aVar);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            public a a(String str) {
                this.b = str;
                return this;
            }

            public a a(a aVar) {
                this.c = aVar;
                return this;
            }
        }

        b(Context context, String str, a aVar) {
            this.a = context;
            this.b = str;
            this.c = aVar;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* renamed from: Vd$c */
    /* compiled from: SupportSQLiteOpenHelper */
    public interface c {
        Vd a(b bVar);
    }

    Ud a();

    void a(boolean z);

    Ud b();

    void close();
}
