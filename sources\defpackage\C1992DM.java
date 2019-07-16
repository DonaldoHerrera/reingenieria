package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/* renamed from: DM reason: default package and case insensitive filesystem */
/* compiled from: TrackingDbHelper */
class C1992DM extends SQLiteOpenHelper {
    static final C5116MLa a = new C1972CM();
    static final String b;

    /* renamed from: DM$a */
    /* compiled from: TrackingDbHelper */
    abstract class a implements BaseColumns {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS ");
        sb.append(a.name());
        sb.append("(");
        sb.append("_id");
        sb.append(" INTEGER PRIMARY KEY,");
        String str = "timestamp";
        sb.append(str);
        sb.append(" INTEGER NOT NULL,");
        String str2 = "backend";
        sb.append(str2);
        sb.append(" TEXT NOT NULL,");
        String str3 = "data";
        sb.append(str3);
        sb.append(" TEXT NOT NULL,UNIQUE (");
        sb.append(str);
        String str4 = ", ";
        sb.append(str4);
        sb.append(str2);
        sb.append(str4);
        sb.append(str3);
        sb.append(") ON CONFLICT IGNORE)");
        b = sb.toString();
    }

    C1992DM(Context context) {
        super(context, "SoundCloud-tracking.sqlite", null, 5);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE IF EXISTS ");
        sb.append(a.name());
        sQLiteDatabase.execSQL(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(b);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        a(sQLiteDatabase);
    }
}
