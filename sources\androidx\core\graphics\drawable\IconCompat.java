package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    static final Mode a = Mode.SRC_IN;
    public int b = -1;
    Object c;
    public byte[] d = null;
    public Parcelable e = null;
    public int f = 0;
    public int g = 0;
    public ColorStateList h = null;
    Mode i = a;
    public String j = null;

    private static String a(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "UNKNOWN" : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    private static String b(Icon icon) {
        String str = "Unable to get icon package";
        String str2 = "IconCompat";
        if (VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e(str2, str, e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e(str2, str, e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e(str2, str, e4);
            return null;
        }
    }

    public void a(boolean z) {
        this.j = this.i.name();
        int i2 = this.b;
        if (i2 != -1) {
            if (i2 != 1) {
                String str = "UTF-16";
                if (i2 == 2) {
                    this.d = ((String) this.c).getBytes(Charset.forName(str));
                    return;
                } else if (i2 == 3) {
                    this.d = (byte[]) this.c;
                    return;
                } else if (i2 == 4) {
                    this.d = this.c.toString().getBytes(Charset.forName(str));
                    return;
                } else if (i2 != 5) {
                    return;
                }
            }
            if (z) {
                Bitmap bitmap = (Bitmap) this.c;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(CompressFormat.PNG, 90, byteArrayOutputStream);
                this.d = byteArrayOutputStream.toByteArray();
                return;
            }
            this.e = (Parcelable) this.c;
        } else if (!z) {
            this.e = (Parcelable) this.c;
        } else {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
    }

    public int c() {
        if (this.b == -1 && VERSION.SDK_INT >= 23) {
            return a((Icon) this.c);
        }
        if (this.b == 2) {
            return this.f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public String d() {
        if (this.b == -1 && VERSION.SDK_INT >= 23) {
            return b((Icon) this.c);
        }
        if (this.b == 2) {
            return ((String) this.c).split(":", -1)[0];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResPackage() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public void e() {
        this.i = Mode.valueOf(this.j);
        int i2 = this.b;
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        this.c = this.d;
                        return;
                    } else if (i2 != 4) {
                        if (i2 != 5) {
                            return;
                        }
                    }
                }
                this.c = new String(this.d, Charset.forName("UTF-16"));
                return;
            }
            Parcelable parcelable = this.e;
            if (parcelable != null) {
                this.c = parcelable;
                return;
            }
            byte[] bArr = this.d;
            this.c = bArr;
            this.b = 3;
            this.f = 0;
            this.g = bArr.length;
            return;
        }
        Parcelable parcelable2 = this.e;
        if (parcelable2 != null) {
            this.c = parcelable2;
            return;
        }
        throw new IllegalArgumentException("Invalid icon");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != 5) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    public String toString() {
        if (this.b == -1) {
            return String.valueOf(this.c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(a(this.b));
        int i2 = this.b;
        if (i2 != 1) {
            if (i2 == 2) {
                sb.append(" pkg=");
                sb.append(d());
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(c())}));
            } else if (i2 == 3) {
                sb.append(" len=");
                sb.append(this.f);
                if (this.g != 0) {
                    sb.append(" off=");
                    sb.append(this.g);
                }
            } else if (i2 == 4) {
                sb.append(" uri=");
                sb.append(this.c);
            }
            if (this.h != null) {
                sb.append(" tint=");
                sb.append(this.h);
            }
            if (this.i != a) {
                sb.append(" mode=");
                sb.append(this.i);
            }
            sb.append(")");
            return sb.toString();
        }
        sb.append(" size=");
        sb.append(((Bitmap) this.c).getWidth());
        sb.append("x");
        sb.append(((Bitmap) this.c).getHeight());
        if (this.h != null) {
        }
        if (this.i != a) {
        }
        sb.append(")");
        return sb.toString();
    }

    private static int a(Icon icon) {
        String str = "Unable to get icon resource";
        String str2 = "IconCompat";
        if (VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e(str2, str, e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e(str2, str, e3);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e(str2, str, e4);
            return 0;
        }
    }
}
