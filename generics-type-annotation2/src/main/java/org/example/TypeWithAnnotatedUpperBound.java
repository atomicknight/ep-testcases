package org.example;

import org.checkerframework.checker.nullness.qual.Nullable;

public interface TypeWithAnnotatedUpperBound<T extends @Nullable Object> {}
