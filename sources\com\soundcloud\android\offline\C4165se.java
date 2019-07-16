package com.soundcloud.android.offline;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@EVa(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 <2\u00020\u0001:\u0001<B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0010H\u0012J\r\u0010\"\u001a\u00020\fH\u0010¢\u0006\u0002\b#J\b\u0010$\u001a\u00020\u001eH\u0016J\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0010H\u0012J\u0010\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010(\u001a\u00020)H\u0012J\u0010\u0010,\u001a\u00020-2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u0016H\u0016J\u0010\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020)H\u0016J\u0010\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\u0016H\u0012J\b\u00104\u001a\u00020\u001eH\u0016J \u00105\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\u001eH\u0016J\b\u0010;\u001a\u00020\u001eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018¨\u0006="}, d2 = {"Lcom/soundcloud/android/offline/SecureFileStorage;", "", "cryptoOperations", "Lcom/soundcloud/android/crypto/CryptoOperations;", "settingsStorage", "Lcom/soundcloud/android/offline/OfflineSettingsStorage;", "context", "Landroid/content/Context;", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "(Lcom/soundcloud/android/crypto/CryptoOperations;Lcom/soundcloud/android/offline/OfflineSettingsStorage;Landroid/content/Context;Lcom/soundcloud/android/error/reporting/ErrorReporter;)V", "isEnoughMinimumSpace", "", "()Z", "isRunningEncryption", "offlineDir", "Ljava/io/File;", "getOfflineDir", "()Ljava/io/File;", "setOfflineDir", "(Ljava/io/File;)V", "storageAvailable", "", "getStorageAvailable", "()J", "storageCapacity", "getStorageCapacity", "storageUsed", "getStorageUsed", "closeAndDelete", "", "output", "Ljava/io/FileOutputStream;", "trackFile", "createDirectoryIfNeeded", "createDirectoryIfNeeded$offline_release", "deleteAllTracks", "deleteFile", "file", "deleteTrack", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "generateFileName", "", "getFileUriForOfflineTrack", "Landroid/net/Uri;", "isEnoughSpace", "sizeInBytes", "isTrackStored", "track", "isWithinStorageLimit", "dirSizeWithTrack", "reset", "storeTrack", "input", "Ljava/io/InputStream;", "listener", "Lcom/soundcloud/android/crypto/Encryptor$EncryptionProgressListener;", "tryCancelRunningEncryption", "updateOfflineDir", "Companion", "offline_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.offline.se reason: case insensitive filesystem */
/* compiled from: SecureFileStorage.kt */
public class C4165se {
    public static final a a = new a(null);
    private File b;
    private volatile boolean c;
    private final C3284tV d;
    private final C4088fe e;
    private final Context f;
    private final C3469VY g;

    /* renamed from: com.soundcloud.android.offline.se$a */
    /* compiled from: SecureFileStorage.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C4165se(C3284tV tVVar, C4088fe feVar, Context context, C3469VY vy) {
        C7471uYa.b(tVVar, "cryptoOperations");
        C7471uYa.b(feVar, "settingsStorage");
        C7471uYa.b(context, "context");
        C7471uYa.b(vy, "errorReporter");
        this.d = tVVar;
        this.e = feVar;
        this.f = context;
        this.g = vy;
        j();
    }

    private boolean b(File file) {
        return !file.exists() || file.delete();
    }

    public void a(File file) {
        this.b = file;
    }

    public File c() {
        return this.b;
    }

    public long d() {
        File c2 = c();
        if (c2 != null) {
            return C6698jGa.a(c2);
        }
        return 0;
    }

    public long e() {
        File c2 = c();
        if (c2 != null) {
            return C6698jGa.b(c2);
        }
        return 0;
    }

    public long f() {
        File c2 = c();
        if (c2 == null) {
            return 0;
        }
        return C6630iGa.a(c2);
    }

    public boolean g() {
        return a((long) 5242880);
    }

    public void h() {
        j();
    }

    public void i() {
        if (this.c) {
            this.d.a();
        }
    }

    public void j() {
        File file;
        String str = "offline";
        if (Oc.DEVICE_STORAGE == this.e.c()) {
            file = C6630iGa.a(this.f, str);
        } else {
            file = C6698jGa.a(this.f, str);
        }
        a(file);
    }

    private String d(C3508cda cda) throws C3364xV {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.a(cda));
        sb.append(".enc");
        return sb.toString();
    }

    public void a(C3508cda cda, InputStream inputStream, defpackage.C3404zV.a aVar) throws IOException, C3364xV {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(inputStream, "input");
        C7471uYa.b(aVar, CastExtraArgs.LISTENER);
        if (a()) {
            File file = new File(c(), d(cda));
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            this.c = true;
            try {
                this.d.a(inputStream, fileOutputStream, aVar);
                this.c = false;
                C6698jGa.a((Closeable) fileOutputStream);
            } catch (IOException e2) {
                a(fileOutputStream, file);
                throw e2;
            } catch (C3364xV e3) {
                a(fileOutputStream, file);
                throw e3;
            } catch (Throwable th) {
                this.c = false;
                C6698jGa.a((Closeable) fileOutputStream);
                throw th;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create directory for ");
            sb.append(c());
            throw new IOException(sb.toString());
        }
    }

    public Uri b(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        if (c() != null) {
            try {
                Uri fromFile = Uri.fromFile(new File(c(), d(cda)));
                C7471uYa.a((Object) fromFile, "Uri.fromFile(File(offlin…, generateFileName(urn)))");
                return fromFile;
            } catch (C3364xV e2) {
                defpackage.C3469VY.a.a(this.g, e2, null, 2, null);
            }
        }
        Uri uri = Uri.EMPTY;
        C7471uYa.a((Object) uri, "Uri.EMPTY");
        return uri;
    }

    public boolean c(C3508cda cda) {
        C7471uYa.b(cda, "track");
        if (c() == null) {
            return false;
        }
        File file = new File(c(), d(cda));
        if (!file.exists() || file.length() <= 0) {
            return false;
        }
        return true;
    }

    private boolean b(long j) {
        return !this.e.i() || this.e.e() >= j;
    }

    public void b() {
        File c2 = c();
        if (c2 != null) {
            C6630iGa.a(c2);
        }
    }

    private void a(FileOutputStream fileOutputStream, File file) {
        C6698jGa.a((Closeable) fileOutputStream);
        b(file);
    }

    public boolean a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        try {
            return c() != null && b(new File(c(), d(cda)));
        } catch (C3364xV e2) {
            defpackage.C3469VY.a.a(this.g, e2, null, 2, null);
            return false;
        }
    }

    public boolean a(long j) {
        long f2 = f() + j;
        long d2 = d();
        return d2 > 0 && d2 >= j && b(f2);
    }

    public boolean a() {
        File c2 = c();
        if (c2 != null) {
            return c2.exists() || C6630iGa.e(c2);
        }
        return false;
    }
}
