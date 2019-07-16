package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.Module.SetupContext;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.util.HashSet;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001b\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "Lcom/fasterxml/jackson/databind/module/SimpleModule;", "reflectionCacheSize", "", "(I)V", "impliedClasses", "Ljava/util/HashSet;", "Ljava/lang/Class;", "getImpliedClasses", "()Ljava/util/HashSet;", "getReflectionCacheSize", "()I", "requireJsonCreatorAnnotation", "", "getRequireJsonCreatorAnnotation", "()Z", "setupModule", "", "context", "Lcom/fasterxml/jackson/databind/Module$SetupContext;", "Companion", "jackson-module-kotlin"}, mv = {1, 1, 9})
/* compiled from: KotlinModule.kt */
public final class KotlinModule extends SimpleModule {
    public static final Companion Companion = new Companion(null);
    private final HashSet<Class<?>> impliedClasses;
    private final int reflectionCacheSize;

    @EVa(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Companion;", "", "()V", "serialVersionUID", "", "jackson-module-kotlin"}, mv = {1, 1, 9})
    /* compiled from: KotlinModule.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7264rYa rya) {
            this();
        }
    }

    public KotlinModule(int i) {
        super(PackageVersion.VERSION);
        this.reflectionCacheSize = i;
        this.impliedClasses = new HashSet<>(SWa.c(HVa.class, MVa.class));
    }

    public final HashSet<Class<?>> getImpliedClasses() {
        return this.impliedClasses;
    }

    public void setupModule(SetupContext setupContext) {
        C7471uYa.b(setupContext, "context");
        super.setupModule(setupContext);
        ReflectionCache reflectionCache = new ReflectionCache(this.reflectionCacheSize);
        setupContext.addValueInstantiators(new KotlinInstantiators(reflectionCache));
        KotlinModule$setupModule$1 kotlinModule$setupModule$1 = new KotlinModule$setupModule$1(this, setupContext);
        setupContext.insertAnnotationIntrospector(new KotlinAnnotationIntrospector(setupContext));
        setupContext.appendAnnotationIntrospector(new KotlinNamesAnnotationIntrospector(this, reflectionCache));
        kotlinModule$setupModule$1.invoke(C6785kZa.class, ClosedRangeMixin.class);
        kotlinModule$setupModule$1.invoke(C6377eZa.class, ClosedRangeMixin.class);
        kotlinModule$setupModule$1.invoke(C6989nZa.class, ClosedRangeMixin.class);
        kotlinModule$setupModule$1.invoke(C6581hZa.class, ClosedRangeMixin.class);
    }

    public /* synthetic */ KotlinModule(int i, int i2, C7264rYa rya) {
        if ((i2 & 1) != 0) {
            i = 512;
        }
        this(i);
    }
}
