package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: Data */
public final class e {
    private static final String a = i.a("Data");
    public static final e b = new a().a();
    Map<String, Object> c;

    /* compiled from: Data */
    public static final class a {
        private Map<String, Object> a = new HashMap();

        public a a(String str, String str2) {
            this.a.put(str, str2);
            return this;
        }

        public a a(e eVar) {
            a(eVar.c);
            return this;
        }

        public a a(Map<String, Object> map) {
            for (Entry entry : map.entrySet()) {
                a((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        public a a(String str, Object obj) {
            if (obj == null) {
                this.a.put(str, null);
            } else {
                Class<double[]> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.a.put(str, e.a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.a.put(str, e.a((byte[]) obj));
                } else if (cls == int[].class) {
                    this.a.put(str, e.a((int[]) obj));
                } else if (cls == long[].class) {
                    this.a.put(str, e.a((long[]) obj));
                } else if (cls == float[].class) {
                    this.a.put(str, e.a((float[]) obj));
                } else if (cls == double[].class) {
                    this.a.put(str, e.a((double[]) obj));
                } else {
                    throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[]{str, cls}));
                }
            }
            return this;
        }

        public e a() {
            e eVar = new e(this.a);
            e.a(eVar);
            return eVar;
        }
    }

    e() {
    }

    public String a(String str) {
        Object obj = this.c.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int b() {
        return this.c.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return this.c.equals(((e) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode() * 31;
    }

    public e(e eVar) {
        this.c = new HashMap(eVar.c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e A[SYNTHETIC, Splitter:B:24:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b A[SYNTHETIC, Splitter:B:36:0x006b] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0035=Splitter:B:14:0x0035, B:28:0x0058=Splitter:B:28:0x0058} */
    public static e b(byte[] bArr) throws IllegalStateException {
        ObjectInputStream objectInputStream;
        Throwable e;
        String str = "Error in Data#fromByteArray: ";
        if (bArr.length <= 10240) {
            HashMap hashMap = new HashMap();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                        hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e2) {
                        Log.e(a, str, e2);
                    }
                } catch (IOException | ClassNotFoundException e3) {
                    e = e3;
                    try {
                        Log.e(a, str, e);
                        if (objectInputStream != null) {
                        }
                        byteArrayInputStream.close();
                        return new e((Map<String, ?>) hashMap);
                    } catch (Throwable th) {
                        th = th;
                        if (objectInputStream != null) {
                        }
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e4) {
                            Log.e(a, str, e4);
                        }
                        throw th;
                    }
                }
                try {
                    byteArrayInputStream.close();
                } catch (IOException e5) {
                    Log.e(a, str, e5);
                }
            } catch (IOException | ClassNotFoundException e6) {
                Throwable th2 = e6;
                objectInputStream = null;
                e = th2;
                Log.e(a, str, e);
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e7) {
                        Log.e(a, str, e7);
                    }
                }
                byteArrayInputStream.close();
                return new e((Map<String, ?>) hashMap);
            } catch (Throwable th3) {
                objectInputStream = null;
                th = th3;
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e8) {
                        Log.e(a, str, e8);
                    }
                }
                byteArrayInputStream.close();
                throw th;
            }
            return new e((Map<String, ?>) hashMap);
        }
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
    }

    e(Map<String, ?> map) {
        this.c = new HashMap(map);
    }

    public Map<String, Object> a() {
        return Collections.unmodifiableMap(this.c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078 A[SYNTHETIC, Splitter:B:31:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f A[SYNTHETIC, Splitter:B:41:0x008f] */
    public static byte[] a(e eVar) throws IllegalStateException {
        String str = "Error in Data#toByteArray: ";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream2.writeInt(eVar.b());
                for (Entry entry : eVar.c.entrySet()) {
                    objectOutputStream2.writeUTF((String) entry.getKey());
                    objectOutputStream2.writeObject(entry.getValue());
                }
                try {
                    objectOutputStream2.close();
                } catch (IOException e) {
                    Log.e(a, str, e);
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e2) {
                    Log.e(a, str, e2);
                }
                if (byteArrayOutputStream.size() <= 10240) {
                    return byteArrayOutputStream.toByteArray();
                }
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            } catch (IOException e3) {
                e = e3;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.e(a, str, e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e4) {
                        Log.e(a, str, e4);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream2 = objectOutputStream;
                    if (objectOutputStream2 != null) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e5) {
                        Log.e(a, str, e5);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e6) {
                        Log.e(a, str, e6);
                    }
                }
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            Log.e(a, str, e);
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e8) {
                    Log.e(a, str, e8);
                }
            }
            byteArrayOutputStream.close();
            return byteArray2;
        }
    }

    static Boolean[] a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    static Byte[] a(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    static Integer[] a(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    static Long[] a(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    static Float[] a(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    static Double[] a(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }
}
