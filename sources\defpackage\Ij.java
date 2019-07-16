package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: Ij reason: default package */
/* compiled from: PersistableBundleCompat */
public final class Ij {
    private static final Dj a = new Dj("PersistableBundleCompat");
    private final Map<String, Object> b;

    public Ij() {
        this((Map<String, Object>) new HashMap<String,Object>());
    }

    public String a() {
        String str = "";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Jj.a((Map) this.b, (OutputStream) byteArrayOutputStream);
            return byteArrayOutputStream.toString("UTF-8");
        } catch (IOException | XmlPullParserException e) {
            a.a(e);
            return str;
        } catch (Error e2) {
            a.a((Throwable) e2);
            return str;
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public Ij(Ij ij) {
        this((Map<String, Object>) new HashMap<String,Object>(ij.b));
    }

    private Ij(Map<String, Object> map) {
        this.b = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[SYNTHETIC, Splitter:B:20:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046 A[SYNTHETIC, Splitter:B:28:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004c A[SYNTHETIC, Splitter:B:33:0x004c] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0027=Splitter:B:17:0x0027, B:25:0x003a=Splitter:B:25:0x003a} */
    public static Ij a(String str) {
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(str.getBytes("UTF-8"));
            try {
                Ij ij = new Ij((Map<String, Object>) Jj.a(byteArrayInputStream2));
                try {
                    byteArrayInputStream2.close();
                } catch (IOException unused) {
                }
                return ij;
            } catch (IOException | XmlPullParserException e) {
                e = e;
                byteArrayInputStream = byteArrayInputStream2;
                a.a(e);
                Ij ij2 = new Ij();
                if (byteArrayInputStream != null) {
                }
                return ij2;
            } catch (VerifyError e2) {
                e = e2;
                byteArrayInputStream = byteArrayInputStream2;
                try {
                    a.a((Throwable) e);
                    Ij ij3 = new Ij();
                    if (byteArrayInputStream != null) {
                    }
                    return ij3;
                } catch (Throwable th) {
                    th = th;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayInputStream = byteArrayInputStream2;
                if (byteArrayInputStream != null) {
                }
                throw th;
            }
        } catch (IOException | XmlPullParserException e3) {
            e = e3;
            a.a(e);
            Ij ij22 = new Ij();
            if (byteArrayInputStream != null) {
                try {
                    byteArrayInputStream.close();
                } catch (IOException unused3) {
                }
            }
            return ij22;
        } catch (VerifyError e4) {
            e = e4;
            a.a((Throwable) e);
            Ij ij32 = new Ij();
            if (byteArrayInputStream != null) {
                try {
                    byteArrayInputStream.close();
                } catch (IOException unused4) {
                }
            }
            return ij32;
        }
    }
}
