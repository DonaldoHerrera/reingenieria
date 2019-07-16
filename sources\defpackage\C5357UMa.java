package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import java.io.File;

/* renamed from: UMa reason: default package and case insensitive filesystem */
/* compiled from: FabricContext */
class C5357UMa extends ContextWrapper {
    private final String a;
    private final String b;

    public C5357UMa(Context context, String str, String str2) {
        super(context);
        this.b = str;
        this.a = str2;
    }

    public File getCacheDir() {
        return new File(super.getCacheDir(), this.a);
    }

    public File getDatabasePath(String str) {
        File file = new File(super.getDatabasePath(str).getParentFile(), this.a);
        file.mkdirs();
        return new File(file, str);
    }

    @TargetApi(8)
    public File getExternalCacheDir() {
        return new File(super.getExternalCacheDir(), this.a);
    }

    @TargetApi(8)
    public File getExternalFilesDir(String str) {
        return new File(super.getExternalFilesDir(str), this.a);
    }

    public File getFilesDir() {
        return new File(super.getFilesDir(), this.a);
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(":");
        sb.append(str);
        return super.getSharedPreferences(sb.toString(), i);
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), cursorFactory);
    }

    @TargetApi(11)
    public SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getPath(), cursorFactory, databaseErrorHandler);
    }
}
