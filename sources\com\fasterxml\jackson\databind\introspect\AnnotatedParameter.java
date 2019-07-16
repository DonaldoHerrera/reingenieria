package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

public final class AnnotatedParameter extends AnnotatedMember {
    protected final int _index;
    protected final AnnotatedWithParams _owner;
    protected final JavaType _type;

    public AnnotatedParameter(AnnotatedWithParams annotatedWithParams, JavaType javaType, TypeResolutionContext typeResolutionContext, AnnotationMap annotationMap, int i) {
        super(typeResolutionContext, annotationMap);
        this._owner = annotatedWithParams;
        this._type = javaType;
        this._index = i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, AnnotatedParameter.class)) {
            return false;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) obj;
        if (!annotatedParameter._owner.equals(this._owner) || annotatedParameter._index != this._index) {
            z = false;
        }
        return z;
    }

    public AnnotatedElement getAnnotated() {
        return null;
    }

    public Class<?> getDeclaringClass() {
        return this._owner.getDeclaringClass();
    }

    public int getIndex() {
        return this._index;
    }

    public Member getMember() {
        return this._owner.getMember();
    }

    public String getName() {
        return "";
    }

    public AnnotatedWithParams getOwner() {
        return this._owner;
    }

    public Class<?> getRawType() {
        return this._type.getRawClass();
    }

    public JavaType getType() {
        return this._type;
    }

    public Object getValue(Object obj) throws UnsupportedOperationException {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot call getValue() on constructor parameter of ");
        sb.append(getDeclaringClass().getName());
        throw new UnsupportedOperationException(sb.toString());
    }

    public int hashCode() {
        return this._owner.hashCode() + this._index;
    }

    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot call setValue() on constructor parameter of ");
        sb.append(getDeclaringClass().getName());
        throw new UnsupportedOperationException(sb.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[parameter #");
        sb.append(getIndex());
        sb.append(", annotations: ");
        sb.append(this._annotations);
        sb.append("]");
        return sb.toString();
    }

    public AnnotatedParameter withAnnotations(AnnotationMap annotationMap) {
        if (annotationMap == this._annotations) {
            return this;
        }
        return this._owner.replaceParameterAnnotations(this._index, annotationMap);
    }
}
