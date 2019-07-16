package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import com.squareup.picasso.E.d;
import com.squareup.picasso.M.a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.m reason: case insensitive filesystem */
/* compiled from: ContactsPhotoRequestHandler */
class C6248m extends M {
    private static final UriMatcher a = new UriMatcher(-1);
    private final Context b;

    static {
        String str = "com.android.contacts";
        a.addURI(str, "contacts/lookup/*/#", 1);
        a.addURI(str, "contacts/lookup/*", 1);
        a.addURI(str, "contacts/#/photo", 2);
        a.addURI(str, "contacts/#", 3);
        a.addURI(str, "display_photo/#", 4);
    }

    C6248m(Context context) {
        this.b = context;
    }

    private InputStream c(K k) throws IOException {
        ContentResolver contentResolver = this.b.getContentResolver();
        Uri uri = k.e;
        int match = a.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid uri: ");
                        sb.append(uri);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    public boolean a(K k) {
        Uri uri = k.e;
        return "content".equals(uri.getScheme()) && Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && a.match(k.e) != -1;
    }

    public a a(K k, int i) throws IOException {
        InputStream c = c(k);
        if (c == null) {
            return null;
        }
        return new a(C7720yAb.a(c), d.DISK);
    }
}
