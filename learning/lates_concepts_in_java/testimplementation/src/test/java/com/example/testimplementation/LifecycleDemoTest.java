package com.example.testimplementation;

import org.junit.jupiter.api.*;


    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    public class LifecycleDemoTest {

        @BeforeAll
        void setupAll() {
            System.out.println("👉 @BeforeAll - Runs once before all tests (e.g., connect to DB)");
        }

        @BeforeEach
        void setup() {
            System.out.println("🔹 @BeforeEach - Runs before each test (e.g., initialize data)");
        }

        @Test
        void testOne() {
            System.out.println("✅ Test 1 - Executing first test case");
            Assertions.assertTrue(5 > 2);
        }

        @Test
        void testTwo() {
            System.out.println("✅ Test 2 - Executing second test case");
            Assertions.assertEquals("Sith", "Sith");
        }

        @AfterEach
        void tearDown() {
            System.out.println("🔸 @AfterEach - Runs after each test (e.g., clear data)");
        }

        @AfterAll
        void tearDownAll() {
            System.out.println("🧹 @AfterAll - Runs once after all tests (e.g., close DB connection)");
        }
    }

