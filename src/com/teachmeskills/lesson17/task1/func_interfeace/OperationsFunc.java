package com.teachmeskills.lesson17.task1.func_interfeace;

/**
 * This functional interface contain generic method "makeOperation" which
 * takes as input some entity.
 * @param <E>
 */

@FunctionalInterface
public interface OperationsFunc<E> {
    E makeOperation(E entity);
}
