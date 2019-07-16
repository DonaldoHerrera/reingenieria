package com.mattprecious.telescope;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;

public final class TelescopeFileProvider extends b {
    public static Uri a(Context context, File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".telescope.fileprovider");
        return b.a(context, sb.toString(), file);
    }

    public /* bridge */ /* synthetic */ void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
    }

    public /* bridge */ /* synthetic */ int delete(Uri uri, String str, String[] strArr) {
        return super.delete(uri, str, strArr);
    }

    public /* bridge */ /* synthetic */ String getType(Uri uri) {
        return super.getType(uri);
    }

    public /* bridge */ /* synthetic */ Uri insert(Uri uri, ContentValues contentValues) {
        super.insert(uri, contentValues);
        throw null;
    }

    public /* bridge */ /* synthetic */ boolean onCreate() {
        return super.onCreate();
    }

    public /* bridge */ /* synthetic */ ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return super.openFile(uri, str);
    }

    public /* bridge */ /* synthetic */ Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return super.query(uri, strArr, str, strArr2, str2);
    }

    public /* bridge */ /* synthetic */ int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        super.update(uri, contentValues, str, strArr);
        throw null;
    }
}
