package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.db reason: case insensitive filesystem */
final class C1099db extends SQLiteOpenHelper {
    private final /* synthetic */ C1104eb a;

    C1099db(C1104eb ebVar, Context context, String str) {
        this.a = ebVar;
        super(context, str, null, 1);
    }

    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.a.e().s().a("Opening the local database failed, dropping and recreating it");
            String str = "google_app_measurement_local.db";
            if (!this.a.getContext().getDatabasePath(str).delete()) {
                this.a.e().s().a("Failed to delete corrupted local db file", str);
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.a.e().s().a("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C1092c.a(this.a.e(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        ? r0;
        if (VERSION.SDK_INT < 15) {
            String[] strArr = 0;
            try {
                r0 = strArr;
                Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", strArr);
                rawQuery.moveToFirst();
                r0 = rawQuery;
            } finally {
                if (r0 != 0) {
                    r0.close();
                }
            }
        }
        C1092c.a(this.a.e(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
