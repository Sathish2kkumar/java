package com.example.testimplementation;

import calculator.calculates;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TestimplementationApplicationTests {
    @Mock
	public static charger charge;
    @InjectMocks
	private static mobile mob;
	@Test
	void checkingaddition() {
		assertEquals(5, calculates.add(2,3));
		int a=4;
		int b=10;
		assertFalse(a+b==15);
	}
	@Test
	@Disabled
	void checkingcharginr(){
		charger mockCharger = mock(charger.class);
		when(mockCharger.charging()).thenReturn(true);
		boolean result=mob.charging();
		assertTrue(result);
		verify(charge).charging();
	}
	@Test
	void findingmaximumnumber(){
		int twodata[] = {5,8,9,10};
		int data = problems.maximumnumbers(twodata);
		assertEquals(10,data);
	}

}
