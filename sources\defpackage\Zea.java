package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: Zea reason: default package */
/* compiled from: SchemaMigrationHelper */
public final class Zea {
    private static final String a = "Zea";

    private Zea() {
    }

    public static void a(Yea yea, SQLiteDatabase sQLiteDatabase) {
        a(yea.name(), sQLiteDatabase);
        sQLiteDatabase.execSQL(yea.b());
    }

    static void b(String str, SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP VIEW IF EXISTS ");
        sb.append(str);
        sQLiteDatabase.execSQL(sb.toString());
    }

    static void c(_ea _ea, SQLiteDatabase sQLiteDatabase) {
        SDb.a("DatabaseManager").a("dropping %s", _ea.name());
        if (_ea.m) {
            b(_ea.name(), sQLiteDatabase);
        } else {
            a(_ea.name(), sQLiteDatabase);
        }
    }

    static void d(_ea _ea, SQLiteDatabase sQLiteDatabase) {
        c(_ea, sQLiteDatabase);
        b(_ea, sQLiteDatabase);
    }

    public static void b(_ea _ea, SQLiteDatabase sQLiteDatabase) {
        String str = "DatabaseManager";
        if (!TextUtils.isEmpty(_ea.j)) {
            StringBuilder sb = new StringBuilder();
            sb.append("creating ");
            sb.append(_ea.m ? "view" : "table");
            sb.append(" ");
            sb.append(_ea.name());
            SDb.a(str).a(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(_ea.j);
            return;
        }
        SDb.a(str).a("NOT creating %s", _ea.name());
    }

    static void a(String str, SQLiteDatabase sQLiteDatabase) {
        SDb.a("DatabaseManager").a("dropping %s", str);
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE IF EXISTS ");
        sb.append(str);
        sQLiteDatabase.execSQL(sb.toString());
    }

    static List<String> a(_ea _ea, SQLiteDatabase sQLiteDatabase) {
        return a(sQLiteDatabase, _ea.name(), _ea.j, new String[0], new String[0]);
    }

    static List<String> a(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        return a(sQLiteDatabase, str, str2, new String[0], new String[0]);
    }

    @Deprecated
    static List<String> a(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr, String[] strArr2) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String str3 = str;
        String str4 = str2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Collections.addAll(arrayList2, strArr);
        Collections.addAll(arrayList, strArr2);
        StringBuilder sb = new StringBuilder();
        sb.append("bck_");
        sb.append(str3);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        String str5 = "DROP TABLE IF EXISTS ";
        sb3.append(str5);
        sb3.append(sb2);
        sQLiteDatabase2.execSQL(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        String str6 = " ";
        sb4.append(str6);
        sb4.append(str3);
        sb4.append(str6);
        String sb5 = sb4.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str6);
        sb6.append(sb2);
        sb6.append(str6);
        sQLiteDatabase2.execSQL(str4.replace(sb5, sb6.toString()));
        List a2 = a(sQLiteDatabase2, sb2);
        a2.retainAll(a(sQLiteDatabase, str));
        arrayList.addAll(a2);
        arrayList2.addAll(a2);
        String str7 = ",";
        String join = TextUtils.join(str7, arrayList);
        String join2 = TextUtils.join(str7, arrayList2);
        String str8 = "INSERT INTO %s (%s) SELECT %s from %s";
        String format = String.format(Locale.ENGLISH, str8, new Object[]{sb2, join, join2, str3});
        String str9 = "executing %s";
        SDb.a(a).a(str9, format);
        sQLiteDatabase2.execSQL(format);
        StringBuilder sb7 = new StringBuilder();
        sb7.append(str5);
        sb7.append(str3);
        sQLiteDatabase2.execSQL(sb7.toString());
        sQLiteDatabase2.execSQL(str4);
        String format2 = String.format(Locale.ENGLISH, str8, new Object[]{str3, join, join, sb2});
        SDb.a(a).a(str9, format2);
        sQLiteDatabase2.execSQL(format2);
        StringBuilder sb8 = new StringBuilder();
        sb8.append("DROP table ");
        sb8.append(sb2);
        sQLiteDatabase2.execSQL(sb8.toString());
        return arrayList;
    }

    static List<String> a(SQLiteDatabase sQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA table_info (");
        sb.append(str);
        sb.append(")");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        ArrayList arrayList = new ArrayList();
        while (rawQuery != null && rawQuery.moveToNext()) {
            arrayList.add(rawQuery.getString(1));
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, List<String> list, String str2, List<String> list2) {
        String str3 = ",";
        String join = TextUtils.join(str3, list);
        String join2 = TextUtils.join(str3, list2);
        String format = String.format(Locale.ENGLISH, "INSERT INTO %s (%s) SELECT %s from %s", new Object[]{str, join, join2, str2});
        SDb.a(a).a("migrating %s", format);
        sQLiteDatabase.execSQL(format);
    }
}
