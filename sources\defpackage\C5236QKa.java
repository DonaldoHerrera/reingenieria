package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: QKa reason: default package and case insensitive filesystem */
/* compiled from: BulkInsert */
class C5236QKa {
    private final C5054KLa a;
    private final SQLiteStatement b;
    private int c;

    C5236QKa(SQLiteDatabase sQLiteDatabase, String str, C5054KLa kLa, int i) {
        this.a = kLa;
        this.b = sQLiteDatabase.compileStatement(a(str, kLa.a, i));
    }

    private String a(String str, List<C5085LLa> list, int i) {
        String[] strArr = new String[list.size()];
        Arrays.fill(strArr, "?");
        ArrayList arrayList = new ArrayList(list.size());
        for (C5085LLa d : list) {
            arrayList.add(d.d());
        }
        StringBuilder sb = new StringBuilder();
        String str2 = "(";
        sb.append(str2);
        String str3 = ",";
        sb.append(C5147NLa.a(arrayList, str3));
        String str4 = ")";
        sb.append(str4);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(C5147NLa.a(Arrays.asList(strArr), str3));
        sb2.append(str4);
        return String.format("Insert or %s into %s %s values %s;", new Object[]{a(i), str, sb.toString(), sb2.toString()});
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return this.c >= this.a.b.size();
    }

    private void b(SQLiteStatement sQLiteStatement, Object obj, int i) {
        if (obj == null) {
            sQLiteStatement.bindNull(i);
        } else {
            sQLiteStatement.bindLong(i, b(obj));
        }
    }

    private long b(Object obj) {
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).longValue();
        }
        return Long.parseLong(String.valueOf(obj));
    }

    private String a(int i) {
        if (i == 4) {
            return "Ignore";
        }
        if (i == 5) {
            return "Replace";
        }
        throw new IllegalArgumentException("Bulk insert only accepts replace or ignore strategies");
    }

    /* access modifiers changed from: 0000 */
    public long a() {
        this.b.clearBindings();
        SQLiteStatement sQLiteStatement = this.b;
        C5054KLa kLa = this.a;
        List<C5085LLa> list = kLa.a;
        List<List<?>> list2 = kLa.b;
        int i = this.c;
        this.c = i + 1;
        a(sQLiteStatement, list, (List) list2.get(i));
        return this.b.executeInsert();
    }

    private void a(SQLiteStatement sQLiteStatement, List<C5085LLa> list, List<?> list2) {
        int i = 0;
        while (i < list.size()) {
            C5085LLa lLa = (C5085LLa) list.get(i);
            Object obj = list2.get(i);
            i++;
            a(sQLiteStatement, lLa, obj, i);
        }
    }

    private void a(SQLiteStatement sQLiteStatement, C5085LLa lLa, Object obj, int i) {
        Class<Double> c2 = lLa.c();
        if (c2 == Long.class) {
            try {
                b(sQLiteStatement, obj, i);
            } catch (ClassCastException | IllegalArgumentException e) {
                throw new IllegalArgumentException(String.format("Value [%s] is not of expected type %s for column : %s", new Object[]{obj, c2, lLa.d()}), e);
            }
        } else if (c2 == String.class) {
            a(sQLiteStatement, (String) obj, i);
        } else if (c2 == Boolean.class) {
            a(sQLiteStatement, (Boolean) obj, i);
        } else if (c2 == Double.class) {
            a(sQLiteStatement, obj, i);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal type: ");
            sb.append(c2.getCanonicalName());
            sb.append("; only primitive types allowed");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void a(SQLiteStatement sQLiteStatement, String str, int i) {
        if (str == null) {
            sQLiteStatement.bindNull(i);
        } else {
            sQLiteStatement.bindString(i, str);
        }
    }

    private void a(SQLiteStatement sQLiteStatement, Boolean bool, int i) {
        if (bool == null) {
            sQLiteStatement.bindNull(i);
        } else {
            sQLiteStatement.bindLong(i, bool.booleanValue() ? 1 : 0);
        }
    }

    private void a(SQLiteStatement sQLiteStatement, Object obj, int i) {
        if (obj == null) {
            sQLiteStatement.bindNull(i);
        } else {
            sQLiteStatement.bindDouble(i, a(obj));
        }
    }

    private double a(Object obj) {
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).doubleValue();
        }
        return Double.parseDouble(String.valueOf(obj));
    }
}
