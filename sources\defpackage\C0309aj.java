package defpackage;

/* renamed from: aj reason: default package and case insensitive filesystem */
/* compiled from: MiddleOutFallbackStrategy */
class C0309aj implements C1695sj {
    private final int a;
    private final C1695sj[] b;
    private final C0494bj c;

    public C0309aj(int i, C1695sj... sjVarArr) {
        this.a = i;
        this.b = sjVarArr;
        this.c = new C0494bj(i);
    }

    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        C1695sj[] sjVarArr;
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C1695sj sjVar : this.b) {
            if (stackTraceElementArr2.length <= this.a) {
                break;
            }
            stackTraceElementArr2 = sjVar.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.a) {
            stackTraceElementArr2 = this.c.a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
