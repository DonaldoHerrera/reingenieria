package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Array;

public final class ArrayType extends TypeBase {
    protected final JavaType _componentType;
    protected final Object _emptyArray;

    protected ArrayType(JavaType javaType, TypeBindings typeBindings, Object obj, Object obj2, Object obj3, boolean z) {
        super(obj.getClass(), typeBindings, null, null, javaType.hashCode(), obj2, obj3, z);
        this._componentType = javaType;
        this._emptyArray = obj;
    }

    public static ArrayType construct(JavaType javaType, TypeBindings typeBindings) {
        return construct(javaType, typeBindings, null, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != ArrayType.class) {
            return false;
        }
        return this._componentType.equals(((ArrayType) obj)._componentType);
    }

    public JavaType getContentType() {
        return this._componentType;
    }

    public StringBuilder getGenericSignature(StringBuilder sb) {
        sb.append('[');
        return this._componentType.getGenericSignature(sb);
    }

    public boolean hasGenericTypes() {
        return this._componentType.hasGenericTypes();
    }

    public boolean hasHandlers() {
        return super.hasHandlers() || this._componentType.hasHandlers();
    }

    public boolean isAbstract() {
        return false;
    }

    public boolean isArrayType() {
        return true;
    }

    public boolean isConcrete() {
        return true;
    }

    public boolean isContainerType() {
        return true;
    }

    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[array type, component type: ");
        sb.append(this._componentType);
        sb.append("]");
        return sb.toString();
    }

    public JavaType withContentType(JavaType javaType) {
        JavaType javaType2 = javaType;
        ArrayType arrayType = new ArrayType(javaType2, this._bindings, Array.newInstance(javaType.getRawClass(), 0), this._valueHandler, this._typeHandler, this._asStatic);
        return arrayType;
    }

    public static ArrayType construct(JavaType javaType, TypeBindings typeBindings, Object obj, Object obj2) {
        ArrayType arrayType = new ArrayType(javaType, typeBindings, Array.newInstance(javaType.getRawClass(), 0), obj, obj2, false);
        return arrayType;
    }

    public ArrayType withContentTypeHandler(Object obj) {
        if (obj == this._componentType.getTypeHandler()) {
            return this;
        }
        ArrayType arrayType = new ArrayType(this._componentType.withTypeHandler(obj), this._bindings, this._emptyArray, this._valueHandler, this._typeHandler, this._asStatic);
        return arrayType;
    }

    public ArrayType withContentValueHandler(Object obj) {
        if (obj == this._componentType.getValueHandler()) {
            return this;
        }
        ArrayType arrayType = new ArrayType(this._componentType.withValueHandler(obj), this._bindings, this._emptyArray, this._valueHandler, this._typeHandler, this._asStatic);
        return arrayType;
    }

    public ArrayType withStaticTyping() {
        if (this._asStatic) {
            return this;
        }
        ArrayType arrayType = new ArrayType(this._componentType.withStaticTyping(), this._bindings, this._emptyArray, this._valueHandler, this._typeHandler, true);
        return arrayType;
    }

    public ArrayType withTypeHandler(Object obj) {
        if (obj == this._typeHandler) {
            return this;
        }
        ArrayType arrayType = new ArrayType(this._componentType, this._bindings, this._emptyArray, this._valueHandler, obj, this._asStatic);
        return arrayType;
    }

    public ArrayType withValueHandler(Object obj) {
        if (obj == this._valueHandler) {
            return this;
        }
        ArrayType arrayType = new ArrayType(this._componentType, this._bindings, this._emptyArray, obj, this._typeHandler, this._asStatic);
        return arrayType;
    }
}
