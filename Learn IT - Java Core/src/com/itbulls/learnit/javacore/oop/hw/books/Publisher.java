package com.itbulls.learnit.javacore.oop.hw.books;

import java.util.Objects;

public class Publisher {
		private int id;
		private String publisherName;
		
		public Publisher() {
			
		}
		
		public Publisher(int id, String publisherName) {
			
			// Call to the constructor of the superclass (Object)
			super();
			
			this.id = id;
			this.publisherName = publisherName;
		}
		
		
		@Override
		public int hashCode() {
	        // Generate a hash code based on the object's fields using Objects.hash
			return Objects.hash(id, publisherName);
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			
			Publisher other = (Publisher) obj;
	        // Compare individual fields for equality using Objects.equals
			return id == other.id && Objects.equals(publisherName, other.publisherName);
		}
		
		@Override
		public String toString() {
			return "Publisher [id = " + id + ", publisherName = " + publisherName + "]";
		}
		
		
}
