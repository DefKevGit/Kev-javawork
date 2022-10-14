package mockPackage;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MockExample {

	public static void main(String[] args) {

		// List lst=new ArrayList()
		List myList = mock(List.class);// we assume myList Exists and is instantiated
		when(myList.size()).thenReturn(1);

		assertEquals(1, myList.size());// then it is good working properly
		// assertEquals(1,myList.size());
		System.out.println(myList.size());
		System.out.println(myList);
		System.out.println(myList);
		// --------------
		List myList1 = mock(List.class);
		when(myList1.get(0)).thenReturn("Upasana");
		assertEquals("Upasana", myList1.get(0));
		System.out.println(myList1.get(0));
		// ----------------
		List myList2 = mock(List.class);
		when(myList2.size()).thenReturn(1).thenReturn(2).thenReturn(3);
		assertEquals(1, myList2.size());
		assertEquals(2, myList2.size());
		assertEquals(3, myList2.size());

		System.out.println(myList2.size());
		System.out.println(myList2);
		// --------------

	}

}
