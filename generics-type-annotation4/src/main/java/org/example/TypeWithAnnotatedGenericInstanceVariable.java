package org.example;

import org.checkerframework.checker.nullness.qual.Nullable;

public class TypeWithAnnotatedGenericInstanceVariable {
	ThreadLocal<@Nullable String> tl = new ThreadLocal<>();
}
