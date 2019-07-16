package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.content.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

final class ba {
    ba() {
    }

    private final aa c(Context context, String str) throws C2497d {
        try {
            aa d = d(context, str);
            if (d != null) {
                a(context, str, d);
                return d;
            }
            e = null;
            try {
                aa a = a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    a(context, str, a, false);
                    return a;
                }
            } catch (C2497d e) {
                e = e;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (C2497d e2) {
            e = e2;
        }
    }

    private final aa d(Context context, String str) throws C2497d {
        File e = e(context, str);
        if (!e.exists()) {
            return null;
        }
        try {
            return a(e);
        } catch (C2497d | IOException e2) {
            String str2 = "FirebaseInstanceId";
            if (Log.isLoggable(str2, 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
                Log.d(str2, sb.toString());
            }
            try {
                return a(e);
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                Log.w(str2, sb2.toString());
                throw new C2497d((Exception) e3);
            }
        }
    }

    private static File e(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(b(context), str2);
    }

    /* access modifiers changed from: 0000 */
    public final aa a(Context context, String str) throws C2497d {
        aa c = c(context, str);
        if (c != null) {
            return c;
        }
        return b(context, str);
    }

    /* access modifiers changed from: 0000 */
    public final aa b(Context context, String str) {
        aa aaVar = new aa(C2496c.a(), System.currentTimeMillis());
        aa a = a(context, str, aaVar, true);
        String str2 = "FirebaseInstanceId";
        if (a == null || a.equals(aaVar)) {
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Generated new key");
            }
            a(context, str, aaVar);
            return aaVar;
        }
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, "Loaded key after generating new one, using loaded one");
        }
        return a;
    }

    static void a(Context context) {
        File[] listFiles;
        for (File file : b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    private static KeyPair a(String str, String str2) throws C2497d {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new C2497d((Exception) e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C2497d((Exception) e2);
        }
    }

    private static File b(Context context) {
        File c = a.c(context);
        if (c != null && c.isDirectory()) {
            return c;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    private static long b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C2517y.a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0060=Splitter:B:19:0x0060, B:52:0x00ba=Splitter:B:52:0x00ba, B:31:0x009e=Splitter:B:31:0x009e} */
    private final aa a(Context context, String str, aa aaVar, boolean z) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        String str2 = "FirebaseInstanceId";
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, "Writing key to properties file");
        }
        Properties properties = new Properties();
        properties.setProperty("pub", aaVar.b());
        properties.setProperty("pri", aaVar.c());
        properties.setProperty("cre", String.valueOf(aaVar.b));
        File e = e(context, str);
        try {
            e.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(e, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    channel.lock();
                    if (z && channel.size() > 0) {
                        try {
                            channel.position(0);
                            aa a = a(channel);
                            if (channel != null) {
                                a((Throwable) null, channel);
                            }
                            a((Throwable) null, randomAccessFile);
                            return a;
                        } catch (C2497d | IOException e2) {
                            if (Log.isLoggable(str2, 3)) {
                                String valueOf = String.valueOf(e2);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
                                sb.append("Tried reading key pair before writing new one, but failed with: ");
                                sb.append(valueOf);
                                Log.d(str2, sb.toString());
                            }
                        }
                    }
                    channel.position(0);
                    properties.store(Channels.newOutputStream(channel), null);
                    if (channel != null) {
                        a((Throwable) null, channel);
                    }
                    a((Throwable) null, randomAccessFile);
                    return aaVar;
                } catch (Throwable th5) {
                    Throwable th6 = th5;
                    th3 = r12;
                    th4 = th6;
                }
                a(th, randomAccessFile);
                throw th2;
                if (channel != null) {
                    a(th3, channel);
                }
                throw th4;
            } catch (Throwable th7) {
                Throwable th8 = th7;
                th = r10;
                th2 = th8;
            }
        } catch (IOException e3) {
            String valueOf2 = String.valueOf(e3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
            sb2.append("Failed to write key: ");
            sb2.append(valueOf2);
            Log.w(str2, sb2.toString());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        a(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
        throw r1;
     */
    private final aa a(File file) throws C2497d, IOException {
        Throwable th;
        Throwable th2;
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel channel = fileInputStream.getChannel();
        try {
            channel.lock(0, Long.MAX_VALUE, true);
            aa a = a(channel);
            if (channel != null) {
                a((Throwable) null, channel);
            }
            a((Throwable) null, fileInputStream);
            return a;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            th = r1;
            th2 = th4;
        }
        if (channel != null) {
            a(th, channel);
        }
        throw th2;
    }

    private static aa a(FileChannel fileChannel) throws C2497d, IOException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new C2497d("Invalid properties file");
        }
        try {
            return new aa(a(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new C2497d((Exception) e);
        }
    }

    private static aa a(SharedPreferences sharedPreferences, String str) throws C2497d {
        String string = sharedPreferences.getString(C2517y.a(str, "|P|"), null);
        String string2 = sharedPreferences.getString(C2517y.a(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new aa(a(string, string2), b(sharedPreferences, str));
    }

    private final void a(Context context, String str, aa aaVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (aaVar.equals(a(sharedPreferences, str))) {
                return;
            }
        } catch (C2497d unused) {
        }
        String str2 = "FirebaseInstanceId";
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, "Writing key to shared preferences");
        }
        Editor edit = sharedPreferences.edit();
        edit.putString(C2517y.a(str, "|P|"), aaVar.b());
        edit.putString(C2517y.a(str, "|K|"), aaVar.c());
        edit.putString(C2517y.a(str, "cre"), String.valueOf(aaVar.b));
        edit.commit();
    }

    private static /* synthetic */ void a(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                Ps.a(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    private static /* synthetic */ void a(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                Ps.a(th, th2);
            }
        } else {
            randomAccessFile.close();
        }
    }

    private static /* synthetic */ void a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                Ps.a(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }
}
