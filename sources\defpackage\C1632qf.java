package defpackage;

import android.net.Uri;
import androidx.work.d;
import androidx.work.j;
import androidx.work.q.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: qf reason: default package and case insensitive filesystem */
/* compiled from: WorkTypeConverters */
public class C1632qf {
    public static int a(a aVar) {
        switch (C1602pf.a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Could not convert ");
                sb.append(aVar);
                sb.append(" to int");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public static j b(int i) {
        if (i == 0) {
            return j.NOT_REQUIRED;
        }
        if (i == 1) {
            return j.CONNECTED;
        }
        if (i == 2) {
            return j.UNMETERED;
        }
        if (i == 3) {
            return j.NOT_ROAMING;
        }
        if (i == 4) {
            return j.METERED;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not convert ");
        sb.append(i);
        sb.append(" to NetworkType");
        throw new IllegalArgumentException(sb.toString());
    }

    public static a c(int i) {
        if (i == 0) {
            return a.ENQUEUED;
        }
        if (i == 1) {
            return a.RUNNING;
        }
        if (i == 2) {
            return a.SUCCEEDED;
        }
        if (i == 3) {
            return a.FAILED;
        }
        if (i == 4) {
            return a.BLOCKED;
        }
        if (i == 5) {
            return a.CANCELLED;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not convert ");
        sb.append(i);
        sb.append(" to State");
        throw new IllegalArgumentException(sb.toString());
    }

    public static int a(androidx.work.a aVar) {
        int i = C1602pf.b[aVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not convert ");
        sb.append(aVar);
        sb.append(" to int");
        throw new IllegalArgumentException(sb.toString());
    }

    public static androidx.work.a a(int i) {
        if (i == 0) {
            return androidx.work.a.EXPONENTIAL;
        }
        if (i == 1) {
            return androidx.work.a.LINEAR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not convert ");
        sb.append(i);
        sb.append(" to BackoffPolicy");
        throw new IllegalArgumentException(sb.toString());
    }

    public static int a(j jVar) {
        int i = C1602pf.c[jVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not convert ");
        sb.append(jVar);
        sb.append(" to int");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a A[SYNTHETIC, Splitter:B:26:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071 A[SYNTHETIC, Splitter:B:37:0x0071] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0062=Splitter:B:30:0x0062, B:15:0x0048=Splitter:B:15:0x0048} */
    public static byte[] a(d dVar) {
        ObjectOutputStream objectOutputStream = null;
        if (dVar.b() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream2.writeInt(dVar.b());
                for (d.a aVar : dVar.a()) {
                    objectOutputStream2.writeUTF(aVar.a().toString());
                    objectOutputStream2.writeBoolean(aVar.b());
                }
                try {
                    objectOutputStream2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (IOException e3) {
                e = e3;
                objectOutputStream = objectOutputStream2;
                try {
                    e.printStackTrace();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream2 = objectOutputStream;
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (objectOutputStream2 != null) {
                }
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            e.printStackTrace();
            if (objectOutputStream != null) {
            }
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A[SYNTHETIC, Splitter:B:25:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a A[SYNTHETIC, Splitter:B:36:0x005a] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0033=Splitter:B:15:0x0033, B:29:0x004e=Splitter:B:29:0x004e} */
    public static d a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        IOException e;
        d dVar = new d();
        if (bArr == null) {
            return dVar;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                    dVar.a(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean());
                }
                try {
                    objectInputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                try {
                    byteArrayInputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (IOException e4) {
                e = e4;
                try {
                    e.printStackTrace();
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    byteArrayInputStream.close();
                    return dVar;
                } catch (Throwable th) {
                    th = th;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    throw th;
                }
            }
        } catch (IOException e8) {
            IOException iOException = e8;
            objectInputStream = null;
            e = iOException;
            e.printStackTrace();
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return dVar;
        } catch (Throwable th2) {
            objectInputStream = null;
            th = th2;
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            throw th;
        }
        return dVar;
    }
}
