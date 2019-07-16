package bo.app;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;

public class di implements dg {
    private static final String a = Hg.a(di.class);
    private static final String[] b = {"session_id", "user_id", "event_type", "event_data", "event_guid", "timestamp"};
    private SQLiteDatabase c;
    private final da d;

    public di(da daVar) {
        this.d = daVar;
    }

    private ContentValues c(bo boVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_type", boVar.b().forJsonPut());
        contentValues.put("event_data", boVar.c().toString());
        contentValues.put("timestamp", Double.valueOf(boVar.a()));
        if (boVar.f() != null) {
            contentValues.put("session_id", boVar.f().toString());
        }
        if (boVar.e() != null) {
            contentValues.put("user_id", boVar.e());
        }
        if (boVar.d() != null) {
            contentValues.put("event_guid", boVar.d());
        }
        return contentValues;
    }

    public void a(bo boVar) {
        if (b().insert("ab_events", null, c(boVar)) == -1) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to add event [");
            sb.append(boVar.toString());
            sb.append("] to storage");
            Hg.e(str, sb.toString());
        }
    }

    public synchronized SQLiteDatabase b() {
        if (this.c == null || !this.c.isOpen()) {
            this.c = this.d.getWritableDatabase();
        }
        return this.c;
    }

    public Collection<bo> a() {
        return a(b().query("ab_events", b, null, null, null, null, null));
    }

    public void b(bo boVar) {
        b().beginTransaction();
        try {
            int delete = b().delete("ab_events", "event_guid = ?", new String[]{boVar.d()});
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Deleting event with uid ");
            sb.append(boVar.d());
            sb.append(" removed ");
            sb.append(delete);
            sb.append(" row.");
            Hg.a(str, sb.toString());
            b().setTransactionSuccessful();
        } finally {
            b().endTransaction();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0066 */
    private Collection<bo> a(Cursor cursor) {
        Cursor cursor2 = cursor;
        ArrayList arrayList = new ArrayList();
        int columnIndex = cursor2.getColumnIndex("session_id");
        int columnIndex2 = cursor2.getColumnIndex("user_id");
        int columnIndex3 = cursor2.getColumnIndex("event_type");
        int columnIndex4 = cursor2.getColumnIndex("event_data");
        int columnIndex5 = cursor2.getColumnIndex("event_guid");
        int columnIndex6 = cursor2.getColumnIndex("timestamp");
        while (cursor.moveToNext()) {
            String string = cursor2.getString(columnIndex3);
            String string2 = cursor2.getString(columnIndex4);
            double d2 = cursor2.getDouble(columnIndex6);
            String string3 = cursor2.getString(columnIndex5);
            String str = string;
            String string4 = cursor2.getString(columnIndex);
            String str2 = string2;
            String str3 = string3;
            String string5 = cursor2.getString(columnIndex2);
            int i = columnIndex;
            double d3 = d2;
            int i2 = columnIndex2;
            String str4 = string2;
            arrayList.add(bx.a(str, str2, d2, str3, string5, string4));
            try {
                String str5 = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Could not create AppboyEvent from [type=");
                sb.append(string);
                sb.append(", data=");
                sb.append(str4);
                sb.append(", timestamp=");
                sb.append(d3);
                sb.append(", uniqueId=");
                sb.append(str3);
                sb.append(", userId=");
                sb.append(string5);
                sb.append(", sessionId=");
                sb.append(string4);
                sb.append("] ... Skipping");
                Hg.b(str5, sb.toString());
                cursor2 = cursor;
                columnIndex = i;
                columnIndex2 = i2;
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }
}
