package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: xta reason: default package and case insensitive filesystem */
/* compiled from: UpdatePoliciesCommand.kt */
final class C7705xta<V> implements Callable<Pca<C3912xea>> {
    final /* synthetic */ List a;
    final /* synthetic */ C7636wta b;

    C7705xta(List list, C7636wta wta) {
        this.a = list;
        this.b = wta;
    }

    public final Pca<C3912xea> call() {
        return (Pca) this.b.c.a(this.b.b(this.a), (C4990IKa<ResourceType>) C7636wta.a);
    }
}
