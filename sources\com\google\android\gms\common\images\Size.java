package com.google.android.gms.common.images;

public final class Size {
    private final int zane;
    private final int zanf;

    public Size(int i, int i2) {
        this.zane = i;
        this.zanf = i2;
    }

    public static Size parseSize(String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0) {
                indexOf = str.indexOf(120);
            }
            if (indexOf >= 0) {
                try {
                    return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    zah(str);
                    throw null;
                }
            } else {
                zah(str);
                throw null;
            }
        } else {
            throw new IllegalArgumentException("string must not be null");
        }
    }

    private static NumberFormatException zah(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
        sb.append("Invalid Size: \"");
        sb.append(str);
        sb.append("\"");
        throw new NumberFormatException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return this.zane == size.zane && this.zanf == size.zanf;
        }
    }

    public final int getHeight() {
        return this.zanf;
    }

    public final int getWidth() {
        return this.zane;
    }

    public final int hashCode() {
        int i = this.zanf;
        int i2 = this.zane;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        int i = this.zane;
        int i2 = this.zanf;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
