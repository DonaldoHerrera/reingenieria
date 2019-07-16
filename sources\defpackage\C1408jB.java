package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.comscore.streaming.ContentType;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jB reason: default package and case insensitive filesystem */
public class C1408jB implements VA {
    private final ByteBuffer a;

    public C1408jB(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    private static int a(int i, int i2) {
        return b(b(i), b(i2));
    }

    private static long a(long j) {
        return ((j + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) - 1) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    private static long a(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    private static long a(ByteBuffer byteBuffer, long j) throws C1254eB {
        a(byteBuffer);
        long a2 = a(byteBuffer, byteBuffer.position() + 16);
        if (a2 < j) {
            a(byteBuffer);
            if (a(byteBuffer, byteBuffer.position() + 12) + a2 == j) {
                return a2;
            }
            throw new C1254eB("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        StringBuilder sb = new StringBuilder(ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND);
        sb.append("ZIP Central Directory offset out of range: ");
        sb.append(a2);
        sb.append(". ZIP End of Central Directory offset: ");
        sb.append(j);
        throw new C1254eB(sb.toString());
    }

    private static Pair<ByteBuffer, Long> a(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        if (i < 0 || i > 65535) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("maxCommentSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min((long) i, length - 22)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - ((long) allocate.capacity());
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        a(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, 65535);
            int i4 = 0;
            while (true) {
                if (i4 >= min) {
                    break;
                }
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && (allocate.getShort(i2 + 20) & 65535) == i4) {
                    break;
                }
                i4++;
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + ((long) i2)));
    }

    private static Pair<ByteBuffer, Long> a(RandomAccessFile randomAccessFile, long j) throws IOException, C1254eB {
        if (j >= 32) {
            ByteBuffer allocate = ByteBuffer.allocate(24);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.seek(j - ((long) allocate.capacity()));
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                long j2 = allocate.getLong(0);
                if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                    StringBuilder sb = new StringBuilder(57);
                    sb.append("APK Signing Block size out of range: ");
                    sb.append(j2);
                    throw new C1254eB(sb.toString());
                }
                int i = (int) (8 + j2);
                long j3 = j - ((long) i);
                if (j3 >= 0) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(i);
                    allocate2.order(ByteOrder.LITTLE_ENDIAN);
                    randomAccessFile.seek(j3);
                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                    long j4 = allocate2.getLong(0);
                    if (j4 == j2) {
                        return Pair.create(allocate2, Long.valueOf(j3));
                    }
                    StringBuilder sb2 = new StringBuilder(103);
                    sb2.append("APK Signing Block sizes in header and footer do not match: ");
                    sb2.append(j4);
                    sb2.append(" vs ");
                    sb2.append(j2);
                    throw new C1254eB(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder(59);
                sb3.append("APK Signing Block offset out of range: ");
                sb3.append(j3);
                throw new C1254eB(sb3.toString());
            }
            throw new C1254eB("No APK Signing Block before ZIP Central Directory");
        }
        StringBuilder sb4 = new StringBuilder(87);
        sb4.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
        sb4.append(j);
        throw new C1254eB(sb4.toString());
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 >= 8) {
            int capacity = byteBuffer.capacity();
            if (i2 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i2);
                    byteBuffer.position(8);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    return slice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                }
            } else {
                StringBuilder sb = new StringBuilder(41);
                sb.append("end > capacity: ");
                sb.append(i2);
                sb.append(" > ");
                sb.append(capacity);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("end < start: ");
            sb2.append(i2);
            sb2.append(" < 8");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static void a(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) i;
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 16);
        bArr[4] = (byte) (i >>> 24);
    }

    private static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static void a(Map<Integer, byte[]> map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        long j4 = j;
        if (!map.isEmpty()) {
            C1743uA uAVar = new C1743uA(fileChannel, 0, j);
            C1743uA uAVar2 = new C1743uA(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            a(duplicate);
            int position = duplicate.position() + 16;
            if (j4 < 0 || j4 > 4294967295L) {
                StringBuilder sb = new StringBuilder(47);
                sb.append("uint32 value of out range: ");
                sb.append(j4);
                throw new IllegalArgumentException(sb.toString());
            }
            duplicate.putInt(duplicate.position() + position, (int) j4);
            C1408jB jBVar = new C1408jB(duplicate);
            int[] iArr = new int[map.size()];
            int i = 0;
            int i2 = 0;
            for (Integer intValue : map.keySet()) {
                iArr[i2] = intValue.intValue();
                i2++;
            }
            try {
                byte[][] a2 = a(iArr, new VA[]{uAVar, uAVar2, jBVar});
                while (i < iArr.length) {
                    int i3 = iArr[i];
                    Map<Integer, byte[]> map2 = map;
                    if (MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), a2[i])) {
                        i++;
                    } else {
                        throw new SecurityException(String.valueOf(c(i3)).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }

    private static boolean a(int i) {
        if (!(i == 513 || i == 514 || i == 769)) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private static X509Certificate[] a(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws SecurityException, IOException {
        ByteBuffer b = b(byteBuffer);
        ByteBuffer b2 = b(byteBuffer);
        byte[] c = c(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        int i = -1;
        int i2 = 0;
        while (b2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer b3 = b(b2);
                if (b3.remaining() >= 8) {
                    int i3 = b3.getInt();
                    arrayList.add(Integer.valueOf(i3));
                    if (a(i3)) {
                        if (i == -1 || a(i3, i) > 0) {
                            bArr = c(b3);
                            i = i3;
                        }
                    }
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Failed to parse signature record #");
                sb.append(i2);
                throw new SecurityException(sb.toString(), e);
            }
        }
        if (i != -1) {
            String e2 = e(i);
            Pair f = f(i);
            String str = (String) f.first;
            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) f.second;
            try {
                PublicKey generatePublic = KeyFactory.getInstance(e2).generatePublic(new X509EncodedKeySpec(c));
                Signature instance = Signature.getInstance(str);
                instance.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    instance.setParameter(algorithmParameterSpec);
                }
                instance.update(b);
                if (instance.verify(bArr)) {
                    b.clear();
                    ByteBuffer b4 = b(b);
                    ArrayList arrayList2 = new ArrayList();
                    byte[] bArr2 = null;
                    int i4 = 0;
                    while (b4.hasRemaining()) {
                        i4++;
                        try {
                            ByteBuffer b5 = b(b4);
                            if (b5.remaining() >= 8) {
                                int i5 = b5.getInt();
                                arrayList2.add(Integer.valueOf(i5));
                                if (i5 == i) {
                                    bArr2 = c(b5);
                                }
                            } else {
                                throw new IOException("Record too short");
                            }
                        } catch (IOException | BufferUnderflowException e3) {
                            StringBuilder sb2 = new StringBuilder(42);
                            sb2.append("Failed to parse digest record #");
                            sb2.append(i4);
                            throw new IOException(sb2.toString(), e3);
                        }
                    }
                    if (arrayList.equals(arrayList2)) {
                        int b6 = b(i);
                        byte[] bArr3 = (byte[]) map.put(Integer.valueOf(b6), bArr2);
                        if (bArr3 == null || MessageDigest.isEqual(bArr3, bArr2)) {
                            ByteBuffer b7 = b(b);
                            ArrayList arrayList3 = new ArrayList();
                            int i6 = 0;
                            while (b7.hasRemaining()) {
                                i6++;
                                byte[] c2 = c(b7);
                                try {
                                    arrayList3.add(new C1347hB((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(c2)), c2));
                                } catch (CertificateException e4) {
                                    StringBuilder sb3 = new StringBuilder(41);
                                    sb3.append("Failed to decode certificate #");
                                    sb3.append(i6);
                                    throw new SecurityException(sb3.toString(), e4);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw new SecurityException("No certificates listed");
                            } else if (Arrays.equals(c, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                            } else {
                                throw new SecurityException("Public key mismatch between certificate and signature record");
                            }
                        } else {
                            throw new SecurityException(String.valueOf(c(b6)).concat(" contents digest does not match the digest specified by a preceding signer"));
                        }
                    } else {
                        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                    }
                } else {
                    throw new SecurityException(String.valueOf(str).concat(" signature did not verify"));
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e5) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27);
                sb4.append("Failed to verify ");
                sb4.append(str);
                sb4.append(" signature");
                throw new SecurityException(sb4.toString(), e5);
            }
        } else if (i2 == 0) {
            throw new SecurityException("No signatures found");
        } else {
            throw new SecurityException("No supported signatures found");
        }
    }

    private static byte[][] a(int[] iArr, VA[] vaArr) throws DigestException {
        int i;
        String str;
        int[] iArr2 = iArr;
        VA[] vaArr2 = vaArr;
        long j = 0;
        long j2 = 0;
        for (VA a2 : vaArr2) {
            j2 += a(a2.a());
        }
        if (j2 < 2097151) {
            int i2 = (int) j2;
            byte[][] bArr = new byte[iArr2.length][];
            int i3 = 0;
            while (true) {
                i = 1;
                if (i3 >= iArr2.length) {
                    break;
                }
                byte[] bArr2 = new byte[((d(iArr2[i3]) * i2) + 5)];
                bArr2[0] = 90;
                a(i2, bArr2, 1);
                bArr[i3] = bArr2;
                i3++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[iArr2.length];
            int i4 = 0;
            while (true) {
                str = " digest not supported";
                if (i4 >= iArr2.length) {
                    break;
                }
                String c = c(iArr2[i4]);
                try {
                    messageDigestArr[i4] = MessageDigest.getInstance(c);
                    i4++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(String.valueOf(c).concat(str), e);
                }
            }
            int length = vaArr2.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < length) {
                VA va = vaArr2[i5];
                long j3 = j;
                byte[][] bArr4 = bArr;
                long a3 = va.a();
                while (a3 > j) {
                    int min = (int) Math.min(a3, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                    a(min, bArr3, i);
                    for (MessageDigest update : messageDigestArr) {
                        update.update(bArr3);
                    }
                    long j4 = j3;
                    try {
                        va.a(messageDigestArr, j4, min);
                        int i8 = 0;
                        while (i8 < iArr2.length) {
                            int i9 = iArr2[i8];
                            byte[] bArr5 = bArr3;
                            byte[] bArr6 = bArr4[i8];
                            int d = d(i9);
                            int i10 = length;
                            MessageDigest messageDigest = messageDigestArr[i8];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr6, (i6 * d) + 5, d);
                            if (digest == d) {
                                i8++;
                                bArr3 = bArr5;
                                length = i10;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        MessageDigest[] messageDigestArr3 = messageDigestArr;
                        int i11 = length;
                        long j5 = (long) min;
                        long j6 = j4 + j5;
                        a3 -= j5;
                        i6++;
                        VA[] vaArr3 = vaArr;
                        bArr3 = bArr3;
                        i = 1;
                        j3 = j6;
                        j = 0;
                    } catch (IOException e2) {
                        IOException iOException = e2;
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Failed to digest chunk #");
                        sb2.append(i6);
                        sb2.append(" of section #");
                        sb2.append(i7);
                        throw new DigestException(sb2.toString(), iOException);
                    }
                }
                byte[] bArr7 = bArr3;
                MessageDigest[] messageDigestArr4 = messageDigestArr;
                int i12 = length;
                i7++;
                i5++;
                vaArr2 = vaArr;
                bArr = bArr4;
                j = 0;
                i = 1;
            }
            byte[][] bArr8 = bArr;
            byte[][] bArr9 = new byte[iArr2.length][];
            int i13 = 0;
            while (i13 < iArr2.length) {
                int i14 = iArr2[i13];
                byte[] bArr10 = bArr8[i13];
                String c2 = c(i14);
                try {
                    bArr9[i13] = MessageDigest.getInstance(c2).digest(bArr10);
                    i13++;
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(String.valueOf(c2).concat(str), e3);
                }
            }
            return bArr9;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(j2);
        throw new DigestException(sb3.toString());
    }

    private static X509Certificate[][] a(RandomAccessFile randomAccessFile) throws C1254eB, SecurityException, IOException {
        return a(randomAccessFile.getChannel(), b(randomAccessFile));
    }

    public static X509Certificate[][] a(String str) throws C1254eB, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            X509Certificate[][] a2 = a(randomAccessFile);
            randomAccessFile.close();
            return a2;
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static X509Certificate[][] a(FileChannel fileChannel, C1285fB fBVar) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer b = b(fBVar.a);
                int i = 0;
                while (b.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(a(b(b), (Map<Integer, byte[]>) hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    a(hashMap, fileChannel, fBVar.b, fBVar.c, fBVar.d, fBVar.e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    private static int b(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            break;
                        case 258:
                        case 260:
                            break;
                        default:
                            String str = "Unknown signature algorithm: 0x";
                            String valueOf = String.valueOf(Long.toHexString((long) i));
                            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    private static int b(int i, int i2) {
        String str = "Unknown digestAlgorithm2: ";
        if (i != 1) {
            if (i != 2) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown digestAlgorithm1: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (i2 == 1) {
                return 1;
            } else {
                if (i2 == 2) {
                    return 0;
                }
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append(str);
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else if (i2 == 1) {
            return 0;
        } else {
            if (i2 == 2) {
                return -1;
            }
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append(str);
            sb3.append(i2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004c  */
    private static C1285fB b(RandomAccessFile randomAccessFile) throws IOException, C1254eB {
        boolean z;
        Pair c = c(randomAccessFile);
        ByteBuffer byteBuffer = (ByteBuffer) c.first;
        long longValue = ((Long) c.second).longValue();
        long j = longValue - 20;
        if (j >= 0) {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == 1347094023) {
                z = true;
                if (z) {
                    long a2 = a(byteBuffer, longValue);
                    Pair a3 = a(randomAccessFile, a2);
                    ByteBuffer byteBuffer2 = (ByteBuffer) a3.first;
                    C1285fB fBVar = new C1285fB(d(byteBuffer2), ((Long) a3.second).longValue(), a2, longValue, byteBuffer, 0);
                    return fBVar;
                }
                throw new C1254eB("ZIP64 APK not supported");
            }
        }
        z = false;
        if (z) {
        }
    }

    private static ByteBuffer b(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return b(byteBuffer, i);
            } else {
                int remaining = byteBuffer.remaining();
                StringBuilder sb = new StringBuilder(101);
                sb.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb.append(i);
                sb.append(", remaining: ");
                sb.append(remaining);
                throw new IOException(sb.toString());
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(93);
            sb2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static Pair<ByteBuffer, Long> c(RandomAccessFile randomAccessFile) throws IOException, C1254eB {
        Pair<ByteBuffer, Long> pair;
        if (randomAccessFile.length() < 22) {
            pair = null;
        } else {
            pair = a(randomAccessFile, 0);
            if (pair == null) {
                pair = a(randomAccessFile, 65535);
            }
        }
        if (pair != null) {
            return pair;
        }
        long length = randomAccessFile.length();
        StringBuilder sb = new StringBuilder(102);
        sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
        sb.append(length);
        sb.append(" bytes");
        throw new C1254eB(sb.toString());
    }

    private static String c(int i) {
        if (i == 1) {
            return Constants.SHA256;
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private static byte[] c(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
    }

    private static int d(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private static ByteBuffer d(ByteBuffer byteBuffer) throws C1254eB {
        e(byteBuffer);
        ByteBuffer a2 = a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i = 0;
        while (a2.hasRemaining()) {
            i++;
            if (a2.remaining() >= 8) {
                long j = a2.getLong();
                String str = " size out of range: ";
                String str2 = "APK Signing Block entry #";
                if (j < 4 || j > 2147483647L) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append(str2);
                    sb.append(i);
                    sb.append(str);
                    sb.append(j);
                    throw new C1254eB(sb.toString());
                }
                int i2 = (int) j;
                int position = a2.position() + i2;
                if (i2 > a2.remaining()) {
                    int remaining = a2.remaining();
                    StringBuilder sb2 = new StringBuilder(91);
                    sb2.append(str2);
                    sb2.append(i);
                    sb2.append(str);
                    sb2.append(i2);
                    sb2.append(", available: ");
                    sb2.append(remaining);
                    throw new C1254eB(sb2.toString());
                } else if (a2.getInt() == 1896449818) {
                    return b(a2, i2 - 4);
                } else {
                    a2.position(position);
                }
            } else {
                StringBuilder sb3 = new StringBuilder(70);
                sb3.append("Insufficient data to read size of APK Signing Block entry #");
                sb3.append(i);
                throw new C1254eB(sb3.toString());
            }
        }
        throw new C1254eB("No APK Signature Scheme v2 block in APK Signing Block");
    }

    private static String e(int i) {
        if (i == 513 || i == 514) {
            return "EC";
        }
        if (i == 769) {
            return "DSA";
        }
        switch (i) {
            case 257:
            case 258:
            case 259:
            case 260:
                return "RSA";
            default:
                String str = "Unknown signature algorithm: 0x";
                String valueOf = String.valueOf(Long.toHexString((long) i));
                throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    private static void e(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static Pair<String, ? extends AlgorithmParameterSpec> f(int i) {
        if (i == 513) {
            return Pair.create("SHA256withECDSA", null);
        }
        if (i == 514) {
            return Pair.create("SHA512withECDSA", null);
        }
        if (i == 769) {
            return Pair.create("SHA256withDSA", null);
        }
        switch (i) {
            case 257:
                PSSParameterSpec pSSParameterSpec = new PSSParameterSpec(Constants.SHA256, "MGF1", MGF1ParameterSpec.SHA256, 32, 1);
                return Pair.create("SHA256withRSA/PSS", pSSParameterSpec);
            case 258:
                PSSParameterSpec pSSParameterSpec2 = new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1);
                return Pair.create("SHA512withRSA/PSS", pSSParameterSpec2);
            case 259:
                return Pair.create("SHA256withRSA", null);
            case 260:
                return Pair.create("SHA512withRSA", null);
            default:
                String str = "Unknown signature algorithm: 0x";
                String valueOf = String.valueOf(Long.toHexString((long) i));
                throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    public long a() {
        return (long) this.a.capacity();
    }

    public void a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.a) {
            int i2 = (int) j;
            this.a.position(i2);
            this.a.limit(i2 + i);
            slice = this.a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
