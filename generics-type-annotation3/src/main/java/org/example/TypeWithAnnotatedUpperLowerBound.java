package org.example;

import org.checkerframework.checker.nullness.qual.Nullable;

public interface TypeWithAnnotatedUpperLowerBound<@Nullable T extends @Nullable Object> {}
