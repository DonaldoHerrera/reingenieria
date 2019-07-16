package defpackage;

/* renamed from: TH reason: default package and case insensitive filesystem */
/* compiled from: AppendOnlyLinkedArrayList */
class C2295TH<T> {
    private final int a;
    private final Object[] b;
    private Object[] c = this.b;
    private int d;

    /* renamed from: TH$a */
    /* compiled from: AppendOnlyLinkedArrayList */
    public interface a<T> extends C7256rQa<T> {
        boolean test(T t);
    }

    C2295TH(int i) {
        this.a = i;
        this.b = new Object[(i + 1)];
    }

    /* access modifiers changed from: 0000 */
    public void a(T t) {
        int i = this.a;
        int i2 = this.d;
        if (i2 == i) {
            Object[] objArr = new Object[(i + 1)];
            this.c[i] = objArr;
            this.c = objArr;
            i2 = 0;
        }
        this.c[i2] = t;
        this.d = i2 + 1;
    }

    /* access modifiers changed from: 0000 */
    public void a(a<? super T> aVar) {
        int i = this.a;
        for (Object[] objArr = this.b; objArr != null; objArr = objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null || aVar.test(objArr2)) {
                    break;
                }
            }
        }
    }
}
