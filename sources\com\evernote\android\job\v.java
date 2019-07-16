package com.evernote.android.job;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.util.Pair;
import java.io.File;
import java.util.List;

/* compiled from: JobStorageDatabaseErrorHandler */
final class v implements DatabaseErrorHandler {
    private static final Dj a = new Dj("DatabaseErrorHandler");

    v() {
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            Dj dj = a;
            StringBuilder sb = new StringBuilder();
            sb.append("deleting the database file: ");
            sb.append(str);
            dj.b(sb.toString());
            try {
                File file = new File(str);
                if (VERSION.SDK_INT >= 16) {
                    a(file);
                } else {
                    a(l.g().c(), file);
                }
            } catch (Exception e) {
                Dj dj2 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("delete failed: ");
                sb2.append(e.getMessage());
                dj2.b(e, sb2.toString(), new Object[0]);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r0 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r4.hasNext() != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        a((java.lang.String) ((android.util.Pair) r4.next()).second);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        a(r4.getPath());
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
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ExcHandler: all (r1v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
  PHI: (r0v9 java.util.List) = (r0v2 java.util.List), (r0v3 java.util.List), (r0v3 java.util.List) binds: [B:5:0x0029, B:8:0x0030, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        Dj dj = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Corruption reported by sqlite on database: ");
        sb.append(sQLiteDatabase.getPath());
        dj.b(sb.toString());
        if (!sQLiteDatabase.isOpen()) {
            a(sQLiteDatabase.getPath());
            return;
        }
        List<Pair> list = null;
        try {
            list = sQLiteDatabase.getAttachedDbs();
            sQLiteDatabase.close();
        } catch (SQLiteException unused) {
        } catch (Throwable th) {
        }
        if (list == null) {
            for (Pair pair : list) {
                a((String) pair.second);
            }
        } else {
            a(sQLiteDatabase.getPath());
        }
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(16)
    public void a(File file) {
        SQLiteDatabase.deleteDatabase(file);
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context, File file) {
        context.deleteDatabase(file.getName());
    }
}
