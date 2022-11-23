package org.jboss.el;

import jakarta.el.ELContext;

public abstract class TypeResolver {
	public abstract Object convertToType(ELContext context, Object in, Class type);
}
