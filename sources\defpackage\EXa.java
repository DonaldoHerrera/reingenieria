package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;

@EVa(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00128\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bJ \u0010\f\u001a\u00020\u00002\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\rJ\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R@\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", "direction", "Lkotlin/io/FileWalkDirection;", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "onEnter", "Lkotlin/Function1;", "", "onLeave", "", "onFail", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "f", "Ljava/io/IOException;", "e", "maxDepth", "", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "iterator", "", "depth", "function", "DirectoryState", "FileTreeWalkIterator", "WalkState", "kotlin-stdlib"}, mv = {1, 1, 15})
/* renamed from: EXa reason: default package */
/* compiled from: FileTreeWalk.kt */
public final class EXa implements Iwb<File> {
    /* access modifiers changed from: private */
    public final File a;
    /* access modifiers changed from: private */
    public final GXa b;
    /* access modifiers changed from: private */
    public final _Xa<File, Boolean> c;
    /* access modifiers changed from: private */
    public final _Xa<File, RVa> d;
    /* access modifiers changed from: private */
    public final C6308dYa<File, IOException, RVa> e;
    /* access modifiers changed from: private */
    public final int f;

    /* renamed from: EXa$a */
    /* compiled from: FileTreeWalk.kt */
    private static abstract class a extends c {
        public a(File file) {
            C7471uYa.b(file, "rootDir");
            super(file);
            if (TVa.a) {
                boolean isDirectory = file.isDirectory();
                if (TVa.a && !isDirectory) {
                    throw new AssertionError("rootDir must be verified to be directory beforehand.");
                }
            }
        }
    }

    @EVa(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk;)V", "state", "Ljava/util/ArrayDeque;", "Lkotlin/io/FileTreeWalk$WalkState;", "computeNext", "", "directoryState", "Lkotlin/io/FileTreeWalk$DirectoryState;", "root", "gotoNext", "BottomUpDirectoryState", "SingleFileState", "TopDownDirectoryState", "kotlin-stdlib"}, mv = {1, 1, 15})
    /* renamed from: EXa$b */
    /* compiled from: FileTreeWalk.kt */
    private final class b extends XVa<File> {
        private final ArrayDeque<c> c = new ArrayDeque<>();

        /* renamed from: EXa$b$a */
        /* compiled from: FileTreeWalk.kt */
        private final class a extends a {
            private boolean b;
            private File[] c;
            private int d;
            private boolean e;
            final /* synthetic */ b f;

            public a(b bVar, File file) {
                C7471uYa.b(file, "rootDir");
                this.f = bVar;
                super(file);
            }

            public File b() {
                if (!this.e && this.c == null) {
                    _Xa c2 = EXa.this.c;
                    if (c2 != null && !((Boolean) c2.invoke(a())).booleanValue()) {
                        return null;
                    }
                    this.c = a().listFiles();
                    if (this.c == null) {
                        C6308dYa d2 = EXa.this.e;
                        if (d2 != null) {
                            File a = a();
                            C7815zXa zxa = new C7815zXa(a(), null, "Cannot list files in a directory", 2, null);
                            RVa rVa = (RVa) d2.invoke(a, zxa);
                        }
                        this.e = true;
                    }
                }
                File[] fileArr = this.c;
                if (fileArr != null) {
                    int i = this.d;
                    if (fileArr == null) {
                        C7471uYa.a();
                        throw null;
                    } else if (i < fileArr.length) {
                        if (fileArr != null) {
                            this.d = i + 1;
                            return fileArr[i];
                        }
                        C7471uYa.a();
                        throw null;
                    }
                }
                if (!this.b) {
                    this.b = true;
                    return a();
                }
                _Xa e2 = EXa.this.d;
                if (e2 != null) {
                    RVa rVa2 = (RVa) e2.invoke(a());
                }
                return null;
            }
        }

        /* renamed from: EXa$b$b reason: collision with other inner class name */
        /* compiled from: FileTreeWalk.kt */
        private final class C0143b extends c {
            private boolean b;
            final /* synthetic */ b c;

            public C0143b(b bVar, File file) {
                C7471uYa.b(file, "rootFile");
                this.c = bVar;
                super(file);
                if (TVa.a) {
                    boolean isFile = file.isFile();
                    if (TVa.a && !isFile) {
                        throw new AssertionError("rootFile must be verified to be file beforehand.");
                    }
                }
            }

            public File b() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return a();
            }
        }

        /* renamed from: EXa$b$c */
        /* compiled from: FileTreeWalk.kt */
        private final class c extends a {
            private boolean b;
            private File[] c;
            private int d;
            final /* synthetic */ b e;

            public c(b bVar, File file) {
                C7471uYa.b(file, "rootDir");
                this.e = bVar;
                super(file);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
                if (r0.length == 0) goto L_0x0090;
             */
            public File b() {
                if (!this.b) {
                    _Xa c2 = EXa.this.c;
                    if (c2 != null && !((Boolean) c2.invoke(a())).booleanValue()) {
                        return null;
                    }
                    this.b = true;
                    return a();
                }
                File[] fileArr = this.c;
                if (fileArr != null) {
                    int i = this.d;
                    if (fileArr == null) {
                        C7471uYa.a();
                        throw null;
                    } else if (i >= fileArr.length) {
                        _Xa e2 = EXa.this.d;
                        if (e2 != null) {
                            RVa rVa = (RVa) e2.invoke(a());
                        }
                        return null;
                    }
                }
                if (this.c == null) {
                    this.c = a().listFiles();
                    if (this.c == null) {
                        C6308dYa d2 = EXa.this.e;
                        if (d2 != null) {
                            File a = a();
                            C7815zXa zxa = new C7815zXa(a(), null, "Cannot list files in a directory", 2, null);
                            RVa rVa2 = (RVa) d2.invoke(a, zxa);
                        }
                    }
                    File[] fileArr2 = this.c;
                    if (fileArr2 != null) {
                        if (fileArr2 == null) {
                            C7471uYa.a();
                            throw null;
                        }
                    }
                    _Xa e3 = EXa.this.d;
                    if (e3 != null) {
                        RVa rVa3 = (RVa) e3.invoke(a());
                    }
                    return null;
                }
                File[] fileArr3 = this.c;
                if (fileArr3 != null) {
                    int i2 = this.d;
                    this.d = i2 + 1;
                    return fileArr3[i2];
                }
                C7471uYa.a();
                throw null;
            }
        }

        public b() {
            if (EXa.this.a.isDirectory()) {
                this.c.push(a(EXa.this.a));
            } else if (EXa.this.a.isFile()) {
                this.c.push(new C0143b(this, EXa.this.a));
            } else {
                b();
            }
        }

        private final File f() {
            File b;
            while (true) {
                c cVar = (c) this.c.peek();
                if (cVar == null) {
                    return null;
                }
                b = cVar.b();
                if (b == null) {
                    this.c.pop();
                } else if (C7471uYa.a((Object) b, (Object) cVar.a()) || !b.isDirectory() || this.c.size() >= EXa.this.f) {
                    return b;
                } else {
                    this.c.push(a(b));
                }
            }
            return b;
        }

        /* access modifiers changed from: protected */
        public void a() {
            File f = f();
            if (f != null) {
                b(f);
            } else {
                b();
            }
        }

        private final a a(File file) {
            int i = FXa.a[EXa.this.b.ordinal()];
            if (i == 1) {
                return new c(this, file);
            }
            if (i == 2) {
                return new a(this, file);
            }
            throw new FVa();
        }
    }

    /* renamed from: EXa$c */
    /* compiled from: FileTreeWalk.kt */
    private static abstract class c {
        private final File a;

        public c(File file) {
            C7471uYa.b(file, "root");
            this.a = file;
        }

        public final File a() {
            return this.a;
        }

        public abstract File b();
    }

    private EXa(File file, GXa gXa, _Xa<? super File, Boolean> _xa, _Xa<? super File, RVa> _xa2, C6308dYa<? super File, ? super IOException, RVa> dya, int i) {
        this.a = file;
        this.b = gXa;
        this.c = _xa;
        this.d = _xa2;
        this.e = dya;
        this.f = i;
    }

    public Iterator<File> iterator() {
        return new b();
    }

    /* synthetic */ EXa(File file, GXa gXa, _Xa _xa, _Xa _xa2, C6308dYa dya, int i, int i2, C7264rYa rya) {
        if ((i2 & 2) != 0) {
            gXa = GXa.TOP_DOWN;
        }
        this(file, gXa, _xa, _xa2, dya, (i2 & 32) != 0 ? BaseClientBuilder.API_PRIORITY_OTHER : i);
    }

    public EXa(File file, GXa gXa) {
        C7471uYa.b(file, "start");
        C7471uYa.b(gXa, "direction");
        this(file, gXa, null, null, null, 0, 32, null);
    }
}
