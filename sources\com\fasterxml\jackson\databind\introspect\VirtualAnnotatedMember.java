package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

public class VirtualAnnotatedMember extends AnnotatedMember implements Serializable {
    protected final Class<?> _declaringClass;
    protected final String _name;
    protected final JavaType _type;

    public VirtualAnnotatedMember(TypeResolutionContext typeResolutionContext, Class<?> cls, String str, JavaType javaType) {
        super(typeResolutionContext, null);
        this._declaringClass = cls;
        this._type = javaType;
        this._name = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, VirtualAnnotatedMember.class)) {
            return false;
        }
        VirtualAnnotatedMember virtualAnnotatedMember = (VirtualAnnotatedMember) obj;
        if (virtualAnnotatedMember._declaringClass != this._declaringClass || !virtualAnnotatedMember._name.equals(this._name)) {
            z = false;
        }
        return z;
    }

    public Field getAnnotated() {
        return null;
    }

    public Class<?> getDeclaringClass() {
        return this._declaringClass;
    }

    public Member getMember() {
        return null;
    }

    public String getName() {
        return this._name;
    }

    public Class<?> getRawType() {
        return this._type.getRawClass();
    }

    public JavaType getType() {
        return this._type;
    }

    public Object getValue(Object obj) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot get virtual property '");
        sb.append(this._name);
        sb.append("'");
        throw new IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot set virtual property '");
        sb.append(this._name);
        sb.append("'");
        throw new IllegalArgumentException(sb.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[virtual ");
        sb.append(getFullName());
        sb.append("]");
        return sb.toString();
    }

    public Annotated withAnnotations(AnnotationMap annotationMap) {
        return this;
    }
}
