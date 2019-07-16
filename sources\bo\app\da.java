package bo.app;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.util.HashMap;
import java.util.Map;

public final class da extends SQLiteOpenHelper {
    private static final String a = Hg.a(da.class);
    private static volatile Map<String, da> b = new HashMap();
    private static final String[] c = {"ab_events", "ab_sessions", "sessions", "appboy_events"};

    private da(Context context, String str) {
        super(context, str, null, 3);
    }

    public static da a(Context context, String str, String str2) {
        String b2 = b(context, str, str2);
        if (!b.containsKey(b2)) {
            synchronized (da.class) {
                if (!b.containsKey(b2)) {
                    da daVar = new da(context, b2);
                    b.put(b2, daVar);
                    return daVar;
                }
            }
        }
        return (da) b.get(b2);
    }

    static String b(Context context, String str, String str2) {
        String str3 = "appboy.db";
        if (Ng.d(str)) {
            return str3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(Ng.a(context, str, str2));
        return sb.toString();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Hg.c(a, "Creating ab_events table");
        sQLiteDatabase.execSQL("CREATE TABLE ab_events (_id INTEGER PRIMARY KEY AUTOINCREMENT, session_id TEXT, user_id TEXT, event_type TEXT NOT NULL, event_data TEXT NOT NULL, event_guid TEXT NOT NULL, timestamp INTEGER NOT NULL);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Downgrading storage from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(". Dropping all current tables.");
        Hg.c(str, sb.toString());
        a(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    @TargetApi(16)
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        } else if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON;");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Upgrading storage from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(". Dropping all current tables.");
        Hg.c(str, sb.toString());
        a(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        for (String str : c) {
            StringBuilder sb = new StringBuilder();
            sb.append("DROP TABLE IF EXISTS ");
            sb.append(str);
            sQLiteDatabase.execSQL(sb.toString());
            String str2 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropped table with name: ");
            sb2.append(str);
            Hg.a(str2, sb2.toString());
        }
    }
}
