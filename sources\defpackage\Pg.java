package defpackage;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: Pg reason: default package */
public class Pg {
    private static final String a = Hg.a(Pg.class);

    public static String a(File file, String str) {
        if (file == null) {
            Hg.e(a, "Internal cache directory is null. No local URL will be created.");
            return null;
        } else if (Ng.d(str)) {
            Hg.e(a, "Remote zip url is null or empty. No local URL will be created.");
            return null;
        } else {
            String absolutePath = file.getAbsolutePath();
            String valueOf = String.valueOf(Kg.a());
            StringBuilder sb = new StringBuilder();
            sb.append(absolutePath);
            sb.append("/");
            sb.append(valueOf);
            String sb2 = sb.toString();
            String str2 = a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Starting download of url: ");
            sb3.append(str);
            Hg.a(str2, sb3.toString());
            File a2 = Fg.a(sb2, str, valueOf, ".zip");
            if (a2 == null) {
                Hg.a(a, "Could not download zip file to local storage.");
                Fg.a(new File(sb2));
                return null;
            }
            Hg.a(a, "Html content zip downloaded.");
            if (!a(sb2, a2)) {
                Hg.e(a, "Error during the zip unpack.");
                Fg.a(new File(sb2));
                return null;
            }
            Hg.a(a, "Html content zip unpacked.");
            return sb2;
        }
    }

    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v8, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r4v16, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: type inference failed for: r1v25 */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r1v27 */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r1v37 */
    /* JADX WARNING: type inference failed for: r1v38 */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: type inference failed for: r1v40 */
    /* JADX WARNING: type inference failed for: r1v41 */
    /* JADX WARNING: type inference failed for: r1v42 */
    /* JADX WARNING: type inference failed for: r1v43 */
    /* JADX WARNING: type inference failed for: r1v44 */
    /* JADX WARNING: type inference failed for: r1v45 */
    /* JADX WARNING: type inference failed for: r1v46 */
    /* JADX WARNING: type inference failed for: r1v47 */
    /* JADX WARNING: type inference failed for: r1v48 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v1
  assigns: []
  uses: []
  mth insns count: 174
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0123 A[Catch:{ IOException -> 0x011f }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca A[SYNTHETIC, Splitter:B:59:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d2 A[Catch:{ IOException -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e7 A[SYNTHETIC, Splitter:B:72:0x00e7] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ef A[Catch:{ IOException -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0104 A[SYNTHETIC, Splitter:B:85:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010c A[Catch:{ IOException -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011b A[SYNTHETIC, Splitter:B:97:0x011b] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:56:0x00c1=Splitter:B:56:0x00c1, B:82:0x00fb=Splitter:B:82:0x00fb, B:69:0x00de=Splitter:B:69:0x00de} */
    /* JADX WARNING: Unknown variable types count: 27 */
    static boolean a(String str, File file) {
        ? r3;
        ? r1;
        ? r4;
        ? r32;
        ? r42;
        ? r12;
        ? r43;
        ? r13;
        ? r44;
        ? r14;
        ? r45;
        ? r15;
        ? r46;
        ? r16;
        ? r17;
        ? r47;
        ? r18;
        ? r19;
        ? r48;
        ? r110;
        ? r111;
        ? r112;
        ? r113;
        String str2 = "IOException during closing of zip file unpacking streams.";
        if (Ng.d(str)) {
            Hg.c(a, "Unpack directory null or blank. Zip file not unpacked.");
            return false;
        } else if (file == null) {
            Hg.c(a, "Zip file is null. Zip file not unpacked.");
            return false;
        } else {
            new File(str).mkdirs();
            ? r114 = 0;
            try {
                ? zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
                try {
                    r17 = r114;
                    r19 = r114;
                    r111 = r114;
                    r112 = r114;
                    byte[] bArr = new byte[8192];
                    ? r115 = r114;
                    while (true) {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            r17 = r115;
                            r19 = r115;
                            r111 = r115;
                            r112 = r115;
                            break;
                        }
                        String name = nextEntry.getName();
                        if (name.toLowerCase(Locale.US).startsWith("__macosx")) {
                            r113 = r115;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append("/");
                            sb.append(name);
                            String sb2 = sb.toString();
                            if (nextEntry.isDirectory()) {
                                new File(sb2).mkdirs();
                                r113 = r115;
                            } else {
                                ? bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(sb2));
                                while (true) {
                                    try {
                                        int read = zipInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        bufferedOutputStream.write(bArr, 0, read);
                                    } catch (FileNotFoundException e) {
                                        e = e;
                                        r46 = bufferedOutputStream;
                                        r16 = zipInputStream;
                                        r43 = r46;
                                        r42 = r43;
                                        r12 = r13;
                                        Hg.b(a, "FileNotFoundException during unpack of zip file.", e);
                                        r42 = r43;
                                        r12 = r13;
                                        if (r13 != 0) {
                                            try {
                                                r13.close();
                                            } catch (IOException e2) {
                                                Hg.b(a, str2, e2);
                                                return false;
                                            }
                                        }
                                        if (r43 != 0) {
                                            r43.close();
                                        }
                                        return false;
                                    } catch (IOException e3) {
                                        e = e3;
                                        r47 = bufferedOutputStream;
                                        r18 = zipInputStream;
                                        r44 = r47;
                                        r42 = r44;
                                        r12 = r14;
                                        Hg.b(a, "IOException during unpack of zip file.", e);
                                        r42 = r44;
                                        r12 = r14;
                                        if (r14 != 0) {
                                            try {
                                                r14.close();
                                            } catch (IOException e4) {
                                                Hg.b(a, str2, e4);
                                                return false;
                                            }
                                        }
                                        if (r44 != 0) {
                                            r44.close();
                                        }
                                        return false;
                                    } catch (Exception e5) {
                                        e = e5;
                                        r48 = bufferedOutputStream;
                                        r110 = zipInputStream;
                                        r45 = r48;
                                        try {
                                            r42 = r45;
                                            r12 = r15;
                                            Hg.b(a, "Exception during unpack of zip file.", e);
                                            r42 = r45;
                                            r12 = r15;
                                            if (r15 != 0) {
                                                try {
                                                    r15.close();
                                                } catch (IOException e6) {
                                                    Hg.b(a, str2, e6);
                                                    return false;
                                                }
                                            }
                                            if (r45 != 0) {
                                                r45.close();
                                            }
                                            return false;
                                        } catch (Throwable th) {
                                            th = th;
                                            r32 = r12;
                                            r4 = r42;
                                            r1 = r4;
                                            r3 = r32;
                                            if (r3 != 0) {
                                            }
                                            if (r1 != 0) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r32 = zipInputStream;
                                        r4 = bufferedOutputStream;
                                        r1 = r4;
                                        r3 = r32;
                                        if (r3 != 0) {
                                            try {
                                                r3.close();
                                            } catch (IOException e7) {
                                                Hg.b(a, str2, e7);
                                                throw th;
                                            }
                                        }
                                        if (r1 != 0) {
                                            r1.close();
                                        }
                                        throw th;
                                    }
                                }
                                bufferedOutputStream.close();
                                zipInputStream.closeEntry();
                                r113 = bufferedOutputStream;
                            }
                        }
                        r115 = r113;
                    }
                    zipInputStream.close();
                    r17 = r115;
                    r19 = r115;
                    r111 = r115;
                    r112 = r115;
                    try {
                        zipInputStream.close();
                        if (r115 != 0) {
                            r115.close();
                        }
                    } catch (IOException e8) {
                        Hg.b(a, str2, e8);
                    }
                    return true;
                } catch (FileNotFoundException e9) {
                    e = e9;
                    r46 = r17;
                    r16 = zipInputStream;
                    r43 = r46;
                    r42 = r43;
                    r12 = r13;
                    Hg.b(a, "FileNotFoundException during unpack of zip file.", e);
                    r42 = r43;
                    r12 = r13;
                    if (r13 != 0) {
                    }
                    if (r43 != 0) {
                    }
                    return false;
                } catch (IOException e10) {
                    e = e10;
                    r47 = r19;
                    r18 = zipInputStream;
                    r44 = r47;
                    r42 = r44;
                    r12 = r14;
                    Hg.b(a, "IOException during unpack of zip file.", e);
                    r42 = r44;
                    r12 = r14;
                    if (r14 != 0) {
                    }
                    if (r44 != 0) {
                    }
                    return false;
                } catch (Exception e11) {
                    e = e11;
                    r48 = r111;
                    r110 = zipInputStream;
                    r45 = r48;
                    r42 = r45;
                    r12 = r15;
                    Hg.b(a, "Exception during unpack of zip file.", e);
                    r42 = r45;
                    r12 = r15;
                    if (r15 != 0) {
                    }
                    if (r45 != 0) {
                    }
                    return false;
                } catch (Throwable th3) {
                    th = th3;
                    r3 = zipInputStream;
                    r1 = r112;
                    if (r3 != 0) {
                    }
                    if (r1 != 0) {
                    }
                    throw th;
                }
            } catch (FileNotFoundException e12) {
                e = e12;
                r43 = 0;
                r16 = r114;
                r42 = r43;
                r12 = r13;
                Hg.b(a, "FileNotFoundException during unpack of zip file.", e);
                r42 = r43;
                r12 = r13;
                if (r13 != 0) {
                }
                if (r43 != 0) {
                }
                return false;
            } catch (IOException e13) {
                e = e13;
                r44 = 0;
                r18 = r114;
                r42 = r44;
                r12 = r14;
                Hg.b(a, "IOException during unpack of zip file.", e);
                r42 = r44;
                r12 = r14;
                if (r14 != 0) {
                }
                if (r44 != 0) {
                }
                return false;
            } catch (Exception e14) {
                e = e14;
                r45 = 0;
                r110 = r114;
                r42 = r45;
                r12 = r15;
                Hg.b(a, "Exception during unpack of zip file.", e);
                r42 = r45;
                r12 = r15;
                if (r15 != 0) {
                }
                if (r45 != 0) {
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                r3 = 0;
                r1 = r114;
                if (r3 != 0) {
                }
                if (r1 != 0) {
                }
                throw th;
            }
        }
    }

    public static File a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        sb.append("/");
        sb.append("appboy-html-inapp-messages");
        return new File(sb.toString());
    }
}
