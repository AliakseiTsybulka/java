package com.class25;


		public final class FinalKeyword {
			/*Final keyword can be used in 3 places/ways
			 * 1.final variables - we CANNOT change their value --> CONSTANT
			 * 2. final methods - we CANNOT OVERRIDE final methods --> PREVENT OVERRIDING
			 * 3. final classes  -we CANNOT create a child of a Final class--> PREVENT INHERITANCE
			 */
			public static final String name="SYNTAX";
			
			public static void main(String[] args) {

				final String str="Hello";
				//str="John";
				//name="School";
			
			}

			public final void hello() {
				System.out.println("Hello from Parent class");
			}
		}
		//class ChildOfFinal extends FinalKeyword{
//			CANNOT OVERRIDE FINAL METHOD
//			public void hello() {
//				System.out.println("Hello from Parent class");
//			}
		//}
	

