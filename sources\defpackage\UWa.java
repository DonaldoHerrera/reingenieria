package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C7056oXa(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {33, 39, 46, 52, 55}, m = "invokeSuspend")
/* renamed from: UWa reason: default package */
/* compiled from: SlidingWindow.kt */
final class UWa extends C7401tXa implements C6308dYa<Kwb<? super List<? extends T>>, C5575aXa<? super RVa>, Object> {
    private Kwb c;
    Object d;
    Object e;
    Object f;
    Object g;
    int h;
    int i;
    int j;
    final /* synthetic */ int k;
    final /* synthetic */ int l;
    final /* synthetic */ Iterator m;
    final /* synthetic */ boolean n;
    final /* synthetic */ boolean o;

    UWa(int i2, int i3, Iterator it, boolean z, boolean z2, C5575aXa axa) {
        this.k = i2;
        this.l = i3;
        this.m = it;
        this.n = z;
        this.o = z2;
        super(2, axa);
    }

    public final C5575aXa<RVa> a(Object obj, C5575aXa<?> axa) {
        C7471uYa.b(axa, "completion");
        UWa uWa = new UWa(this.k, this.l, this.m, this.n, this.o, axa);
        uWa.c = (Kwb) obj;
        return uWa;
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:568)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:474)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:239)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:213)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:193)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:138)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:210)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:203)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:316)
        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:262)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:76)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:32)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:20)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a3, code lost:
        r13.d = r4;
        r13.h = r0;
        r13.e = r2;
        r13.i = r3;
        r13.f = r8;
        r13.g = r1;
        r13.j = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b5, code lost:
        if (r4.a(r2, r13) != r7) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b7, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010c, code lost:
        if (r13.n == false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0110, code lost:
        r10 = new java.util.ArrayList(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0115, code lost:
        r13.d = r8;
        r13.h = r7;
        r13.e = r5;
        r13.f = r9;
        r13.g = r1;
        r13.j = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0125, code lost:
        if (r8.a(r10, r13) != r0) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0127, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ea A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013d  */
    public final java.lang.Object a(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = defpackage.C6715jXa.a()
            int r1 = r12.j
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0070
            if (r1 == r6) goto L_0x0057
            if (r1 == r5) goto L_0x004a
            if (r1 == r4) goto L_0x0034
            if (r1 == r3) goto L_0x0024
            if (r1 != r2) goto L_0x001c
            java.lang.Object r0 = r12.d
            PWa r0 = (defpackage.PWa) r0
            goto L_0x0050
        L_0x001c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0024:
            java.lang.Object r1 = r12.e
            PWa r1 = (defpackage.PWa) r1
            int r4 = r12.h
            java.lang.Object r5 = r12.d
            Kwb r5 = (defpackage.Kwb) r5
            defpackage.JVa.a(r13)
            r13 = r12
            goto L_0x0157
        L_0x0034:
            java.lang.Object r1 = r12.g
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r5 = r12.f
            java.lang.Object r5 = r12.e
            PWa r5 = (defpackage.PWa) r5
            int r7 = r12.h
            java.lang.Object r8 = r12.d
            Kwb r8 = (defpackage.Kwb) r8
            defpackage.JVa.a(r13)
            r13 = r12
            goto L_0x0128
        L_0x004a:
            int r0 = r12.i
            java.lang.Object r0 = r12.d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
        L_0x0050:
            int r0 = r12.h
            defpackage.JVa.a(r13)
            goto L_0x0171
        L_0x0057:
            java.lang.Object r1 = r12.g
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r2 = r12.f
            int r2 = r12.i
            java.lang.Object r2 = r12.e
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r12.h
            java.lang.Object r4 = r12.d
            Kwb r4 = (defpackage.Kwb) r4
            defpackage.JVa.a(r13)
            r13 = r12
            r7 = r0
            r0 = r3
            goto L_0x00b8
        L_0x0070:
            defpackage.JVa.a(r13)
            Kwb r13 = r12.c
            int r1 = r12.k
            int r7 = r12.l
            int r1 = r1 - r7
            if (r1 < 0) goto L_0x00eb
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r7)
            r3 = 0
            java.util.Iterator r4 = r12.m
            r7 = r0
            r0 = r1
            r1 = r4
            r4 = r13
            r13 = r12
        L_0x0089:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x00c9
            java.lang.Object r8 = r1.next()
            if (r3 <= 0) goto L_0x0098
            int r3 = r3 + -1
            goto L_0x0089
        L_0x0098:
            r2.add(r8)
            int r9 = r2.size()
            int r10 = r13.l
            if (r9 != r10) goto L_0x0089
            r13.d = r4
            r13.h = r0
            r13.e = r2
            r13.i = r3
            r13.f = r8
            r13.g = r1
            r13.j = r6
            java.lang.Object r3 = r4.a(r2, r13)
            if (r3 != r7) goto L_0x00b8
            return r7
        L_0x00b8:
            boolean r3 = r13.n
            if (r3 == 0) goto L_0x00c0
            r2.clear()
            goto L_0x00c7
        L_0x00c0:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r13.l
            r2.<init>(r3)
        L_0x00c7:
            r3 = r0
            goto L_0x0089
        L_0x00c9:
            boolean r1 = r2.isEmpty()
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x0171
            boolean r1 = r13.o
            if (r1 != 0) goto L_0x00dc
            int r1 = r2.size()
            int r6 = r13.l
            if (r1 != r6) goto L_0x0171
        L_0x00dc:
            r13.h = r0
            r13.d = r2
            r13.i = r3
            r13.j = r5
            java.lang.Object r13 = r4.a(r2, r13)
            if (r13 != r7) goto L_0x0171
            return r7
        L_0x00eb:
            PWa r5 = new PWa
            r5.<init>(r7)
            java.util.Iterator r7 = r12.m
            r8 = r13
            r13 = r12
            r11 = r7
            r7 = r1
            r1 = r11
        L_0x00f7:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x012e
            java.lang.Object r9 = r1.next()
            r5.add(r9)
            boolean r10 = r5.h()
            if (r10 == 0) goto L_0x00f7
            boolean r10 = r13.n
            if (r10 == 0) goto L_0x0110
            r10 = r5
            goto L_0x0115
        L_0x0110:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r5)
        L_0x0115:
            r13.d = r8
            r13.h = r7
            r13.e = r5
            r13.f = r9
            r13.g = r1
            r13.j = r4
            java.lang.Object r9 = r8.a(r10, r13)
            if (r9 != r0) goto L_0x0128
            return r0
        L_0x0128:
            int r9 = r13.k
            r5.c(r9)
            goto L_0x00f7
        L_0x012e:
            boolean r1 = r13.o
            if (r1 == 0) goto L_0x0171
            r1 = r5
            r4 = r7
            r5 = r8
        L_0x0135:
            int r7 = r1.size()
            int r8 = r13.k
            if (r7 <= r8) goto L_0x015d
            boolean r7 = r13.n
            if (r7 == 0) goto L_0x0143
            r7 = r1
            goto L_0x0148
        L_0x0143:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r1)
        L_0x0148:
            r13.d = r5
            r13.h = r4
            r13.e = r1
            r13.j = r3
            java.lang.Object r7 = r5.a(r7, r13)
            if (r7 != r0) goto L_0x0157
            return r0
        L_0x0157:
            int r7 = r13.k
            r1.c(r7)
            goto L_0x0135
        L_0x015d:
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x0171
            r13.h = r4
            r13.d = r1
            r13.j = r2
            java.lang.Object r13 = r5.a(r1, r13)
            if (r13 != r0) goto L_0x0171
            return r0
        L_0x0171:
            RVa r13 = defpackage.RVa.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.UWa.a(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((UWa) a(obj, (C5575aXa) obj2)).a(RVa.a);
    }
}
