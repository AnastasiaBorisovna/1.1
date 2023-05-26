package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

    public class CashbackHackServiceTest {

        @org.testng.annotations.Test
        public void testRemain() {
            CashbackHackService service = new CashbackHackService();
            int amount = 500;
            int actual = service.remain(amount);
            int expected = 500;
            org.testng.Assert.assertEquals(actual, expected);
        }
        @org.testng.annotations.Test
        public void testAmountEqual() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;
            int actual = service.remain(amount);
            int expected = 0;
            org.testng.Assert.assertEquals(actual, expected);
        }
        @org.testng.annotations.Test
        public void testAmountLess() {
            CashbackHackService service = new CashbackHackService();
            int amount = 999;
            int actual = service.remain(amount);
            int expected = 1;
            org.testng.Assert.assertEquals(actual, expected);
        }
        @org.testng.annotations.Test
        public void testAmountMore() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1001;
            int actual = service.remain(amount);
            int expected = 0;
            org.testng.Assert.assertEquals(actual, expected);
        }
    }