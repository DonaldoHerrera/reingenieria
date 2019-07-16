package defpackage;

import android.content.Context;
import android.util.Log;
import com.facebook.B;
import com.facebook.internal.ia;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

/* renamed from: ck reason: default package and case insensitive filesystem */
/* compiled from: AppEventStore */
class C0526ck {
    private static final String a = "ck";

    /* renamed from: ck$a */
    /* compiled from: AppEventStore */
    private static class a extends ObjectInputStream {
        public a(InputStream inputStream) throws IOException {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(a.class);
            }
            return readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1") ? ObjectStreamClass.lookup(a.class) : readClassDescriptor;
        }
    }

    C0526ck() {
    }

    public static synchronized void a(Qj qj, C1545nk nkVar) {
        synchronized (C0526ck.class) {
            Qk.b();
            C1514mk a2 = a();
            if (a2.a(qj)) {
                a2.b(qj).addAll(nkVar.b());
            } else {
                a2.a(qj, nkVar.b());
            }
            a(a2);
        }
    }

    public static synchronized void a(Vj vj) {
        synchronized (C0526ck.class) {
            Qk.b();
            C1514mk a2 = a();
            for (Qj qj : vj.b()) {
                a2.a(qj, vj.a(qj).b());
            }
            a(a2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8, types: [java.io.Closeable, java.io.ObjectInputStream, ck$a] */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008a A[Catch:{ Exception -> 0x002e }] */
    /* JADX WARNING: Unknown variable types count: 5 */
    public static synchronized C1514mk a() {
        C1514mk mkVar;
        C1514mk mkVar2;
        ? r4;
        String str;
        String str2;
        Throwable th;
        ? r2;
        ? r42;
        synchronized (C0526ck.class) {
            Qk.b();
            Context e = B.e();
            ? r22 = 0;
            try {
                ? aVar = new a(new BufferedInputStream(e.openFileInput("AppEventsLogger.persistedevents")));
                try {
                    C1514mk mkVar3 = (C1514mk) aVar.readObject();
                    ia.a((Closeable) aVar);
                    try {
                        e.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e2) {
                        Log.w(a, "Got unexpected exception when removing events file: ", e2);
                    }
                    mkVar2 = mkVar3;
                } catch (FileNotFoundException unused) {
                    r4 = aVar;
                    ia.a((Closeable) r4);
                    try {
                        e.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        mkVar2 = r22;
                    } catch (Exception e3) {
                        e = e3;
                        str = a;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                        mkVar2 = r22;
                        if (mkVar == 0) {
                        }
                        return mkVar;
                    }
                    if (mkVar == 0) {
                    }
                    return mkVar;
                } catch (Exception e4) {
                    e = e4;
                    r42 = aVar;
                    try {
                        Log.w(a, "Got unexpected exception while reading events: ", e);
                        ia.a((Closeable) r42);
                        if (mkVar == 0) {
                        }
                        return mkVar;
                    } catch (Throwable th2) {
                        th = th2;
                        r2 = r42;
                        ia.a((Closeable) r2);
                        try {
                            e.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e5) {
                            Log.w(a, "Got unexpected exception when removing events file: ", e5);
                        }
                        throw th;
                    }
                    try {
                        e.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        mkVar2 = r22;
                    } catch (Exception e6) {
                        e = e6;
                        str = a;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                        mkVar2 = r22;
                        if (mkVar == 0) {
                        }
                        return mkVar;
                    }
                }
            } catch (FileNotFoundException unused2) {
                r4 = 0;
                ia.a((Closeable) r4);
                e.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                mkVar2 = r22;
                if (mkVar == 0) {
                }
                return mkVar;
            } catch (Exception e7) {
                e = e7;
                r42 = 0;
                Log.w(a, "Got unexpected exception while reading events: ", e);
                ia.a((Closeable) r42);
                e.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                mkVar2 = r22;
                if (mkVar == 0) {
                }
                return mkVar;
            } catch (Throwable th3) {
                th = th3;
                r2 = r22;
                ia.a((Closeable) r2);
                e.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                throw th;
            }
            if (mkVar == 0) {
                mkVar = new C1514mk();
            }
        }
        return mkVar;
    }

    private static void a(C1514mk mkVar) {
        String str = "AppEventsLogger.persistedevents";
        Context e = B.e();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(e.openFileOutput(str, 0)));
            try {
                objectOutputStream2.writeObject(mkVar);
                ia.a((Closeable) objectOutputStream2);
            } catch (Exception e2) {
                e = e2;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(a, "Got unexpected exception while persisting events: ", e);
                    try {
                        e.getFileStreamPath(str).delete();
                    } catch (Exception unused) {
                    }
                    ia.a((Closeable) objectOutputStream);
                } catch (Throwable th) {
                    th = th;
                    ia.a((Closeable) objectOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                ia.a((Closeable) objectOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            Log.w(a, "Got unexpected exception while persisting events: ", e);
            e.getFileStreamPath(str).delete();
            ia.a((Closeable) objectOutputStream);
        }
    }
}
