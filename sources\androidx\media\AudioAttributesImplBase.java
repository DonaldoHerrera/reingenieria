package androidx.media;

import java.util.Arrays;

public class AudioAttributesImplBase implements C0379a {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = -1;

    AudioAttributesImplBase() {
    }

    public int a() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.a(false, this.c, this.a);
    }

    public Object b() {
        return null;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        int i = this.c;
        int a2 = a();
        if (a2 == 6) {
            i |= 4;
        } else if (a2 == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.b == audioAttributesImplBase.c() && this.c == audioAttributesImplBase.d() && this.a == audioAttributesImplBase.e() && this.d == audioAttributesImplBase.d) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.a(this.a));
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }

    AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.a = i3;
        this.d = i4;
    }
}
