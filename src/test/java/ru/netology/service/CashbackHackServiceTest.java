package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainWhenAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainWhenAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainWhenAmountMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1150);
        int expected = 850;
        Assert.assertEquals(actual, expected);
    }
}
