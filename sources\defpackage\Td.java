package defpackage;

/* renamed from: Td reason: default package */
/* compiled from: SimpleSQLiteQuery */
public final class Td implements Xd {
    private final String a;
    private final Object[] b;

    public Td(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    public String a() {
        return this.a;
    }

    public void a(Wd wd) {
        a(wd, this.b);
    }

    public static void a(Wd wd, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                a(wd, i, obj);
            }
        }
    }

    public Td(String str) {
        this(str, null);
    }

    private static void a(Wd wd, int i, Object obj) {
        if (obj == null) {
            wd.c(i);
        } else if (obj instanceof byte[]) {
            wd.a(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            wd.a(i, (double) ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            wd.a(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            wd.a(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            wd.a(i, (long) ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            wd.a(i, (long) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            wd.a(i, (long) ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            wd.a(i, (String) obj);
        } else if (obj instanceof Boolean) {
            wd.a(i, ((Boolean) obj).booleanValue() ? 1 : 0);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot bind ");
            sb.append(obj);
            sb.append(" at index ");
            sb.append(i);
            sb.append(" Supported types: null, byte[], float, double, long, int, short, byte,");
            sb.append(" string");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
