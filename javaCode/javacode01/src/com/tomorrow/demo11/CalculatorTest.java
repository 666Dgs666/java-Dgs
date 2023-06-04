package com.tomorrow.demo11;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;
    @Before//初始化资源节省代码,不要在每个小测试的方法中都创建对象
    public void setUp() {
        this.calculator = new Calculator();
    }
    @After//最后一步执行,清理资源
    public void tearDown() {
        this.calculator = null;
    }
    @Test
    void testAdd() {
        Assert.assertEquals(100, this.calculator.add(100));
        Assert.assertEquals(150, this.calculator.add(50));
        Assert.assertEquals(130, this.calculator.add(-20));
    }
    @Test
    void testSub() {
        Assert.assertEquals(-100, this.calculator.sub(100));
        Assert.assertEquals(-150, this.calculator.sub(50));
        Assert.assertEquals(-130, this.calculator.sub(-20));
    }
}
