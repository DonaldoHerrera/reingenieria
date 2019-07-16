package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: JDb reason: default package */
/* compiled from: TzdbZoneRulesProvider */
public final class JDb extends QDb {
    private List<String> c;
    private final ConcurrentNavigableMap<String, a> d = new ConcurrentSkipListMap();
    private Set<String> e = new CopyOnWriteArraySet();

    /* renamed from: JDb$a */
    /* compiled from: TzdbZoneRulesProvider */
    static class a {
        /* access modifiers changed from: private */
        public final String a;
        private final String[] b;
        private final short[] c;
        private final AtomicReferenceArray<Object> d;

        a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.d = atomicReferenceArray;
            this.a = str;
            this.b = strArr;
            this.c = sArr;
        }

        public String toString() {
            return this.a;
        }

        /* access modifiers changed from: 0000 */
        public NDb a(String str) {
            int binarySearch = Arrays.binarySearch(this.b, str);
            if (binarySearch < 0) {
                return null;
            }
            try {
                return a(this.c[binarySearch]);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid binary time-zone data: TZDB:");
                sb.append(str);
                sb.append(", version: ");
                sb.append(this.a);
                throw new ODb(sb.toString(), e);
            }
        }

        /* access modifiers changed from: 0000 */
        public NDb a(short s) throws Exception {
            Object obj = this.d.get(s);
            if (obj instanceof byte[]) {
                obj = HDb.a(new DataInputStream(new ByteArrayInputStream((byte[]) obj)));
                this.d.set(s, obj);
            }
            return (NDb) obj;
        }
    }

    public JDb(InputStream inputStream) {
        try {
            a(inputStream);
        } catch (Exception e2) {
            throw new ODb("Unable to load TZDB time-zone rules", e2);
        }
    }

    private boolean a(InputStream inputStream) throws IOException, StreamCorruptedException {
        boolean z = false;
        for (a aVar : b(inputStream)) {
            a aVar2 = (a) this.d.putIfAbsent(aVar.a, aVar);
            if (aVar2 == null || aVar2.a.equals(aVar.a)) {
                z = true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Data already loaded for TZDB time-zone rules version: ");
                sb.append(aVar.a);
                throw new ODb(sb.toString());
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public Set<String> b() {
        return new HashSet(this.c);
    }

    public String toString() {
        return "TZDB";
    }

    /* access modifiers changed from: protected */
    public NDb b(String str, boolean z) {
        C6355eDb.a(str, "zoneId");
        NDb a2 = ((a) this.d.lastEntry().getValue()).a(str);
        if (a2 != null) {
            return a2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown time-zone ID: ");
        sb.append(str);
        throw new ODb(sb.toString());
    }

    private Iterable<a> b(InputStream inputStream) throws IOException, StreamCorruptedException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String str = "File format not recognised";
        if (dataInputStream.readByte() == 1) {
            if ("TZDB".equals(dataInputStream.readUTF())) {
                short readShort = dataInputStream.readShort();
                String[] strArr = new String[readShort];
                for (int i = 0; i < readShort; i++) {
                    strArr[i] = dataInputStream.readUTF();
                }
                short readShort2 = dataInputStream.readShort();
                String[] strArr2 = new String[readShort2];
                for (int i2 = 0; i2 < readShort2; i2++) {
                    strArr2[i2] = dataInputStream.readUTF();
                }
                this.c = Arrays.asList(strArr2);
                short readShort3 = dataInputStream.readShort();
                Object[] objArr = new Object[readShort3];
                for (int i3 = 0; i3 < readShort3; i3++) {
                    byte[] bArr = new byte[dataInputStream.readShort()];
                    dataInputStream.readFully(bArr);
                    objArr[i3] = bArr;
                }
                AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
                HashSet hashSet = new HashSet(readShort);
                for (int i4 = 0; i4 < readShort; i4++) {
                    short readShort4 = dataInputStream.readShort();
                    String[] strArr3 = new String[readShort4];
                    short[] sArr = new short[readShort4];
                    for (int i5 = 0; i5 < readShort4; i5++) {
                        strArr3[i5] = strArr2[dataInputStream.readShort()];
                        sArr[i5] = dataInputStream.readShort();
                    }
                    hashSet.add(new a(strArr[i4], strArr3, sArr, atomicReferenceArray));
                }
                return hashSet;
            }
            throw new StreamCorruptedException(str);
        }
        throw new StreamCorruptedException(str);
    }
}
