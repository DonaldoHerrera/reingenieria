package defpackage;

import android.database.Cursor;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: Od reason: default package */
/* compiled from: TableInfo */
public class Od {
    public final String a;
    public final Map<String, a> b;
    public final Set<b> c;
    public final Set<d> d;

    /* renamed from: Od$a */
    /* compiled from: TableInfo */
    public static class a {
        public final String a;
        public final String b;
        public final int c;
        public final boolean d;
        public final int e;

        public a(String str, String str2, boolean z, int i) {
            this.a = str;
            this.b = str2;
            this.d = z;
            this.e = i;
            this.c = a(str2);
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (VERSION.SDK_INT >= 20) {
                if (this.e != aVar.e) {
                    return false;
                }
            } else if (a() != aVar.a()) {
                return false;
            }
            if (!this.a.equals(aVar.a) || this.d != aVar.d) {
                return false;
            }
            if (this.c != aVar.c) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.a);
            sb.append('\'');
            sb.append(", type='");
            sb.append(this.b);
            sb.append('\'');
            sb.append(", affinity='");
            sb.append(this.c);
            sb.append('\'');
            sb.append(", notNull=");
            sb.append(this.d);
            sb.append(", primaryKeyPosition=");
            sb.append(this.e);
            sb.append('}');
            return sb.toString();
        }

        public boolean a() {
            return this.e > 0;
        }
    }

    /* renamed from: Od$b */
    /* compiled from: TableInfo */
    public static class b {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return this.e.equals(bVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ForeignKey{referenceTable='");
            sb.append(this.a);
            sb.append('\'');
            sb.append(", onDelete='");
            sb.append(this.b);
            sb.append('\'');
            sb.append(", onUpdate='");
            sb.append(this.c);
            sb.append('\'');
            sb.append(", columnNames=");
            sb.append(this.d);
            sb.append(", referenceColumnNames=");
            sb.append(this.e);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: Od$c */
    /* compiled from: TableInfo */
    static class c implements Comparable<c> {
        final int a;
        final int b;
        final String c;
        final String d;

        c(int i, int i2, String str, String str2) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            int i = this.a - cVar.a;
            return i == 0 ? this.b - cVar.b : i;
        }
    }

    /* renamed from: Od$d */
    /* compiled from: TableInfo */
    public static class d {
        public final String a;
        public final boolean b;
        public final List<String> c;

        public d(String str, boolean z, List<String> list) {
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b != dVar.b || !this.c.equals(dVar.c)) {
                return false;
            }
            String str = "index_";
            if (this.a.startsWith(str)) {
                return dVar.a.startsWith(str);
            }
            return this.a.equals(dVar.a);
        }

        public int hashCode() {
            int i;
            String str = "index_";
            if (this.a.startsWith(str)) {
                i = str.hashCode();
            } else {
                i = this.a.hashCode();
            }
            return (((i * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Index{name='");
            sb.append(this.a);
            sb.append('\'');
            sb.append(", unique=");
            sb.append(this.b);
            sb.append(", columns=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    public Od(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        Set<d> set3;
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.d = set3;
    }

    public static Od a(Ud ud, String str) {
        return new Od(str, b(ud, str), c(ud, str), d(ud, str));
    }

    private static Map<String, a> b(Ud ud, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        Cursor i = ud.i(sb.toString());
        HashMap hashMap = new HashMap();
        try {
            if (i.getColumnCount() > 0) {
                int columnIndex = i.getColumnIndex("name");
                int columnIndex2 = i.getColumnIndex(C1325gg.TYPE);
                int columnIndex3 = i.getColumnIndex("notnull");
                int columnIndex4 = i.getColumnIndex("pk");
                while (i.moveToNext()) {
                    String string = i.getString(columnIndex);
                    hashMap.put(string, new a(string, i.getString(columnIndex2), i.getInt(columnIndex3) != 0, i.getInt(columnIndex4)));
                }
            }
            return hashMap;
        } finally {
            i.close();
        }
    }

    private static Set<b> c(Ud ud, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA foreign_key_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor i = ud.i(sb.toString());
        try {
            int columnIndex = i.getColumnIndex("id");
            int columnIndex2 = i.getColumnIndex("seq");
            int columnIndex3 = i.getColumnIndex("table");
            int columnIndex4 = i.getColumnIndex("on_delete");
            int columnIndex5 = i.getColumnIndex("on_update");
            List<c> a2 = a(i);
            int count = i.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                i.moveToPosition(i2);
                if (i.getInt(columnIndex2) == 0) {
                    int i3 = i.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : a2) {
                        if (cVar.a == i3) {
                            arrayList.add(cVar.c);
                            arrayList2.add(cVar.d);
                        }
                    }
                    b bVar = new b(i.getString(columnIndex3), i.getString(columnIndex4), i.getString(columnIndex5), arrayList, arrayList2);
                    hashSet.add(bVar);
                }
            }
            return hashSet;
        } finally {
            i.close();
        }
    }

    private static Set<d> d(Ud ud, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA index_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor i = ud.i(sb.toString());
        try {
            int columnIndex = i.getColumnIndex("name");
            int columnIndex2 = i.getColumnIndex("origin");
            int columnIndex3 = i.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (i.moveToNext()) {
                        if ("c".equals(i.getString(columnIndex2))) {
                            String string = i.getString(columnIndex);
                            boolean z = true;
                            if (i.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            d a2 = a(ud, string, z);
                            if (a2 == null) {
                                i.close();
                                return null;
                            }
                            hashSet.add(a2);
                        }
                    }
                    i.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            i.close();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Od.class != obj.getClass()) {
            return false;
        }
        Od od = (Od) obj;
        String str = this.a;
        if (str == null ? od.a != null : !str.equals(od.a)) {
            return false;
        }
        Map<String, a> map = this.b;
        if (map == null ? od.b != null : !map.equals(od.b)) {
            return false;
        }
        Set<b> set = this.c;
        if (set == null ? od.c != null : !set.equals(od.c)) {
            return false;
        }
        Set<d> set2 = this.d;
        if (set2 != null) {
            Set<d> set3 = od.d;
            if (set3 != null) {
                return set2.equals(set3);
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TableInfo{name='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", columns=");
        sb.append(this.b);
        sb.append(", foreignKeys=");
        sb.append(this.c);
        sb.append(", indices=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }

    private static List<c> a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static d a(Ud ud, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA index_xinfo(`");
        sb.append(str);
        sb.append("`)");
        Cursor i = ud.i(sb.toString());
        try {
            int columnIndex = i.getColumnIndex("seqno");
            int columnIndex2 = i.getColumnIndex("cid");
            int columnIndex3 = i.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (i.moveToNext()) {
                        if (i.getInt(columnIndex2) >= 0) {
                            int i2 = i.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i2), i.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    d dVar = new d(str, z, arrayList);
                    i.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            i.close();
        }
    }
}
