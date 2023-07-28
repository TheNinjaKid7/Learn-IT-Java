package com.itbulls.learnit.javacore.oop.hw.books;

import java.util.Objects;

public class Author {
		private int id;
		private String firstName;
		private String lastName;
		
		// Constructor of the superclass (Author)
		public Author() {
		}
		
		public Author(int id, String firstName, String lastName) {
			
			// Call to the constructor of the superclass (Author)
			super();

			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		@Override
		public int hashCode() {
	        // Generate a hash code based on the object's fields using Objects.hash
			return Objects.hash(firstName, id, lastName);
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null) 
				return false;
			if (getClass() != obj.getClass())
				return false;
			
			Author other = (Author) obj;
	        // Compare individual fields for equality using Objects.equals
			return Objects.equals(firstName, other.firstName) && id == other.id &&
					Objects.equals(lastName, other.lastName);
		}
		
		@Override
		public String toString() {
			return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
					+ "]";
		}		
		
}
