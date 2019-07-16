package com.facebook.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;

/* compiled from: NativeAppCallAttachmentStore */
public final class X {
    private static File a;

    public static File a(UUID uuid, String str) throws FileNotFoundException {
        if (ia.b(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return a(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    static File a(UUID uuid, boolean z) {
        File file = a;
        if (file == null) {
            return null;
        }
        File file2 = new File(file, uuid.toString());
        if (z && !file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    static File a(UUID uuid, String str, boolean z) throws IOException {
        File a2 = a(uuid, z);
        if (a2 == null) {
            return null;
        }
        try {
            return new File(a2, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
