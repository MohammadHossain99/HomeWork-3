package homework3; //Nested Class

public class OuterClass {
	   static class NestedClass {
	      public void message() {
	         System.out.println("This is my nested class");
	      }
	   }

	   public static void main(String args[]) {
	      OuterClass.NestedClass nested = new OuterClass.NestedClass();
	      nested.message();
	   }
	}