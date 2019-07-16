package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.play.core.splitcompat.c;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: xA reason: default package and case insensitive filesystem */
public final class C1833xA {
    private final c a;
    private final XA b;
    private final Context c;

    public C1833xA(Context context, c cVar, XA xa) {
        this.a = cVar;
        this.b = xa;
        this.c = context;
    }

    private static X509Certificate a(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e) {
            Log.e("SplitCompat", "Cannot decode certificate.", e);
            return null;
        }
    }

    private final boolean a(String str, List<X509Certificate> list) {
        boolean z;
        String str2 = " is not signed.";
        String str3 = "Downloaded split ";
        String str4 = "SplitCompat";
        try {
            X509Certificate[][] a2 = XA.a(str);
            if (a2 == null || a2.length == 0 || a2[0].length == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32);
                sb.append(str3);
                sb.append(str);
                sb.append(str2);
                Log.e(str4, sb.toString());
                return false;
            } else if (list.isEmpty()) {
                Log.e(str4, "No certificates found for app.");
                return false;
            } else {
                Iterator it = list.iterator();
                do {
                    z = true;
                    if (it.hasNext()) {
                        X509Certificate x509Certificate = (X509Certificate) it.next();
                        int length = a2.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                z = false;
                                continue;
                                break;
                            } else if (a2[i][0].equals(x509Certificate)) {
                                continue;
                                break;
                            } else {
                                i++;
                            }
                        }
                    } else {
                        return true;
                    }
                } while (z);
                Log.i(str4, "There's an app certificate that doesn't sign the split.");
                return false;
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32);
            sb2.append(str3);
            sb2.append(str);
            sb2.append(str2);
            Log.e(str4, sb2.toString(), e);
            return false;
        }
    }

    private final Signature[] b() {
        try {
            return this.c.getPackageManager().getPackageInfo(this.c.getPackageName(), 64).signatures;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    public final boolean a() {
        List list;
        String str = "SplitCompat";
        try {
            File c2 = this.a.c();
            Signature[] b2 = b();
            if (b2 == null) {
                list = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Signature a2 : b2) {
                    X509Certificate a3 = a(a2);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                list = arrayList;
            }
            if (list == null || list.isEmpty()) {
                Log.e(str, "No app certificates found.");
                return false;
            }
            File[] listFiles = c2.listFiles();
            Arrays.sort(listFiles);
            int length = listFiles.length - 1;
            while (length >= 0) {
                File file = listFiles[length];
                try {
                    if (!a(file.getAbsolutePath(), list)) {
                        Log.e(str, "Split verification failure.");
                        return false;
                    }
                    try {
                        file.renameTo(this.a.a(file));
                        length--;
                    } catch (IOException e) {
                        Log.e(str, "Cannot write verified split.", e);
                        return false;
                    }
                } catch (Exception e2) {
                    Log.e(str, "Split verification error.", e2);
                    return false;
                }
            }
            return true;
        } catch (IOException e3) {
            Log.e(str, "Cannot access directory for unverified splits.", e3);
            return false;
        }
    }

    public final boolean a(List<Intent> list) throws IOException {
        for (Intent stringExtra : list) {
            if (!this.a.b(stringExtra.getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }
}
