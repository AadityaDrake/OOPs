package oop.mylibrary;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({MyLibraryTest.class,
				ItemTest.class,
				FriendTest.class,
				LoanTest.class,
				LibraryInOutTest.class})

public class AllTest {

}