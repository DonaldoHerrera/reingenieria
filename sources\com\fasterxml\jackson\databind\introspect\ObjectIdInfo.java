package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class ObjectIdInfo {
    private static final ObjectIdInfo EMPTY;
    protected final boolean _alwaysAsId;
    protected final Class<? extends ObjectIdGenerator<?>> _generator;
    protected final PropertyName _propertyName;
    protected final Class<? extends ObjectIdResolver> _resolver;
    protected final Class<?> _scope;

    static {
        ObjectIdInfo objectIdInfo = new ObjectIdInfo(PropertyName.NO_NAME, Object.class, null, false, null);
        EMPTY = objectIdInfo;
    }

    public ObjectIdInfo(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, Class<? extends ObjectIdResolver> cls3) {
        this(propertyName, cls, cls2, false, cls3);
    }

    public static ObjectIdInfo empty() {
        return EMPTY;
    }

    public boolean getAlwaysAsId() {
        return this._alwaysAsId;
    }

    public Class<? extends ObjectIdGenerator<?>> getGeneratorType() {
        return this._generator;
    }

    public PropertyName getPropertyName() {
        return this._propertyName;
    }

    public Class<? extends ObjectIdResolver> getResolverType() {
        return this._resolver;
    }

    public Class<?> getScope() {
        return this._scope;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObjectIdInfo: propName=");
        sb.append(this._propertyName);
        sb.append(", scope=");
        sb.append(ClassUtil.nameOf(this._scope));
        sb.append(", generatorType=");
        sb.append(ClassUtil.nameOf(this._generator));
        sb.append(", alwaysAsId=");
        sb.append(this._alwaysAsId);
        return sb.toString();
    }

    public ObjectIdInfo withAlwaysAsId(boolean z) {
        if (this._alwaysAsId == z) {
            return this;
        }
        ObjectIdInfo objectIdInfo = new ObjectIdInfo(this._propertyName, this._scope, this._generator, z, this._resolver);
        return objectIdInfo;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<? extends com.fasterxml.jackson.annotation.ObjectIdResolver>, code=java.lang.Class, for r5v0, types: [java.lang.Class<? extends com.fasterxml.jackson.annotation.ObjectIdResolver>, java.lang.Class] */
    protected ObjectIdInfo(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, boolean z, Class cls3) {
        this._propertyName = propertyName;
        this._scope = cls;
        this._generator = cls2;
        this._alwaysAsId = z;
        if (cls3 == null) {
            cls3 = SimpleObjectIdResolver.class;
        }
        this._resolver = cls3;
    }
}
