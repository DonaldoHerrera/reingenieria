package defpackage;

import defpackage.Tg;
import java.util.Map;

/* renamed from: Tg reason: default package */
/* compiled from: AnswersEvent */
public abstract class Tg<T extends Tg> {
    final Ug a = new Ug(20, 100, C5328TMa.g());
    final Sg b = new Sg(this.a);

    /* access modifiers changed from: 0000 */
    public Map<String, Object> a() {
        return this.b.b;
    }

    public T a(String str, String str2) {
        this.b.a(str, str2);
        return this;
    }

    public T a(String str, Number number) {
        this.b.a(str, number);
        return this;
    }
}
