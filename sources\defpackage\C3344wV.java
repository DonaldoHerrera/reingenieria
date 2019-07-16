package defpackage;

/* renamed from: wV reason: default package and case insensitive filesystem */
/* compiled from: DeviceSecret */
public class C3344wV {
    public static final C3344wV a = new C3344wV();
    private final String b;
    private final byte[] c;
    private final byte[] d;

    private C3344wV() {
        this.b = "empty_key";
        byte[] bArr = new byte[0];
        this.c = bArr;
        this.d = bArr;
    }

    public byte[] a() {
        return a(this.d);
    }

    public byte[] b() {
        return a(this.c);
    }

    public String c() {
        return this.b;
    }

    public boolean d() {
        byte[] bArr = this.d;
        return (bArr == null || bArr.length == 0) ? false : true;
    }

    private byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public C3344wV(String str, byte[] bArr) {
        this(str, bArr, null);
    }

    public C3344wV(String str, byte[] bArr, byte[] bArr2) {
        this.b = str;
        this.c = a(bArr);
        this.d = a(bArr2);
    }
}
