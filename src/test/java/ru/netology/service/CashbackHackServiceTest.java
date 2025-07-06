package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainWhenAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainWhenAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainWhenAmountMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1150);
        int expected = 850;
        Assert.assertEquals(expected, actual);
    }
}
