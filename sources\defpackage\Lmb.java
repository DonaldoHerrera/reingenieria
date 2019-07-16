package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Lmb reason: default package */
/* compiled from: VersionRequirement.kt */
public final class Lmb {
    public static final a a = new a(null);
    private final b b;
    private final c c;
    private final C7330sVa d;
    private final Integer e;
    private final String f;

    /* renamed from: Lmb$a */
    /* compiled from: VersionRequirement.kt */
    public static final class a {
        private a() {
        }

        public final List<Lmb> a(Wnb wnb, Emb emb, Mmb mmb) {
            List<Integer> list;
            C7471uYa.b(wnb, "proto");
            C7471uYa.b(emb, "nameResolver");
            C7471uYa.b(mmb, "table");
            if (wnb instanceof C6458flb) {
                list = ((C6458flb) wnb).H();
            } else if (wnb instanceof C6730jlb) {
                list = ((C6730jlb) wnb).p();
            } else if (wnb instanceof Blb) {
                list = ((Blb) wnb).z();
            } else if (wnb instanceof Olb) {
                list = ((Olb) wnb).y();
            } else if (wnb instanceof C5727cmb) {
                list = ((C5727cmb) wnb).w();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected declaration: ");
                sb.append(wnb.getClass());
                throw new IllegalStateException(sb.toString());
            }
            C7471uYa.a((Object) list, "ids");
            ArrayList arrayList = new ArrayList();
            for (Integer num : list) {
                a aVar = Lmb.a;
                C7471uYa.a((Object) num, "id");
                Lmb a = aVar.a(num.intValue(), emb, mmb);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        public final Lmb a(int i, Emb emb, Mmb mmb) {
            C7330sVa sva;
            C7471uYa.b(emb, "nameResolver");
            C7471uYa.b(mmb, "table");
            C7210qmb a = mmb.a(i);
            String str = null;
            if (a == null) {
                return null;
            }
            b a2 = b.b.a(a.s() ? Integer.valueOf(a.m()) : null, a.t() ? Integer.valueOf(a.n()) : null);
            defpackage.C7210qmb.b k = a.k();
            if (k != null) {
                int i2 = Kmb.a[k.ordinal()];
                if (i2 == 1) {
                    sva = C7330sVa.WARNING;
                } else if (i2 == 2) {
                    sva = C7330sVa.ERROR;
                } else if (i2 == 3) {
                    sva = C7330sVa.HIDDEN;
                } else {
                    throw new FVa();
                }
                C7330sVa sva2 = sva;
                Integer valueOf = a.p() ? Integer.valueOf(a.j()) : null;
                if (a.r()) {
                    str = emb.getString(a.l());
                }
                String str2 = str;
                c o = a.o();
                C7471uYa.a((Object) o, "info.versionKind");
                Lmb lmb = new Lmb(a2, o, sva2, valueOf, str2);
                return lmb;
            }
            C7471uYa.a();
            throw null;
        }
    }

    /* renamed from: Lmb$b */
    /* compiled from: VersionRequirement.kt */
    public static final class b {
        public static final b a = new b(256, 256, 256);
        public static final a b = new a(null);
        private final int c;
        private final int d;
        private final int e;

        /* renamed from: Lmb$b$a */
        /* compiled from: VersionRequirement.kt */
        public static final class a {
            private a() {
            }

            public final b a(Integer num, Integer num2) {
                if (num2 != null) {
                    return new b(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
                }
                if (num != null) {
                    return new b(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127);
                }
                return b.a;
            }

            public /* synthetic */ a(C7264rYa rya) {
                this();
            }
        }

        public b(int i, int i2, int i3) {
            this.c = i;
            this.d = i2;
            this.e = i3;
        }

        public final String a() {
            int i;
            StringBuilder sb;
            if (this.e == 0) {
                sb = new StringBuilder();
                sb.append(this.c);
                sb.append('.');
                i = this.d;
            } else {
                sb = new StringBuilder();
                sb.append(this.c);
                sb.append('.');
                sb.append(this.d);
                sb.append('.');
                i = this.e;
            }
            sb.append(i);
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (this.c == bVar.c) {
                        if (this.d == bVar.d) {
                            if (this.e == bVar.e) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.c * 31) + this.d) * 31) + this.e;
        }

        public String toString() {
            return a();
        }

        public /* synthetic */ b(int i, int i2, int i3, int i4, C7264rYa rya) {
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            this(i, i2, i3);
        }
    }

    public Lmb(b bVar, c cVar, C7330sVa sva, Integer num, String str) {
        C7471uYa.b(bVar, "version");
        C7471uYa.b(cVar, "kind");
        C7471uYa.b(sva, "level");
        this.b = bVar;
        this.c = cVar;
        this.d = sva;
        this.e = num;
        this.f = str;
    }

    public final c a() {
        return this.c;
    }

    public final b b() {
        return this.b;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("since ");
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.d);
        String str2 = "";
        if (this.e != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" error ");
            sb2.append(this.e);
            str = sb2.toString();
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.f != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(": ");
            sb3.append(this.f);
            str2 = sb3.toString();
        }
        sb.append(str2);
        return sb.toString();
    }
}
