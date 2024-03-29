package com.facebook.stetho.inspector.database;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver.ExecuteResultHandler;
import com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse;
import com.facebook.stetho.inspector.protocol.module.DatabaseDescriptor;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SqliteDatabaseDriver extends DatabaseDriver2<SqliteDatabaseDescriptor> {
    private static final String[] UNINTERESTING_FILENAME_SUFFIXES = {"-journal", "-shm", "-uid", "-wal"};
    private final DatabaseConnectionProvider mDatabaseConnectionProvider;
    private final DatabaseFilesProvider mDatabaseFilesProvider;

    static class SqliteDatabaseDescriptor implements DatabaseDescriptor {
        public final File file;

        public SqliteDatabaseDescriptor(File file2) {
            this.file = file2;
        }

        public String name() {
            return this.file.getName();
        }
    }

    @Deprecated
    public SqliteDatabaseDriver(Context context) {
        this(context, new DefaultDatabaseFilesProvider(context), new DefaultDatabaseConnectionProvider());
    }

    private <T> T executeInsert(SQLiteDatabase sQLiteDatabase, String str, ExecuteResultHandler<T> executeResultHandler) {
        return executeResultHandler.handleInsert(sQLiteDatabase.compileStatement(str).executeInsert());
    }

    private <T> T executeRawQuery(SQLiteDatabase sQLiteDatabase, String str, ExecuteResultHandler<T> executeResultHandler) {
        sQLiteDatabase.execSQL(str);
        return executeResultHandler.handleRawQuery();
    }

    private <T> T executeSelect(SQLiteDatabase sQLiteDatabase, String str, ExecuteResultHandler<T> executeResultHandler) {
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, null);
        try {
            return executeResultHandler.handleSelect(rawQuery);
        } finally {
            rawQuery.close();
        }
    }

    @TargetApi(11)
    private <T> T executeUpdateDelete(SQLiteDatabase sQLiteDatabase, String str, ExecuteResultHandler<T> executeResultHandler) {
        return executeResultHandler.handleUpdateDelete(sQLiteDatabase.compileStatement(str).executeUpdateDelete());
    }

    private static String getFirstWord(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(32);
        return indexOf >= 0 ? trim.substring(0, indexOf) : trim;
    }

    private SQLiteDatabase openDatabase(SqliteDatabaseDescriptor sqliteDatabaseDescriptor) throws SQLiteException {
        Util.throwIfNull(sqliteDatabaseDescriptor);
        return this.mDatabaseConnectionProvider.openDatabase(sqliteDatabaseDescriptor.file);
    }

    private static String removeSuffix(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.endsWith(str2)) {
                return str.substring(0, str.length() - str2.length());
            }
        }
        return str;
    }

    static List<File> tidyDatabaseList(List<File> list) {
        HashSet hashSet = new HashSet(list);
        ArrayList arrayList = new ArrayList();
        for (File file : list) {
            String path = file.getPath();
            String removeSuffix = removeSuffix(path, UNINTERESTING_FILENAME_SUFFIXES);
            if (removeSuffix.equals(path) || !hashSet.contains(new File(removeSuffix))) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public List<SqliteDatabaseDescriptor> getDatabaseNames() {
        ArrayList arrayList = new ArrayList();
        List databaseFiles = this.mDatabaseFilesProvider.getDatabaseFiles();
        Collections.sort(databaseFiles);
        for (File sqliteDatabaseDescriptor : tidyDatabaseList(databaseFiles)) {
            arrayList.add(new SqliteDatabaseDescriptor(sqliteDatabaseDescriptor));
        }
        return arrayList;
    }

    @Deprecated
    public SqliteDatabaseDriver(Context context, DatabaseFilesProvider databaseFilesProvider) {
        this(context, databaseFilesProvider, new DefaultDatabaseConnectionProvider());
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0071=Splitter:B:32:0x0071, B:40:0x0085=Splitter:B:40:0x0085} */
    public ExecuteSQLResponse executeSQL(SqliteDatabaseDescriptor sqliteDatabaseDescriptor, String str, ExecuteResultHandler<ExecuteSQLResponse> executeResultHandler) throws SQLiteException {
        Util.throwIfNull(str);
        Util.throwIfNull(executeResultHandler);
        SQLiteDatabase openDatabase = openDatabase(sqliteDatabaseDescriptor);
        try {
            String upperCase = getFirstWord(str).toUpperCase();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -2130463047:
                    if (upperCase.equals("INSERT")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1926899396:
                    if (upperCase.equals("PRAGMA")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1852692228:
                    if (upperCase.equals("SELECT")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1785516855:
                    if (upperCase.equals("UPDATE")) {
                        c = 0;
                        break;
                    }
                    break;
                case -591179561:
                    if (upperCase.equals("EXPLAIN")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0 || c == 1) {
                ExecuteSQLResponse executeSQLResponse = (ExecuteSQLResponse) executeUpdateDelete(openDatabase, str, executeResultHandler);
                openDatabase.close();
                return executeSQLResponse;
            } else if (c == 2) {
                ExecuteSQLResponse executeSQLResponse2 = (ExecuteSQLResponse) executeInsert(openDatabase, str, executeResultHandler);
                openDatabase.close();
                return executeSQLResponse2;
            } else if (c != 3 && c != 4 && c != 5) {
                return (ExecuteSQLResponse) executeRawQuery(openDatabase, str, executeResultHandler);
            } else {
                ExecuteSQLResponse executeSQLResponse3 = (ExecuteSQLResponse) executeSelect(openDatabase, str, executeResultHandler);
                openDatabase.close();
                return executeSQLResponse3;
            }
        } finally {
            openDatabase.close();
        }
    }

    public List<String> getTableNames(SqliteDatabaseDescriptor sqliteDatabaseDescriptor) throws SQLiteException {
        Cursor rawQuery;
        SQLiteDatabase openDatabase = openDatabase(sqliteDatabaseDescriptor);
        try {
            rawQuery = openDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type IN (?, ?)", new String[]{"table", "view"});
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getString(0));
            }
            rawQuery.close();
            openDatabase.close();
            return arrayList;
        } catch (Throwable th) {
            openDatabase.close();
            throw th;
        }
    }

    public SqliteDatabaseDriver(Context context, DatabaseFilesProvider databaseFilesProvider, DatabaseConnectionProvider databaseConnectionProvider) {
        super(context);
        this.mDatabaseFilesProvider = databaseFilesProvider;
        this.mDatabaseConnectionProvider = databaseConnectionProvider;
    }
}
