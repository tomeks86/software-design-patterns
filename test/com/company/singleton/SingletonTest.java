package com.company.singleton;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    public void shouldCreateOnlyOneInstanceOfSingleton() {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Assert.assertSame(instance, instance2);
    }
}