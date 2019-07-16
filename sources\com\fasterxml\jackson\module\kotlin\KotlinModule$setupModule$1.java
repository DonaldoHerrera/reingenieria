package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.Module.SetupContext;

@EVa(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"addMixIn", "", "clazz", "Ljava/lang/Class;", "mixin", "invoke"}, mv = {1, 1, 9})
/* compiled from: KotlinModule.kt */
final class KotlinModule$setupModule$1 extends C7540vYa implements C6308dYa<Class<?>, Class<?>, RVa> {
    final /* synthetic */ SetupContext $context;
    final /* synthetic */ KotlinModule this$0;

    KotlinModule$setupModule$1(KotlinModule kotlinModule, SetupContext setupContext) {
        this.this$0 = kotlinModule;
        this.$context = setupContext;
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Class) obj, (Class) obj2);
        return RVa.a;
    }

    public final void invoke(Class<?> cls, Class<?> cls2) {
        C7471uYa.b(cls, "clazz");
        C7471uYa.b(cls2, "mixin");
        this.this$0.getImpliedClasses().add(cls);
        this.$context.setMixInAnnotations(cls, cls2);
    }
}
